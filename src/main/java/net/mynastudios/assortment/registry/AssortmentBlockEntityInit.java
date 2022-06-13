package net.mynastudios.assortment.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.mynastudios.assortment.Assortment;
import net.mynastudios.assortment.block.entity.KilnBlockEntity;
import net.mynastudios.assortment.block.entity.MillBlockEntity;

public class AssortmentBlockEntityInit {
    public static final BlockEntityType<KilnBlockEntity> KILN_BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
            new Identifier(Assortment.MODID, "kiln"), FabricBlockEntityTypeBuilder.create(KilnBlockEntity::new, AssortmentBlockInit.KILN)
                    .build(null));

    public static final BlockEntityType<MillBlockEntity> MILL_BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
            new Identifier(Assortment.MODID, "mill"), FabricBlockEntityTypeBuilder.create(MillBlockEntity::new, AssortmentBlockInit.MILL)
                    .build(null));

    public static void loadBlockEntities() {
        Assortment.LOGGER.info("Assortment Common: Registry - Block Entities Registered");
    }
}
