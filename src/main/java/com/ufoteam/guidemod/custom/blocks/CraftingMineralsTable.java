package com.ufoteam.guidemod.custom.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;


import javax.annotation.Nullable;
import java.util.stream.Stream;

public class CraftingMineralsTable extends HorizontalDirectionalBlock {

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.box(6, 10, 5, 10, 11, 10),
            Block.box(10, 10, 5, 11, 13, 10),
            Block.box(5, 10, 5, 6, 13, 10),
            Block.box(5, 10, 10, 11, 14, 11),
            Block.box(5, 10, 5, 11, 12, 5),
            Block.box(7, 2, 7, 9, 10, 9),
            Block.box(5, 1, 5, 11, 2, 11),
            Block.box(4, 0, 4, 12, 1, 12)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    private static final VoxelShape SHAPE_W = Stream.of(
            Block.box(5, 10, 6, 10, 11, 10),
            Block.box(5, 10, 5, 10, 13, 6),
            Block.box(5, 10, 10, 10, 13, 11),
            Block.box(10, 10, 5, 11, 14, 11),
            Block.box(5, 10, 5, 5, 12, 11),
            Block.box(7, 2, 7, 9, 10, 9),
            Block.box(5, 1, 5, 11, 2, 11),
            Block.box(4, 0, 4, 12, 1, 12)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    private static final VoxelShape SHAPE_S = Stream.of(
            Block.box(6, 10, 6, 10, 11, 11),
            Block.box(5, 10, 6, 5, 13, 11),
            Block.box(10, 10, 6, 11, 13, 11),
            Block.box(5, 10, 5, 11, 14, 6),
            Block.box(5, 10, 11, 11, 12, 11),
            Block.box(7, 2, 7, 9, 10, 9),
            Block.box(5, 1, 5, 11, 2, 11),
            Block.box(4, 0, 4, 12, 1, 12)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    private static final VoxelShape SHAPE_E = Stream.of(
            Block.box(6, 10, 6, 11, 11, 11),
            Block.box(6, 10, 10, 11, 13, 11),
            Block.box(6, 10, 5, 11, 13, 6),
            Block.box(5, 10, 5, 6, 14, 11),
            Block.box(11, 10, 5, 11, 12, 11),
            Block.box(7, 2, 7, 9, 10, 9),
            Block.box(5, 1, 5, 11, 2, 11),
            Block.box(4, 0, 4, 12, 1, 12)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter p_60556_, BlockPos p_60557_, CollisionContext p_60558_) {
        switch (state.getValue(FACING)) {
            case SOUTH -> { return SHAPE_S; }
            case EAST -> { return SHAPE_E; }
            case WEST -> { return SHAPE_W; }
            default -> { return SHAPE_N; }
        }
    }

    public CraftingMineralsTable(Properties properties) {
        super(properties);
    }



    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }
}
