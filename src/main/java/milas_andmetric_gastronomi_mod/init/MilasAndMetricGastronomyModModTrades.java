/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package milas_andmetric_gastronomi_mod.init;

import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

@EventBusSubscriber
public class MilasAndMetricGastronomyModModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.CLERIC) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 15), new ItemStack(Items.WOLF_SPAWN_EGG, 3), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.CLERIC) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 30), new ItemStack(Items.WOLF_SPAWN_EGG, 6), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.BUTCHER) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.BEEF, 2), new ItemStack(Items.EMERALD, 4), new ItemStack(MilasAndMetricGastronomyModModItems.ALBONDIGA.get()), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.BUTCHER) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.BEEF), new ItemStack(Items.EMERALD, 5), new ItemStack(MilasAndMetricGastronomyModModItems.SALCHICHA.get()), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 20), new ItemStack(Items.WHEAT_SEEDS, 20), new ItemStack(MilasAndMetricGastronomyModModItems.GRANODECAFE.get(), 3), 50, 100, 0.05f));
		}
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 15), new ItemStack(MilasAndMetricGastronomyModModItems.UVASBLANCAS.get(), 2), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 10), new ItemStack(MilasAndMetricGastronomyModModItems.UVAS.get(), 2), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 15), new ItemStack(MilasAndMetricGastronomyModModItems.UVAS.get(), 3), 10, 10, 0.05f));
		}
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 10), new ItemStack(Items.WHEAT_SEEDS, 40), new ItemStack(MilasAndMetricGastronomyModModItems.ARANDANO.get(), 4), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 8), new ItemStack(MilasAndMetricGastronomyModModItems.TOMATE.get()), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 16), new ItemStack(MilasAndMetricGastronomyModModItems.TOMATE.get(), 2), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2), new ItemStack(Items.REDSTONE, 8), new ItemStack(MilasAndMetricGastronomyModModItems.PIMIENTA.get(), 4), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(MilasAndMetricGastronomyModModItems.PINA.get(), 2), 10, 100, 0.05f));
		}
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 10), new ItemStack(MilasAndMetricGastronomyModModItems.AGUACATE.get(), 2), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.WHEAT_SEEDS, 10), new ItemStack(Items.EMERALD, 3), new ItemStack(MilasAndMetricGastronomyModModItems.LIMON.get(), 2), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.WHEAT_SEEDS, 20), new ItemStack(Items.EMERALD, 5), new ItemStack(MilasAndMetricGastronomyModModItems.NARANA.get(), 3), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.ARMORER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(MilasAndMetricGastronomyModModItems.BANANA.get()), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 6), new ItemStack(MilasAndMetricGastronomyModModItems.LETTUCE.get(), 2), 10, 5, 0.05f));
		}
		if (event.getType() == ResourceKey.create(Registries.VILLAGER_PROFESSION, ResourceLocation.parse("milas_and_metric_gastronomy_mod:vendedorchino"))) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 10), new ItemStack(MilasAndMetricGastronomyModModItems.GREENGRAPES.get(), 3), 10, 5, 0.05f));
		}
		if (event.getType() == ResourceKey.create(Registries.VILLAGER_PROFESSION, ResourceLocation.parse("milas_and_metric_gastronomy_mod:vendedorchino"))) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD), new ItemStack(MilasAndMetricGastronomyModModItems.CEREZA.get()), 20, 10, 0.05f));
		}
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 20), new ItemStack(Items.WHEAT_SEEDS, 15), new ItemStack(MilasAndMetricGastronomyModModItems.ARROZ.get(), 4), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 15), new ItemStack(MilasAndMetricGastronomyModModItems.ARROZ.get()), 10, 100, 0.05f));
		}
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 8), new ItemStack(MilasAndMetricGastronomyModModItems.CHILE.get()), 20, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 10), new ItemStack(MilasAndMetricGastronomyModModItems.CEBOLLA.get()), 10, 5, 0.05f));
		}
		if (event.getType() == ResourceKey.create(Registries.VILLAGER_PROFESSION, ResourceLocation.parse("milas_and_metric_gastronomy_mod:vendedorchino"))) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2), new ItemStack(MilasAndMetricGastronomyModModItems.SEMILLADEBOBA.get()), 10, 5, 0.05f));
		}
		if (event.getType() == ResourceKey.create(Registries.VILLAGER_PROFESSION, ResourceLocation.parse("milas_and_metric_gastronomy_mod:vendedorchino"))) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 10), new ItemStack(MilasAndMetricGastronomyModModItems.DUMPLINGS.get(), 3), 10, 5, 0.05f));
		}
		if (event.getType() == ResourceKey.create(Registries.VILLAGER_PROFESSION, ResourceLocation.parse("milas_and_metric_gastronomy_mod:vendedorchino"))) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 12), new ItemStack(MilasAndMetricGastronomyModModItems.TEDEBOBA.get(), 3), 10, 5, 0.05f));
		}
		if (event.getType() == ResourceKey.create(Registries.VILLAGER_PROFESSION, ResourceLocation.parse("milas_and_metric_gastronomy_mod:vendedorchino"))) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 7), new ItemStack(MilasAndMetricGastronomyModModItems.SHUSHI.get(), 2), 10, 5, 0.05f));
		}
		if (event.getType() == ResourceKey.create(Registries.VILLAGER_PROFESSION, ResourceLocation.parse("milas_and_metric_gastronomy_mod:vendedorchino"))) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(MilasAndMetricGastronomyModModItems.DURIAN.get()), 10, 5, 0.05f));
		}
		if (event.getType() == ResourceKey.create(Registries.VILLAGER_PROFESSION, ResourceLocation.parse("milas_and_metric_gastronomy_mod:vendedorchino"))) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(MilasAndMetricGastronomyModModItems.SATAANDAGUI.get()), 10, 5, 0.05f));
		}
		if (event.getType() == ResourceKey.create(Registries.VILLAGER_PROFESSION, ResourceLocation.parse("milas_and_metric_gastronomy_mod:vendedorchino"))) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 6), new ItemStack(MilasAndMetricGastronomyModModItems.GRANADILLAROJA.get()), 10, 5, 0.05f));
		}
		if (event.getType() == ResourceKey.create(Registries.VILLAGER_PROFESSION, ResourceLocation.parse("milas_and_metric_gastronomy_mod:vendedorchino"))) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 7), new ItemStack(MilasAndMetricGastronomyModModItems.BOLADESESAMO.get(), 2), 10, 5, 0.05f));
		}
	}
}