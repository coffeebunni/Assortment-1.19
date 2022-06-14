package net.mynastudios.assortment.recipe;

import net.minecraft.item.ItemStack;
import net.minecraft.recipe.AbstractCookingRecipe;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.util.Identifier;
import net.mynastudios.assortment.registry.AssortmentBlockInit;
import net.mynastudios.assortment.registry.AssortmentRecipeInit;

public class FiringRecipe extends AbstractCookingRecipe {
    public FiringRecipe(Identifier id, String group, Ingredient input, ItemStack output, float experience, int cookTime) {
        super(AssortmentRecipeInit.FIRING, id, group, input, output, experience, cookTime);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(AssortmentBlockInit.KILN);
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return AssortmentRecipeInit.FIRING_RECIPE_SERIALIZER;
    }
}
