package ZoneSeek.common.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelSludgeMan extends ModelBase
{
  //fields
    ModelRenderer Head;
    ModelRenderer Right_Eye;
    ModelRenderer Left_Eye;
    ModelRenderer Left_Finger;
    ModelRenderer Right_Finger;
    ModelRenderer Left_Toe;
    ModelRenderer Right_Toe;
    ModelRenderer Middle_Bone;
    ModelRenderer Bottom_Bone;
    ModelRenderer Top_Bone;
    ModelRenderer Body;
    ModelRenderer LeftArm1;
    ModelRenderer RightArm;
    ModelRenderer LeftLeg;
    ModelRenderer LeftArm2;
    ModelRenderer RightLeg;
    ModelRenderer Nose;
  
  public ModelSludgeMan()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      Head = new ModelRenderer(this, 0, 9);
      Head.addBox(-4F, -5F, -3F, 8, 5, 6);
      Head.setRotationPoint(0F, -14F, 0F);
      Head.setTextureSize(64, 64);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Right_Eye = new ModelRenderer(this, 14, 0);
      Right_Eye.addBox(3F, -7F, -4F, 4, 4, 4);
      Right_Eye.setRotationPoint(0F, -14F, 0F);
      Right_Eye.setTextureSize(64, 64);
      Right_Eye.mirror = true;
      setRotation(Right_Eye, 0F, 0F, 0F);
      Left_Eye = new ModelRenderer(this, 30, 0);
      Left_Eye.addBox(-9F, -8F, -4F, 6, 6, 4);
      Left_Eye.setRotationPoint(0F, -14F, 0F);
      Left_Eye.setTextureSize(64, 64);
      Left_Eye.mirror = true;
      setRotation(Left_Eye, 0F, 0F, 0F);
      Left_Finger = new ModelRenderer(this, 51, 4);
      Left_Finger.addBox(-1.5F, 28F, -0.5F, 1, 3, 1);
      Left_Finger.setRotationPoint(-5F, -12F, 0F);
      Left_Finger.setTextureSize(64, 64);
      Left_Finger.mirror = true;
      setRotation(Left_Finger, 0F, 0F, 0F);
      Right_Finger = new ModelRenderer(this, 51, 4);
      Right_Finger.addBox(0F, 28F, -1F, 1, 3, 1);
      Right_Finger.setRotationPoint(5F, -11F, 0F);
      Right_Finger.setTextureSize(64, 64);
      Right_Finger.mirror = true;
      setRotation(Right_Finger, 0F, 0F, 0F);
      Left_Toe = new ModelRenderer(this, 50, 0);
      Left_Toe.addBox(0F, 25F, -3F, 1, 1, 2);
      Left_Toe.setRotationPoint(-2F, -2F, 0F);
      Left_Toe.setTextureSize(64, 64);
      Left_Toe.mirror = true;
      setRotation(Left_Toe, 0F, 0F, 0F);
      Right_Toe = new ModelRenderer(this, 50, 0);
      Right_Toe.addBox(0F, 25F, -3F, 1, 1, 2);
      Right_Toe.setRotationPoint(1F, -2F, 0F);
      Right_Toe.setTextureSize(64, 64);
      Right_Toe.mirror = true;
      setRotation(Right_Toe, 0F, 0F, 0F);
      Middle_Bone = new ModelRenderer(this, 0, 27);
      Middle_Bone.addBox(-1F, 6F, 2F, 2, 2, 4);
      Middle_Bone.setRotationPoint(0F, -14F, 0F);
      Middle_Bone.setTextureSize(64, 64);
      Middle_Bone.mirror = true;
      setRotation(Middle_Bone, 0F, 0F, 0F);
      Bottom_Bone = new ModelRenderer(this, 0, 27);
      Bottom_Bone.addBox(-1F, 10F, 2F, 2, 2, 4);
      Bottom_Bone.setRotationPoint(0F, -14F, 0F);
      Bottom_Bone.setTextureSize(64, 64);
      Bottom_Bone.mirror = true;
      setRotation(Bottom_Bone, 0F, 0F, 0F);
      Top_Bone = new ModelRenderer(this, 0, 27);
      Top_Bone.addBox(-1F, 2F, 2F, 2, 2, 4);
      Top_Bone.setRotationPoint(0F, -14F, 0F);
      Top_Bone.setTextureSize(64, 64);
      Top_Bone.mirror = true;
      setRotation(Top_Bone, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 32, 16);
      Body.addBox(-4F, 0F, -2F, 8, 16, 4);
      Body.setRotationPoint(0F, -14F, 0F);
      Body.setTextureSize(64, 64);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      LeftArm1 = new ModelRenderer(this, 52, 36);
      LeftArm1.addBox(-2F, -2F, -1F, 3, 12, 3);
      LeftArm1.setRotationPoint(-5F, -12F, 0F);
      LeftArm1.setTextureSize(64, 64);
      LeftArm1.mirror = true;
      setRotation(LeftArm1, 0F, 0F, 0F);
      RightArm = new ModelRenderer(this, 56, 0);
      RightArm.addBox(-1F, -2F, -1F, 2, 30, 2);
      RightArm.setRotationPoint(5F, -11F, 0F);
      RightArm.setTextureSize(64, 64);
      RightArm.mirror = true;
      setRotation(RightArm, 0F, 0F, 0F);
      LeftLeg = new ModelRenderer(this, 56, 0);
      LeftLeg.addBox(-1F, 0F, -1F, 2, 26, 2);
      LeftLeg.setRotationPoint(-2F, -2F, 0F);
      LeftLeg.setTextureSize(64, 64);
      LeftLeg.mirror = true;
      setRotation(LeftLeg, 0F, 0F, 0F);
      LeftArm2 = new ModelRenderer(this, 56, 0);
      LeftArm2.addBox(-1.5F, 10F, -0.5F, 2, 18, 2);
      LeftArm2.setRotationPoint(-5F, -12F, 0F);
      LeftArm2.setTextureSize(64, 64);
      LeftArm2.mirror = true;
      setRotation(LeftArm2, 0F, 0F, 0F);
      RightLeg = new ModelRenderer(this, 56, 0);
      RightLeg.addBox(0F, 0F, -1F, 2, 26, 2);
      RightLeg.setRotationPoint(1F, -2F, 0F);
      RightLeg.setTextureSize(64, 64);
      RightLeg.mirror = true;
      setRotation(RightLeg, 0F, 0F, 0F);
      Nose = new ModelRenderer(this, 0, 0);
      Nose.addBox(-2F, -4F, -6F, 4, 6, 3);
      Nose.setRotationPoint(0F, -14F, 0F);
      Nose.setTextureSize(64, 64);
      Nose.mirror = true;
      setRotation(Nose, 0F, 0F, 0F);
  }
  public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
  {
    super.render(par1Entity, par2, par3, par4, par5, par6, par7);
    setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
    Head.render(par7);
    Right_Eye.render(par7);
    Left_Eye.render(par7);
    Left_Finger.render(par7);
    Right_Finger.render(par7);
    Left_Toe.render(par7);
    Right_Toe.render(par7);
    Middle_Bone.render(par7);
    Bottom_Bone.render(par7);
    Top_Bone.render(par7);
    Body.render(par7);
    LeftArm1.render(par7);
    RightArm.render(par7);
    LeftLeg.render(par7);
    LeftArm2.render(par7);
    RightLeg.render(par7);
    Nose.render(par7);
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
  
    this.LeftLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
    this.Left_Toe.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
    this.RightLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
    this.Right_Toe.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
    
    this.RightArm.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
    this.Right_Finger.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
    this.LeftArm1.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
    this.LeftArm2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
    this.Left_Finger.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
    	}

}

