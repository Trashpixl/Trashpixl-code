package trashpixl.trashpixl.runnable

import org.bukkit.entity.Player
import org.bukkit.potion.PotionEffectType

fun isBlinded() {
    val effect = Variable.finder?.getPotionEffect(PotionEffectType.BLINDNESS)
    if(effect != null && minigame() == 11){
        Variable.isBlindFinder = false
    }

}