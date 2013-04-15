
package ZoneSeek.common.models;

import ZoneSeek.common.entities.Apatosaurus;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelApatosaurus extends ModelBase
{
    private float wingspeed = 1.0F;
      //fields

    ModelRenderer Body1;
    ModelRenderer Body2;
    ModelRenderer Body3;
    ModelRenderer Body4;
    ModelRenderer Tail0;
    ModelRenderer Neck1;
    ModelRenderer Neck2;
    ModelRenderer Neck3;
    ModelRenderer Head1;
    ModelRenderer Head2;
    ModelRenderer Tail1;
    ModelRenderer Tail2;
    ModelRenderer Tail3;
    ModelRenderer BLegupleft;
    ModelRenderer FLegupleft;
    ModelRenderer BLegupright;
    ModelRenderer FLegupright;
    ModelRenderer BLegdownright;
    ModelRenderer FLegdownleft;
    ModelRenderer FLegdownright;
    ModelRenderer BLegdownleft;
    
  public ModelApatosaurus(float f1)
  {
    this.wingspeed = f1;
    
    textureWidth = 256;
    textureHeight = 256;
    
    Body1 = new ModelRenderer(this, 0, 135);
    Body1.addBox(-6F, 0F, 0F, 12, 12, 12);
    Body1.setRotationPoint(0F, -1F, 0F);
    Body1.setTextureSize(256, 256);
    Body1.mirror = true;
    setRotation(Body1, 0F, 0F, 0F);
    Body2 = new ModelRenderer(this, 0, 160);
    Body2.addBox(-5F, 0F, 0F, 10, 10, 6);
    Body2.setRotationPoint(0F, -2F, -4F);
    Body2.setTextureSize(256, 256);
    Body2.mirror = true;
    setRotation(Body2, -0.1858931F, 0F, 0F);
    Body3 = new ModelRenderer(this, 0, 177);
    Body3.addBox(-4F, 0F, 0F, 8, 8, 4);
    Body3.setRotationPoint(0F, -3F, -6F);
    Body3.setTextureSize(256, 256);
    Body3.mirror = true;
    setRotation(Body3, -0.3346075F, 0F, 0F);
    Body4 = new ModelRenderer(this, 0, 120);
    Body4.addBox(-5F, 0F, 0F, 10, 10, 4);
    Body4.setRotationPoint(0F, 0F, 11F);
    Body4.setTextureSize(256, 256);
    Body4.mirror = true;
    setRotation(Body4, 0F, 0F, 0F);
    Tail0 = new ModelRenderer(this, 0, 107);
    Tail0.addBox(-3F, -2F, 0F, 6, 6, 6);
    Tail0.setRotationPoint(0F, 3F, 14F);
    Tail0.setTextureSize(256, 256);
    Tail0.mirror = true;
    setRotation(Tail0, -0.0743572F, 0F, 0F);
    Neck1 = new ModelRenderer(this, 0, 190);
    Neck1.addBox(-3F, 0F, 0F, 6, 6, 5);
    Neck1.setRotationPoint(0F, -4F, -9F);
    Neck1.setTextureSize(256, 256);
    Neck1.mirror = true;
    setRotation(Neck1, -0.4089647F, 0F, 0F);
    Neck2 = new ModelRenderer(this, 0, 202);
    Neck2.addBox(-2F, 0F, -6F, 4, 4, 7);
    Neck2.setRotationPoint(0F, -3F, -9F);
    Neck2.setTextureSize(256, 256);
    Neck2.mirror = true;
    setRotation(Neck2, -0.5948578F, 0F, 0F);
    Neck3 = new ModelRenderer(this, 0, 214);
    Neck3.addBox(-2F, -2F, -12F, 4, 4, 13);
    Neck3.setRotationPoint(0F, -5F, -15F);
    Neck3.setTextureSize(256, 256);
    Neck3.mirror = true;
    setRotation(Neck3, -0.8179294F, 0F, 0F);
    Head1 = new ModelRenderer(this, 0, 232);
    Head1.addBox(-4F, -3F, -6F, 8, 6, 6);
    Head1.setRotationPoint(0F, -13F, -22F);
    Head1.setTextureSize(256, 256);
    Head1.mirror = true;
    setRotation(Head1, -0.1115358F, 0F, 0F);
    Head2 = new ModelRenderer(this, 0, 245);
    Head2.addBox(-3F, -2F, -4F, 6, 4, 4);
    Head2.setRotationPoint(0F, -13F, -27F);
    Head2.setTextureSize(256, 256);
    Head2.mirror = true;
    setRotation(Head2, 0F, 0F, 0F);
    Tail1 = new ModelRenderer(this, 0, 93);
    Tail1.addBox(-2F, -3F, 0F, 4, 4, 9);
    Tail1.setRotationPoint(0F, 5F, 19F);
    Tail1.setTextureSize(256, 256);
    Tail1.mirror = true;
    setRotation(Tail1, -0.1115358F, 0F, 0F);
    Tail2 = new ModelRenderer(this, 0, 82);
    Tail2.addBox(-1F, -1F, 0F, 2, 2, 8);
    Tail2.setRotationPoint(0F, 4F, 26F);
    Tail2.setTextureSize(256, 256);
    Tail2.mirror = true;
    setRotation(Tail2, -0.0743572F, 0F, 0F);
    Tail3 = new ModelRenderer(this, 0, 73);
    Tail3.addBox(-0.5F, -0.5F, 0F, 1, 1, 7);
    Tail3.setRotationPoint(0F, 4.5F, 34F);
    Tail3.setTextureSize(256, 256);
    Tail3.mirror = true;
    setRotation(Tail3, -0.0371786F, 0F, 0F);
    BLegupleft = new ModelRenderer(this, 49, 157);
    BLegupleft.addBox(0F, 0F, 0F, 6, 8, 6);
    BLegupleft.setRotationPoint(2F, 9F, 7F);
    BLegupleft.setTextureSize(256, 256);
    BLegupleft.mirror = true;
    setRotation(BLegupleft, -0.1487195F, 0F, 0F);
    FLegupleft = new ModelRenderer(this, 49, 141);
    FLegupleft.addBox(0F, 0F, -6F, 6, 9, 6);
    FLegupleft.setRotationPoint(2F, 8F, 2F);
    FLegupleft.setTextureSize(256, 256);
    FLegupleft.mirror = true;
    setRotation(FLegupleft, 0F, 0F, 0F);
    BLegupright = new ModelRenderer(this, 49, 126);
    BLegupright.addBox(-6F, 0F, 0F, 6, 8, 6);
    BLegupright.setRotationPoint(-2F, 9F, 7F);
    BLegupright.setTextureSize(256, 256);
    BLegupright.mirror = true;
    setRotation(BLegupright, -0.1487144F, 0F, 0F);
    FLegupright = new ModelRenderer(this, 49, 110);
    FLegupright.addBox(-6F, 0F, -6F, 6, 9, 6);
    FLegupright.setRotationPoint(-2F, 8F, 2F);
    FLegupright.setTextureSize(256, 256);
    FLegupright.mirror = true;
    setRotation(FLegupright, 0F, 0F, 0F);
    BLegdownright = new ModelRenderer(this, 115, 157);
    BLegdownright.addBox(-5F, 7F, -1F, 5, 8, 5);
    BLegdownright.setRotationPoint(-2F, 9F, 7F);
    BLegdownright.setTextureSize(256, 256);
    BLegdownright.mirror = true;
    setRotation(BLegdownright, 0F, 0F, 0F);
    FLegdownleft = new ModelRenderer(this, 94, 143);
    FLegdownleft.addBox(0F, 8F, -6F, 5, 8, 5);
    FLegdownleft.setRotationPoint(2F, 8F, 2F);
    FLegdownleft.setTextureSize(256, 256);
    FLegdownleft.mirror = true;
    setRotation(FLegdownleft, 0F, 0F, 0F);
    FLegdownright = new ModelRenderer(this, 94, 157);
    FLegdownright.addBox(-5F, 8F, -6F, 5, 8, 5);
    FLegdownright.setRotationPoint(-2F, 8F, 2F);
    FLegdownright.setTextureSize(256, 256);
    FLegdownright.mirror = true;
    setRotation(FLegdownright, 0F, 0F, 0F);
    BLegdownleft = new ModelRenderer(this, 115, 143);
    BLegdownleft.addBox(0F, 7F, -1F, 5, 8, 5);
    BLegdownleft.setRotationPoint(2F, 9F, 7F);
    BLegdownleft.setTextureSize(256, 256);
    BLegdownleft.mirror = true;
    setRotation(BLegdownleft, 0F, 0F, 0F);

  }
  
  //f1 is scaled for movement speed! Yay!
  //f3 is head rotation to look at player, in degrees
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
	  Apatosaurus c = (Apatosaurus)entity;
	float hf = 0.0F; 
    float newangle = 0;
    
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    
    //System.out.printf("floats: %f,  %f, %f, %f, %f, %f\n", f, f1, f2, f3, f4, f5);
    if(f1 > 0.1){
    	newangle = MathHelper.cos(f2 * 1.3F * this.wingspeed ) * (float)Math.PI * 0.25F * f1;
    }else{
    	newangle = 0.0F;
    }
    
    //Leg motion
    this.FLegupleft.rotateAngleX = newangle;
    this.FLegdownleft.rotateAngleX = newangle;
    this.FLegupright.rotateAngleX = -newangle;
    this.FLegdownright.rotateAngleX = -newangle;
    this.BLegupleft.rotateAngleX = -0.15F - newangle;
    this.BLegdownleft.rotateAngleX = -newangle;
    this.BLegupright.rotateAngleX = -0.15F - newangle;
    this.BLegdownright.rotateAngleX = newangle;
    
    //Tail wagging reflects health, both speed and amplitude    
    hf = (float)c.getApatosaurusHealth()/(float)c.getMaxHealth();
	newangle = MathHelper.cos(f2 * 1.5F * this.wingspeed * hf) * (float)Math.PI * 0.25F * hf;
	if(c.isSitting() == true){
		newangle = 0; //Tail stops when sitting!
	}
    this.Tail0.rotateAngleY = newangle * 0.25F;
    this.Tail1.rotationPointZ = this.Tail0.rotationPointZ + (float)Math.cos(this.Tail0.rotateAngleY)*5;
    this.Tail1.rotationPointX = this.Tail0.rotationPointX + (float)Math.sin(this.Tail0.rotateAngleY)*5;
    this.Tail1.rotateAngleY = newangle * 0.5F;
    this.Tail2.rotationPointZ = this.Tail1.rotationPointZ + (float)Math.cos(this.Tail1.rotateAngleY)*8;
    this.Tail2.rotationPointX = this.Tail1.rotationPointX + (float)Math.sin(this.Tail1.rotateAngleY)*8;
    this.Tail2.rotateAngleY = newangle * 0.75F;
    this.Tail3.rotationPointZ = this.Tail2.rotationPointZ + (float)Math.cos(this.Tail2.rotateAngleY)*7;
    this.Tail3.rotationPointX = this.Tail2.rotationPointX + (float)Math.sin(this.Tail2.rotateAngleY)*7;
    this.Tail3.rotateAngleY = newangle * 1.0F;

    //Rotate head
    //f3 is in degrees!  
    this.Neck1.rotateAngleY = (float)Math.toRadians((double)f3) * 0.125F;
    this.Neck2.rotationPointZ = this.Neck1.rotationPointZ; //funky model uses same rotation point
    this.Neck2.rotationPointX = this.Neck1.rotationPointX;
    this.Neck2.rotateAngleY = (float)Math.toRadians((double)f3) * 0.25F;
    this.Neck3.rotationPointZ = this.Neck2.rotationPointZ - (float)Math.cos(this.Neck2.rotateAngleY)*6;
    this.Neck3.rotationPointX = this.Neck2.rotationPointX - (float)Math.sin(this.Neck2.rotateAngleY)*6;
    this.Neck3.rotateAngleY = (float)Math.toRadians((double)f3) * 0.38F;   
    this.Head1.rotationPointZ = this.Neck3.rotationPointZ - (float)Math.cos(this.Neck3.rotateAngleY)*7;
    this.Head1.rotationPointX = this.Neck3.rotationPointX - (float)Math.sin(this.Neck3.rotateAngleY)*7;   
    this.Head1.rotateAngleY = (float)Math.toRadians((double)f3);
    this.Head2.rotationPointZ = this.Head1.rotationPointZ - (float)Math.cos(this.Head1.rotateAngleY)*5;
    this.Head2.rotationPointX = this.Head1.rotationPointX - (float)Math.sin(this.Head1.rotateAngleY)*5;
    this.Head2.rotateAngleY = (float)Math.toRadians((double)f3);
    
    Body1.render(f5);
    Body2.render(f5);
    Body3.render(f5);
    Body4.render(f5);
    Tail0.render(f5);
    Neck1.render(f5);
    Neck2.render(f5);
    Neck3.render(f5);
    Head1.render(f5);
    Head2.render(f5);
    Tail1.render(f5);
    Tail2.render(f5);
    Tail3.render(f5);

    FLegupleft.render(f5);
    FLegdownleft.render(f5);
    FLegupright.render(f5);
    FLegdownright.render(f5);
    BLegupleft.render(f5);
    BLegdownright.render(f5);
    BLegupright.render(f5);
    BLegdownleft.render(f5);

    
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
  }
  

}
