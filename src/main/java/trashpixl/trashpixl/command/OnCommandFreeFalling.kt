package trashpixl.trashpixl.command

import org.bukkit.Bukkit
import org.bukkit.Location
import org.bukkit.World
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import trashpixl.trashpixl.runnable.Variable
import trashpixl.trashpixl.runnable.copyGame


class OnCommandFreeFalling : CommandExecutor { // creating the class death and implementing the listener

    override fun onCommand(
        sender: CommandSender,
        command: Command,
        label: String,
        args: Array<out String>?
    ): Boolean {
        if (Bukkit.getServer().onlinePlayers.size == Variable.numberOfPlayerCamelFight) {
            Variable.activeMinigame = true
            // set the activeMinigame to true
            val xGame = 0.0 // the x coord of the game
            val yGame = 0.0 // the y coord of the game
            val zGame = 0.0 // the z coord of the game
            var offsetSpawnX = -1
            var offsetSpawnZ = 0
            copyGame("") // copy the game todo add the real copy name
            for (p in Bukkit.getServer().onlinePlayers) { // get all the player in the server
                if(offsetSpawnX == 15){
                    offsetSpawnX = 0
                    offsetSpawnZ++
                }
                else{offsetSpawnX++}
                p.health = 20.0 // set the health to 20 todo add spawn offset
                val w: World = p.world // get the player world
                val to = Location(w, xGame + offsetSpawnX, yGame, zGame + offsetSpawnZ) // put together all the info todo check for + or - offset
                p.teleport(to) // tp him
                p.inventory.clear() // clear his inventory
            }
            Variable.preventBreakedBlock = true // set the preventBreakedBlocks to true
            Variable.preventPlacedBlock = true // set the preventPlacedBlock to true

        }
            return false
        
    }
}