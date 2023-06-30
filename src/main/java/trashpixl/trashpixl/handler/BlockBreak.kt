package trashpixl.trashpixl.handler

import com.google.common.io.ByteStreams
import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockBreakEvent
import org.bukkit.plugin.java.JavaPlugin
import trashpixl.trashpixl.Trashpixl
import trashpixl.trashpixl.runnable.Variable

class BlockBreak(plugin: Trashpixl?, private val mainPlugin: JavaPlugin) : Listener {
    init {//the constructor of this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!)//register the event
    }

    @EventHandler
    fun breakABlock(ev: BlockBreakEvent) {//describes what the event is
        if (Variable.preventBreakedBlock) {//check if we intend to prevent player from breaking block
            ev.isCancelled = true//cancelled the event if true
        }
        val blockLocation = ev.block.location//get the block location
        if (ev.block.type == Material.DIAMOND_BLOCK) {//check if we intend to prevent player from breaking block
            val name: String = ev.player.name//name variable to store the player name

            ev.player.chat("you won")//send a message to the player


            val connect = ByteStreams.newDataOutput()//create the byte stream
            connect.writeUTF("Connect")//action connect
            connect.writeUTF("lobby")//to the lobby
            ev.player.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())//send the player to the location
            for (p in Bukkit.getServer().onlinePlayers) {//get all player in the server
                p.chat("you lose and $name won")//send the lose message to all of them
                p.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())//connect each player

            }
            blockLocation.block.type = Material.GRASS_BLOCK//set the block to grass
            //TODO add the rest of the action
        }
    }
}