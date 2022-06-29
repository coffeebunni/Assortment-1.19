package net.mynastudios.assortment.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.mynastudios.assortment.Assortment;
import net.mynastudios.assortment.block.*;
import net.mynastudios.assortment.block.BaseTrapdoor;

@SuppressWarnings("unused")
public class AssortmentBlockInit {

    public static final Block COAL_SAND = registerBlock("coal_sand",
            new FallingBlock(FabricBlockSettings.copyOf(Blocks.SAND)), AssortmentItemGroup.ASSORTMENT_METALS);

    public static final Block IRON_SAND = registerBlock("iron_sand",
            new FallingBlock(FabricBlockSettings.copyOf(Blocks.SAND)), AssortmentItemGroup.ASSORTMENT_METALS);

    public static final Block STEEL_BLOCK = registerBlock("steel_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool()), AssortmentItemGroup.ASSORTMENT_METALS);

    public static final Block CUT_STEEL = registerBlock("cut_steel",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool()), AssortmentItemGroup.ASSORTMENT_METALS);

    public static final Block CUT_STEEL_SLAB = registerBlock("cut_steel_slab",
            new SlabBlock(FabricBlockSettings.of(Material.METAL).requiresTool()), AssortmentItemGroup.ASSORTMENT_METALS);

    public static final Block CUT_STEEL_STAIRS = registerBlock("cut_steel_stairs",
            new BaseStairs(AssortmentBlockInit.CUT_STEEL.getDefaultState(),
                    FabricBlockSettings.of(Material.METAL).requiresTool()), AssortmentItemGroup.ASSORTMENT_METALS);

    public static final Block STEEL_DOOR = registerBlock("steel_door",
            new BaseDoor(FabricBlockSettings.copyOf(Blocks.IRON_DOOR).requiresTool()), AssortmentItemGroup.ASSORTMENT_METALS);

    public static final Block STEEL_TRAPDOOR = registerBlock("steel_trapdoor",
            new BaseTrapdoor(FabricBlockSettings.copyOf(Blocks.IRON_TRAPDOOR).requiresTool()), AssortmentItemGroup.ASSORTMENT_METALS);

    public static final Block ROSE_GOLD_BLOCK = registerBlock("rose_gold_block",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).requiresTool()), AssortmentItemGroup.ASSORTMENT_METALS);

    public static final Block CUT_ROSE_GOLD = registerBlock("cut_rose_gold",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).requiresTool()), AssortmentItemGroup.ASSORTMENT_METALS);

    public static final Block CUT_ROSE_GOLD_SLAB = registerBlock("cut_rose_gold_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).requiresTool()), AssortmentItemGroup.ASSORTMENT_METALS);

    public static final Block CUT_ROSE_GOLD_STAIRS = registerBlock("cut_rose_gold_stairs",
            new BaseStairs(AssortmentBlockInit.CUT_ROSE_GOLD.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).requiresTool()), AssortmentItemGroup.ASSORTMENT_METALS);

    public static final Block ROSE_GOLD_DOOR = registerBlock("rose_gold_door",
            new BaseDoor(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque().requiresTool()), AssortmentItemGroup.ASSORTMENT_METALS);

    public static final Block ROSE_GOLD_TRAPDOOR = registerBlock("rose_gold_trapdoor",
            new BaseTrapdoor(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque().requiresTool()), AssortmentItemGroup.ASSORTMENT_METALS);

    public static final Block GOLD_DOOR = registerBlock("gold_door",
            new BaseDoor(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque().requiresTool()), AssortmentItemGroup.ASSORTMENT_METALS);

    public static final Block GOLD_TRAPDOOR = registerBlock("gold_trapdoor",
            new BaseTrapdoor(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque().requiresTool()), AssortmentItemGroup.ASSORTMENT_METALS);


    public static final Block KILN = registerBlock("kiln",
            new KilnBlock(FabricBlockSettings.copyOf(Blocks.FURNACE)), AssortmentItemGroup.ASSORTMENT_MISC);

    public static final Block MILL = registerBlock("mill",
            new MillBlock(FabricBlockSettings.copyOf(Blocks.FURNACE)), AssortmentItemGroup.ASSORTMENT_MISC);


    public static final Block AMETHYST_ROD = registerBlock("amethyst_rod",
            new BaseRodBlock(FabricBlockSettings.copyOf(Blocks.END_ROD)), AssortmentItemGroup.ASSORTMENT_MISC);

    public static final Block GLOWING_ROD = registerBlock("glowing_rod",
            new BaseRodBlock(FabricBlockSettings.copyOf(Blocks.END_ROD)), AssortmentItemGroup.ASSORTMENT_MISC);

    public static final Block BLAZING_ROD = registerBlock("blazing_rod",
            new BaseRodBlock(FabricBlockSettings.copyOf(Blocks.END_ROD)), AssortmentItemGroup.ASSORTMENT_MISC);


    //public static final Block REINFORCED_OAK_LOG = registerBlock("reinforced_oak_log",
    //        new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)), AssortmentItemGroup.ASSORTMENT_MISC);


    public static final Block REINFORCED_GLASS = registerBlock("reinforced_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS).strength(5.0f, 6.0f).sounds(BlockSoundGroup.GLASS).nonOpaque()), AssortmentItemGroup.ASSORTMENT_MISC);

    public static final Block REINFORCED_GLASS_PANE = registerBlock("reinforced_glass_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.GLASS).strength(5.0f, 6.0f).sounds(BlockSoundGroup.GLASS).nonOpaque()), AssortmentItemGroup.ASSORTMENT_MISC);


    public static final Block CRATE_MELEE = registerBlock("crate_melee",
            new Block(FabricBlockSettings.copyOf(Blocks.BARREL)), AssortmentItemGroup.ASSORTMENT_MISC);

    public static final Block CRATE_RANGED = registerBlock("crate_ranged",
            new Block(FabricBlockSettings.copyOf(Blocks.BARREL)), AssortmentItemGroup.ASSORTMENT_MISC);

    public static final Block CRATE_ARMOR = registerBlock("crate_armor",
            new Block(FabricBlockSettings.copyOf(Blocks.BARREL)), AssortmentItemGroup.ASSORTMENT_MISC);

    public static final Block CRATE_FISHING = registerBlock("crate_fishing",
            new Block(FabricBlockSettings.copyOf(Blocks.BARREL)), AssortmentItemGroup.ASSORTMENT_MISC);

    public static final Block THATCH_BLOCK = registerBlock("thatch_block",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)), AssortmentItemGroup.ASSORTMENT_COMPRESSIBLES);

    public static final Block CRATE_APPLE = registerBlock("crate_apple",
            new BaseFacingBlock(FabricBlockSettings.copyOf(Blocks.BARREL)), AssortmentItemGroup.ASSORTMENT_COMPRESSIBLES);

    public static final Block CRATE_GOLDEN_APPLE = registerBlock("crate_golden_apple",
            new BaseFacingBlock(FabricBlockSettings.copyOf(Blocks.BARREL)), AssortmentItemGroup.ASSORTMENT_COMPRESSIBLES);

    public static final Block CRATE_CARROT = registerBlock("crate_carrot",
            new BaseFacingBlock(FabricBlockSettings.copyOf(Blocks.BARREL)), AssortmentItemGroup.ASSORTMENT_COMPRESSIBLES);

    public static final Block CRATE_GOLDEN_CARROT = registerBlock("crate_golden_carrot",
            new BaseFacingBlock(FabricBlockSettings.copyOf(Blocks.BARREL)), AssortmentItemGroup.ASSORTMENT_COMPRESSIBLES);

    public static final Block CRATE_BEETROOT = registerBlock("crate_beetroot",
            new BaseFacingBlock(FabricBlockSettings.copyOf(Blocks.BARREL)), AssortmentItemGroup.ASSORTMENT_COMPRESSIBLES);

    public static final Block CRATE_SUGAR = registerBlock("crate_sugar",
            new BaseFacingBlock(FabricBlockSettings.copyOf(Blocks.BARREL)), AssortmentItemGroup.ASSORTMENT_COMPRESSIBLES);

    public static final Block CRATE_FLESH = registerBlock("crate_flesh",
            new BaseFacingBlock(FabricBlockSettings.copyOf(Blocks.BARREL)), AssortmentItemGroup.ASSORTMENT_COMPRESSIBLES);

    public static final Block CRATE_BONE = registerBlock("crate_bone",
            new BaseFacingBlock(FabricBlockSettings.copyOf(Blocks.BARREL)), AssortmentItemGroup.ASSORTMENT_COMPRESSIBLES);

    public static final Block CRATE_SPIDER_EYE = registerBlock("crate_spider_eye",
            new BaseFacingBlock(FabricBlockSettings.copyOf(Blocks.BARREL)), AssortmentItemGroup.ASSORTMENT_COMPRESSIBLES);

    public static final Block CRATE_SUGAR_CANE = registerBlock("crate_sugar_cane",
            new BaseFacingBlock(FabricBlockSettings.copyOf(Blocks.BARREL)), AssortmentItemGroup.ASSORTMENT_COMPRESSIBLES);


    public static final Block SACK_APPLE = registerBlock("sack_apple",
            new BaseFacingBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)), AssortmentItemGroup.ASSORTMENT_COMPRESSIBLES);

    public static final Block SACK_GOLDEN_APPLE = registerBlock("sack_golden_apple",
            new BaseFacingBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)), AssortmentItemGroup.ASSORTMENT_COMPRESSIBLES);

    public static final Block SACK_CARROT = registerBlock("sack_carrot",
            new BaseFacingBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)), AssortmentItemGroup.ASSORTMENT_COMPRESSIBLES);

    public static final Block SACK_GOLDEN_CARROT = registerBlock("sack_golden_carrot",
            new BaseFacingBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)), AssortmentItemGroup.ASSORTMENT_COMPRESSIBLES);

    public static final Block SACK_BEETROOT = registerBlock("sack_beetroot",
            new BaseFacingBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)), AssortmentItemGroup.ASSORTMENT_COMPRESSIBLES);

    public static final Block SACK_SUGAR = registerBlock("sack_sugar",
            new BaseFacingBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)), AssortmentItemGroup.ASSORTMENT_COMPRESSIBLES);

    public static final Block SACK_FLESH = registerBlock("sack_flesh",
            new BaseFacingBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)), AssortmentItemGroup.ASSORTMENT_COMPRESSIBLES);

    public static final Block SACK_BONE = registerBlock("sack_bone",
            new BaseFacingBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)), AssortmentItemGroup.ASSORTMENT_COMPRESSIBLES);

    public static final Block SACK_SPIDER_EYE = registerBlock("sack_spider_eye",
            new BaseFacingBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)), AssortmentItemGroup.ASSORTMENT_COMPRESSIBLES);

    public static final Block SACK_SUGAR_CANE = registerBlock("sack_sugar_cane",
            new BaseFacingBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)), AssortmentItemGroup.ASSORTMENT_COMPRESSIBLES);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(Assortment.MODID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(Assortment.MODID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void loadBlocks() {
        Assortment.LOGGER.info("Assortment Common: Registry - Blocks Registered");
    }
}
