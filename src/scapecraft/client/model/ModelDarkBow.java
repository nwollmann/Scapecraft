package scapecraft.client.model;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDarkBow extends ModelBase
{
	//fields
	ModelRenderer Grip;
	ModelRenderer Shape1;
	ModelRenderer Shape4;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape6;
	ModelRenderer Shape7;
	ModelRenderer Shape8;
	ModelRenderer Shape9;
	ModelRenderer Shape10;
	ModelRenderer Shape11;
	ModelRenderer Shape12;
	ModelRenderer Shape13;
	ModelRenderer Shape14;
	ModelRenderer Shape15;
	ModelRenderer Shape16;
	ModelRenderer Shape17;
	ModelRenderer Shape18;
	ModelRenderer Shape19;
	ModelRenderer Shape20;
	ModelRenderer Shape101;
	ModelRenderer Shape102;
	ModelRenderer Shape103;
	ModelRenderer Shape22;
	ModelRenderer Shape23;
	ModelRenderer Shape24;
	ModelRenderer Shape25;
	ModelRenderer Shape26;
	ModelRenderer Shape27;
	ModelRenderer Shape28;
	ModelRenderer Shape29;
	ModelRenderer Shape30;
	ModelRenderer Shape31;
	ModelRenderer Shape32;
	ModelRenderer Shape33;
	ModelRenderer Shape34;
	ModelRenderer Shape35;
	ModelRenderer Shape36;
	ModelRenderer Shape37;
	ModelRenderer Shape38;
	ModelRenderer Shape39;
	ModelRenderer Shape43;
	ModelRenderer Shape500;
	ModelRenderer Shape420;
	ModelRenderer Shape100;
	ModelRenderer Shape46;
	ModelRenderer Shape422;
	ModelRenderer Shape49;
	ModelRenderer Spike_1;
	ModelRenderer Spike_2;
	ModelRenderer spike_3;
	ModelRenderer spike_4;
	ModelRenderer Spike_5;
	ModelRenderer Spike_7;
	ModelRenderer Spike_8;
	ModelRenderer Spike_9;
	ModelRenderer Spike_10;
	ModelRenderer Spike_11;

	public ModelDarkBow()
	{
		textureWidth = 32;
		textureHeight = 32;

		Grip = new ModelRenderer(this, 0, 27);
		Grip.addBox(0F, 0F, 0F, 1, 3, 1);
		Grip.setRotationPoint(0F, -5F, 0F);
		Grip.setTextureSize(32, 32);
		Grip.mirror = true;
		setRotation(Grip, 0F, 0F, 0F);
		Shape1 = new ModelRenderer(this, 0, 23);
		Shape1.addBox(0F, 0F, 0F, 1, 2, 1);
		Shape1.setRotationPoint(1F, -7F, 0F);
		Shape1.setTextureSize(32, 32);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0.5F);
		Shape1.mirror = false;
		Shape4 = new ModelRenderer(this, 28, 13);
		Shape4.addBox(0F, 0F, 0F, 1, 2, 1);
		Shape4.setRotationPoint(1.8F, -8.6F, 0F);
		Shape4.setTextureSize(32, 32);
		Shape4.mirror = true;
		setRotation(Shape4, 0F, 0F, 0.45F);
		Shape2 = new ModelRenderer(this, 0, 7);
		Shape2.addBox(0F, 0F, 0F, 1, 2, 1);
		Shape2.setRotationPoint(2.4F, -10.4F, 0F);
		Shape2.setTextureSize(32, 32);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 0F, 0.3F);
		Shape3 = new ModelRenderer(this, 0, 19);
		Shape3.addBox(0F, 0F, 0F, 1, 2, 1);
		Shape3.setRotationPoint(2.9F, -12.3F, 0F);
		Shape3.setTextureSize(32, 32);
		Shape3.mirror = true;
		setRotation(Shape3, 0F, 0F, 0.25F);
		Shape6 = new ModelRenderer(this, 0, 15);
		Shape6.addBox(0F, 0F, 0F, 1, 2, 1);
		Shape6.setRotationPoint(3.1F, -14F, 0F);
		Shape6.setTextureSize(32, 32);
		Shape6.mirror = true;
		setRotation(Shape6, 0F, 0F, 0.1F);
		Shape7 = new ModelRenderer(this, 0, 0);
		Shape7.addBox(0F, 0F, 0F, 1, 2, 1);
		Shape7.setRotationPoint(3.2F, -15.9F, 0F);
		Shape7.setTextureSize(32, 32);
		Shape7.mirror = true;
		setRotation(Shape7, 0F, 0F, 0.05F);
		Shape8 = new ModelRenderer(this, 0, 0);
		Shape8.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape8.setRotationPoint(3.2F, -16.8F, 0F);
		Shape8.setTextureSize(32, 32);
		Shape8.mirror = true;
		setRotation(Shape8, 0F, 0F, 0F);
		Shape9 = new ModelRenderer(this, 0, 0);
		Shape9.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape9.setRotationPoint(3.1F, -17.7F, 0F);
		Shape9.setTextureSize(32, 32);
		Shape9.mirror = true;
		setRotation(Shape9, 0F, 0F, -0.05F);
		Shape10 = new ModelRenderer(this, 0, 0);
		Shape10.addBox(0F, 0F, 0F, 1, 2, 1);
		Shape10.setRotationPoint(2.8F, -19.5F, 0F);
		Shape10.setTextureSize(32, 32);
		Shape10.mirror = true;
		setRotation(Shape10, 0F, 0F, -0.15F);
		Shape11 = new ModelRenderer(this, 0, 0);
		Shape11.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape11.setRotationPoint(2.6F, -20.3F, 0F);
		Shape11.setTextureSize(32, 32);
		Shape11.mirror = true;
		setRotation(Shape11, 0F, 0F, -0.25F);
		Shape12 = new ModelRenderer(this, 0, 0);
		Shape12.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape12.setRotationPoint(2.4F, -20.9F, 0F);
		Shape12.setTextureSize(32, 32);
		Shape12.mirror = true;
		setRotation(Shape12, 0F, 0F, -0.35F);
		Shape13 = new ModelRenderer(this, 0, 0);
		Shape13.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape13.setRotationPoint(2F, -21.7F, 0F);
		Shape13.setTextureSize(32, 32);
		Shape13.mirror = true;
		setRotation(Shape13, 0F, 0F, -0.45F);
		Shape14 = new ModelRenderer(this, 0, 0);
		Shape14.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape14.setRotationPoint(1.5F, -22.4F, 0F);
		Shape14.setTextureSize(32, 32);
		Shape14.mirror = true;
		setRotation(Shape14, 0F, 0F, -0.6F);
		Shape15 = new ModelRenderer(this, 0, 0);
		Shape15.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape15.setRotationPoint(0.9F, -23.1F, 0F);
		Shape15.setTextureSize(32, 32);
		Shape15.mirror = true;
		setRotation(Shape15, 0F, 0F, -0.7F);
		Shape16 = new ModelRenderer(this, 0, 0);
		Shape16.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape16.setRotationPoint(0.2F, -23.7F, 0F);
		Shape16.setTextureSize(32, 32);
		Shape16.mirror = true;
		setRotation(Shape16, 0F, 0F, -0.85F);
		Shape17 = new ModelRenderer(this, 0, 0);
		Shape17.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape17.setRotationPoint(-0.4F, -23.9F, 0F);
		Shape17.setTextureSize(32, 32);
		Shape17.mirror = true;
		setRotation(Shape17, 0F, 0F, -1.1F);
		Shape18 = new ModelRenderer(this, 0, 0);
		Shape18.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape18.setRotationPoint(-1.2F, -24.1F, 0F);
		Shape18.setTextureSize(32, 32);
		Shape18.mirror = true;
		setRotation(Shape18, 0F, 0F, -1.3F);
		Shape19 = new ModelRenderer(this, 0, 0);
		Shape19.addBox(0F, 0F, 0F, 1, 2, 1);
		Shape19.setRotationPoint(-3F, -24.6F, 0F);
		Shape19.setTextureSize(32, 32);
		Shape19.mirror = true;
		setRotation(Shape19, 0F, 0F, -1.3F);
		Shape20 = new ModelRenderer(this, 0, 0);
		Shape20.addBox(0F, 0F, 0F, 1, 2, 1);
		Shape20.setRotationPoint(-4.7F, -24.7F, 0F);
		Shape20.setTextureSize(32, 32);
		Shape20.mirror = true;
		setRotation(Shape20, 0F, 0F, -1.5F);
		Shape101 = new ModelRenderer(this, 10, 28);
		Shape101.addBox(0F, 0F, 0F, 1, 2, 1);
		Shape101.setRotationPoint(2F, -1F, 0F);
		Shape101.setTextureSize(32, 32);
		Shape101.mirror = true;
		setRotation(Shape101, 0F, 0F, 2.5F);
		Shape102 = new ModelRenderer(this, 10, 23);
		Shape102.addBox(0F, 0F, 0F, 1, 2, 1);
		Shape102.setRotationPoint(3.3F, 0.5F, 0F);
		Shape102.setTextureSize(32, 32);
		Shape102.mirror = true;
		setRotation(Shape102, 0F, 0F, 2.45F);
		Shape103 = new ModelRenderer(this, 10, 18);
		Shape103.addBox(0F, 0F, 0F, 1, 2, 1);
		Shape103.setRotationPoint(2.4F, 0.9F, 0F);
		Shape103.setTextureSize(32, 32);
		Shape103.mirror = true;
		setRotation(Shape103, 0F, 0F, -0.4F);
		Shape22 = new ModelRenderer(this, 9, 13);
		Shape22.addBox(0F, 0F, 0F, 1, 2, 1);
		Shape22.setRotationPoint(3.1F, 2.6F, 0F);
		Shape22.setTextureSize(32, 32);
		Shape22.mirror = true;
		setRotation(Shape22, 0F, 0F, -0.2F);
		Shape23 = new ModelRenderer(this, 0, -1);
		Shape23.addBox(0F, 0F, 0F, 1, 2, 1);
		Shape23.setRotationPoint(3.5F, 4.4F, 0F);
		Shape23.setTextureSize(32, 32);
		Shape23.mirror = true;
		setRotation(Shape23, 0F, 0F, -0.1F);
		Shape24 = new ModelRenderer(this, 0, 0);
		Shape24.addBox(0F, 0F, 0F, 1, 2, 1);
		Shape24.setRotationPoint(3.7F, 6F, 0F);
		Shape24.setTextureSize(32, 32);
		Shape24.mirror = true;
		setRotation(Shape24, 0F, 0F, 0F);
		Shape25 = new ModelRenderer(this, 0, 0);
		Shape25.addBox(0F, 0F, 0F, 1, 2, 1);
		Shape25.setRotationPoint(3.7F, 7.9F, 0F);
		Shape25.setTextureSize(32, 32);
		Shape25.mirror = true;
		setRotation(Shape25, 0F, 0F, 0.1F);
		Shape26 = new ModelRenderer(this, 0, 0);
		Shape26.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape26.setRotationPoint(3.5F, 9.8F, 0F);
		Shape26.setTextureSize(32, 32);
		Shape26.mirror = true;
		setRotation(Shape26, 0F, 0F, 0.2F);
		Shape27 = new ModelRenderer(this, 0, 0);
		Shape27.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape27.setRotationPoint(3.3F, 10.7F, 0F);
		Shape27.setTextureSize(32, 32);
		Shape27.mirror = true;
		setRotation(Shape27, 0F, 0F, 0.25F);
		Shape28 = new ModelRenderer(this, 0, 0);
		Shape28.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape28.setRotationPoint(3.1F, 11.5F, 0F);
		Shape28.setTextureSize(32, 32);
		Shape28.mirror = true;
		setRotation(Shape28, 0F, 0F, 0.3F);
		Shape29 = new ModelRenderer(this, 0, 0);
		Shape29.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape29.setRotationPoint(2.9F, 12.3F, 0F);
		Shape29.setTextureSize(32, 32);
		Shape29.mirror = true;
		setRotation(Shape29, 0F, 0F, 0.4F);
		Shape30 = new ModelRenderer(this, 0, 0);
		Shape30.addBox(0F, 0F, 0F, 1, 2, 1);
		Shape30.setRotationPoint(2.6F, 13.1F, 0F);
		Shape30.setTextureSize(32, 32);
		Shape30.mirror = true;
		setRotation(Shape30, 0F, 0F, 0.5F);
		Shape31 = new ModelRenderer(this, 0, 0);
		Shape31.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape31.setRotationPoint(1.7F, 14.7F, 0F);
		Shape31.setTextureSize(32, 32);
		Shape31.mirror = true;
		setRotation(Shape31, 0F, 0F, 0.5F);
		Shape32 = new ModelRenderer(this, 0, 0);
		Shape32.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape32.setRotationPoint(1.4F, 15.3F, 0F);
		Shape32.setTextureSize(32, 32);
		Shape32.mirror = true;
		setRotation(Shape32, 0F, 0F, 0.7F);
		Shape33 = new ModelRenderer(this, 0, 0);
		Shape33.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape33.setRotationPoint(0.9F, 16F, 0F);
		Shape33.setTextureSize(32, 32);
		Shape33.mirror = true;
		setRotation(Shape33, 0F, 0F, 0.85F);
		Shape34 = new ModelRenderer(this, 0, 0);
		Shape34.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape34.setRotationPoint(0.3F, 16.6F, 0F);
		Shape34.setTextureSize(32, 32);
		Shape34.mirror = true;
		setRotation(Shape34, 0F, 0F, 1F);
		Shape35 = new ModelRenderer(this, 0, 0);
		Shape35.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape35.setRotationPoint(-1.3F, 17.4F, 0F);
		Shape35.setTextureSize(32, 32);
		Shape35.mirror = true;
		setRotation(Shape35, 0F, 0F, -0.3F);
		Shape36 = new ModelRenderer(this, 0, 0);
		Shape36.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape36.setRotationPoint(-2F, 17.4F, 0F);
		Shape36.setTextureSize(32, 32);
		Shape36.mirror = true;
		setRotation(Shape36, 0F, 0F, 0F);
		Shape37 = new ModelRenderer(this, 0, 0);
		Shape37.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape37.setRotationPoint(-3F, 17.4F, 0F);
		Shape37.setTextureSize(32, 32);
		Shape37.mirror = true;
		setRotation(Shape37, 0F, 0F, 0F);
		Shape38 = new ModelRenderer(this, 0, 0);
		Shape38.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape38.setRotationPoint(-4F, 17.4F, 0F);
		Shape38.setTextureSize(32, 32);
		Shape38.mirror = true;
		setRotation(Shape38, 0F, 0F, 0F);
		Shape39 = new ModelRenderer(this, 0, 0);
		Shape39.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape39.setRotationPoint(-5F, 17.4F, 0F);
		Shape39.setTextureSize(32, 32);
		Shape39.mirror = true;
		setRotation(Shape39, 0F, 0F, 0F);
		Shape43 = new ModelRenderer(this, 27, 2);
		Shape43.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape43.setRotationPoint(0F, -5.4F, 0F);
		Shape43.setTextureSize(32, 32);
		Shape43.mirror = true;
		setRotation(Shape43, 0F, 0F, 0F);
		Shape500 = new ModelRenderer(this, 0, 0);
		Shape500.addBox(0F, 0F, 0F, 3, 1, 1);
		Shape500.setRotationPoint(-7F, -25.7F, 0F);
		Shape500.setTextureSize(32, 32);
		Shape500.mirror = true;
		setRotation(Shape500, 0F, 0F, 0F);
		Shape420 = new ModelRenderer(this, 0, 0);
		Shape420.addBox(0F, 0F, 0F, 2, 1, 1);
		Shape420.setRotationPoint(-5F, -25.7F, 0F);
		Shape420.setTextureSize(32, 32);
		Shape420.mirror = true;
		setRotation(Shape420, 0F, -5F, 0F);
		Shape100 = new ModelRenderer(this, 0, 0);
		Shape100.addBox(0F, 0F, 0F, 3, 1, 1);
		Shape100.setRotationPoint(-7F, 17.4F, 0F);
		Shape100.setTextureSize(32, 32);
		Shape100.mirror = true;
		setRotation(Shape100, 0F, 0F, 0F);
		Shape46 = new ModelRenderer(this, 0, 0);
		Shape46.addBox(0F, 0F, 0F, 2, 1, 1);
		Shape46.setRotationPoint(-4.1F, 17.4F, 0.8F);
		Shape46.setTextureSize(32, 32);
		Shape46.mirror = true;
		setRotation(Shape46, 0F, -1.3F, 0F);
		Shape422 = new ModelRenderer(this, 0, 0);
		Shape422.addBox(0F, 0F, 0F, 2, 1, 1);
		Shape422.setRotationPoint(-5F, 17.4F, 0F);
		Shape422.setTextureSize(32, 32);
		Shape422.mirror = true;
		setRotation(Shape422, 0F, -5F, 0F);
		Shape49 = new ModelRenderer(this, 0, 0);
		Shape49.addBox(0F, 0F, 0F, 2, 1, 1);
		Shape49.setRotationPoint(-4.4F, -25.7F, 0.7F);
		Shape49.setTextureSize(32, 32);
		Shape49.mirror = true;
		setRotation(Shape49, 0F, -1.3F, 0F);
		Spike_1 = new ModelRenderer(this, 12, 0);
		Spike_1.addBox(0F, 0F, 0F, 3, 1, 1);
		Spike_1.setRotationPoint(3.5F, 1F, 0F);
		Spike_1.setTextureSize(32, 32);
		Spike_1.mirror = true;
		setRotation(Spike_1, 0F, 0F, 0.35F);
		Spike_2 = new ModelRenderer(this, 12, 0);
		Spike_2.addBox(0F, 0F, 0F, 3, 1, 1);
		Spike_2.setRotationPoint(4.5F, 5F, 0F);
		Spike_2.setTextureSize(32, 32);
		Spike_2.mirror = true;
		setRotation(Spike_2, 0F, 0F, 0.35F);
		spike_3 = new ModelRenderer(this, 12, 0);
		spike_3.addBox(0F, 0F, 0F, 3, 1, 1);
		spike_3.setRotationPoint(2.7F, -10F, 0F);
		spike_3.setTextureSize(32, 32);
		spike_3.mirror = true;
		setRotation(spike_3, 0F, 0F, -0.35F);
		spike_4 = new ModelRenderer(this, 12, 0);
		spike_4.addBox(0F, 0F, 0F, 3, 1, 1);
		spike_4.setRotationPoint(3.4F, -14F, 0F);
		spike_4.setTextureSize(32, 32);
		spike_4.mirror = true;
		setRotation(spike_4, 0F, 0F, -0.35F);
		Spike_5 = new ModelRenderer(this, 16, 0);
		Spike_5.addBox(0F, 0F, 0F, 1, 2, 1);
		Spike_5.setRotationPoint(-7F, -27.7F, 0F);
		Spike_5.setTextureSize(32, 32);
		Spike_5.mirror = true;
		setRotation(Spike_5, 0F, 0F, 0F);
		Spike_7 = new ModelRenderer(this, 16, 0);
		Spike_7.addBox(0F, 0F, 0F, 1, 2, 1);
		Spike_7.setRotationPoint(-4.5F, -27.7F, -2F);
		Spike_7.setTextureSize(32, 32);
		Spike_7.mirror = true;
		setRotation(Spike_7, 0F, -0.3F, 0F);
		Spike_8 = new ModelRenderer(this, 16, 0);
		Spike_8.addBox(0F, 0F, 0F, 1, 2, 1);
		Spike_8.setRotationPoint(-5F, -27.7F, 2F);
		Spike_8.setTextureSize(32, 32);
		Spike_8.mirror = true;
		setRotation(Spike_8, 0F, 0.3F, 0F);
		Spike_9 = new ModelRenderer(this, 16, 0);
		Spike_9.addBox(0F, 0F, 0F, 1, 2, 1);
		Spike_9.setRotationPoint(-4.5F, 18.4F, -2F);
		Spike_9.setTextureSize(32, 32);
		Spike_9.mirror = true;
		setRotation(Spike_9, 0F, -0.3F, 0F);
		Spike_10 = new ModelRenderer(this, 16, 0);
		Spike_10.addBox(0F, 0F, 0F, 1, 2, 1);
		Spike_10.setRotationPoint(-4.8F, 18.4F, 2F);
		Spike_10.setTextureSize(32, 32);
		Spike_10.mirror = true;
		setRotation(Spike_10, 0F, 0.3F, 0F);
		Spike_11 = new ModelRenderer(this, 16, 0);
		Spike_11.addBox(0F, 0F, 0F, 1, 2, 1);
		Spike_11.setRotationPoint(-7F, 18.4F, 0F);
		Spike_11.setTextureSize(32, 32);
		Spike_11.mirror = true;
		setRotation(Spike_11, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Grip.render(f5);
		Shape1.render(f5);
		Shape4.render(f5);
		Shape2.render(f5);
		Shape3.render(f5);
		Shape6.render(f5);
		Shape7.render(f5);
		Shape8.render(f5);
		Shape9.render(f5);
		Shape10.render(f5);
		Shape11.render(f5);
		Shape12.render(f5);
		Shape13.render(f5);
		Shape14.render(f5);
		Shape15.render(f5);
		Shape16.render(f5);
		Shape17.render(f5);
		Shape18.render(f5);
		Shape19.render(f5);
		Shape20.render(f5);
		Shape101.render(f5);
		Shape102.render(f5);
		Shape103.render(f5);
		Shape22.render(f5);
		Shape23.render(f5);
		Shape24.render(f5);
		Shape25.render(f5);
		Shape26.render(f5);
		Shape27.render(f5);
		Shape28.render(f5);
		Shape29.render(f5);
		Shape30.render(f5);
		Shape31.render(f5);
		Shape32.render(f5);
		Shape33.render(f5);
		Shape34.render(f5);
		Shape35.render(f5);
		Shape36.render(f5);
		Shape37.render(f5);
		Shape38.render(f5);
		Shape39.render(f5);
		Shape43.render(f5);
		Shape500.render(f5);
		Shape420.render(f5);
		Shape100.render(f5);
		Shape46.render(f5);
		Shape422.render(f5);
		Shape49.render(f5);
		Spike_1.render(f5);
		Spike_2.render(f5);
		spike_3.render(f5);
		spike_4.render(f5);
		Spike_5.render(f5);
		Spike_7.render(f5);
		Spike_8.render(f5);
		Spike_9.render(f5);
		Spike_10.render(f5);
		Spike_11.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity ent)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, ent);
	}
}