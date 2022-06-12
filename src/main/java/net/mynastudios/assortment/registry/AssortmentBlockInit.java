package net.mynastudios.assortment.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.mynastudios.assortment.Assortment;
import net.mynastudios.assortment.block.KilnBlock;

public class AssortmentBlockInit {

    public static final Block KILN = Registry.register(Registry.BLOCK, new Identifier(Assortment.MODID, "kiln"),
            new KilnBlock(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static void loadBlocks() {
        Assortment.LOGGER.info("Assortment Common: Registry - Blocks Registered");
    }
}
