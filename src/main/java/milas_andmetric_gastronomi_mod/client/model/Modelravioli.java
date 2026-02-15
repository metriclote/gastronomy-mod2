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

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelravioli<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("milas_and_metric_gastronomy_mod", "modelravioli"), "main");
	public final ModelPart body;
	public final ModelPart arms;

	public Modelravioli(ModelPart root) {
		this.body = root.getChild("body");
		this.arms = root.getChild("arms");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -3.0F, -1.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 22.0F, 0.0F));
		PartDefinition arms = partdefinition.addOrReplaceChild("arms",
				CubeListBuilder.create().texOffs(0, 7).addBox(2.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 7).addBox(-3.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 7)
						.addBox(-1.0F, 2.0F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 6).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 21.0F, 0.0F));
		PartDefinition cube_r1 = arms.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 7).addBox(-0.8F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 2.0F, 0.0F, -0.007F, -0.0766F, -0.25F));
		PartDefinition cube_r2 = arms.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(4, 7).addBox(-0.7F, -1.2F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r3 = arms.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 7).addBox(-0.8F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, -0.007F, -0.0766F, -0.25F));
		PartDefinition cube_r4 = arms.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(6, 6).addBox(-0.7F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r5 = arms.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(6, 7).addBox(-0.6F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 3.0F, 0.0F, 0.0F, 0.0F, -0.3491F));
		PartDefinition cube_r6 = arms.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(2, 6).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.3491F));
		PartDefinition cube_r7 = arms.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(2, 7).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition cube_r8 = arms.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(4, 6).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition cube_r9 = arms.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -0.8F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r10 = arms.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));
		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		arms.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}