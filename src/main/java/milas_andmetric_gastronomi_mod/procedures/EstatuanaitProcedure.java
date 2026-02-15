package milas_andmetric_gastronomi_mod.procedures;

import net.neoforged.neoforge.event.level.BlockEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import milas_andmetric_gastronomi_mod.init.MilasAndMetricGastronomyModModEntities;
import milas_andmetric_gastronomi_mod.init.MilasAndMetricGastronomyModModBlocks;

import javax.annotation.Nullable;

@EventBusSubscriber
public class EstatuanaitProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ());
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))) == MilasAndMetricGastronomyModModBlocks.ESTATUANAITBEAR.get().defaultBlockState()) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = MilasAndMetricGastronomyModModEntities.NAITBEAR.get().spawn(_level, BlockPos.containing(x + 0.5, y + 1, z + 0.5), EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			world.destroyBlock(BlockPos.containing(x, y, z), false);
		} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))) == MilasAndMetricGastronomyModModBlocks.ESTATUANAITBEAR.get().defaultBlockState()) {
			world.destroyBlock(BlockPos.containing(x, y, z), false);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = MilasAndMetricGastronomyModModEntities.NAITBEAR.get().spawn(_level, BlockPos.containing(x + 0.5, y + 1, z + 0.5), EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
	}
}