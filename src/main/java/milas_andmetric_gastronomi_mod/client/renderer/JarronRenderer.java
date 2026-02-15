package milas_andmetric_gastronomi_mod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import milas_andmetric_gastronomi_mod.entity.JarronEntity;

import milas_andmetric_gastronomi_mod.client.model.Modeljarron;

public class JarronRenderer extends MobRenderer<JarronEntity, LivingEntityRenderState, Modeljarron> {
	private JarronEntity entity = null;

	public JarronRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeljarron(context.bakeLayer(Modeljarron.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(JarronEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("milas_and_metric_gastronomy_mod:textures/entities/jarronb.png");
	}
}