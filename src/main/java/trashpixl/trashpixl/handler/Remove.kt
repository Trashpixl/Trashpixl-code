package trashpixl.trashpixl.handler

import com.google.common.io.ByteStreams
import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockBreakEvent
import org.bukkit.plugin.java.JavaPlugin
import trashpixl.trashpixl.Trashpixl

class Remove (plugin: Trashpixl?, main: JavaPlugin) : Listener { // the implements for the listener
    private val mainPlugin = main
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