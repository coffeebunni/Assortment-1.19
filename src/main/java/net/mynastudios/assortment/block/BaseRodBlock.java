package net.mynastudios.assortment.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.RodBlock;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class BaseRodBlock extends RodBlock {
    public BaseRodBlock(Settings settings) {
        super(settings);
        this.setDefaultState((BlockState)((BlockState)this.stateManager.getDefaultState()).with(FACING, Direction.UP));
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        Direction direction = ctx.getSide();
        BlockState blockState = ctx.getWorld().getBlockState(ctx.getBlockPos().offset(direction.getOpposite()));
        if (blockState.isOf(this) && blockState.get(FACING) == direction) {
            return (BlockState)this.getDefaultState().with(FACING, direction.getOpposite());
        }
        return (BlockState)this.getDefaultState().with(FACING, direction);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public PistonBehavior getPistonBehavior(BlockState state) {
        return PistonBehavior.NORMAL;
    }
}
