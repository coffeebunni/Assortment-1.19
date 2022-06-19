package net.mynastudios.assortment.registry;

import net.minecraft.stat.StatFormatter;
import net.minecraft.stat.Stats;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class AssortmentStatInit {
    public static final Identifier INTERACT_WITH_KILN = new Identifier("assortment", "interact_with_kiln");
    public static final Identifier INTERACT_WITH_MILL = new Identifier("assortment", "interact_with_mill");

    public static final Identifier EAT_FEAST_SLICE = new Identifier("assortment", "eat_feast_slice");

    public static void registerStats() {
        Registry.register(Registry.CUSTOM_STAT, "interact_with_kiln", INTERACT_WITH_KILN);
        Stats.CUSTOM.getOrCreateStat(INTERACT_WITH_KILN, StatFormatter.DEFAULT);

        Registry.register(Registry.CUSTOM_STAT, "interact_with_mill", INTERACT_WITH_MILL);
        Stats.CUSTOM.getOrCreateStat(INTERACT_WITH_MILL, StatFormatter.DEFAULT);

        Registry.register(Registry.CUSTOM_STAT, "eat_feast_slice", EAT_FEAST_SLICE);
        Stats.CUSTOM.getOrCreateStat(EAT_FEAST_SLICE, StatFormatter.DEFAULT);
    }
}
