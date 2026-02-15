package milas_andmetric_gastronomi_mod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class Gomita2Item extends Item {
	public Gomita2Item(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(6).saturationModifier(1f).build()));
	}
}