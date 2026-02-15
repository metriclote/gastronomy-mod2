/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package milas_andmetric_gastronomi_mod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import milas_andmetric_gastronomi_mod.block.*;

import milas_andmetric_gastronomi_mod.MilasAndMetricGastronomyModMod;

import java.util.function.Function;

public class MilasAndMetricGastronomyModModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(MilasAndMetricGastronomyModMod.MODID);
	public static final DeferredBlock<Block> MESADEGATRONOMIA;
	public static final DeferredBlock<Block> SALSAMILASFLU;
	public static final DeferredBlock<Block> GASTRONOMIWORLD_PORTAL;
	public static final DeferredBlock<Block> SAL_ORE;
	public static final DeferredBlock<Block> SAL_BLOCK;
	public static final DeferredBlock<Block> SALSAMETRICFLU;
	public static final DeferredBlock<Block> BLOQUEMILAS;
	public static final DeferredBlock<Block> MUNDOMILAS_PORTAL;
	public static final DeferredBlock<Block> PALTA_WOOD;
	public static final DeferredBlock<Block> PALTA_LOG;
	public static final DeferredBlock<Block> PALTA_PLANKS;
	public static final DeferredBlock<Block> PALTA_LEAVES;
	public static final DeferredBlock<Block> PALTA_STAIRS;
	public static final DeferredBlock<Block> PALTA_SLAB;
	public static final DeferredBlock<Block> PALTA_FENCE;
	public static final DeferredBlock<Block> PALTA_FENCE_GATE;
	public static final DeferredBlock<Block> PALTA_PRESSURE_PLATE;
	public static final DeferredBlock<Block> PALTA_BUTTON;
	public static final DeferredBlock<Block> CRISTAL_HELADO_ORE;
	public static final DeferredBlock<Block> CRISTAL_HELADO_BLOCK;
	public static final DeferredBlock<Block> CRISTALDE_CARAMELO_ORE;
	public static final DeferredBlock<Block> CRISTALDE_CARAMELO_BLOCK;
	public static final DeferredBlock<Block> SALMISTICAS_ORE;
	public static final DeferredBlock<Block> SALMISTICAS_BLOCK;
	public static final DeferredBlock<Block> TOMATO_STAGE_0;
	public static final DeferredBlock<Block> TOMATO_STAGE_1;
	public static final DeferredBlock<Block> TOMATO_STAGE_2;
	public static final DeferredBlock<Block> TOMATO_STAGE_3;
	public static final DeferredBlock<Block> CANDYGRASS;
	public static final DeferredBlock<Block> CANDYBARPLANT;
	public static final DeferredBlock<Block> BLOQUESERPIENTE;
	public static final DeferredBlock<Block> ESTATUANAITBEAR;
	static {
		MESADEGATRONOMIA = register("mesadegatronomia", MesadegatronomiaBlock::new);
		SALSAMILASFLU = register("salsamilasflu", SalsamilasfluBlock::new);
		GASTRONOMIWORLD_PORTAL = register("gastronomiworld_portal", GastronomiworldPortalBlock::new);
		SAL_ORE = register("sal_ore", SalOreBlock::new);
		SAL_BLOCK = register("sal_block", SalBlockBlock::new);
		SALSAMETRICFLU = register("salsametricflu", SalsametricfluBlock::new);
		BLOQUEMILAS = register("bloquemilas", BloquemilasBlock::new);
		MUNDOMILAS_PORTAL = register("mundomilas_portal", MundomilasPortalBlock::new);
		PALTA_WOOD = register("palta_wood", PaltaWoodBlock::new);
		PALTA_LOG = register("palta_log", PaltaLogBlock::new);
		PALTA_PLANKS = register("palta_planks", PaltaPlanksBlock::new);
		PALTA_LEAVES = register("palta_leaves", PaltaLeavesBlock::new);
		PALTA_STAIRS = register("palta_stairs", PaltaStairsBlock::new);
		PALTA_SLAB = register("palta_slab", PaltaSlabBlock::new);
		PALTA_FENCE = register("palta_fence", PaltaFenceBlock::new);
		PALTA_FENCE_GATE = register("palta_fence_gate", PaltaFenceGateBlock::new);
		PALTA_PRESSURE_PLATE = register("palta_pressure_plate", PaltaPressurePlateBlock::new);
		PALTA_BUTTON = register("palta_button", PaltaButtonBlock::new);
		CRISTAL_HELADO_ORE = register("cristal_helado_ore", CristalHeladoOreBlock::new);
		CRISTAL_HELADO_BLOCK = register("cristal_helado_block", CristalHeladoBlockBlock::new);
		CRISTALDE_CARAMELO_ORE = register("cristalde_caramelo_ore", CristaldeCarameloOreBlock::new);
		CRISTALDE_CARAMELO_BLOCK = register("cristalde_caramelo_block", CristaldeCarameloBlockBlock::new);
		SALMISTICAS_ORE = register("salmisticas_ore", SalmisticasOreBlock::new);
		SALMISTICAS_BLOCK = register("salmisticas_block", SalmisticasBlockBlock::new);
		TOMATO_STAGE_0 = register("tomato_stage_0", TomatoStage0Block::new);
		TOMATO_STAGE_1 = register("tomato_stage_1", TomatoStage1Block::new);
		TOMATO_STAGE_2 = register("tomato_stage_2", TomatoStage2Block::new);
		TOMATO_STAGE_3 = register("tomato_stage_3", TomatoStage3Block::new);
		CANDYGRASS = register("candygrass", CandygrassBlock::new);
		CANDYBARPLANT = register("candybarplant", CandybarplantBlock::new);
		BLOQUESERPIENTE = register("bloqueserpiente", BloqueserpienteBlock::new);
		ESTATUANAITBEAR = register("estatuanaitbear", EstatuanaitbearBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}