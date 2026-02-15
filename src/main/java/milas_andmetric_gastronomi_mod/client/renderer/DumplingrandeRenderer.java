package milas_andmetric_gastronomi_mod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import milas_andmetric_gastronomi_mod.entity.DumplingrandeEntity;

import milas_andmetric_gastronomi_mod.client.model.Modeldumpling_grande;

public class DumplingrandeRenderer extends MobRenderer<DumplingrandeEntity, LivingEntityRenderState, Modeldumpling_grande> {
	private DumplingrandeEntity entity = null;

	public DumplingrandeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldumpling_grande(context.bakeLayer(Modeldumpling_grande.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(DumplingrandeEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("milas_and_metric_gastronomy_mod:textures/entities/dunms.png");
	}
}