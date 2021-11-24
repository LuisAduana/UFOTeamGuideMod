package com.ufoteam.guidemod.custom.items;

import com.ufoteam.guidemod.utils.GlobalUtils;
import com.ufoteam.guidemod.utils.KeyboardUtils;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class RainbowApple extends Item {

    public RainbowApple() {
        super(new Properties().tab(GlobalUtils.GUIDEMOD_TAB)
                .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).build()));
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flag) {
        if (KeyboardUtils.isHoldingShift()) {
            tooltip.add(new TranslatableComponent("tooltip_shift.item.guidemod.rainbow_apple"));
        } else {
            tooltip.add(new TranslatableComponent("tooltip.item.guidemod.rainbow_apple"));
        }
        super.appendHoverText(stack, level, tooltip, flag);
    }
}
