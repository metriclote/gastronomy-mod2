package milas_andmetric_gastronomi_mod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import milas_andmetric_gastronomi_mod.entity.Phatompaleta2Entity;

import milas_andmetric_gastronomi_mod.client.model.Modelphatompaleta;

public class Phatompaleta2Renderer extends MobRenderer<Phatompaleta2Entity, LivingEntityRenderState, Modelphatompaleta> {
	private Phatompaleta2Entity entity = null;

	public Phatompaleta2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelphatompaleta(context.bakeLayer(Modelphatompaleta.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(Phatompaleta2Entity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("milas_and_metric_gastronomy_mod:textures/entities/phantom.png");
	}
}