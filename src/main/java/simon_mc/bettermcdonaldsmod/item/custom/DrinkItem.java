package simon_mc.bettermcdonaldsmod.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.UseAction;

public class DrinkItem extends Item {
    public DrinkItem(Settings settings) {
        super(settings);
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return stack.getItem().isFood() ? UseAction.DRINK : UseAction.NONE;
    }
}