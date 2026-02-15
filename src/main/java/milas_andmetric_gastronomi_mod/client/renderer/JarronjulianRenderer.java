package milas_andmetric_gastronomi_mod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import milas_andmetric_gastronomi_mod.entity.JarronjulianEntity;

import milas_andmetric_gastronomi_mod.client.model.Modeljarron;

public class JarronjulianRenderer extends MobRenderer<JarronjulianEntity, LivingEntityRenderState, Modeljarron> {
	private JarronjulianEntity entity = null;

	public JarronjulianRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeljarron(context.bakeLayer(Modeljarron.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(JarronjulianEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("milas_and_metric_gastronomy_mod:textures/entities/jarronjulian.png");
	}
}