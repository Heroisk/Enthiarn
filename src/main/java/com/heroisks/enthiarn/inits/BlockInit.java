package com.heroisks.enthiarn.inits;

import com.heroisks.enthiarn.Enthiarn;
import com.heroisks.enthiarn.Enthiarn.EnthiarnItemGroup;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(Enthiarn.MOD_ID)
@Mod.EventBusSubscriber(modid = Enthiarn.MOD_ID, bus = Bus.MOD)
public class BlockInit {

	public static final Block tellcanium_ore = null;
	
	@SubscribeEvent
	public static void registerBlock(final RegistryEvent.Register<Block> event)
	{
		event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.7f, 50.0f).sound(SoundType.METAL)).setRegistryName("tellcanium_ore"));
	}
	
	@SubscribeEvent
	public static void registerBlockItems(final RegistryEvent.Register<Item> event)
	{
		event.getRegistry().register(new BlockItem(tellcanium_ore, new Item.Properties().group(EnthiarnItemGroup.instance)).setRegistryName("tellcanium_ore"));
	}
	
}
