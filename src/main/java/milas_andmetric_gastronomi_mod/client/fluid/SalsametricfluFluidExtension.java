package milas_andmetric_gastronomi_mod.client.fluid;

import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.resources.ResourceLocation;

import milas_andmetric_gastronomi_mod.init.MilasAndMetricGastronomyModModFluidTypes;

@EventBusSubscriber(Dist.CLIENT)
public class SalsametricfluFluidExtension {
	@SubscribeEvent
	public static void registerFluidTypeExtensions(RegisterClientExtensionsEvent event) {
		event.registerFluidType(new IClientFluidTypeExtensions() {
			private static final ResourceLocation STILL_TEXTURE = ResourceLocation.parse("milas_and_metric_gastronomy_mod:block/salsametric1");
			private static final ResourceLocation FLOWING_TEXTURE = ResourceLocation.parse("milas_and_metric_gastronomy_mod:block/salsametric");

			@Override
			public ResourceLocation getStillTexture() {
				return STILL_TEXTURE;
			}

			@Override
			public ResourceLocation getFlowingTexture() {
				return FLOWING_TEXTURE;
			}
		}, MilasAndMetricGastronomyModModFluidTypes.SALSAMETRICFLU_TYPE.get());
	}
}