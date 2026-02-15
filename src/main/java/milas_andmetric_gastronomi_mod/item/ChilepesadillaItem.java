package milas_andmetric_gastronomi_mod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class ChilepesadillaItem extends Item {
	public ChilepesadillaItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(-2).saturationModifier(0.4f).alwaysEdible().build()));
	}
}