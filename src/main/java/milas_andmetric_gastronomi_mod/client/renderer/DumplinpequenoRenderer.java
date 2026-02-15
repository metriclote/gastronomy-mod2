package milas_andmetric_gastronomi_mod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import milas_andmetric_gastronomi_mod.entity.DumplinpequenoEntity;

import milas_andmetric_gastronomi_mod.client.model.Modeldunplin_pequeño;

public class DumplinpequenoRenderer extends MobRenderer<DumplinpequenoEntity, LivingEntityRenderState, Modeldunplin_pequeño> {
	private DumplinpequenoEntity entity = null;

	public DumplinpequenoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldunplin_pequeño(context.bakeLayer(Modeldunplin_pequeño.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(DumplinpequenoEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("milas_and_metric_gastronomy_mod:textures/entities/samllfumpling.png");
	}
}