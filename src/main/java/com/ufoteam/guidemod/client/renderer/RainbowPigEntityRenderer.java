package com.ufoteam.guidemod.client.renderer;

import com.ufoteam.guidemod.client.renderer.model.RainbowPigEntityModel;
import com.ufoteam.guidemod.GlobalUtils;
import com.ufoteam.guidemod.custom.entities.RainbowPigEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class RainbowPigEntityRenderer<Type extends RainbowPigEntity> extends MobRenderer<Type, RainbowPigEntityModel<Type>> {

    public RainbowPigEntityRenderer(Context context) {
        super(context, new RainbowPigEntityModel<>(context.bakeLayer(RainbowPigEntityModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(Type entity) {
        return GlobalUtils.resourceLocation("textures/entities/rainbow_pig_entity.png");
    }

}
