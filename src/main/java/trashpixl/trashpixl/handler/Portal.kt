package trashpixl.trashpixl.handler // the package for this project

import SendPlayerBetweenServer
import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.Action
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.plugin.java.JavaPlugin
import trashpixl.trashpixl.Trashpixl
import trashpixl.trashpixl.runnable.Variable

class Portal(plugin: Trashpixl?, main: JavaPlugin) : Listener { // the implements for the listener
    private val mainPlugin = main // the main plugin

    init { // the constructor of this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!) // register the event
    }

    @EventHandler
    fun pressurePlateHandler(ev: PlayerInteractEvent) { // describes what the event is
        if (ev.action == Action.PHYSICAL) { // check if the action is physical
            if (ev.clickedBlock!!.type == Material.STONE_PRESSURE_PLATE
            ) { // compare what the player sept on to a stone pressure plate and is required a
                // non-nullable
                val p = ev.player // create the local player id

                if (Variable.serverType == 0) { // check if we are in server 0

                    SendPlayerBetweenServer(
                            "lobby",
                            p,
                            mainPlugin
                    ) // send the player to the location
                }
                if (Variable.serverType == 2) { // check if we are in server 2

                    SendPlayerBetweenServer(
                            "main",
                            p,
                            mainPlugin
                    ) // send the player to the location
                }
            }
        }
    }
}
