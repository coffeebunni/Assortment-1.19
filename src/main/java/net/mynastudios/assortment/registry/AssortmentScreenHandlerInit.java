package net.mynastudios.assortment.registry;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.mynastudios.assortment.Assortment;
import net.mynastudios.assortment.block.screen.KilnScreenHandler;

public class AssortmentScreenHandlerInit {
    public static final ScreenHandlerType<KilnScreenHandler> KILN_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(new Identifier(Assortment.MODID, "kiln"), KilnScreenHandler::new);


    public static void loadScreens() {
            Assortment.LOGGER.info("Assortment Common: Registry - Screen Handlers Registered");
    }
}
