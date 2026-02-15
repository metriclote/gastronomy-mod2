package milas_andmetric_gastronomi_mod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import milas_andmetric_gastronomi_mod.MilasAndMetricGastronomyModMod;

public class CristalfundidoItem extends Item {
	public CristalfundidoItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).stacksTo(1).fireResistant().jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(MilasAndMetricGastronomyModMod.MODID, "cristalfundido"))));
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}