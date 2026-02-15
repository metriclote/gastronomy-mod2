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
public class Modeljegechefgb<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("milas_and_metric_gastronomy_mod", "modeljegechefgb"), "main");
	public final ModelPart pies;
	public final ModelPart cuerpo;
	public final ModelPart gorro;

	public Modeljegechefgb(ModelPart root) {
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

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		pies.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		cuerpo.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		gorro.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}