package fiskfille.tf.client.model.transformer.vehicle;

import fiskfille.tf.client.model.transformer.ModelChildBase;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSubwooferVehicle extends ModelVehicleBase
{
    public ModelRenderer vehicleBase;
    public ModelRenderer vehicleStomach;
    public ModelRenderer vehicleCrotch1;
    public ModelRenderer vehicleRear1;
    public ModelRenderer vehicleRear2;
    public ModelRenderer vehicleChestMain1;
    public ModelRenderer vehicleFrontWheel1;
    public ModelRenderer vehicleFrontWheel2;
    public ModelRenderer vehicleFrontChest1;
    public ModelRenderer vehicleFrontChest2;
    public ModelRenderer vehicleChestMain2;
    public ModelRenderer vehicleChestMain3;
    public ModelRenderer vehicleChestMain5;
    public ModelRenderer vehicleChestMain6;
    public ModelRenderer vehicleDish1;
    public ModelRenderer vehicleShoulderBase2;
    public ModelRenderer vehicleShoulderBase1;
    public ModelRenderer vehicleCover1;
    public ModelRenderer vehicleCover2;
    public ModelRenderer vehicleCover3;
    public ModelRenderer vehicleCover4;
    public ModelRenderer vehicleCover5;
    public ModelRenderer vehicleCover6;
    public ModelRenderer vehicleHood;
    public ModelRenderer vehicleBaseplate;
    public ModelRenderer vehicleAntenna1;
    public ModelRenderer vehicleAntenna2;
    public ModelRenderer vehicleDish2;
    public ModelRenderer vehicleUpperArmL;
    public ModelRenderer vehicleLowerArmL1;
    public ModelRenderer vehicleUpperArmR;
    public ModelRenderer vehicleLowerArmRL1;
    public ModelRenderer vehicleBass2;
    public ModelRenderer vehicleBass3;
    public ModelRenderer vehicleFront1;
    public ModelRenderer vehicleFront2;
    public ModelRenderer vehicleUpperLegL;
    public ModelRenderer vehicleUpperLegR;
    public ModelRenderer vehicleLowerLegL1;
    public ModelRenderer vehicleRearWheel2;
    public ModelRenderer vehicleLowerLegL3;
    public ModelRenderer vehicleLowerLegR1;
    public ModelRenderer vehicleLowerLegR3;
    public ModelRenderer vehicleRearWheel1;

    public ModelSubwooferVehicle()
    {
        this.textureWidth = 128;
        this.textureHeight = 128;
        
        this.vehicleCover6 = new ModelRenderer(this, 17, 0);
        this.vehicleCover6.setRotationPoint(4.1F, -1.4F, -2.4F);
        this.vehicleCover6.addBox(-1.0F, 0.0F, 0.0F, 1, 4, 9, 0.0F);
        this.setRotateAngle(vehicleCover6, 0.0F, 0.0F, -0.017453292519943295F);
        this.vehicleLowerArmRL1 = new ModelRenderer(this, 48, 94);
        this.vehicleLowerArmRL1.mirror = true;
        this.vehicleLowerArmRL1.setRotationPoint(1.4F, 4.5F, 0.6F);
        this.vehicleLowerArmRL1.addBox(-1.7F, -0.6F, -1.5F, 3, 5, 3, 0.0F);
        this.vehicleChestMain1 = new ModelRenderer(this, 0, 67);
        this.vehicleChestMain1.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.vehicleChestMain1.addBox(-4.0F, -4.0F, -3.0F, 8, 4, 6, 0.0F);
        this.setRotateAngle(vehicleChestMain1, -1.5707963267948966F, 0.0F, 0.0F);
        this.vehicleCover3 = new ModelRenderer(this, 0, 0);
        this.vehicleCover3.mirror = true;
        this.vehicleCover3.setRotationPoint(-4.1F, -3.9F, -3.4F);
        this.vehicleCover3.addBox(0.0F, 0.0F, 0.0F, 1, 3, 14, 0.0F);
        this.vehicleRear1 = new ModelRenderer(this, 0, 22);
        this.vehicleRear1.setRotationPoint(-4.0F, -0.5F, 7.0F);
        this.vehicleRear1.addBox(0.0F, 0.0F, 0.0F, 8, 4, 2, 0.0F);
        this.vehicleRear2 = new ModelRenderer(this, 0, 29);
        this.vehicleRear2.setRotationPoint(-4.0F, -2.5F, 8.0F);
        this.vehicleRear2.addBox(0.0F, -1.0F, 0.0F, 8, 3, 1, 0.0F);
        this.vehicleFrontChest2 = new ModelRenderer(this, 10, 77);
        this.vehicleFrontChest2.mirror = true;
        this.vehicleFrontChest2.setRotationPoint(4.0F, -4.0F, -3.0F);
        this.vehicleFrontChest2.addBox(-4.0F, 0.0F, -0.6F, 4, 4, 1, 0.0F);
        this.setRotateAngle(vehicleFrontChest2, -0.07330382858376185F, 0.0F, 0.005235987755982988F);
        this.vehicleLowerLegL3 = new ModelRenderer(this, 79, 82);
        this.vehicleLowerLegL3.setRotationPoint(0.7F, -1.5F, 2.5F);
        this.vehicleLowerLegL3.addBox(0.0F, 0.0F, 0.0F, 1, 7, 2, 0.0F);
        this.vehicleLowerLegR1 = new ModelRenderer(this, 76, 66);
        this.vehicleLowerLegR1.mirror = true;
        this.vehicleLowerLegR1.setRotationPoint(-1.3F, 2.5F, -1.0F);
        this.vehicleLowerLegR1.addBox(-1.7F, -1.5F, -1.5F, 3, 6, 4, 0.0F);
        this.vehicleUpperLegL = new ModelRenderer(this, 76, 58);
        this.vehicleUpperLegL.setRotationPoint(1.0F, 1.0F, 0.0F);
        this.vehicleUpperLegL.addBox(0.0F, -1.0F, -2.0F, 2, 5, 3, 0.0F);
        this.setRotateAngle(vehicleUpperLegL, 1.5707963267948966F, 0.0F, 0.0F);
        this.vehicleBaseplate = new ModelRenderer(this, 20, 2);
        this.vehicleBaseplate.setRotationPoint(-3.0F, 1.6F, -5.4F);
        this.vehicleBaseplate.addBox(0.0F, 0.0F, 0.0F, 6, 1, 16, 0.0F);
        this.vehicleLowerArmL1 = new ModelRenderer(this, 48, 94);
        this.vehicleLowerArmL1.setRotationPoint(-1.4F, 4.5F, 0.6F);
        this.vehicleLowerArmL1.addBox(-1.3F, -0.6F, -1.5F, 3, 5, 3, 0.0F);
        this.vehicleFront2 = new ModelRenderer(this, 0, 0);
        this.vehicleFront2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.vehicleFront2.addBox(7.0F, 0.4F, -2.8F, 1, 3, 1, 0.0F);
        this.setRotateAngle(vehicleFront2, -0.13962634015954636F, 0.0F, 0.0F);
        this.vehicleUpperArmR = new ModelRenderer(this, 61, 79);
        this.vehicleUpperArmR.setRotationPoint(-1.7F, 1.0F, 0.0F);
        this.vehicleUpperArmR.addBox(-1.0F, -0.2F, -1.0F, 2, 4, 2, 0.0F);
        this.vehicleRearWheel2 = new ModelRenderer(this, 0, 77);
        this.vehicleRearWheel2.setRotationPoint(0.2F, 4.4F, -0.5F);
        this.vehicleRearWheel2.addBox(0.0F, -1.5F, -1.5F, 2, 3, 3, 0.0F);
        this.vehicleDish2 = new ModelRenderer(this, 22, 67);
        this.vehicleDish2.setRotationPoint(0.0F, -3.0F, 1.0F);
        this.vehicleDish2.addBox(-2.0F, -2.0F, -1.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(vehicleDish2, 0.2792526803190927F, 0.0F, 0.0F);
        this.vehicleUpperLegR = new ModelRenderer(this, 76, 58);
        this.vehicleUpperLegR.mirror = true;
        this.vehicleUpperLegR.setRotationPoint(-1.0F, 1.0F, 0.0F);
        this.vehicleUpperLegR.addBox(-2.0F, -1.0F, -2.0F, 2, 5, 3, 0.0F);
        this.setRotateAngle(vehicleUpperLegR, 1.5707963267948966F, 0.0F, 0.0F);
        this.vehicleCover2 = new ModelRenderer(this, 0, 42);
        this.vehicleCover2.setRotationPoint(-4.0F, -4.5F, 3.0F);
        this.vehicleCover2.addBox(0.0F, 0.0F, 0.0F, 8, 1, 7, 0.0F);
        this.vehicleBase = new ModelRenderer(this, 0, 98);
        this.vehicleBase.setRotationPoint(0.0F, 20.0F, -0.5F);
        this.vehicleBase.addBox(-3.5F, 0.0F, -2.5F, 7, 2, 5, 0.0F);
        this.vehicleCover4 = new ModelRenderer(this, 0, 0);
        this.vehicleCover4.setRotationPoint(4.1F, -3.9F, -3.4F);
        this.vehicleCover4.addBox(-1.0F, 0.0F, 0.0F, 1, 3, 14, 0.0F);
        this.setRotateAngle(vehicleCover4, 0.006283185307179587F, 0.0F, 0.0F);
        this.vehicleCover5 = new ModelRenderer(this, 17, 0);
        this.vehicleCover5.mirror = true;
        this.vehicleCover5.setRotationPoint(-4.1F, -1.4F, -2.4F);
        this.vehicleCover5.addBox(0.0F, 0.0F, 0.0F, 1, 4, 9, 0.0F);
        this.setRotateAngle(vehicleCover5, 0.0F, 0.0F, 0.017453292519943295F);
        this.vehicleCrotch1 = new ModelRenderer(this, 0, 105);
        this.vehicleCrotch1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.vehicleCrotch1.addBox(-1.0F, -0.7F, -2.4F, 2, 3, 4, 0.0F);
        this.vehicleChestMain2 = new ModelRenderer(this, 18, 62);
        this.vehicleChestMain2.setRotationPoint(-3.0F, -0.6F, -6.1F);
        this.vehicleChestMain2.addBox(0.0F, 0.0F, 0.3F, 6, 3, 2, 0.0F);
        this.setRotateAngle(vehicleChestMain2, 0.03490658503988659F, 0.0F, 0.0F);
        this.vehicleFrontWheel2 = new ModelRenderer(this, 0, 77);
        this.vehicleFrontWheel2.mirror = true;
        this.vehicleFrontWheel2.setRotationPoint(2.5F, 1.5F, -3.7F);
        this.vehicleFrontWheel2.addBox(0.0F, -1.5F, -1.5F, 2, 3, 3, 0.0F);
        this.vehicleLowerLegR3 = new ModelRenderer(this, 79, 82);
        this.vehicleLowerLegR3.mirror = true;
        this.vehicleLowerLegR3.setRotationPoint(-1.7F, -1.5F, 2.5F);
        this.vehicleLowerLegR3.addBox(0.0F, 0.0F, 0.0F, 1, 7, 2, 0.0F);
        this.vehicleChestMain3 = new ModelRenderer(this, 0, 83);
        this.vehicleChestMain3.setRotationPoint(-3.0F, -4.0F, 3.0F);
        this.vehicleChestMain3.addBox(0.0F, 0.0F, 0.0F, 6, 4, 2, 0.0F);
        this.vehicleDish1 = new ModelRenderer(this, 0, 67);
        this.vehicleDish1.setRotationPoint(-4.0F, -4.6F, 6.2F);
        this.vehicleDish1.addBox(-2.0F, -3.0F, 0.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(vehicleDish1, 0.017453292519943295F, 0.12217304763960307F, 1.5707963267948966F);
        this.vehicleShoulderBase1 = new ModelRenderer(this, 48, 78);
        this.vehicleShoulderBase1.setRotationPoint(-1.0F, -1.9F, 0.0F);
        this.vehicleShoulderBase1.addBox(-2.9F, -1.0F, -1.4F, 3, 2, 3, 0.0F);
        this.setRotateAngle(vehicleShoulderBase1, 1.5707963267948966F, 0.0F, 0.0F);
        this.vehicleUpperArmL = new ModelRenderer(this, 61, 79);
        this.vehicleUpperArmL.setRotationPoint(1.7F, 1.0F, 0.0F);
        this.vehicleUpperArmL.addBox(-1.0F, -0.2F, -1.0F, 2, 4, 2, 0.0F);
        this.vehicleCover1 = new ModelRenderer(this, 0, 34);
        this.vehicleCover1.setRotationPoint(-3.0F, -4.5F, 3.0F);
        this.vehicleCover1.addBox(0.0F, 0.0F, -6.0F, 6, 1, 6, 0.0F);
        this.setRotateAngle(vehicleCover1, 0.08203047484373349F, 0.0F, 0.0F);
        this.vehicleAntenna1 = new ModelRenderer(this, 30, 67);
        this.vehicleAntenna1.setRotationPoint(0.0F, 1.1F, 6.0F);
        this.vehicleAntenna1.addBox(-0.5F, -6.0F, -0.5F, 1, 6, 1, 0.0F);
        this.setRotateAngle(vehicleAntenna1, -0.05235987755982988F, 0.0F, 0.0F);
        this.vehicleFront1 = new ModelRenderer(this, 0, 0);
        this.vehicleFront1.mirror = true;
        this.vehicleFront1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.vehicleFront1.addBox(0.0F, 0.4F, -2.8F, 1, 3, 1, 0.0F);
        this.setRotateAngle(vehicleFront1, -0.13962634015954636F, 0.0F, 0.0F);
        this.vehicleChestMain5 = new ModelRenderer(this, 0, 89);
        this.vehicleChestMain5.setRotationPoint(2.9F, 0.5F, 3.0F);
        this.vehicleChestMain5.addBox(-1.0F, -2.0F, 0.0F, 2, 3, 4, 0.0F);
        this.setRotateAngle(vehicleChestMain5, 3.141592653589793F, 0.0F, 0.0F);
        this.vehicleHood = new ModelRenderer(this, 0, 18);
        this.vehicleHood.setRotationPoint(-4.0F, -1.0F, -3.0F);
        this.vehicleHood.addBox(0.0F, 0.0F, -2.8F, 8, 1, 3, 0.0F);
        this.setRotateAngle(vehicleHood, 0.13962634015954636F, 0.0F, 0.0F);
        this.vehicleStomach = new ModelRenderer(this, 0, 58);
        this.vehicleStomach.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.vehicleStomach.addBox(-2.5F, -5.5F, -2.0F, 5, 5, 4, 0.0F);
        this.setRotateAngle(vehicleStomach, 1.5707963267948966F, 0.0F, 0.0F);
        this.vehicleFrontChest1 = new ModelRenderer(this, 10, 77);
        this.vehicleFrontChest1.setRotationPoint(-4.0F, -4.0F, -3.0F);
        this.vehicleFrontChest1.addBox(0.0F, 0.0F, -0.6F, 4, 4, 1, 0.0F);
        this.setRotateAngle(vehicleFrontChest1, -0.07330382858376185F, 0.0F, -0.005235987755982988F);
        this.vehicleBass3 = new ModelRenderer(this, 0, 112);
        this.vehicleBass3.mirror = true;
        this.vehicleBass3.setRotationPoint(-2.5F, -2.5F, 2.1F);
        this.vehicleBass3.addBox(0.0F, 0.0F, 0.0F, 1, 4, 3, 0.0F);
        this.setRotateAngle(vehicleBass3, 0.0F, 1.5707963267948966F, 0.0F);
        this.vehicleFrontWheel1 = new ModelRenderer(this, 0, 77);
        this.vehicleFrontWheel1.setRotationPoint(-2.5F, 1.5F, -3.7F);
        this.vehicleFrontWheel1.addBox(-2.0F, -1.5F, -1.5F, 2, 3, 3, 0.0F);
        this.vehicleAntenna2 = new ModelRenderer(this, 30, 67);
        this.vehicleAntenna2.setRotationPoint(6.0F, 1.1F, 6.0F);
        this.vehicleAntenna2.addBox(-0.5F, -7.0F, -0.5F, 1, 7, 1, 0.0F);
        this.setRotateAngle(vehicleAntenna2, -0.05235987755982988F, 0.0F, 0.0F);
        this.vehicleLowerLegL1 = new ModelRenderer(this, 76, 66);
        this.vehicleLowerLegL1.setRotationPoint(1.3F, 2.5F, -1.0F);
        this.vehicleLowerLegL1.addBox(-1.3F, -1.5F, -1.5F, 3, 6, 4, 0.0F);
        this.setRotateAngle(vehicleLowerLegL1, 0.0F, 0.004886921905584123F, 0.0F);
        this.vehicleBass2 = new ModelRenderer(this, 0, 112);
        this.vehicleBass2.setRotationPoint(1.7F, -2.5F, 2.1F);
        this.vehicleBass2.addBox(0.0F, 0.0F, 0.0F, 1, 4, 3, 0.0F);
        this.setRotateAngle(vehicleBass2, 0.0F, 1.5707963267948966F, 0.0F);
        this.vehicleChestMain6 = new ModelRenderer(this, 0, 89);
        this.vehicleChestMain6.mirror = true;
        this.vehicleChestMain6.setRotationPoint(-2.9F, 0.5F, 3.0F);
        this.vehicleChestMain6.addBox(-1.0F, -2.0F, 0.0F, 2, 3, 4, 0.0F);
        this.setRotateAngle(vehicleChestMain6, 3.141592653589793F, 0.0F, 0.0F);
        this.vehicleShoulderBase2 = new ModelRenderer(this, 48, 78);
        this.vehicleShoulderBase2.setRotationPoint(1.0F, -1.9F, 0.0F);
        this.vehicleShoulderBase2.addBox(-0.1F, -1.0F, -1.4F, 3, 2, 3, 0.0F);
        this.setRotateAngle(vehicleShoulderBase2, 1.5707963267948966F, 0.0F, 0.0F);
        this.vehicleRearWheel1 = new ModelRenderer(this, 0, 77);
        this.vehicleRearWheel1.mirror = true;
        this.vehicleRearWheel1.setRotationPoint(-0.2F, 4.4F, -0.5F);
        this.vehicleRearWheel1.addBox(-2.0F, -1.5F, -1.5F, 2, 3, 3, 0.0F);
        
        this.vehicleChestMain1.addChild(this.vehicleCover6);
        this.vehicleUpperArmR.addChild(this.vehicleLowerArmRL1);
        this.vehicleStomach.addChild(this.vehicleChestMain1);
        this.vehicleChestMain1.addChild(this.vehicleCover3);
        this.vehicleBase.addChild(this.vehicleRear1);
        this.vehicleBase.addChild(this.vehicleRear2);
        this.vehicleChestMain1.addChild(this.vehicleFrontChest2);
        this.vehicleLowerLegL1.addChild(this.vehicleLowerLegL3);
        this.vehicleUpperLegR.addChild(this.vehicleLowerLegR1);
        this.vehicleCrotch1.addChild(this.vehicleUpperLegL);
        this.vehicleChestMain1.addChild(this.vehicleBaseplate);
        this.vehicleUpperArmL.addChild(this.vehicleLowerArmL1);
        this.vehicleHood.addChild(this.vehicleFront2);
        this.vehicleShoulderBase1.addChild(this.vehicleUpperArmR);
        this.vehicleLowerLegL1.addChild(this.vehicleRearWheel2);
        this.vehicleDish1.addChild(this.vehicleDish2);
        this.vehicleCrotch1.addChild(this.vehicleUpperLegR);
        this.vehicleChestMain1.addChild(this.vehicleCover2);
        this.vehicleChestMain1.addChild(this.vehicleCover4);
        this.vehicleChestMain1.addChild(this.vehicleCover5);
        this.vehicleBase.addChild(this.vehicleCrotch1);
        this.vehicleChestMain1.addChild(this.vehicleChestMain2);
        this.vehicleChestMain1.addChild(this.vehicleFrontWheel2);
        this.vehicleLowerLegR1.addChild(this.vehicleLowerLegR3);
        this.vehicleChestMain1.addChild(this.vehicleChestMain3);
        this.vehicleChestMain1.addChild(this.vehicleDish1);
        this.vehicleChestMain1.addChild(this.vehicleShoulderBase1);
        this.vehicleShoulderBase2.addChild(this.vehicleUpperArmL);
        this.vehicleChestMain1.addChild(this.vehicleCover1);
        this.vehicleChestMain3.addChild(this.vehicleAntenna1);
        this.vehicleHood.addChild(this.vehicleFront1);
        this.vehicleChestMain1.addChild(this.vehicleChestMain5);
        this.vehicleChestMain1.addChild(this.vehicleHood);
        this.vehicleBase.addChild(this.vehicleStomach);
        this.vehicleChestMain1.addChild(this.vehicleFrontChest1);
        this.vehicleLowerArmRL1.addChild(this.vehicleBass3);
        this.vehicleChestMain1.addChild(this.vehicleFrontWheel1);
        this.vehicleChestMain3.addChild(this.vehicleAntenna2);
        this.vehicleUpperLegL.addChild(this.vehicleLowerLegL1);
        this.vehicleLowerArmRL1.addChild(this.vehicleBass2);
        this.vehicleChestMain1.addChild(this.vehicleChestMain6);
        this.vehicleChestMain1.addChild(this.vehicleShoulderBase2);
        this.vehicleLowerLegR1.addChild(this.vehicleRearWheel1);
    }

    public void render() 
    {
    	this.vehicleBase.render(0.0625F);
    }
    
    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    { 
        this.vehicleBase.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) 
    {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
