// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeldumplin<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "dumplin"), "main");
	private final ModelPart cuerpo;
	private final ModelPart boba;

	public Modeldumplin(ModelPart root) {
		this.cuerpo = root.getChild("cuerpo");
		this.boba = root.getChild("boba");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition cuerpo = partdefinition.addOrReplaceChild("cuerpo",
				CubeListBuilder.create().texOffs(28, 5)
						.addBox(-3.0F, -2.0F, -1.0F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(28, 0)
						.addBox(-3.0F, -2.0F, 8.0F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(2.0F, -8.0F, 7.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(2.0F, -8.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(28, 14)
						.addBox(-3.0F, -10.0F, -1.0F, 5.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
						.addBox(-3.0F, -12.0F, -1.0F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(40, 0)
						.addBox(1.0F, -12.0F, -1.0F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(28, 34)
						.addBox(-2.0F, -13.0F, -1.0F, 3.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition boba = partdefinition.addOrReplaceChild("boba",
				CubeListBuilder.create().texOffs(0, 26)
						.addBox(-11.0F, -18.0F, -1.0F, 8.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-11.0F, -14.0F, -1.0F, 8.0F, 14.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -22.0F, 4.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		cuerpo.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		boba.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}