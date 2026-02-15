package milas_andmetric_gastronomi_mod.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class RaviolimilasarmHoeItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1000, 25f, 0, 14,
			TagKey.create(Registries.ITEM, ResourceLocation.parse("milas_and_metric_gastronomy_mod:raviolimilasarm_hoe_repair_items")));

	public RaviolimilasarmHoeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 1f, -3f, properties);
	}
}