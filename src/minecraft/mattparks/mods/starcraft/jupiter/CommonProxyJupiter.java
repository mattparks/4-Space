package mattparks.mods.starcraft.jupiter;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.IGuiHandler;

public class CommonProxyJupiter implements IGuiHandler
{
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        return null;
    }

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        TileEntity tile = world.getBlockTileEntity(x, y, z);

        return null;
    }

    public void init(FMLInitializationEvent event)
    {
    	;
    }

    public void postInit(FMLPostInitializationEvent event)
    {
    	;
    }

    public void preInit(FMLPreInitializationEvent event)
    {
    	;
    }

    public void registerRenderInformation()
    {
    	;
    }

    public void spawnParticle(String var1, double var2, double var4, double var6)
    {
        ;
    }
}
