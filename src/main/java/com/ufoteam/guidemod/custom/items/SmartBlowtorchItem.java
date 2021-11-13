package com.ufoteam.guidemod.custom.items;

import com.google.common.collect.ImmutableMap;
import com.ufoteam.guidemod.init.GuideModBlocks;
import com.ufoteam.guidemod.init.GuideModItems;
import net.minecraft.Util;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;

public class SmartBlowtorchItem extends Item {

    private static final Map<Block, Item> BLOW_TORCH_ITEM_CRAFT = new ImmutableMap.Builder<Block, Item>()
            .put(GuideModBlocks.TITANIUM_BLOCK.get(), GuideModItems.RAW_TITANIUM.get())
            .build();

    public SmartBlowtorchItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        if (!context.getLevel().isClientSide()) {
            Level level = context.getLevel();
            BlockPos positionClicked = context.getClickedPos();
            Block blockClicked = level.getBlockState(positionClicked).getBlock();

            if (canBlockTorch(blockClicked)) {
                ItemEntity entityItem = new ItemEntity(level,
                        positionClicked.getX(), positionClicked.getY(), positionClicked.getZ(),
                        new ItemStack(BLOW_TORCH_ITEM_CRAFT.get(blockClicked), 1));
                level.destroyBlock(positionClicked, false);
                level.addFreshEntity(entityItem);
                context.getItemInHand().hurtAndBreak(1, context.getPlayer(), p -> {
                    p.broadcastBreakEvent(context.getHand());
                });
            } else {
                context.getPlayer().sendMessage(new TextComponent("No funciona en este objeto"), Util.NIL_UUID);
            }
        }

        return InteractionResult.SUCCESS;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag tooltipFlag) {
        if (Screen.hasShiftDown()) {
            components.add(new TranslatableComponent("tooltip.guidemod.blowtorch_shift"));
        } else {
            components.add(new TranslatableComponent("tooltip.guidemod.blowtorch"));
        }
        super.appendHoverText(stack, level, components, tooltipFlag);
    }

    private boolean canBlockTorch(Block block) {
        return BLOW_TORCH_ITEM_CRAFT.containsKey(block);
    }
}
