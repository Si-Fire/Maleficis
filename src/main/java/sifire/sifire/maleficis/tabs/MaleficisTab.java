package sifire.sifire.maleficis.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import sifire.sifire.maleficis.init.ModBlocks;
import sifire.sifire.maleficis.init.ModItems;

public class MaleficisTab extends CreativeTabs
{
	public MaleficisTab(String label) {super("maleficistab");
	this.setBackgroundImageName("maleficis.png");}
	public ItemStack getTabIconItem() {return new ItemStack(ModItems.ITEM_TEST);}
}
