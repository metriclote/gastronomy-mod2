package milas_andmetric_gastronomi_mod.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

import milas_andmetric_gastronomi_mod.init.MilasAndMetricGastronomyModModFluids;

public class SalsamilasfluBlock extends LiquidBlock {
	public SalsamilasfluBlock(BlockBehaviour.Properties properties) {
		super(MilasAndMetricGastronomyModModFluids.SALSAMILASFLU.get(), properties.mapColor(MapColor.WATER).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}