package com.Phantom.Ion;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTestBlock extends Block
{
	public BlockTestBlock()
	{
		super(Material.rock);
		setBlockTextureName(Reference.MODID + "TestBlock");
		setCreativeTab(CreativeTabs.tabBlock);
	}

}
