package com.ufoteam.guidemod.world;

import com.ufoteam.guidemod.utils.GlobalUtils;
import com.ufoteam.guidemod.init.GuideModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class OreGeneration {

    public static final List<ConfiguredFeature<?, ?>> OVERWORLD_ORES = new ArrayList<>();
    public static final List<ConfiguredFeature<?, ?>> DESERT_ORES = new ArrayList<>();
    public static final List<ConfiguredFeature<?, ?>> END_ORES = new ArrayList<>();
    public static final List<ConfiguredFeature<?, ?>> NETHER_ORES = new ArrayList<>();

    public static void registerOres() {
        ConfiguredFeature<?, ?> titaniumOre = Feature.ORE.configured(new OreConfiguration(List.of(
                OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES,
                        GuideModBlocks.TITANIUM_ORE.get().defaultBlockState())),
                11)).rangeUniform(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(20)).squared().count(100);
        OVERWORLD_ORES.add(register("titanium_ore", titaniumOre));

        ConfiguredFeature<?, ?> skeppyfaceOre = Feature.ORE.configured(new OreConfiguration(List.of(
                OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES,
                        GuideModBlocks.SKEPPY_FACE_BLOCK.get().defaultBlockState())),
                11)).rangeUniform(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(20)).squared().count(100);
        DESERT_ORES.add(register("skeppy_face_block", skeppyfaceOre));
    }

    private static <Config extends FeatureConfiguration> ConfiguredFeature<Config, ?> register(String name, ConfiguredFeature<Config, ?> configuredFeature) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, GlobalUtils.resourceLocation(name), configuredFeature);
    }

    @Mod.EventBusSubscriber(modid = GlobalUtils.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
    public static class ForgeBusSubscriber {

        @SubscribeEvent
        public static void biomeLoading(BiomeLoadingEvent event) {
            List<Supplier<ConfiguredFeature<?, ?>>> features = event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

            if (event.getCategory() == Biome.BiomeCategory.DESERT) {
                OreGeneration.DESERT_ORES.forEach(ore -> features.add(() -> ore));
            }

            switch (event.getCategory()) {
                case NETHER -> OreGeneration.NETHER_ORES.forEach(ore -> features.add(() -> ore));
                case THEEND -> OreGeneration.END_ORES.forEach(ore -> features.add(() -> ore));
                default -> OreGeneration.OVERWORLD_ORES.forEach(ore -> features.add(() -> ore));
            }
        }
    }
}
