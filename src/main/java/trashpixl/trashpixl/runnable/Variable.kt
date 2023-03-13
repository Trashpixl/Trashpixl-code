package trashpixl.trashpixl.runnable

import java.time.LocalTime

class Variable {//create the variable class
    companion object {//create the companion object
        var preventPlacedBlock = false//var the define if we can place block
        var preventBreakedBlock = false//var that define if we can break block
        var playerCount = 0//count the player on the server
        var activeMinigame = false//store if there is an active minigame 
        var time: LocalTime? = null//store the time for the timer
        var playerArrayNumber: Int = 0//store wich player we are at for the array
        var playerArray: MutableList<String>? = null//store the name of all player
    }
}