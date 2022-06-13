package net.mynastudios.assortment.registry;

import net.fabricmc.api.ModInitializer;
import net.minecraft.recipe.CookingRecipeSerializer;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.mynastudios.assortment.Assortment;
import net.mynastudios.assortment.recipe.FiringRecipe;
import net.mynastudios.assortment.recipe.MillingRecipe;

public class AssortmentRecipeInit {

    public static final RecipeType<FiringRecipe> FIRING = RecipeType.register("assortment:firing");
    public static final RecipeSerializer<FiringRecipe> FIRING_RECIPE_SERIALIZER = Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(Assortment.MODID, "firing"), new CookingRecipeSerializer<>(FiringRecipe::new, 100));

    public static final RecipeType<MillingRecipe> MILLING = RecipeType.register("assortment:milling");
    public static final RecipeSerializer<MillingRecipe> MILLING_RECIPE_SERIALIZER = Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(Assortment.MODID, "milling"), new CookingRecipeSerializer<>(MillingRecipe::new, 100));

    public static void loadRecipes() {
        Assortment.LOGGER.info("Assortment Common: Registry - Recipes Registered");
    }

}
