package fiskfille.tfg1.common.transformer;

import java.util.Random;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.Vec3;
import fiskfille.tf.common.motion.TFMotionManager;
import fiskfille.tf.common.transformer.base.TransformerTruck;
import fiskfille.tf.helper.TFVectorHelper;
import fiskfille.tfg1.TFG1;
import fiskfille.tfg1.common.item.TFG1Items;

public class TransformerOptimusPrime extends TransformerTruck
{
    public TransformerOptimusPrime()
    {
        super("G1 Optimus Prime");
    }

    @Override
    public Item getHelmet()
    {
        return TFG1Items.optimusPrimeHelmet;
    }

    @Override
    public Item getChestplate()
    {
        return TFG1Items.optimusPrimeChestplate;
    }

    @Override
    public Item getLeggings()
    {
        return TFG1Items.optimusPrimeLeggings;
    }

    @Override
    public Item getBoots()
    {
        return TFG1Items.optimusPrimeBoots;
    }

    @Override
    public boolean hasStealthForce(EntityPlayer player, int altMode)
    {
        return false;
    }

    @Override
    public void updateMovement(EntityPlayer player, int altMode)
    {
        TFMotionManager.motion(player, 40, 60, 0, 30, false, true, false);
    }

    @Override
    public float getHeightOffset(EntityPlayer player, int altMode)
    {
        return -0.1F;
    }

    @Override
    public float getVehicleHeightOffset(EntityPlayer player, int altMode)
    {
        return -1.25F;
    }

    @Override
    public void doNitroParticles(EntityPlayer player, int altMode)
    {
        Random rand = new Random();

        for (int i = 0; i < 4; ++i)
        {
            Vec3 side = TFVectorHelper.getBackSideCoords(player, 0.225, i < 2, -0.3, false);

            float divider = 10;
            player.worldObj.spawnParticle("smoke", side.xCoord, side.yCoord + 0.825F, side.zCoord, (rand.nextFloat() - 0.5F) / divider, (rand.nextFloat() - 0.5F) / divider + 0.05F, (rand.nextFloat() - 0.5F) / divider);
        }
    }

    @Override
    public String getTransformationSound(int altMode)
    {
        return TFG1.modid + ":transform_" + (altMode == -1 ? "robot" : "vehicle");
    }
}
