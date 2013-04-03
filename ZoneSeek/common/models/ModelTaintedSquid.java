package ZoneSeek.common.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelTaintedSquid extends ModelBase
{
  //fields
    ModelRenderer Body;
    ModelRenderer Head;
    ModelRenderer Front_Head;
    ModelRenderer Top1;
    ModelRenderer Top2;
    ModelRenderer Top3;
    ModelRenderer Top4;
    ModelRenderer PieceL;
    ModelRenderer PieceR;
    ModelRenderer BodyStripR;
    ModelRenderer BodyStripL;
    ModelRenderer Tentacle1;
    ModelRenderer Tentacle2;
    ModelRenderer Tentacle3;
    ModelRenderer Tentacle4;
    ModelRenderer Eye;
  
  public ModelTaintedSquid()
  {
    textureWidth = 128;
    textureHeight = 128;
    
    Body = new ModelRenderer(this, 0, 0);
    Body.addBox(-4F, -4F, 0F, 8, 8, 18);
    Body.setRotationPoint(0F, 16F, -9F);
    Body.setTextureSize(64, 32);
    Body.mirror = true;
    setRotation(Body, 0F, 0F, 0F);
    Head = new ModelRenderer(this, 0, 26);
    Head.addBox(-3F, -3F, -9F, 6, 6, 9);
    Head.setRotationPoint(0F, 16F, -9F);
    Head.setTextureSize(64, 32);
    Head.mirror = true;
    setRotation(Head, 0F, 0F, 0F);
    Front_Head = new ModelRenderer(this, 0, 41);
    Front_Head.addBox(-2.5F, -2.5F, -16F, 5, 5, 7);
    Front_Head.setRotationPoint(0F, 16F, -9F);
    Front_Head.setTextureSize(64, 32);
    Front_Head.mirror = true;
    setRotation(Front_Head, 0F, 0F, 0F);
    Top1 = new ModelRenderer(this, 0, 53);
    Top1.addBox(-3.5F, -3.5F, -18F, 7, 7, 2);
    Top1.setRotationPoint(0F, 16F, -9F);
    Top1.setTextureSize(64, 32);
    Top1.mirror = true;
    setRotation(Top1, 0F, 0F, 0F);
    Top2 = new ModelRenderer(this, 0, 0);
    Top2.addBox(-3F, -3F, -20F, 6, 6, 2);
    Top2.setRotationPoint(0F, 16F, -9F);
    Top2.setTextureSize(64, 32);
    Top2.mirror = true;
    setRotation(Top2, 0F, 0F, 0F);
    Top3 = new ModelRenderer(this, 0, 8);
    Top3.addBox(-2.5F, -2.5F, -22F, 5, 5, 2);
    Top3.setRotationPoint(0F, 16F, -9F);
    Top3.setTextureSize(64, 32);
    Top3.mirror = true;
    setRotation(Top3, 0F, 0F, 0F);
    Top4 = new ModelRenderer(this, 35, 0);
    Top4.addBox(-1.5F, -1.5F, -24F, 3, 3, 2);
    Top4.setRotationPoint(0F, 16F, -9F);
    Top4.setTextureSize(64, 32);
    Top4.mirror = true;
    setRotation(Top4, 0F, 0F, 0F);
    PieceL = new ModelRenderer(this, 35, 5);
    PieceL.addBox(-2.5F, -0.5F, -23F, 1, 1, 1);
    PieceL.setRotationPoint(0F, 16F, -9F);
    PieceL.setTextureSize(64, 32);
    PieceL.mirror = true;
    setRotation(PieceL, 0F, 0F, 0F);
    PieceR = new ModelRenderer(this, 35, 5);
    PieceR.addBox(1.5F, -0.5F, -23F, 1, 1, 1);
    PieceR.setRotationPoint(0F, 16F, -9F);
    PieceR.setTextureSize(64, 32);
    PieceR.mirror = true;
    setRotation(PieceR, 0F, 0F, 0F);
    BodyStripR = new ModelRenderer(this, 9, 47);
    BodyStripR.addBox(4F, 0F, 1F, 1, 1, 16);
    BodyStripR.setRotationPoint(0F, 16F, -9F);
    BodyStripR.setTextureSize(64, 32);
    BodyStripR.mirror = true;
    setRotation(BodyStripR, 0F, 0F, 0F);
    BodyStripL = new ModelRenderer(this, 9, 47);
    BodyStripL.addBox(-5F, 0F, 1F, 1, 1, 16);
    BodyStripL.setRotationPoint(0F, 16F, -9F);
    BodyStripL.setTextureSize(64, 32);
    BodyStripL.mirror = true;
    setRotation(BodyStripL, 0F, 0F, 0F);
    Tentacle1 = new ModelRenderer(this, -1, 64);
    Tentacle1.addBox(-1F, -1F, 0F, 2, 2, 24);
    Tentacle1.setRotationPoint(0F, 13F, 9F);
    Tentacle1.setTextureSize(64, 32);
    Tentacle1.mirror = true;
    setRotation(Tentacle1, 0F, 0F, 0F);
    Tentacle2 = new ModelRenderer(this, 0, 64);
    Tentacle2.addBox(-1F, -1F, 0F, 2, 2, 24);
    Tentacle2.setRotationPoint(0F, 19F, 9F);
    Tentacle2.setTextureSize(64, 32);
    Tentacle2.mirror = true;
    setRotation(Tentacle2, 0F, 0F, 0F);
    Tentacle3 = new ModelRenderer(this, 0, 64);
    Tentacle3.addBox(-1F, -1F, 0F, 2, 2, 24);
    Tentacle3.setRotationPoint(-3F, 16F, 9F);
    Tentacle3.setTextureSize(64, 32);
    Tentacle3.mirror = true;
    setRotation(Tentacle3, 0F, 0F, 0F);
    Tentacle4 = new ModelRenderer(this, 0, 64);
    Tentacle4.addBox(-1F, -1F, 0F, 2, 2, 24);
    Tentacle4.setRotationPoint(3F, 16F, 9F);
    Tentacle4.setTextureSize(64, 32);
    Tentacle4.mirror = true;
    setRotation(Tentacle4, 0F, 0F, 0F);
    Eye = new ModelRenderer(this, 52, 0);
    Eye.addBox(-3F, -5F, 3F, 6, 1, 10);
    Eye.setRotationPoint(0F, 16F, -9F);
    Eye.setTextureSize(64, 32);
    Eye.mirror = true;
    setRotation(Eye, 0F, 0F, 0F);
  }
  
  public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
  {
    super.render(par1Entity, par2, par3, par4, par5, par6, par7);
    setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
    Body.render(par7);
    Head.render(par7);
    Front_Head.render(par7);
    Top1.render(par7);
    Top2.render(par7);
    Top3.render(par7);
    Top4.render(par7);
    PieceL.render(par7);
    PieceR.render(par7);
    BodyStripR.render(par7);
    BodyStripL.render(par7);
    Tentacle1.render(par7);
    Tentacle2.render(par7);
    Tentacle3.render(par7);
    Tentacle4.render(par7);
    Eye.render(par7);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
  {
      //super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
      this.Tentacle1.rotateAngleY = MathHelper.cos(par3 * 0.9F + (float)par4 * 0.15F * (float)Math.PI) * (float)Math.PI * 0.05F * (float)(1 + Math.abs(par2 - 2));
      //this.Tentacle1.rotationPointX = MathHelper.sin(par3 * 0.9F + (float)par4 * 0.02F * (float)Math.PI) * (float)Math.PI * 0.2F * (float)Math.abs(par2 - 2);
      
      this.Tentacle2.rotateAngleY = MathHelper.cos(par3 * 0.9F + (float)par2 * 0.15F * (float)Math.PI) * (float)Math.PI * 0.05F * (float)(1 + Math.abs(par2 - 2));
      //this.Tentacle2.rotationPointX = MathHelper.sin(par3 * 0.9F + (float)par2 * 0.02F * (float)Math.PI) * (float)Math.PI * 0.2F * (float)Math.abs(par2 - 2);
      
      this.Tentacle3.rotateAngleY = MathHelper.cos(par3 * 0.9F + (float)par4 * 0.15F * (float)Math.PI) * (float)Math.PI * 0.05F * (float)(1 + Math.abs(par2 - 2));
      //this.Tentacle3.rotationPointX = MathHelper.sin(par3 * 0.9F + (float)par4 * 0.02F * (float)Math.PI) * (float)Math.PI * 0.2F * (float)Math.abs(par2 - 2);
      
      this.Tentacle4.rotateAngleY = MathHelper.cos(par3 * 0.9F + (float)par2 * 0.15F * (float)Math.PI) * (float)Math.PI * 0.05F * (float)(1 + Math.abs(par2 - 2));
      //this.Tentacle4.rotationPointX = MathHelper.sin(par3 * 0.9F + (float)par2 * 0.2F * (float)Math.PI) * (float)Math.PI * 0.2F * (float)Math.abs(par2 - 2);
  }

}
