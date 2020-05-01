package com.heroisks.enthiarn.objects.items;

import java.util.List;

import com.heroisks.enthiarn.util.helpers.KeyboardHelper;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class SpecialItem extends Item
{

	public SpecialItem(Properties properties) {
		super(properties);
	}
	
	@Override
	public boolean hasEffect(ItemStack stack) {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		// TODO Auto-generated method stub
		if(KeyboardHelper.isHoldingShift()) {
			tooltip.add(new StringTextComponent("What do you have to say,"));
			tooltip.add(new StringTextComponent("About our new love?"));
		} else {
			tooltip.add(new StringTextComponent("Don't let go."));
		}
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		// TODO Auto-generated method stub
		playerIn.jump();
		playerIn.removePotionEffect(Effects.SLOWNESS);
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}



	@Override
	public boolean onDroppedByPlayer(ItemStack item, PlayerEntity player) {
		// TODO Auto-generated method stub
		player.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 5000, 255));
		return super.onDroppedByPlayer(item, player);
	}
	




















}
