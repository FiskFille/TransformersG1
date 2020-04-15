package fiskfille.tfg1.common.proxy;

import net.minecraftforge.client.MinecraftForgeClient;
import fiskfille.tf.client.render.item.RenderItemArmor;
import fiskfille.tf.common.item.armor.ItemTransformerArmor;
import fiskfille.tfg1.client.model.transformer.definition.TFG1ModelRegistry;
import fiskfille.tfg1.common.event.ClientEventHandler;
import fiskfille.tfg1.common.item.TFG1Items;

public class ClientProxy extends CommonProxy
{
    @Override
    public void preInit()
    {
        super.preInit();
        registerEventHandler(new ClientEventHandler());
    }

    @Override
    public void init()
    {
        super.init();
        TFG1ModelRegistry.registerModels();

        registerArmorRenderer(TFG1Items.optimusPrimeHelmet, TFG1Items.optimusPrimeChestplate, TFG1Items.optimusPrimeLeggings, TFG1Items.optimusPrimeBoots);
        registerArmorRenderer(TFG1Items.starscreamHelmet, TFG1Items.starscreamChestplate, TFG1Items.starscreamLeggings, TFG1Items.starscreamBoots);
    }

    public void registerArmorRenderer(ItemTransformerArmor helmet, ItemTransformerArmor chest, ItemTransformerArmor legs, ItemTransformerArmor boots)
    {
        MinecraftForgeClient.registerItemRenderer(helmet, new RenderItemArmor(helmet.getTransformer(), 0));
        MinecraftForgeClient.registerItemRenderer(chest, new RenderItemArmor(chest.getTransformer(), 1));
        MinecraftForgeClient.registerItemRenderer(legs, new RenderItemArmor(legs.getTransformer(), 2));
        MinecraftForgeClient.registerItemRenderer(boots, new RenderItemArmor(boots.getTransformer(), 3));
    }
}
