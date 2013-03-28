package ZoneSeek.common.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelDeux extends ModelBase
{
  //fields
    ModelRenderer Lower_Half;
    ModelRenderer Segment_1;
    ModelRenderer Segment_2;
    ModelRenderer Segment_3;
    ModelRenderer Segment_4;
    ModelRenderer Tail_Part;
    ModelRenderer Tail_Part_L1;
    ModelRenderer Tail_Part_R1;
    ModelRenderer Front_Lower_Half;
    ModelRenderer Upper_Half;
    ModelRenderer Left_Arm;
    ModelRenderer Right_Arm;
    ModelRenderer Head_Center;
    ModelRenderer Head_Left;
    ModelRenderer Head_Right;
    ModelRenderer Shoulder_1;
    ModelRenderer Shoulder_2;
    ModelRenderer Left_Ear;
    ModelRenderer Right_Ear;
    ModelRenderer Right_Connector;
    ModelRenderer Left_Connector;
  
  public ModelDeux()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      Lower_Half = new ModelRenderer(this, 0, 0);
      Lower_Half.addBox(-7.5F, -8.5F, -6F, 15, 19, 12);
      Lower_Half.setRotationPoint(0F, 14F, 0F);
      Lower_Half.setTextureSize(128, 128);
      Lower_Half.mirror = true;
      setRotation(Lower_Half, 0F, 0F, 0F);
      Segment_1 = new ModelRenderer(this, 0, 32);
      Segment_1.addBox(-6.5F, -6F, 0F, 13, 12, 8);
      Segment_1.setRotationPoint(0F, 18F, 6F);
      Segment_1.setTextureSize(128, 128);
      Segment_1.mirror = true;
      setRotation(Segment_1, 0F, 0F, 0F);
      Segment_2 = new ModelRenderer(this, 0, 53);
      Segment_2.addBox(-5.5F, -4.5F, 0F, 11, 9, 7);
      Segment_2.setRotationPoint(0F, 19.5F, 14F);
      Segment_2.setTextureSize(128, 128);
      Segment_2.mirror = true;
      setRotation(Segment_2, 0F, 0F, 0F);
      Segment_3 = new ModelRenderer(this, 0, 70);
      Segment_3.addBox(-4.5F, -3F, 0F, 9, 6, 6);
      Segment_3.setRotationPoint(0F, 21F, 21F);
      Segment_3.setTextureSize(128, 128);
      Segment_3.mirror = true;
      setRotation(Segment_3, 0F, 0F, 0F);
      Segment_4 = new ModelRenderer(this, 0, 83);
      Segment_4.addBox(-3.5F, -1.5F, 0F, 7, 3, 3);
      Segment_4.setRotationPoint(0F, 22.5F, 27F);
      Segment_4.setTextureSize(128, 128);
      Segment_4.mirror = true;
      setRotation(Segment_4, 0F, 0F, 0F);
      Tail_Part = new ModelRenderer(this, 0, 90);
      Tail_Part.addBox(-3F, -1F, 0F, 6, 2, 8);
      Tail_Part.setRotationPoint(0F, 23F, 30F);
      Tail_Part.setTextureSize(128, 128);
      Tail_Part.mirror = true;
      setRotation(Tail_Part, 0F, 0F, 0F);
      Tail_Part_L1 = new ModelRenderer(this, 0, 101);
      Tail_Part_L1.addBox(-5F, -1F, 2F, 2, 3, 8);
      Tail_Part_L1.setRotationPoint(0F, 22F, 30F);
      Tail_Part_L1.setTextureSize(128, 128);
      Tail_Part_L1.mirror = true;
      setRotation(Tail_Part_L1, 0F, 0F, 0F);
      Tail_Part_R1 = new ModelRenderer(this, 0, 101);
      Tail_Part_R1.addBox(3F, -1F, 2F, 2, 3, 8);
      Tail_Part_R1.setRotationPoint(0F, 22F, 30F);
      Tail_Part_R1.setTextureSize(128, 128);
      Tail_Part_R1.mirror = true;
      setRotation(Tail_Part_R1, 0F, 0F, 0F);
      Front_Lower_Half = new ModelRenderer(this, 55, 0);
      Front_Lower_Half.addBox(-6F, -6F, -7F, 12, 16, 1);
      Front_Lower_Half.setRotationPoint(0F, 14F, 0F);
      Front_Lower_Half.setTextureSize(128, 128);
      Front_Lower_Half.mirror = true;
      setRotation(Front_Lower_Half, 0F, 0F, 0F);
      Upper_Half = new ModelRenderer(this, 55, 19);
      Upper_Half.addBox(-7.5F, -18F, -6F, 15, 18, 12);
      Upper_Half.setRotationPoint(0F, 5.5F, 0F);
      Upper_Half.setTextureSize(128, 128);
      Upper_Half.mirror = true;
      setRotation(Upper_Half, 0F, 0F, 0F);
      Left_Arm = new ModelRenderer(this, 55, 50);
      Left_Arm.addBox(-4F, -2F, -3.5F, 4, 22, 7);
      Left_Arm.setRotationPoint(-7.5F, -7.5F, 0F);
      Left_Arm.setTextureSize(128, 128);
      Left_Arm.mirror = true;
      setRotation(Left_Arm, 0F, 0F, 0F);
      Right_Arm = new ModelRenderer(this, 78, 50);
      Right_Arm.addBox(0F, -2F, -3.5F, 4, 22, 7);
      Right_Arm.setRotationPoint(7.5F, -7.5F, 0F);
      Right_Arm.setTextureSize(128, 128);
      Right_Arm.mirror = true;
      setRotation(Right_Arm, 0F, 0F, 0F);
      Head_Center = new ModelRenderer(this, 84, 95);
      Head_Center.addBox(-4.5F, -9F, -3.5F, 9, 9, 9);
      Head_Center.setRotationPoint(0F, -12.5F, 0F);
      Head_Center.setTextureSize(128, 128);
      Head_Center.mirror = true;
      setRotation(Head_Center, 0F, 0F, 0F);
      Head_Left = new ModelRenderer(this, 55, 80);
      Head_Left.addBox(-16.5F, -8F, -2.5F, 5, 5, 5);
      Head_Left.setRotationPoint(0F, -12.5F, 0F);
      Head_Left.setTextureSize(128, 128);
      Head_Left.mirror = true;
      setRotation(Head_Left, 0F, 0F, 0F);
      Head_Right = new ModelRenderer(this, 84, 80);
      Head_Right.addBox(11.5F, -8F, -2.5F, 5, 5, 5);
      Head_Right.setRotationPoint(0F, -12.5F, 0F);
      Head_Right.setTextureSize(128, 128);
      Head_Right.mirror = true;
      setRotation(Head_Right, 0F, 0F, 0F);
      Shoulder_1 = new ModelRenderer(this, 82, 0);
      Shoulder_1.addBox(7.5F, -18F, -5F, 5, 4, 10);
      Shoulder_1.setRotationPoint(0F, 5.5F, 0F);
      Shoulder_1.setTextureSize(128, 128);
      Shoulder_1.mirror = true;
      setRotation(Shoulder_1, 0F, 0F, 0F);
      Shoulder_2 = new ModelRenderer(this, 82, 0);
      Shoulder_2.addBox(-12.5F, -18F, -5F, 5, 4, 10);
      Shoulder_2.setRotationPoint(0F, 5.5F, 0F);
      Shoulder_2.setTextureSize(128, 128);
      Shoulder_2.mirror = true;
      setRotation(Shoulder_2, 0F, 0F, 0F);
      Left_Ear = new ModelRenderer(this, 75, 95);
      Left_Ear.addBox(-17F, -9F, 0F, 2, 4, 2);
      Left_Ear.setRotationPoint(0F, -12.5F, 0F);
      Left_Ear.setTextureSize(128, 128);
      Left_Ear.mirror = true;
      setRotation(Left_Ear, 0F, 0F, 0F);
      Right_Ear = new ModelRenderer(this, 75, 95);
      Right_Ear.addBox(15F, -9F, 0F, 2, 4, 2);
      Right_Ear.setRotationPoint(0F, -12.5F, 0F);
      Right_Ear.setTextureSize(128, 128);
      Right_Ear.mirror = true;
      setRotation(Right_Ear, 0F, 0F, 0F);
      Right_Connector = new ModelRenderer(this, 0, 114);
      Right_Connector.addBox(4F, -6.5F, -1F, 8, 2, 2);
      Right_Connector.setRotationPoint(0F, -12.5F, 0F);
      Right_Connector.setTextureSize(128, 128);
      Right_Connector.mirror = true;
      setRotation(Right_Connector, 0F, 0F, 0F);
      Left_Connector = new ModelRenderer(this, 0, 114);
      Left_Connector.addBox(-12F, -6.5F, -1F, 8, 2, 2);
      Left_Connector.setRotationPoint(0F, -12.5F, 0F);
      Left_Connector.setTextureSize(128, 128);
      Left_Connector.mirror = true;
      setRotation(Left_Connector, 0F, 0F, 0F);
  }
  
  public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
  {
    super.render(par1Entity, par2, par3, par4, par5, par6, par7);
    setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
    Lower_Half.render(par7);
    Segment_1.render(par7);
    Segment_2.render(par7);
    Segment_3.render(par7);
    Segment_4.render(par7);
    Tail_Part.render(par7);
    Tail_Part_L1.render(par7);
    Tail_Part_R1.render(par7);
    Front_Lower_Half.render(par7);
    Upper_Half.render(par7);
    Left_Arm.render(par7);
    Right_Arm.render(par7);
    Head_Center.render(par7);
    Head_Left.render(par7);
    Head_Right.render(par7);
    Shoulder_1.render(par7);
    Shoulder_2.render(par7);
    Left_Ear.render(par7);
    Right_Ear.render(par7);
    Right_Connector.render(par7);
    Left_Connector.render(par7);
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
      this.Right_Arm.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
      this.Left_Arm.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
      
      this.Segment_1.rotateAngleY = MathHelper.cos(par3 * 0.9F + (float)par2 * 0.15F * (float)Math.PI) * (float)Math.PI * 0.05F * (float)(1 + Math.abs(par2 - 2));
      this.Segment_1.rotationPointX = MathHelper.sin(par3 * 0.9F + (float)par2 * 0.15F * (float)Math.PI) * (float)Math.PI * 0.2F * (float)Math.abs(par2 - 2);
      this.Segment_1.rotateAngleY = MathHelper.cos(par3 * 0.9F + (float)par2 * 0.15F * (float)Math.PI) * (float)Math.PI * 0.05F * (float)(1 + Math.abs(par2 - 2));
      this.Segment_1.rotationPointX = MathHelper.sin(par3 * 0.9F + (float)par2 * 0.15F * (float)Math.PI) * (float)Math.PI * 0.2F * (float)Math.abs(par2 - 2);
      this.Segment_2.rotateAngleY = MathHelper.cos(par3 * 0.9F + (float)par2 * 0.15F * (float)Math.PI) * (float)Math.PI * 0.05F * (float)(1 + Math.abs(par2 - 2));
      this.Segment_2.rotationPointX = MathHelper.sin(par3 * 0.9F + (float)par2 * 0.15F * (float)Math.PI) * (float)Math.PI * 0.2F * (float)Math.abs(par2 - 2);
      this.Segment_3.rotateAngleY = MathHelper.cos(par3 * 0.9F + (float)par2 * 0.15F * (float)Math.PI) * (float)Math.PI * 0.05F * (float)(1 + Math.abs(par2 - 2));
      this.Segment_3.rotationPointX = MathHelper.sin(par3 * 0.9F + (float)par2 * 0.15F * (float)Math.PI) * (float)Math.PI * 0.2F * (float)Math.abs(par2 - 2);
      this.Segment_4.rotateAngleY = MathHelper.cos(par3 * 0.9F + (float)par2 * 0.15F * (float)Math.PI) * (float)Math.PI * 0.05F * (float)(1 + Math.abs(par2 - 2));
      this.Segment_4.rotationPointX = MathHelper.sin(par3 * 0.9F + (float)par2 * 0.15F * (float)Math.PI) * (float)Math.PI * 0.2F * (float)Math.abs(par2 - 2);
      
      this.Tail_Part.rotateAngleY = MathHelper.cos(par3 * 0.9F + (float)par2 * 0.15F * (float)Math.PI) * (float)Math.PI * 0.05F * (float)(1 + Math.abs(par2 - 2));
      this.Tail_Part.rotationPointX = MathHelper.sin(par3 * 0.9F + (float)par2 * 0.15F * (float)Math.PI) * (float)Math.PI * 0.2F * (float)Math.abs(par2 - 2);
      this.Tail_Part_L1.rotateAngleY = MathHelper.cos(par3 * 0.9F + (float)par2 * 0.15F * (float)Math.PI) * (float)Math.PI * 0.05F * (float)(1 + Math.abs(par2 - 2));
      this.Tail_Part_L1.rotationPointX = MathHelper.sin(par3 * 0.9F + (float)par2 * 0.15F * (float)Math.PI) * (float)Math.PI * 0.2F * (float)Math.abs(par2 - 2);
      this.Tail_Part_R1.rotateAngleY = MathHelper.cos(par3 * 0.9F + (float)par2 * 0.15F * (float)Math.PI) * (float)Math.PI * 0.05F * (float)(1 + Math.abs(par2 - 2));
      this.Tail_Part_R1.rotationPointX = MathHelper.sin(par3 * 0.9F + (float)par2 * 0.15F * (float)Math.PI) * (float)Math.PI * 0.2F * (float)Math.abs(par2 - 2);
      
      this.Head_Center.rotateAngleX = par5 / (180F / (float)Math.PI);
      this.Head_Center.rotateAngleY = par4 / (180F / (float)Math.PI);
      this.Head_Left.rotateAngleX = par5 / (180F / (float)Math.PI);
      this.Head_Left.rotateAngleY = par4 / (180F / (float)Math.PI);
      this.Head_Right.rotateAngleX = par5 / (180F / (float)Math.PI);
      this.Head_Right.rotateAngleY = par4 / (180F / (float)Math.PI);
      this.Left_Ear.rotateAngleX = par5 / (180F / (float)Math.PI);
      this.Left_Ear.rotateAngleY = par4 / (180F / (float)Math.PI);
      this.Right_Ear.rotateAngleX = par5 / (180F / (float)Math.PI);
      this.Right_Ear.rotateAngleY = par4 / (180F / (float)Math.PI);
      this.Right_Connector.rotateAngleX = par5 / (180F / (float)Math.PI);
      this.Right_Connector.rotateAngleY = par4 / (180F / (float)Math.PI);
      this.Left_Connector.rotateAngleX = par5 / (180F / (float)Math.PI);
      this.Left_Connector.rotateAngleY = par4 / (180F / (float)Math.PI);
  }

}
