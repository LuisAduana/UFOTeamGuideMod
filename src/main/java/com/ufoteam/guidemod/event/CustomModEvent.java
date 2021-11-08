package com.ufoteam.guidemod.event;

import com.ufoteam.guidemod.GlobalVariables;
import com.ufoteam.guidemod.custom.entities.RainbowPigEntity;
import com.ufoteam.guidemod.init.GuideModEntities;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = GlobalVariables.MODID, bus = Bus.MOD)
public class CustomModEvent {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(GuideModEntities.RAINBOW_PIG_ENTITY.get(), RainbowPigEntity.createAttributes().build());
    }
}
