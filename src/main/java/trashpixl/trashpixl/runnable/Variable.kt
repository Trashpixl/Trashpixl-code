package trashpixl.trashpixl.runnable

import java.time.LocalTime

class Variable {
    companion object {
        var playerCount = 0
        var activeMinigame = false
        var time: LocalTime? = null
        var playerArrayNumber: Int = 0
        var playerArray: MutableList<String>? = null
    }
}