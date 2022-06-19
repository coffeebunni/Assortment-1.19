package net.mynastudios.assortment.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.mynastudios.assortment.Assortment;


public class AssortmentTags {
    public static class Blocks{
        public static final TagKey<Block> STEEL_BLOCKS = createCommonTag("steel_blocks");
        public static final TagKey<Block> ROSE_GOLD_BLOCKS = createCommonTag("rose_gold_blocks");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier(Assortment.MODID, name));
        }
        private static TagKey<Block> createCommonTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier("c", name));
        }
    }
    public static class Items{
        public static final TagKey<Item> MELEE_CRATE_ITEMS_COMMON = createTag("melee_crate_items_common");
        public static final TagKey<Item> MELEE_CRATE_ITEMS_RARE = createTag("melee_crate_items_rare");

        public static final TagKey<Item> RANGED_CRATE_ITEMS_COMMON = createTag("ranged_crate_items_common");
        public static final TagKey<Item> RANGED_CRATE_ITEMS_RARE = createTag("ranged_crate_items_rare");

        public static final TagKey<Item> ARMOR_CRATE_ITEMS_COMMON = createTag("armor_crate_items_common");
        public static final TagKey<Item> ARMOR_CRATE_ITEMS_RARE = createTag("armor_crate_items_rare");

        public static final TagKey<Item> FISHING_CRATE_ITEMS_COMMON = createTag("fishing_crate_items_common");
        public static final TagKey<Item> FISHING_CRATE_ITEMS_RARE = createTag("fishing_crate_items_rare");

        public static final TagKey<Item> STEEL_INGOTS = createCommonTag("steel_ingots");
        public static final TagKey<Item> ROSE_GOLD_INGOTS = createCommonTag("rose_gold_ingots");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier(Assortment.MODID, name));
        }
        private static TagKey<Item> createCommonTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier("c", name));
        }
    }
}
