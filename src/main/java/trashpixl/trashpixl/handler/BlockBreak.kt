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
import SendPlayerBetweenServer

class BlockBreak(plugin: Trashpixl?, mainPlugin: JavaPlugin) : Listener {
    val mainPlugin = mainPlugin//the main plugin
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


           SendPlayerBetweenServer("lobby", ev.player, mainPlugin)//send the player to the main server
            for (p in Bukkit.getServer().onlinePlayers) {//get all player in the server
                p.chat("you lose and $name won")//send the lose message to all of them
                SendPlayerBetweenServer("lobby", p, mainPlugin)//send the player to the main server

            }
            blockLocation.block.type = Material.GRASS_BLOCK//set the block to grass
        }
    }
}