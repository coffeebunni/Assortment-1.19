package net.mynastudios.assortment.item.custom;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

public class BaseAxeItem extends AxeItem {
    public BaseAxeItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
