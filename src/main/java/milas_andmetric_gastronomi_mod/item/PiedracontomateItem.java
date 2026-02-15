package milas_andmetric_gastronomi_mod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import milas_andmetric_gastronomi_mod.procedures.PiedracontomatoProcedure;

public class PiedracontomateItem extends Item {
	public PiedracontomateItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).food((new FoodProperties.Builder()).nutrition(5).saturationModifier(1.6f).alwaysEdible().build()));
	}

	@Override
	public boolean releaseUsing(ItemStack itemstack, Level world, LivingEntity entity, int time) {
		PiedracontomatoProcedure.execute(entity);
		return super.releaseUsing(itemstack, world, entity, time);
	}
}