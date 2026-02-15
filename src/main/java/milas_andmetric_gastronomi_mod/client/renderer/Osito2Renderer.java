package milas_andmetric_gastronomi_mod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import milas_andmetric_gastronomi_mod.entity.Osito2Entity;

import milas_andmetric_gastronomi_mod.client.model.Modelgummy_bear;

import com.mojang.blaze3d.vertex.PoseStack;

public class Osito2Renderer extends MobRenderer<Osito2Entity, LivingEntityRenderState, Modelgummy_bear> {
	private Osito2Entity entity = null;

	public Osito2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelgummy_bear(context.bakeLayer(Modelgummy_bear.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(Osito2Entity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("milas_and_metric_gastronomy_mod:textures/entities/gummy_bearrojo.png");
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(entity.getAgeScale(), entity.getAgeScale(), entity.getAgeScale());
	}
}