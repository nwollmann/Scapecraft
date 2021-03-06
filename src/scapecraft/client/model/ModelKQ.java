package scapecraft.client.model;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelKQ extends ModelBase
{
	//fields
	ModelRenderer leg1;
	ModelRenderer leg2;
	ModelRenderer leg3;
	ModelRenderer jaw1;
	ModelRenderer jaw2;
	ModelRenderer thing1;
	ModelRenderer thing2;
	ModelRenderer Head;
	ModelRenderer Body;
	ModelRenderer RearEnd;
	ModelRenderer leg4;
	ModelRenderer leg5;
	ModelRenderer leg6;

	public ModelKQ()
	{
		textureWidth = 128;
		textureHeight = 64;

		leg1 = new ModelRenderer(this, 0, 0);
		leg1.addBox(12F, 13F, -3F, 12, 2, 2);
		leg1.setRotationPoint(0F, 0F, 0F);
		leg1.setTextureSize(128, 64);
		leg1.mirror = true;
		setRotation(leg1, 0F, 0F, 0.3691895F);
		leg2 = new ModelRenderer(this, 0, 0);
		leg2.addBox(12F, 13F, -9F, 12, 2, 2);
		leg2.setRotationPoint(0F, 0F, 0F);
		leg2.setTextureSize(128, 64);
		leg2.mirror = true;
		setRotation(leg2, 0F, 0F, 0.3691895F);
		leg3 = new ModelRenderer(this, 0, 0);
		leg3.addBox(12F, 13F, -14F, 12, 2, 2);
		leg3.setRotationPoint(0F, 0F, 0F);
		leg3.setTextureSize(128, 64);
		leg3.mirror = true;
		setRotation(leg3, 0F, 0F, 0.3691895F);
		jaw1 = new ModelRenderer(this, 0, 43);
		jaw1.addBox(1F, 16F, -26F, 1, 2, 5);
		jaw1.setRotationPoint(0F, 0F, 0F);
		jaw1.setTextureSize(128, 64);
		jaw1.mirror = true;
		setRotation(jaw1, 0F, 0F, 0F);
		jaw2 = new ModelRenderer(this, 0, 54);
		jaw2.addBox(-3F, 16F, -26F, 1, 2, 5);
		jaw2.setRotationPoint(0F, 0F, 0F);
		jaw2.setTextureSize(128, 64);
		jaw2.mirror = true;
		setRotation(jaw2, 0F, 0F, 0F);
		thing1 = new ModelRenderer(this, 45, 0);
		thing1.addBox(0F, 0F, 0F, 1, 15, 1);
		thing1.setRotationPoint(1F, 15F, -17F);
		thing1.setTextureSize(128, 64);
		thing1.mirror = true;
		setRotation(thing1, 2.193538F, 0F, 0F);
		thing2 = new ModelRenderer(this, 51, 0);
		thing2.addBox(0F, 0F, 0F, 1, 15, 1);
		thing2.setRotationPoint(-3F, 15F, -17F);
		thing2.setTextureSize(128, 64);
		thing2.mirror = true;
		setRotation(thing2, 2.193538F, 0F, 0F);
		Head = new ModelRenderer(this, 43, 21);
		Head.addBox(-3F, -6F, -18F, 5, 5, 6);
		Head.setRotationPoint(0F, 20F, -3F);
		Head.setTextureSize(128, 64);
		Head.mirror = true;
		setRotation(Head, 0F, 0F, 0F);
		Body = new ModelRenderer(this, 66, 0);
		Body.addBox(-8F, -7F, -15F, 15, 10, 15);
		Body.setRotationPoint(0F, 20F, 0F);
		Body.setTextureSize(128, 64);
		Body.mirror = true;
		setRotation(Body, 0F, 0F, 0F);
		RearEnd = new ModelRenderer(this, 0, 12);
		RearEnd.addBox(-5F, -10F, -11F, 9, 8, 12);
		RearEnd.setRotationPoint(-1F, 6F, 5F);
		RearEnd.setTextureSize(128, 64);
		RearEnd.mirror = true;
		setRotation(RearEnd, -0.4833219F, 0F, 3.141593F);
		leg4 = new ModelRenderer(this, 0, 0);
		leg4.addBox(-25F, 13F, -3F, 12, 2, 2);
		leg4.setRotationPoint(0F, 0F, 0F);
		leg4.setTextureSize(128, 64);
		leg4.mirror = true;
		setRotation(leg4, 0F, 0F, -0.3831462F);
		leg5 = new ModelRenderer(this, 0, 0);
		leg5.addBox(-25F, 13F, -9F, 12, 2, 2);
		leg5.setRotationPoint(0F, 0F, 0F);
		leg5.setTextureSize(128, 64);
		leg5.mirror = true;
		setRotation(leg5, 0F, 0F, -0.3831462F);
		leg6 = new ModelRenderer(this, 0, 0);
		leg6.addBox(-25F, 13F, -14F, 12, 2, 2);
		leg6.setRotationPoint(0F, 0F, 0F);
		leg6.setTextureSize(128, 64);
		leg6.mirror = true;
		setRotation(leg6, 0F, 0F, -0.3831462F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		leg1.render(f5);
		leg2.render(f5);
		leg3.render(f5);
		jaw1.render(f5);
		jaw2.render(f5);
		thing1.render(f5);
		thing2.render(f5);
		Head.render(f5);
		Body.render(f5);
		RearEnd.render(f5);
		leg4.render(f5);
		leg5.render(f5);
		leg6.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		//   super.setRotationAngles(f, f1, f2, f3, f4, f5);
	}

}
