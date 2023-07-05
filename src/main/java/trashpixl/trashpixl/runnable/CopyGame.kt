package trashpixl.trashpixl.runnable



import com.sk89q.worldedit.WorldEdit
import com.sk89q.worldedit.WorldEditException
import com.sk89q.worldedit.bukkit.BukkitAdapter
import com.sk89q.worldedit.function.operation.ForwardExtentCopy
import com.sk89q.worldedit.function.operation.Operations
import com.sk89q.worldedit.math.BlockVector3
import com.sk89q.worldedit.regions.CuboidRegion
import org.bukkit.Bukkit


fun copyGame(game: String){
    val xFrom = 0.0
    val yFrom = 0.0
    val zFrom = 0.0

    val xTo = 0.0
    val yTo = 0.0
    val zTo = 0.0
    val vectorFrom = BlockVector3.at(xFrom, yFrom, zFrom)
    val vectorTo = BlockVector3.at(xTo, yTo, zTo)

    if(game == "tnt"){
        val x1 = 0.0
        val y1 = 0.0
        val z1 = 0.0

        val x2 = 0.0
        val y2 = 0.0
        val z2 = 0.0
        val vector1 = BlockVector3.at(x1, y1, z1)
        val vector2 = BlockVector3.at(x2, y2, z2)

        copyRegion(vector1, vector2, vectorFrom, vectorTo)

    }
    if(game == "tag"){
        val x1 = 0.0
        val y1 = 0.0
        val z1 = 0.0

        val x2 = 0.0
        val y2 = 0.0
        val z2 = 0.0
        val vector1 = BlockVector3.at(x1, y1, z1)
        val vector2 = BlockVector3.at(x2, y2, z2)

        copyRegion(vector1, vector2, vectorFrom, vectorTo)

    }
    if(game == "searchAndFind"){
        val x1 = 0.0
        val y1 = 0.0
        val z1 = 0.0

        val x2 = 0.0
        val y2 = 0.0
        val z2 = 0.0
        val vector1 = BlockVector3.at(x1, y1, z1)
        val vector2 = BlockVector3.at(x2, y2, z2)

        copyRegion(vector1, vector2, vectorFrom, vectorTo)

    }
    if(game == "hideAndSeek"){
        val x1 = 0.0
        val y1 = 0.0
        val z1 = 0.0

        val x2 = 0.0
        val y2 = 0.0
        val z2 = 0.0
        val vector1 = BlockVector3.at(x1, y1, z1)
        val vector2 = BlockVector3.at(x2, y2, z2)

        copyRegion(vector1, vector2, vectorFrom, vectorTo)

    }
    if(game == "pvpSumo"){
        val x1 = 0.0
        val y1 = 0.0
        val z1 = 0.0

        val x2 = 0.0
        val y2 = 0.0
        val z2 = 0.0
        val vector1 = BlockVector3.at(x1, y1, z1)
        val vector2 = BlockVector3.at(x2, y2, z2)

        copyRegion(vector1, vector2, vectorFrom, vectorTo)

    }
    if(game == "pvp"){
        val x1 = 0.0
        val y1 = 0.0
        val z1 = 0.0

        val x2 = 0.0
        val y2 = 0.0
        val z2 = 0.0
        val vector1 = BlockVector3.at(x1, y1, z1)
        val vector2 = BlockVector3.at(x2, y2, z2)

        copyRegion(vector1, vector2, vectorFrom, vectorTo)

    }
    if(game == "parkour"){
        val x1 = 0.0
        val y1 = 0.0
        val z1 = 0.0

        val x2 = 0.0
        val y2 = 0.0
        val z2 = 0.0
        val vector1 = BlockVector3.at(x1, y1, z1)
        val vector2 = BlockVector3.at(x2, y2, z2)

        copyRegion(vector1, vector2, vectorFrom, vectorTo)

    }
    if(game == "pvpBow"){
        val x1 = 0.0
        val y1 = 0.0
        val z1 = 0.0

        val x2 = 0.0
        val y2 = 0.0
        val z2 = 0.0
        val vector1 = BlockVector3.at(x1, y1, z1)
        val vector2 = BlockVector3.at(x2, y2, z2)

        copyRegion(vector1, vector2, vectorFrom, vectorTo)

    }
    if(game == "pvpKnockBack"){
        val x1 = 0.0
        val y1 = 0.0
        val z1 = 0.0

        val x2 = 0.0
        val y2 = 0.0
        val z2 = 0.0

        val vector1 = BlockVector3.at(x1, y1, z1)
        val vector2 = BlockVector3.at(x2, y2, z2)

        copyRegion(vector1, vector2, vectorFrom, vectorTo)
    }
    if(game == "pvpLoot"){
        val x1 = 0.0
        val y1 = 0.0
        val z1 = 0.0

        val x2 = 0.0
        val y2 = 0.0
        val z2 = 0.0
        val vector1 = BlockVector3.at(x1, y1, z1)
        val vector2 = BlockVector3.at(x2, y2, z2)

        copyRegion(vector1, vector2, vectorFrom, vectorTo)

    }
    if(game == "DodgeBall"){
        val x1 = 0.0
        val y1 = 0.0
        val z1 = 0.0

        val x2 = 0.0
        val y2 = 0.0
        val z2 = 0.0
        val vector1 = BlockVector3.at(x1, y1, z1)
        val vector2 = BlockVector3.at(x2, y2, z2)

        copyRegion(vector1, vector2, vectorFrom, vectorTo)

    }
    if(game == "button4"){
        val x1 = 0.0
        val y1 = 0.0
        val z1 = 0.0

        val x2 = 0.0
        val y2 = 0.0
        val z2 = 0.0
        val vector1 = BlockVector3.at(x1, y1, z1)
        val vector2 = BlockVector3.at(x2, y2, z2)

        copyRegion(vector1, vector2, vectorFrom, vectorTo)

    }
    if(game == "bridgeRace"){
        val x1 = 0.0
        val y1 = 0.0
        val z1 = 0.0

        val x2 = 0.0
        val y2 = 0.0
        val z2 = 0.0
        val vector1 = BlockVector3.at(x1, y1, z1)
        val vector2 = BlockVector3.at(x2, y2, z2)

        copyRegion(vector1, vector2, vectorFrom, vectorTo)

    }
}
fun copyRegion(min: BlockVector3?, max: BlockVector3?, from: BlockVector3?, to: BlockVector3?) {
    val world = BukkitAdapter.adapt(Bukkit.getWorld("world"))
    val region = CuboidRegion(min, max)
    val editSession = WorldEdit.getInstance().newEditSessionBuilder().world(world).maxBlocks(-1).build()
    val forwardExtentCopy = ForwardExtentCopy(
            world, region, from, editSession, to
    )
    try {
        Operations.complete(forwardExtentCopy)
    } catch (e: WorldEditException) {
        throw RuntimeException(e)
    }
}

