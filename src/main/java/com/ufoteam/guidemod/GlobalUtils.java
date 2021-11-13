package com.ufoteam.guidemod;

import com.ufoteam.guidemod.init.GuideModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
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

}
