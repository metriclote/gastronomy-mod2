package milas_andmetric_gastronomi_mod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import milas_andmetric_gastronomi_mod.entity.NaitbearEntity;

import milas_andmetric_gastronomi_mod.client.model.ModelnaitBear_47;

public class NaitbearRenderer extends MobRenderer<NaitbearEntity, LivingEntityRenderState, ModelnaitBear_47> {
	private NaitbearEntity entity = null;

	public NaitbearRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelnaitBear_47(context.bakeLayer(ModelnaitBear_47.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(NaitbearEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("milas_and_metric_gastronomy_mod:textures/entities/naitbear_47.png");
	}
}