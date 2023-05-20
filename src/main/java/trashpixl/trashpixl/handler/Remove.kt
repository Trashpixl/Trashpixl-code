package trashpixl.trashpixl.handler//the package for this project

import com.google.common.io.ByteStreams//import the byte stream
import org.bukkit.Bukkit//import the bukkit
import org.bukkit.Material//import the material
import org.bukkit.event.EventHandler//import the event handler
import org.bukkit.event.Listener//import the listener
import org.bukkit.event.block.BlockBreakEvent//import the block break event
import org.bukkit.plugin.java.JavaPlugin//import the java plugin
import trashpixl.trashpixl.Trashpixl//import the main class

class Remove (plugin: Trashpixl?, main: JavaPlugin) : Listener { // the implements for the listener
    private val mainPlugin = main//the main plugin
    init { // the constructor of this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!) // init the plugin
    }

    @EventHandler
    fun breakABlock(ev: BlockBreakEvent) { // describes what the event is
        if(ev.block.type == Material.DIAMOND_BLOCK){//check if we intend to prevent player from breaking block
            val name: String = ev.player.name // name variable to store the player name
            ev.player.sendMessage("you won")//send the win message
            val connect = ByteStreams.newDataOutput()//create the byte stream
            connect.writeUTF("Connect")//action connect
            connect.writeUTF("lobby")//to the lobby
            ev.player.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())//send the player to the location
            for (p in Bukkit.getServer().onlinePlayers) {//get all player in the server
                p.sendMessage("you lose and $name won")//send the lose message to all of them
                p.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())//connect each player

            }
            //TODO add the rest of the action
        }
    }
}