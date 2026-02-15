package milas_andmetric_gastronomi_mod.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 5.0.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modeldumplinggigante<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("milas_and_metric_gastronomy_mod", "modeldumplinggigante"), "main");
	public final ModelPart cuerpo;
	public final ModelPart cabeza;

	public Modeldumplinggigante(ModelPart root) {
		this.cuerpo = root.getChild("cuerpo");
		this.cabeza = root.getChild("cabeza");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition cuerpo = partdefinition.addOrReplaceChild("cuerpo", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = cuerpo.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(40, 77).addBox(-15.0F, -10.0F, -1.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r2 = cuerpo.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 77).addBox(-15.0F, -10.0F, 8.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 0.0F, 6.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition pieizquierdoadelante_r1 = cuerpo.addOrReplaceChild("pieizquierdoadelante_r1", CubeListBuilder.create().texOffs(40, 57).addBox(-9.0F, -10.0F, 8.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition piederechoadelante_r1 = cuerpo.addOrReplaceChild("piederechoadelante_r1",
				CubeListBuilder.create().texOffs(0, 57).addBox(-9.0F, -10.0F, -1.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-22.0F, -33.0F, -6.0F, 24.0F, 22.0F, 35.0F, new CubeDeformation(1.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cabeza = partdefinition.addOrReplaceChild("cabeza", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r3 = cabeza.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(80, 89).addBox(-11.0F, -24.0F, 5.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -17.0F, 3.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r4 = cabeza.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(80, 73).addBox(-11.0F, -24.0F, 3.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -14.0F, 3.0F, 0.0436F, 1.5708F, 0.0F));
		PartDefinition cube_r5 = cabeza.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(80, 57).addBox(-11.0F, -25.0F, 2.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -14.0F, 3.0F, -0.0873F, 1.5708F, 0.0F));
		PartDefinition ojoizquierdo_r1 = cabeza.addOrReplaceChild("ojoizquierdo_r1", CubeListBuilder.create().texOffs(14, 97).addBox(3.0F, -17.0F, -1.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -12.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition ojoderecho_r1 = cabeza.addOrReplaceChild("ojoderecho_r1", CubeListBuilder.create().texOffs(0, 97).addBox(3.0F, -17.0F, 11.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, -12.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		cuerpo.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		cabeza.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}