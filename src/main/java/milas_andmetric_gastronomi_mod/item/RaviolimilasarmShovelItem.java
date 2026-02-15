package milas_andmetric_gastronomi_mod.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class RaviolimilasarmShovelItem extends ShovelItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1000, 25f, 0, 14,
			TagKey.create(Registries.ITEM, ResourceLocation.parse("milas_and_metric_gastronomy_mod:raviolimilasarm_shovel_repair_items")));

	public RaviolimilasarmShovelItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 1f, -3f, properties);
	}
}