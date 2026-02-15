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

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modeldumplingmediano<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("milas_and_metric_gastronomy_mod", "modeldumplingmediano"), "main");
	public final ModelPart cuerpo;
	public final ModelPart cabeza;

	public Modeldumplingmediano(ModelPart root) {
		this.cuerpo = root.getChild("cuerpo");
		this.cabeza = root.getChild("cabeza");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition cuerpo = partdefinition.addOrReplaceChild("cuerpo",
				CubeListBuilder.create().texOffs(16, 28).addBox(-3.0F, -4.0F, -1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 28).addBox(-9.0F, -4.0F, -1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(-3.0F, -4.0F, 8.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-9.0F, -4.0F, 8.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-10.0F, -16.0F, -3.0F, 12.0F, 11.0F, 17.0F, new CubeDeformation(1.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cabeza = partdefinition.addOrReplaceChild("cabeza", CubeListBuilder.create().texOffs(20, 36).addBox(3.0F, -13.0F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 36)
				.addBox(3.0F, -13.0F, 9.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(29, 34).addBox(-6.0F, -19.0F, 5.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = cabeza.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(32, 28).addBox(-6.0F, -20.0F, 2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r2 = cabeza.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 36).addBox(-6.0F, -19.0F, 3.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0436F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
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