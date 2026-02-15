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

// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelcornfeti_popper extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("milas_and_metric_gastronomy_mod", "modelcornfeti_popper"), "main");
	public final ModelPart cuerpo;
	public final ModelPart cara;
	public final ModelPart pies;
	public final ModelPart bb_main;

	public Modelcornfeti_popper(ModelPart root) {
		super(root);
		this.cuerpo = root.getChild("cuerpo");
		this.cara = root.getChild("cara");
		this.pies = root.getChild("pies");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition cuerpo = partdefinition.addOrReplaceChild("cuerpo",
				CubeListBuilder.create().texOffs(0, 0).addBox(-19.0F, -20.0F, -1.0F, 20.0F, 20.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(0, 40).addBox(1.0F, -20.0F, -1.0F, 5.0F, 20.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(86, 84)
						.addBox(-19.0F, -23.0F, 7.0F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(46, 90).addBox(-21.0F, -24.0F, 7.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(80, 0)
						.addBox(4.0F, -20.0F, -3.0F, 6.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 80).addBox(4.0F, -20.0F, 19.0F, 6.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 40)
						.addBox(3.0F, -22.0F, -1.0F, 7.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(50, 62).addBox(6.0F, -2.0F, -1.0F, 4.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cara = partdefinition.addOrReplaceChild("cara",
				CubeListBuilder.create().texOffs(60, 90).addBox(-4.0F, -17.0F, -3.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(80, 36).addBox(-5.0F, -19.0F, -3.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(84, 92)
						.addBox(-5.0F, -19.0F, 19.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(72, 90).addBox(-4.0F, -17.0F, 19.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition pies = partdefinition.addOrReplaceChild("pies",
				CubeListBuilder.create().texOffs(80, 22).addBox(-5.0F, -2.0F, -6.0F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(80, 29).addBox(-5.0F, -2.0F, 19.0F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = pies.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(66, 84).addBox(-15.0F, -2.0F, 18.0F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0873F, 0.0F));
		PartDefinition cube_r2 = pies.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(46, 84).addBox(-13.0F, -2.0F, -6.0F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1309F, 0.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 80).addBox(7.0F, -15.0F, 4.0F, 6.0F, 10.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
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