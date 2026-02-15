package milas_andmetric_gastronomi_mod.item;

import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CcopadevinoItem extends Item {
	public CcopadevinoItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(6).saturationModifier(0.3f).build(), Consumables.DEFAULT_DRINK));
	}
}