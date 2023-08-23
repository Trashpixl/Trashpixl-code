package trashpixl.trashpixl.handler // the package for this project

import org.bukkit.Bukkit
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityDamageByEntityEvent
import org.bukkit.event.entity.EntityDamageEvent
import trashpixl.trashpixl.Trashpixl
import trashpixl.trashpixl.runnable.Variable
import trashpixl.trashpixl.runnable.getMinigame

class PlayerGetPunch(plugin: Trashpixl?) : Listener { // the implements for the listener
    init { // the constructor of this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!) // register the event
    }

    @EventHandler // say that it is an event handler
    fun pressurePlateHandler(ev: EntityDamageByEntityEvent) { // describes what the event is

        if (Variable.serverType == 1) { // check if we are in server 1

            if (getMinigame() == 5 ||
                            getMinigame() == 6 ||
                            getMinigame() == 8 ||
                            getMinigame() == 10 ||
                            getMinigame() == 13
            ) { // check if minigame 5,6,8,10 or 13 is going
                if (ev.entity is Player) { // check if the entity is a player
                    if (ev.cause == EntityDamageEvent.DamageCause.ENTITY_ATTACK ||
                                    ev.cause == EntityDamageEvent.DamageCause.ENTITY_SWEEP_ATTACK
                    ) { // check if the damage is caused by an entity attack or sweep attack
                        (ev.entity as Player).health = 20.0 // set the player health to 20
                    }
                    if (ev.cause == EntityDamageEvent.DamageCause.VOID
                    ) { // check if the damage is caused by the void
                        (ev.entity as Player).health = 0.0 // set the player health to 0
                    }
                }
            }
            if (getMinigame() == 7) { // check if minigame 7 is going
                if (ev.cause == EntityDamageEvent.DamageCause.ENTITY_ATTACK ||
                                ev.cause == EntityDamageEvent.DamageCause.ENTITY_SWEEP_ATTACK
                ) { // check if the attack is sweep or entity
                    ev.entity.velocity =
                            ev.entity.location.direction.multiply(
                                    -2
                            ) // give a velocity to the player

                            (ev.entity as Player).health = 20.0 // set the player health to 20
                }
            }
            if (getMinigame() == 12) { // check if minigame 12 is going
                if (ev.entity is Player &&
                                ev.cause == EntityDamageEvent.DamageCause.ENTITY_ATTACK ||
                                ev.cause == EntityDamageEvent.DamageCause.ENTITY_SWEEP_ATTACK
                ) { // check if the damage is caused by an entity attack or sweep attack
                    (ev.entity as Player).health = 0.0 // kill the player
                }
            }
        }
    }
}
