package trashpixl.trashpixl.handler // the package for this project

import org.bukkit.Bukkit // importing bukkit
import org.bukkit.event.EventHandler // importing the event handler
import org.bukkit.event.Listener // importing all the event listener
import org.bukkit.event.block.BlockPlaceEvent // importing the block place event
import trashpixl.trashpixl.Trashpixl // importing the main class
import trashpixl.trashpixl.runnable.Variable // importing the variable class

class BlockPlace(plugin: Trashpixl?) : Listener { // the implements for the listener
    init { // the constructor of this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!) // register the event
    }

    @EventHandler
    fun breakABlock(ev: BlockPlaceEvent) { // describes what the event is
        if (Variable.preventPlacedBlock) { // check if we intend player to place block
            ev.isCancelled = true // cancel the event if true
        }
    }
}
