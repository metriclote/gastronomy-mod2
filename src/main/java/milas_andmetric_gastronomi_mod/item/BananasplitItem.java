package milas_andmetric_gastronomi_mod.item;

import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class BananasplitItem extends Item {
	public BananasplitItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(7).saturationModifier(1.3f).alwaysEdible().build(), Consumables.defaultFood().consumeSeconds(0F).build()));
	}
}