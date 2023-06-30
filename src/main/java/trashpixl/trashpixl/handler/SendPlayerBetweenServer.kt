package trashpixl.trashpixl.handler // the package for this project

import com.google.common.io.ByteStreams//import the byte stream
import org.bukkit.Bukkit//import the bukkit
import org.bukkit.Material//import the material
import org.bukkit.event.EventHandler//import the event handler
import org.bukkit.event.Listener//import the listener
import org.bukkit.event.block.Action//import the action
import org.bukkit.event.player.PlayerInteractEvent//import the player interact event
import org.bukkit.plugin.java.JavaPlugin//import the java plugin
import trashpixl.trashpixl.Trashpixl//import the main class
import trashpixl.trashpixl.runnable.environment//import the environment

class SendPlayerBetweenServer(plugin: Trashpixl?, main: JavaPlugin) : Listener {//the implements for the listener
    private val mainPlugin = main//the main plugin

    init { // the constructor of this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!)//register the event
    }

    @EventHandler
    fun pressurePlateHandler(ev: PlayerInteractEvent) {//describes what the event is
        if (ev.action == Action.PHYSICAL) {//check if the action is physical
            if (ev.clickedBlock!!.type == Material.STONE_PRESSURE_PLATE) {//compare what the player sept on to a stone pressure plate and is required a
                // non-nullable
                val p = ev.player//create the local player id

                if (environment() == 0) {//check if we are in server 0

                    val connect = ByteStreams.newDataOutput()//create the byte stream
                    connect.writeUTF("Connect")//action connect
                    connect.writeUTF("lobby")//to the lobby
                    p.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())//send the player to the location
                }
                if (environment() == 2) {//check if we are in server 2

                    val connect = ByteStreams.newDataOutput()//create the byte stream
                    connect.writeUTF("Connect")//action connect
                    connect.writeUTF("main")//to the main
                    p.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())//send the player to the location
                }
            }
        }
    }
}
