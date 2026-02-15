package milas_andmetric_gastronomi_mod.fluid;

import org.apache.logging.log4j.core.util.Source;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import milas_andmetric_gastronomi_mod.init.MilasAndMetricGastronomyModModItems;
import milas_andmetric_gastronomi_mod.init.MilasAndMetricGastronomyModModFluids;
import milas_andmetric_gastronomi_mod.init.MilasAndMetricGastronomyModModFluidTypes;
import milas_andmetric_gastronomi_mod.init.MilasAndMetricGastronomyModModBlocks;

public abstract class SalsametricfluFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> MilasAndMetricGastronomyModModFluidTypes.SALSAMETRICFLU_TYPE.get(), () -> MilasAndMetricGastronomyModModFluids.SALSAMETRICFLU.get(),
			() -> MilasAndMetricGastronomyModModFluids.FLOWING_SALSAMETRICFLU.get()).explosionResistance(100f).tickRate(8).bucket(() -> MilasAndMetricGastronomyModModItems.SALSAMETRICFLU_BUCKET.get())
			.block(() -> (LiquidBlock) MilasAndMetricGastronomyModModBlocks.SALSAMETRICFLU.get());

	private SalsametricfluFluid() {
		super(PROPERTIES);
	}

	public static class Source extends SalsametricfluFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends SalsametricfluFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}