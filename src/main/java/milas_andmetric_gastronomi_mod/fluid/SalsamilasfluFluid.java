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

public abstract class SalsamilasfluFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> MilasAndMetricGastronomyModModFluidTypes.SALSAMILASFLU_TYPE.get(), () -> MilasAndMetricGastronomyModModFluids.SALSAMILASFLU.get(),
			() -> MilasAndMetricGastronomyModModFluids.FLOWING_SALSAMILASFLU.get()).explosionResistance(100f).bucket(() -> MilasAndMetricGastronomyModModItems.SALSAMILASFLU_BUCKET.get())
			.block(() -> (LiquidBlock) MilasAndMetricGastronomyModModBlocks.SALSAMILASFLU.get());

	private SalsamilasfluFluid() {
		super(PROPERTIES);
	}

	public static class Source extends SalsamilasfluFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends SalsamilasfluFluid {
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