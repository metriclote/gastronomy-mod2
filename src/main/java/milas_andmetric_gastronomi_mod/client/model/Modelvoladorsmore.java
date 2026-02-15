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
public class Modelvoladorsmore<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("milas_and_metric_gastronomy_mod", "modelvoladorsmore"), "main");
	public final ModelPart cuerpo;
	public final ModelPart ojos;
	public final ModelPart pies;

	public Modelvoladorsmore(ModelPart root) {
		this.cuerpo = root.getChild("cuerpo");
		this.ojos = root.getChild("ojos");
		this.pies = root.getChild("pies");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition cuerpo = partdefinition.addOrReplaceChild("cuerpo",
				CubeListBuilder.create().texOffs(0, 35).addBox(-11.0F, -6.0F, -1.0F, 12.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 21).addBox(-11.0F, -15.0F, -1.0F, 12.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-12.0F, -13.0F, -2.0F, 14.0F, 7.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 10).addBox(-13.0F, -10.0F, 2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(2.0F, -10.0F, 2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = cuerpo.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(4, 10).addBox(-19.0F, -11.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 21).addBox(-19.0F, -7.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 0)
						.addBox(-14.0F, -7.0F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(5, 27).addBox(-16.0F, -7.0F, 2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 28)
						.addBox(-19.0F, -10.0F, 2.0F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition cube_r2 = cuerpo.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(8, 3).addBox(4.0F, -7.0F, 2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 8).addBox(6.0F, -7.0F, 2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 21)
						.addBox(8.0F, -11.0F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 24).addBox(8.0F, -7.0F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 0)
						.addBox(3.0F, -10.0F, 2.0F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition ojos = partdefinition.addOrReplaceChild("ojos",
				CubeListBuilder.create().texOffs(4, 35).addBox(-9.0F, -9.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 35).addBox(-2.0F, -9.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 5)
						.addBox(-10.0F, -10.0F, -3.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-3.0F, -10.0F, -3.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition pies = partdefinition.addOrReplaceChild("pies",
				CubeListBuilder.create().texOffs(36, 35).addBox(-3.0F, -4.0F, 3.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 21).addBox(-11.0F, -4.0F, 3.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 25)
						.addBox(-11.0F, -2.0F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 24).addBox(-9.0F, -2.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 30)
						.addBox(-4.0F, -2.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 28).addBox(-7.0F, -2.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 31)
						.addBox(0.0F, -2.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 30).addBox(-2.0F, -2.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		cuerpo.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		ojos.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		pies.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}