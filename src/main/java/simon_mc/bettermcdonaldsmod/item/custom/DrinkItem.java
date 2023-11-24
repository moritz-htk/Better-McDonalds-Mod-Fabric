package simon_mc.bettermcdonaldsmod.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.UseAction;
import simon_mc.bettermcdonaldsmod.item.ModItems;

public class DrinkItem extends Item {
    public DrinkItem(Settings settings) {
        super(settings.food(ModItems.registerFoodValues(3, 0.4f).build()));
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return stack.getItem().isFood() ? UseAction.DRINK : UseAction.NONE;
    }
}