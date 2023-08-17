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
            val xGame = 177.7 // the x coord of the game
            val yGame = -60.0 // the y coord of the game
            val zGame = 265.3 // the z coord of the game
            copyGame("bridgeRace") // copy the game
            for (p in getServer().onlinePlayers) { // get all the online player
                val item1 =
                        ItemStack(
                                Material.BLACK_WOOL,
                                64
                        ) // create the item stack with 64 black wool inside
                p.health = 20.0 // set the health to 20
                val w: World = p.world // create the world var
                val to = Location(w, xGame, yGame, zGame) // create game location
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
