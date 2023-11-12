package trashpixl.trashpixl.handler // the package for this project

import org.bukkit.Bukkit
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import trashpixl.trashpixl.Trashpixl
import trashpixl.trashpixl.runnable.Variable
import trashpixl.trashpixl.runnable.getMinigame

class MinigameLauncher(plugin: Trashpixl?) : Listener {

    init {
        Bukkit.getPluginManager().registerEvents(this, plugin!!)//register the event
    }

    @EventHandler
    fun onJoin(ev: PlayerJoinEvent) {//describes what the event is
        val p = ev.player//create the local player id
        if (Variable.serverType == 1) {
            if (!Variable.activeMinigame) {//check if there is an active minigame
                when (getMinigame()) {
                    1 -> Bukkit.dispatchCommand(p, "onCommandPvp") //dispatchCommand for parkour
                    2 -> Bukkit.dispatchCommand(p, "onCommandPvpSumo")//dispatchCommand for parkour   
                    3 -> Bukkit.dispatchCommand(p, "onCommandPvpBow")//dispatchCommand for parkour
                    4 -> Bukkit.dispatchCommand(p, "onCommandPvpLoot")//dispatchCommand for parkour
                    5 -> Bukkit.dispatchCommand(p, "onCommandBridgeRace")//dispatchCommand for bridge
                    6 -> Bukkit.dispatchCommand(p, "onCommandParkour")//dispatchCommand for parkour
                    7 -> Bukkit.dispatchCommand(p, "onCommandPvpKnockBack")//dispatchCommand for pvp knock back
                    8 -> Bukkit.dispatchCommand(p, "onCommandLabi")//dispatchCommand for parkour
                    9 -> Bukkit.dispatchCommand(p, "onCommandTnt")//dispatchCommand for tnt race
                    10 -> Bukkit.dispatchCommand(p, "onCommandButton4")//dispatchCommand for tnt race
                    11 -> Bukkit.dispatchCommand(p, "onCommandHideAndSeek")//dispatch command for hide and seek
                    12 -> Bukkit.dispatchCommand(p, "onCommandTag")//dispatch command for tag
                    13 -> Bukkit.dispatchCommand(p, "onCommandSearchAndFind")//dispatch command for search and find
                    14 -> Bukkit.dispatchCommand(p, "onCommandDodgeBall")//dispatch command for dodge ball
                    15 -> Bukkit.dispatchCommand(p, "onCommandCamelFight")//dispatch command for tnt tag
                    16 -> Bukkit.dispatchCommand(p, "onCommandFreeFalling")//dispatch command for free falling
                    17 -> Bukkit.dispatchCommand(p, "onCommandAnvilRain")//dispatch command for free falling
                    18 -> Bukkit.dispatchCommand(p, "onCommandFireTrap")//dispatch command for free falling
                }  
            }
        }
    }
}
