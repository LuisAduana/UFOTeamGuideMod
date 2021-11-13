package com.ufoteam.guidemod.init;

import com.ufoteam.guidemod.GlobalVariables;
import com.ufoteam.guidemod.custom.items.SmartBlowtorchItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class GuideModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GlobalVariables.MODID);

    /** Normal Items */
    public static final RegistryObject<Item> RAINBOW_APPLE_ITEM = ITEMS.register("rainbow_apple_item", () -> new Item(new Item.Properties().tab(GlobalVariables.GUIDEMOD_TAB)));
    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot", () -> new Item(new Item.Properties().tab(GlobalVariables.GUIDEMOD_TAB)));
    public static final RegistryObject<Item> TITANIUM_NUGGET = ITEMS.register("titanium_nugget", () -> new Item(new Item.Properties().tab(GlobalVariables.GUIDEMOD_TAB)));
    public static final RegistryObject<Item> RAW_TITANIUM = ITEMS.register("raw_titanium", () -> new Item(new Item.Properties().tab(GlobalVariables.GUIDEMOD_TAB)));

    /** CustomItems */
    public static final RegistryObject<Item> SMART_BLOW_TORCH = ITEMS.register("smart_blow_torch", () -> new SmartBlowtorchItem(new Item.Properties().tab(GlobalVariables.GUIDEMOD_TAB)));

    /** Food items */
    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato", () -> new Item(new Item.Properties().tab(GlobalVariables.GUIDEMOD_TAB)
            .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).build())));

    /** Entity Eggs items */
    public static final RegistryObject<Item> RAINBOW_PIG_ENTITY_EGG = ITEMS.register("rainbow_pig_entity_egg", () -> new ForgeSpawnEggItem(GuideModEntities.RAINBOW_PIG_ENTITY, 0x1E51ED, 0x34BD27, new Item.Properties().tab(GlobalVariables.GUIDEMOD_TAB)));
}
