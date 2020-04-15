package fiskfille.tfg1.client.model.transformer;

import static fiskfille.tf.common.data.TFPredicates.isBacking;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;

import org.lwjgl.opengl.GL11;

import fiskfille.tf.client.model.AnimationModifier;
import fiskfille.tf.client.model.AnimationModifier.Type;
import fiskfille.tf.client.model.tools.ModelRendererTF;
import fiskfille.tf.client.model.transformer.ModelTransformerBase;
import fiskfille.tf.common.transformer.base.Transformer;
import fiskfille.tf.helper.ModelOffset;
import fiskfille.tf.helper.TFModelHelper;
import fiskfille.tf.helper.TFRenderHelper;
import fiskfille.tfg1.G1TransformerManager;

public class ModelOptimusPrime extends ModelTransformerBase
{
    public ModelRendererTF waist;
    public ModelRendererTF upperLeg1;
    public ModelRendererTF upperLeg2;
    public ModelRendererTF crotchPiece1;
    public ModelRendererTF waistPanel1;
    public ModelRendererTF waistPanel2;
    public ModelRendererTF wheel1;
    public ModelRendererTF wheel2;
    public ModelRendererTF grill;
    public ModelRendererTF torsoConnector;
    public ModelRendererTF upperLegBack1;
    public ModelRendererTF upperLegTile1;
    public ModelRendererTF lowerLeg1;
    public ModelRendererTF rightLegIndentFrame1;
    public ModelRendererTF rightLegIndentFrame2;
    public ModelRendererTF rightLegIndentFrame3;
    public ModelRendererTF rightLegIndent1;
    public ModelRendererTF rightLegIndentFrame4;
    public ModelRendererTF rightLegIndentFrame5;
    public ModelRendererTF rightLegIndentFrame6;
    public ModelRendererTF rightLegIndent2;
    public ModelRendererTF legPipe1;
    public ModelRendererTF wheel3;
    public ModelRendererTF wheel5;
    public ModelRendererTF footBase1;
    public ModelRendererTF rightLegVent1;
    public ModelRendererTF rightLegVent2;
    public ModelRendererTF rightLegVent3;
    public ModelRendererTF rightLegVent4;
    public ModelRendererTF rightLegVent5;
    public ModelRendererTF rightLegVent6;
    public ModelRendererTF rightLegVent7;
    public ModelRendererTF lowerFootExtension1;
    public ModelRendererTF toeBase1;
    public ModelRendererTF upperFootExtension1;
    public ModelRendererTF toeExtension1;
    public ModelRendererTF upperLegTile2;
    public ModelRendererTF upperLegBack2;
    public ModelRendererTF lowerLeg2;
    public ModelRendererTF leftLegIndentFrame1;
    public ModelRendererTF leftLegIndentFrame2;
    public ModelRendererTF leftLegIndentFrame3;
    public ModelRendererTF leftLegIndent1;
    public ModelRendererTF leftLegIndentFrame4;
    public ModelRendererTF leftLegIndentFrame5;
    public ModelRendererTF leftLegIndentFrame6;
    public ModelRendererTF leftLegIndent2;
    public ModelRendererTF legPipe2;
    public ModelRendererTF wheel4;
    public ModelRendererTF wheel6;
    public ModelRendererTF footBase2;
    public ModelRendererTF leftLegVent1;
    public ModelRendererTF leftLegVent2;
    public ModelRendererTF leftLegVent3;
    public ModelRendererTF leftLegVent4;
    public ModelRendererTF leftLegVent5;
    public ModelRendererTF leftLegVent6;
    public ModelRendererTF leftLegVent7;
    public ModelRendererTF lowerFootExtension2;
    public ModelRendererTF toeBase2;
    public ModelRendererTF upperFootExtension2;
    public ModelRendererTF toeExtension2;
    public ModelRendererTF crotchPiece2;
    public ModelRendererTF crotchPiece3;
    public ModelRendererTF torso;
    public ModelRendererTF torsoFront1;
    public ModelRendererTF torsoFront2;
    public ModelRendererTF armConnector1;
    public ModelRendererTF armConnector2;
    public ModelRendererTF torsoSide1;
    public ModelRendererTF torsoSide2;
    public ModelRendererTF torsoTop;
    public ModelRendererTF neck;
    public ModelRendererTF torsoFrontUpper1;
    public ModelRendererTF windshield1;
    public ModelRendererTF upperLights1;
    public ModelRendererTF torsoFrontUpper2;
    public ModelRendererTF windshield2;
    public ModelRendererTF upperLights2;
    public ModelRendererTF upperArm1;
    public ModelRendererTF elbowJoint1;
    public ModelRendererTF smokeStack1;
    public ModelRendererTF upperArmPiece1;
    public ModelRendererTF lowerArm1;
    public ModelRendererTF hand1;
    public ModelRendererTF upperArm2;
    public ModelRendererTF elbowJoint2;
    public ModelRendererTF smokeStack2;
    public ModelRendererTF upperArmPiece2;
    public ModelRendererTF lowerArm2;
    public ModelRendererTF hand2;
    public ModelRendererTF headConnector;
    public ModelRendererTF head;
    public ModelRendererTF headBase;
    public ModelRendererTF eye1;
    public ModelRendererTF eye2;
    public ModelRendererTF lowerEar1;
    public ModelRendererTF lowerEar2;
    public ModelRendererTF headTop1;
    public ModelRendererTF mouthGuard1;
    public ModelRendererTF mouthGuard2;
    public ModelRendererTF headSpike1;
    public ModelRendererTF headSpike2;
    public ModelRendererTF upperEar1;
    public ModelRendererTF cheek1;
    public ModelRendererTF upperEar2;
    public ModelRendererTF cheek2;
    public ModelRendererTF headTop2;
    public ModelRendererTF headTop3;

    public ModelOptimusPrime()
    {
        super(1, 0.8F, new AnimationModifier(Type.DEGREE, isBacking(), 0.5F));
        textureWidth = 64;
        textureHeight = 128;
        lowerEar1 = new ModelRendererTF(this, 49, 51);
        lowerEar1.setRotationPoint(-3, -2, -4);
        lowerEar1.addBox(-2, -2, -2, 2, 4, 4, 0);
        setRotateAngle(lowerEar1, 0, -0.7853981633974483F, 0);
        lowerArm2 = new ModelRendererTF(this, 12, 20);
        lowerArm2.mirror = true;
        lowerArm2.setRotationPoint(0, 1.6F, 0);
        lowerArm2.addBox(-1.5F, 0, -1.5F, 3, 5, 3, 0);
        setRotateAngle(lowerArm2, -0.20943951023931953F, 0, 0.06981317007977318F);
        smokeStack1 = new ModelRendererTF(this, 48, 6);
        smokeStack1.setRotationPoint(-2.7F, 0, 0);
        smokeStack1.addBox(-1, -3, -0.5F, 1, 5, 1, 0);
        toeBase1 = new ModelRendererTF(this, 10, 18);
        toeBase1.setRotationPoint(0, 0, -0.8F);
        toeBase1.addBox(-1.5F, -0.5F, -1, 3, 1, 1, 0);
        upperEar2 = new ModelRendererTF(this, 56, 60);
        upperEar2.mirror = true;
        upperEar2.setRotationPoint(0.7F, -1.7F, 0.8F);
        upperEar2.addBox(-0.5F, -10, -1.5F, 1, 13, 3, 0);
        setRotateAngle(upperEar2, -0.08726646259971647F, 0, 0.08726646259971647F);
        mouthGuard1 = new ModelRendererTF(this, 24, 51);
        mouthGuard1.setRotationPoint(3.5F, -1.5F, -3.5F);
        mouthGuard1.addBox(-4, -3, -1, 5, 6, 1, 0);
        armConnector2 = new ModelRendererTF(this, 23, 26);
        armConnector2.mirror = true;
        armConnector2.setRotationPoint(3.5F, -3.7F, 0);
        armConnector2.addBox(0, -1, -1, 1, 3, 2, 0);
        wheel6 = new ModelRendererTF(this, 48, 0);
        wheel6.mirror = true;
        wheel6.setRotationPoint(0.7F, 7.1F, 0);
        wheel6.addBox(0, -1.5F, -1.5F, 2, 3, 3, 0);
        upperFootExtension1 = new ModelRendererTF(this, 0, 18);
        upperFootExtension1.setRotationPoint(0, -0.54F, 0.85F);
        upperFootExtension1.addBox(-2, -1, -1, 4, 1, 1, 0);
        setRotateAngle(upperFootExtension1, 0.45378560551852565F, 0, 0);
        leftLegIndentFrame2 = new ModelRendererTF(this, 14, 13);
        leftLegIndentFrame2.mirror = true;
        leftLegIndentFrame2.setRotationPoint(-1.5F, 2, -0.75F);
        leftLegIndentFrame2.addBox(-0.5F, -1, -1, 1, 3, 1, 0);
        rightLegVent3 = new ModelRendererTF(this, 36, 14);
        rightLegVent3.setRotationPoint(0, -1.3F, -0.2F);
        rightLegVent3.addBox(-1, -0.5F, -1, 2, 1, 1, 0);
        setRotateAngle(rightLegVent3, 1.0471975511965976F, 0, 0);
        lowerEar2 = new ModelRendererTF(this, 49, 51);
        lowerEar2.mirror = true;
        lowerEar2.setRotationPoint(4, -2, 3);
        lowerEar2.addBox(0, -2, -2, 2, 4, 4, 0);
        setRotateAngle(lowerEar2, 0, -0.7853981633974483F, 0);
        headTop1 = new ModelRendererTF(this, 0, 69);
        headTop1.setRotationPoint(0, -6.5F, 0);
        headTop1.addBox(-4.5F, -3, -4.5F, 9, 3, 9, 0);
        mouthGuard2 = new ModelRendererTF(this, 24, 51);
        mouthGuard2.mirror = true;
        mouthGuard2.setRotationPoint(3.6F, -1.5F, -3.5F);
        mouthGuard2.addBox(-1, -3, -1, 5, 6, 1, 0);
        setRotateAngle(mouthGuard2, 0, -1.5707963267948966F, 0);
        leftLegVent1 = new ModelRendererTF(this, 36, 14);
        leftLegVent1.mirror = true;
        leftLegVent1.setRotationPoint(0, -2.1F, -0.2F);
        leftLegVent1.addBox(-1, -0.5F, -1, 2, 1, 1, 0);
        setRotateAngle(leftLegVent1, 1.0471975511965976F, 0, 0);
        rightLegVent6 = new ModelRendererTF(this, 36, 14);
        rightLegVent6.setRotationPoint(0, -0.1F, -0.2F);
        rightLegVent6.addBox(-1, -0.5F, -1, 2, 1, 1, 0);
        setRotateAngle(rightLegVent6, 1.0471975511965976F, 0, 0);
        wheel1 = new ModelRendererTF(this, 48, 0);
        wheel1.setRotationPoint(-1.8F, -0.6F, 0);
        wheel1.addBox(-2, -1.5F, -1.5F, 2, 3, 3, 0);
        setRotateAngle(wheel1, 0, 0.15707963267948966F, 0.12217304763960307F);
        rightLegIndent2 = new ModelRendererTF(this, 14, 7);
        rightLegIndent2.setRotationPoint(0, 6, -1.05F);
        rightLegIndent2.addBox(-1, -2, -1, 2, 5, 1, 0);
        legPipe1 = new ModelRendererTF(this, 32, 14);
        legPipe1.setRotationPoint(-2, 1.2F, 0);
        legPipe1.addBox(-1, -1, -0.5F, 1, 2, 1, 0);
        lowerFootExtension2 = new ModelRendererTF(this, 4, 16);
        lowerFootExtension2.mirror = true;
        lowerFootExtension2.setRotationPoint(0, -0.1F, -0.5F);
        lowerFootExtension2.addBox(-2, -1, -0.5F, 4, 1, 1, 0);
        rightLegIndentFrame1 = new ModelRendererTF(this, 4, 12);
        rightLegIndentFrame1.setRotationPoint(0, 0.5F, -0.75F);
        rightLegIndentFrame1.addBox(-2, -0.5F, -1, 4, 1, 1, 0);
        rightLegVent1 = new ModelRendererTF(this, 36, 14);
        rightLegVent1.setRotationPoint(0, -2.1F, -0.2F);
        rightLegVent1.addBox(-1, -0.5F, -1, 2, 1, 1, 0);
        setRotateAngle(rightLegVent1, 1.0471975511965976F, 0, 0);
        lowerLeg2 = new ModelRendererTF(this, 0, 0);
        lowerLeg2.mirror = true;
        lowerLeg2.setRotationPoint(0, 4.7F, -0.25F);
        lowerLeg2.addBox(-2, 0, -1.25F, 4, 9, 3, 0);
        setRotateAngle(lowerLeg2, 0.24434609527920614F, -0.05235987755982988F, 0.06981317007977318F);
        toeExtension2 = new ModelRendererTF(this, 18, 17);
        toeExtension2.mirror = true;
        toeExtension2.setRotationPoint(0, -0.04F, 0.35F);
        toeExtension2.addBox(-1.5F, -1, -1, 3, 1, 2, 0);
        setRotateAngle(toeExtension2, 0.45378560551852565F, 0, 0);
        rightLegIndent1 = new ModelRendererTF(this, 20, 7);
        rightLegIndent1.setRotationPoint(0, 3, -0.65F);
        rightLegIndent1.addBox(-1, -2, -1, 2, 3, 1, 0);
        wheel3 = new ModelRendererTF(this, 48, 0);
        wheel3.setRotationPoint(-0.7F, 3.9F, 0);
        wheel3.addBox(-2, -1.5F, -1.5F, 2, 3, 3, 0);
        leftLegIndentFrame6 = new ModelRendererTF(this, 0, 12);
        leftLegIndentFrame6.setRotationPoint(1.5F, 6, -1.25F);
        leftLegIndentFrame6.addBox(-0.5F, -2, -1, 1, 5, 1, 0);
        headBase = new ModelRendererTF(this, 0, 50);
        headBase.setRotationPoint(0, 0, 0);
        headBase.addBox(-4, -11, -4, 8, 11, 8, 0);
        setRotateAngle(headBase, 0, 0.7853981633974483F, 0);
        legPipe2 = new ModelRendererTF(this, 32, 14);
        legPipe2.mirror = true;
        legPipe2.setRotationPoint(2, 1.2F, 0);
        legPipe2.addBox(0, -1, -0.5F, 1, 2, 1, 0);
        upperLegTile2 = new ModelRendererTF(this, 18, 14);
        upperLegTile2.mirror = true;
        upperLegTile2.setRotationPoint(0, 5, -1.3F);
        upperLegTile2.addBox(-1, -2, -0.5F, 2, 2, 1, 0);
        setRotateAngle(upperLegTile2, -0.08726646259971647F, 0.0017453292519943296F, 0);
        hand2 = new ModelRendererTF(this, 0, 31);
        hand2.mirror = true;
        hand2.setRotationPoint(0, 4.7F, 0);
        hand2.addBox(-1, 0, -1, 2, 2, 2, 0);
        setRotateAngle(hand2, -0.12217304763960307F, 0, 0.17453292519943295F);
        lowerFootExtension1 = new ModelRendererTF(this, 4, 16);
        lowerFootExtension1.setRotationPoint(0, -0.1F, -0.5F);
        lowerFootExtension1.addBox(-2, -1, -0.5F, 4, 1, 1, 0);
        upperArmPiece2 = new ModelRendererTF(this, 17, 32);
        upperArmPiece2.mirror = true;
        upperArmPiece2.setRotationPoint(2.5F, 2.1F, 0);
        upperArmPiece2.addBox(-0.5F, 0, -1.5F, 1, 1, 3, 0);
        leftLegIndent1 = new ModelRendererTF(this, 20, 7);
        leftLegIndent1.mirror = true;
        leftLegIndent1.setRotationPoint(0, 3, -0.65F);
        leftLegIndent1.addBox(-1, -2, -1, 2, 3, 1, 0);
        waistPanel1 = new ModelRendererTF(this, 24, 14);
        waistPanel1.setRotationPoint(-1.7F, -1.4F, -1);
        waistPanel1.addBox(-1.8F, -1, -1, 3, 2, 1, 0);
        setRotateAngle(waistPanel1, 0, 0, 0.20943951023931953F);
        cheek2 = new ModelRendererTF(this, 36, 63);
        cheek2.mirror = true;
        cheek2.setRotationPoint(-2.2F, -0.4F, -0.5F);
        cheek2.addBox(-3, -2, -3, 6, 4, 3, 0);
        setRotateAngle(cheek2, 0.3871140280923423F, -0.8035495876181893F, -0.5152211951887261F);
        upperLegBack2 = new ModelRendererTF(this, 24, 0);
        upperLegBack2.setRotationPoint(0, 2.5F, 0.5F);
        upperLegBack2.addBox(-1, -2.5F, 0, 2, 5, 1, 0);
        wheel4 = new ModelRendererTF(this, 48, 0);
        wheel4.mirror = true;
        wheel4.setRotationPoint(0.7F, 3.9F, 0);
        wheel4.addBox(0, -1.5F, -1.5F, 2, 3, 3, 0);
        upperLights1 = new ModelRendererTF(this, 43, 19);
        upperLights1.setRotationPoint(-0.5F, 0.2F, -0.3F);
        upperLights1.addBox(-1, -0.5F, -1, 2, 1, 1, 0);
        setRotateAngle(upperLights1, -0.6632251157578453F, 0, 0);
        cheek1 = new ModelRendererTF(this, 36, 63);
        cheek1.setRotationPoint(2.2F, -0.4F, -0.5F);
        cheek1.addBox(-3, -2, -3, 6, 4, 3, 0);
        setRotateAngle(cheek1, 0.3871140280923423F, 0.8035495876181893F, 0.5152211951887261F);
        elbowJoint2 = new ModelRendererTF(this, 0, 27);
        elbowJoint2.mirror = true;
        elbowJoint2.setRotationPoint(1.5F, 2.5F, 0);
        elbowJoint2.addBox(-1, 0, -1, 2, 2, 2, 0);
        leftLegVent6 = new ModelRendererTF(this, 36, 14);
        leftLegVent6.mirror = true;
        leftLegVent6.setRotationPoint(0, -0.1F, -0.2F);
        leftLegVent6.addBox(-1, -0.5F, -1, 2, 1, 1, 0);
        setRotateAngle(leftLegVent6, 1.0471975511965976F, 0, 0);
        footBase2 = new ModelRendererTF(this, 4, 16);
        footBase2.mirror = true;
        footBase2.setRotationPoint(0, 2.5F, -0.9F);
        footBase2.addBox(-2, -0.5F, -1, 4, 1, 1, 0);
        setRotateAngle(footBase2, -0.10471975511965977F, 0, 0.017453292519943295F);
        torsoFrontUpper2 = new ModelRendererTF(this, 43, 17);
        torsoFrontUpper2.mirror = true;
        torsoFrontUpper2.setRotationPoint(-0.04F, -2.27F, -0.1F);
        torsoFrontUpper2.addBox(-2, -0.5F, -1, 4, 1, 1, 0);
        setRotateAngle(torsoFrontUpper2, 0.4363323129985824F, 0, -0.03490658503988659F);
        torsoFront1 = new ModelRendererTF(this, 44, 12);
        torsoFront1.setRotationPoint(-1.79F, -2.2F, -2);
        torsoFront1.addBox(-2, -2, -1, 4, 4, 1, 0);
        setRotateAngle(torsoFront1, 0, 0.17453292519943295F, 0);
        torsoSide2 = new ModelRendererTF(this, 54, 2);
        torsoSide2.setRotationPoint(3.5F, -2.6F, -2.3F);
        torsoSide2.addBox(-0.5F, -2, 0, 1, 4, 4, 0);
        setRotateAngle(torsoSide2, 0.17453292519943295F, 0, 0.10471975511965977F);
        lowerLeg1 = new ModelRendererTF(this, 0, 0);
        lowerLeg1.setRotationPoint(0, 4.7F, -0.25F);
        lowerLeg1.addBox(-2, 0, -1.25F, 4, 9, 3, 0);
        setRotateAngle(lowerLeg1, 0.24434609527920614F, 0.05235987755982988F, -0.06981317007977318F);
        leftLegVent2 = new ModelRendererTF(this, 36, 14);
        leftLegVent2.mirror = true;
        leftLegVent2.setRotationPoint(0, -1.7F, -0.2F);
        leftLegVent2.addBox(-1, -0.5F, -1, 2, 1, 1, 0);
        setRotateAngle(leftLegVent2, 1.0471975511965976F, 0, 0);
        eye1 = new ModelRendererTF(this, 0, 51);
        eye1.setRotationPoint(1, -5.5F, -3.5F);
        eye1.addBox(-1.5F, -0.5F, -1, 3, 1, 1, 0);
        setRotateAngle(eye1, 0, -0.17453292519943295F, 0);
        grill = new ModelRendererTF(this, 29, 26);
        grill.setRotationPoint(0, -4, -1.5F);
        grill.addBox(-1.5F, -2, -1, 3, 4, 1, 0);
        setRotateAngle(grill, 0.17453292519943295F, 0, 0);
        upperLegBack1 = new ModelRendererTF(this, 24, 0);
        upperLegBack1.setRotationPoint(0, 2.5F, 0.5F);
        upperLegBack1.addBox(-1, -2.5F, 0, 2, 5, 1, 0);
        rightLegIndentFrame5 = new ModelRendererTF(this, 0, 12);
        rightLegIndentFrame5.setRotationPoint(-1.5F, 6, -1.25F);
        rightLegIndentFrame5.addBox(-0.5F, -2, -1, 1, 5, 1, 0);
        waistPanel2 = new ModelRendererTF(this, 24, 14);
        waistPanel2.mirror = true;
        waistPanel2.setRotationPoint(1.7F, -1.4F, -1);
        waistPanel2.addBox(-1.2F, -1, -1, 3, 2, 1, 0);
        setRotateAngle(waistPanel2, 0, 0, -0.20943951023931953F);
        windshield2 = new ModelRendererTF(this, 40, 8);
        windshield2.mirror = true;
        windshield2.setRotationPoint(0, 0, -0.15F);
        windshield2.addBox(-1.5F, -1.5F, -1, 3, 3, 1, 0);
        eye2 = new ModelRendererTF(this, 0, 51);
        eye2.mirror = true;
        eye2.setRotationPoint(3.5F, -5.5F, -1);
        eye2.addBox(-1.5F, -0.5F, -1, 3, 1, 1, 0);
        setRotateAngle(eye2, 0, -1.3962634015954636F, 0);
        rightLegIndentFrame2 = new ModelRendererTF(this, 14, 13);
        rightLegIndentFrame2.setRotationPoint(-1.5F, 2, -0.75F);
        rightLegIndentFrame2.addBox(-0.5F, -1, -1, 1, 3, 1, 0);
        rightLegVent5 = new ModelRendererTF(this, 36, 14);
        rightLegVent5.setRotationPoint(0, -0.5F, -0.2F);
        rightLegVent5.addBox(-1, -0.5F, -1, 2, 1, 1, 0);
        setRotateAngle(rightLegVent5, 1.0471975511965976F, 0, 0);
        leftLegVent4 = new ModelRendererTF(this, 36, 14);
        leftLegVent4.mirror = true;
        leftLegVent4.setRotationPoint(0, -0.9F, -0.2F);
        leftLegVent4.addBox(-1, -0.5F, -1, 2, 1, 1, 0);
        setRotateAngle(leftLegVent4, 1.0471975511965976F, 0, 0);
        lowerArm1 = new ModelRendererTF(this, 12, 20);
        lowerArm1.setRotationPoint(0, 1.6F, 0);
        lowerArm1.addBox(-1.5F, 0, -1.5F, 3, 5, 3, 0);
        setRotateAngle(lowerArm1, -0.20943951023931953F, 0, -0.06981317007977318F);
        torsoFrontUpper1 = new ModelRendererTF(this, 43, 17);
        torsoFrontUpper1.setRotationPoint(0.05F, -2.27F, -0.1F);
        torsoFrontUpper1.addBox(-2, -0.5F, -1, 4, 1, 1, 0);
        setRotateAngle(torsoFrontUpper1, 0.4363323129985824F, 0, 0.03490658503988659F);
        wheel5 = new ModelRendererTF(this, 48, 0);
        wheel5.setRotationPoint(-0.7F, 7.1F, 0);
        wheel5.addBox(-2, -1.5F, -1.5F, 2, 3, 3, 0);
        toeBase2 = new ModelRendererTF(this, 10, 18);
        toeBase2.mirror = true;
        toeBase2.setRotationPoint(0, 0, -0.8F);
        toeBase2.addBox(-1.5F, -0.5F, -1, 3, 1, 1, 0);
        torso = new ModelRendererTF(this, 24, 17);
        torso.setRotationPoint(0, -1.3F, 0);
        torso.addBox(-3.5F, -4, -2.7F, 7, 4, 5, 0);
        leftLegIndent2 = new ModelRendererTF(this, 14, 7);
        leftLegIndent2.mirror = true;
        leftLegIndent2.setRotationPoint(0, 6, -1.05F);
        leftLegIndent2.addBox(-1, -2, -1, 2, 5, 1, 0);
        neck = new ModelRendererTF(this, 36, 70);
        neck.setRotationPoint(0, -5, -0.5F);
        neck.addBox(-2.5F, -2, -2.5F, 5, 2, 5, 0);
        setRotateAngle(neck, 0.17453292519943295F, 0, 0);
        leftLegIndentFrame4 = new ModelRendererTF(this, 4, 14);
        leftLegIndentFrame4.mirror = true;
        leftLegIndentFrame4.setRotationPoint(0, 4.34F, -1.89F);
        leftLegIndentFrame4.addBox(-2, -1, -0.5F, 4, 1, 1, 0);
        setRotateAngle(leftLegIndentFrame4, -0.7504915783575618F, 0, 0);
        leftLegVent7 = new ModelRendererTF(this, 36, 14);
        leftLegVent7.mirror = true;
        leftLegVent7.setRotationPoint(0, 0.3F, -0.2F);
        leftLegVent7.addBox(-1, -0.5F, -1, 2, 1, 1, 0);
        setRotateAngle(leftLegVent7, 1.0471975511965976F, 0, 0);
        crotchPiece1 = new ModelRendererTF(this, 8, 28);
        crotchPiece1.setRotationPoint(0, 0.3F, -0.3F);
        crotchPiece1.addBox(-1, -3, -2, 2, 3, 4, 0);
        head = new ModelRendererTF(this, 0, 0);
        head.setRotationPoint(0, -2, 0);
        head.addBox(0, 0, 0, 0, 0, 0, 0);
        leftLegIndentFrame3 = new ModelRendererTF(this, 14, 13);
        leftLegIndentFrame3.setRotationPoint(1.5F, 2, -0.75F);
        leftLegIndentFrame3.addBox(-0.5F, -1, -1, 1, 3, 1, 0);
        upperEar1 = new ModelRendererTF(this, 56, 60);
        upperEar1.setRotationPoint(-0.7F, -1.7F, 0.8F);
        upperEar1.addBox(-0.5F, -10, -1.5F, 1, 13, 3, 0);
        setRotateAngle(upperEar1, -0.08726646259971647F, 0, -0.08726646259971647F);
        torsoTop = new ModelRendererTF(this, 32, 26);
        torsoTop.setRotationPoint(0, -5.04F, 2.3F);
        torsoTop.addBox(-3.5F, -0.5F, -5, 7, 3, 5, 0);
        setRotateAngle(torsoTop, 0.17453292519943295F, 0, 0);
        torsoSide1 = new ModelRendererTF(this, 54, 2);
        torsoSide1.setRotationPoint(-3.5F, -2.6F, -2.3F);
        torsoSide1.addBox(-0.5F, -2, 0, 1, 4, 4, 0);
        setRotateAngle(torsoSide1, 0.17453292519943295F, 0, -0.10471975511965977F);
        hand1 = new ModelRendererTF(this, 0, 31);
        hand1.setRotationPoint(0, 4.7F, 0);
        hand1.addBox(-1, 0, -1, 2, 2, 2, 0);
        setRotateAngle(hand1, -0.12217304763960307F, 0, -0.17453292519943295F);
        upperArm1 = new ModelRendererTF(this, 0, 20);
        upperArm1.setRotationPoint(-0.8F, 0.2F, 0);
        upperArm1.addBox(-3, -1.5F, -1.5F, 3, 4, 3, 0);
        setRotateAngle(upperArm1, 0.06981317007977318F, 0, 0.10471975511965977F);
        rightLegIndentFrame3 = new ModelRendererTF(this, 14, 13);
        rightLegIndentFrame3.mirror = true;
        rightLegIndentFrame3.setRotationPoint(1.5F, 2, -0.75F);
        rightLegIndentFrame3.addBox(-0.5F, -1, -1, 1, 3, 1, 0);
        leftLegVent5 = new ModelRendererTF(this, 36, 14);
        leftLegVent5.mirror = true;
        leftLegVent5.setRotationPoint(0, -0.5F, -0.2F);
        leftLegVent5.addBox(-1, -0.5F, -1, 2, 1, 1, 0);
        setRotateAngle(leftLegVent5, 1.0471975511965976F, 0, 0);
        smokeStack2 = new ModelRendererTF(this, 48, 6);
        smokeStack2.mirror = true;
        smokeStack2.setRotationPoint(2.7F, 0, 0);
        smokeStack2.addBox(0, -3, -0.5F, 1, 5, 1, 0);
        rightLegVent7 = new ModelRendererTF(this, 36, 14);
        rightLegVent7.setRotationPoint(0, 0.3F, -0.2F);
        rightLegVent7.addBox(-1, -0.5F, -1, 2, 1, 1, 0);
        setRotateAngle(rightLegVent7, 1.0471975511965976F, 0, 0);
        headSpike1 = new ModelRendererTF(this, 0, 53);
        headSpike1.setRotationPoint(-3.2F, -8.5F, -3.2F);
        headSpike1.addBox(-0.5F, -3, -1, 1, 3, 2, 0);
        setRotateAngle(headSpike1, 0, -0.7853981633974483F, 0);
        rightLegIndentFrame6 = new ModelRendererTF(this, 0, 12);
        rightLegIndentFrame6.mirror = true;
        rightLegIndentFrame6.setRotationPoint(1.5F, 6, -1.25F);
        rightLegIndentFrame6.addBox(-0.5F, -2, -1, 1, 5, 1, 0);
        headSpike2 = new ModelRendererTF(this, 0, 53);
        headSpike2.mirror = true;
        headSpike2.setRotationPoint(3.2F, -8.5F, 3.2F);
        headSpike2.addBox(-0.5F, -3, -1, 1, 3, 2, 0);
        setRotateAngle(headSpike2, 0, -0.7853981633974483F, 0);
        upperArm2 = new ModelRendererTF(this, 0, 20);
        upperArm2.mirror = true;
        upperArm2.setRotationPoint(0.8F, 0.2F, 0);
        upperArm2.addBox(0, -1.5F, -1.5F, 3, 4, 3, 0);
        setRotateAngle(upperArm2, 0.06981317007977318F, 0, -0.10471975511965977F);
        leftLegVent3 = new ModelRendererTF(this, 36, 14);
        leftLegVent3.mirror = true;
        leftLegVent3.setRotationPoint(0, -1.3F, -0.2F);
        leftLegVent3.addBox(-1, -0.5F, -1, 2, 1, 1, 0);
        setRotateAngle(leftLegVent3, 1.0471975511965976F, 0, 0);
        rightLegVent2 = new ModelRendererTF(this, 36, 14);
        rightLegVent2.setRotationPoint(0, -1.7F, -0.2F);
        rightLegVent2.addBox(-1, -0.5F, -1, 2, 1, 1, 0);
        setRotateAngle(rightLegVent2, 1.0471975511965976F, 0, 0);
        windshield1 = new ModelRendererTF(this, 40, 8);
        windshield1.setRotationPoint(0, 0, -0.15F);
        windshield1.addBox(-1.5F, -1.5F, -1, 3, 3, 1, 0);
        upperFootExtension2 = new ModelRendererTF(this, 0, 18);
        upperFootExtension2.mirror = true;
        upperFootExtension2.setRotationPoint(0, -0.54F, 0.85F);
        upperFootExtension2.addBox(-2, -1, -1, 4, 1, 1, 0);
        setRotateAngle(upperFootExtension2, 0.45378560551852565F, 0, 0);
        wheel2 = new ModelRendererTF(this, 48, 0);
        wheel2.mirror = true;
        wheel2.setRotationPoint(1.8F, -0.6F, 0);
        wheel2.addBox(0, -1.5F, -1.5F, 2, 3, 3, 0);
        setRotateAngle(wheel2, 0, -0.15707963267948966F, -0.12217304763960307F);
        upperLights2 = new ModelRendererTF(this, 43, 19);
        upperLights2.mirror = true;
        upperLights2.setRotationPoint(0.5F, 0.2F, -0.3F);
        upperLights2.addBox(-1, -0.5F, -1, 2, 1, 1, 0);
        setRotateAngle(upperLights2, -0.6632251157578453F, 0, 0);
        upperLeg1 = new ModelRendererTF(this, 14, 0);
        upperLeg1.setRotationPoint(-2, -0.1F, 0);
        upperLeg1.addBox(-1.5F, 0, -1.5F, 3, 5, 2, 0);
        setRotateAngle(upperLeg1, -0.13962634015954636F, 0.08726646259971647F, 0.10471975511965977F);
        headTop2 = new ModelRendererTF(this, 32, 50);
        headTop2.setRotationPoint(1.1F, -1, -1.1F);
        headTop2.addBox(-2, -4, -4.5F, 4, 4, 9, 0);
        setRotateAngle(headTop2, 0, -0.7853981633974483F, 0);
        torsoConnector = new ModelRendererTF(this, 22, 8);
        torsoConnector.setRotationPoint(0, -4.3F, 0);
        torsoConnector.addBox(-3.5F, -2, -2, 7, 2, 4, 0);
        torsoFront2 = new ModelRendererTF(this, 44, 12);
        torsoFront2.mirror = true;
        torsoFront2.setRotationPoint(1.79F, -2.2F, -2);
        torsoFront2.addBox(-2, -2, -1, 4, 4, 1, 0);
        setRotateAngle(torsoFront2, 0, -0.17453292519943295F, 0);
        leftLegIndentFrame1 = new ModelRendererTF(this, 4, 12);
        leftLegIndentFrame1.mirror = true;
        leftLegIndentFrame1.setRotationPoint(0, 0.5F, -0.75F);
        leftLegIndentFrame1.addBox(-2, -0.5F, -1, 4, 1, 1, 0);
        toeExtension1 = new ModelRendererTF(this, 18, 17);
        toeExtension1.setRotationPoint(0, -0.04F, 0.35F);
        toeExtension1.addBox(-1.5F, -1, -1, 3, 1, 2, 0);
        setRotateAngle(toeExtension1, 0.45378560551852565F, 0, 0);
        leftLegIndentFrame5 = new ModelRendererTF(this, 0, 12);
        leftLegIndentFrame5.mirror = true;
        leftLegIndentFrame5.setRotationPoint(-1.5F, 6, -1.25F);
        leftLegIndentFrame5.addBox(-0.5F, -2, -1, 1, 5, 1, 0);
        headTop3 = new ModelRendererTF(this, 27, 65);
        headTop3.setRotationPoint(0, -2, -3.5F);
        headTop3.addBox(-1, -2.5F, -1.5F, 2, 5, 5, 0);
        crotchPiece3 = new ModelRendererTF(this, 6, 27);
        crotchPiece3.setRotationPoint(0, 0.65F, -0.65F);
        crotchPiece3.addBox(-1, -0.5F, -1, 2, 1, 1, 0);
        setRotateAngle(crotchPiece3, -0.7853981633974483F, 0, 0);
        headConnector = new ModelRendererTF(this, 0, 0);
        headConnector.setRotationPoint(0, 0.4F, -0.5F);
        headConnector.addBox(0, 0, 0, 0, 0, 0, 0);
        setRotateAngle(headConnector, -0.17453292519943295F, 0, 0);
        waist = new ModelRendererTF(this, 30, 0);
        waist.setRotationPoint(0, 10.6F, 0);
        waist.addBox(-3, -5, -1.5F, 6, 5, 3, 0);
        armConnector1 = new ModelRendererTF(this, 23, 26);
        armConnector1.setRotationPoint(-3.5F, -3.7F, 0);
        armConnector1.addBox(-1, -1, -1, 1, 3, 2, 0);
        footBase1 = new ModelRendererTF(this, 4, 16);
        footBase1.setRotationPoint(0, 2.5F, -0.9F);
        footBase1.addBox(-2, -0.5F, -1, 4, 1, 1, 0);
        setRotateAngle(footBase1, -0.10471975511965977F, 0, -0.017453292519943295F);
        elbowJoint1 = new ModelRendererTF(this, 0, 27);
        elbowJoint1.setRotationPoint(-1.5F, 2.5F, 0);
        elbowJoint1.addBox(-1, 0, -1, 2, 2, 2, 0);
        upperLeg2 = new ModelRendererTF(this, 14, 0);
        upperLeg2.mirror = true;
        upperLeg2.setRotationPoint(2, -0.1F, 0);
        upperLeg2.addBox(-1.5F, 0, -1.5F, 3, 5, 2, 0);
        setRotateAngle(upperLeg2, -0.13962634015954636F, -0.08726646259971647F, -0.10471975511965977F);
        rightLegVent4 = new ModelRendererTF(this, 36, 14);
        rightLegVent4.setRotationPoint(0, -0.9F, -0.2F);
        rightLegVent4.addBox(-1, -0.5F, -1, 2, 1, 1, 0);
        setRotateAngle(rightLegVent4, 1.0471975511965976F, 0, 0);
        rightLegIndentFrame4 = new ModelRendererTF(this, 4, 14);
        rightLegIndentFrame4.setRotationPoint(0, 4.34F, -1.89F);
        rightLegIndentFrame4.addBox(-2, -1, -0.5F, 4, 1, 1, 0);
        setRotateAngle(rightLegIndentFrame4, -0.7504915783575618F, 0, 0);
        upperLegTile1 = new ModelRendererTF(this, 18, 14);
        upperLegTile1.setRotationPoint(0, 5, -1.3F);
        upperLegTile1.addBox(-1, -2, -0.5F, 2, 2, 1, 0);
        setRotateAngle(upperLegTile1, -0.08726646259971647F, 0.0017453292519943296F, 0);
        crotchPiece2 = new ModelRendererTF(this, 16, 28);
        crotchPiece2.setRotationPoint(0, -0.3F, 0);
        crotchPiece2.addBox(-1, 0, -1, 2, 1, 3, 0);
        upperArmPiece1 = new ModelRendererTF(this, 17, 32);
        upperArmPiece1.setRotationPoint(-2.5F, 2.1F, 0);
        upperArmPiece1.addBox(-0.5F, 0, -1.5F, 1, 1, 3, 0);
        headBase.addChild(lowerEar1);
        elbowJoint2.addChild(lowerArm2);
        upperArm1.addChild(smokeStack1);
        footBase1.addChild(toeBase1);
        lowerEar2.addChild(upperEar2);
        headBase.addChild(mouthGuard1);
        torso.addChild(armConnector2);
        lowerLeg2.addChild(wheel6);
        lowerFootExtension1.addChild(upperFootExtension1);
        lowerLeg2.addChild(leftLegIndentFrame2);
        rightLegIndent2.addChild(rightLegVent3);
        headBase.addChild(lowerEar2);
        headBase.addChild(headTop1);
        headBase.addChild(mouthGuard2);
        leftLegIndent2.addChild(leftLegVent1);
        rightLegIndent2.addChild(rightLegVent6);
        waist.addChild(wheel1);
        lowerLeg1.addChild(rightLegIndent2);
        lowerLeg1.addChild(legPipe1);
        footBase2.addChild(lowerFootExtension2);
        lowerLeg1.addChild(rightLegIndentFrame1);
        rightLegIndent2.addChild(rightLegVent1);
        upperLeg2.addChild(lowerLeg2);
        toeBase2.addChild(toeExtension2);
        lowerLeg1.addChild(rightLegIndent1);
        lowerLeg1.addChild(wheel3);
        lowerLeg2.addChild(leftLegIndentFrame6);
        head.addChild(headBase);
        lowerLeg2.addChild(legPipe2);
        upperLeg2.addChild(upperLegTile2);
        lowerArm2.addChild(hand2);
        footBase1.addChild(lowerFootExtension1);
        upperArm2.addChild(upperArmPiece2);
        lowerLeg2.addChild(leftLegIndent1);
        waist.addChild(waistPanel1);
        lowerEar2.addChild(cheek2);
        upperLeg2.addChild(upperLegBack2);
        lowerLeg2.addChild(wheel4);
        torsoFrontUpper1.addChild(upperLights1);
        lowerEar1.addChild(cheek1);
        upperArm2.addChild(elbowJoint2);
        leftLegIndent2.addChild(leftLegVent6);
        leftLegIndent2.addChild(footBase2);
        torsoFront2.addChild(torsoFrontUpper2);
        torso.addChild(torsoFront1);
        torso.addChild(torsoSide2);
        upperLeg1.addChild(lowerLeg1);
        leftLegIndent2.addChild(leftLegVent2);
        headBase.addChild(eye1);
        waist.addChild(grill);
        upperLeg1.addChild(upperLegBack1);
        lowerLeg1.addChild(rightLegIndentFrame5);
        waist.addChild(waistPanel2);
        torsoFront2.addChild(windshield2);
        headBase.addChild(eye2);
        lowerLeg1.addChild(rightLegIndentFrame2);
        rightLegIndent2.addChild(rightLegVent5);
        leftLegIndent2.addChild(leftLegVent4);
        elbowJoint1.addChild(lowerArm1);
        torsoFront1.addChild(torsoFrontUpper1);
        lowerLeg1.addChild(wheel5);
        footBase2.addChild(toeBase2);
        torsoConnector.addChild(torso);
        lowerLeg2.addChild(leftLegIndent2);
        torso.addChild(neck);
        lowerLeg2.addChild(leftLegIndentFrame4);
        leftLegIndent2.addChild(leftLegVent7);
        waist.addChild(crotchPiece1);
        headConnector.addChild(head);
        lowerLeg2.addChild(leftLegIndentFrame3);
        lowerEar1.addChild(upperEar1);
        torso.addChild(torsoTop);
        torso.addChild(torsoSide1);
        lowerArm1.addChild(hand1);
        armConnector1.addChild(upperArm1);
        lowerLeg1.addChild(rightLegIndentFrame3);
        leftLegIndent2.addChild(leftLegVent5);
        upperArm2.addChild(smokeStack2);
        rightLegIndent2.addChild(rightLegVent7);
        headBase.addChild(headSpike1);
        lowerLeg1.addChild(rightLegIndentFrame6);
        headBase.addChild(headSpike2);
        armConnector2.addChild(upperArm2);
        leftLegIndent2.addChild(leftLegVent3);
        rightLegIndent2.addChild(rightLegVent2);
        torsoFront1.addChild(windshield1);
        lowerFootExtension2.addChild(upperFootExtension2);
        waist.addChild(wheel2);
        torsoFrontUpper2.addChild(upperLights2);
        waist.addChild(upperLeg1);
        headTop1.addChild(headTop2);
        waist.addChild(torsoConnector);
        torso.addChild(torsoFront2);
        lowerLeg2.addChild(leftLegIndentFrame1);
        toeBase1.addChild(toeExtension1);
        lowerLeg2.addChild(leftLegIndentFrame5);
        headTop2.addChild(headTop3);
        crotchPiece2.addChild(crotchPiece3);
        neck.addChild(headConnector);
        torso.addChild(armConnector1);
        rightLegIndent2.addChild(footBase1);
        upperArm1.addChild(elbowJoint1);
        waist.addChild(upperLeg2);
        rightLegIndent2.addChild(rightLegVent4);
        lowerLeg1.addChild(rightLegIndentFrame4);
        upperLeg1.addChild(upperLegTile1);
        crotchPiece1.addChild(crotchPiece2);
        upperArm1.addChild(upperArmPiece1);

        for (ModelRendererTF modelRenderer : new ModelRendererTF[] {wheel1, wheel2, wheel3, wheel4, wheel5, wheel6})
        {
            float scale = 0.9F;
            modelRenderer.setScale(scale, scale, scale);
        }

        float scale = 0.35F;
        neck.setScale(scale, scale, scale);

        setInitPose();
    }

    @Override
    public Transformer getTransformer()
    {
        return G1TransformerManager.OPTIMUS_PRIME;
    }

    @Override
    public ModelRendererTF getWaist()
    {
        return waist;
    }

    @Override
    public void setupOffsets(EntityPlayer player, float progress, float limbSwing, float limbSwingAmount, float ticks, float rotationYaw, float rotationPitch, boolean wearingHead, boolean wearingChest, boolean wearingLegs, boolean wearingFeet)
    {
        ModelOffset offsets = TFModelHelper.getOffsets(player);
        head.rotationPointX += offsets.headOffsetX;
        head.rotationPointY += offsets.headOffsetY;
        head.rotationPointZ += offsets.headOffsetZ;

        if (!wearingChest && wearingHead)
        {
            neck.rotationPointY += 5.1F;
            neck.rotationPointZ += 0.5F;
        }

        if (wearingChest && !wearingLegs)
        {
            waist.rotationPointY += 1;

            if (!wearingHead)
            {
                offsets.headOffsetY = 1;
            }
        }

        if (!wearingChest && wearingLegs)
        {
            upperLeg1.rotationPointY += 1;
            upperLeg2.rotationPointY += 1;
            lowerLeg1.rotationPointY -= 1;
            lowerLeg2.rotationPointY -= 1;
        }

        if (wearingFeet && !wearingLegs)
        {
//            upperLeg1.rotationPointY = 0;
//            upperLeg2.rotationPointY = 0;
//            footBase1.setRotationPoint(0.65F, 0.5F, 0);
//            footBase2.setRotationPoint(-0.65F, 0.5F, 0);
            footBase1.rotateAngleX += 0.2F;
            footBase2.rotateAngleX += 0.2F;
            footBase1.rotationPointZ += 1;
            footBase2.rotationPointZ += 1;

            if (!wearingChest)
            {
                waist.rotationPointY += 1;
                footBase1.rotationPointY -= 1;
                footBase2.rotationPointY -= 1;
            }
        }

        faceTarget(head, 1, rotationYaw, rotationPitch);
    }

    @Override
    public void doActiveAnimations(EntityPlayer player, float progress, float limbSwing, float limbSwingAmount, float ticks, float rotationYaw, float rotationPitch, boolean wearingHead, boolean wearingChest, boolean wearingLegs, boolean wearingFeet)
    {
        applyDefaultHoldingAnimation(upperArm1, upperArm2, lowerArm1, lowerArm2);
        applyDefaultHittingAnimation(upperArm1, upperArm2, head, torso, lowerArm1, lowerArm2);

        if (isRiding)
        {
            upperArm1.rotateAngleX -= PI / 5F;
            upperArm2.rotateAngleX -= PI / 5F;
            upperLeg1.rotateAngleX -= PI * 2F / 5F;
            upperLeg2.rotateAngleX -= PI * 2F / 5F;

            upperLeg1.rotateAngleY += PI / 10F;
            upperLeg2.rotateAngleY -= PI / 10F;
        }

        if (aimedBow)
        {
            upperArm1.rotateAngleY += -0.1F + head.rotateAngleY;
            upperArm2.rotateAngleY += 0.1F + head.rotateAngleY + 0.4F;
            upperArm1.rotateAngleX += -(PI / 2F) + head.rotateAngleX + 0.5F;
            upperArm2.rotateAngleX += -(PI / 2F) + head.rotateAngleX;
            upperArm1.rotateAngleZ += MathHelper.cos(ticks * 0.09F) * 0.05F + 0.05F;
            upperArm2.rotateAngleZ -= MathHelper.cos(ticks * 0.09F) * 0.05F + 0.05F;
            upperArm1.rotateAngleX += MathHelper.sin(ticks * 0.067F) * 0.05F;
            upperArm2.rotateAngleX -= MathHelper.sin(ticks * 0.067F) * 0.05F;
        }
    }

    @Override
    public void doWalkingAnimations(EntityPlayer player, float progress, float limbSwing, float limbSwingAmount, float ticks, float rotationYaw, float rotationPitch, boolean wearingHead, boolean wearingChest, boolean wearingLegs, boolean wearingFeet)
    {
        waist.rotationPointY -= 3;

        upperLeg1.rotateAngleY += 0.2;
        upperLeg2.rotateAngleY -= 0.2;
        upperLeg1.rotateAngleX -= 0.1;
        upperLeg2.rotateAngleX -= 0.1;
        lowerLeg1.rotateAngleX += 0.1;
        lowerLeg2.rotateAngleX += 0.1;
        lowerArm2.rotateAngleX -= 0.1;
        lowerArm1.rotateAngleX -= 0.1;
        head.rotateAngleX += 0.1;

        if (player.isSneaking())
        {
            globalSpeed = 1.5F;
            globalDegree = 1;
        }

        bob(waist, 1F * globalSpeed, 1.7F * globalDegree, false, limbSwing, limbSwingAmount);
        waist.rotationPointY += 1 * limbSwingAmount + 3;
        walk(waist, 1F * globalSpeed, 0.05F * globalDegree, false, 1, 0.15F * limbSwingAmount * backwardInverter, limbSwing, limbSwingAmount);
        walk(torso, 1F * globalSpeed, 0.05F * globalDegree, false, 1, 0.15F * limbSwingAmount * backwardInverter, limbSwing, limbSwingAmount);
        swing(torso, 0.5F * globalSpeed, 0.6F * globalDegree, true, 0, 0, limbSwing, limbSwingAmount);
        swing(waist, 0.5F * globalSpeed, 0.2F * globalDegree, false, 0, 0, limbSwing, limbSwingAmount);
        walk(head, 1F * globalSpeed, -0.1F * globalDegree, false, 1F, -0.3F * limbSwingAmount * backwardInverter, limbSwing, limbSwingAmount);

        swing(head, 0.5F * globalSpeed, 0.4F * globalDegree, false, 0, 0, limbSwing, limbSwingAmount);
        head.rotationPointX += 0.6 * globalDegree * limbSwingAmount * Math.cos(limbSwing * 0.5F * globalSpeed);

        swing(upperLeg1, 0.5F * globalSpeed, 0.1F * globalDegree, true, 0, -0.2F, limbSwing, limbSwingAmount);
        swing(upperLeg2, 0.5F * globalSpeed, 0.1F * globalDegree, true, 0, 0.2F, limbSwing, limbSwingAmount);
        walk(upperLeg1, 0.5F * globalSpeed, 1.2F * globalDegree, false, 0, 0, limbSwing, limbSwingAmount);
        walk(upperLeg2, 0.5F * globalSpeed, 1.2F * globalDegree, true, 0, 0, limbSwing, limbSwingAmount);
        walk(lowerLeg1, 0.5F * globalSpeed, 1.2F * globalDegree, false, -2.2F * backwardInverter, 0.6F, limbSwing, limbSwingAmount);
        walk(lowerLeg2, 0.5F * globalSpeed, 1.2F * globalDegree, true, -2.2F * backwardInverter, 0.6F, limbSwing, limbSwingAmount);
        walk(upperArm1, 0.5F * globalSpeed, 0.7F * globalDegree, true, 0F, -0.3F * limbSwingAmount * backwardInverter, limbSwing, limbSwingAmount);
        walk(upperArm2, 0.5F * globalSpeed, 0.7F * globalDegree, false, 0F, -0.3F * limbSwingAmount * backwardInverter, limbSwing, limbSwingAmount);
        walk(lowerArm1, 0.5F * globalSpeed, 0.5F * globalDegree, true, -1F * backwardInverter, -0.5F * limbSwingAmount, limbSwing, limbSwingAmount);
        walk(lowerArm2, 0.5F * globalSpeed, 0.5F * globalDegree, false, -1F * backwardInverter, -0.5F * limbSwingAmount, limbSwing, limbSwingAmount);

        if (player.isSneaking())
        {
            waist.rotationPointY -= limbSwingAmount;
            waist.rotateAngleX += 0.3;
            waist.rotationPointZ -= 0;

            head.rotateAngleX -= 0.3;
            upperLeg1.rotateAngleX -= 0.7;
            upperLeg2.rotateAngleX -= 0.7;
            lowerLeg1.rotateAngleX += 0.5;
            lowerLeg2.rotateAngleX += 0.5;
            upperArm1.rotateAngleX -= 0.1;
            upperArm2.rotateAngleX -= 0.1;
            upperArm1.rotateAngleZ += 0.3;
            upperArm2.rotateAngleZ -= 0.3;
            lowerArm1.rotateAngleZ -= 0.4;
            lowerArm2.rotateAngleZ += 0.4;
            lowerArm1.rotateAngleX -= 0.3;
            lowerArm2.rotateAngleX -= 0.3;
            footBase1.rotateAngleX -= 0.1;
            footBase2.rotateAngleX -= 0.1;
        }
    }

    @Override
    public void doIdleAnimations(EntityPlayer player, float progress, float limbSwing, float limbSwingAmount, float ticks, float rotationYaw, float rotationPitch, boolean wearingHead, boolean wearingChest, boolean wearingLegs, boolean wearingFeet)
    {
        walk(torsoConnector, 0.08F, 0.1F, true, 1, 0, ticks, 1F);
        walk(torso, 0.08F, 0.15F, false, 1, 0, ticks, 1F);
        walk(head, 0.08F, 0.05F, true, 1, 0, ticks, 1F);
        walk(upperArm1, 0.08F, 0.05F, true, 1, 0, ticks, 1F);
        walk(upperArm2, 0.08F, 0.05F, true, 1, 0, ticks, 1F);

        flap(upperArm1, 0.08F, 0.05F, true, 1, 0, ticks, 1F);
        flap(upperArm2, 0.08F, 0.05F, false, 1, 0, ticks, 1F);
        walk(lowerArm1, 0.08F, 0.1F, true, 1, 0, ticks, 1F);
        walk(lowerArm2, 0.08F, 0.1F, true, 1, 0, ticks, 1F);
    }

    @Override
    public void doFallingAnimations(EntityPlayer player, float progress, float limbSwing, float limbSwingAmount, float ticks, float rotationYaw, float rotationPitch, boolean wearingHead, boolean wearingChest, boolean wearingLegs, boolean wearingFeet)
    {
        double motionY = TFRenderHelper.getMotionY(player);
        float upwardPose = (float) (1 / (1 + Math.exp(-20 * (motionY + 0.2))));
        float downwardPose = (float) (1 / (1 + Math.exp(10 * (motionY + 0.2))));

        waist.rotateAngleX += 0.2 * limbSwingAmount * backwardInverter;

        torsoConnector.rotateAngleX += 0.2 * upwardPose;
        torso.rotateAngleX -= 0.4 * upwardPose;
        head.rotateAngleX += 0.6 * upwardPose;

        upperArm1.rotateAngleX += 0.1 * upwardPose;
        upperArm2.rotateAngleX += 0.1 * upwardPose;
        upperArm1.rotateAngleZ -= 0.1 * upwardPose;
        upperArm2.rotateAngleZ += 0.1 * upwardPose;
        lowerArm1.rotateAngleX += 0.2 * upwardPose;
        lowerArm2.rotateAngleX += 0.2 * upwardPose;

        upperLeg1.rotateAngleX += 0.2 * upwardPose;
        upperLeg2.rotateAngleX -= 1 * upwardPose;
        lowerLeg1.rotateAngleX += 0.3 * upwardPose;
        lowerLeg2.rotateAngleX += 1.5 * upwardPose;

        walk(upperLeg1, 0.5F * globalSpeed, 0.2F * globalDegree * downwardPose, false, 0, 0, limbSwing, limbSwingAmount);
        walk(upperLeg2, 0.5F * globalSpeed, 0.2F * globalDegree * downwardPose, true, 0, 0, limbSwing, limbSwingAmount);
        walk(lowerLeg1, 0.5F * globalSpeed, 0.2F * globalDegree * downwardPose, false, -2.2F * backwardInverter, 0F, limbSwing, limbSwingAmount);
        walk(lowerLeg2, 0.5F * globalSpeed, 0.2F * globalDegree * downwardPose, true, -2.2F * backwardInverter, 0F, limbSwing, limbSwingAmount);

        waist.rotateAngleX -= 0.2 * downwardPose;
        torsoConnector.rotateAngleX += 0.3 * downwardPose;
        torso.rotateAngleX += 0.3 * downwardPose;
        head.rotateAngleX += 0.3 * downwardPose;
        upperLeg1.rotateAngleX -= 1.2 * downwardPose;
        upperLeg2.rotateAngleX -= 0.2 * downwardPose;
        lowerLeg1.rotateAngleX += 2 * downwardPose;
        lowerLeg2.rotateAngleX += 0.5 * downwardPose;
        upperArm1.rotateAngleZ += 1 * downwardPose;
        upperArm2.rotateAngleZ -= 1 * downwardPose;
        lowerArm1.rotateAngleX -= 1 * downwardPose;
        lowerArm2.rotateAngleX -= 1 * downwardPose;
    }

    @Override
    public void doPartialAnimations(EntityPlayer player, float progress, float limbSwing, float limbSwingAmount, float ticks, float rotationYaw, float rotationPitch, boolean wearingHead, boolean wearingChest, boolean wearingLegs, boolean wearingFeet)
    {
        upperLeg1.setRotationAngles(0, 0, 0);
        upperLeg2.setRotationAngles(0, 0, 0);
        lowerLeg1.setRotationAngles(0, 0, 0);
        lowerLeg2.setRotationAngles(0, 0, 0);

        upperArm1.rotateAngleX += MathHelper.cos(limbSwing * 0.6662F + PI) * 1.4F * limbSwingAmount;
        upperArm2.rotateAngleX += MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;

        upperLeg1.rotateAngleX += MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        upperLeg2.rotateAngleX += MathHelper.cos(limbSwing * 0.6662F + PI) * 1.4F * limbSwingAmount;

        if (isSneak)
        {
            if (wearingChest)
            {
                head.rotateAngleX -= 0.4F;
            }

            waist.rotateAngleX += 0.4F;
            waist.rotationPointZ += 4F;
            waist.rotationPointY -= 1;

            upperArm1.rotateAngleX -= 0.1F;
            upperArm2.rotateAngleX -= 0.1F;

            upperLeg1.rotateAngleX -= 0.5F;
            upperLeg2.rotateAngleX -= 0.5F;

            if (wearingLegs != wearingFeet)
            {
                lowerLeg1.rotationPointY -= 2;
                lowerLeg2.rotationPointY -= 2;
            }
        }
    }

    @Override
    public void doTransformationAnimations(EntityPlayer player, float progress, float limbSwing, float limbSwingAmount, float ticks, float rotationYaw, float rotationPitch, boolean wearingHead, boolean wearingChest, boolean wearingLegs, boolean wearingFeet)
    {
        ModelOptimusPrimeVehicle vehicle = (ModelOptimusPrimeVehicle) getTransformerModel().getVehicleModel();
        float f = Math.min((1 - progress) * 2, 1);

        neck.rotationPointY += progress * 6;
        head.rotateAngleX *= f;
        head.rotateAngleY *= f;
        head.rotateAngleZ *= f;

        rotateTo(waist, vehicle.waist, progress);
        rotateTo(upperLeg1, vehicle.upperLeg1, progress);
        rotateTo(upperLeg2, vehicle.upperLeg2, progress);
        rotateTo(crotchPiece1, vehicle.crotchPiece1, progress);
        rotateTo(waistPanel1, vehicle.waistPanel1, progress);
        rotateTo(waistPanel2, vehicle.waistPanel2, progress);
        rotateTo(wheel1, vehicle.wheel1, progress);
        rotateTo(wheel2, vehicle.wheel2, progress);
        rotateTo(grill, vehicle.grill, progress);
        rotateTo(torsoConnector, vehicle.torsoConnector, progress);
        rotateTo(upperLegBack1, vehicle.upperLegBack1, progress);
        rotateTo(upperLegTile1, vehicle.upperLegTile1, progress);
        rotateTo(lowerLeg1, vehicle.lowerLeg1, progress);
        rotateTo(rightLegIndentFrame1, vehicle.rightLegIndentFrame1, progress);
        rotateTo(rightLegIndentFrame2, vehicle.rightLegIndentFrame2, progress);
        rotateTo(rightLegIndentFrame3, vehicle.rightLegIndentFrame3, progress);
        rotateTo(rightLegIndent1, vehicle.rightLegIndent1, progress);
        rotateTo(rightLegIndentFrame4, vehicle.rightLegIndentFrame4, progress);
        rotateTo(rightLegIndentFrame5, vehicle.rightLegIndentFrame5, progress);
        rotateTo(rightLegIndentFrame6, vehicle.rightLegIndentFrame6, progress);
        rotateTo(rightLegIndent2, vehicle.rightLegIndent2, progress);
        rotateTo(legPipe1, vehicle.legPipe1, progress);
        rotateTo(wheel3, vehicle.wheel3, progress);
        rotateTo(wheel5, vehicle.wheel5, progress);
        rotateTo(footBase1, vehicle.footBase1, progress);
        rotateTo(rightLegVent1, vehicle.rightLegVent1, progress);
        rotateTo(rightLegVent2, vehicle.rightLegVent2, progress);
        rotateTo(rightLegVent3, vehicle.rightLegVent3, progress);
        rotateTo(rightLegVent4, vehicle.rightLegVent4, progress);
        rotateTo(rightLegVent5, vehicle.rightLegVent5, progress);
        rotateTo(rightLegVent6, vehicle.rightLegVent6, progress);
        rotateTo(rightLegVent7, vehicle.rightLegVent7, progress);
        rotateTo(lowerFootExtension1, vehicle.lowerFootExtension1, progress);
        rotateTo(toeBase1, vehicle.toeBase1, progress);
        rotateTo(upperFootExtension1, vehicle.upperFootExtension1, progress);
        rotateTo(toeExtension1, vehicle.toeExtension1, progress);
        rotateTo(upperLegTile2, vehicle.upperLegTile2, progress);
        rotateTo(upperLegBack2, vehicle.upperLegBack2, progress);
        rotateTo(lowerLeg2, vehicle.lowerLeg2, progress);
        rotateTo(leftLegIndentFrame1, vehicle.leftLegIndentFrame1, progress);
        rotateTo(leftLegIndentFrame2, vehicle.leftLegIndentFrame2, progress);
        rotateTo(leftLegIndentFrame3, vehicle.leftLegIndentFrame3, progress);
        rotateTo(leftLegIndent1, vehicle.leftLegIndent1, progress);
        rotateTo(leftLegIndentFrame4, vehicle.leftLegIndentFrame4, progress);
        rotateTo(leftLegIndentFrame5, vehicle.leftLegIndentFrame5, progress);
        rotateTo(leftLegIndentFrame6, vehicle.leftLegIndentFrame6, progress);
        rotateTo(leftLegIndent2, vehicle.leftLegIndent2, progress);
        rotateTo(legPipe2, vehicle.legPipe2, progress);
        rotateTo(wheel4, vehicle.wheel4, progress);
        rotateTo(wheel6, vehicle.wheel6, progress);
        rotateTo(footBase2, vehicle.footBase2, progress);
        rotateTo(leftLegVent1, vehicle.leftLegVent1, progress);
        rotateTo(leftLegVent2, vehicle.leftLegVent2, progress);
        rotateTo(leftLegVent3, vehicle.leftLegVent3, progress);
        rotateTo(leftLegVent4, vehicle.leftLegVent4, progress);
        rotateTo(leftLegVent5, vehicle.leftLegVent5, progress);
        rotateTo(leftLegVent6, vehicle.leftLegVent6, progress);
        rotateTo(leftLegVent7, vehicle.leftLegVent7, progress);
        rotateTo(lowerFootExtension2, vehicle.lowerFootExtension2, progress);
        rotateTo(toeBase2, vehicle.toeBase2, progress);
        rotateTo(upperFootExtension2, vehicle.upperFootExtension2, progress);
        rotateTo(toeExtension2, vehicle.toeExtension2, progress);
        rotateTo(crotchPiece2, vehicle.crotchPiece2, progress);
        rotateTo(crotchPiece3, vehicle.crotchPiece3, progress);
        rotateTo(torso, vehicle.torso, progress);
        rotateTo(torsoFront1, vehicle.torsoFront1, progress);
        rotateTo(torsoFront2, vehicle.torsoFront2, progress);
        rotateTo(armConnector1, vehicle.armConnector1, progress);
        rotateTo(armConnector2, vehicle.armConnector2, progress);
        rotateTo(torsoSide1, vehicle.torsoSide1, progress);
        rotateTo(torsoSide2, vehicle.torsoSide2, progress);
        rotateTo(torsoTop, vehicle.torsoTop, progress);
        rotateTo(torsoFrontUpper1, vehicle.torsoFrontUpper1, progress);
        rotateTo(windshield1, vehicle.windshield1, progress);
        rotateTo(upperLights1, vehicle.upperLights1, progress);
        rotateTo(torsoFrontUpper2, vehicle.torsoFrontUpper2, progress);
        rotateTo(windshield2, vehicle.windshield2, progress);
        rotateTo(upperLights2, vehicle.upperLights2, progress);
        rotateTo(upperArm1, vehicle.upperArm1, progress);
        rotateTo(elbowJoint1, vehicle.elbowJoint1, progress);
        rotateTo(smokeStack1, vehicle.smokeStack1, progress);
        rotateTo(upperArmPiece1, vehicle.upperArmPiece1, progress);
        rotateTo(lowerArm1, vehicle.lowerArm1, progress);
        rotateTo(hand1, vehicle.hand1, progress);
        rotateTo(upperArm2, vehicle.upperArm2, progress);
        rotateTo(elbowJoint2, vehicle.elbowJoint2, progress);
        rotateTo(smokeStack2, vehicle.smokeStack2, progress);
        rotateTo(upperArmPiece2, vehicle.upperArmPiece2, progress);
        rotateTo(lowerArm2, vehicle.lowerArm2, progress);
        rotateTo(hand2, vehicle.hand2, progress);
    }

    @Override
    public void renderArmorPiece(int armorPiece)
    {
        setToInitPose();

        if (armorPiece == 0)
        {
            GL11.glTranslatef(0, 0.0625F, -0.0625F);
            GL11.glRotatef(4, 1, 0, 0);
            GL11.glScalef(0.3F, 0.3F, 0.3F);
            head.render(0.0625F);
        }
        else if (armorPiece == 1)
        {
            GL11.glTranslatef(0, 0, 0.0625F);
            upperLeg1.showModel = false;
            upperLeg2.showModel = false;
            head.showModel = false;
            waist.render(0.0625F);
            upperLeg1.showModel = true;
            upperLeg2.showModel = true;
            head.showModel = true;
        }
        else if (armorPiece == 2)
        {
            footBase1.showModel = false;
            footBase2.showModel = false;
            upperLeg1.render(0.0625F);
            upperLeg2.render(0.0625F);
            footBase1.showModel = true;
            footBase2.showModel = true;
        }
        else if (armorPiece == 3)
        {
//            GL11.glScalef(5, 5, 5);
            GL11.glTranslatef(0, 0.3125F, 0);
            footBase1.rotationPointX -= 3;
            footBase2.rotationPointX += 3;
            footBase1.rotateAngleX += 0.3F;
            footBase1.rotateAngleY += 0.2F;
            footBase2.rotateAngleX += 0.3F;
            footBase2.rotateAngleY -= 0.2F;
            footBase1.render(0.0625F);
            footBase2.render(0.0625F);
        }
    }
}
