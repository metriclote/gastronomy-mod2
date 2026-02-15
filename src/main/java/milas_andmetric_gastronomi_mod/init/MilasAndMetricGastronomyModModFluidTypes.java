/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package milas_andmetric_gastronomi_mod.init;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

import milas_andmetric_gastronomi_mod.fluid.types.SalsamilasfluFluidType;
import milas_andmetric_gastronomi_mod.fluid.types.SalsametricfluFluidType;

import milas_andmetric_gastronomi_mod.MilasAndMetricGastronomyModMod;

public class MilasAndMetricGastronomyModModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, MilasAndMetricGastronomyModMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> SALSAMILASFLU_TYPE = REGISTRY.register("salsamilasflu", () -> new SalsamilasfluFluidType());
	public static final DeferredHolder<FluidType, FluidType> SALSAMETRICFLU_TYPE = REGISTRY.register("salsametricflu", () -> new SalsametricfluFluidType());
}