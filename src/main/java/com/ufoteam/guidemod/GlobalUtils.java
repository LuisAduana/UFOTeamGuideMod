package com.ufoteam.guidemod;

import com.ufoteam.guidemod.init.GuideModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GlobalUtils {
    public static final String MODID = "guidemod";
    public static final Logger LOGGER = LogManager.getLogger();
    public static final CreativeModeTab GUIDEMOD_TAB = new CreativeModeTab(GlobalUtils.MODID) {
        @Override
        public ItemStack makeIcon() {
            return GuideModItems.RAINBOW_APPLE.get().getDefaultInstance();
        }
    };

    public static ResourceLocation resourceLocation(String param) {
        return new ResourceLocation(MODID, param);
    }

    /*public static Tags.IOptionalNamedTag<Block> createBlockTag(String name) {
        return BlockTags.createOptional(new ResourceLocation(MODID, name));
    }

    public static Tags.IOptionalNamedTag<Block> createBlockForgeTag(String name) {
        return BlockTags.createOptional(new ResourceLocation("forge", name));
    }

    public static Tags.IOptionalNamedTag<Item> createItemTag(String name) {
        return ItemTags.createOptional(new ResourceLocation(MODID, name));
    }

    public static Tags.IOptionalNamedTag<Item> createItemForgeTag(String name) {
        return ItemTags.createOptional(new ResourceLocation("forge", name));
    }*/

}
