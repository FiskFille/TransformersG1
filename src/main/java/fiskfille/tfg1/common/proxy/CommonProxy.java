package fiskfille.tfg1.common.proxy;

import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLCommonHandler;
import fiskfille.tfg1.G1TransformerManager;
import fiskfille.tfg1.common.event.CommonEventHandler;
import fiskfille.tfg1.common.item.TFG1Items;
import fiskfille.tfg1.common.packet.TFG1NetworkManager;

public class CommonProxy
{
    public void preInit()
    {
        TFG1NetworkManager.registerPackets();
        TFG1Items.register();
        G1TransformerManager.register();

        registerEventHandler(new CommonEventHandler());
    }

    public void init()
    {

    }

    public void registerEventHandler(Object obj)
    {
        MinecraftForge.EVENT_BUS.register(obj);
        FMLCommonHandler.instance().bus().register(obj);
    }
}
