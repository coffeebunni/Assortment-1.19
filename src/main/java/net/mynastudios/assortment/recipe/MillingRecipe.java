package net.mynastudios.assortment.recipe;

import net.minecraft.item.ItemStack;
import net.minecraft.recipe.AbstractCookingRecipe;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.util.Identifier;
import net.mynastudios.assortment.registry.AssortmentRecipeInit;

public class MillingRecipe extends AbstractCookingRecipe {
    public MillingRecipe(Identifier id, String group, Ingredient input, ItemStack output, float experience, int cookTime) {
        super(AssortmentRecipeInit.MILLING, id, group, input, output, experience, cookTime);
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return AssortmentRecipeInit.MILLING_RECIPE_SERIALIZER;
    }
}
