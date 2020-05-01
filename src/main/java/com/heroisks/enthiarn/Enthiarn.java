package com.heroisks.enthiarn;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.heroisks.enthiarn.inits.ItemInit;
import com.heroisks.enthiarn.inits.ModEntityTypes;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("enthiarn")


public class Enthiarn
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "enthiarn";
    public static Enthiarn instance;

    public Enthiarn() {
    	final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    	modEventBus.addListener(this::setup);
    	modEventBus.addListener(this::doClientStuff);
        instance = this;
        
        
        ModEntityTypes.ENTITY_TYPES.register(modEventBus);
        
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        
    }

   
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {

    }
    
    public static class EnthiarnItemGroup extends ItemGroup
    {
    	public static final EnthiarnItemGroup instance = new EnthiarnItemGroup(ItemGroup.GROUPS.length, "Enthiarn Tab");
    	private EnthiarnItemGroup(int index, String label)
    	{
    		super(index, label);
    	}
    	@Override
    	public ItemStack createIcon() {
    		return new ItemStack(ItemInit.enthiarn_orb);
    	}
    }


}
