package milas_andmetric_gastronomi_mod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class AguacateencantadoItem extends Item {
	public AguacateencantadoItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).food((new FoodProperties.Builder()).nutrition(5).saturationModifier(0.4f).build()));
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}