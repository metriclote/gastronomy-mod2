package milas_andmetric_gastronomi_mod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class GranddumplingItem extends Item {
	public GranddumplingItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).food((new FoodProperties.Builder()).nutrition(12).saturationModifier(2f).alwaysEdible().build()));
	}
}