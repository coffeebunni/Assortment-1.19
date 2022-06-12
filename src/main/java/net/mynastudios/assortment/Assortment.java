package net.mynastudios.assortment;

import net.fabricmc.api.ModInitializer;
import net.mynastudios.assortment.registry.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assortment implements ModInitializer {
	public static final String MODID = "assortment";
	public static final String MODNAME = "Assortment";

	public static final Logger LOGGER = LoggerFactory.getLogger(Assortment.MODNAME);

	@Override
	public void onInitialize() {
		LOGGER.info("Assortment is installed correctly, loading now! Thanks for installing! <3");

		AssortmentBlockEntityInit.loadBlockEntities();
		AssortmentBlockInit.loadBlocks();
		AssortmentItemInit.registerItems();
		AssortmentRecipeInit.loadRecipes();
		AssortmentScreenHandlerInit.loadScreens();

		LOGGER.info("Assortment Common: Registry - Mod Fully Loaded!");
	}
}
