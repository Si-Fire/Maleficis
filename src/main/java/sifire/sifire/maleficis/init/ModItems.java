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
	public static final Item PICKAXE_TEST = new ToolPickaxe("pickaxe_test", TOOL_TEST);

	public static final Item SHOVEL_TEST = new ToolShovel("shovel_test", TOOL_TEST);
	public static final Item HOE_TEST = new ToolHoe("hoe_test", TOOL_TEST);
	public static final Item SWORD_TEST = new ToolSword("sword_test", TOOL_TEST);
	
	//Armour
	public static final Item HELMET_TEST = new ArmourBase("helmet_test", ARMOUR_TEST, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_TEST = new ArmourBase("chestplate_test", ARMOUR_TEST, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_TEST = new ArmourBase("leggings_test", ARMOUR_TEST, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_TEST = new ArmourBase("boots_test", ARMOUR_TEST, 1, EntityEquipmentSlot.FEET);
	
}
