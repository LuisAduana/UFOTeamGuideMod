package com.ufoteam.guidemod.client.event;

import com.ufoteam.guidemod.GlobalUtils;
import com.ufoteam.guidemod.client.renderer.RainbowPigEntityRenderer;
import com.ufoteam.guidemod.client.renderer.model.RainbowPigEntityModel;
import com.ufoteam.guidemod.init.GuideModEntities;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = GlobalUtils.MODID, bus = Bus.MOD, value = Dist.CLIENT)
public final class ClientModEvents {

    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(RainbowPigEntityModel.LAYER_LOCATION, RainbowPigEntityModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(GuideModEntities.RAINBOW_PIG_ENTITY.get(), RainbowPigEntityRenderer::new);
    }

}
