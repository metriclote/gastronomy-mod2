package milas_andmetric_gastronomi_mod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import milas_andmetric_gastronomi_mod.entity.PhatompaletaEntity;

import milas_andmetric_gastronomi_mod.client.model.Modelphatompaleta;

public class PhatompaletaRenderer extends MobRenderer<PhatompaletaEntity, LivingEntityRenderState, Modelphatompaleta> {
	private PhatompaletaEntity entity = null;

	public PhatompaletaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelphatompaleta(context.bakeLayer(Modelphatompaleta.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(PhatompaletaEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("milas_and_metric_gastronomy_mod:textures/entities/phantom2.png");
	}
}