package trashpixl.trashpixl.command

import org.bukkit.Bukkit
import org.bukkit.Bukkit.getServer
import org.bukkit.Location
import org.bukkit.World
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.inventory.ItemStack
import trashpixl.trashpixl.runnable.Variable
import trashpixl.trashpixl.runnable.copyGame

class OnCommandAnvilRain:
        CommandExecutor { // creating the class death and implementing the listener

            override fun onCommand(
                    sender: CommandSender,
                    command: Command,
                    label: String,
                    args: Array<out String>?
            ): Boolean {
                if (Bukkit.getServer().onlinePlayers.size == Variable.numberOfPlayerBridgeRace) {//todo add the thing to spawn anvil
                    Variable.activeMinigame = true // set the activeMinigame to true
                    val xGame1 = 0.0 // the x coord of the game
                    val yGame1 = 0.0 // the y coord of the game todo add the coord
                    val zGame1 = 0.0 // the z coord of the game
                    var offsetSpawn = 0
                    copyGame("anvilRain") // copy the game
                    for (p in getServer().onlinePlayers) { // get all the online player
                        offsetSpawn +=1
                        p.health = 20.0 // set the health to 20
                        val w: World = p.world // create the world var
                        val to = Location(w, xGame1, yGame1, zGame1-offsetSpawn) // create game location
                        p.teleport(to) // tp the player
                        p.inventory.clear() // clear their inventory
                       
                    }
                    Variable.preventBreakedBlock = true // set the preventBreakedBlocks to true
                    Variable.preventPlacedBlock = true // set the preventPlacedBlock to true
                }
                return false // return false so it doesn't create an error
            }
        }
