package com.ufoteam.guidemod.init;

import com.ufoteam.guidemod.GlobalVariables;
import com.ufoteam.guidemod.custom.entities.RainbowPigEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class GuideModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, GlobalVariables.MODID);
    public static final RegistryObject<EntityType<RainbowPigEntity>> RAINBOW_PIG_ENTITY = ENTITIES.register("rainbow_pig_entitiy", () -> EntityType.Builder.of(RainbowPigEntity::new, MobCategory.CREATURE).sized(0.8f, 0.6f).build(new ResourceLocation(GlobalVariables.MODID, "rainbow_pig_entitiy").toString()));
}
