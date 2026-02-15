package milas_andmetric_gastronomi_mod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class BoladesesamoItem extends Item {
	public BoladesesamoItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(7).saturationModifier(0.3f).build()));
	}
}