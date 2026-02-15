package milas_andmetric_gastronomi_mod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import milas_andmetric_gastronomi_mod.entity.DonasanguijuelaEntity;

import milas_andmetric_gastronomi_mod.client.model.Modeldonasanguijuela;

public class DonasanguijuelaRenderer extends MobRenderer<DonasanguijuelaEntity, LivingEntityRenderState, Modeldonasanguijuela> {
	private DonasanguijuelaEntity entity = null;

	public DonasanguijuelaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldonasanguijuela(context.bakeLayer(Modeldonasanguijuela.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(DonasanguijuelaEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("milas_and_metric_gastronomy_mod:textures/entities/donasanguijuela2.png");
	}
}