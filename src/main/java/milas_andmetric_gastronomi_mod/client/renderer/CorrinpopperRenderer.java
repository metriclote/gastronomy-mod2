package milas_andmetric_gastronomi_mod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import milas_andmetric_gastronomi_mod.entity.CorrinpopperEntity;

import milas_andmetric_gastronomi_mod.client.model.Modelcornfeti_popper;

public class CorrinpopperRenderer extends MobRenderer<CorrinpopperEntity, LivingEntityRenderState, Modelcornfeti_popper> {
	private CorrinpopperEntity entity = null;

	public CorrinpopperRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcornfeti_popper(context.bakeLayer(Modelcornfeti_popper.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(CorrinpopperEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("milas_and_metric_gastronomy_mod:textures/entities/sweety_popper.png");
	}
}