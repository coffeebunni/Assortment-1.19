package net.mynastudios.assortment.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.mynastudios.assortment.block.screen.MillScreenHandler;
import net.mynastudios.assortment.registry.AssortmentBlockEntityInit;
import net.mynastudios.assortment.registry.AssortmentRecipeInit;

public class MillBlockEntity extends AbstractFurnaceBlockEntity {
    public MillBlockEntity(BlockPos pos, BlockState state) {
        super(AssortmentBlockEntityInit.MILL_BLOCK_ENTITY, pos, state, AssortmentRecipeInit.MILLING);
    }

    @Override
    protected Text getContainerName()  {
        return Text.translatable("container.assortment.mill");
    }

    @Override
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new MillScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
    }
}
