package trashpixl.trashpixl.handler

import org.bukkit.Bukkit
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerQuitEvent
import trashpixl.trashpixl.Trashpixl
import trashpixl.trashpixl.runnable.Variable

class Quit (plugin: Trashpixl?) : Listener {
    init { // the constructor of this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!) // linking it to the main code
    }

    @EventHandler // says that this is an event handler
    fun onPlayerDead(e: PlayerQuitEvent) {

        Variable.playerCount--
       // if(Variable.playerCount == 0){
            //put(os(), 0) }

    }
}