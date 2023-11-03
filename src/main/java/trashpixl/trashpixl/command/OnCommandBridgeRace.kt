package trashpixl.trashpixl.command // define the package

import org.bukkit.Bukkit
import org.bukkit.Bukkit.getServer
import org.bukkit.Location
import org.bukkit.Material
import org.bukkit.World
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.inventory.ItemStack
import trashpixl.trashpixl.runnable.Variable
import trashpixl.trashpixl.runnable.copyGame

class OnCommandBridgeRace :
        CommandExecutor { // creating the class death and implementing the listener

    override fun onCommand(
            sender: CommandSender,
            command: Command,
            label: String,
            args: Array<out String>?
    ): Boolean {
        if (Bukkit.getServer().onlinePlayers.size == Variable.numberOfPlayerBridgeRace) {
            Variable.activeMinigame = true // set the activeMinigame to true
            val xGame1 = -13.5 // the x coord of the game
            val yGame1 = -59.0 // the y coord of the game
            val zGame1 = -41.0 // the z coord of the game
            var offsetSpawn: Int = 0
            copyGame("bridgeRace") // copy the game
            for (p in getServer().onlinePlayers) { // get all the online player
                offsetSpawn +=2
                val item1 =
                        ItemStack(
                                Material.BLACK_WOOL,
                                64
                        ) // create the item stack with 64 black wool inside
                p.health = 20.0 // set the health to 20
                val w: World = p.world // create the world var
                val to = Location(w, xGame1, yGame1, zGame1-offsetSpawn) // create game location
                p.teleport(to) // tp the player
                p.inventory.clear() // clear their inventory
                p.inventory.setItem(1, item1) // give them the wool
            }
            Variable.preventBreakedBlock = false // set the preventBreakedBlocks to true
            Variable.preventPlacedBlock = false // set the preventPlacedBlock to true
        }
        return false // return false so it doesn't create an error
    }
}
