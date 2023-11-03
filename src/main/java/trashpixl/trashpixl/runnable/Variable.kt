package trashpixl.trashpixl.runnable // package of the file

import java.time.LocalTime // import the time
import org.bukkit.entity.Player // import the player

class Variable {

    companion object {
        var preventPlacedBlock = false // var to define if we can place block
        var preventBreakedBlock: Boolean = false // var that define if we can break block
        var activeMinigame = false // store if there is an active minigame
        var time: LocalTime? = null // store the time for the timer
        var playerArrayNumber: Int = 0 // store which player we are at for the array
        var playerArray: MutableList<String>?  = mutableListOf() // store the name of all player
        var finder: Player? = null // store the finder for hide ans seek
        var isBlindFinder = true // var to store the state of a player view
        var tag: Player? = null // store the tag for tag player
        var blueTeam: MutableList<String>? = null // store the name of all player in blue team
        var redTeam: MutableList<String>? = null // store the name of all player in red team
        var tntIsPlaced = false // store if the tnt is placed
        var PressurePlateIsPlaced = true
        var serverType = 9 // store the type of server

        val numberOfPlayerBridgeRace = 2 // store the number of player for pvp
        val numberOfPlayerButton4 = 2 // store the number of player for pvp
        val numberOfPlayerCamelFight = 2 // store the number of player for pvp
        val numberOfPlayerDodgeBall = 2 // store the number of player for pvp
        val numberOfPlayerHideAndSeek = 2 // store the number of player for pvp
        val numberOfPlayerLabi = 2 // store the number of player for pvp
        val numberOfPlayerParkour = 2 // store the number of player for pvp
        val numberOfPlayerPvp = 2 // store the number of player for pvp
        val numberOfPlayerPvpBow = 2 // store the number of player for pvp
        val numberOfPlayerPvpKnockBack = 2 // store the number of player for pvp
        val numberOfPlayerPvpLoot = 2 // store the number of player for pvp
        val numberOfPlayerPvpSumo = 2 // store the number of player for pvp
        val numberOfPlayerSearchAndFind = 2 // store the number of player for pvp
        val numberOfPlayerTag = 2 // store the number of player for pvp
        val numberOfPlayerTnt = 2 // store the number of player for pvp
    }
}
