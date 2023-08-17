package trashpixl.trashpixl.command

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

class OnCommandPvpKnockBack :
        CommandExecutor { // creating the class death and implementing the listener

    override fun onCommand(
            sender: CommandSender,
            command: Command,
            label: String,
            args: Array<out String>?
    ): Boolean {
        if (Bukkit.getServer().onlinePlayers.size == Variable.numberOfPlayerPvpKnockBack) {
            Variable.activeMinigame = true // set the activeMinigame to true
            val x = 239.0 // the x coord of the game
            val y = -58.0 // the y coord of the game
            val z = 279.0 // the z coord of the game
            copyGame("pvpKnockBack") // copy the game
            for (p in getServer().onlinePlayers) { // get all the player in the server
                p.health = 20.0 // set the health to 20
                val w: World = p.world // get the player world
                val to = Location(w, x, y, z) // put together all the info
                p.teleport(to) // tp him
                p.inventory.clear() // clear his inventory
                val elytra =
                        ItemStack(
                                Material.ELYTRA,
                                1
                        ) // creating an item stack with an iron sword inside
                val stick =
                        ItemStack(
                                Material.STICK,
                                1
                        ) // creating an item stack with a random amount of golden apple in it
                p.inventory.setItem(1, elytra) // putting it in a random inventory slot
                p.inventory.setItem(2, stick) // same as below
            }
            Variable.preventBreakedBlock = true // set the preventBreakedBlocks to true
            Variable.preventPlacedBlock = true // set the preventPlacedBlock to true
        }
        return false
    }
}
