package fiskfille.tfg1.common.event;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import fiskfille.tf.common.event.ItemHandlerEvent;
import fiskfille.tf.common.event.ItemStitchEvent;
import fiskfille.tfg1.TFG1;
import fiskfille.tfg1.common.item.TFG1SubItems;
import fiskfille.tfg1.common.recipe.TFG1Recipes;

public class CommonEventHandler
{
    @SubscribeEvent(priority = EventPriority.LOW)
    public void onItemHandlerInit(ItemHandlerEvent.Init event)
    {
        event.registerItemHandler(TFG1.modid, TFG1SubItems.class);
    }

    @SubscribeEvent(priority = EventPriority.LOW)
    public void onItemStitchPost(ItemStitchEvent.Post event)
    {
        TFG1Recipes.register();
    }
}
