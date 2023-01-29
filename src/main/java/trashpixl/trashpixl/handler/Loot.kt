package trashpixl.trashpixl.handler // the package for this project

import java.io.File // importing the file class
import java.io.IOException // importing the ioexeption class
import java.util.* // importing all the java utils class
import org.bukkit.Bukkit // importing bukkit
import org.bukkit.Material // importing the material librairy
import org.bukkit.event.EventHandler // importing the event handler class
import org.bukkit.event.Listener // importing the event listener
import org.bukkit.event.block.Action // importing the block action class
import org.bukkit.event.player.PlayerInteractEvent // impoting the player interacte event class
import org.bukkit.inventory.ItemStack // importing the itemstack class
import trashpixl.trashpixl.Zero // importing the zero class

class Loot(plugin: Zero?) : Listener { // creating the class
    init { // the constructor of this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!) // init the plugin
    }
    @EventHandler // say that it is an event handler
    fun buttonHandler(e: PlayerInteractEvent) { // describes what the event is
        if (e.action == Action.RIGHT_CLICK_BLOCK) { // check if the action is physical
            if (e.clickedBlock!!.type == Material.STONE_BUTTON
            ) { // compare what the player sept on to a stone pressure plate and is required a
                // non-nullable
                val fileName = "Minigame.txt" // creating the file name variable
                val actualFile = File(fileName) // creating the file var
                var actualdata = 0 // creating the data from insdide the file variable
                try { // trying the following code
                    if (actualFile.exists() && actualFile.isFile) { // check if the file exist
                        try { // try the following code
                            val reader = Scanner(actualFile) // creating the reader
                            val data = reader.nextLine() // geting the first line of the file
                            actualdata = data.toInt() // converting the date to int
                            reader.close() // closing the reader
                        } catch (e: IOException) { // catching the exeption
                            throw RuntimeException(e) // throwing it
                        }
                    }
                } catch (e: IOException) { // catching it.....
                    throw RuntimeException(e) // throwing it the hardest we can so it wont come back
                }

                if (actualdata == 3) { // check if the data equals 3
                    val p = e.player // creating the player variable
                    val fileName2 = "Server.txt" // creating the file name var
                    val actualFile2 = File(fileName2) // creating the file
                    var Serv = 0 // creating the actual data var
                    try { // trying the code
                        if (actualFile2.exists() && actualFile2.isFile
                        ) { // checking if actual file is a file
                            try {
                                val reader2 = Scanner(actualFile2) // creating the scanner
                                val data2 = reader2.nextLine() // reading the first line
                                Serv = data2.toInt() // converting the data to an int
                                reader2.close() // closing the reader
                            } catch (e: IOException) { // catching the exeption
                                throw RuntimeException(e) // trowing the exeption
                            }
                        }
                    } catch (e: IOException) { // catching the exeption
                        throw RuntimeException(e) // trowing it again
                    }
                    if (Serv == 1) {
                        val kit = (1..6).random() // creating the random val between 1 and 6
                        if (kit == 1) { // checking if kit equals 1
                            val item1 =
                                    ItemStack(
                                            Material.IRON_SWORD,
                                            1
                                    ) // creating an item stack with an iron sword inside
                            val item2 =
                                    ItemStack(
                                            Material.GOLDEN_APPLE,
                                            (1..64).random()
                                    ) // creating an item stack with a random amount of golden apple
                            // in it
                            p.inventory.setItem(
                                    (1..36).random(),
                                    item1
                            ) // puting it in an random inventory slot
                            p.inventory.setItem((1..36).random(), item2) // same as below
                        } else {
                            if (kit == 2) { // checking if kit equals 2
                                val item1 =
                                        ItemStack(
                                                Material.DIAMOND_CHESTPLATE,
                                                1
                                        ) // "" w/ diamond chest plate
                                val item2 =
                                        ItemStack(
                                                Material.BREAD,
                                                (1..64).random()
                                        ) // "" w/ a random amount of bread
                                p.inventory.setItem(
                                        (1..36).random(),
                                        item1
                                ) // put it an an random inv slot
                                p.inventory.setItem((1..36).random(), item2) // same as below
                            } else {
                                if (kit == 3) { // checking if kit equal 3
                                    val item1 = ItemStack(Material.WOODEN_AXE) // "" w/ wooden axe
                                    val item2 =
                                            ItemStack(Material.LEATHER_BOOTS) // "" w/ leather boot
                                    p.inventory.setItem(
                                            (1..36).random(),
                                            item1
                                    ) // put it in random inv slot
                                    p.inventory.setItem((1..36).random(), item2) // same as below
                                } else {
                                    if (kit == 4) { // checking if kit equal 4
                                        val item1 =
                                                ItemStack(
                                                        Material.GOLDEN_CHESTPLATE
                                                ) // "" w/ golden chestplate
                                        val item2 =
                                                ItemStack(
                                                        Material.WOODEN_SWORD
                                                ) // "" w/ wooden sword
                                        p.inventory.setItem(
                                                (1..36).random(),
                                                item1
                                        ) // put in a random inv slot
                                        p.inventory.setItem(
                                                (1..36).random(),
                                                item2
                                        ) // same as below
                                    } else {
                                        if (kit == 5) { // checking if kit equal 5
                                            val item1 =
                                                    ItemStack(
                                                            Material.IRON_BOOTS
                                                    ) // "" w/ iron boots
                                            val item2 =
                                                    ItemStack(
                                                            Material.LEATHER_HELMET
                                                    ) // "" w/ leather helmet
                                            p.inventory.setItem(
                                                    (1..36).random(),
                                                    item1
                                            ) // put it in a random inv slot
                                            p.inventory.setItem(
                                                    (1..36).random(),
                                                    item2
                                            ) // same as below
                                        } else {
                                            if (kit == 6) { // checking if kit equal 6
                                                val item1 =
                                                        ItemStack(
                                                                Material.CHAINMAIL_LEGGINGS
                                                        ) // "" w/ chainmail leggins
                                                val item2 = ItemStack(Material.STICK) // "" w/ stick
                                                p.inventory.setItem(
                                                        (1..36).random(),
                                                        item1
                                                ) // put it in a random inv slot
                                                p.inventory.setItem(
                                                        (1..36).random(),
                                                        item2
                                                ) // same as below
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
