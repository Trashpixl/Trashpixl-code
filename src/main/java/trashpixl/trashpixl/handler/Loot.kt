package trashpixl.trashpixl.handler // the package for this project

import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.Action
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.inventory.ItemStack
import trashpixl.trashpixl.Trashpixl
import trashpixl.trashpixl.runnable.environment
import trashpixl.trashpixl.runnable.minigame

class Loot(plugin: Trashpixl?) : Listener { // creating the class
    init { // the constructor of this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!) // init the plugin
    }

    @EventHandler // say that it is an event handler
    fun buttonHandler(e: PlayerInteractEvent) { // describes what the event is
        if (e.action == Action.RIGHT_CLICK_BLOCK) { // check if the action is physical
            if (e.clickedBlock!!.type == Material.STONE_BUTTON) { // compare what the player sept on to a stone pressure plate and is required a
                // non-nullable


                if (minigame() == 3) { // check if the data equals 3
                    val p = e.player // creating the player variable

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
                                    p.inventory.setItem((1..36).random(),item1) // put it in random inv slot
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
                    }
                }
            }
        }
    }
}
