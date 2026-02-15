package milas_andmetric_gastronomi_mod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class HeladodobbyItem extends Item {
	public HeladodobbyItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(12).saturationModifier(2f).alwaysEdible().build()));
	}
}