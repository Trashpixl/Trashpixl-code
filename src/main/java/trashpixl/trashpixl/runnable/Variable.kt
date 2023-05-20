package trashpixl.trashpixl.runnable//package of the file

import org.bukkit.entity.Player//import the player
import java.time.LocalTime//import the time

class Variable {
    //create the variable class
    companion object {
        //create the companion object
        var preventPlacedBlock = false//var to define if we can place block

        @Suppress("SpellCheckingInspection")
        var preventBreakedBlock = false//var that define if we can break block
        var activeMinigame = false//store if there is an active minigame
        var time: LocalTime? = null//store the time for the timer
        var playerArrayNumber: Int = 0//store which player we are at for the array
        var playerArray: MutableList<String>? = null//store the name of all player
        var finder: Player? = null//store the finder for hide ans seek
        var isBlindFinder = true//var to store the state of a player view
        var tag: Player? = null//store the tag for tag player
        var blueTeam: MutableList<String>? = null//store the name of all player in blue team
        var redTeam: MutableList<String>? = null//store the name of all player in red team
    }
}