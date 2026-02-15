// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelnaitBear_47<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "naitbear_47"), "main");
	private final ModelPart cuerpo;
	private final ModelPart cabeza;

	public ModelnaitBear_47(ModelPart root) {
		this.cuerpo = root.getChild("cuerpo");
		this.cabeza = root.getChild("cabeza");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition cuerpo = partdefinition.addOrReplaceChild("cuerpo",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-19.0F, -22.0F, -1.0F, 20.0F, 22.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(80, 26)
						.addBox(-7.0F, -8.0F, -5.0F, 8.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(80, 38)
						.addBox(-19.0F, -8.0F, -5.0F, 8.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(68, 78)
						.addBox(-7.0F, -21.0F, -6.0F, 8.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(80, 0)
						.addBox(-19.0F, -22.0F, -6.0F, 8.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 78)
						.addBox(-8.0F, -23.0F, -8.0F, 10.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(34, 78)
						.addBox(-8.0F, -13.0F, -8.0F, 10.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(80, 62)
						.addBox(1.0F, -21.0F, -9.0F, 2.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 87)
						.addBox(-9.0F, -21.0F, -9.0F, 2.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cabeza = partdefinition.addOrReplaceChild("cabeza",
				CubeListBuilder.create().texOffs(0, 42)
						.addBox(-19.0F, -38.0F, -1.0F, 20.0F, 16.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(20, 87)
						.addBox(-5.0F, -36.0F, -4.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(36, 87)
						.addBox(-18.0F, -36.0F, -4.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 87)
						.addBox(-11.0F, -32.0F, -4.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(68, 91)
						.addBox(-4.0F, -35.0F, -5.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition orejaizquierda_r1 = cabeza.addOrReplaceChild("orejaizquierda_r1",
				CubeListBuilder.create().texOffs(80, 50).addBox(-7.0F, -46.0F, 1.0F, 6.0F, 6.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0436F, 0.0F, -0.2618F));

		PartDefinition orejaderecha_r1 = cabeza.addOrReplaceChild("orejaderecha_r1",
				CubeListBuilder.create().texOffs(80, 13).addBox(-16.0F, -42.0F, -1.0F, 6.0F, 7.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.2618F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		cuerpo.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		cabeza.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}