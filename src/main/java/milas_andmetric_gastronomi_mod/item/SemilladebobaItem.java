package milas_andmetric_gastronomi_mod.item;

import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class SemilladebobaItem extends Item {
	public SemilladebobaItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(2).saturationModifier(1.2f).alwaysEdible().build(), Consumables.DEFAULT_DRINK));
	}
}