import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.Action
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.inventory.ItemStack
import trashpixl.trashpixl.Trashpixl
import trashpixl.trashpixl.runnable.getMinigame

class SnowBallGiver(plugin: Trashpixl?) : Listener { // create the class and implement the listener

    init { // the constructor for the handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!) // register the event
    }
    @EventHandler // define that the methode is an event handler
    fun pressurePlateHandler(
            ev: PlayerInteractEvent
    ) { // create the function with the argument the player event
        if (ev.action == Action.PHYSICAL
        ) { // check if the action is physical like step on or software like open the inventory
            if (ev.clickedBlock!!.type == Material.LIGHT_WEIGHTED_PRESSURE_PLATE &&
                            getMinigame() == 14
            ) { // compare the event to an oak pressure plate
                val snowBall = ItemStack(Material.SNOWBALL, 64) // create the snowball var
                ev.player.inventory.addItem(snowBall) // give the player a snowball
            }
        }
    }
}
