package com.ufoteam.guidemod;

import com.ufoteam.guidemod.init.GuideModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class GlobalVariables {
    public static final String MODID = "guidemod";
    public static final CreativeModeTab GUIDEMOD_TAB = new CreativeModeTab(GlobalVariables.MODID) {
        @Override
        public ItemStack makeIcon() {
            return GuideModItems.RAINBOW_APPLE_ITEM.get().getDefaultInstance();
        }
    };
}
