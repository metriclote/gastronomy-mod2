package milas_andmetric_gastronomi_mod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import milas_andmetric_gastronomi_mod.entity.SmoreEntity;

import milas_andmetric_gastronomi_mod.client.model.Modelsmores;

public class SmoreRenderer extends MobRenderer<SmoreEntity, LivingEntityRenderState, Modelsmores> {
	private SmoreEntity entity = null;

	public SmoreRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsmores(context.bakeLayer(Modelsmores.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SmoreEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("milas_and_metric_gastronomy_mod:textures/entities/smore.png");
	}
}