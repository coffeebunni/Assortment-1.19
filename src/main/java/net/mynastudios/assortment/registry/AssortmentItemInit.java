package net.mynastudios.assortment.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.mynastudios.assortment.Assortment;


public class AssortmentItemInit {
    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Assortment.MODID, "kiln"),
                new BlockItem(AssortmentBlockInit.KILN, new FabricItemSettings().group(ItemGroup.DECORATIONS)));

        Registry.register(Registry.ITEM, new Identifier(Assortment.MODID, "steel_ingot"),
                new Item(new FabricItemSettings().group(ItemGroup.MISC)));


        Assortment.LOGGER.info("Assortment Common: Registry - Items Registered");
    }
}
