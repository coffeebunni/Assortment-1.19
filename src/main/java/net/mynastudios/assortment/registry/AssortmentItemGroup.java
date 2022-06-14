package net.mynastudios.assortment.registry;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.mynastudios.assortment.Assortment;

public class AssortmentItemGroup {
    public static final ItemGroup ASSORTMENT = FabricItemGroupBuilder.build(new Identifier(Assortment.MODID, "assortment"),
            () -> new ItemStack(AssortmentItemInit.STEEL_INGOT));

}
