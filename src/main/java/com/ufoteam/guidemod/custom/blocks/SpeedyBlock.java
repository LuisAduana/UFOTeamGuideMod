package com.ufoteam.guidemod.custom.blocks;

import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class SpeedyBlock extends Block {

    public SpeedyBlock(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result) {
        if (!level.isClientSide()) {
            if (hand == InteractionHand.MAIN_HAND) {
                player.sendMessage(new TextComponent("Recibí el clic derecho"), Util.NIL_UUID);
            }
        }
        return super.use(state, level, pos, player, hand, result);
    }

    @Override
    public void stepOn(Level level, BlockPos post, BlockState state, Entity entity) {
        if (!level.isClientSide()) {
            if (entity instanceof LivingEntity) {
                LivingEntity livingEntity = (LivingEntity) entity;
                livingEntity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200));
            }
        }
        super.stepOn(level, post, state, entity);
    }
}
