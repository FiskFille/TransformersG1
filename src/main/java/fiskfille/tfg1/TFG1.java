package fiskfille.tfg1;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import fiskfille.tfg1.common.proxy.CommonProxy;

@Mod(modid = TFG1.modid, name = TFG1.name, version = TFG1.version, dependencies = "required-after:transformers@[0.6.2,)")
public class TFG1
{
    public static final String modid = "transformersg1";
    public static final String name = "Transformers Mod: G1 Edition";
    public static final String version = "${version}";

    @SidedProxy(clientSide = "fiskfille.tfg1.common.proxy.ClientProxy", serverSide = "fiskfille.tfg1.common.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Instance(TFG1.modid)
    public static TFG1 instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init();
    }
}
