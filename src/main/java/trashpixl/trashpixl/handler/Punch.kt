package trashpixl.trashpixl.handler // the package for this project

import org.bukkit.Bukkit // importing bukkit
import org.bukkit.entity.Player // importing the info about the player
import org.bukkit.event.EventHandler // importing the event handler
import org.bukkit.event.Listener // importing all the event listener
import org.bukkit.event.entity.EntityDamageByEntityEvent // importing both damage event
import org.bukkit.event.entity.EntityDamageEvent
import trashpixl.trashpixl.Trashpixl // importing zero
import trashpixl.trashpixl.runnable.environment
import trashpixl.trashpixl.runnable.minigame

class Punch(plugin: Trashpixl?) : Listener { // the implements for the listener
    init { // the constructor of this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!) // init the handler
    }

    @EventHandler // say that it is an event handler
    fun pressurePlateHandler(ev: EntityDamageByEntityEvent) { // describes what the event is

        if (environment() == 1) {

            if (minigame() == 6) { // check if the data equal 6
                if (ev.entity is Player) {
                    if (ev.cause == EntityDamageEvent.DamageCause.ENTITY_ATTACK || ev.cause == EntityDamageEvent.DamageCause.ENTITY_SWEEP_ATTACK) { // check if the damage is caused by an entity attack or sweep attack
                        (ev.entity as Player).health = 20.0 // set the player health to 20
                    }
                    if (ev.cause == EntityDamageEvent.DamageCause.VOID) { // check if the damage is caused by the void
                        (ev.entity as Player).health = 0.0 // set the player health to 0
                    }
                }
            }
            if (minigame() == 10) {
                if (ev.cause == EntityDamageEvent.DamageCause.ENTITY_ATTACK || ev.cause == EntityDamageEvent.DamageCause.ENTITY_SWEEP_ATTACK) {
                    ev.entity.velocity = ev.entity.location.direction.multiply(2)
                }
            }
        }
    }
}
