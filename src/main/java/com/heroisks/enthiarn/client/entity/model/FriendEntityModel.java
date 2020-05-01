package com.heroisks.enthiarn.client.entity.model;

import com.heroisks.enthiarn.entities.FriendEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.model.ModelRenderer.ModelBox;
import net.minecraft.entity.Entity;

public class FriendEntityModel<T extends FriendEntity> extends EntityModel<T> {
	private final ModelRenderer body;
	private final ModelRenderer Head;
	private final ModelRenderer spikes;
	private final ModelRenderer RightLeg;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer tail;
	private final ModelRenderer spikeback;

	public FriendEntityModel() {
		textureWidth = 32;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(8.0F, 24.0F, -8.0F);

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(Head);
		body.setTextureOffset(0,13).addBox(-9.0F, -14.0F, 4.0F, 2, 7, 3, 0.0F, false);
		body.setTextureOffset(10,17).addBox(-9.0F, -13.0F, 1.0F, 2, 1, 3, 0.0F, false);


		spikes = new ModelRenderer(this);
		spikes.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(spikes);
		spikes.setTextureOffset(17,5).addBox(-9.0F, -11.0F, 7.0F, 2, 1, 1, 0.0F, false);
		spikes.setTextureOffset(17,5).addBox(-9.0F, -13.0F, 7.0F, 2, 1, 1, 0.0F, false);
		spikes.setTextureOffset(17,5).addBox(-9.0F, -15.0F, 6.0F, 2, 1, 1, 0.0F, false);
		spikes.setTextureOffset(17,5).addBox(-9.0F, -15.0F, 6.0F, 2, 1, 1, 0.0F, false);


		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(1.0F, 0.0F, 0.0F);
		body.addChild(RightLeg);

		RightLeg.setTextureOffset(3, 4).addBox(-11.0F, -4.0F, 11.0F, 1, 4, 1, 0.0F, false);


		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(1.0F, 0.0F, 0.0F);
		body.addChild(RightArm);
		RightArm.setTextureOffset(19, 20).addBox(-11.0F, -4.0F, 5.0F, 1, 4, 1, 0.0F, false);


		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(-1.0F, 0.0F, 0.0F);
		body.addChild(LeftArm);
		LeftArm.setTextureOffset(17, 0).addBox(-6.0F, -4.0F, 5.0F, 1, 4, 1, 0.0F, false);

		
		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(4.0F, 0.0F, -6.0F);
		body.addChild(LeftLeg);
		LeftLeg.setTextureOffset(0, 0).addBox(-11.0F, -4.0F, 17.0F, 1, 4, 1, 0.0F, false);


		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(tail);
		tail.setTextureOffset(10, 13).addBox(-9.0F, -8.0F, 13.0F, 2, 1, 3, 0.0F, false);


		spikeback = new ModelRenderer(this);
		spikeback.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(spikeback);
		spikeback.setTextureOffset(0, 0).addBox(-10.0F, -8.0F, 4.0F, 4, 4, 9, 0.0F, false);
		spikeback.setTextureOffset(7,13).addBox(-9.0F, -9.0F, 11.0F, 2, 1, 1, 0.0F, false);
		spikeback.setTextureOffset(17, 5).addBox(-9.0F, -9.0F, 7.0F, 2, 1, 1, 0.0F, false);
		spikeback.setTextureOffset(17, 17).addBox(-9.0F, -9.0F, 9.0F, 2, 1, 1, 0.0F, false);


	}

	@Override
	public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
		body.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
	}
	
	@Override
	public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// TODO Auto-generated method stub
		
	}
	
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
	
	@Override
	public void setLivingAnimations(T entityIn, float limbSwing, float limbSwingAmount, float partialTick) {
		// TODO Auto-generated method stub
		super.setLivingAnimations(entityIn, limbSwing, limbSwingAmount, partialTick);
	}
	
	public ModelRenderer getBody() {
		return body;
	}
	
	public ModelRenderer getLeftArm() {
		return LeftArm;
	}
	
	public ModelRenderer getHead() {
		return Head;
	}
	
	public ModelRenderer getLeftLeg() {
		return LeftLeg;
	}
	
	public ModelRenderer getRightArm() {
		return RightArm;
	}
	
	public ModelRenderer getRightLeg() {
		return RightLeg;
	}
	
	public ModelRenderer getSpikeback() {
		return spikeback;
	}
	
	public ModelRenderer getSpikes() {
		return spikes;
	}
	
	public ModelRenderer getTail() {
		return tail;
	}
}