package trashpixl.trashpixl.command

import kotlin.random.Random
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
import trashpixl.trashpixl.runnable.copyGame

class OnCommandHideAndSeek :
        CommandExecutor { // creating the class death and implementing the listener

    override fun onCommand(
            sender: CommandSender,
            command: Command,
            label: String,
            args: Array<out String>?
    ): Boolean {
        if (Bukkit.getServer().onlinePlayers.size == Variable.numberOfPlayerHideAndSeek) {
            Variable.activeMinigame = true // set the activeMinigame to true
            val xGame = 0.0 // the x coord of the game
            val yGame = 0.0 // the y coord of the game
            val zGame = 0.0 // the z coord of the game
            copyGame("hideAndSeek")
            for (p in Bukkit.getServer().onlinePlayers) { // get all the online player

                p.health = 20.0 // set the health to 20
                val w: World = p.world // create the world var
                val to = Location(w, xGame, yGame, zGame) // create game location
                p.teleport(to) // tp the player
                p.inventory.clear() // clear their inventory
            }
            Variable.finder = getRandomPlayer() // get a random player
            Variable.finder?.chat(
                    "you are the finder"
            ) // send to message to indicate that the player is the tag
            val blackoutEffect =
                    PotionEffect(PotionEffectType.BLINDNESS, 8 * 20, 1) // create the potion effect
            Variable.finder?.addPotionEffect(blackoutEffect) // add the potion effect to the player
            Variable.isBlindFinder = true // set the player to be blind
            Variable.preventBreakedBlock = true // set the preventBreakedBlocks to true
            Variable.preventPlacedBlock = true // set the preventPlacedBlock to true
        }
        return false // return false so it doesn't create an error
    }

    private fun getRandomPlayer(): Player? { // a function that return a random player in the server
        val players = mutableListOf<Player>() // create a list of player
        for (player in Bukkit.getOnlinePlayers()) { // get all the player in the server
            players.add(player) // add the player to the list
        }
        return if (players.isNotEmpty()) { // if the list is not empty
            players[Random.nextInt(players.size)] // return a random player
        } else { // if the list is empty
            null // return null
        }
    }
}
