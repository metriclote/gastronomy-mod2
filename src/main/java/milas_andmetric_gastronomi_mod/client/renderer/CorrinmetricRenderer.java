package milas_andmetric_gastronomi_mod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import milas_andmetric_gastronomi_mod.entity.CorrinmetricEntity;

import milas_andmetric_gastronomi_mod.client.model.Modelcorinmetric;

import com.mojang.blaze3d.vertex.PoseStack;

public class CorrinmetricRenderer extends MobRenderer<CorrinmetricEntity, LivingEntityRenderState, Modelcorinmetric> {
	private CorrinmetricEntity entity = null;

	public CorrinmetricRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcorinmetric(context.bakeLayer(Modelcorinmetric.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(CorrinmetricEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("milas_and_metric_gastronomy_mod:textures/entities/corrinmetric.png");
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(entity.getAgeScale(), entity.getAgeScale(), entity.getAgeScale());
	}
}