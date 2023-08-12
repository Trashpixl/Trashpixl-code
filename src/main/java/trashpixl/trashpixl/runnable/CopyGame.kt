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
    for(p in Bukkit.getOnlinePlayers()){
        p.sendMessage("qwertyuiop")
    }
    fillWithAir()
    val xTo = -50.0
    val yTo = -64.0
    val zTo = -50.0
    val vectorTo = BlockVector3.at(xTo, yTo, zTo)

    if(game == "tnt"){
        val x1 = 282.0
        val y1 = -32.0
        val z1 = 279.0

        val x2 = 245.0
        val y2 = -64.0
        val z2 = 245.0
        val vector1 = BlockVector3.at(x1, y1, z1)
        val vector2 = BlockVector3.at(x2, y2, z2)
        

        copyRegion(vector1, vector2, vector1, vectorTo)

    }
    if(game == "tag"){
        val x1 = 288.0
        val y1 = -32.0
        val z1 = 339.0

        val x2 = 400.0
        val y2 = -64.0
        val z2 = 400.0
        val vector1 = BlockVector3.at(x1, y1, z1)
        val vector2 = BlockVector3.at(x2, y2, z2)

        copyRegion(vector1, vector2, vector1, vectorTo)

    }
    if(game == "searchAndFind"){
        val x1 = 288.0
        val y1 = -32.0
        val z1 = 339.0

        val x2 = 400.0
        val y2 = -64.0
        val z2 = 400.0
        val vector1 = BlockVector3.at(x1, y1, z1)
        val vector2 = BlockVector3.at(x2, y2, z2)

        copyRegion(vector1, vector2, vector1, vectorTo)

    }
    if(game == "hideAndSeek"){
        val x1 = 288.0
        val y1 = -32.0
        val z1 = 339.0

        val x2 = 400.0
        val y2 = -64.0
        val z2 = 400.0
        val vector1 = BlockVector3.at(x1, y1, z1)
        val vector2 = BlockVector3.at(x2, y2, z2)

        copyRegion(vector1, vector2, vector1, vectorTo)

    }
    if(game == "pvpSumo"){
        val x1 = 245.0
        val y1 = -32.0
        val z1 = 280.0

        val x2 = 195.0
        val y2 = -64.0
        val z2 = 220.0
        val vector1 = BlockVector3.at(x1, y1, z1)
        val vector2 = BlockVector3.at(x2, y2, z2)

        copyRegion(vector1, vector2, vector1, vectorTo)

    }
    if(game.equals("pvp")){
        for(p in Bukkit.getOnlinePlayers()){
            p.sendMessage("skdlj")
        }
        val x1 = 245.0
        val y1 = -32.0
        val z1 = 280.0

        val x2 = 195.0
        val y2 = -64.0
        val z2 = 220.0
        val vector1 = BlockVector3.at(x1, y1, z1)
        val vector2 = BlockVector3.at(x2, y2, z2)

        copyRegion(vector1, vector2, vector1, vectorTo)

    }
    if(game == "parkour"){
        val x1 = 227.0
        val y1 = -32.0
        val z1 = 280.0

        val x2 = 127.0
        val y2 = -64.0
        val z2 = 320.0
        val vector1 = BlockVector3.at(x1, y1, z1)
        val vector2 = BlockVector3.at(x2, y2, z2)

        copyRegion(vector1, vector2, vector1, vectorTo)

    }
    if(game == "pvpBow"){
        val x1 = 245.0
        val y1 = -32.0
        val z1 = 280.0

        val x2 = 195.0
        val y2 = -64.0
        val z2 = 220.0
        val vector1 = BlockVector3.at(x1, y1, z1)
        val vector2 = BlockVector3.at(x2, y2, z2)

        copyRegion(vector1, vector2, vector1, vectorTo)

    }
    if(game == "pvpKnockBack"){
        val x1 = 245.0
        val y1 = -32.0
        val z1 = 280.0

        val x2 = 195.0
        val y2 = -64.0
        val z2 = 220.0

        val vector1 = BlockVector3.at(x1, y1, z1)
        val vector2 = BlockVector3.at(x2, y2, z2)

        copyRegion(vector1, vector2, vector1, vectorTo)
    }
    if(game == "pvpLoot"){
        val x1 = 118.0
        val y1 = -32.0
        val z1 = 280.0

        val x2 = 138.0
        val y2 = -64.0
        val z2 = 259.0
        val vector1 = BlockVector3.at(x1, y1, z1)
        val vector2 = BlockVector3.at(x2, y2, z2)

        copyRegion(vector1, vector2, vector1, vectorTo)

    }
    if(game == "DodgeBall"){
        val x1 = 343.0
        val y1 = -32.0
        val z1 = 282.0

        val x2 = 292.0
        val y2 = -64.0
        val z2 = 333.0
        val vector1 = BlockVector3.at(x1, y1, z1)
        val vector2 = BlockVector3.at(x2, y2, z2)

        copyRegion(vector1, vector2, vector1, vectorTo)

    }
    if(game == "button4"){
        val x1 = 181.0
        val y1 = -32.0
        val z1 = 263.0

        val x2 = 195.0
        val y2 = -64.0
        val z2 = 280.0
        val vector1 = BlockVector3.at(x1, y1, z1)
        val vector2 = BlockVector3.at(x2, y2, z2)

        copyRegion(vector1, vector2, vector1, vectorTo)

    }
    if(game == "bridgeRace"){
        val x1 = 180.0
        val y1 = -64.0
        val z1 = 259.0

        val x2 = 138.0
        val y2 = -32.0
        val z2 = 280.0
        val vector1 = BlockVector3.at(x1, y1, z1)
        val vector2 = BlockVector3.at(x2, y2, z2)

        copyRegion(vector1, vector2, vector1, vectorTo)

    }
    if(game == "camelFight"){
        val x1 = 128.0
        val y1 = -31.0
        val z1 = 240.0

        val x2 = 195.0
        val y2 = -64.0
        val z2 = 152.0
        val vector1 = BlockVector3.at(x1, y1, z1)
        val vector2 = BlockVector3.at(x2, y2, z2)

        copyRegion(vector1, vector2, vector1, vectorTo)

    }
    if(game == "Labi"){
        val x1 = 227.0
        val y1 = -31.0
        val z1 = 280.0

        val x2 = 289.0
        val y2 = -64.0
        val z2 = 333.0
        val vector1 = BlockVector3.at(x1, y1, z1)
        val vector2 = BlockVector3.at(x2, y2, z2)

        copyRegion(vector1, vector2, vector1, vectorTo)

    }
}
private fun copyRegion(min: BlockVector3?, max: BlockVector3?, from: BlockVector3?, to: BlockVector3?) {
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
private fun fillWithAir(){
    val x1 = 1000.0
    val y1 = 256.0
    val z1 = 1000.0

    val x2 = 1100.0
    val y2 = 100.0
    val z2 = 1100.0
    val vector1 = BlockVector3.at(x1, y1, z1)
    val vector2 = BlockVector3.at(x2, y2, z2)

    copyRegion(vector1, vector2, vector1, vector2)

}

