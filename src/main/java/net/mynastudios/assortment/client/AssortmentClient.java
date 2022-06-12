package net.mynastudios.assortment.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.mynastudios.assortment.Assortment;
import net.mynastudios.assortment.client.screen.KilnScreen;
import net.mynastudios.assortment.registry.AssortmentScreenHandlerInit;

@Environment(EnvType.CLIENT)
public class AssortmentClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ScreenRegistry.register(AssortmentScreenHandlerInit.KILN_SCREEN_HANDLER, KilnScreen::new);

        Assortment.LOGGER.info("Assortment Client: Registry - Screens Registered");
    }
}
