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
import trashpixl.trashpixl.runnable.getMinigame

class LootGiver(plugin: Trashpixl?) : Listener { // creating the class
    init { // the constructor of this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!) // register the event
    }

    @EventHandler // say that it is an event handler
    fun buttonHandler(ev: PlayerInteractEvent) { // describes what the event is
        val p = ev.player // creating the player variable
        if (ev.action == Action.RIGHT_CLICK_BLOCK) { // check if the action is physical
            if (ev.clickedBlock!!.type == Material.STONE_BUTTON && Variable.serverType == 1
            ) { // compare what the player pushed to the stone button
                if (getMinigame() == 4) { // check if the data equals 3
                    val kit = (1..6).random() // creating the random val between 1 and 6
                    if (kit == 1) { // checking if kit equals 1
                        val item1 = ItemStack(Material.IRON_SWORD, 1) // creating the item
                        val item2 =
                                ItemStack(
                                        Material.GOLDEN_APPLE,
                                        (1..64).random()
                                ) // creating the item
                        p.inventory.setItem(
                                (1..36).random(),
                                item1
                        ) // set the item in the inventory
                        p.inventory.setItem(
                                (1..36).random(),
                                item2
                        ) // set the item in the inventory
                    } else {
                        if (kit == 2) { // checking if kit equals 2
                            val item1 =
                                    ItemStack(Material.DIAMOND_CHESTPLATE, 1) // creating the item
                            val item2 =
                                    ItemStack(Material.BREAD, (1..64).random()) // creating the item
                            p.inventory.setItem(
                                    (1..36).random(),
                                    item1
                            ) // set the item in the inventory
                            p.inventory.setItem(
                                    (1..36).random(),
                                    item2
                            ) // set the item in the inventory
                        } else {
                            if (kit == 3) { // checking if kit equal 3
                                val item1 = ItemStack(Material.WOODEN_AXE) // creating the item
                                val item2 = ItemStack(Material.LEATHER_BOOTS) // creating the item
                                p.inventory.setItem(
                                        (1..36).random(),
                                        item1
                                ) // set the item in the inventory
                                p.inventory.setItem(
                                        (1..36).random(),
                                        item2
                                ) // set the item in the inventory
                            } else {
                                if (kit == 4) { // checking if kit equal 4
                                    val item1 =
                                            ItemStack(
                                                    Material.GOLDEN_CHESTPLATE
                                            ) // creating the item
                                    val item2 =
                                            ItemStack(Material.WOODEN_SWORD) // creating the item
                                    p.inventory.setItem(
                                            (1..36).random(),
                                            item1
                                    ) // set the item in the inventory
                                    p.inventory.setItem(
                                            (1..36).random(),
                                            item2
                                    ) // set the item in the inventory
                                } else {
                                    if (kit == 5) { // checking if kit equal 5
                                        val item1 =
                                                ItemStack(Material.IRON_BOOTS) // creating the item
                                        val item2 =
                                                ItemStack(
                                                        Material.LEATHER_HELMET
                                                ) // creating the item
                                        p.inventory.setItem(
                                                (1..36).random(),
                                                item1
                                        ) // set the item in the inventory
                                        p.inventory.setItem(
                                                (1..36).random(),
                                                item2
                                        ) // set the item in the inventory
                                    } else {
                                        if (kit == 6) { // checking if kit equal 6
                                            val item1 =
                                                    ItemStack(
                                                            Material.CHAINMAIL_LEGGINGS
                                                    ) // creating the item
                                            val item2 =
                                                    ItemStack(Material.STICK) // creating the item
                                            p.inventory.setItem(
                                                    (1..36).random(),
                                                    item1
                                            ) // set the item in the inventory
                                            p.inventory.setItem(
                                                    (1..36).random(),
                                                    item2
                                            ) // set the item in the inventory
                                        }
                                    }
                                }
                            }
                        }
                    }
                    // add the code here
                    when ((1..10).random()) { // creating the random number between 1 and 10
                        1 -> p.teleport(Location(p.world, -33.0, -61.0, -31.0))//todo change the coord
                        2 -> p.teleport(Location(p.world, -46.0, -61.0, -46.0))
                        3 -> p.teleport(Location(p.world, -47.0, -61.0, -30.0))
                        4 -> p.teleport(Location(p.world, -31.0, -61.0, -47.0))
                        5 -> p.teleport(Location(p.world, -38.0, -61.0, -43.0))
                        6 -> p.teleport(Location(p.world, -33.0, -42.0, -31.0))
                        7 -> p.teleport(Location(p.world, -46.0, -42.0, -46.0))
                        8 -> p.teleport(Location(p.world, -47.0, -42.0, -30.0))
                        9 -> p.teleport(Location(p.world, -31.0, -42.0, -47.0))
                        10 -> p.teleport(Location(p.world, -38.0, -42.0, -43.0))
                    }
                }
            }
        }
    }
}
