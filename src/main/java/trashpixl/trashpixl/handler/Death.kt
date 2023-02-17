package trashpixl.trashpixl.handler // the package for this project

import com.google.common.io.ByteStreams

import org.bukkit.Bukkit // importing bukkit
import org.bukkit.Bukkit.getServer // importing the get server class
import org.bukkit.event.EventHandler // importing the event handler
import org.bukkit.event.Listener // importing the listener
import org.bukkit.event.player.PlayerRespawnEvent
import org.bukkit.plugin.java.JavaPlugin
import trashpixl.trashpixl.Trashpixl // importing the whole package
import trashpixl.trashpixl.runnable.environment
import trashpixl.trashpixl.runnable.minigame

class Death(plugin: Trashpixl?, main: JavaPlugin) :
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
        var playerCount: Int

        if (minigame() == 1 || minigame() == 5 || minigame() == 3 || minigame() == 6) { // check if the data that we found correspond to the one require to start the handler
            val name: String = e.player.name // name variable to store the player name
            if (environment() == 1) {

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
