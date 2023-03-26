package trashpixl.trashpixl.handler // the package for this project

import com.google.common.io.ByteStreams
import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.Action
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.plugin.java.JavaPlugin
import trashpixl.trashpixl.Trashpixl
import trashpixl.trashpixl.runnable.*

class FirstToFinish(plugin: Trashpixl?, main: JavaPlugin) : Listener { // the implements for the listener
    private var mainPlugin = main

    init { // the constructor of this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!) // getting the plugin
    }

    @EventHandler // define that the following code is an event handler
    fun pressurePlateHandler(ev: PlayerInteractEvent) { // describes what the event is
        if (ev.action == Action.PHYSICAL) { // check if the action is physical
            if (ev.clickedBlock!!.type == Material.WARPED_PRESSURE_PLATE) { // compare what the player step on to a stone pressure plate and is required a
                // non-nullable

                val p = ev.player // create the local player id
                if (minigame() == 8 || minigame() == 5 || minigame() == 6) { // checking if the number in the file correspond to the number require to start
                    // the exception

                    if (environment() == 1) {
                        p.sendMessage(p.name + " won the race") // sending the won message
                        for (p2 in Bukkit.getServer().onlinePlayers) { // getting all online player
                            // wrong type of tp
                            val connect = ByteStreams.newDataOutput()
                            connect.writeUTF("Connect")
                            connect.writeUTF("lobby")
                            p.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                        }
                        //write zero in the minigame file
                        put(os(), 0)
                    }
                }
            }
        }
    }
}
