package trashpixl.trashpixl.handler//the package for this project

import org.bukkit.Bukkit//importing bukkit
import org.bukkit.entity.Player//importing the info about the player
import org.bukkit.event.EventHandler//importing the event handler
import org.bukkit.event.Listener//importing all the event listener
import org.bukkit.event.entity.EntityDamageByEntityEvent//importing both damage event
import org.bukkit.event.entity.EntityDamageEvent
import trashpixl.trashpixl.Trashpixl//importing the main class
import trashpixl.trashpixl.runnable.environment
import trashpixl.trashpixl.runnable.minigame

class Punch(plugin: Trashpixl?) : Listener {//the implements for the listener
    init {//the constructor of this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!)//init the handler
    }

    @EventHandler//say that it is an event handler
    fun pressurePlateHandler(ev: EntityDamageByEntityEvent) {//describes what the event is

        if (environment() == 1) {//check if we are in server 1

            if (minigame() == 5 || minigame() == 6 || minigame() == 8 || minigame() == 10 || minigame() == 13) { // check if minigame 5,6,8,10 or 13 is going
                if (ev.entity is Player) {//check if the entity is a player
                    if (ev.cause == EntityDamageEvent.DamageCause.ENTITY_ATTACK || ev.cause == EntityDamageEvent.DamageCause.ENTITY_SWEEP_ATTACK) { // check if the damage is caused by an entity attack or sweep attack
                        (ev.entity as Player).health = 20.0//set the player health to 20
                    }
                    if (ev.cause == EntityDamageEvent.DamageCause.VOID) {//check if the damage is caused by the void
                        (ev.entity as Player).health = 0.0//set the player health to 0
                    }
                }
            }
            if (minigame() == 7) {//check if minigame 7 is going
                if (ev.cause == EntityDamageEvent.DamageCause.ENTITY_ATTACK || ev.cause == EntityDamageEvent.DamageCause.ENTITY_SWEEP_ATTACK) {//check if the attack is sweep or entity
                    ev.entity.velocity = ev.entity.location.direction.multiply(2)//give a velocity to the player
                }
            }
            if(minigame() == 12){//check if minigame 12 is going
                if (ev.entity is Player &&ev.cause == EntityDamageEvent.DamageCause.ENTITY_ATTACK || ev.cause == EntityDamageEvent.DamageCause.ENTITY_SWEEP_ATTACK) { // check if the damage is caused by an entity attack or sweep attack
                    (ev.entity as Player).health = 0.0//kill the player
                }

            }
        }
    }
}
