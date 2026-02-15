package milas_andmetric_gastronomi_mod.item;

import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class JugodemanzanaItem extends Item {
	public JugodemanzanaItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(7).saturationModifier(1f).alwaysEdible().build(), Consumables.DEFAULT_DRINK));
	}
}