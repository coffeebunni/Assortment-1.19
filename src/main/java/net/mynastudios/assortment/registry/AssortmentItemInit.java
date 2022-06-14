package net.mynastudios.assortment.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.mynastudios.assortment.Assortment;
import net.mynastudios.assortment.item.AssortmentToolMaterials;
import net.mynastudios.assortment.item.custom.BaseAxeItem;
import net.mynastudios.assortment.item.custom.BaseHoeItem;
import net.mynastudios.assortment.item.custom.BasePickaxeItem;

public class AssortmentItemInit {
    public static final Item COAL_DUST = registerItem("coal_dust",
            new Item(new FabricItemSettings().group(AssortmentItemGroup.ASSORTMENT)));

    public static final Item IRON_DUST = registerItem("iron_dust",
            new Item(new FabricItemSettings().group(AssortmentItemGroup.ASSORTMENT)));

    public static final Item STEEL_BLEND = registerItem("steel_blend",
            new Item(new FabricItemSettings().group(AssortmentItemGroup.ASSORTMENT)));

    public static final Item STEEL_INGOT = registerItem("steel_ingot",
            new Item(new FabricItemSettings().group(AssortmentItemGroup.ASSORTMENT)));

    public static final Item STEEL_SWORD = registerItem("steel_sword",
            new SwordItem(AssortmentToolMaterials.STEEL, 1, 2f,
                    new FabricItemSettings().group(AssortmentItemGroup.ASSORTMENT)));

    public static final Item STEEL_AXE = registerItem("steel_axe",
            new BaseAxeItem(AssortmentToolMaterials.STEEL, 3, 0f,
                    new FabricItemSettings().group(AssortmentItemGroup.ASSORTMENT)));

    public static final Item STEEL_SHOVEL = registerItem("steel_shovel",
            new ShovelItem(AssortmentToolMaterials.STEEL, 0, 0f,
                    new FabricItemSettings().group(AssortmentItemGroup.ASSORTMENT)));

    public static final Item STEEL_PICKAXE = registerItem("steel_pickaxe",
            new BasePickaxeItem(AssortmentToolMaterials.STEEL, 0, 0f,
                    new FabricItemSettings().group(AssortmentItemGroup.ASSORTMENT)));

    public static final Item STEEL_HOE = registerItem("steel_hoe",
            new BaseHoeItem(AssortmentToolMaterials.STEEL, 0, 0f,
                    new FabricItemSettings().group(AssortmentItemGroup.ASSORTMENT)));

    public static final Item UNFIRED_POT = registerItem("unfired_pot",
            new Item(new FabricItemSettings().group(AssortmentItemGroup.ASSORTMENT)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Assortment.MODID, name), item);
    }

    public static void registerItems() {
        Assortment.LOGGER.info("Assortment Common: Registry - Items Registered");
    }
}
