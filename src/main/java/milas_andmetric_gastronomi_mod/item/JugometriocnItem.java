package milas_andmetric_gastronomi_mod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import milas_andmetric_gastronomi_mod.procedures.Nx2Procedure;

public class JugometriocnItem extends Item {
	public JugometriocnItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).food((new FoodProperties.Builder()).nutrition(14).saturationModifier(6f).alwaysEdible().build(), Consumables.DEFAULT_DRINK));
	}

	@Override
	public boolean releaseUsing(ItemStack itemstack, Level world, LivingEntity entity, int time) {
		Nx2Procedure.execute(entity);
		return super.releaseUsing(itemstack, world, entity, time);
	}
}