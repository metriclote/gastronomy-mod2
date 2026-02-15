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
public class Modelestatuanait extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("milas_and_metric_gastronomy_mod", "modelestatuanait"), "main");
	public final ModelPart cuerpo;
	public final ModelPart cabeza;

	public Modelestatuanait(ModelPart root) {
		super(root);
		this.cuerpo = root.getChild("cuerpo");
		this.cabeza = this.cuerpo.getChild("cabeza");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition cuerpo = partdefinition.addOrReplaceChild("cuerpo",
				CubeListBuilder.create().texOffs(0, 0).addBox(-27.0F, -24.0F, -1.0F, 30.0F, 24.0F, 30.0F, new CubeDeformation(0.0F)).texOffs(40, 116).addBox(-8.0F, -9.0F, -5.0F, 11.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 117)
						.addBox(-27.0F, -9.0F, -5.0F, 11.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(80, 114).addBox(-7.0F, -23.0F, -7.0F, 10.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(80, 100)
						.addBox(-27.0F, -24.0F, -6.0F, 11.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(112, 100).addBox(-8.0F, -25.0F, -8.0F, 11.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(112, 109)
						.addBox(-8.0F, -15.0F, -8.0F, 11.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(110, 118).addBox(3.0F, -23.0F, -9.0F, 2.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(120, 0)
						.addBox(-9.0F, -23.0F, -9.0F, 2.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cabeza = cuerpo.addOrReplaceChild("cabeza",
				CubeListBuilder.create().texOffs(0, 54).addBox(-27.0F, -40.0F, -1.0F, 30.0F, 16.0F, 30.0F, new CubeDeformation(0.0F)).texOffs(120, 24).addBox(-5.0F, -37.0F, -4.0F, 7.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(120, 33)
						.addBox(-26.0F, -37.0F, -4.0F, 7.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(120, 16).addBox(-16.0F, -32.0F, -4.0F, 8.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(120, 42)
						.addBox(-4.0F, -36.0F, -5.0F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition orejaizquierda_r1 = cabeza.addOrReplaceChild("orejaizquierda_r1", CubeListBuilder.create().texOffs(40, 100).addBox(-9.0F, -46.0F, 1.0F, 10.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 7.0F, -0.0436F, 0.0F, -0.3054F));
		PartDefinition orejaderecha_r1 = cabeza.addOrReplaceChild("orejaderecha_r1", CubeListBuilder.create().texOffs(0, 100).addBox(-20.0F, -42.0F, -1.0F, 10.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 6.0F, -0.1309F, 0.0F, 0.2618F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}

}