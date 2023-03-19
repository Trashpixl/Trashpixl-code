package trashpixl.trashpixl.command

import org.bukkit.Bukkit
import org.bukkit.Location
import org.bukkit.World
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType
import trashpixl.trashpixl.runnable.Variable
import kotlin.random.Random


class OnCommandHideAndSeek : CommandExecutor { //creating the class death and implementing the listener

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>?): Boolean {
        val x = 355.0//the x coord of the game
        val y = -58.0 //the y coord of the game
        val z = 339.0 //the z coord of the game
        for (p in Bukkit.getServer().onlinePlayers) { //get all the online player

            p.health = 20.0 //set the health to 20
            val w: World = p.world //create the world var
            val to = Location(w, x, y, z) //create game location
            p.teleport(to) //tp the player
            p.inventory.clear() //clear their inventory

        }
        Variable.finder = getRandomPlayer()
        Variable.finder?.sendMessage("you are the finder")
        val blackoutEffect = PotionEffect(PotionEffectType.BLINDNESS, 8 * 20, 1)
        Variable.finder?.addPotionEffect(blackoutEffect)
        Variable.isBlindFinder = true
        return false //return false so it doesn't create an error
    }
    private fun getRandomPlayer(): Player? {
        val players = mutableListOf<Player>()
        for (player in Bukkit.getOnlinePlayers()) {
            players.add(player)
        }
        return if (players.isNotEmpty()) {
            players[Random.nextInt(players.size)]
        } else {
            null
        }
    }
}