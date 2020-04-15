package fiskfille.tfg1.common.recipe;

import static fiskfille.tf.common.recipe.Dyes.BLUE;
import static fiskfille.tf.common.recipe.Dyes.DARK_GRAY;
import static fiskfille.tf.common.recipe.Dyes.LIGHT_BLUE;
import static fiskfille.tf.common.recipe.Dyes.ORANGE;
import static fiskfille.tf.common.recipe.Dyes.PURPLE;
import static fiskfille.tf.common.recipe.Dyes.RED;
import static fiskfille.tf.common.recipe.Dyes.SILVER;
import static fiskfille.tf.common.recipe.Dyes.WHITE;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import fiskfille.tf.common.item.TFItems;
import fiskfille.tf.common.item.TFSubItems;
import fiskfille.tf.common.recipe.AssemblyTable;
import fiskfille.tf.common.recipe.Dyes;
import fiskfille.tf.common.recipe.TFRecipes;
import fiskfille.tfg1.common.item.TFG1Items;
import fiskfille.tfg1.common.item.TFG1SubItems;

public class TFG1Recipes extends TFRecipes
{
    public static void register()
    {
//        restore();
        addCraftingComponentRecipes();
        addArmorRecipes();

//        save();
    }

    private static void addCraftingComponentRecipes()
    {
        AssemblyTable.addRecipe(TFG1SubItems.smoke_stack, new Dyes(), "     ", "  I  ", "  I  ", "  I  ", "     ", 'I', Items.iron_ingot);
        AssemblyTable.addRecipe(TFG1SubItems.optimus_primes_gauntlet, new Dyes(RED, 4, BLUE, 1), "   T ", "  TT ", "  TT ", "  T  ", "     ", 'T', TFItems.transformiumAlloy);
        AssemblyTable.addRecipe(TFG1SubItems.optimus_prime_torso_base, new Dyes(RED, 8, SILVER, 3), "     ", "TTGTT", " TTT ", "  T  ", " WTW ", 'T', TFItems.transformiumAlloy, 'W', TFSubItems.wheel, 'G', Dyes.dye(Blocks.stained_glass, LIGHT_BLUE));
        AssemblyTable.addRecipe(TFG1SubItems.optimus_primes_greave, new Dyes(BLUE, 5), "  T  ", "  TTI", "  TTW", "  TTW", "     ", 'T', TFItems.transformiumAlloy, 'I', Items.iron_ingot, 'W', TFSubItems.wheel);

        AssemblyTable.addRecipe(TFG1SubItems.starscreams_wing, new Dyes(WHITE, 5, RED, 2, PURPLE, 1), "     ", "TTTT ", " TTT ", "  TT ", "   T ", 'T', TFItems.transformiumAlloy);
        AssemblyTable.addRecipe(TFG1SubItems.starscreams_shoulder_cover, new Dyes(RED, 4), "   N ", "  NT ", "  NT ", "  NT ", "     ", 'T', TFItems.transformiumAlloy, 'N', TFItems.transformiumAlloyNugget);
        AssemblyTable.addRecipe(TFG1SubItems.starscreams_gauntlet, new Dyes(LIGHT_BLUE, 5), "   T ", "  TT ", "  TT ", "  T  ", "     ", 'T', TFItems.transformiumAlloy);
        AssemblyTable.addRecipe(TFG1SubItems.starscream_torso_base, new Dyes(RED, 7, WHITE, 4), "     ", "TTGTT", " TGT ", "  T  ", " TTT ", 'T', TFItems.transformiumAlloy, 'G', Dyes.dye(Blocks.stained_glass, ORANGE));
        AssemblyTable.addRecipe(TFG1SubItems.starscreams_greave, new Dyes(WHITE, 5, LIGHT_BLUE, 1), "  T  ", "  TT ", "  TT ", "  TJ ", "     ", 'T', TFItems.transformiumAlloy, 'J', TFSubItems.jet_thruster);
    }

    private static void addArmorRecipes()
    {
        AssemblyTable.addRecipe(new ItemStack(TFG1Items.optimusPrimeHelmet), new Dyes(BLUE, 5, SILVER, 1), "     ", " T T ", " THT ", "     ", "     ", 'T', TFItems.transformiumAlloy, 'H', TFSubItems.protoform_head);
        AssemblyTable.addRecipe(new ItemStack(TFG1Items.optimusPrimeChestplate), new Dyes(), "     ", "     ", " SBS ", " G G ", "     ", 'S', TFG1SubItems.smoke_stack, 'B', TFG1SubItems.optimus_prime_torso_base, 'G', TFG1SubItems.optimus_primes_gauntlet);
        AssemblyTable.addRecipe(new ItemStack(TFG1Items.optimusPrimeLeggings), new Dyes(SILVER, 4), "     ", "     ", " R R ", " G G ", "     ", 'R', TFSubItems.transformium_alloy_rod, 'G', TFG1SubItems.optimus_primes_greave);
        AssemblyTable.addRecipe(new ItemStack(TFG1Items.optimusPrimeBoots), new Dyes(BLUE, 3), "     ", "     ", "     ", " TT  ", "     ", 'T', new ItemStack(TFItems.transformiumAlloy, 2));

        AssemblyTable.addRecipe(new ItemStack(TFG1Items.starscreamHelmet), new Dyes(DARK_GRAY, 4, SILVER, 2), "     ", " TTT ", "NTHTN", " T T ", "     ", 'T', TFItems.transformiumAlloy, 'H', TFSubItems.protoform_head, 'N', TFItems.transformiumAlloyNugget);
        AssemblyTable.addRecipe(new ItemStack(TFG1Items.starscreamChestplate), new Dyes(), "     ", " S S ", " WBW ", " G G ", "     ", 'S', TFG1SubItems.starscreams_shoulder_cover, 'W', TFG1SubItems.starscreams_wing, 'B', TFG1SubItems.starscream_torso_base, 'G', TFG1SubItems.starscreams_gauntlet);
        AssemblyTable.addRecipe(new ItemStack(TFG1Items.starscreamLeggings), new Dyes(WHITE, 4), "     ", "     ", " R R ", " G G ", "     ", 'R', TFSubItems.transformium_alloy_rod, 'G', TFG1SubItems.starscreams_greave);
        AssemblyTable.addRecipe(new ItemStack(TFG1Items.starscreamBoots), new Dyes(LIGHT_BLUE, 4, DARK_GRAY, 1), "     ", "     ", "   T ", " TT  ", "     ", 'T', new ItemStack(TFItems.transformiumAlloy, 2));
    }
}
