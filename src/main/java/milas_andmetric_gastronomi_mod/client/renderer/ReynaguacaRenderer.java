package milas_andmetric_gastronomi_mod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import milas_andmetric_gastronomi_mod.entity.ReynaguacaEntity;

import milas_andmetric_gastronomi_mod.client.model.Modelreinaguacaraña;

public class ReynaguacaRenderer extends MobRenderer<ReynaguacaEntity, LivingEntityRenderState, Modelreinaguacaraña> {
	private ReynaguacaEntity entity = null;

	public ReynaguacaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelreinaguacaraña(context.bakeLayer(Modelreinaguacaraña.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(ReynaguacaEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("milas_and_metric_gastronomy_mod:textures/entities/reinaguacarana.png");
	}
}