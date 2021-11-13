package com.ufoteam.guidemod.init;

import com.ufoteam.guidemod.GlobalUtils;
import com.ufoteam.guidemod.custom.entities.RainbowPigEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class GuideModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, GlobalUtils.MODID);
    public static final RegistryObject<EntityType<RainbowPigEntity>> RAINBOW_PIG_ENTITY = ENTITIES.register("rainbow_pig_entity", () -> EntityType.Builder.of(RainbowPigEntity::new, MobCategory.CREATURE).sized(0.8f, 0.6f).build(new ResourceLocation(GlobalUtils.MODID, "rainbow_pig_entitiy").toString()));
}
