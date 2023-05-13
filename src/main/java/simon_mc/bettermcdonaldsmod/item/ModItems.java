package simon_mc.bettermcdonaldsmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import simon_mc.bettermcdonaldsmod.BetterMcDonaldsMod;

public class ModItems {
    public static final Item SALT = registerItem("salt",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)));
    public static final Item CHEESE = registerItem("cheese",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)));
    public static final Item BEEF_PATTY = registerItem("beef_patty",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(2).saturationModifier(1f).meat().build())));
    public static final Item COOKED_BEEF_PATTY = registerItem("cooked_beef_patty",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(3).saturationModifier(6f).meat().build())));
    public static final Item MAYONNAISE = registerItem("mayonnaise",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(1).saturationModifier(2f).build())));
    public static final Item SWEET_SOUR_SAUCE = registerItem("sweet_sour_sauce",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(1).saturationModifier(2f).build())));
    public static final Item KETCHUP = registerItem("ketchup",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(1).saturationModifier(2f).build())));
    public static final SwordItem KNIFE = registerSwordItem(
            new SwordItem(new ToolMaterial() {
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
            }, 3, -3, new FabricItemSettings().rarity(Rarity.COMMON)) {
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
            });

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BetterMcDonaldsMod.MOD_ID, name), item);
    }

    private static SwordItem registerSwordItem(SwordItem item) {
        return Registry.register(Registries.ITEM, new Identifier(BetterMcDonaldsMod.MOD_ID, "knife"), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ModItemGroup.BETTER_MCDONALDS_MOD_TAB, SALT);
        addToItemGroup(ModItemGroup.BETTER_MCDONALDS_MOD_TAB, CHEESE);
        addToItemGroup(ModItemGroup.BETTER_MCDONALDS_MOD_TAB, BEEF_PATTY);
        addToItemGroup(ModItemGroup.BETTER_MCDONALDS_MOD_TAB, COOKED_BEEF_PATTY);
        addToItemGroup(ModItemGroup.BETTER_MCDONALDS_MOD_TAB, MAYONNAISE);
        addToItemGroup(ModItemGroup.BETTER_MCDONALDS_MOD_TAB, SWEET_SOUR_SAUCE);
        addToItemGroup(ModItemGroup.BETTER_MCDONALDS_MOD_TAB, KETCHUP);
        addToItemGroup(ModItemGroup.BETTER_MCDONALDS_MOD_TAB, KNIFE);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void registerModItems() {
        BetterMcDonaldsMod.LOGGER.info("Registering ModItems for " + BetterMcDonaldsMod.MOD_ID);
        addItemsToItemGroup();
    }
}
