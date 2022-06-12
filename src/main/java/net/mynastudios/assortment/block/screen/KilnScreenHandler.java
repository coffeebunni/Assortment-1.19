package net.mynastudios.assortment.block.screen;

import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.recipe.book.RecipeBookCategory;
import net.minecraft.screen.AbstractFurnaceScreenHandler;
import net.minecraft.screen.PropertyDelegate;
import net.mynastudios.assortment.registry.AssortmentRecipeInit;
import net.mynastudios.assortment.registry.AssortmentScreenHandlerInit;

public class KilnScreenHandler extends AbstractFurnaceScreenHandler {
    public KilnScreenHandler(int i, PlayerInventory playerInventory) {
        super(AssortmentScreenHandlerInit.KILN_SCREEN_HANDLER, AssortmentRecipeInit.FIRING, RecipeBookCategory.FURNACE, i, playerInventory);
    }

    public KilnScreenHandler(int i, PlayerInventory playerInventory, Inventory inventory, PropertyDelegate propertyDelegate) {
        super(AssortmentScreenHandlerInit.KILN_SCREEN_HANDLER, AssortmentRecipeInit.FIRING, RecipeBookCategory.FURNACE, i, playerInventory, inventory, propertyDelegate);
    }
}

