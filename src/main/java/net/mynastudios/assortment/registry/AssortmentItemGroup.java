package net.mynastudios.assortment.registry;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.mynastudios.assortment.Assortment;

public class AssortmentItemGroup {
    public static final ItemGroup ASSORTMENT_METALS = FabricItemGroupBuilder.build(new Identifier(Assortment.MODID, "assortment_metals"),
            () -> new ItemStack(AssortmentItemInit.STEEL_INGOT));

    public static final ItemGroup ASSORTMENT_MISC = FabricItemGroupBuilder.build(new Identifier(Assortment.MODID, "assortment_misc"),
            () -> new ItemStack(AssortmentBlockInit.KILN));

}
