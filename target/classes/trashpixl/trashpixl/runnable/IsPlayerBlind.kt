package trashpixl.trashpixl.runnable // package of the file

import org.bukkit.potion.PotionEffectType // import the potion effect type

fun isBlinded() {
    val effect =
            Variable.finder?.getPotionEffect(
                    PotionEffectType.BLINDNESS
            ) // store the blindness potion effect
    if (effect == null && getMinigame() == 11
    ) { // check if effect isn't null and the ongoing minigame is the 11
        Variable.isBlindFinder = false // set id blind to false
    }
}
