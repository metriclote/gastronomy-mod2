package milas_andmetric_gastronomi_mod.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class CuchillofunItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 1000, 6f, 0, 14, TagKey.create(Registries.ITEM, ResourceLocation.parse("milas_and_metric_gastronomy_mod:cuchillofun_repair_items")));

	public CuchillofunItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 98f, -3f));
	}
}