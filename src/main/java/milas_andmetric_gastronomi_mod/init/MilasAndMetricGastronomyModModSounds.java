/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package milas_andmetric_gastronomi_mod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import milas_andmetric_gastronomi_mod.MilasAndMetricGastronomyModMod;

public class MilasAndMetricGastronomyModModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, MilasAndMetricGastronomyModMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> CRISTALFUNDIDO = REGISTRY.register("cristalfundido",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("milas_and_metric_gastronomy_mod", "cristalfundido")));
	public static final DeferredHolder<SoundEvent, SoundEvent> FUNFI = REGISTRY.register("funfi", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("milas_and_metric_gastronomy_mod", "funfi")));
	public static final DeferredHolder<SoundEvent, SoundEvent> HADAVOICE = REGISTRY.register("hadavoice", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("milas_and_metric_gastronomy_mod", "hadavoice")));
	public static final DeferredHolder<SoundEvent, SoundEvent> HADAV2 = REGISTRY.register("hadav2", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("milas_and_metric_gastronomy_mod", "hadav2")));
	public static final DeferredHolder<SoundEvent, SoundEvent> METRICSOUND = REGISTRY.register("metricsound", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("milas_and_metric_gastronomy_mod", "metricsound")));
	public static final DeferredHolder<SoundEvent, SoundEvent> CORRIN_BIOME = REGISTRY.register("corrin_biome", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("milas_and_metric_gastronomy_mod", "corrin_biome")));
}