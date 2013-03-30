package ZoneSeek.common.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelLagoonMonster extends ModelBase
{
  //fields
    ModelRenderer Head;
    ModelRenderer Body;
    ModelRenderer LeftLeg;
    ModelRenderer RightLeg;
    ModelRenderer Belly;
    ModelRenderer RightArmExt;
    ModelRenderer LeftArmExt;
    ModelRenderer LeftArm;
    ModelRenderer RightArm;
    ModelRenderer RToe1;
    ModelRenderer RToe2;
    ModelRenderer LToe1;
    ModelRenderer LToe2;
    ModelRenderer Mowhawk1;
    ModelRenderer MowHawk2;
    ModelRenderer Spine1;
    ModelRenderer Spine2;
    ModelRenderer Spine3;
    ModelRenderer Web1;
    ModelRenderer Web3;
    ModelRenderer Web2;
  
  public ModelLagoonMonster()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      Head = new ModelRenderer(this, 0, 0);
      Head.addBox(-4F, -8F, -4F, 8, 8, 8);
      Head.setRotationPoint(0F, 0F, 0F);
      Head.setTextureSize(64, 64);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 16, 16);
      Body.addBox(-4F, 3F, -2F, 8, 12, 4);
      Body.setRotationPoint(0F, -3F, 0F);
      Body.setTextureSize(64, 64);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      LeftLeg = new ModelRenderer(this, 0, 16);
      LeftLeg.addBox(-2F, 0F, -2F, 4, 12, 4);
      LeftLeg.setRotationPoint(-2F, 12F, 0F);
      LeftLeg.setTextureSize(64, 64);
      LeftLeg.mirror = true;
      setRotation(LeftLeg, 0F, 0F, 0F);
      RightLeg = new ModelRenderer(this, 0, 16);
      RightLeg.addBox(-2F, 0F, -2F, 4, 12, 4);
      RightLeg.setRotationPoint(2F, 12F, 0F);
      RightLeg.setTextureSize(64, 64);
      RightLeg.mirror = true;
      setRotation(RightLeg, 0F, 0F, 0F);
      Belly = new ModelRenderer(this, 33, 0);
      Belly.addBox(-3F, 1F, -3F, 6, 10, 1);
      Belly.setRotationPoint(0F, 0F, 0F);
      Belly.setTextureSize(64, 64);
      Belly.mirror = true;
      setRotation(Belly, 0F, 0F, 0F);
      RightArmExt = new ModelRenderer(this, 40, 16);
      RightArmExt.addBox(0F, -2F, -2F, 4, 5, 4);
      RightArmExt.setRotationPoint(4F, 2F, 0F);
      RightArmExt.setTextureSize(64, 64);
      RightArmExt.mirror = true;
      setRotation(RightArmExt, 0F, 0F, 0F);
      LeftArmExt = new ModelRenderer(this, 40, 16);
      LeftArmExt.addBox(-4F, -2F, -2F, 4, 5, 4);
      LeftArmExt.setRotationPoint(-4F, 2F, 0F);
      LeftArmExt.setTextureSize(64, 64);
      LeftArmExt.mirror = true;
      setRotation(LeftArmExt, 0F, 0F, 0F);
      LeftArm = new ModelRenderer(this, 31, 41);
      LeftArm.addBox(-3.5F, 3F, -1.5F, 3, 11, 3);
      LeftArm.setRotationPoint(-4F, 2F, 0F);
      LeftArm.setTextureSize(64, 64);
      LeftArm.mirror = true;
      setRotation(LeftArm, 0F, 0F, 0F);
      RightArm = new ModelRenderer(this, 31, 41);
      RightArm.addBox(0.5F, 3F, -1.5F, 3, 11, 3);
      RightArm.setRotationPoint(4F, 2F, 0F);
      RightArm.setTextureSize(64, 64);
      RightArm.mirror = true;
      setRotation(RightArm, 0F, 0F, 0F);
      RToe1 = new ModelRenderer(this, 0, 0);
      RToe1.addBox(-2F, 11F, -4F, 1, 1, 2);
      RToe1.setRotationPoint(2F, 12F, 0F);
      RToe1.setTextureSize(64, 64);
      RToe1.mirror = true;
      setRotation(RToe1, 0F, 0F, 0F);
      RToe2 = new ModelRenderer(this, 0, 4);
      RToe2.addBox(0F, 11F, -3F, 1, 1, 1);
      RToe2.setRotationPoint(2F, 12F, 0F);
      RToe2.setTextureSize(64, 64);
      RToe2.mirror = true;
      setRotation(RToe2, 0F, 0F, 0F);
      LToe1 = new ModelRenderer(this, 0, 0);
      LToe1.addBox(1F, 11F, -4F, 1, 1, 2);
      LToe1.setRotationPoint(-2F, 12F, 0F);
      LToe1.setTextureSize(64, 64);
      LToe1.mirror = true;
      setRotation(LToe1, 0F, 0F, 0F);
      LToe2 = new ModelRenderer(this, 0, 4);
      LToe2.addBox(-1F, 11F, -3F, 1, 1, 1);
      LToe2.setRotationPoint(-2F, 12F, 0F);
      LToe2.setTextureSize(64, 64);
      LToe2.mirror = true;
      setRotation(LToe2, 0F, 0F, 0F);
      Mowhawk1 = new ModelRenderer(this, 33, 33);
      Mowhawk1.addBox(-0.5F, -11F, -2F, 1, 3, 1);
      Mowhawk1.setRotationPoint(0F, 0F, 0F);
      Mowhawk1.setTextureSize(64, 64);
      Mowhawk1.mirror = true;
      setRotation(Mowhawk1, 0F, 0F, 0F);
      MowHawk2 = new ModelRenderer(this, 32, 34);
      MowHawk2.addBox(-0.5F, -10F, 1F, 1, 2, 1);
      MowHawk2.setRotationPoint(0F, 0F, 0F);
      MowHawk2.setTextureSize(64, 64);
      MowHawk2.mirror = true;
      setRotation(MowHawk2, 0F, 0F, 0F);
      Spine1 = new ModelRenderer(this, 0, 33);
      Spine1.addBox(-0.5F, 0F, 1F, 1, 1, 8);
      Spine1.setRotationPoint(0F, 0F, 0F);
      Spine1.setTextureSize(64, 64);
      Spine1.mirror = true;
      setRotation(Spine1, 0F, 0F, 0F);
      Spine2 = new ModelRenderer(this, 0, 33);
      Spine2.addBox(-0.5F, 3F, 0F, 1, 1, 8);
      Spine2.setRotationPoint(0F, 0F, 0F);
      Spine2.setTextureSize(64, 64);
      Spine2.mirror = true;
      setRotation(Spine2, 0F, 0F, 0F);
      Spine3 = new ModelRenderer(this, 17, 33);
      Spine3.addBox(-0.5F, 6F, 1F, 1, 1, 6);
      Spine3.setRotationPoint(0F, 0F, 0F);
      Spine3.setTextureSize(64, 64);
      Spine3.mirror = true;
      setRotation(Spine3, 0F, 0F, 0F);
      Web1 = new ModelRenderer(this, 0, 37);
      Web1.addBox(0F, 1F, 0F, 0, 2, 7);
      Web1.setRotationPoint(0F, 0F, 0F);
      Web1.setTextureSize(64, 64);
      Web1.mirror = true;
      setRotation(Web1, 0F, 0F, 0F);
      Web3 = new ModelRenderer(this, 0, 40);
      Web3.addBox(0F, 4F, 2F, 0, 2, 4);
      Web3.setRotationPoint(0F, 0F, 0F);
      Web3.setTextureSize(64, 64);
      Web3.mirror = true;
      setRotation(Web3, 0F, 0F, 0F);
      Web2 = new ModelRenderer(this, 0, 51);
      Web2.addBox(0F, -9F, -1F, 0, 1, 2);
      Web2.setRotationPoint(0F, 0F, 0F);
      Web2.setTextureSize(64, 64);
      Web2.mirror = true;
      setRotation(Web2, 0F, 0F, 0F);
  }
  
  public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
  {
    super.render(par1Entity, par2, par3, par4, par5, par6, par7);
    setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
    Head.render(par7);
    Body.render(par7);
    LeftLeg.render(par7);
    RightLeg.render(par7);
    Belly.render(par7);
    RightArmExt.render(par7);
    LeftArmExt.render(par7);
    LeftArm.render(par7);
    RightArm.render(par7);
    RToe1.render(par7);
    RToe2.render(par7);
    LToe1.render(par7);
    LToe2.render(par7);
    Mowhawk1.render(par7);
    MowHawk2.render(par7);
    Spine1.render(par7);
    Spine2.render(par7);
    Spine3.render(par7);
    Web1.render(par7);
    Web3.render(par7);
    Web2.render(par7);
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
      this.Mowhawk1.rotateAngleX = par5 / (180F / (float)Math.PI);
      this.MowHawk2.rotateAngleX = par5 / (180F / (float)Math.PI);
      this.Web2.rotateAngleX = par5 / (180F / (float)Math.PI);
      
      this.LeftLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
      this.LToe1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
      this.LToe2.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
      this.RightLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
      this.RToe1.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
      this.RToe2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
      
      this.RightArm.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
      this.RightArmExt.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
      this.LeftArm.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
      this.LeftArmExt.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
  }
      

}
