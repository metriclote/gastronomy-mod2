package milas_andmetric_gastronomi_mod.item;

import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class JugodesandiaItem extends Item {
	public JugodesandiaItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(7).saturationModifier(1.4f).build(), Consumables.DEFAULT_DRINK));
	}
}