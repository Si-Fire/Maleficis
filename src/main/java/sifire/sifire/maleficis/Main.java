package sifire.sifire.maleficis;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import sifire.sifire.maleficis.proxy.CommonProxy;
import sifire.sifire.maleficis.util.Reference;

@Mod(modid = Main.MOD_ID, name = Main.NAME, version = Main.VERSION)
public class Main {
	
	public static final String MOD_ID = "maleficis";
	public static final String NAME = "Maleficis";
	public static final String VERSION = "0.0.1";
	public static final String ACCEPTED_VERSIONS = "(1.12.2)";
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = "sifire.sifire.maleficis.proxy.ClientProxy", serverSide = "sifire.sifire.maleficis.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		System.out.println(NAME + " is loading.");
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event)
	{
		
	}
}



	