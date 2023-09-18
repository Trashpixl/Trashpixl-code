
package trashpixl.trashpixl.runnable;



import java.io.File;
import java.io.FileOutputStream;
import org.bukkit.Bukkit;


import com.sk89q.worldedit.EditSession;
import com.sk89q.worldedit.WorldEdit;
import com.sk89q.worldedit.bukkit.BukkitWorld;
import com.sk89q.worldedit.extent.clipboard.BlockArrayClipboard;
import com.sk89q.worldedit.extent.clipboard.io.BuiltInClipboardFormat;
import com.sk89q.worldedit.extent.clipboard.io.ClipboardWriter;
import com.sk89q.worldedit.function.operation.ForwardExtentCopy;
import com.sk89q.worldedit.function.operation.Operations;
import com.sk89q.worldedit.math.BlockVector3;
import com.sk89q.worldedit.regions.CuboidRegion;

public class WorldEditCopy{
    public void bob(int x, int y, int z, int x2, int y2, int z2) {
       BukkitWorld weWorld = new BukkitWorld(Bukkit.getWorld("world"));
       try{
           BlockVector3 loc1 = BlockVector3.at(x, y, z);
           BlockVector3 loc2 = BlockVector3.at(x2, y2, z2);

           BlockVector3 min;
           BlockVector3 max;

           if(loc1.getBlockY()<loc2.getBlockY()) {
               min = loc1;
               max = loc2;
           }else {
               min = loc2;
               max = loc1;
           }
           // use min and max now

           CuboidRegion region = new CuboidRegion(weWorld, min, max);
           BlockArrayClipboard clipboard = new BlockArrayClipboard(region);
           EditSession editSession = WorldEdit.getInstance().newEditSession(weWorld);

           ForwardExtentCopy forwardExtentCopy = new ForwardExtentCopy(editSession, region, clipboard, region.getMinimumPoint());

           Operations.complete(forwardExtentCopy);
           //COPIED to clip board
           File file = new File("pencil.schem");
           try (ClipboardWriter writer = BuiltInClipboardFormat.SPONGE_SCHEMATIC.getWriter(new FileOutputStream(file))) {
               writer.write(clipboard);
           }

       }catch(Exception e){
           e.printStackTrace();

       }

    }
}