package trashpixl.trashpixl.handler // the package for this project

import org.bukkit.Bukkit // import bukkit
import org.bukkit.Material // import the materail lib
import org.bukkit.event.EventHandler // import the event handler
import org.bukkit.event.Listener // import the event listener
import org.bukkit.event.block.Action // import all action related to block
import org.bukkit.event.player.PlayerInteractEvent // import the player interact event
import trashpixl.trashpixl.Zero // import the zero class

class RaceTimer(plugin: Zero?) : Listener {
    // the implements for the listener
    init { // the constructor of this event
        Bukkit.getPluginManager().registerEvents(this, plugin!!) // init the handler
    }
    @EventHandler
    fun pressurePlateHandler(e: PlayerInteractEvent) { // describes what the event is
        if (e.action == Action.PHYSICAL) { // check if the action is physical
            if (e.clickedBlock!!.type == Material.STONE_PRESSURE_PLATE) { // compare what the player sept on to a stone pressure plate and is required a
                // non-nullable
            }
        }
    }
}
