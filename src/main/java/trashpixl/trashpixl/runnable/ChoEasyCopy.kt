import org.bukkit.Bukkit
import org.bukkit.Location
import org.bukkit.Material
import org.bukkit.block.Block
import org.bukkit.block.data.Directional


fun ChoEasyCopy(x1: Int, y1: Int, z1: Int, x2: Int, y2: Int, z2: Int) {
    val xBuildSite = -50.0
    val yBuildSite = -64.0
    val zBuildSite = -50.0

   
    val w = Bukkit.getServer().getWorld("world")!!

    for (xCount in minOf(x1, x2)..maxOf(x1, x2)) {
        for (yCount in minOf(y1, y2)..maxOf(y1, y2)) {
            for (zCount in minOf(z1, z2)..maxOf(z1, z2)) {
                val placeToPutTheBlock = Location(w, xBuildSite + xCount - x1, yBuildSite + yCount - y1, zBuildSite + zCount - z1)
                val placeToGetTheBlock = Location(w, xCount.toDouble(), yCount.toDouble(), zCount.toDouble())

                val sourceBlock = w.getBlockAt(placeToGetTheBlock)
                val sourceType = sourceBlock.type

                val destinationBlock = w.getBlockAt(placeToPutTheBlock)
                destinationBlock.type = sourceType

                if (sourceType == Material.OAK_DOOR || sourceType == Material.SPRUCE_DOOR ||
                    sourceType == Material.BIRCH_DOOR || sourceType == Material.JUNGLE_DOOR ||
                    sourceType == Material.ACACIA_DOOR || sourceType == Material.DARK_OAK_DOOR ||
                    sourceType == Material.IRON_DOOR) {
                    // Handle doors (requires casting to Directional for orientation)
                    if (sourceBlock.blockData is Directional && destinationBlock.blockData is Directional) {
                        val sourceDoorData = sourceBlock.blockData as Directional
                        val destDoorData = destinationBlock.blockData as Directional

                        destDoorData.facing = sourceDoorData.facing
                        destinationBlock.blockData = destDoorData
                    }
                } else if (sourceType == Material.WALL_TORCH || sourceType == Material.TORCH) {
                    // Handle torches (requires casting to Directional for orientation)
                    if (sourceBlock.blockData is Directional && destinationBlock.blockData is Directional) {
                        val sourceTorchData = sourceBlock.blockData as Directional
                        val destTorchData = destinationBlock.blockData as Directional

                        destTorchData.facing = sourceTorchData.facing
                        destinationBlock.blockData = destTorchData
                    }
                }
                // Add similar checks for other block types with specific properties

                // Update the block state to apply the changes
                destinationBlock.state.update(true)
            }
            }
        }
    }
