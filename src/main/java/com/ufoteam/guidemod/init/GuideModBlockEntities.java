package com.ufoteam.guidemod.init;

import com.ufoteam.guidemod.GlobalUtils;
import com.ufoteam.guidemod.custom.blocks.BlockbenchBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class GuideModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, GlobalUtils.MODID);

    public static final RegistryObject<BlockEntityType<BlockbenchBlock>> BLOCKBENCH_BLOCK_ENTITY = BLOCK_ENTITIES.register("blockbench_block", () -> BlockEntityType.Builder.of(BlockbenchBlock::new, GuideModBlocks.BLOCKBENCH_BLOCK.get()).build(null));

}
