package sifire.sifire.maleficis;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MOD_ID, name = Main.NAME, version = Main.VERSION)
public class Main {
	
	public static final String MOD_ID = "maleficis";
	public static final String NAME = "Maleficis";
	public static final String VERSION = "0.1.0";
	public static final String ACCEPTED_VERSIONS = "(1.12.2)";
	
	@Instance
	public static Main instance;
	
	//public static final CreativeTabs MALEFICISTAB = new MaleficisTab("maleficistab");
	
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