/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package milas_andmetric_gastronomi_mod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.items.wrapper.SidedInvWrapper;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import milas_andmetric_gastronomi_mod.block.entity.EstatuanaitbearBlockEntity;
import milas_andmetric_gastronomi_mod.block.entity.BloqueserpienteBlockEntity;

import milas_andmetric_gastronomi_mod.MilasAndMetricGastronomyModMod;

@EventBusSubscriber
public class MilasAndMetricGastronomyModModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, MilasAndMetricGastronomyModMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BloqueserpienteBlockEntity>> BLOQUESERPIENTE = register("bloqueserpiente", MilasAndMetricGastronomyModModBlocks.BLOQUESERPIENTE, BloqueserpienteBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<EstatuanaitbearBlockEntity>> ESTATUANAITBEAR = register("estatuanaitbear", MilasAndMetricGastronomyModModBlocks.ESTATUANAITBEAR, EstatuanaitbearBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static <T extends BlockEntity> DeferredHolder<BlockEntityType<?>, BlockEntityType<T>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<T> supplier) {
		return REGISTRY.register(registryname, () -> new BlockEntityType(supplier, block.get()));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BLOQUESERPIENTE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ESTATUANAITBEAR.get(), SidedInvWrapper::new);
	}
}