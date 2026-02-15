// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelsandwich<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "sandwich"), "main");
	private final ModelPart pies;
	private final ModelPart pie4;
	private final ModelPart pie3;
	private final ModelPart pie2;
	private final ModelPart pies1;
	private final ModelPart cuerpo;
	private final ModelPart ojos;
	private final ModelPart eyes;
	private final ModelPart aceituna1;
	private final ModelPart aceituna2;

	public Modelsandwich(ModelPart root) {
		this.pies = root.getChild("pies");
		this.pie4 = root.getChild("pie4");
		this.pie3 = root.getChild("pie3");
		this.pie2 = root.getChild("pie2");
		this.pies1 = root.getChild("pies1");
		this.cuerpo = root.getChild("cuerpo");
		this.ojos = root.getChild("ojos");
		this.eyes = root.getChild("eyes");
		this.aceituna1 = root.getChild("aceituna1");
		this.aceituna2 = root.getChild("aceituna2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition pies = partdefinition.addOrReplaceChild("pies", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition pie4 = pies.addOrReplaceChild("pie4", CubeListBuilder.create().texOffs(0, 4).addBox(5.0F, -2.0F,
				6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, 0.0F, 0.0F));

		PartDefinition pie3 = pies.addOrReplaceChild("pie3", CubeListBuilder.create().texOffs(0, 14).addBox(-2.0F,
				-2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, 0.0F, 0.0F));

		PartDefinition pie2 = pies.addOrReplaceChild("pie2", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F,
				6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, 0.0F, 0.0F));

		PartDefinition pies1 = pies.addOrReplaceChild("pies1", CubeListBuilder.create().texOffs(0, 10).addBox(5.0F,
				-2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, 0.0F, 0.0F));

		PartDefinition cuerpo = partdefinition.addOrReplaceChild("cuerpo",
				CubeListBuilder.create().texOffs(0, 10)
						.addBox(-8.0F, -3.0F, -1.0F, 9.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -6.0F, -1.0F, 9.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(21, 20)
						.addBox(0.0F, -5.0F, -1.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 20)
						.addBox(-6.0F, -4.0F, -2.0F, 5.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(29, 31)
						.addBox(-3.0F, -5.0F, 6.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(27, 10)
						.addBox(-8.0F, -5.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(-3.0F, -5.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(27, 14)
						.addBox(-8.0F, -5.0F, 6.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(27, 0)
						.addBox(-9.0F, -4.0F, 1.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition ojos = partdefinition.addOrReplaceChild("ojos",
				CubeListBuilder.create().texOffs(24, 23)
						.addBox(-7.0F, -7.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(21, 22)
						.addBox(-7.0F, -10.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 21)
						.addBox(-7.0F, -7.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(21, 24)
						.addBox(-7.0F, -10.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition eyes = ojos.addOrReplaceChild("eyes",
				CubeListBuilder.create().texOffs(0, 25)
						.addBox(-7.0F, -9.0F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 20)
						.addBox(-7.0F, -9.0F, 4.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition aceituna1 = eyes.addOrReplaceChild("aceituna1", CubeListBuilder.create().texOffs(21, 20).addBox(
				-8.0F, -9.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition aceituna2 = aceituna1.addOrReplaceChild("aceituna2", CubeListBuilder.create().texOffs(7, 20)
				.addBox(-8.0F, -9.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		pies.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		cuerpo.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		ojos.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}