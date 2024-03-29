package trashpixl.trashpixl.command

import java.time.LocalTime
import org.bukkit.Bukkit
import org.bukkit.Bukkit.getServer
import org.bukkit.Location
import org.bukkit.World
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import trashpixl.trashpixl.runnable.Variable
import trashpixl.trashpixl.runnable.copyGame

class OnCommandButton4 : CommandExecutor { // creating the class death and implementing the listener

    override fun onCommand(
            sender: CommandSender,
            command: Command,
            label: String,
            args: Array<out String>?
    ): Boolean {
        if (Bukkit.getServer().onlinePlayers.size == Variable.numberOfPlayerButton4) {
            Variable.activeMinigame = true // set the activeMinigame to true
            val xGame = -45.0 // the x coord of the game
            val yGame = -59.0 // the y coord of the game
            val zGame = -45.0 // the z coord of the game
            copyGame("button4") // copy the game
            for (p in getServer().onlinePlayers) { // get all the player in the server
                p.health = 20.0 // set the health to 20
                val w: World = p.world // get the player world
                val to = Location(w, xGame, yGame, zGame) // put together all the info
                p.teleport(to) // tp him
                p.inventory.clear() // clear his inventory
            }

            Variable.playerArray!!.clear()

            for (player in getServer().onlinePlayers) { // get all the player in the server
                Variable.playerArray!!.add(player.name) // add the player name to the array
            }

            Variable.playerArray!!.sort() // sort the array
            Variable.time = LocalTime.now() // set the time
            Variable.playerArrayNumber = 0 // set the player number to 0
            for (p in getServer().onlinePlayers) { // get all the player in the server

                if (p.name == Variable.playerArray?.get(Variable.playerArrayNumber)
                ) { // if the player name is the same of the array
                    p.chat("you start the round click the button one time") // send the message
                }
            }
            Variable.preventBreakedBlock = true // set the preventBreakedBlocks to true
            Variable.preventPlacedBlock = true // set the preventPlacedBlock to true
        }
        return false
    }
}
