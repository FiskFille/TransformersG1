package fiskfille.tfg1.common.packet;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import fiskfille.tfg1.TFG1;

public class TFG1NetworkManager
{
    public static SimpleNetworkWrapper networkWrapper;

    public static void registerPackets()
    {
        networkWrapper = NetworkRegistry.INSTANCE.newSimpleChannel(TFG1.modid);
    }
}
