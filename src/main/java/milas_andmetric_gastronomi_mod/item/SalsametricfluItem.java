package milas_andmetric_gastronomi_mod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import milas_andmetric_gastronomi_mod.init.MilasAndMetricGastronomyModModFluids;

public class SalsametricfluItem extends BucketItem {
	public SalsametricfluItem(Item.Properties properties) {
		super(MilasAndMetricGastronomyModModFluids.SALSAMETRICFLU.get(), properties.craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.UNCOMMON));
	}
}