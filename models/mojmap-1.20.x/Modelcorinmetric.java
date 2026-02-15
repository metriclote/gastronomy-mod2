// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcorinmetric<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "corinmetric"), "main");
	private final ModelPart cuerpo;
	private final ModelPart pies;
	private final ModelPart boca;
	private final ModelPart caraygorro;

	public Modelcorinmetric(ModelPart root) {
		this.cuerpo = root.getChild("cuerpo");
		this.pies = root.getChild("pies");
		this.boca = root.getChild("boca");
		this.caraygorro = root.getChild("caraygorro");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition cuerpo = partdefinition.addOrReplaceChild("cuerpo",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-19.0F, -20.0F, -1.0F, 20.0F, 20.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(1.0F, -20.0F, -1.0F, 5.0F, 20.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(34, 80)
						.addBox(-19.0F, -23.0F, 7.0F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(84, 82)
						.addBox(-21.0F, -24.0F, 7.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition pies = partdefinition.addOrReplaceChild("pies",
				CubeListBuilder.create().texOffs(12, 80)
						.addBox(-5.0F, -2.0F, -6.0F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(80, 22)
						.addBox(-5.0F, -2.0F, 19.0F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = pies
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(84, 76).addBox(-15.0F, -2.0F, 18.0F, 6.0F, 2.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition pieizquierdoatras_r1 = pies.addOrReplaceChild(
				"pieizquierdoatras_r1", CubeListBuilder.create().texOffs(80, 29).addBox(-13.0F, -2.0F, -3.0F, 6.0F,
						2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition boca = partdefinition.addOrReplaceChild("boca",
				CubeListBuilder.create().texOffs(0, 80)
						.addBox(6.0F, -20.0F, -1.0F, 4.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(80, 0)
						.addBox(6.0F, -20.0F, 17.0F, 4.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 40)
						.addBox(6.0F, -20.0F, 1.0F, 4.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(50, 58)
						.addBox(6.0F, -2.0F, 1.0F, 4.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition caraygorro = partdefinition.addOrReplaceChild("caraygorro",
				CubeListBuilder.create().texOffs(12, 87)
						.addBox(-4.0F, -17.0F, -3.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 88)
						.addBox(-4.0F, -17.0F, 19.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(80, 35)
						.addBox(-1.0F, -25.0F, 4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(86, 35)
						.addBox(-7.0F, -25.0F, 14.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 88)
						.addBox(-7.0F, -25.0F, 4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 88)
						.addBox(-1.0F, -25.0F, 14.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 76)
						.addBox(-7.0F, -24.0F, 5.0F, 8.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		cuerpo.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pies.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		boca.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		caraygorro.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}