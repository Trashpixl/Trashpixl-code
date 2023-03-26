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
            ev.player.sendMessage("you won")
            val connect = ByteStreams.newDataOutput()
            connect.writeUTF("Connect")
            connect.writeUTF("lobby")
            ev.player.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
            for (p in Bukkit.getServer().onlinePlayers) {
                p.sendMessage("you lose and $name won")
                p.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())

            }
            //TODO add the rest of the action
        }
    }
}