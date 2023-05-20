package trashpixl.trashpixl.handler // the package for this project

import org.bukkit.Bukkit
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import trashpixl.trashpixl.Trashpixl
import trashpixl.trashpixl.runnable.Variable
import trashpixl.trashpixl.runnable.environment
import trashpixl.trashpixl.runnable.minigame

class LauncherJoin(plugin: Trashpixl?) : Listener { // the implements for the listener

    init { // the constructor of this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!) // init the plugin
    }

    @EventHandler
    fun onJoin(ev: PlayerJoinEvent) { // describes what the event is
        val p = ev.player // create the local player id

        if (environment() == 1) {

            if (!Variable.activeMinigame) {
                Variable.activeMinigame = true
                if (minigame() == 1 && Bukkit.getOnlinePlayers().size == 1) {
                    Bukkit.dispatchCommand(p, "onCommandPvp") // dispatchCommand for parkour
                }
                if (minigame() == 2 && Bukkit.getOnlinePlayers().size == 1) {
                    Bukkit.dispatchCommand(p, "onCommandPvpSumo") // dispatchCommand for parkour
                }
                if (minigame() == 3 && Bukkit.getOnlinePlayers().size == 1) {
                    Bukkit.dispatchCommand(p, "onCommandPvpBow") // dispatchCommand for parkour
                }
                if (minigame() == 4 && Bukkit.getOnlinePlayers().size == 1) {
                    Bukkit.dispatchCommand(p, "onCommandPvpLoot") // dispatchCommand for parkour
                }
                if (minigame() == 5 && Bukkit.getOnlinePlayers().size == 1) {
                    Bukkit.dispatchCommand(p, "onCommandBridgeRace") // dispatchCommand for bridge
                }
                if (minigame() == 6 && Bukkit.getOnlinePlayers().size == 1) {
                    Bukkit.dispatchCommand(p, "onCommandParkour") // dispatchCommand for parkour
                }
                if (minigame() == 7 && Bukkit.getOnlinePlayers().size == 1) {
                    Bukkit.dispatchCommand(p, "onCommandPvpKnockBack") // dispatchCommand for pvp knock back
                }
                if (minigame() == 8 && Bukkit.getOnlinePlayers().size == 1) {
                    Bukkit.dispatchCommand(p, "onCommandLabi") // dispatchCommand for parkour
                }
                if (minigame() == 9 && Bukkit.getOnlinePlayers().size == 1) {
                    Bukkit.dispatchCommand(p, "onCommandTnt") // dispatchCommand for tnt race
                }
                if (minigame() == 10 && Bukkit.getOnlinePlayers().size == 1) {
                    Bukkit.dispatchCommand(p, "onCommandButton4") // dispatchCommand for tnt race
                }
                if (minigame() == 11 && Bukkit.getOnlinePlayers().size == 1) {
                    Bukkit.dispatchCommand(p, "onCommandHideAndSeek")// dispatch command for hide and seek
                }
                if (minigame() == 12 && Bukkit.getOnlinePlayers().size == 1) {
                    Bukkit.dispatchCommand(p, "onCommandTag")// dispatch command for tag
                }
                if (minigame() == 13 && Bukkit.getOnlinePlayers().size == 1) {
                    Bukkit.dispatchCommand(p, "onCommandSearchAndFind")//dispatch command for search and find
                }
                if (minigame() == 14 && Bukkit.getOnlinePlayers().size == 1) {
                    Bukkit.dispatchCommand(p, "onCommandDodgeBall")//dispatch command for dodge ball
                }

            }

        }

    }
}
