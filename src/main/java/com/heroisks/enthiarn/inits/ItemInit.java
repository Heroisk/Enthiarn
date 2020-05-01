package com.heroisks.enthiarn.inits;

import java.util.function.Supplier;

import com.heroisks.enthiarn.Enthiarn;
import com.heroisks.enthiarn.Enthiarn.EnthiarnItemGroup;
import com.heroisks.enthiarn.objects.items.SpecialItem;

import net.minecraft.item.Food;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.LazyValue;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;


@Mod.EventBusSubscriber(modid = Enthiarn.MOD_ID, bus = Bus.MOD)
@ObjectHolder(Enthiarn.MOD_ID)
public class ItemInit {
	public static final Item enthiarn_orb = null;
	public static final Item enthiarn_tablet_001 = null;
	public static final Item special_item = null;
	
	// food
	public static final Item enthiarn_cookie = null;
	public static final Item enthiarn_burnt_cookie = null;
	public static final Item tellcanium_ingot = null;
	
	// tools
	public static final Item tellcanium_sword = null;
	
	@SubscribeEvent
	public static void registarItems(final RegistryEvent.Register<Item> event) {
	// untitled
		event.getRegistry().register(new Item(new Item.Properties().group(EnthiarnItemGroup.instance)).setRegistryName("enthiarn_orb"));
		event.getRegistry().register(new Item(new Item.Properties().group(EnthiarnItemGroup.instance)).setRegistryName("enthiarn_tablet_001"));
		
		event.getRegistry().register(new SpecialItem(new Item.Properties().group(EnthiarnItemGroup.instance)).setRegistryName("special_item"));
	// food
		event.getRegistry().register(new Item(new Item.Properties().group(EnthiarnItemGroup.instance).food(new Food.Builder().hunger(10).saturation(10f).effect(new EffectInstance(Effects.BLINDNESS, 6000),1f).build())).setRegistryName("enthiarn_cookie"));
		event.getRegistry().register(new Item(new Item.Properties().group(EnthiarnItemGroup.instance).food(new Food.Builder().hunger(5).saturation(1f).effect(new EffectInstance(Effects.NAUSEA,100), 1f).effect(new EffectInstance(Effects.INSTANT_DAMAGE, 1), 1f).build())).setRegistryName("enthiarn_burnt_cookie"));
		
	// materials
		event.getRegistry().register(new Item(new Item.Properties().group(EnthiarnItemGroup.instance)).setRegistryName("tellcanium_ingot"));
		
		
	// tools
		event.getRegistry().register(new SwordItem(ModItemTier.TELLCANIUM, 7, 3.0f, new Item.Properties().group(EnthiarnItemGroup.instance)).setRegistryName("tellcanium_sword"));
		
	}
	
	// custom Item Tier
	public enum ModItemTier implements IItemTier {
		TELLCANIUM(4, 1500, 15.0F, 7.0F, 250, ()-> {
			return Ingredient.fromItems(ItemInit.tellcanium_ingot);
		});
		
		private final int harvestLevel;
		private final int maxUses;
		private final float efficiency;
		private final float attackDamage;
		private final int enchantability;
		private final LazyValue<Ingredient> repairMaterial;
		
		private ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
			this.harvestLevel = harvestLevel;
			this.maxUses = maxUses;
			this.efficiency = efficiency;
			this.attackDamage = attackDamage;
			this.enchantability = enchantability;
			this.repairMaterial = new LazyValue<>(repairMaterial);
		}

		@Override
		public int getMaxUses() {
			return this.maxUses;
		}

		@Override
		public float getEfficiency() {
			return this.efficiency;
		}

		@Override
		public float getAttackDamage() {
			return this.attackDamage;
		}

		@Override
		public int getHarvestLevel() {
			return this.harvestLevel;
		}

		@Override
		public int getEnchantability() {
			return this.enchantability;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return repairMaterial.getValue();
		}
	}
}
