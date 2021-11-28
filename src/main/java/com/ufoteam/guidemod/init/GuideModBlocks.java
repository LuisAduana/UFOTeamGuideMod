package com.ufoteam.guidemod.init;

import com.ufoteam.guidemod.custom.blocks.ZucciniCrop;
import com.ufoteam.guidemod.utils.GlobalUtils;
import com.ufoteam.guidemod.custom.blocks.CraftingMineralsTable;
import com.ufoteam.guidemod.custom.blocks.OatsCrop;
import com.ufoteam.guidemod.custom.blocks.SpeedyBlock;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class GuideModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GlobalUtils.MODID);

    /**
     * Blocks
     */
    public static final RegistryObject<Block> SKEPPY_FACE_BLOCK = BLOCKS.register(GuideModNames.skeppyFaceBlock, () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 0.6F)));
    public static final RegistryObject<Block> SPEEDY_BLOCK = BLOCKS.register(GuideModNames.speedyBlock, () -> new SpeedyBlock(BlockBehaviour.Properties.of(Material.METAL).strength(0.5f)));

    /**
     * Custom clocks
     */
    public static final RegistryObject<Block> CRAFTING_MINERALS_TABLE = BLOCKS.register(GuideModNames.craftingMineralsTable, () -> new CraftingMineralsTable(BlockBehaviour.Properties.of(Material.METAL).strength(0.2f)));

    /**
     * Titanium
     */
    public static final RegistryObject<Block> TITANIUM_BLOCK = BLOCKS.register(GuideModNames.titaniumBlock, () -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(2f, 6f)));
    public static final RegistryObject<Block> TITANIUM_STAIRS = BLOCKS.register(GuideModNames.titaniumStairs, () -> new StairBlock(() -> TITANIUM_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(2.f, 6f)));
    public static final RegistryObject<Block> TITANIUM_FENCE = BLOCKS.register(GuideModNames.titaniumFence, () -> new FenceBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(2f, 6f)));
    public static final RegistryObject<Block> TITANIUM_FENCE_GATE = BLOCKS.register(GuideModNames.titaniumFenceGate, () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(2f, 6f)));
    public static final RegistryObject<Block> TITANIUM_WALL = BLOCKS.register(GuideModNames.titaniumWall, () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(2f, 6f)));
    public static final RegistryObject<Block> TITANIUM_SLAB = BLOCKS.register(GuideModNames.titaniumSlab, () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(2f, 6f)));
    public static final RegistryObject<Block> TITANIUM_DOOR = BLOCKS.register(GuideModNames.titaniumDoor, () -> new DoorBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(2f, 6f).noOcclusion()));
    public static final RegistryObject<Block> TITANIUM_BUTTON = BLOCKS.register(GuideModNames.titaniumButton, () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(2f, 6f)));
    public static final RegistryObject<Block> TITANIUM_PRESSURE_PLATE = BLOCKS.register(GuideModNames.titaniumPressurePlate, () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(2f, 6f)));
    public static final RegistryObject<Block> TITANIUM_TRAPDOOR = BLOCKS.register(GuideModNames.titaniumTrapdoor, () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(2f, 6f).noOcclusion()));

    /**
     * Crops
     */
    public static final RegistryObject<Block> OATS_CROP = BLOCKS.register(GuideModNames.oatsCrop, () -> new OatsCrop(BlockBehaviour.Properties.copy(Blocks.WHEAT)));
    public static final RegistryObject<Block> ZUCCINI_CROP = BLOCKS.register(GuideModNames.zucciniCrop, () -> new ZucciniCrop(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    /**
     * Ores
     */
    public static final RegistryObject<Block> TITANIUM_ORE = BLOCKS.register(GuideModNames.titaniumOre, () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.2f, 6f)));

    /**
     * Fluids
     */


}
