package milas_andmetric_gastronomi_mod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import milas_andmetric_gastronomi_mod.entity.SmorevoladorEntity;

import milas_andmetric_gastronomi_mod.client.model.Modelvoladorsmore;

public class SmorevoladorRenderer extends MobRenderer<SmorevoladorEntity, LivingEntityRenderState, Modelvoladorsmore> {
	private SmorevoladorEntity entity = null;

	public SmorevoladorRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelvoladorsmore(context.bakeLayer(Modelvoladorsmore.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SmorevoladorEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("milas_and_metric_gastronomy_mod:textures/entities/volladorsmore.png");
	}
}