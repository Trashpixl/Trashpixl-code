package trashpixl.trashpixl.runnable

import java.time.LocalTime

class Variable {//create the variable class
    companion object {//create the companion object
        var preventPlacedBlock = false//var to define if we can place block
        @Suppress("SpellCheckingInspection")
        var preventBreakedBlock = false//var that define if we can break block
        var playerCount = 0//count the player on the server
        @Suppress("unused")
        var activeMinigame = false//store if there is an active minigame
        var time: LocalTime? = null//store the time for the timer
        var playerArrayNumber: Int = 0//store which player we are at for the array
        var playerArray: MutableList<String>? = null//store the name of all player
    }
}