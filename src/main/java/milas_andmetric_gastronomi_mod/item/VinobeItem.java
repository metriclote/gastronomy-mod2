package milas_andmetric_gastronomi_mod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;

import milas_andmetric_gastronomi_mod.procedures.FurroefectProcedure;

public class VinobeItem extends Item {
	public VinobeItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).food((new FoodProperties.Builder()).nutrition(14).saturationModifier(5.5f).alwaysEdible().build(), Consumables.DEFAULT_DRINK));
	}

	@Override
	public boolean onDroppedByPlayer(ItemStack itemstack, Player entity) {
		FurroefectProcedure.execute(entity);
		return true;
	}

	@Override
	public boolean releaseUsing(ItemStack itemstack, Level world, LivingEntity entity, int time) {
		FurroefectProcedure.execute(entity);
		return super.releaseUsing(itemstack, world, entity, time);
	}
}