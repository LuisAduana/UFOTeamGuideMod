package com.ufoteam.guidemod;

import com.ufoteam.guidemod.init.GuideModBlocks;
import com.ufoteam.guidemod.init.GuideModEntities;
import com.ufoteam.guidemod.init.GuideModItems;
import com.ufoteam.guidemod.init.GuideModSounds;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(GlobalVariables.MODID)
public class GuideMod {

    private static final Logger LOGGER = LogManager.getLogger();

    public GuideMod() {
        var bus = FMLJavaModLoadingContext.get().getModEventBus();

        GuideModSounds.SOUNDS.register(bus);
        GuideModBlocks.BLOCKS.register(bus);
        GuideModItems.ITEMS.register(bus);
        GuideModEntities.ENTITIES.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }

}
