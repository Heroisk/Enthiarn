package com.heroisks.enthiarn.inits;

import com.heroisks.enthiarn.Enthiarn;
import com.heroisks.enthiarn.entities.FriendEntity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {

	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.ENTITIES, Enthiarn.MOD_ID);
	
	public static final RegistryObject<EntityType<FriendEntity>> FRIEND_ENTITY = ENTITY_TYPES
			.register("friend_entity",
					() -> EntityType.Builder.<FriendEntity>create(FriendEntity::new, EntityClassification.CREATURE)
					.size(0.5f, 0.5f)
					.build(new ResourceLocation(Enthiarn.MOD_ID, "friend_entity").toString()));
}
