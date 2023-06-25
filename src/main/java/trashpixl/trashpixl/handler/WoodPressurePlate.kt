package trashpixl.trashpixl.handler//the package for this project

//the import for this project
import org.bukkit.Bukkit // import bukkit for reference
import org.bukkit.Location // import the location class
import org.bukkit.Material // import all the bukkit material
import org.bukkit.event.EventHandler // import the event handler
import org.bukkit.event.Listener // import the listener class
import org.bukkit.event.block.Action // import all the action for block
import org.bukkit.event.player.PlayerInteractEvent // import the player event
import trashpixl.trashpixl.Trashpixl // import the main class
import trashpixl.trashpixl.runnable.environment//import the environment

class WoodPressurePlate(plugin: Trashpixl?) : Listener {//create the class and implement the listener

    init {//the constructor for the handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!)//register the event
    }

    @EventHandler//define that the methode is an event handler
    fun pressurePlateHandler(ev: PlayerInteractEvent) {//create the function with the argument the player event
        if (ev.action == Action.PHYSICAL) {//check if the action is physical like step on or software like open the inventory
            if (ev.clickedBlock!!.type == Material.OAK_PRESSURE_PLATE) {//compare the event to an oak pressure plate
                val p = ev.player//create the local variable player
                if (environment() == 0) {//check if we are in server 0
                    val to: Location = p.bedSpawnLocation!!//get his bed location
                    p.teleport(to)//tp him to his bed
                }
            }
        }
    }
}
