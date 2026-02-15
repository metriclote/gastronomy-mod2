package milas_andmetric_gastronomi_mod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import milas_andmetric_gastronomi_mod.entity.OllitacchuleEntity;

import milas_andmetric_gastronomi_mod.client.model.Modelchef;

import com.mojang.blaze3d.vertex.PoseStack;

public class OllitacchuleRenderer extends MobRenderer<OllitacchuleEntity, LivingEntityRenderState, Modelchef> {
	private OllitacchuleEntity entity = null;

	public OllitacchuleRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelchef(context.bakeLayer(Modelchef.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(OllitacchuleEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("milas_and_metric_gastronomy_mod:textures/entities/chileollita.png");
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(entity.getAgeScale(), entity.getAgeScale(), entity.getAgeScale());
	}
}