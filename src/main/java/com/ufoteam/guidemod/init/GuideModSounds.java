package com.ufoteam.guidemod.init;

import com.ufoteam.guidemod.GlobalUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public final class GuideModSounds {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, GlobalUtils.MODID);

    public static final RegistryObject<SoundEvent> RAINBOW_PIG_ENTITY_SOUND_AMBIENT = SOUNDS.register(GuideModNames.rainbowPigEntityAmbient, getSound(GuideModNames.rainbowPigEntityAmbient));
    public static final RegistryObject<SoundEvent> RAINBOW_PIG_ENTITY_SOUND_HURT = SOUNDS.register(GuideModNames.rainbowPigEntityHurt, getSound(GuideModNames.rainbowPigEntityHurt));
    public static final RegistryObject<SoundEvent> RAINBOW_PIG_ENTITY_SOUND_DEATH = SOUNDS.register(GuideModNames.rainbowPigEntityDeath, getSound(GuideModNames.rainbowPigEntityDeath));
    public static final RegistryObject<SoundEvent> ARMOR_EQUIP_TITANIUM = SOUNDS.register("item.armor.equip_titanium", () -> new SoundEvent(new ResourceLocation(GlobalUtils.MODID, "item.armor.equip_titanium")));

    private static Supplier<SoundEvent> getSound(String name) {
        return () -> new SoundEvent(GlobalUtils.resourceLocation(name));
    }

}
