package scapecraft.client.model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelNeitiznotHelm extends ModelBiped
{
	//fields
	ModelRenderer Front;
	ModelRenderer NoseGuard;
	ModelRenderer Back;
	ModelRenderer Top;
	ModelRenderer StemL;
	ModelRenderer StemL2;
	ModelRenderer FeatherL1;
	ModelRenderer FeatherL2;
	ModelRenderer FeatherL3;
	ModelRenderer FeatherL4;
	ModelRenderer FlapL1;
	ModelRenderer FlapL2;
	ModelRenderer FlapL3;
	ModelRenderer StemR;
	ModelRenderer StemR2;
	ModelRenderer FeatherR1;
	ModelRenderer FeatherR2;
	ModelRenderer FeatherR3;
	ModelRenderer FeatherR4;
	ModelRenderer FlapR1;
	ModelRenderer FlapR2;
	ModelRenderer FlapR3;
	ModelRenderer SideBR;
	ModelRenderer SideTR;
	ModelRenderer SideMR;
	ModelRenderer SideChR;
	ModelRenderer PatchTR;
	ModelRenderer PatchBR;
	ModelRenderer SideBL;
	ModelRenderer SideTL;
	ModelRenderer SideML;
	ModelRenderer SideChL;
	ModelRenderer PatchTL;
	ModelRenderer PatchBL;

	public ModelNeitiznotHelm()
	{
		textureWidth = 64;
		textureHeight = 128;

		Front = new ModelRenderer(this, 0, 98);
		Front.addBox(-4F, -8F, -5F, 8, 3, 1);
		Front.setRotationPoint(0F, 0F, 0F);
		Front.setTextureSize(64, 128);
		Front.mirror = true;
		setRotation(Front, 0F, 0F, 0F);
		NoseGuard = new ModelRenderer(this, 19, 99);
		NoseGuard.addBox(-1F, -5F, -5F, 2, 2, 1);
		NoseGuard.setRotationPoint(0F, 0F, 0F);
		NoseGuard.setTextureSize(64, 128);
		NoseGuard.mirror = true;
		setRotation(NoseGuard, 0F, 0F, 0F);
		Back = new ModelRenderer(this, 0, 88);
		Back.addBox(-5F, -8F, 4F, 10, 8, 1);
		Back.setRotationPoint(0F, 0F, 0F);
		Back.setTextureSize(64, 128);
		Back.mirror = true;
		setRotation(Back, 0F, 0F, 0F);
		Top = new ModelRenderer(this, 0, 78);
		Top.addBox(-4F, -9F, -4F, 8, 1, 8);
		Top.setRotationPoint(0F, 0F, 0F);
		Top.setTextureSize(64, 128);
		Top.mirror = true;
		setRotation(Top, 0F, 0F, 0F);
		StemL = new ModelRenderer(this, 1, 70);
		StemL.addBox(4F, -10.7F, -3.1F, 1, 3, 1);
		StemL.setRotationPoint(0F, 0F, 0F);
		StemL.setTextureSize(64, 128);
		StemL.mirror = true;
		setRotation(StemL, -0.1047198F, 0F, 0F);
		StemL2 = new ModelRenderer(this, 7, 68);
		StemL2.addBox(4F, -12.9F, -7.73F, 1, 5, 1);
		StemL2.setRotationPoint(0F, 0F, 0F);
		StemL2.setTextureSize(64, 128);
		StemL2.mirror = true;
		setRotation(StemL2, -0.6108652F, 0F, 0F);
		FeatherL1 = new ModelRenderer(this, 13, 69);
		FeatherL1.addBox(4F, -14.6F, 3.6F, 1, 1, 4);
		FeatherL1.setRotationPoint(0F, 0F, 0F);
		FeatherL1.setTextureSize(64, 128);
		FeatherL1.mirror = true;
		setRotation(FeatherL1, 0.1745329F, 0F, 0F);
		FeatherL2 = new ModelRenderer(this, 25, 69);
		FeatherL2.addBox(4F, -13.3F, 2.4F, 1, 1, 5);
		FeatherL2.setRotationPoint(0F, 0F, 0F);
		FeatherL2.setTextureSize(64, 128);
		FeatherL2.mirror = true;
		setRotation(FeatherL2, 0.1745329F, 0F, 0F);
		FeatherL3 = new ModelRenderer(this, 39, 69);
		FeatherL3.addBox(4F, -12F, 1.2F, 1, 1, 6);
		FeatherL3.setRotationPoint(0F, 0F, 0F);
		FeatherL3.setTextureSize(64, 128);
		FeatherL3.mirror = true;
		setRotation(FeatherL3, 0.1745329F, 0F, 0F);
		FeatherL4 = new ModelRenderer(this, 38, 78);
		FeatherL4.addBox(4F, -10.7F, 0F, 1, 1, 7);
		FeatherL4.setRotationPoint(0F, 0F, 0F);
		FeatherL4.setTextureSize(64, 128);
		FeatherL4.mirror = true;
		setRotation(FeatherL4, 0.1745329F, 0F, 0F);
		FlapL1 = new ModelRenderer(this, 2, 59);
		FlapL1.addBox(4.5F, -8.1F, -13.3F, 0, 4, 1);
		FlapL1.setRotationPoint(0F, 0F, 0F);
		FlapL1.setTextureSize(64, 128);
		FlapL1.mirror = true;
		setRotation(FlapL1, -1.343904F, 0F, 0F);
		FlapL2 = new ModelRenderer(this, 7, 59);
		FlapL2.addBox(4.5F, -7.8F, -12.3F, 0, 5, 1);
		FlapL2.setRotationPoint(0F, 0F, 0F);
		FlapL2.setTextureSize(64, 128);
		FlapL2.mirror = true;
		setRotation(FlapL2, -1.343904F, 0F, 0F);
		FlapL3 = new ModelRenderer(this, 11, 59);
		FlapL3.addBox(4.5F, -7.5F, -11.3F, 0, 6, 1);
		FlapL3.setRotationPoint(0F, 0F, 0F);
		FlapL3.setTextureSize(64, 128);
		FlapL3.mirror = true;
		setRotation(FlapL3, -1.343904F, 0F, 0F);
		StemR = new ModelRenderer(this, 0, 50);
		StemR.addBox(-5F, -10.7F, -3.1F, 1, 3, 1);
		StemR.setRotationPoint(0F, 0F, 0F);
		StemR.setTextureSize(64, 128);
		StemR.mirror = true;
		setRotation(StemR, -0.1047198F, 0F, 0F);
		StemR2 = new ModelRenderer(this, 6, 50);
		StemR2.addBox(-5F, -12.9F, -7.74F, 1, 5, 1);
		StemR2.setRotationPoint(0F, 0F, 0F);
		StemR2.setTextureSize(64, 128);
		StemR2.mirror = true;
		setRotation(StemR2, -0.6108652F, 0F, 0F);
		FeatherR1 = new ModelRenderer(this, 12, 50);
		FeatherR1.addBox(-5F, -14.6F, 3.6F, 1, 1, 4);
		FeatherR1.setRotationPoint(0F, 0F, 0F);
		FeatherR1.setTextureSize(64, 128);
		FeatherR1.mirror = true;
		setRotation(FeatherR1, 0.1745329F, 0F, 0F);
		FeatherR2 = new ModelRenderer(this, 24, 50);
		FeatherR2.addBox(-5F, -13.3F, 2.4F, 1, 1, 5);
		FeatherR2.setRotationPoint(0F, 0F, 0F);
		FeatherR2.setTextureSize(64, 128);
		FeatherR2.mirror = true;
		setRotation(FeatherR2, 0.1745329F, 0F, 0F);
		FeatherR3 = new ModelRenderer(this, 38, 50);
		FeatherR3.addBox(-5F, -12F, 1.2F, 1, 1, 6);
		FeatherR3.setRotationPoint(0F, 0F, 0F);
		FeatherR3.setTextureSize(64, 128);
		FeatherR3.mirror = true;
		setRotation(FeatherR3, 0.1745329F, 0F, 0F);
		FeatherR4 = new ModelRenderer(this, 37, 59);
		FeatherR4.addBox(-5F, -10.7F, 0F, 1, 1, 7);
		FeatherR4.setRotationPoint(0F, 0F, 0F);
		FeatherR4.setTextureSize(64, 128);
		FeatherR4.mirror = true;
		setRotation(FeatherR4, 0.1745329F, 0F, 0F);
		FlapR1 = new ModelRenderer(this, 1, 40);
		FlapR1.addBox(-4.5F, -8.1F, -13.3F, 0, 4, 1);
		FlapR1.setRotationPoint(0F, 0F, 0F);
		FlapR1.setTextureSize(64, 128);
		FlapR1.mirror = true;
		setRotation(FlapR1, -1.343904F, 0F, 0F);
		FlapR2 = new ModelRenderer(this, 5, 40);
		FlapR2.addBox(-4.5F, -7.8F, -12.3F, 0, 5, 1);
		FlapR2.setRotationPoint(0F, 0F, 0F);
		FlapR2.setTextureSize(64, 128);
		FlapR2.mirror = true;
		setRotation(FlapR2, -1.343904F, 0F, 0F);
		FlapR3 = new ModelRenderer(this, 10, 40);
		FlapR3.addBox(-4.5F, -7.5F, -11.3F, 0, 6, 1);
		FlapR3.setRotationPoint(0F, 0F, 0F);
		FlapR3.setTextureSize(64, 128);
		FlapR3.mirror = true;
		setRotation(FlapR3, -1.343904F, 0F, 0F);
		SideBR = new ModelRenderer(this, 0, 116);
		SideBR.addBox(-5F, -3F, -5F, 1, 3, 9);
		SideBR.setRotationPoint(0F, 0F, 0F);
		SideBR.setTextureSize(64, 128);
		SideBR.mirror = true;
		setRotation(SideBR, 0F, 0F, 0F);
		SideTR = new ModelRenderer(this, 21, 116);
		SideTR.addBox(-5F, -8F, -5F, 1, 3, 9);
		SideTR.setRotationPoint(0F, 0F, 0F);
		SideTR.setTextureSize(64, 128);
		SideTR.mirror = true;
		setRotation(SideTR, 0F, 0F, 0F);
		SideMR = new ModelRenderer(this, 42, 121);
		SideMR.addBox(-5F, -5F, -1F, 1, 2, 5);
		SideMR.setRotationPoint(0F, 0F, 0F);
		SideMR.setTextureSize(64, 128);
		SideMR.mirror = true;
		setRotation(SideMR, 0F, 0F, 0F);
		SideChR = new ModelRenderer(this, 42, 116);
		SideChR.addBox(-5F, -5F, -0.8F, 1, 1, 3);
		SideChR.setRotationPoint(0F, 0F, 0F);
		SideChR.setTextureSize(64, 128);
		SideChR.mirror = true;
		setRotation(SideChR, 0.8028515F, 0F, 0F);
		PatchTR = new ModelRenderer(this, 51, 116);
		PatchTR.addBox(-5F, -5F, -2F, 1, 1, 1);
		PatchTR.setRotationPoint(0F, 0F, 0F);
		PatchTR.setTextureSize(64, 128);
		PatchTR.mirror = true;
		setRotation(PatchTR, 0F, 0F, 0F);
		PatchBR = new ModelRenderer(this, 55, 121);
		PatchBR.addBox(-5F, -4F, -3F, 1, 1, 2);
		PatchBR.setRotationPoint(0F, 0F, 0F);
		PatchBR.setTextureSize(64, 128);
		PatchBR.mirror = true;
		setRotation(PatchBR, 0F, 0F, 0F);
		SideBL = new ModelRenderer(this, 0, 103);
		SideBL.addBox(4F, -3F, -5F, 1, 3, 9);
		SideBL.setRotationPoint(0F, 0F, 0F);
		SideBL.setTextureSize(64, 128);
		SideBL.mirror = true;
		setRotation(SideBL, 0F, 0F, 0F);
		SideTL = new ModelRenderer(this, 21, 103);
		SideTL.addBox(4F, -8F, -5F, 1, 3, 9);
		SideTL.setRotationPoint(0F, 0F, 0F);
		SideTL.setTextureSize(64, 128);
		SideTL.mirror = true;
		setRotation(SideTL, 0F, 0F, 0F);
		SideML = new ModelRenderer(this, 42, 108);
		SideML.addBox(4F, -5F, -1F, 1, 2, 5);
		SideML.setRotationPoint(0F, 0F, 0F);
		SideML.setTextureSize(64, 128);
		SideML.mirror = true;
		setRotation(SideML, 0F, 0F, 0F);
		SideChL = new ModelRenderer(this, 42, 103);
		SideChL.addBox(4F, -5F, -0.8F, 1, 1, 3);
		SideChL.setRotationPoint(0F, 0F, 0F);
		SideChL.setTextureSize(64, 128);
		SideChL.mirror = true;
		setRotation(SideChL, 0.8028515F, 0F, 0F);
		PatchTL = new ModelRenderer(this, 55, 108);
		PatchTL.addBox(4F, -5F, -2F, 1, 1, 1);
		PatchTL.setRotationPoint(0F, 0F, 0F);
		PatchTL.setTextureSize(64, 128);
		PatchTL.mirror = true;
		setRotation(PatchTL, 0F, 0F, 0F);
		PatchBL = new ModelRenderer(this, 51, 103);
		PatchBL.addBox(4F, -4F, -3F, 1, 1, 2);
		PatchBL.setRotationPoint(0F, 0F, 0F);
		PatchBL.setTextureSize(64, 128);
		PatchBL.mirror = true;
		setRotation(PatchBL, 0F, 0F, 0F);

		Front.addChild(NoseGuard);
		Front.addChild(Back);
		Front.addChild(Top);
		Front.addChild(StemL);
		Front.addChild(StemL2);
		Front.addChild(FeatherL1);
		Front.addChild(FeatherL2);
		Front.addChild(FeatherL3);
		Front.addChild(FeatherL4);
		Front.addChild(FlapL1);
		Front.addChild(FlapL2);
		Front.addChild(FlapL3);
		Front.addChild(StemR);
		Front.addChild(StemR2);
		Front.addChild(FeatherR1);
		Front.addChild(FeatherR2);
		Front.addChild(FeatherR3);
		Front.addChild(FeatherR4);
		Front.addChild(FlapR1);
		Front.addChild(FlapR2);
		Front.addChild(FlapR3);
		Front.addChild(SideBR);
		Front.addChild(SideTR);
		Front.addChild(SideMR);
		Front.addChild(SideChR);
		Front.addChild(PatchTR);
		Front.addChild(PatchBR);
		Front.addChild(SideBL);
		Front.addChild(SideTL);
		Front.addChild(SideML);
		Front.addChild(SideChL);
		Front.addChild(PatchTL);
		Front.addChild(PatchBL);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Front.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		this.Front.rotateAngleY = this.bipedHead.rotateAngleY;
		this.Front.rotateAngleX = this.bipedHead.rotateAngleX;
	}

}
