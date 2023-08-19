package trashpixl.trashpixl.command

import org.bukkit.Bukkit
import org.bukkit.Location
import org.bukkit.Material
import org.bukkit.World
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import trashpixl.trashpixl.runnable.Variable
import trashpixl.trashpixl.runnable.copyGame

class OnCommandSearchAndFind :
        CommandExecutor { // creating the class death and implementing the listener

    override fun onCommand(
            sender: CommandSender,
            command: Command,
            label: String,
            args: Array<out String>?
    ): Boolean {
        if (Bukkit.getServer().onlinePlayers.size == Variable.numberOfPlayerBridgeRace) {
            Variable.activeMinigame = true // set the activeMinigame to true
            val xGame = 0.0 // the x coord of the game
            val yGame = 0.0 // the y coord of the game
            val zGame = 0.0 // the z coord of the game
            copyGame("searchAndFind") // copy the game
            for (p in Bukkit.getServer().onlinePlayers) { // get all the player in the server
                p.health = 20.0 // set the health to 20
                val w: World = p.world // get the player world
                val to = Location(w, xGame, yGame, zGame) // put together all the info
                p.teleport(to) // tp him
                p.inventory.clear() // clear his inventory
                placeBlock()
            }
            Variable.preventBreakedBlock = false // set the preventBreakedBlocks to true
            Variable.preventPlacedBlock = true // set the preventPlacedBlock to true
        }
        return false
    }

    private fun placeBlock() {
        var x = 0.0
        var y = 0.0
        var z = 0.0
        val world = Bukkit.getWorld("world")
        when ((1..10).random()) { // TODO add the real coord to hide the block
            1 -> {
                x = -1.0
                y = -60.0
                z = -1.0
            }
            2 -> {
                x = -17.0
                y = -60.0
                z = -18.0
            }
            3 -> {
                x = -43.0
                y = -60.0
                z = -10.0
            }
            4 -> {
                x = -45.0
                y = -60.0
                z = -45.0
            }
            5 -> {
                x = -12.0
                y = -60.0
                z = -30.0
            }
            6 -> {
                x = 58.0
                y = -60.0
                z = -30.0
            }
            7 -> {
                x = 54.0
                y = -60.0
                z = -14.0
            }
            8 -> {
                x = 26.0
                y = -60.0
                z = -11.0
            }
            9 -> {
                x = 14.0
                y = -60.0
                z = -42.0
            }
            10 -> {
                x = 58.0
                y = -60.0
                z = 8.0
            }
        }
        val location = Location(world, x, y, z)
        val block = world?.getBlockAt(location)
        block!!.type = Material.DIAMOND_BLOCK
    }
}
