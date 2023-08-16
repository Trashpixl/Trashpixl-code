

import org.bukkit.entity.Player
import org.bukkit.plugin.java.JavaPlugin
import com.google.common.io.ByteStreams
fun SendPlayerBetweenServer(server: String, player: Player, plugin: JavaPlugin){
    val connect = ByteStreams.newDataOutput()//create the byte stream
    connect.writeUTF("Connect")//action connect
    connect.writeUTF(server)//to the lobby
    player.sendPluginMessage(plugin, "BungeeCord", connect.toByteArray())//send the player to the location
}