package trashpixl.trashpixl.handler // the package for this project

import org.bukkit.Bukkit
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import trashpixl.trashpixl.Trashpixl
import trashpixl.trashpixl.runnable.Variable
import trashpixl.trashpixl.runnable.environment
import trashpixl.trashpixl.runnable.getMinigame

class MinigameLauncher(plugin: Trashpixl?) : Listener {

    init {
        Bukkit.getPluginManager().registerEvents(this, plugin!!)//register the event
    }

    @EventHandler
    fun onJoin(ev: PlayerJoinEvent) {//describes what the event is
        val p = ev.player//create the local player id

        if (environment() == 1) {

            if (!Variable.activeMinigame) {
                Variable.activeMinigame = true
                if (getMinigame() == 1 && Bukkit.getOnlinePlayers().size == 1) {
                    Bukkit.dispatchCommand(p, "onCommandPvp") //dispatchCommand for parkour
                }
                if (getMinigame() == 2 && Bukkit.getOnlinePlayers().size == 1) {
                    Bukkit.dispatchCommand(p, "onCommandPvpSumo")//dispatchCommand for parkour
                }
                if (getMinigame() == 3 && Bukkit.getOnlinePlayers().size == 1) {
                    Bukkit.dispatchCommand(p, "onCommandPvpBow")//dispatchCommand for parkour
                }
                if (getMinigame() == 4 && Bukkit.getOnlinePlayers().size == 1) {
                    Bukkit.dispatchCommand(p, "onCommandPvpLoot")//dispatchCommand for parkour
                }
                if (getMinigame() == 5 && Bukkit.getOnlinePlayers().size == 1) {
                    Bukkit.dispatchCommand(p, "onCommandBridgeRace")//dispatchCommand for bridge
                }
                if (getMinigame() == 6 && Bukkit.getOnlinePlayers().size == 1) {
                    Bukkit.dispatchCommand(p, "onCommandParkour")//dispatchCommand for parkour
                }
                if (getMinigame() == 7 && Bukkit.getOnlinePlayers().size == 1) {
                    Bukkit.dispatchCommand(p, "onCommandPvpKnockBack")//dispatchCommand for pvp knock back
                }
                if (getMinigame() == 8 && Bukkit.getOnlinePlayers().size == 1) {
                    Bukkit.dispatchCommand(p, "onCommandLabi")//dispatchCommand for parkour
                }
                if (getMinigame() == 9 && Bukkit.getOnlinePlayers().size == 1) {
                    Bukkit.dispatchCommand(p, "onCommandTnt")//dispatchCommand for tnt race
                }
                if (getMinigame() == 10 && Bukkit.getOnlinePlayers().size == 1) {
                    Bukkit.dispatchCommand(p, "onCommandButton4")//dispatchCommand for tnt race
                }
                if (getMinigame() == 11 && Bukkit.getOnlinePlayers().size == 1) {
                    Bukkit.dispatchCommand(p, "onCommandHideAndSeek")//dispatch command for hide and seek
                }
                if (getMinigame() == 12 && Bukkit.getOnlinePlayers().size == 1) {
                    Bukkit.dispatchCommand(p, "onCommandTag")//dispatch command for tag
                }
                if (getMinigame() == 13 && Bukkit.getOnlinePlayers().size == 1) {
                    Bukkit.dispatchCommand(p, "onCommandSearchAndFind")//dispatch command for search and find
                }
                if (getMinigame() == 14 && Bukkit.getOnlinePlayers().size == 1) {
                    Bukkit.dispatchCommand(p, "onCommandDodgeBall")//dispatch command for dodge ball
                }

            }

        }

    }
}
