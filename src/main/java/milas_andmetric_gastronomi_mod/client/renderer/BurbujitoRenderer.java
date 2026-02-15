package milas_andmetric_gastronomi_mod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import milas_andmetric_gastronomi_mod.entity.BurbujitoEntity;

import milas_andmetric_gastronomi_mod.client.model.Modeljuliancola;

import com.mojang.blaze3d.vertex.PoseStack;

public class BurbujitoRenderer extends MobRenderer<BurbujitoEntity, LivingEntityRenderState, Modeljuliancola> {
	private BurbujitoEntity entity = null;

	public BurbujitoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeljuliancola(context.bakeLayer(Modeljuliancola.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(BurbujitoEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("milas_and_metric_gastronomy_mod:textures/entities/burbujito.png");
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(entity.getAgeScale(), entity.getAgeScale(), entity.getAgeScale());
	}
}