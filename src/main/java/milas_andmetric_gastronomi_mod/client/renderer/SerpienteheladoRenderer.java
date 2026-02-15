package milas_andmetric_gastronomi_mod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import milas_andmetric_gastronomi_mod.entity.SerpienteheladoEntity;

import milas_andmetric_gastronomi_mod.client.model.Modelserpientehelado;

public class SerpienteheladoRenderer extends MobRenderer<SerpienteheladoEntity, LivingEntityRenderState, Modelserpientehelado> {
	private SerpienteheladoEntity entity = null;

	public SerpienteheladoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelserpientehelado(context.bakeLayer(Modelserpientehelado.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SerpienteheladoEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("milas_and_metric_gastronomy_mod:textures/entities/serpientehelado.png");
	}
}