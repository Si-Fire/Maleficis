package sifire.sifire.maleficis.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import sifire.sifire.maleficis.blocks.BlockBase;

public class ModBlocks 
{
	
	public static final List<Blocks> BLOCKS = new ArrayList<Blocks>();
	
	public static final Block COPPER_BLOCK = new BlockBase("copper_block", Material.IRON);
	
}
