package milas_andmetric_gastronomi_mod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import milas_andmetric_gastronomi_mod.entity.DumplingmedianoEntity;

import milas_andmetric_gastronomi_mod.client.model.Modeldumplingmediano;

public class DumplingmedianoRenderer extends MobRenderer<DumplingmedianoEntity, LivingEntityRenderState, Modeldumplingmediano> {
	private DumplingmedianoEntity entity = null;

	public DumplingmedianoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldumplingmediano(context.bakeLayer(Modeldumplingmediano.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(DumplingmedianoEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("milas_and_metric_gastronomy_mod:textures/entities/dumplingmediano.png");
	}
}