package trashpixl.trashpixl.handler//define the package

import com.google.common.io.ByteStreams
import org.bukkit.Bukkit
import org.bukkit.Bukkit.getServer
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerRespawnEvent
import org.bukkit.plugin.java.JavaPlugin
import trashpixl.trashpixl.Trashpixl
import trashpixl.trashpixl.runnable.Variable
import trashpixl.trashpixl.runnable.environment
import trashpixl.trashpixl.runnable.minigame
import java.time.LocalTime

class Death(plugin: Trashpixl?, main: JavaPlugin) : Listener {//creating the class death and implementing the listener
    private val mainPlugin = main


    init {//the constructor of this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!)//register the event
    }

    @EventHandler // says that this is an event handler
    fun onPlayerDead(ev: PlayerRespawnEvent) {
        val connect = ByteStreams.newDataOutput()//create the byte stream
        connect.writeUTF("Connect")//action connect
        connect.writeUTF("lobby")//connect to the lobby
        var playerCount: Int//create the player count var
        if (minigame() in 1..7 || minigame() in 9..12 || minigame() == 14) {//check if the data that we found correspond to the one require to start the handler
            val name: String = ev.player.name//name variable to store the player name
            if (environment() == 1) {//check if we are in the server 1
                ev.player.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())//connect the player
                playerCount = 0//reset the player count
                for (p in getServer().onlinePlayers) { // getting all the player in the server
                    playerCount++//add one to the player count
                    p.chat("$name  died an is now out of the game") // send the message of who won the match
                }
                if (playerCount == 1) {//check if the player count equals zero
                    for (p in getServer().onlinePlayers) {//get all player in the server
                        if (p.name != ev.player.name) {//check if the player name equal the actual event creator name
                            p.chat("congratulation you won the match")//send the win message
                        } else {
                            p.chat("how did you kill yourself")//send the death message
                        }
                        p.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())//connect the player to the server
                    }
                }
            }
        }
        if (minigame() == 11) {//check if the minigame 11 is going
            if (environment() == 1) {//check if we are in server one
                ev.player.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())//connect the player
                Variable.playerArray = mutableListOf()

                for (player in getServer().onlinePlayers) {//get all the player in the server
                    Variable.playerArray!!.add(player.name)//add all player to the array
                }

                Variable.playerArray!!.sort()//sort the array
                Variable.time = LocalTime.now()//reset the time
                Variable.playerArrayNumber = 0//reset the array cursor

            }
        }
    }
}
