package trashpixl.trashpixl.handler

import org.bukkit.Bukkit
import org.bukkit.entity.EntityType
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.vehicle.VehicleExitEvent
import trashpixl.trashpixl.Trashpixl
import trashpixl.trashpixl.runnable.getMinigame

class CamelDismount(plugin: Trashpixl?) : Listener {

    init { // the constructor of this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!) // register the event
    }
    @EventHandler
    fun onVehicleExit(event: VehicleExitEvent) {
        val exited = event.exited
        val vehicle = event.vehicle

        if (vehicle.type == EntityType.CAMEL && exited is Player && getMinigame() == 15) {
            // Prevent player from exiting the camel
            event.isCancelled = true
        }
    }
}
