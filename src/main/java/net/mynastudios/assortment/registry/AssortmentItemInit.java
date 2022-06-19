package net.mynastudios.assortment.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.mynastudios.assortment.Assortment;
import net.mynastudios.assortment.item.AssortmentArmorMaterials;
import net.mynastudios.assortment.item.AssortmentToolMaterials;
import net.mynastudios.assortment.item.custom.BaseAxeItem;
import net.mynastudios.assortment.item.custom.BaseHoeItem;
import net.mynastudios.assortment.item.custom.BasePickaxeItem;

@SuppressWarnings("unused")
public class AssortmentItemInit {
    public static final Item COAL_DUST = registerItem("coal_dust",
            new Item(new FabricItemSettings().group(AssortmentItemGroup.ASSORTMENT_METALS)));

    public static final Item COPPER_DUST = registerItem("copper_dust",
            new Item(new FabricItemSettings().group(AssortmentItemGroup.ASSORTMENT_METALS)));

    public static final Item IRON_DUST = registerItem("iron_dust",
            new Item(new FabricItemSettings().group(AssortmentItemGroup.ASSORTMENT_METALS)));

    public static final Item GOLD_DUST = registerItem("gold_dust",
            new Item(new FabricItemSettings().group(AssortmentItemGroup.ASSORTMENT_METALS)));

    public static final Item STEEL_BLEND = registerItem("steel_blend",
            new Item(new FabricItemSettings().group(AssortmentItemGroup.ASSORTMENT_METALS)));

    public static final Item ROSE_GOLD_BLEND = registerItem("rose_gold_blend",
            new Item(new FabricItemSettings().group(AssortmentItemGroup.ASSORTMENT_METALS)));

    public static final Item STEEL_INGOT = registerItem("steel_ingot",
            new Item(new FabricItemSettings().group(AssortmentItemGroup.ASSORTMENT_METALS)));

    public static final Item ROSE_GOLD_INGOT = registerItem("rose_gold_ingot",
            new Item(new FabricItemSettings().group(AssortmentItemGroup.ASSORTMENT_METALS)));

    public static final Item STEEL_SWORD = registerItem("steel_sword",
            new SwordItem(AssortmentToolMaterials.STEEL, 1, 2f,
                    new FabricItemSettings().group(AssortmentItemGroup.ASSORTMENT_METALS)));
    public static final Item STEEL_AXE = registerItem("steel_axe",
            new BaseAxeItem(AssortmentToolMaterials.STEEL, 3, 0f,
                    new FabricItemSettings().group(AssortmentItemGroup.ASSORTMENT_METALS)));
    public static final Item STEEL_SHOVEL = registerItem("steel_shovel",
            new ShovelItem(AssortmentToolMaterials.STEEL, 0, 0f,
                    new FabricItemSettings().group(AssortmentItemGroup.ASSORTMENT_METALS)));
    public static final Item STEEL_PICKAXE = registerItem("steel_pickaxe",
            new BasePickaxeItem(AssortmentToolMaterials.STEEL, 0, 0f,
                    new FabricItemSettings().group(AssortmentItemGroup.ASSORTMENT_METALS)));
    public static final Item STEEL_HOE = registerItem("steel_hoe",
            new BaseHoeItem(AssortmentToolMaterials.STEEL, 0, 0f,
                    new FabricItemSettings().group(AssortmentItemGroup.ASSORTMENT_METALS)));

    public static final Item ROSE_GOLD_SWORD = registerItem("rose_gold_sword",
            new SwordItem(AssortmentToolMaterials.ROSE_GOLD, 0, 0f,
                    new FabricItemSettings().group(AssortmentItemGroup.ASSORTMENT_METALS)));
    public static final Item ROSE_GOLD_AXE = registerItem("rose_gold_axe",
            new BaseAxeItem(AssortmentToolMaterials.ROSE_GOLD, 0, 0f,
                    new FabricItemSettings().group(AssortmentItemGroup.ASSORTMENT_METALS)));
    public static final Item ROSE_GOLD_SHOVEL = registerItem("rose_gold_shovel",
            new ShovelItem(AssortmentToolMaterials.ROSE_GOLD, 0, 0f,
                    new FabricItemSettings().group(AssortmentItemGroup.ASSORTMENT_METALS)));
    public static final Item ROSE_GOLD_PICKAXE = registerItem("rose_gold_pickaxe",
            new BasePickaxeItem(AssortmentToolMaterials.ROSE_GOLD, 0, 0f,
                    new FabricItemSettings().group(AssortmentItemGroup.ASSORTMENT_METALS)));
    public static final Item ROSE_GOLD_HOE = registerItem("rose_gold_hoe",
            new BaseHoeItem(AssortmentToolMaterials.ROSE_GOLD, 0, 0f,
                    new FabricItemSettings().group(AssortmentItemGroup.ASSORTMENT_METALS)));

    public static final Item STEEL_HELMET = registerItem("steel_helmet",
            new ArmorItem(AssortmentArmorMaterials.STEEL, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(AssortmentItemGroup.ASSORTMENT_METALS)));
    public static final Item STEEL_CHESTPLATE = registerItem("steel_chestplate",
            new ArmorItem(AssortmentArmorMaterials.STEEL, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(AssortmentItemGroup.ASSORTMENT_METALS)));
    public static final Item STEEL_LEGGINGS = registerItem("steel_leggings",
            new ArmorItem(AssortmentArmorMaterials.STEEL, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(AssortmentItemGroup.ASSORTMENT_METALS)));
    public static final Item STEEL_BOOTS = registerItem("steel_boots",
            new ArmorItem(AssortmentArmorMaterials.STEEL, EquipmentSlot.FEET,
                    new FabricItemSettings().group(AssortmentItemGroup.ASSORTMENT_METALS)));

    public static final Item ROSE_GOLD_HELMET = registerItem("rose_gold_helmet",
            new ArmorItem(AssortmentArmorMaterials.ROSE_GOLD, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(AssortmentItemGroup.ASSORTMENT_METALS)));
    public static final Item ROSE_GOLD_CHESTPLATE = registerItem("rose_gold_chestplate",
            new ArmorItem(AssortmentArmorMaterials.ROSE_GOLD, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(AssortmentItemGroup.ASSORTMENT_METALS)));
    public static final Item ROSE_GOLD_LEGGINGS = registerItem("rose_gold_leggings",
            new ArmorItem(AssortmentArmorMaterials.ROSE_GOLD, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(AssortmentItemGroup.ASSORTMENT_METALS)));
    public static final Item ROSE_GOLD_BOOTS = registerItem("rose_gold_boots",
            new ArmorItem(AssortmentArmorMaterials.ROSE_GOLD, EquipmentSlot.FEET,
                    new FabricItemSettings().group(AssortmentItemGroup.ASSORTMENT_METALS)));

    public static final Item STEEL_HORSE_ARMOR = registerItem("steel_horse_armor",
            new HorseArmorItem(9, "steel", new Item.Settings().maxCount(1).group(AssortmentItemGroup.ASSORTMENT_MISC)));
    public static final Item ROSE_GOLD_HORSE_ARMOR = registerItem("rose_gold_horse_armor",
            new HorseArmorItem(8, "rose_gold", new Item.Settings().maxCount(1).group(AssortmentItemGroup.ASSORTMENT_MISC)));
    public static final Item NETHERITE_HORSE_ARMOR = registerItem("netherite_horse_armor",
            new HorseArmorItem(13, "netherite", new Item.Settings().maxCount(1).group(AssortmentItemGroup.ASSORTMENT_MISC)));

    public static final Item WHEAT_FLOUR = registerItem("wheat_flour",
            new Item(new FabricItemSettings().group(AssortmentItemGroup.ASSORTMENT_MISC)));

    public static final Item UNFIRED_POT = registerItem("unfired_pot",
            new Item(new FabricItemSettings().group(AssortmentItemGroup.ASSORTMENT_MISC)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Assortment.MODID, name), item);
    }

    public static void registerItems() {
        Assortment.LOGGER.info("Assortment Common: Registry - Items Registered");
    }
}
