package com.ufoteam.guidemod.event;

import com.ufoteam.guidemod.GlobalUtils;
import com.ufoteam.guidemod.custom.entities.RainbowPigEntity;
import com.ufoteam.guidemod.init.GuideModEntities;
import com.ufoteam.guidemod.world.OreGeneration;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = GlobalUtils.MODID, bus = Bus.MOD)
public class CustomModEvent {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(GuideModEntities.RAINBOW_PIG_ENTITY.get(), RainbowPigEntity.createAttributes().build());
    }

    @SubscribeEvent
    public static void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(OreGeneration::registerOres);
    }

}
