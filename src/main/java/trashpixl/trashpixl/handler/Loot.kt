package trashpixl.trashpixl.handler // the package for this project

import org.bukkit.Bukkit
import org.bukkit.Location
import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.Action
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.inventory.ItemStack
import trashpixl.trashpixl.Trashpixl
import trashpixl.trashpixl.runnable.Variable
import trashpixl.trashpixl.runnable.environment
import trashpixl.trashpixl.runnable.minigame

class Loot(plugin: Trashpixl?) : Listener { // creating the class
    init { // the constructor of this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!) // init the plugin
    }

    @EventHandler // say that it is an event handler
    fun buttonHandler(ev: PlayerInteractEvent) { // describes what the event is
        val p = ev.player // creating the player variable
        if (ev.action == Action.RIGHT_CLICK_BLOCK) { // check if the action is physical
            if (ev.clickedBlock!!.type == Material.STONE_BUTTON) { // compare what the player pushed to the stone button
                if (minigame() == 4) { // check if the data equals 3
                    if (environment() == 1) {
                        val kit = (1..6).random() // creating the random val between 1 and 6
                        if (kit == 1) { // checking if kit equals 1
                            val item1 = ItemStack(Material.IRON_SWORD, 1) // creating an item stack with an iron sword inside
                            val item2 = ItemStack(Material.GOLDEN_APPLE, (1..64).random()) // creating an item stack with a random amount of golden apple
                            // in it
                            p.inventory.setItem((1..36).random(), item1) // putting it in a random inventory slot
                            p.inventory.setItem((1..36).random(), item2) // same as below
                        } else {
                            if (kit == 2) { // checking if kit equals 2
                                val item1 = ItemStack(Material.DIAMOND_CHESTPLATE, 1) // "" w/ diamond chest plate
                                val item2 = ItemStack(Material.BREAD, (1..64).random()) // "" w/ a random amount of bread
                                p.inventory.setItem((1..36).random(), item1) // put it an an random inv slot
                                p.inventory.setItem((1..36).random(), item2) // same as below
                            } else {
                                if (kit == 3) { // checking if kit equal 3
                                    val item1 = ItemStack(Material.WOODEN_AXE) // "" w/ wooden axe
                                    val item2 = ItemStack(Material.LEATHER_BOOTS)
                                    p.inventory.setItem((1..36).random(), item1) // put it in random inv slot
                                    p.inventory.setItem((1..36).random(), item2) // same as below
                                } else {
                                    if (kit == 4) { // checking if kit equal 4
                                        val item1 = ItemStack(Material.GOLDEN_CHESTPLATE) // "" w/ golden chest-plate
                                        val item2 = ItemStack(Material.WOODEN_SWORD) // "" w/ wooden sword
                                        p.inventory.setItem((1..36).random(), item1) // put in a random inv slot
                                        p.inventory.setItem((1..36).random(), item2) // same as below
                                    } else {
                                        if (kit == 5) { // checking if kit equal 5
                                            val item1 = ItemStack(Material.IRON_BOOTS) // "" w/ iron boots
                                            val item2 = ItemStack(Material.LEATHER_HELMET) // "" w/ leather helmet
                                            p.inventory.setItem((1..36).random(), item1) // put it in a random inv slot
                                            p.inventory.setItem((1..36).random(), item2) // same as below
                                        } else {
                                            if (kit == 6) { // checking if kit equal 6
                                                val item1 = ItemStack(Material.CHAINMAIL_LEGGINGS) // "" w/ chain-mail leggings
                                                val item2 = ItemStack(Material.STICK) // "" w/ stick
                                                p.inventory.setItem((1..36).random(), item1) // put it in a random inv slot
                                                p.inventory.setItem((1..36).random(), item2) // same as below
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        //add the code here
                        when ((1..10).random()) {
                            1 -> p.teleport(Location(p.world, 137.0, -62.0, 279.0))
                            2 -> p.teleport(Location(p.world, 135.0, -62.0, 277.0))
                            3 -> p.teleport(Location(p.world, 133.0, -62.0, 275.0))
                            4 -> p.teleport(Location(p.world, 130.0, -62.0, 273.0))
                            5 -> p.teleport(Location(p.world, 127.0, -62.0, 270.0))
                            6 -> p.teleport(Location(p.world, 125.0, -62.0, 268.0))
                            7 -> p.teleport(Location(p.world, 123.0, -62.0, 266.0))
                            8 -> p.teleport(Location(p.world, 121.5, -62.0, 264.0))
                            9 -> p.teleport(Location(p.world, 120.0, -62.0, 262.0))
                            10 -> p.teleport(Location(p.world, 119.0, -62.0, 260.0))

                        }
                    }
                }
                if (minigame() == 10) {//check if the minigame is 10
                    if (environment() == 1) {//check if the player is in the right server
                        if (p.name == Variable.playerArray?.get(Variable.playerArrayNumber)) {//check if the player is the one that is supposed to be playing
                            if ((1..10).random() == 1) {//check if the player is lucky
                                p.health = 0.0//if not kill the player
                            } else {
                                if (Variable.playerArray!!.size >= Variable.playerArrayNumber) {//check if the player array number is smaller than the array
                                    Variable.playerArrayNumber++//if it is add one to the array number
                                } else {
                                    Variable.playerArrayNumber = 0//if not set the array number to 0
                                }
                                for (player in Bukkit.getServer().onlinePlayers) {//loop through all the players
                                    if (player.name == Variable.playerArray?.get(Variable.playerArrayNumber)) {//check if the player is the one that is supposed to be playing
                                        player.sendMessage("its your turn")//then tell the player that it is their turn

                                    }
                                }
                            }

                        } else {
                            p.sendMessage("its not your turn yet, its ${Variable.playerArray?.get(Variable.playerArrayNumber)} turn")//tell the player that it is not their turn
                        }
                    }
                }
            }
        }
    }
}
