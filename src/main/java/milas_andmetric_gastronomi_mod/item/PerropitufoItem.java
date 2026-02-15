package milas_andmetric_gastronomi_mod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import milas_andmetric_gastronomi_mod.procedures.PerropitufoeProcedure;

public class PerropitufoItem extends Item {
	public PerropitufoItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).food((new FoodProperties.Builder()).nutrition(12).saturationModifier(5.5f).build()));
	}

	@Override
	public boolean releaseUsing(ItemStack itemstack, Level world, LivingEntity entity, int time) {
		PerropitufoeProcedure.execute(entity);
		return super.releaseUsing(itemstack, world, entity, time);
	}
}