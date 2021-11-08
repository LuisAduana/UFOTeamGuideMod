package com.ufoteam.guidemod;

import com.ufoteam.guidemod.init.GuideModBlocks;
import com.ufoteam.guidemod.init.GuideModEntities;
import com.ufoteam.guidemod.init.GuideModItems;
import com.ufoteam.guidemod.init.GuideModSounds;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(GlobalVariables.MODID)
public class GuideMod {

    public GuideMod() {
        var bus = FMLJavaModLoadingContext.get().getModEventBus();

        GuideModSounds.SOUNDS.register(bus);
        GuideModBlocks.BLOCKS.register(bus);
        GuideModItems.ITEMS.register(bus);
        GuideModEntities.ENTITIES.register(bus);
    }

    public static final CreativeModeTab GUIDEMOD_TAB = new CreativeModeTab(GlobalVariables.MODID) {
        @Override
        public ItemStack makeIcon() {
            return GuideModItems.SKEPPY_FACE_ITEM.get().getDefaultInstance();
        }
    };

}
