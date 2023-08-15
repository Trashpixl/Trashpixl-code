package trashpixl.trashpixl.runnable;

import java.io.File;
import java.io.FileInputStream;

import org.bukkit.Bukkit;

import com.sk89q.worldedit.EditSession;
import com.sk89q.worldedit.WorldEdit;
import com.sk89q.worldedit.bukkit.BukkitWorld;
import com.sk89q.worldedit.extent.clipboard.Clipboard;
import com.sk89q.worldedit.extent.clipboard.io.ClipboardFormat;
import com.sk89q.worldedit.extent.clipboard.io.ClipboardFormats;
import com.sk89q.worldedit.extent.clipboard.io.ClipboardReader;
import com.sk89q.worldedit.function.operation.Operation;
import com.sk89q.worldedit.function.operation.Operations;
import com.sk89q.worldedit.math.BlockVector3;
import com.sk89q.worldedit.session.ClipboardHolder;

public class Paste {
    public void bob() {
    BukkitWorld weWorld = new BukkitWorld(Bukkit.getWorld("world"));
       Clipboard clipboard;
       File file = new File("pencil.schem");
       
       ClipboardFormat format = ClipboardFormats.findByFile(file);
       try (ClipboardReader reader = format.getReader(new FileInputStream(file))) {
           clipboard = reader.read();
           
           try (EditSession editSession = WorldEdit.getInstance().newEditSession(weWorld)) {
               Operation operation = new ClipboardHolder(clipboard)
                       .createPaste(editSession)
                       .to(BlockVector3.at(0, 0, 0))
                       // configure here
                       .build();
               Operations.complete(operation);
           }
       } catch (Exception e) {
           e.printStackTrace();
          
       } 
    }
}
