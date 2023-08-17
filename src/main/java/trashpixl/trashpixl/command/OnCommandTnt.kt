package trashpixl.trashpixl.command

import org.bukkit.Bukkit
import org.bukkit.Bukkit.getServer
import org.bukkit.Location
import org.bukkit.Material
import org.bukkit.World
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import trashpixl.trashpixl.runnable.Variable
import trashpixl.trashpixl.runnable.copyGame

class OnCommandTnt : CommandExecutor { // creating the class death and implementing the listener

    override fun onCommand(
            sender: CommandSender,
            command: Command,
            label: String,
            args: Array<out String>?
    ): Boolean {
        if (Bukkit.getServer().onlinePlayers.size == Variable.numberOfPlayerBridgeRace) {
            Variable.activeMinigame = true // set the activeMinigame to true
            val xGame = 247.0 // the x coord of the game
            val yGame = -58.0 // the y coord of the game
            val zGame = 250.0 // the z coord of the game
            val xBlock = 0.0
            val yBlock = 0.0
            val zBlock = 0.0
            var w: World

            Variable.preventBreakedBlock = true // set the preventBreakedBlocks to true
            Variable.preventPlacedBlock = true // set the preventPlacedBlock to true

            copyGame("tnt") // copy the game
            for (x in 0..12) {
                for (y in 0..12) {
                    for (z in 0..12) {
                        // place a bedrock block
                        w = getServer().getWorld("world")!!
                        val placeToPutTheBlock = Location(w, xBlock + x, yBlock + y, zBlock + z)
                        w.getBlockAt(placeToPutTheBlock).type = Material.BEDROCK
                    }
                }
            }
            for (x in 0..10) {
                for (y in 0..10) {
                    for (z in 0..10) {
                        // place a bedrock block
                        w = getServer().getWorld("world")!!
                        val placeToPutTheBlock =
                                Location(w, xBlock + x + 1, yBlock + y + 1, zBlock + z + 1)
                        w.getBlockAt(placeToPutTheBlock).type = Material.AIR
                    }
                }
            }
            for (p in getServer().onlinePlayers) { // get all the player in the server
                p.health = 20.0 // set the health to 20
                w = p.world // get the player world
                val to = Location(w, xGame, yGame, zGame) // put together all the info
                p.teleport(to) // tp him
                p.inventory.clear() // clear his inventory
            }
            Variable.tntIsPlaced = true // set the tntIsPlaced to true
        }
        return false
    }
}
