package trashpixl.trashpixl.handler

import org.bukkit.Bukkit
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerQuitEvent
import trashpixl.trashpixl.Trashpixl
import trashpixl.trashpixl.runnable.Variable
import trashpixl.trashpixl.runnable.os
import trashpixl.trashpixl.runnable.put

class Quit (plugin: Trashpixl?) : Listener {
    init { // the constructor of this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!) // linking it to the main code
    }

    @EventHandler // says that this is an event handler
    fun onPlayerQuit(e: PlayerQuitEvent) {//execute when a player quit the server

        Variable.playerCount--//remove one player from the player count
        if(Variable.playerCount == 0){
            put(os(), 0) }

    }
}