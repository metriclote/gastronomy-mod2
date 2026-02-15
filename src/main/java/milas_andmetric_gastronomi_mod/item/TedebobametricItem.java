package milas_andmetric_gastronomi_mod.item;

import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class TedebobametricItem extends Item {
	public TedebobametricItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).food((new FoodProperties.Builder()).nutrition(12).saturationModifier(1.2f).alwaysEdible().build(), Consumables.DEFAULT_DRINK));
	}
}