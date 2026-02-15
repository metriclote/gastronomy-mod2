package milas_andmetric_gastronomi_mod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import milas_andmetric_gastronomi_mod.entity.SandwichsalvajeEntity;

import milas_andmetric_gastronomi_mod.client.model.Modelsandw2;

public class SandwichsalvajeRenderer extends MobRenderer<SandwichsalvajeEntity, LivingEntityRenderState, Modelsandw2> {
	private SandwichsalvajeEntity entity = null;

	public SandwichsalvajeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsandw2(context.bakeLayer(Modelsandw2.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SandwichsalvajeEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("milas_and_metric_gastronomy_mod:textures/entities/sand2.png");
	}
}