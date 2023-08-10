package trashpixl.trashpixl.handler

import org.bukkit.Bukkit
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.ProjectileHitEvent
import trashpixl.trashpixl.Trashpixl
import trashpixl.trashpixl.runnable.Variable
import trashpixl.trashpixl.runnable.getMinigame

class PlayerGetShot(plugin: Trashpixl?) : Listener {//create the class and implement the listener
init { // the constructor of this handler
    Bukkit.getPluginManager().registerEvents(this, plugin!!)//register the event
}

    @EventHandler // says that this is an event handler
    //execute when a player get shot by a snowball
    fun playerGetShot(ev: ProjectileHitEvent) {
        if (ev.entity.shooter is org.bukkit.entity.Player && ev.entityType == org.bukkit.entity.EntityType.SNOWBALL && Variable.serverType == 1 && getMinigame() == 14) {
            if (ev.hitEntity is org.bukkit.entity.Player) {//if the entity is a player
                val hitPlayer = ev.hitEntity as org.bukkit.entity.Player//store the hit entity in the var p
                val shooter = ev.entity.shooter as org.bukkit.entity.Player//store the shooter in the var shooter
                if (hitPlayer != shooter) {//if the hit player is not the shooter
                for(playerName in Variable.blueTeam!!){//for each player in the blue team
                    if(playerName == hitPlayer.name){//if the hit player is in the blue team
                        for(playerName2 in Variable.redTeam!!){//for each player in the blue team
                            if(playerName2 == shooter.name){//if the shooter is in the blue team
                                hitPlayer.damage(3.0)//damage the hit player
                            }
                        }
                    }
                }
                for(playerName in Variable.redTeam!!){//for each player in the red team
                    if(playerName == hitPlayer.name){//if the hit player is in the red team
                        for(playerName2 in Variable.blueTeam!!){//for each player in the red team
                            if(playerName2 == shooter.name){//if the shooter is in the red team
                                hitPlayer.damage(3.0)//damage the hit player
                            }
                        }
                    }
                }
            }
        }
    }
}
}