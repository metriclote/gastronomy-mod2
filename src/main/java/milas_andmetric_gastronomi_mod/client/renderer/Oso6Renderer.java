package milas_andmetric_gastronomi_mod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import milas_andmetric_gastronomi_mod.entity.Oso6Entity;

import milas_andmetric_gastronomi_mod.client.model.Modelboss_gummy_bear;

import com.mojang.blaze3d.vertex.PoseStack;

public class Oso6Renderer extends MobRenderer<Oso6Entity, LivingEntityRenderState, Modelboss_gummy_bear> {
	private Oso6Entity entity = null;

	public Oso6Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelboss_gummy_bear(context.bakeLayer(Modelboss_gummy_bear.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(Oso6Entity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("milas_and_metric_gastronomy_mod:textures/entities/gummy_bear_blanco.png");
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(entity.getAgeScale(), entity.getAgeScale(), entity.getAgeScale());
	}
}