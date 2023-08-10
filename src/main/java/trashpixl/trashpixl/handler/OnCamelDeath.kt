package trashpixl.trashpixl.handler

import com.google.common.io.ByteStreams
import org.bukkit.Bukkit
import org.bukkit.entity.EntityType
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityDeathEvent
import org.bukkit.plugin.java.JavaPlugin
import trashpixl.trashpixl.Trashpixl
import trashpixl.trashpixl.runnable.getMinigame
import SendPlayerBetweenServer

class OnCamelDeath(plugin: Trashpixl?, main: JavaPlugin): Listener {
    private val mainPlugin = main
    init {//the constructor of this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!)//register the event
    }
    @EventHandler
    fun onEntityDeath(event: EntityDeathEvent) {
        if (event.entityType == EntityType.CAMEL && getMinigame() == 15) {
            val world = event.entity.world
            val players = world.players
            for (player in players) {
                val vehicle = player.vehicle
                if (vehicle?.type != EntityType.CAMEL) {
                    SendPlayerBetweenServer("lobby", player , mainPlugin)
                }
            }
        }
    }
}