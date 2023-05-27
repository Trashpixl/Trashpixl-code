package trashpixl.trashpixl.command

import org.bukkit.Bukkit
import org.bukkit.Location
import org.bukkit.Material
import org.bukkit.World
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import trashpixl.trashpixl.runnable.Variable

class OnCommandSearchAndFind : CommandExecutor {//creating the class death and implementing the listener

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>?): Boolean {
        val x = 355.0//the x coord of the game
        val y = -58.0//the y coord of the game
        val z = 339.0//the z coord of the game
        for (p in Bukkit.getServer().onlinePlayers) {//get all the player in the server
            p.health = 20.0//set the health to 20
            val w: World = p.world//get the player world
            val to = Location(w, x, y, z)//put together all the info
            p.teleport(to)//tp him
            p.inventory.clear()//clear his inventory
            placeBlock()
        }
        Variable.preventBreakedBlock = false//set the preventBreakedBlocks to true
        Variable.preventPlacedBlock = true//set the preventPlacedBlock to true
        return false
    }

    private fun placeBlock() {
        var x = 0.0
        var y = 0.0
        var z = 0.0
        val world = Bukkit.getWorld("world")
        when ((1..10).random()) {//TODO add the real coord to hide the block
            1 -> {
                x = 0.0
                y = 0.0
                z = 0.0
            }

            2 -> {
                x = 0.0
                y = 0.0
                z = 0.0
            }

            3 -> {
                x = 0.0
                y = 0.0
                z = 0.0
            }

            4 -> {
                x = 0.0
                y = 0.0
                z = 0.0
            }

            5 -> {
                x = 0.0
                y = 0.0
                z = 0.0
            }

            6 -> {
                x = 0.0
                y = 0.0
                z = 0.0
            }

            7 -> {
                x = 0.0
                y = 0.0
                z = 0.0
            }

            8 -> {
                x = 0.0
                y = 0.0
                z = 0.0
            }

            9 -> {
                x = 0.0
                y = 0.0
                z = 0.0
            }

            10 -> {
                x = 0.0
                y = 0.0
                z = 0.0
            }

        }
        val location = Location(world, x, y, z)
        val block = world?.getBlockAt(location)
        block!!.type = Material.DIAMOND_BLOCK

    }
}