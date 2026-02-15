package milas_andmetric_gastronomi_mod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import milas_andmetric_gastronomi_mod.MilasAndMetricGastronomyModMod;

public class GummybearItem extends Item {
	public GummybearItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).stacksTo(1).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(MilasAndMetricGastronomyModMod.MODID, "gummybear"))));
	}
}