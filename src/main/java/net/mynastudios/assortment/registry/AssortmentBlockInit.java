package net.mynastudios.assortment.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.mynastudios.assortment.Assortment;
import net.mynastudios.assortment.block.KilnBlock;
import net.mynastudios.assortment.block.MillBlock;


public class AssortmentBlockInit {

    public static final Block COAL_SAND = registerBlock("coal_sand",
            new FallingBlock(FabricBlockSettings.of(Material.SOIL)), ItemGroup.MISC);

    public static final Block IRON_SAND = registerBlock("iron_sand",
            new FallingBlock(FabricBlockSettings.of(Material.SOIL)), ItemGroup.MISC);

    public static final Block STEEL_BLOCK = registerBlock("steel_block",
            new Block(FabricBlockSettings.of(Material.METAL)), ItemGroup.MISC);

    public static final Block KILN = registerBlock("kiln",
            new KilnBlock(FabricBlockSettings.copyOf(Blocks.FURNACE)), ItemGroup.MISC);

    public static final Block MILL = registerBlock("mill",
            new MillBlock(FabricBlockSettings.copyOf(Blocks.FURNACE)), ItemGroup.MISC);

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
