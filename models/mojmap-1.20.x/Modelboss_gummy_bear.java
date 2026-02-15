// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelboss_gummy_bear<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "boss_gummy_bear"), "main");
	private final ModelPart bone;
	private final ModelPart cabeza;
	private final ModelPart bb_main;

	public Modelboss_gummy_bear(ModelPart root) {
		this.bone = root.getChild("bone");
		this.cabeza = root.getChild("cabeza");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-15.0F, -18.0F, -1.0F, 16.0F, 18.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 62)
						.addBox(-5.0F, -6.0F, -5.0F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 34)
						.addBox(-5.0F, -18.0F, -5.0F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(60, 58)
						.addBox(-15.0F, -6.0F, -5.0F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-15.0F, -18.0F, -5.0F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cabeza = partdefinition.addOrReplaceChild("cabeza",
				CubeListBuilder.create().texOffs(0, 34)
						.addBox(-15.0F, -30.0F, -1.0F, 16.0F, 12.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 9)
						.addBox(-9.0F, -24.0F, -4.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 43)
						.addBox(-14.0F, -27.0F, -4.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 10)
						.addBox(-4.0F, -27.0F, -4.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition orejaderecha_r1 = bb_main.addOrReplaceChild("orejaderecha_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-11.0F, -33.0F, -1.0F, 4.0F, 5.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.2618F));

		PartDefinition orejaizquierda_r1 = bb_main.addOrReplaceChild("orejaizquierda_r1",
				CubeListBuilder.create().texOffs(0, 34).addBox(-5.0F, -36.0F, 1.0F, 4.0F, 5.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0436F, 0.0F, -0.2618F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		cabeza.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}