package com.ufoteam.guidemod.init;

import com.ufoteam.guidemod.utils.GlobalUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class GuideModFluids {
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, GlobalUtils.MODID);

    public static final ResourceLocation OIL_STILL_RL = GlobalUtils.resourceLocation("blocks/oil_still");
    public static final ResourceLocation OIL_FLOWING_RL = GlobalUtils.resourceLocation("blocks/oil_flowing");
    public static final ResourceLocation OIL_OVERLAY_RL = GlobalUtils.resourceLocation("blocks/oil_overlay");

    public static final RegistryObject<FlowingFluid> OIL_FLUID = FLUIDS.register("oil_fluid", () -> new ForgeFlowingFluid.Source(GuideModFluids.OIL_PROPERTIES));
    public static final RegistryObject<FlowingFluid> OIL_FLOWING = FLUIDS.register("oil_flowing", () -> new ForgeFlowingFluid.Flowing(GuideModFluids.OIL_PROPERTIES));
    public static final ForgeFlowingFluid.Properties OIL_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> OIL_FLUID.get(), () -> OIL_FLOWING.get(), FluidAttributes.builder(OIL_STILL_RL, OIL_FLOWING_RL).density(15).luminosity(2).rarity(Rarity.RARE).sound(SoundEvents.HONEY_DRINK).overlay(OIL_OVERLAY_RL).viscosity(5)
    ).slopeFindDistance(3).levelDecreasePerBlock(3).block(() -> GuideModFluids.OIL_LIQUID.get()).bucket(() -> GuideModItems.OIL_BUCKET.get());

    public static final RegistryObject<LiquidBlock> OIL_LIQUID = GuideModBlocks.BLOCKS.register("oil", () -> new LiquidBlock(() -> GuideModFluids.OIL_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER).noCollission().strength(100f).noDrops()));

}

