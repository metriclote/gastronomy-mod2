// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelchef<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "chef"), "main");
	private final ModelPart inferior;
	private final ModelPart medio;

	public Modelchef(ModelPart root) {
		this.inferior = root.getChild("inferior");
		this.medio = root.getChild("medio");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition inferior = partdefinition.addOrReplaceChild("inferior",
				CubeListBuilder.create().texOffs(50, 21)
						.addBox(-6.0F, -3.0F, 4.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(38, 46)
						.addBox(1.0F, -3.0F, 4.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 46)
						.addBox(-7.0F, -5.0F, 0.0F, 13.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition medio = partdefinition.addOrReplaceChild("medio",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(8.0F, -13.0F, 4.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(8, 12)
						.addBox(3.0F, -13.0F, -3.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(-7.0F, -13.0F, -3.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(-13.0F, -13.0F, 4.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(-9.0F, -14.0F, -2.0F, 17.0F, 9.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-11.0F, -17.0F, -3.0F, 20.0F, 3.0F, 18.0F, new CubeDeformation(0.0F)),
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
		inferior.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		medio.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}