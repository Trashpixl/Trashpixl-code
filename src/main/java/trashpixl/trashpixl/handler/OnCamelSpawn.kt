package trashpixl.trashpixl.handler

import org.bukkit.Bukkit
import org.bukkit.entity.EntityType
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntitySpawnEvent
import org.bukkit.inventory.ItemStack

class OnCamelSpawn : Listener {

    @EventHandler
    fun onEntitySpawn(event: EntitySpawnEvent) {
        if (event.entityType == EntityType.CAMEL) {
            var passengerCount = 0
            val camel = event.entity
            val saddle = ItemStack(org.bukkit.Material.SADDLE)
            camel as org.bukkit.entity.Camel
            camel.inventory.addItem(saddle)
           // camel.addPassenger()
            //camel.addPassenger()
            for (p in Bukkit.getServer().onlinePlayers) {//get all the player in the server
                if (passengerCount < 2) {
                    camel.addPassenger(p)
                    passengerCount++
                    if(passengerCount == 2){
                        val bow = ItemStack(org.bukkit.Material.BOW)
                        val arrow = ItemStack(org.bukkit.Material.ARROW, 64)
                        p.inventory.clear()//clear his inventory
                        p.inventory.setItemInMainHand(bow)//give him the item
                        p.inventory.setItem(2, arrow)//give him the bow
                    }
                }
               else{
                    break
                }
            }
        }
    }
}