package simon_mc.bettermcdonaldsmod.item.custom;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class KnifeItem extends SwordItem {
    public KnifeItem(int attackDamage, float attackSpeed, Settings settings) {
        super(new ToolMaterial() {
            @Override
            public int getDurability() {
                return 125;
            }

            @Override
            public float getMiningSpeedMultiplier() {
                return 1.6f;
            }

            @Override
            public float getAttackDamage() {
                return -2f;
            }

            @Override
            public int getMiningLevel() {
                return 0;
            }

            @Override
            public int getEnchantability() {
                return 0;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.ofItems(() -> Items.IRON_INGOT);
            }
        }, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean hasRecipeRemainder() {
        return true;
    }

    @Override
    public ItemStack getRecipeRemainder(ItemStack itemStack) {
        ItemStack retval = new ItemStack(this);
        retval.setDamage(itemStack.getDamage() + 1);
        if (retval.getDamage() >= retval.getMaxDamage()) {
            return ItemStack.EMPTY;
        }
        return retval;
    }
}