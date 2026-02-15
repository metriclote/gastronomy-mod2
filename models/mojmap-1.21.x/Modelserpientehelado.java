// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelserpientehelado<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "serpientehelado"), "main");
	private final ModelPart cuerpo;
	private final ModelPart cola;
	private final ModelPart cabeza;

	public Modelserpientehelado(ModelPart root) {
		this.cuerpo = root.getChild("cuerpo");
		this.cola = root.getChild("cola");
		this.cabeza = root.getChild("cabeza");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition cuerpo = partdefinition.addOrReplaceChild("cuerpo", CubeListBuilder.create().texOffs(28, 19)
				.addBox(-3.52F, -8.0F, -9.2439F, 7.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cola = partdefinition.addOrReplaceChild("cola",
				CubeListBuilder.create().texOffs(40, 6)
						.addBox(-1.4168F, -1.0F, 18.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(24, 33)
						.addBox(-1.39F, -2.0F, 12.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.955F, -3.0F, -4.0F, 4.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cabeza = partdefinition.addOrReplaceChild("cabeza",
				CubeListBuilder.create().texOffs(0, 19)
						.addBox(-3.516F, -7.128F, -10.0F, 7.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(40, 0)
						.addBox(-2.504F, -5.3986F, -11.205F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 36)
						.addBox(-2.4348F, -5.0F, -5.0F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 12)
						.addBox(-1.0F, -9.0F, -8.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = cabeza.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(18, 36)
						.addBox(0.0F, -18.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 30)
						.addBox(2.0F, -17.0F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 6.0F, -5.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r2 = cabeza.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 30).addBox(-3.0906F, 1.0F, -1.0F, 7.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3442F, -3.0F, -4.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r3 = cabeza.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(28, 26).addBox(-3.0906F, 1.0F, -2.0F, 7.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3442F, -4.0F, -4.0F, 0.3491F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		cuerpo.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		cola.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		cabeza.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}