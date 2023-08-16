import org.bukkit.Bukkit
import org.bukkit.Location

fun ChoEasyCopy(x1:Int, y1:Int, z1:Int, x2:Int, y2:Int, z2:Int){
    val xBuildSite = -50
    val yBuildSite = -64
    val zBuildSite = -50

    var xBuildCount = xBuildSite
    var yBuildCount = yBuildSite
    var zBuildCount = zBuildSite

    val w = Bukkit.getServer().getWorld("world")!!

    if(x1 < x2){
       for(xCount in x1..x2){
        xBuildCount++
        yBuildCount = yBuildSite
        if(y1 < y2){
            for(yCount in y1..y2){
                yBuildCount++
                zBuildCount = zBuildSite
                if(z1 < z2){
                    for(zCount in z1..z2){
                        zBuildCount++
                        val placeToPutTheBlock = Location(w, xBuildCount.toDouble(), yBuildCount.toDouble(), zBuildCount.toDouble())
                        val placeToGetTheBlock = Location(w, xCount.toDouble(), yCount.toDouble(), zCount.toDouble())
                        w.getBlockAt(placeToPutTheBlock).type = w.getBlockAt(placeToGetTheBlock).type
                    }
                }
                if(z1 > z2){
                    for(zCount in z2..z1){
                       zBuildCount++
                       val placeToPutTheBlock = Location(w, xBuildCount.toDouble(), yBuildCount.toDouble(), zBuildCount.toDouble())
                        val placeToGetTheBlock = Location(w, xCount.toDouble(), yCount.toDouble(), zCount.toDouble())
                        w.getBlockAt(placeToPutTheBlock).type = w.getBlockAt(placeToGetTheBlock).type
                    }
                }
            }
        }
        if(y1 > y2){
            for(yCount in y2..y1){
                yBuildCount++
                zBuildCount = zBuildSite
                if(z1 < z2){
                    for(zCount in z1..z2){
                        zBuildCount++
                        val placeToPutTheBlock = Location(w, xBuildCount.toDouble(), yBuildCount.toDouble(), zBuildCount.toDouble())
                        val placeToGetTheBlock = Location(w, xCount.toDouble(), yCount.toDouble(), zCount.toDouble())
                        w.getBlockAt(placeToPutTheBlock).type = w.getBlockAt(placeToGetTheBlock).type
                    }
                }
                if(z1 > z2){
                    for(zCount in z2..z1){
                        zBuildCount++
                        val placeToPutTheBlock = Location(w, xBuildCount.toDouble(), yBuildCount.toDouble(), zBuildCount.toDouble())
                        val placeToGetTheBlock = Location(w, xCount.toDouble(), yCount.toDouble(), zCount.toDouble())
                        w.getBlockAt(placeToPutTheBlock).type = w.getBlockAt(placeToGetTheBlock).type
                    }
                }
            }
        }
    } 
}
    if(x1 > x2){
        for(xCount in x2..x1){
            xBuildCount++
            yBuildCount = yBuildSite
            if(y1 < y2){
                for(yCount in y1..y2){
                    yBuildCount++
                    zBuildCount = zBuildSite
                    if(z1 < z2){
                        for(zCount in z1..z2){
                        
                        }
                    }
                    if(z1 > z2){
                        for(zCount in z2..z1){
                        
                        }
                    }
                }
            }
            if(y1 > y2){
                for(yCount in y2..y1){
                    yBuildCount++
                    zBuildCount = zBuildSite
                    if(z1 < z2){
                        for(zCount in z1..z2){
                            zBuildCount++
                            val placeToPutTheBlock = Location(w, xBuildCount.toDouble(), yBuildCount.toDouble(), zBuildCount.toDouble())
                            val placeToGetTheBlock = Location(w, xCount.toDouble(), yCount.toDouble(), zCount.toDouble())
                            w.getBlockAt(placeToPutTheBlock).type = w.getBlockAt(placeToGetTheBlock).type
                        }
                    }
                    if(z1 > z2){
                        for(zCount in z2..z1){
                            zBuildCount++
                            val placeToPutTheBlock = Location(w, xBuildCount.toDouble(), yBuildCount.toDouble(), zBuildCount.toDouble())
                            val placeToGetTheBlock = Location(w, xCount.toDouble(), yCount.toDouble(), zCount.toDouble())
                            w.getBlockAt(placeToPutTheBlock).type = w.getBlockAt(placeToGetTheBlock).type
                        }
                    }
                }
            }
        }
    }
}
