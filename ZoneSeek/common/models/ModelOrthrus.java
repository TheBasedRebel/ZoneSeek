package ZoneSeek.common.models;

import org.lwjgl.opengl.GL11;

import ZoneSeek.common.entities.Orthrus;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.util.MathHelper;

public class ModelOrthrus extends ModelBase
{
  //fields
    ModelRenderer WolfHead;
    ModelRenderer Body;
    ModelRenderer Mane;
    ModelRenderer Leg1;
    ModelRenderer Leg2;
    ModelRenderer Leg3;
    ModelRenderer Leg4;
    ModelRenderer Tail;
    ModelRenderer Ear1;
    ModelRenderer Ear2;
    ModelRenderer Nose;
    ModelRenderer WolfHead_2;
    ModelRenderer Nose_2;
    ModelRenderer Ear3;
    ModelRenderer Ear4;
    ModelRenderer Wing_R_1;
    ModelRenderer Wing_R_2;
    ModelRenderer Wing_R_3;
    ModelRenderer Wing_R_4;
    ModelRenderer Wing_L_1;
    ModelRenderer Wing_L_2;
    ModelRenderer Wing_L_3;
    ModelRenderer Wing_L_4;
    ModelRenderer Bone_1;
    ModelRenderer Bone_2;
    ModelRenderer Bone_3;
  
  public ModelOrthrus()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      WolfHead = new ModelRenderer(this, 0, 0);
      WolfHead.addBox(-7F, -3F, -2F, 6, 6, 4);
      WolfHead.setRotationPoint(-1F, 13.5F, -7F);
      WolfHead.setTextureSize(64, 64);
      WolfHead.mirror = true;
      setRotation(WolfHead, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 18, 14);
      Body.addBox(-4F, -2F, -3F, 6, 9, 6);
      Body.setRotationPoint(0F, 14F, 2F);
      Body.setTextureSize(64, 64);
      Body.mirror = true;
      setRotation(Body, 1.570796F, 0F, 0F);
      Mane = new ModelRenderer(this, 21, 0);
      Mane.addBox(-4F, -3F, -3F, 8, 6, 7);
      Mane.setRotationPoint(-1F, 14F, -3F);
      Mane.setTextureSize(64, 64);
      Mane.mirror = true;
      setRotation(Mane, 1.570796F, 0F, 0F);
      Leg1 = new ModelRenderer(this, 0, 18);
      Leg1.addBox(-1F, 0F, -1F, 2, 8, 2);
      Leg1.setRotationPoint(-2.5F, 16F, 7F);
      Leg1.setTextureSize(64, 64);
      Leg1.mirror = true;
      setRotation(Leg1, 0F, 0F, 0F);
      Leg2 = new ModelRenderer(this, 42, 18);
      Leg2.addBox(-1F, 0F, -1F, 2, 8, 2);
      Leg2.setRotationPoint(0.5F, 16F, 7F);
      Leg2.setTextureSize(64, 64);
      Leg2.mirror = true;
      setRotation(Leg2, 0F, 0F, 0F);
      Leg3 = new ModelRenderer(this, 0, 18);
      Leg3.addBox(-1F, 0F, -1F, 2, 8, 2);
      Leg3.setRotationPoint(-2.5F, 16F, -4F);
      Leg3.setTextureSize(64, 64);
      Leg3.mirror = true;
      setRotation(Leg3, 0F, 0F, 0F);
      Leg4 = new ModelRenderer(this, 42, 18);
      Leg4.addBox(-1F, 0F, -1F, 2, 8, 2);
      Leg4.setRotationPoint(0.5F, 16F, -4F);
      Leg4.setTextureSize(64, 64);
      Leg4.mirror = true;
      setRotation(Leg4, 0F, 0F, 0F);
      Tail = new ModelRenderer(this, 9, 18);
      Tail.addBox(-1F, 0F, -1F, 2, 8, 2);
      Tail.setRotationPoint(-1F, 12F, 8F);
      Tail.setTextureSize(64, 64);
      Tail.mirror = true;
      setRotation(Tail, 1.130069F, 0F, 0F);
      Ear1 = new ModelRenderer(this, 16, 14);
      Ear1.addBox(-7F, -5F, 0F, 2, 2, 1);
      Ear1.setRotationPoint(-1F, 13.5F, -7F);
      Ear1.setTextureSize(64, 64);
      Ear1.mirror = true;
      setRotation(Ear1, 0F, 0F, 0F);
      Ear2 = new ModelRenderer(this, 16, 14);
      Ear2.addBox(-3F, -5F, 0F, 2, 2, 1);
      Ear2.setRotationPoint(-1F, 13.5F, -7F);
      Ear2.setTextureSize(64, 64);
      Ear2.mirror = true;
      setRotation(Ear2, 0F, 0F, 0F);
      Nose = new ModelRenderer(this, 0, 10);
      Nose.addBox(-6F, 0F, -5F, 3, 3, 4);
      Nose.setRotationPoint(-0.5F, 13.5F, -7F);
      Nose.setTextureSize(64, 64);
      Nose.mirror = true;
      setRotation(Nose, 0F, 0F, 0F);
      WolfHead_2 = new ModelRenderer(this, 0, 31);
      WolfHead_2.addBox(1F, -3F, -2F, 6, 6, 4);
      WolfHead_2.setRotationPoint(-1F, 13.5F, -7F);
      WolfHead_2.setTextureSize(64, 64);
      WolfHead_2.mirror = true;
      setRotation(WolfHead_2, 0F, 0F, 0F);
      Nose_2 = new ModelRenderer(this, 0, 41);
      Nose_2.addBox(2F, 0F, -5F, 3, 3, 4);
      Nose_2.setRotationPoint(-0.5F, 13.5F, -7F);
      Nose_2.setTextureSize(64, 64);
      Nose_2.mirror = true;
      setRotation(Nose_2, 0F, 0F, 0F);
      Ear3 = new ModelRenderer(this, 16, 42);
      Ear3.addBox(1F, -5F, 0F, 2, 2, 1);
      Ear3.setRotationPoint(-1F, 13.5F, -7F);
      Ear3.setTextureSize(64, 64);
      Ear3.mirror = true;
      setRotation(Ear3, 0F, 0F, 0F);
      Ear4 = new ModelRenderer(this, 16, 42);
      Ear4.addBox(5F, -5F, 0F, 2, 2, 1);
      Ear4.setRotationPoint(-1F, 13.5F, -7F);
      Ear4.setTextureSize(64, 64);
      Ear4.mirror = true;
      setRotation(Ear4, 0F, 0F, 0F);
      Wing_R_1 = new ModelRenderer(this, 0, 57);
      Wing_R_1.addBox(1F, 3F, -5F, 2, 6, 1);
      Wing_R_1.setRotationPoint(0F, 14F, 2F);
      Wing_R_1.setTextureSize(64, 64);
      Wing_R_1.mirror = true;
      setRotation(Wing_R_1, 0F, 0F, -1.954769F);
      Wing_R_2 = new ModelRenderer(this, 0, 49);
      Wing_R_2.addBox(7F, -3F, -5F, 2, 5, 1);
      Wing_R_2.setRotationPoint(0F, 14F, 2F);
      Wing_R_2.setTextureSize(64, 64);
      Wing_R_2.mirror = true;
      setRotation(Wing_R_2, 0F, 0F, -0.3717861F);
      Wing_R_3 = new ModelRenderer(this, 22, 31);
      Wing_R_3.addBox(2.6F, -2F, -4F, 6, 1, 6);
      Wing_R_3.setRotationPoint(0F, 14F, 2F);
      Wing_R_3.setTextureSize(64, 64);
      Wing_R_3.mirror = true;
      setRotation(Wing_R_3, 0F, 0F, -0.4304457F);
      Wing_R_4 = new ModelRenderer(this, 24, 39);
      Wing_R_4.addBox(-2F, -8.5F, -2F, 4, 1, 4);
      Wing_R_4.setRotationPoint(0F, 14F, 0F);
      Wing_R_4.setTextureSize(64, 64);
      Wing_R_4.mirror = true;
      setRotation(Wing_R_4, 0F, 0F, 1.189716F);
      Wing_L_1 = new ModelRenderer(this, 0, 57);
      Wing_L_1.addBox(-2F, 5F, -5F, 2, 6, 1);
      Wing_L_1.setRotationPoint(0F, 14F, 2F);
      Wing_L_1.setTextureSize(64, 64);
      Wing_L_1.mirror = true;
      setRotation(Wing_L_1, 0F, 0F, 1.991947F);
      Wing_L_2 = new ModelRenderer(this, 0, 49);
      Wing_L_2.addBox(-11F, -2F, -5F, 2, 5, 1);
      Wing_L_2.setRotationPoint(0F, 14F, 2F);
      Wing_L_2.setTextureSize(64, 64);
      Wing_L_2.mirror = true;
      setRotation(Wing_L_2, 0F, 0F, 0.4089647F);
      Wing_L_3 = new ModelRenderer(this, 22, 31);
      Wing_L_3.addBox(-10.5F, -1.4F, -4F, 6, 1, 6);
      Wing_L_3.setRotationPoint(0F, 14F, 2F);
      Wing_L_3.setTextureSize(64, 64);
      Wing_L_3.mirror = true;
      setRotation(Wing_L_3, 0F, 0F, 0.4461433F);
      Wing_L_4 = new ModelRenderer(this, 24, 39);
      Wing_L_4.addBox(-1.6F, 9.4F, -4F, 4, 1, 4);
      Wing_L_4.setRotationPoint(0F, 14F, 2F);
      Wing_L_4.setTextureSize(64, 64);
      Wing_L_4.mirror = true;
      setRotation(Wing_L_4, 0F, 0F, 1.970466F);
      Bone_1 = new ModelRenderer(this, 8, 49);
      Bone_1.addBox(-1.5F, -8F, -6F, 1, 5, 1);
      Bone_1.setRotationPoint(0F, 14F, 2F);
      Bone_1.setTextureSize(64, 64);
      Bone_1.mirror = true;
      setRotation(Bone_1, 0F, 0F, 0F);
      Bone_2 = new ModelRenderer(this, 8, 49);
      Bone_2.addBox(-1.5F, -7F, -2F, 1, 5, 1);
      Bone_2.setRotationPoint(0F, 14F, 2F);
      Bone_2.setTextureSize(64, 64);
      Bone_2.mirror = true;
      setRotation(Bone_2, 0F, 0F, 0F);
      Bone_3 = new ModelRenderer(this, 8, 49);
      Bone_3.addBox(-1.5F, -6F, 2F, 1, 5, 1);
      Bone_3.setRotationPoint(0F, 14F, 2F);
      Bone_3.setTextureSize(64, 64);
      Bone_3.mirror = true;
      setRotation(Bone_3, 0F, 0F, 0F);
  }
  public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
  {
    super.render(par1Entity, par2, par3, par4, par5, par6, par7);
    setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
    if (this.isChild)
    {
        float f6 = 2.0F;
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0F, 5.0F * par7, 2.0F * par7);
        this.WolfHead.render(par7);
        this.WolfHead_2.render(par7);
        this.Ear1.render(par7);
        this.Ear2.render(par7);
        this.Ear3.render(par7);
        this.Ear4.render(par7);
        this.Nose.render(par7);
        this.Nose_2.render(par7);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glScalef(1.0F / f6, 1.0F / f6, 1.0F / f6);
        GL11.glTranslatef(0.0F, 24.0F * par7, 0.0F);
        this.Body.render(par7);
        this.Mane.render(par7);
        this.Leg1.render(par7);
        this.Leg2.render(par7);
        this.Leg3.render(par7);
        this.Leg4.render(par7);
        this.Tail.render(par7);
        this.Wing_R_1.render(par7);
        this.Wing_R_2.render(par7);
        this.Wing_R_3.render(par7);
        this.Wing_R_4.render(par7);
        this.Wing_L_1.render(par7);
        this.Wing_L_2.render(par7);
        this.Wing_L_3.render(par7);
        this.Wing_L_4.render(par7);
        this.Bone_1.render(par7);
        this.Bone_2.render(par7);
        this.Bone_3.render(par7);
        GL11.glPopMatrix();
    }
    else
    {
    WolfHead.render(par7);
    Body.render(par7);
    Mane.render(par7);
    Leg1.render(par7);
    Leg2.render(par7);
    Leg3.render(par7);
    Leg4.render(par7);
    Tail.render(par7);
    Ear1.render(par7);
    Ear2.render(par7);
    Nose.render(par7);
    WolfHead_2.render(par7);
    Nose_2.render(par7);
    Ear3.render(par7);
    Ear4.render(par7);
    Wing_R_1.render(par7);
    Wing_R_2.render(par7);
    Wing_R_3.render(par7);
    Wing_R_4.render(par7);
    Wing_L_1.render(par7);
    Wing_L_2.render(par7);
    Wing_L_3.render(par7);
    Wing_L_4.render(par7);
    Bone_1.render(par7);
    Bone_2.render(par7);
    Bone_3.render(par7);
    }
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
      this.WolfHead.rotateAngleX = par5 / (180F / (float)Math.PI);
      this.WolfHead.rotateAngleY = par4 / (180F / (float)Math.PI);
      this.WolfHead_2.rotateAngleX = par5 / (180F / (float)Math.PI);
      this.WolfHead_2.rotateAngleY = par4 / (180F / (float)Math.PI);
      this.Ear1.rotateAngleX = par5 / (180F / (float)Math.PI);
      this.Ear1.rotateAngleY = par4 / (180F / (float)Math.PI);
      this.Ear2.rotateAngleX = par5 / (180F / (float)Math.PI);
      this.Ear2.rotateAngleY = par4 / (180F / (float)Math.PI);
      this.Ear3.rotateAngleX = par5 / (180F / (float)Math.PI);
      this.Ear3.rotateAngleY = par4 / (180F / (float)Math.PI);
      this.Ear4.rotateAngleX = par5 / (180F / (float)Math.PI);
      this.Ear4.rotateAngleY = par4 / (180F / (float)Math.PI);
      this.Nose.rotateAngleX = par5 / (180F / (float)Math.PI);
      this.Nose.rotateAngleY = par4 / (180F / (float)Math.PI);
      this.Nose_2.rotateAngleX = par5 / (180F / (float)Math.PI);
      this.Nose_2.rotateAngleY = par4 / (180F / (float)Math.PI);
      this.Leg1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
      this.Leg2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
      this.Leg3.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
      this.Leg4.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
      this.Tail.rotateAngleY = MathHelper.cos(par3 * 0.3F + (float)par2 * 0.1F * (float)Math.PI) * (float)Math.PI * 0.01F * (float)(1 + Math.abs(par2 - 2));
      this.Tail.rotationPointX = MathHelper.sin(par3 * 0.2F + (float)par2 * 0.1F * (float)Math.PI) * (float)Math.PI * 0.0F * (float)Math.abs(par2);
  }

}
