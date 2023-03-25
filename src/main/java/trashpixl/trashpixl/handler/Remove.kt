package trashpixl.trashpixl.handler

import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockBreakEvent
import trashpixl.trashpixl.Trashpixl
import trashpixl.trashpixl.runnable.Variable

class Remove (plugin: Trashpixl?) : Listener { // the implements for the listener
    init { // the constructor of this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!) // init the plugin
    }

    @EventHandler
    fun breakABlock(ev: BlockBreakEvent) { // describes what the event is
        if(ev.block.type == Material.DIAMOND_BLOCK){//check if we intend to prevent player from breaking block
            //TODO add the rest of the action
        }
    }
}