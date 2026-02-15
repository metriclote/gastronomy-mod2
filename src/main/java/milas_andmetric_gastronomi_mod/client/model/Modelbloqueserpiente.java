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
public class Modelbloqueserpiente<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("milas_and_metric_gastronomy_mod", "modelbloqueserpiente"), "main");
	public final ModelPart cuerpo;
	public final ModelPart cabeza;
	public final ModelPart hoja;

	public Modelbloqueserpiente(ModelPart root) {
		this.cuerpo = root.getChild("cuerpo");
		this.cabeza = this.cuerpo.getChild("cabeza");
		this.hoja = root.getChild("hoja");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition cuerpo = partdefinition.addOrReplaceChild("cuerpo", CubeListBuilder.create().texOffs(0, 15).addBox(-5.0F, -4.0F, -4.0F, 10.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = cuerpo.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(34, 22).addBox(1.0F, -7.0F, 3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 33).addBox(-3.0F, -7.0F, 3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 20)
						.addBox(-1.0F, -7.0F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 35).addBox(3.0F, -7.0F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 16)
						.addBox(-5.0F, -7.0F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 27).addBox(-5.0F, -6.0F, 2.0F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r2 = cuerpo.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(34, 37).addBox(-5.0F, -7.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 37).addBox(-3.0F, -7.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 37)
						.addBox(-1.0F, -7.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 37).addBox(1.0F, -7.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 18)
						.addBox(3.0F, -7.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 24).addBox(-5.0F, -6.0F, -4.0F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r3 = cuerpo.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 30).addBox(3.0F, -7.0F, -4.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(34, 4).addBox(3.0F, -8.0F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 33)
						.addBox(4.0F, -8.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(16, 30).addBox(3.0F, -8.0F, -4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r4 = cuerpo.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(34, 10).addBox(-4.0F, -8.0F, -4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(34, 0).addBox(-5.0F, -8.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(34, 7)
						.addBox(-4.0F, -8.0F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 24).addBox(-4.0F, -7.0F, -4.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cabeza = cuerpo.addOrReplaceChild("cabeza", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -12.0F, -4.0F, 10.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition hoja = partdefinition.addOrReplaceChild("hoja", CubeListBuilder.create().texOffs(16, 33).addBox(7.0F, -5.0F, -10.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.0F, 16.0F, 8.0F));
		PartDefinition cube_r5 = hoja.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(34, 13).addBox(0.0F, -18.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 10.0F, -8.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition cube_r6 = hoja.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(38, 24).addBox(2.0F, -17.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 11.0F, -8.0F, 0.0F, 0.0F, -0.2182F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		cuerpo.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		hoja.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}