package milas_andmetric_gastronomi_mod.item;

import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class SopadetomateItem extends Item {
	public SopadetomateItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(7).saturationModifier(1.1f).build(), Consumables.DEFAULT_DRINK).usingConvertsTo(Items.BOWL));
	}
}