package trashpixl.trashpixl.handler // the package for this project

import com.google.common.io.ByteStreams
import org.bukkit.Bukkit
import org.bukkit.Bukkit.getServer
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerRespawnEvent
import org.bukkit.plugin.java.JavaPlugin
import trashpixl.trashpixl.Trashpixl
import trashpixl.trashpixl.runnable.*
import java.time.LocalTime

class Death(plugin: Trashpixl?, main: JavaPlugin) : Listener { // creating the class death and implementing the listener
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
        var playerCount: Int
        if (minigame() in 1..7 || minigame()  in 9..12) { // check if the data that we found correspond to the one require to start the handler
            val name: String = e.player.name // name variable to store the player name
            if (environment() == 1) {
                e.player.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                playerCount = 0
                for (p in getServer().onlinePlayers) { // getting all the player in the server
                    playerCount++
                    p.sendMessage("$name  died an is now out of the game") // send the message of who won the match
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
        if(minigame() == 11){
            if (environment() == 1) {
                e.player.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                Variable.playerArray = mutableListOf()

                for (player in getServer().onlinePlayers) {
                    Variable.playerArray!!.add(player.name)
                }

                Variable.playerArray!!.sort()
                Variable.time = LocalTime.now()
                Variable.playerArrayNumber = 0

            }
        }
    }
}
