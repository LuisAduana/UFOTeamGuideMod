package com.ufoteam.guidemod;

import com.ufoteam.guidemod.init.*;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(GlobalUtils.MODID)
public class GuideMod {

    public GuideMod() {
        var bus = FMLJavaModLoadingContext.get().getModEventBus();

        GuideModSounds.SOUNDS.register(bus);
        GuideModBlocks.BLOCKS.register(bus);
        GuideModBlockEntities.BLOCK_ENTITIES.register(bus);
        GuideModItems.ITEMS.register(bus);
        GuideModEntities.ENTITIES.register(bus);
    }

}
