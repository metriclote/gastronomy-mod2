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

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modeljegechefgb extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("milas_and_metric_gastronomy_mod", "modeljegechefgb"), "main");
	public final ModelPart pies;
	public final ModelPart cuerpo;
	public final ModelPart gorro;

	public Modeljegechefgb(ModelPart root) {
		super(root);
		this.pies = root.getChild("pies");
		this.cuerpo = root.getChild("cuerpo");
		this.gorro = root.getChild("gorro");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition pies = partdefinition.addOrReplaceChild("pies",
				CubeListBuilder.create().texOffs(22, 78).addBox(-5.0F, -6.0F, -1.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(46, 78).addBox(5.0F, -6.0F, -1.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cuerpo = partdefinition.addOrReplaceChild("cuerpo",
				CubeListBuilder.create().texOffs(0, 78).addBox(-13.0F, -17.0F, -1.0F, 5.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(74, 72).addBox(14.0F, -17.0F, -1.0F, 5.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 52)
						.addBox(-8.0F, -27.0F, -7.0F, 22.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(36, 36).addBox(-8.0F, -17.0F, 11.0F, 22.0F, 6.0F, -18.0F, new CubeDeformation(0.0F)).texOffs(28, 54)
						.addBox(-6.0F, -11.0F, 7.0F, 18.0F, 5.0F, -10.0F, new CubeDeformation(0.0F)).texOffs(62, 0).addBox(-6.0F, -19.0F, -5.0F, 18.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition gorro = partdefinition.addOrReplaceChild("gorro",
				CubeListBuilder.create().texOffs(62, 52).addBox(-3.0F, -31.0F, -3.0F, 11.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(65, 16).addBox(-5.0F, -35.0F, -5.0F, 15.0F, 4.0F, 15.0F, new CubeDeformation(0.0F)),
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