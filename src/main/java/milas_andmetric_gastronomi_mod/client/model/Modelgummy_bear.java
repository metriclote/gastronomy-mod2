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

// Made with Blockbench 4.12.0
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelgummy_bear extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("milas_and_metric_gastronomy_mod", "modelgummy_bear"), "main");
	public final ModelPart cuerpo;
	public final ModelPart cabeza;

	public Modelgummy_bear(ModelPart root) {
		super(root);
		this.cuerpo = root.getChild("cuerpo");
		this.cabeza = root.getChild("cabeza");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition cuerpo = partdefinition.addOrReplaceChild("cuerpo",
				CubeListBuilder.create().texOffs(0, 0).addBox(-11.0F, -14.0F, -1.0F, 12.0F, 14.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 47).addBox(-3.0F, -5.0F, -4.0F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(14, 47)
						.addBox(-11.0F, -5.0F, -4.0F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(28, 47).addBox(-3.0F, -14.0F, -4.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(42, 47)
						.addBox(-11.0F, -14.0F, -4.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cabeza = partdefinition.addOrReplaceChild("cabeza",
				CubeListBuilder.create().texOffs(0, 26).addBox(-11.0F, -23.0F, -1.0F, 12.0F, 9.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(48, 14).addBox(-10.0F, -21.0F, -2.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 24)
						.addBox(-6.0F, -18.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 19).addBox(-3.0F, -21.0F, -2.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition orejaizquierda_r1 = cabeza.addOrReplaceChild("orejaizquierda_r1", CubeListBuilder.create().texOffs(48, 7).addBox(-7.0F, -28.0F, 1.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, -0.0436F, 0.0F, -0.2618F));
		PartDefinition orejaderecha_r1 = cabeza.addOrReplaceChild("orejaderecha_r1", CubeListBuilder.create().texOffs(48, 0).addBox(-8.0F, -25.0F, -1.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.2618F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}
}