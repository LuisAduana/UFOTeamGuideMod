package com.ufoteam.guidemod.init;

import com.ufoteam.guidemod.GlobalUtils;
import com.ufoteam.guidemod.custom.items.SmartBlowtorchItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class GuideModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GlobalUtils.MODID);

    /**
     * Normal Items
     */
    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register(GuideModNames.titaniumIngot, () -> new Item(new Item.Properties().tab(GlobalUtils.GUIDEMOD_TAB)));
    public static final RegistryObject<Item> TITANIUM_NUGGET = ITEMS.register(GuideModNames.titaniumNugget, () -> new Item(new Item.Properties().tab(GlobalUtils.GUIDEMOD_TAB)));
    public static final RegistryObject<Item> RAW_TITANIUM = ITEMS.register(GuideModNames.rawTitanium, () -> new Item(new Item.Properties().tab(GlobalUtils.GUIDEMOD_TAB)));

    /**
     * CustomItems
     */
    public static final RegistryObject<Item> SMART_BLOW_TORCH = ITEMS.register(GuideModNames.smartBlowTorch, () -> new SmartBlowtorchItem(new Item.Properties().tab(GlobalUtils.GUIDEMOD_TAB)));

    /**
     * CropsItems
     */
    public static final RegistryObject<Item> OATS = ITEMS.register(GuideModNames.oats, () -> new BlockItem(GuideModBlocks.OATS_CROP.get(), new Item.Properties().tab(GlobalUtils.GUIDEMOD_TAB)
            .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).build())));

    /**
     * Food items
     */
    public static final RegistryObject<Item> RAINBOW_APPLE = ITEMS.register(GuideModNames.rainbowApple, () -> new Item(new Item.Properties().tab(GlobalUtils.GUIDEMOD_TAB)
            .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).build())));
    public static final RegistryObject<Item> TOMATO = ITEMS.register(GuideModNames.tomato, () -> new Item(new Item.Properties().tab(GlobalUtils.GUIDEMOD_TAB)
            .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).build())));

    /**
     * Block Items
     */
    public static final RegistryObject<Item> SKEEPY_FACE_BLOCK_ITEM = ITEMS.register(GuideModNames.skeppyFaceBlock, () -> new BlockItem(GuideModBlocks.SKEPPY_FACE_BLOCK.get(), new Item.Properties().tab(GlobalUtils.GUIDEMOD_TAB)));
    public static final RegistryObject<Item> SPEEDY_BLOCK_ITEM = ITEMS.register(GuideModNames.speedyBlock, () -> new BlockItem(GuideModBlocks.SPEEDY_BLOCK.get(), new Item.Properties().tab(GlobalUtils.GUIDEMOD_TAB)));
    public static final RegistryObject<Item> TITANIUM_BLOCK_ITEM = ITEMS.register(GuideModNames.titaniumBlock, () -> new BlockItem(GuideModBlocks.TITANIUM_BLOCK.get(), new Item.Properties().tab(GlobalUtils.GUIDEMOD_TAB)));
    public static final RegistryObject<Item> TITANIUM_ORE_BLOCK = ITEMS.register(GuideModNames.titaniumOre, () -> new BlockItem(GuideModBlocks.TITANIUM_ORE.get(), new Item.Properties().tab(GlobalUtils.GUIDEMOD_TAB)));
    public static final RegistryObject<Item> TITANIUM_STARIS_ITEM = ITEMS.register(GuideModNames.titaniumStairs, () -> new BlockItem(GuideModBlocks.TITANIUM_STAIRS.get(), new Item.Properties().tab(GlobalUtils.GUIDEMOD_TAB)));
    public static final RegistryObject<Item> TITANIUM_FENCE_ITEM = ITEMS.register(GuideModNames.titaniumFence, () -> new BlockItem(GuideModBlocks.TITANIUM_FENCE.get(), new Item.Properties().tab(GlobalUtils.GUIDEMOD_TAB)));
    public static final RegistryObject<Item> TITANIUM_FENCE_GATE_ITEM = ITEMS.register(GuideModNames.titaniumFenceGate, () -> new BlockItem(GuideModBlocks.TITANIUM_FENCE_GATE.get(), new Item.Properties().tab(GlobalUtils.GUIDEMOD_TAB)));
    public static final RegistryObject<Item> TITANIUM_WALL_ITEM = ITEMS.register(GuideModNames.titaniumWall, () -> new BlockItem(GuideModBlocks.TITANIUM_WALL.get(), new Item.Properties().tab(GlobalUtils.GUIDEMOD_TAB)));
    public static final RegistryObject<Item> TITANIUM_SLAB_ITEM = ITEMS.register(GuideModNames.titaniumSlab, () -> new BlockItem(GuideModBlocks.TITANIUM_SLAB.get(), new Item.Properties().tab(GlobalUtils.GUIDEMOD_TAB)));

    public static final RegistryObject<Item> CRAFTING_MINERALS_TABLE_ITEM = ITEMS.register(GuideModNames.craftingMineralsTable, () -> new BlockItem(GuideModBlocks.CRAFTING_MINERALS_TABLE.get(), new Item.Properties().tab(GlobalUtils.GUIDEMOD_TAB)));

    /**
     * Entity Eggs items
     */
    public static final RegistryObject<Item> RAINBOW_PIG_ENTITY = ITEMS.register(GuideModNames.rainbowPigEntityEgg, () -> new ForgeSpawnEggItem(GuideModEntities.RAINBOW_PIG_ENTITY, 0x1E51ED, 0x34BD27, new Item.Properties().tab(GlobalUtils.GUIDEMOD_TAB)));
}
