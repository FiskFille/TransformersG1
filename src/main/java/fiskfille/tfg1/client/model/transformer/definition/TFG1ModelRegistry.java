package fiskfille.tfg1.client.model.transformer.definition;

import fiskfille.tf.client.model.transformer.definition.TFModelRegistry;
import fiskfille.tfg1.G1TransformerManager;

public class TFG1ModelRegistry
{
    public static void registerModels()
    {
        TFModelRegistry.registerModel(G1TransformerManager.OPTIMUS_PRIME, new TFModelOptimusPrime());
        TFModelRegistry.registerModel(G1TransformerManager.STARSCREAM, new TFModelStarscream());
    }
}
