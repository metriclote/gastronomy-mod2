package milas_andmetric_gastronomi_mod.recipe.brewing;

import net.neoforged.neoforge.event.brewing.RegisterBrewingRecipesEvent;
import net.neoforged.neoforge.common.brewing.IBrewingRecipe;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;

import milas_andmetric_gastronomi_mod.init.MilasAndMetricGastronomyModModItems;

@EventBusSubscriber
public class VinomoxBrewingRecipe implements IBrewingRecipe {
	@SubscribeEvent
	public static void init(RegisterBrewingRecipesEvent event) {
		event.getBuilder().addRecipe(new VinomoxBrewingRecipe());
	}

	@Override
	public boolean isInput(ItemStack input) {
		return Ingredient.of(MilasAndMetricGastronomyModModItems.VINOMOXTWZL.get()).test(input);
	}

	@Override
	public boolean isIngredient(ItemStack ingredient) {
		return Ingredient.of(MilasAndMetricGastronomyModModItems.CUBETADEUVASBLANCAS.get()).test(ingredient);
	}

	@Override
	public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
		if (isInput(input) && isIngredient(ingredient)) {
			return new ItemStack(MilasAndMetricGastronomyModModItems.VINOMOXZTWL.get());
		}
		return ItemStack.EMPTY;
	}
}