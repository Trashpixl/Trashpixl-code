package trashpixl.trashpixl.command

import org.bukkit.Bukkit
import org.bukkit.Location
import org.bukkit.World
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.EntityType
import trashpixl.trashpixl.runnable.Variable
import trashpixl.trashpixl.runnable.copyGame

class OnCommandCamelFight :
        CommandExecutor { // creating the class death and implementing the listener

    override fun onCommand(
            sender: CommandSender,
            command: Command,
            label: String,
            args: Array<out String>?
    ): Boolean {
        if (Bukkit.getServer().onlinePlayers.size == Variable.numberOfPlayerCamelFight) {
            Variable.activeMinigame = true // set the activeMinigame to true
            val xGame = 0.0 // the x coord of the game
            val yGame = -30.0 // the y coord of the game
            val zGame = 0.0 // the z coord of the game
            copyGame("camelFight") // copy the game
            for (p in Bukkit.getServer().onlinePlayers) { // get all the player in the server
                p.health = 20.0 // set the health to 20
                val w: World = p.world // get the player world
                val to = Location(w, xGame, yGame, zGame) // put together all the info
                p.teleport(to) // tp him
                p.inventory.clear() // clear his inventory
            }
            Variable.preventBreakedBlock = true // set the preventBreakedBlocks to true
            Variable.preventPlacedBlock = true // set the preventPlacedBlock to true

            val spawnLocation =
                    Location(
                            Bukkit.getServer().getWorld("world"),
                            0.0,
                            -45.0,
                            0.0
                    ) 
            spawnCamel(spawnLocation)
        }
        return false
    }
    private fun spawnCamel(location: Location) {
        val world = location.world
        val camel = world.spawnEntity(location, EntityType.CAMEL)
    }
}
