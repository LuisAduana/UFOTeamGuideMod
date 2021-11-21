package com.ufoteam.guidemod.init;

public class GuideModNames {

    /**
     * Blocks
     */
    public static final String skeppyFaceBlock = "skeppy_face_block";
    public static final String titaniumBlock = "titanium_block";
    public static final String speedyBlock = "speedy_block";
    public static final String titaniumOre = "titanium_ore";
    public static final String titaniumStairs = "titanium_stairs";
    public static final String titaniumFence = "titanium_fence";
    public static final String titaniumFenceGate = "titanium_fence_gate";
    public static final String titaniumWall = "titanium_wall";
    public static final String titaniumSlab = "titanium_slab";

    /**
     * Custom blocks
     */
    public static final String craftingMineralsTable = "crafting_minerals_table";

    /**
     * Items
     */
    public static final String titaniumIngot = "titanium_ingot";
    public static final String titaniumNugget = "titanium_nugget";
    public static final String rawTitanium = "raw_titanium";
    public static final String smartBlowTorch = "smart_blow_torch";
    public static final String rainbowApple = "rainbow_apple";
    public static final String tomato = "tomato";
    public static final String oats = "oats";

    /**
     * Crops
     */
    public static final String oatsCrop = "oats_crop";

    /**
     * Eggs
     */
    public static final String rainbowPigEntityEgg = "rainbow_pig_entity_egg";

    /**
     * Sounds
     */
    public static final String rainbowPigEntity = "rainbow_pig_entity";
    public static final String rainbowPigEntityAmbient = createAmbientSoundName(rainbowPigEntity);
    public static final String rainbowPigEntityHurt = createHurtSoundName(rainbowPigEntity);
    public static final String rainbowPigEntityDeath = createDeathSoundName(rainbowPigEntity);


    private static String createAmbientSoundName(String name) {
        return "entity."+name+".ambient";
    }

    private static String createHurtSoundName(String name) {
        return "entity."+name+".hurt";
    }

    private static String createDeathSoundName(String name) {
        return "entity."+name+".death";
    }
}
