package com.ufoteam.guidemod.custom.blocks;

import com.ufoteam.guidemod.init.GuideModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockbenchBlock extends BlockEntity {

    public BlockbenchBlock(BlockPos pos, BlockState state) {
        super(GuideModBlocks.BLOCKBENCH_BLOCK.get(), pos, state);
    }


}
