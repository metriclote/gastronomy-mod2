/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package milas_andmetric_gastronomi_mod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import milas_andmetric_gastronomi_mod.fluid.SalsamilasfluFluid;
import milas_andmetric_gastronomi_mod.fluid.SalsametricfluFluid;

import milas_andmetric_gastronomi_mod.MilasAndMetricGastronomyModMod;

public class MilasAndMetricGastronomyModModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(BuiltInRegistries.FLUID, MilasAndMetricGastronomyModMod.MODID);
	public static final DeferredHolder<Fluid, FlowingFluid> SALSAMILASFLU = REGISTRY.register("salsamilasflu", () -> new SalsamilasfluFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_SALSAMILASFLU = REGISTRY.register("flowing_salsamilasflu", () -> new SalsamilasfluFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> SALSAMETRICFLU = REGISTRY.register("salsametricflu", () -> new SalsametricfluFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_SALSAMETRICFLU = REGISTRY.register("flowing_salsametricflu", () -> new SalsametricfluFluid.Flowing());

	@EventBusSubscriber(Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(SALSAMILASFLU.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_SALSAMILASFLU.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(SALSAMETRICFLU.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_SALSAMETRICFLU.get(), RenderType.translucent());
		}
	}
}