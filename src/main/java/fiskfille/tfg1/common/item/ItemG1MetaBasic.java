package fiskfille.tfg1.common.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.StatCollector;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fiskfille.tfg1.TFG1;

public class ItemG1MetaBasic extends Item
{
    @SideOnly(Side.CLIENT)
    private IIcon[] icons;
    private final String[] itemNames;

    public ItemG1MetaBasic(String... itemNames)
    {
        super();
        this.itemNames = itemNames;
        setHasSubtypes(true);
    }

    @Override
    public void getSubItems(Item item, CreativeTabs tab, List subItems)
    {
        for (int i = 0; i < itemNames.length; ++i)
        {
            subItems.add(new ItemStack(this, 1, i));
        }
    }

    @Override
    public String getItemStackDisplayName(ItemStack stack)
    {
        int itemDamage = stack.getItemDamage();
        return StatCollector.translateToLocal(itemNames[itemDamage > itemNames.length ? itemNames.length : itemDamage]);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(int par1)
    {
        return icons[par1 > itemNames.length ? itemNames.length : par1];
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        icons = new IIcon[itemNames.length];

        for (int i = 0; i < itemNames.length; ++i)
        {
            icons[i] = iconRegister.registerIcon(TFG1.modid + ":" + itemNames[i].toLowerCase().replaceAll(" ", "_").replaceAll("'", ""));
        }
    }
}
