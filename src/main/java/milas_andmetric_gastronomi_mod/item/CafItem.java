package milas_andmetric_gastronomi_mod.item;

import net.neoforged.neoforge.event.ModifyDefaultComponentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.UseRemainder;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.core.component.DataComponents;

import milas_andmetric_gastronomi_mod.procedures.FurrofrioProcedure;

import milas_andmetric_gastronomi_mod.init.MilasAndMetricGastronomyModModItems;

@EventBusSubscriber
public class CafItem extends Item {
	public CafItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).food((new FoodProperties.Builder()).nutrition(14).saturationModifier(5.5f).alwaysEdible().build(), Consumables.DEFAULT_DRINK));
	}

	@SubscribeEvent
	public static void modifyItemComponents(ModifyDefaultComponentsEvent event) {
		event.modify(MilasAndMetricGastronomyModModItems.CAF.get(), builder -> builder.set(DataComponents.USE_REMAINDER, new UseRemainder(new ItemStack(MilasAndMetricGastronomyModModItems.TAZADECAFE.get()))));
	}

	@Override
	public boolean releaseUsing(ItemStack itemstack, Level world, LivingEntity entity, int time) {
		FurrofrioProcedure.execute(entity);
		return super.releaseUsing(itemstack, world, entity, time);
	}
}