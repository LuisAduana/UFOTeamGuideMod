package com.ufoteam.guidemod.client.event;

import com.ufoteam.guidemod.utils.GlobalUtils;
import com.ufoteam.guidemod.client.renderer.RainbowPigEntityRenderer;
import com.ufoteam.guidemod.client.renderer.model.RainbowPigEntityModel;
import com.ufoteam.guidemod.init.GuideModBlocks;
import com.ufoteam.guidemod.init.GuideModEntities;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

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

    @SubscribeEvent
    public static void registerBlocks(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            ItemBlockRenderTypes.setRenderLayer(GuideModBlocks.OATS_CROP.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(GuideModBlocks.CRAFTING_MINERALS_TABLE.get(), RenderType.cutout());

            ItemBlockRenderTypes.setRenderLayer(GuideModBlocks.TITANIUM_DOOR.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(GuideModBlocks.TITANIUM_TRAPDOOR.get(), RenderType.cutout());
        });
    }

}
