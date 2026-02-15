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
public class Modelchef<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("milas_and_metric_gastronomy_mod", "modelchef"), "main");
	public final ModelPart inferior;
	public final ModelPart medio;

	public Modelchef(ModelPart root) {
		this.inferior = root.getChild("inferior");
		this.medio = root.getChild("medio");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition inferior = partdefinition.addOrReplaceChild("inferior", CubeListBuilder.create().texOffs(50, 21).addBox(-6.0F, -3.0F, 4.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(38, 46)
				.addBox(1.0F, -3.0F, 4.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 46).addBox(-7.0F, -5.0F, 0.0F, 13.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition medio = partdefinition.addOrReplaceChild("medio",
				CubeListBuilder.create().texOffs(0, 0).addBox(8.0F, -13.0F, 4.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(8, 12).addBox(3.0F, -13.0F, -3.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(-7.0F, -13.0F, -3.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 21).addBox(-13.0F, -13.0F, 4.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(-9.0F, -14.0F, -2.0F, 17.0F, 9.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-11.0F, -17.0F, -3.0F, 20.0F, 3.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		inferior.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		medio.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}