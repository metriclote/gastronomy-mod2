package milas_andmetric_gastronomi_mod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import milas_andmetric_gastronomi_mod.entity.SandwichdulceEntity;

import milas_andmetric_gastronomi_mod.client.model.Modelsandw2;

public class SandwichdulceRenderer extends MobRenderer<SandwichdulceEntity, LivingEntityRenderState, Modelsandw2> {
	private SandwichdulceEntity entity = null;

	public SandwichdulceRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsandw2(context.bakeLayer(Modelsandw2.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SandwichdulceEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("milas_and_metric_gastronomy_mod:textures/entities/sanddulce.png");
	}
}