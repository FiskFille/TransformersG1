package fiskfille.tfg1.common.item.armor;

import fiskfille.tf.common.item.TFItems;
import fiskfille.tf.common.item.armor.ItemTransformerArmor;
import fiskfille.tf.common.transformer.base.Transformer;
import fiskfille.tfg1.G1TransformerManager;

public class ItemStarscreamArmor extends ItemTransformerArmor
{
    public ItemStarscreamArmor(int armorPiece)
    {
        super(TFItems.TRANSFORMERMATERIAL, 4, armorPiece);
    }

    @Override
    public Transformer getTransformer()
    {
        return G1TransformerManager.STARSCREAM;
    }
}
