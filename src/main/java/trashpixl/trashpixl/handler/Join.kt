package trashpixl.trashpixl.handler

import org.bukkit.Bukkit
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import trashpixl.trashpixl.Trashpixl
import trashpixl.trashpixl.runnable.Variable

class Join (plugin: Trashpixl?) : Listener {//create the class and implement the listener
        init { // the constructor of this handler
            Bukkit.getPluginManager().registerEvents(this, plugin!!) // linking it to the main code
        }

        @EventHandler // says that this is an event handler
        fun onPlayerDead(e: PlayerJoinEvent) {//execute when a player join the server
            Variable.playerCount++//add one to the player count

        }
    }