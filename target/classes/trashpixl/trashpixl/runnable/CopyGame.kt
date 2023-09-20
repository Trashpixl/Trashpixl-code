package trashpixl.trashpixl.runnable

import ChoEasyCopy
import org.bukkit.Bukkit
import trashpixl.trashpixl.runnable.WorldEditCopy
import trashpixl.trashpixl.runnable.WorldEditPaste

fun copyGame(game: String) {

    for (p in Bukkit.getOnlinePlayers()) {
        p.sendMessage("qwertyuiop")
    }
     fillWithAir()

    if (game == "tnt") {
        val x1 = 282
        val y1 = -32
        val z1 = 279

        val x2 = 245
        val y2 = -64
        val z2 = 245

        val copy = WorldEditCopy()
        copy.copy(x1, y1, z1, x2, y2, z2)
        
    }
    if (game == "tag") {
        val x1 = 288
        val y1 = -32
        val z1 = 339

        val x2 = 400
        val y2 = -64
        val z2 = 400

        val copy = WorldEditCopy()
        copy.copy(x1, y1, z1, x2, y2, z2)
    }
    if (game == "searchAndFind") {
        val x1 = 288
        val y1 = -32
        val z1 = 339

        val x2 = 400
        val y2 = -64
        val z2 = 400

        val copy = WorldEditCopy()
        copy.copy(x1, y1, z1, x2, y2, z2)
    }
    if (game == "hideAndSeek") {
        val x1 = 288
        val y1 = -32
        val z1 = 339

        val x2 = 400
        val y2 = -64
        val z2 = 400

        val copy = WorldEditCopy()
        copy.copy(x1, y1, z1, x2, y2, z2)
    }
    if (game == "pvpSumo") {
        val x1 = 245
        val y1 = -32
        val z1 = 280

        val x2 = 195
        val y2 = -64
        val z2 = 220

        val copy = WorldEditCopy()
        copy.copy(x1, y1, z1, x2, y2, z2)
    }
    if (game.equals("pvp")) {
        for (p in Bukkit.getOnlinePlayers()) {
            p.sendMessage("skdlj")
        }
        val x1 = 245
        val y1 = -32
        val z1 = 280

        val x2 = 195
        val y2 = -64
        val z2 = 220

        val copy = WorldEditCopy()
        copy.copy(x1, y1, z1, x2, y2, z2)
    }
    if (game == "parkour") {
        val x1 = 227
        val y1 = -32
        val z1 = 280

        val x2 = 127
        val y2 = -64
        val z2 = 320

        val copy = WorldEditCopy()
        copy.copy(x1, y1, z1, x2, y2, z2)
    }
    if (game == "pvpBow") {
        val x1 = 245
        val y1 = -32
        val z1 = 280

        val x2 = 195
        val y2 = -64
        val z2 = 220

        val copy = WorldEditCopy()
        copy.copy(x1, y1, z1, x2, y2, z2)
    }
    if (game == "pvpKnockBack") {
        val x1 = 245
        val y1 = -32
        val z1 = 280

        val x2 = 195
        val y2 = -64
        val z2 = 220

        val copy = WorldEditCopy()
        copy.copy(x1, y1, z1, x2, y2, z2)
    }
    if (game == "pvpLoot") {
        val x1 = 118
        val y1 = -32
        val z1 = 280

        val x2 = 138
        val y2 = -64
        val z2 = 259
        val copy = WorldEditCopy()
        copy.copy(x1, y1, z1, x2, y2, z2)
    }
    if (game == "dodgeball") {
        val x1 = 343
        val y1 = -32
        val z1 = 282

        val x2 = 292
        val y2 = -64
        val z2 = 333
        val copy = WorldEditCopy()
        copy.copy(x1, y1, z1, x2, y2, z2)
    }
    if (game == "button4") {
        val x1 = 181
        val y1 = -32
        val z1 = 263

        val x2 = 19
        val y2 = -64
        val z2 = 280
        val copy = WorldEditCopy()
        copy.copy(x1, y1, z1, x2, y2, z2)
    }
    if (game == "bridgeRace") {
        val x1 = 180
        val y1 = -64
        val z1 = 259

        val x2 = 138
        val y2 = -32
        val z2 = 280

        val copy = WorldEditCopy()
        copy.copy(x1, y1, z1, x2, y2, z2)
    }
    if (game == "camelFight") {
        val x1 = 128
        val y1 = -31
        val z1 = 240

        val x2 = 195
        val y2 = -64
        val z2 = 152

        val copy = WorldEditCopy()
        copy.copy(x1, y1, z1, x2, y2, z2)
    }
    if (game == "Labi") {
        val x1 = 227
        val y1 = -32
        val z1 = 280

        val x2 = 289
        val y2 = -64
        val z2 = 333

        val copy = WorldEditCopy()
        copy.copy(x1, y1, z1, x2, y2, z2)
    }
    val paste = WorldEditPaste()
        paste.paste()
}

private fun fillWithAir() {
    val x1 = 1000
    val y1 = 256
    val z1 = 1000

    val x2 = 1100
    val y2 = 100
    val z2 = 1100

    val copy = WorldEditCopy()
    copy.copy(x1, y1, z1, x2, y2, z2)
}
