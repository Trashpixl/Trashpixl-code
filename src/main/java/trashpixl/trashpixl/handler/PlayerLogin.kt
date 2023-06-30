package trashpixl.trashpixl.handler//the package for this project

import org.bukkit.Bukkit
import org.bukkit.Location
import org.bukkit.World
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import trashpixl.trashpixl.Trashpixl
import trashpixl.trashpixl.runnable.environment

class PlayerLogin(plugin: Trashpixl?) : Listener {//create the class and implement the listener
init {//the constructor of this handler
    Bukkit.getPluginManager().registerEvents(this, plugin!!)//register the event
}

    @EventHandler//says that this is an event handler
    fun onPlayerDead(ev: PlayerJoinEvent) {//execute when a player join the server
        val p = ev.player//creating the player variable

        if (environment() == 2) {
            val x = 25.0//creating the x val
            val y = 81.0//creating the y val
            val z = 10.0//creating the z val
            val w: World = p.world//get the player world
            val to = Location(w, x, y, z)//put together all the info
            p.teleport(to)//tp him
        }
        if (environment() == 0) {
            val to: Location = p.bedSpawnLocation!!//get his bed location
            p.teleport(to)//tp him to his bed
        }
    }
}