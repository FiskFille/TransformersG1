package fiskfille.tfg1.client.model.transformer.definition;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import fiskfille.tf.client.model.tools.ModelRendererTF;
import fiskfille.tf.client.model.transformer.ModelTransformerBase;
import fiskfille.tf.client.model.transformer.definition.TransformerModel;
import fiskfille.tf.client.model.transformer.vehicle.ModelVehicleBase;
import fiskfille.tfg1.TFG1;
import fiskfille.tfg1.client.model.transformer.ModelOptimusPrime;
import fiskfille.tfg1.client.model.transformer.ModelOptimusPrimeVehicle;

public class TFModelOptimusPrime extends TransformerModel
{
    private ModelOptimusPrime model;
    private ModelOptimusPrime modelItem;
    private ModelOptimusPrimeVehicle vehicle;

    public TFModelOptimusPrime()
    {
        model = new ModelOptimusPrime();
        modelItem = new ModelOptimusPrime();
        vehicle = new ModelOptimusPrimeVehicle();
    }

    @Override
    public ModelTransformerBase getMainModel()
    {
        return model;
    }

    @Override
    public ModelVehicleBase getVehicleModel()
    {
        return vehicle;
    }

    @Override
    public ModelRendererTF[] getFeet()
    {
        return new ModelRendererTF[] {model.footBase1, model.footBase2};
    }

    @Override
    public ModelRendererTF[] getLegs()
    {
        return new ModelRendererTF[] {model.upperLeg1, model.upperLeg2};
    }

    @Override
    public ModelRendererTF getLowerArm()
    {
        return model.lowerArm1;
    }

    @Override
    public ModelRendererTF getUpperArm()
    {
        return model.upperArm1;
    }

    @Override
    public ModelRendererTF getBody()
    {
        return model.torso;
    }

    @Override
    public ModelRendererTF getHead()
    {
        return model.neck;
    }

    @Override
    public float getFootHeight()
    {
        return 0.25F;
    }

    @Override
    public void renderItem(EntityPlayer player, ItemStack stack)
    {
        GL11.glTranslatef(0.1F, -0.05F, 0.05F);
    }

    @Override
    public void renderCape(EntityPlayer player)
    {
        GL11.glTranslatef(0.18F, 0F, -0.01F);
    }

    @Override
    public void renderFirstPersonArm(EntityPlayer player)
    {
        GL11.glTranslatef(0.0F, -0.05F, 0.15F);
    }

    @Override
    public ResourceLocation getTexture(Entity entity, String suffix)
    {
        return new ResourceLocation(TFG1.modid, String.format("textures/models/optimus/optimus_prime%s.png", suffix));
    }

    @Override
    public ModelTransformerBase getItemInventoryModel()
    {
        return modelItem;
    }
}
