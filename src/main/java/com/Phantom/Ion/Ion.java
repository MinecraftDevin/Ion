package com.Phantom.Ion;

import net.minecraft.init.Blocks;
import net.minecraft.block.Block;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Ion.MODID, version = Ion.VERSION)
public class Ion
{
	public static Block TestBlock;
    public static final String MODID = "Ion";
    public static final String VERSION = "1.0";
    @EventHandler
    public void preIint (FMLPreInitializationEvent event)
    {
    	TestBlock = new BlockTestBlock().setBlockName("TestBlock");
    	RegisterHelper.registerBlock(TestBlock);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	
    }
}
