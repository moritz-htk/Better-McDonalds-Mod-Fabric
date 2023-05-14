package simon_mc.bettermcdonaldsmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.entity.ShulkerBoxBlockEntity;
import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.animation.AnimationHelper;
import net.minecraft.client.render.entity.feature.WardenFeatureRenderer;
import net.minecraft.client.resource.metadata.AnimationResourceMetadata;
import net.minecraft.client.resource.metadata.AnimationResourceMetadataReader;
import net.minecraft.entity.AnimationState;
import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.UseAction;
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
    public static final Item HAMBURGER = registerItem("hamburger",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(9).saturationModifier(12f).build())));
    public static final Item CHEESEBURGER = registerItem("cheeseburger",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(10).saturationModifier(14f).build())));
    public static final Item BIG_MAC = registerItem("big_mac",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(14).saturationModifier(18f).build())));
    public static final Item CHICKENBURGER = registerItem("chickenburger",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(12).saturationModifier(15f).build())));
    public static final Item MCCHICKEN = registerItem("mcchicken",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(13).saturationModifier(17f).build())));
    public static final Item FILET_O_FISH = registerItem("filet_o_fish",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(11).saturationModifier(15f).build())));
    public static final Item CHICKEN_MCNUGGETS = registerItem("chicken_mcnuggets",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(5).saturationModifier(6f).build())));
    public static final Item FRIES = registerItem("fries",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(6f).build())));
    public static final Item HAPPY_MEAL = registerItem("happy_meal",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.UNCOMMON)
                    .food(new FoodComponent.Builder().hunger(20).saturationModifier(30f).build())));
    public static final Item COCA_COLA = registerItem("coca_cola",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(3).saturationModifier(4f).build())) {
                @Override
                public UseAction getUseAction(ItemStack stack) {
                    return stack.getItem().isFood() ? UseAction.DRINK : UseAction.NONE;
                }
            });
    public static final Item FANTA = registerItem("fanta",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(3).saturationModifier(4f).build())) {
                @Override
                public UseAction getUseAction(ItemStack stack) {
                    return stack.getItem().isFood() ? UseAction.DRINK : UseAction.NONE;
                }
            });
    public static final Item SPRITE = registerItem("sprite",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(3).saturationModifier(4f).build())) {
                @Override
                public UseAction getUseAction(ItemStack stack) {
                    return stack.getItem().isFood() ? UseAction.DRINK : UseAction.NONE;
                }
            });
    public static final Item LIPTON_ICE_TEA_PEACH = registerItem("lipton_ice_tea_peach",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(3).saturationModifier(4f).build())) {
                @Override
                public UseAction getUseAction(ItemStack stack) {
                    return stack.getItem().isFood() ? UseAction.DRINK : UseAction.NONE;
                }
            });
    public static final Item MCFLURRY = registerItem("mcflurry",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build())));
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
        addToItemGroup(ModItemGroup.BETTER_MCDONALDS_MOD_TAB, HAMBURGER);
        addToItemGroup(ModItemGroup.BETTER_MCDONALDS_MOD_TAB, CHEESEBURGER);
        addToItemGroup(ModItemGroup.BETTER_MCDONALDS_MOD_TAB, BIG_MAC);
        addToItemGroup(ModItemGroup.BETTER_MCDONALDS_MOD_TAB, CHICKENBURGER);
        addToItemGroup(ModItemGroup.BETTER_MCDONALDS_MOD_TAB, MCCHICKEN);
        addToItemGroup(ModItemGroup.BETTER_MCDONALDS_MOD_TAB, FILET_O_FISH);
        addToItemGroup(ModItemGroup.BETTER_MCDONALDS_MOD_TAB, CHICKEN_MCNUGGETS);
        addToItemGroup(ModItemGroup.BETTER_MCDONALDS_MOD_TAB, FRIES);
        addToItemGroup(ModItemGroup.BETTER_MCDONALDS_MOD_TAB, HAPPY_MEAL);
        addToItemGroup(ModItemGroup.BETTER_MCDONALDS_MOD_TAB, COCA_COLA);
        addToItemGroup(ModItemGroup.BETTER_MCDONALDS_MOD_TAB, FANTA);
        addToItemGroup(ModItemGroup.BETTER_MCDONALDS_MOD_TAB, SPRITE);
        addToItemGroup(ModItemGroup.BETTER_MCDONALDS_MOD_TAB, LIPTON_ICE_TEA_PEACH);
        addToItemGroup(ModItemGroup.BETTER_MCDONALDS_MOD_TAB, MCFLURRY);
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
