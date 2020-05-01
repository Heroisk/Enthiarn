package com.heroisks.enthiarn.client.entity.render;

import com.heroisks.enthiarn.Enthiarn;
import com.heroisks.enthiarn.client.entity.model.FriendEntityModel;
import com.heroisks.enthiarn.entities.FriendEntity;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class FriendEntityRender extends MobRenderer<FriendEntity,FriendEntityModel<FriendEntity>>{
	protected static final ResourceLocation TEXTURE = new ResourceLocation(Enthiarn.MOD_ID,
			"textures/entities/friend_entity.png");

	public FriendEntityRender(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new FriendEntityModel<FriendEntity>(), 0.5f);
	}
	
	@Override
	public ResourceLocation getEntityTexture(FriendEntity entity) {
		return TEXTURE;
	}
}
