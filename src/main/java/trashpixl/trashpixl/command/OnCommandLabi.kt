package trashpixl.trashpixl.command // define the package

import org.bukkit.Bukkit
import org.bukkit.Bukkit.getServer
import org.bukkit.Location
import org.bukkit.World
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import trashpixl.trashpixl.runnable.Variable
import trashpixl.trashpixl.runnable.copyGame

class OnCommandLabi : CommandExecutor { // creating the class death and implementing the listener

    override fun onCommand(
            sender: CommandSender,
            command: Command,
            label: String,
            args: Array<out String>?
    ): Boolean {
        if (Bukkit.getServer().onlinePlayers.size == Variable.numberOfPlayerLabi) {
            Variable.activeMinigame = true // set the activeMinigame to true
            val xGame = 0.0 // the x coord of the game
            val yGame = -61.0 // the y coord of the game
            val zGame = -26.0 // the z coord of the game
            var offsetSpawn = -1
            copyGame("labi") // copy the game
            for (p in getServer().onlinePlayers) { // get all the player in the server
                offsetSpawn++
                p.health = 20.0 // set the health to 20
                val w: World = p.world // get the player world
                val to = Location(w, xGame - offsetSpawn, yGame, zGame) // move before for
                p.teleport(to) // tp him
                p.inventory.clear() // clear his inventory
            }
            Variable.preventBreakedBlock = true // set the preventBreakedBlocks to true
            Variable.preventPlacedBlock = true // set the preventPlacedBlock to true
        }
        return false
    }
}
