package net.mynastudios.assortment.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.mynastudios.assortment.block.screen.KilnScreenHandler;
import net.mynastudios.assortment.registry.AssortmentBlockEntityInit;
import net.mynastudios.assortment.registry.AssortmentRecipeInit;

public class KilnBlockEntity extends AbstractFurnaceBlockEntity {
    public KilnBlockEntity(BlockPos pos, BlockState state) {
        super(AssortmentBlockEntityInit.KILN_BLOCK_ENTITY, pos, state, AssortmentRecipeInit.FIRING);
    }

    @Override
    protected int getFuelTime(ItemStack fuel) {
        return super.getFuelTime(fuel) / 2;
    }

    @Override
    protected Text getContainerName()  {
        return Text.translatable("container.assortment.kiln");
    }

    @Override
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new KilnScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
    }
}
