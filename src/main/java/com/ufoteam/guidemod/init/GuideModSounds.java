package com.ufoteam.guidemod.init;

import com.ufoteam.guidemod.GlobalVariables;
import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class GuideModSounds {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, GlobalVariables.MODID);

    public static final RegistryObject<SoundEvent> RAINBOW_PIG_ENTITY_SOUND_AMBIENT = SOUNDS.register("entity.rainbow_pig_entity.ambient", () -> new SoundEvent(new ResourceLocation(GlobalVariables.MODID, "entity.rainbow_pig_entity.ambient")));
    public static final RegistryObject<SoundEvent> RAINBOW_PIG_ENTITY_SOUND_HURT = SOUNDS.register("entity.rainbow_pig_entity.hurt", () -> new SoundEvent(new ResourceLocation(GlobalVariables.MODID, "entity.rainbow_pig_entity.hurt")));
    public static final RegistryObject<SoundEvent> RAINBOW_PIG_ENTITY_SOUND_DEATH = SOUNDS.register("entity.rainbow_pig_entity.death", () -> new SoundEvent(new ResourceLocation(GlobalVariables.MODID, "entity.rainbow_pig_entity.death")));
}
