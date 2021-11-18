package com.ufoteam.guidemod.init;

import com.ufoteam.guidemod.GlobalUtils;
import com.ufoteam.guidemod.custom.blocks.BlockbenchBlock;
import com.ufoteam.guidemod.custom.blocks.SimpleBlock;
import com.ufoteam.guidemod.custom.blocks.SpeedyBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class GuideModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GlobalUtils.MODID);

    /**
     * Blocks
     */
    public static final RegistryObject<Block> SKEPPY_FACE_BLOCK = BLOCKS.register(GuideModNames.skeppyFaceBlock, () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 0.6F)));
    public static final RegistryObject<Block> SPEEDY_BLOCK = BLOCKS.register(GuideModNames.speedyBlock, () -> new SpeedyBlock(BlockBehaviour.Properties.of(Material.METAL).strength(0.5f)));
    public static final RegistryObject<Block> TITANIUM_BLOCK = BLOCKS.register(GuideModNames.titaniumBlock, () -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(2f, 6f)));

    public static final RegistryObject<Block> BLOCKBENCH_BLOCK = BLOCKS.register("blockbench_block", () -> new SimpleBlock(BlockBehaviour.Properties.of(Material.STONE).strength(0.2F, 0.2F)));

    /**
     * Ores
     */
    public static final RegistryObject<Block> TITANIUM_ORE = BLOCKS.register(GuideModNames.titaniumOre, () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.2f, 6f)));

}
