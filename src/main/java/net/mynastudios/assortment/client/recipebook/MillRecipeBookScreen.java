package net.mynastudios.assortment.client.recipebook;

import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.client.gui.screen.recipebook.AbstractFurnaceRecipeBookScreen;
import net.minecraft.item.Item;
import net.minecraft.text.Text;

import java.util.Set;

public class MillRecipeBookScreen extends AbstractFurnaceRecipeBookScreen {
    private static final Text TOGGLE_MILLABLE_RECIPES_TEXT = Text.translatable("gui.recipebook.toggleRecipes.millable");

    @Override
    protected Text getToggleCraftableButtonText() {
        return TOGGLE_MILLABLE_RECIPES_TEXT;
    }

    @Override
    protected Set<Item> getAllowedFuels() {
        return AbstractFurnaceBlockEntity.createFuelTimeMap().keySet();
    }
}
