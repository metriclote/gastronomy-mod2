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
public class Modelcubano<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("milas_and_metric_gastronomy_mod", "modelcubano"), "main");
	public final ModelPart pies;
	public final ModelPart cuerpo;
	public final ModelPart ojos;

	public Modelcubano(ModelPart root) {
		this.pies = root.getChild("pies");
		this.cuerpo = root.getChild("cuerpo");
		this.ojos = root.getChild("ojos");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition pies = partdefinition.addOrReplaceChild("pies",
				CubeListBuilder.create().texOffs(50, 30).addBox(-3.0F, -4.0F, 7.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 15).addBox(-13.0F, -4.0F, -1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 0)
						.addBox(-13.0F, -4.0F, 7.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 44).addBox(-3.0F, -4.0F, -1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cuerpo = partdefinition.addOrReplaceChild("cuerpo",
				CubeListBuilder.create().texOffs(0, 15).addBox(-15.0F, -7.0F, -1.0F, 16.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(22, 39).addBox(-1.0F, -11.0F, -1.0F, 2.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-15.0F, -14.0F, -1.0F, 16.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 30).addBox(-8.0F, -9.0F, -1.0F, 5.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(22, 30)
						.addBox(-13.0F, -10.0F, 1.0F, 10.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(54, 38).addBox(-11.0F, -11.0F, -1.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 44)
						.addBox(-5.0F, -11.0F, 7.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 52).addBox(-11.0F, -11.0F, 7.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(50, 49)
						.addBox(-5.0F, -11.0F, -1.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(38, 39).addBox(-15.0F, -9.0F, 1.0F, 4.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition ojos = partdefinition.addOrReplaceChild("ojos",
				CubeListBuilder.create().texOffs(7, 5).addBox(-14.0F, -16.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 0).addBox(-14.0F, -16.0F, 8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-13.0F, -16.0F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 5).addBox(-13.0F, -16.0F, 7.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		pies.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		cuerpo.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		ojos.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}