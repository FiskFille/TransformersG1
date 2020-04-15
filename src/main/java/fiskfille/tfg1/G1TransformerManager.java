package fiskfille.tfg1;

import fiskfille.tf.TransformersAPI;
import fiskfille.tf.common.transformer.base.Transformer;
import fiskfille.tfg1.common.transformer.TransformerOptimusPrime;
import fiskfille.tfg1.common.transformer.TransformerStarscream;

public class G1TransformerManager
{
    public static final Transformer OPTIMUS_PRIME = new TransformerOptimusPrime();
    public static final Transformer STARSCREAM = new TransformerStarscream();

    public static void register()
    {
        TransformersAPI.registerTransformer(OPTIMUS_PRIME);
        TransformersAPI.registerTransformer(STARSCREAM);
    }
}
