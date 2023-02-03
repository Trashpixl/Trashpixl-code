package trashpixl.trashpixl.handler // the package for this project

import com.google.common.io.ByteStreams
import java.io.File // importing the java file var
import java.io.IOException // importing the io exception
import java.util.* // importing all the java util class
import org.bukkit.Bukkit // importing bukkit
import org.bukkit.Bukkit.getServer // importing the get server class
import org.bukkit.event.EventHandler // importing the event handler
import org.bukkit.event.Listener // importing the listener
import org.bukkit.event.player.PlayerRespawnEvent
import org.bukkit.plugin.java.JavaPlugin
import trashpixl.trashpixl.Zero // importing the whole package

class Death(plugin: Zero?, main: JavaPlugin) :
        Listener { // creating the class death and implementing the listener
    private val mainPlugin = main
    // the implements for the listener
    init { // the constructor of this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!) // linking it to the main code
    }
    @EventHandler // says that this is an event handler
    fun onPlayerDead(e: PlayerRespawnEvent) { 
        // creating the on player death event function and importing the death class
        val connect = ByteStreams.newDataOutput()
        connect.writeUTF("Connect")
        connect.writeUTF("lobby")
        val fileName = "Minigame.txt" // creating the file name var
        val actualFile = File(fileName) // creating the file
        var actualdata = 0 // creating the actual data var
        var playerCount: Int
        try { // trying the code
            if (actualFile.exists() && actualFile.isFile) { // checking if actual file is a file
                try {
                    val reader = Scanner(actualFile) // creating the scanner
                    val data = reader.nextLine() // reading the first line
                    actualdata = data.toInt() // converting the data to an int
                    reader.close() // closing the reader
                } catch (e: IOException) { // catching the exception
                    throw RuntimeException(e) // trowing the exception
                }
            }
        } catch (e: IOException) { // catching the exception
            throw RuntimeException(e) // trowing it again
        }
        if (actualdata == 1 || actualdata == 5 || actualdata == 3 || actualdata == 6
        ) { // check if the data that we found correspond to the one require to start the handler
            val name: String = e.player.name // name variable to store the player name
            val fileName2 = "Server.txt" // creating the file name var
            val actualFile2 = File(fileName2) // creating the file
            var serv = 0 // creating the actual data var
            try { // trying the code
                if (actualFile2.exists() && actualFile2.isFile
                ) { // checking if actual file is a file
                    try {
                        val reader2 = Scanner(actualFile2) // creating the scanner
                        val data2 = reader2.nextLine() // reading the first line
                        serv = data2.toInt() // converting the data to an int
                        reader2.close() // closing the reader
                    } catch (e: IOException) { // catching the exception
                        throw RuntimeException(e) // trowing the exception
                    }
                }
            } catch (e: IOException) { // catching the exception
                throw RuntimeException(e) // trowing it again
            }
            if (serv == 1) {

                e.player.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                playerCount = 0
                for (p in getServer().onlinePlayers) { // getting all the player in the server
                    playerCount++
                    p.sendMessage(
                            "$name  died an is now out of the game"
                    ) // send the message of who won the match
                    // Bukkit.dispatchCommand(p, "server lobby") //if they are in the right world tp
                    // them in the lobby
                }
                if (playerCount == 1) {
                    for (p in getServer().onlinePlayers) {
                        if (p.name != e.player.name) {
                            p.sendMessage("congratulation you won the match")
                        } else {
                            p.sendMessage("how did you kill yourself")
                        }
                        p.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                    }
                }
            }
        }
    }
}
