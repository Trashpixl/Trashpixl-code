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
import trashpixl.trashpixl.runnable.environment

class PlateHandler(plugin: Trashpixl?, main: JavaPlugin) : Listener { // the implements for the listener
    private val mainPlugin = main

    init { // the constructor of this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!) // init the plugin
    }

    @EventHandler
    fun pressurePlateHandler(ev: PlayerInteractEvent) { // describes what the event is
        if (ev.action == Action.PHYSICAL) { // check if the action is physical
            if (ev.clickedBlock!!.type == Material.STONE_PRESSURE_PLATE) { // compare what the player sept on to a stone pressure plate and is required a
                // non-nullable
                val p = ev.player // create the local player id

                if (environment() == 0) {

                    val connect = ByteStreams.newDataOutput()
                    connect.writeUTF("Connect")
                    connect.writeUTF("lobby")
                    p.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                }
                if (environment() == 2) {

                    val connect = ByteStreams.newDataOutput()
                    connect.writeUTF("Connect")
                    connect.writeUTF("main")
                    p.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                }
            }
        }
    }
}
