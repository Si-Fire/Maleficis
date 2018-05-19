package sifire.sifire.maleficis.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import sifire.sifire.maleficis.Main;
import sifire.sifire.maleficis.armour.ArmourBase;
import sifire.sifire.maleficis.items.ItemBase;
import sifire.sifire.maleficis.tools.ToolAxe;
import sifire.sifire.maleficis.tools.ToolHoe;
import sifire.sifire.maleficis.tools.ToolPickaxe;
import sifire.sifire.maleficis.tools.ToolShovel;
import sifire.sifire.maleficis.tools.ToolSword;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial TOOL_TEST = EnumHelper.addToolMaterial("tool_test", 8, 999999999, 10.0F, 10.0F, 10);
	public static final ArmorMaterial ARMOUR_TEST = EnumHelper.addArmorMaterial("armour_test", Main.MOD_ID + ":test", 999999999, new int[]{10, 10, 10, 10}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 10.0F);
	
	//Items
	public static final Item ITEM_TEST = new ItemBase("item_test");
	
	//Tools
	public static final Item TOOL_BOLINE = new ItemBase("tool_boline");
	public static final Item TOOL_ARTHAME = new ItemBase("tool_arthame");
	
	//Armour

	
}
