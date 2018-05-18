package sifire.sifire.maleficis.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import sifire.sifire.maleficis.Main;
import sifire.sifire.maleficis.init.ModItems;
import sifire.sifire.maleficis.util.IHasModel;

public class ItemBase extends Item implements IHasModel
{
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.MALEFICISTAB);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
