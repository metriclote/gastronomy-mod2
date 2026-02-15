package milas_andmetric_gastronomi_mod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class Gomita4Item extends Item {
	public Gomita4Item(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(6).saturationModifier(1f).build()));
	}
}