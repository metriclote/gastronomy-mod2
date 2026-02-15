package milas_andmetric_gastronomi_mod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import milas_andmetric_gastronomi_mod.entity.Heladomob3Entity;

import milas_andmetric_gastronomi_mod.client.model.Modelicecream;

public class Heladomob3Renderer extends MobRenderer<Heladomob3Entity, LivingEntityRenderState, Modelicecream> {
	private Heladomob3Entity entity = null;

	public Heladomob3Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelicecream(context.bakeLayer(Modelicecream.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(Heladomob3Entity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("milas_and_metric_gastronomy_mod:textures/entities/helado7.png");
	}
}