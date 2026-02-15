// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelicecream<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "icecream"), "main");
	private final ModelPart cono;
	private final ModelPart helado;

	public Modelicecream(ModelPart root) {
		this.cono = root.getChild("cono");
		this.helado = root.getChild("helado");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition cono = partdefinition.addOrReplaceChild("cono",
				CubeListBuilder.create().texOffs(0, 12)
						.addBox(-7.0F, -8.0F, -1.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -10.0F, -2.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition dedoizquierdo2_r1 = cono.addOrReplaceChild("dedoizquierdo2_r1",
				CubeListBuilder.create().texOffs(0, 12)
						.addBox(-11.0F, -11.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-11.0F, -11.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 0)
						.addBox(-10.0F, -11.0F, 2.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition dedoderecho2_r1 = cono.addOrReplaceChild("dedoderecho2_r1",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(4.0F, -10.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(4.0F, -10.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 4)
						.addBox(-1.0F, -10.0F, 2.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition helado = partdefinition.addOrReplaceChild("helado",
				CubeListBuilder.create().texOffs(24, 20)
						.addBox(-7.0F, -14.0F, -1.0F, 8.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(24, 12)
						.addBox(-6.0F, -16.0F, 0.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(-5.0F, -18.0F, 1.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 28)
						.addBox(-4.0F, -20.0F, 2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 15)
						.addBox(-2.0F, -13.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 12)
						.addBox(-6.0F, -13.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		cono.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		helado.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}