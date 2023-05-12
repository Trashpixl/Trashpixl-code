package trashpixl.trashpixl.handler

import org.bukkit.Bukkit
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.ProjectileHitEvent
import trashpixl.trashpixl.Trashpixl

class GetShot (plugin: Trashpixl?) : Listener {//create the class and implement the listener
init { // the constructor of this handler
    Bukkit.getPluginManager().registerEvents(this, plugin!!) // linking it to the main code
}

    @EventHandler // says that this is an event handler
    //execute when a player get shot by a snowball
    fun playerGetShot(ev: ProjectileHitEvent){
        if(ev.entity.shooter is org.bukkit.entity.Player && ev.entityType == org.bukkit.entity.EntityType.SNOWBALL){
           if(ev.hitEntity is org.bukkit.entity.Player){
               val p = ev.hitEntity as org.bukkit.entity.Player
               val shooter = ev.entity.shooter as org.bukkit.entity.Player
               if(p != shooter){
                   p.damage(3.0)
               }
           }
        }

    }
}