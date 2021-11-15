package com.ufoteam.guidemod;

import com.ufoteam.guidemod.init.GuideModBlocks;
import com.ufoteam.guidemod.init.GuideModEntities;
import com.ufoteam.guidemod.init.GuideModItems;
import com.ufoteam.guidemod.init.GuideModSounds;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(GlobalUtils.MODID)
public class GuideMod {

    public GuideMod() {
        var bus = FMLJavaModLoadingContext.get().getModEventBus();

        GuideModSounds.SOUNDS.register(bus);
        GuideModBlocks.BLOCKS.register(bus);
        GuideModItems.ITEMS.register(bus);
        GuideModEntities.ENTITIES.register(bus);
    }

}
