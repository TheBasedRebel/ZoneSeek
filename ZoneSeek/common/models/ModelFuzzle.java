package ZoneSeek.common.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelFuzzle extends ModelBase
{
  //fields
    ModelRenderer Body;
    ModelRenderer Right_Leg;
    ModelRenderer Left_Leg;
    ModelRenderer Left_Foot;
    ModelRenderer Right_Foot;
    ModelRenderer Right_Arm;
    ModelRenderer Left_Arm;
    ModelRenderer Head;
    ModelRenderer Neck;
    ModelRenderer Right_Ear;
    ModelRenderer Left_Ear;
    ModelRenderer Snout;
    ModelRenderer Belly;
    ModelRenderer Nose;
    ModelRenderer Tail;
  
  public ModelFuzzle()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      Body = new ModelRenderer(this, 0, 0);
      Body.addBox(-2.5F, -3.5F, -1.5F, 5, 7, 3);
      Body.setRotationPoint(0F, 18F, 0F);
      Body.setTextureSize(64, 64);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Right_Leg = new ModelRenderer(this, 0, 11);
      Right_Leg.addBox(-0.5F, -1F, -1.5F, 2, 4, 3);
      Right_Leg.setRotationPoint(3F, 20F, 0F);
      Right_Leg.setTextureSize(64, 64);
      Right_Leg.mirror = true;
      setRotation(Right_Leg, 0F, 0F, 0F);
      Left_Leg = new ModelRenderer(this, 0, 11);
      Left_Leg.addBox(-2F, -1F, -1.5F, 2, 4, 3);
      Left_Leg.setRotationPoint(-2.5F, 20F, 0F);
      Left_Leg.setTextureSize(64, 64);
      Left_Leg.mirror = true;
      setRotation(Left_Leg, 0F, 0F, 0F);
      Left_Foot = new ModelRenderer(this, 0, 19);
      Left_Foot.addBox(-1.5F, 3F, -2.5F, 2, 1, 4);
      Left_Foot.setRotationPoint(-3F, 20F, 0F);
      Left_Foot.setTextureSize(64, 64);
      Left_Foot.mirror = true;
      setRotation(Left_Foot, 0F, 0F, 0F);
      Right_Foot = new ModelRenderer(this, 0, 19);
      Right_Foot.addBox(-0.5F, 3F, -2.5F, 2, 1, 4);
      Right_Foot.setRotationPoint(3F, 20F, 0F);
      Right_Foot.setTextureSize(64, 64);
      Right_Foot.mirror = true;
      setRotation(Right_Foot, 0F, 0F, 0F);
      Right_Arm = new ModelRenderer(this, 0, 25);
      Right_Arm.addBox(0F, -1.5F, -1F, 2, 4, 2);
      Right_Arm.setRotationPoint(2.5F, 16F, 0.5F);
      Right_Arm.setTextureSize(64, 64);
      Right_Arm.mirror = true;
      setRotation(Right_Arm, 0F, 0F, 0F);
      Left_Arm = new ModelRenderer(this, 0, 25);
      Left_Arm.addBox(-2F, -1.5F, -1F, 2, 4, 2);
      Left_Arm.setRotationPoint(-2.5F, 16F, 0.5F);
      Left_Arm.setTextureSize(64, 64);
      Left_Arm.mirror = true;
      setRotation(Left_Arm, 0F, 0F, 0F);
      Head = new ModelRenderer(this, 0, 32);
      Head.addBox(-2.5F, -4.5F, -2F, 5, 4, 4);
      Head.setRotationPoint(0F, 14.5F, 0F);
      Head.setTextureSize(64, 64);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Neck = new ModelRenderer(this, 0, 47);
      Neck.addBox(-1.5F, -4F, -1F, 3, 1, 2);
      Neck.setRotationPoint(0F, 18F, 0F);
      Neck.setTextureSize(64, 64);
      Neck.mirror = true;
      setRotation(Neck, 0F, 0F, 0F);
      Right_Ear = new ModelRenderer(this, 0, 41);
      Right_Ear.addBox(1F, -6F, 0F, 4, 4, 1);
      Right_Ear.setRotationPoint(0F, 14.5F, 0F);
      Right_Ear.setTextureSize(64, 64);
      Right_Ear.mirror = true;
      setRotation(Right_Ear, 0F, 0F, 0F);
      Left_Ear = new ModelRenderer(this, 0, 41);
      Left_Ear.addBox(-5F, -6F, 0F, 4, 4, 1);
      Left_Ear.setRotationPoint(0F, 14.5F, 0F);
      Left_Ear.setTextureSize(64, 64);
      Left_Ear.mirror = true;
      setRotation(Left_Ear, 0F, 0F, 0F);
      Snout = new ModelRenderer(this, 0, 51);
      Snout.addBox(-1.5F, -3F, -3F, 3, 2, 1);
      Snout.setRotationPoint(0F, 14.5F, 0F);
      Snout.setTextureSize(64, 64);
      Snout.mirror = true;
      setRotation(Snout, 0F, 0F, 0F);
      Belly = new ModelRenderer(this, 17, 0);
      Belly.addBox(-1.5F, -3F, -2F, 3, 6, 1);
      Belly.setRotationPoint(0F, 18F, 0F);
      Belly.setTextureSize(64, 64);
      Belly.mirror = true;
      setRotation(Belly, 0F, 0F, 0F);
      Nose = new ModelRenderer(this, 17, 8);
      Nose.addBox(-0.5F, -3F, -3.5F, 1, 1, 1);
      Nose.setRotationPoint(0F, 14.5F, 0F);
      Nose.setTextureSize(64, 64);
      Nose.mirror = true;
      setRotation(Nose, 0F, 0F, 0F);
      Tail = new ModelRenderer(this, 12, 12);
      Tail.addBox(-1F, 1F, 1F, 2, 2, 1);
      Tail.setRotationPoint(0F, 18F, 0F);
      Tail.setTextureSize(64, 64);
      Tail.mirror = true;
      setRotation(Tail, 0F, 0F, 0F);
  }
  
  public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
  {
    super.render(par1Entity, par2, par3, par4, par5, par6, par7);
    setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
    Body.render(par7);
    Right_Leg.render(par7);
    Left_Leg.render(par7);
    Left_Foot.render(par7);
    Right_Foot.render(par7);
    Right_Arm.render(par7);
    Left_Arm.render(par7);
    Head.render(par7);
    Neck.render(par7);
    Right_Ear.render(par7);
    Left_Ear.render(par7);
    Snout.render(par7);
    Belly.render(par7);
    Nose.render(par7);
    Tail.render(par7);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
  {
      super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
      
      this.Head.rotateAngleX = par5 / (180F / (float)Math.PI);
      this.Head.rotateAngleY = par4 / (180F / (float)Math.PI);
      this.Right_Ear.rotateAngleX = par5 / (180F / (float)Math.PI);
      this.Right_Ear.rotateAngleY = par4 / (180F / (float)Math.PI);
      this.Left_Ear.rotateAngleX = par5 / (180F / (float)Math.PI);
      this.Left_Ear.rotateAngleY = par4 / (180F / (float)Math.PI);
      this.Snout.rotateAngleX = par5 / (180F / (float)Math.PI);
      this.Snout.rotateAngleY = par4 / (180F / (float)Math.PI);
      this.Nose.rotateAngleX = par5 / (180F / (float)Math.PI);
      this.Nose.rotateAngleY = par4 / (180F / (float)Math.PI);
      
      this.Left_Leg.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
      this.Left_Foot.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
      this.Right_Leg.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
      this.Right_Foot.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
      
      this.Right_Arm.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
      this.Left_Arm.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
  }

}
