package milas_andmetric_gastronomi_mod.client.model;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

// Made with Blockbench 5.0.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelreinaguacaraña extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("milas_and_metric_gastronomy_mod", "modelreinaguacarana"), "main");
	public final ModelPart head;
	public final ModelPart body0;
	public final ModelPart body1;
	public final ModelPart leg0;
	public final ModelPart leg1;
	public final ModelPart leg2;
	public final ModelPart leg3;
	public final ModelPart leg4;
	public final ModelPart leg5;
	public final ModelPart leg6;
	public final ModelPart leg7;
	public final ModelPart corona;

	public Modelreinaguacaraña(ModelPart root) {
		super(root);
		this.head = root.getChild("head");
		this.body0 = root.getChild("body0");
		this.body1 = root.getChild("body1");
		this.leg0 = root.getChild("leg0");
		this.leg1 = root.getChild("leg1");
		this.leg2 = root.getChild("leg2");
		this.leg3 = root.getChild("leg3");
		this.leg4 = root.getChild("leg4");
		this.leg5 = root.getChild("leg5");
		this.leg6 = root.getChild("leg6");
		this.leg7 = root.getChild("leg7");
		this.corona = root.getChild("corona");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 24).addBox(-6.0F, -6.0F, -9.0F, 12.0F, 11.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 15.0F, -3.0F));
		PartDefinition body0 = partdefinition.addOrReplaceChild("body0", CubeListBuilder.create().texOffs(52, 6).addBox(-4.0F, -5.0F, -3.0F, 8.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 15.0F, 0.0F));
		PartDefinition body1 = partdefinition.addOrReplaceChild("body1", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -6.0F, -6.0F, 12.0F, 10.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 15.0F, 9.0F));
		PartDefinition leg0 = partdefinition.addOrReplaceChild("leg0", CubeListBuilder.create().texOffs(42, 24).addBox(-15.0F, -2.0F, -1.0F, 16.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 15.0F, 2.0F, 0.0F, 0.7854F, -0.7854F));
		PartDefinition leg1 = partdefinition.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(42, 30).addBox(-1.0F, -2.0F, -1.0F, 16.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 15.0F, 2.0F, 0.0F, -0.7854F, 0.7854F));
		PartDefinition leg2 = partdefinition.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(42, 36).addBox(-15.0F, -2.0F, -1.0F, 16.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 15.0F, 1.0F, 0.0F, 0.2618F, -0.6109F));
		PartDefinition leg3 = partdefinition.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(42, 42).addBox(-1.0F, -2.0F, -1.0F, 16.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 15.0F, 1.0F, 0.0F, -0.2618F, 0.6109F));
		PartDefinition leg4 = partdefinition.addOrReplaceChild("leg4", CubeListBuilder.create().texOffs(0, 44).addBox(-15.0F, -2.0F, -1.0F, 16.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 15.0F, 0.0F, 0.0F, -0.2618F, -0.6109F));
		PartDefinition leg5 = partdefinition.addOrReplaceChild("leg5", CubeListBuilder.create().texOffs(38, 48).addBox(-1.0F, -2.0F, -1.0F, 16.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 15.0F, 0.0F, 0.0F, 0.2618F, 0.6109F));
		PartDefinition leg6 = partdefinition.addOrReplaceChild("leg6", CubeListBuilder.create().texOffs(0, 50).addBox(-15.0F, -2.0F, -1.0F, 16.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 15.0F, -1.0F, 0.0F, -0.7854F, -0.7854F));
		PartDefinition leg7 = partdefinition.addOrReplaceChild("leg7", CubeListBuilder.create().texOffs(52, 0).addBox(-1.0F, -2.0F, -1.0F, 16.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 15.0F, -1.0F, 0.0F, 0.7854F, 0.7854F));
		PartDefinition corona = partdefinition.addOrReplaceChild("corona",
				CubeListBuilder.create().texOffs(62, 54).addBox(-6.0F, -18.0F, -3.0F, 12.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 59).addBox(-6.0F, -18.0F, -13.0F, 12.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 54)
						.addBox(6.0F, -18.0F, -13.0F, 1.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 56).addBox(-7.0F, -18.0F, -13.0F, 1.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(52, 21)
						.addBox(5.0F, -20.0F, -13.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 21).addBox(1.0F, -20.0F, -13.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 21)
						.addBox(-3.0F, -20.0F, -13.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 64).addBox(-7.0F, -20.0F, -3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 64)
						.addBox(-2.0F, -20.0F, -3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 67).addBox(2.0F, -20.0F, -3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 56)
						.addBox(6.0F, -20.0F, -11.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 60).addBox(-7.0F, -20.0F, -11.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 56)
						.addBox(6.0F, -20.0F, -7.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 60).addBox(-7.0F, -20.0F, -7.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 67)
						.addBox(5.0F, -20.0F, -3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 64).addBox(-7.0F, -19.0F, -13.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}

}