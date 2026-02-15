package milas_andmetric_gastronomi_mod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import milas_andmetric_gastronomi_mod.entity.DumplingvendedordebobaEntity;

import milas_andmetric_gastronomi_mod.client.model.Modeldumplin;

public class DumplingvendedordebobaRenderer extends MobRenderer<DumplingvendedordebobaEntity, LivingEntityRenderState, Modeldumplin> {
	private DumplingvendedordebobaEntity entity = null;

	public DumplingvendedordebobaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldumplin(context.bakeLayer(Modeldumplin.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(DumplingvendedordebobaEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("milas_and_metric_gastronomy_mod:textures/entities/dumplinboba.png");
	}
}