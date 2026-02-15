package milas_andmetric_gastronomi_mod.client.renderer.item;

import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.client.extensions.common.IClientItemExtensions;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.resources.model.EquipmentClientInfo;

import milas_andmetric_gastronomi_mod.init.MilasAndMetricGastronomyModModItems;

@EventBusSubscriber(Dist.CLIENT)
public class AaArmorArmor {
	@SubscribeEvent
	public static void registerItemExtensions(RegisterClientExtensionsEvent event) {
		event.registerItem(new IClientItemExtensions() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("milas_and_metric_gastronomy_mod:textures/models/armor/aa_layer_1.png");
			}
		}, MilasAndMetricGastronomyModModItems.AA_ARMOR_HELMET.get());
		event.registerItem(new IClientItemExtensions() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("milas_and_metric_gastronomy_mod:textures/models/armor/aa_layer_1.png");
			}
		}, MilasAndMetricGastronomyModModItems.AA_ARMOR_CHESTPLATE.get());
		event.registerItem(new IClientItemExtensions() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("milas_and_metric_gastronomy_mod:textures/models/armor/aa_layer_2.png");
			}
		}, MilasAndMetricGastronomyModModItems.AA_ARMOR_LEGGINGS.get());
		event.registerItem(new IClientItemExtensions() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("milas_and_metric_gastronomy_mod:textures/models/armor/aa_layer_1.png");
			}
		}, MilasAndMetricGastronomyModModItems.AA_ARMOR_BOOTS.get());
	}
}