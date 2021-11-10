package com.ufoteam.guidemod.init;

import com.ufoteam.guidemod.GlobalVariables;
import com.ufoteam.guidemod.GuideMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class GuideModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GlobalVariables.MODID);
    public static final RegistryObject<Item> RAINBOW_APPLE_ITEM = ITEMS.register("rainbow_apple_item", () -> new Item(new Item.Properties().tab(GlobalVariables.GUIDEMOD_TAB)));
    public static final RegistryObject<ForgeSpawnEggItem> RAINBOW_PIG_ENTITY_EGG = ITEMS.register("rainbow_pig_entity_egg", () -> new ForgeSpawnEggItem(GuideModEntities.RAINBOW_PIG_ENTITY, 0x1E51ED, 0x34BD27, new Item.Properties().tab(GlobalVariables.GUIDEMOD_TAB)));
}
