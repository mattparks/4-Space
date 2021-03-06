package mattparks.mods.starcraft.io;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.FMLLog;

/**
 * This file is part of the 4-Space project
 * 
 * @author mattparks
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class SCIoConfigManager
{
    public static boolean loaded;

    static Configuration configuration;

    // DIMENSIONS
    public static int dimensionIDIo;

    public static boolean generateOtherMods;

    // BLOCKS

    // ITEMS
    public static int idItemIoBasic;
    
    // ARMOR

    // TOOLS

    // ENTITIES

    // GUI

    // SCHEMATIC

    // ACHIEVEMENTS

    // GENERAL
  
    public SCIoConfigManager(File file)
    {
        if (!SCIoConfigManager.loaded)
        {
            SCIoConfigManager.configuration = new Configuration(file);
            this.setDefaultValues();
        }
    }

    private void setDefaultValues()
    {
        try
        {
            SCIoConfigManager.configuration.load();

            SCIoConfigManager.dimensionIDIo = SCIoConfigManager.configuration.get("Dimensions", "Europa Dimension ID", -50).getInt(-50);
        
            SCIoConfigManager.idItemIoBasic = SCIoConfigManager.configuration.get(Configuration.CATEGORY_ITEM, "idItemIoItemBasic", 6759).getInt(6759);
        }
        catch (final Exception e)
        {
            FMLLog.log(Level.SEVERE, e, "Starcraft Io has a problem loading it's configuration");
        }
        finally
        {
            SCIoConfigManager.configuration.save();
            SCIoConfigManager.loaded = true;
        }
    }
}
