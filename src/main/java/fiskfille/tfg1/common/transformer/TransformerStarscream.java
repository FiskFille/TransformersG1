package fiskfille.tfg1.common.transformer;

import net.minecraft.item.Item;
import fiskfille.tf.common.transformer.base.TransformerJet;
import fiskfille.tfg1.TFG1;
import fiskfille.tfg1.common.item.TFG1Items;

public class TransformerStarscream extends TransformerJet
{
    public TransformerStarscream()
    {
        super("G1 Starscream");
    }

    @Override
    public Item getHelmet()
    {
        return TFG1Items.starscreamHelmet;
    }

    @Override
    public Item getChestplate()
    {
        return TFG1Items.starscreamChestplate;
    }

    @Override
    public Item getLeggings()
    {
        return TFG1Items.starscreamLeggings;
    }

    @Override
    public Item getBoots()
    {
        return TFG1Items.starscreamBoots;
    }

    @Override
    public String getTransformationSound(int altMode)
    {
        return TFG1.modid + ":transform_" + (altMode == -1 ? "robot" : "vehicle");
    }
}
