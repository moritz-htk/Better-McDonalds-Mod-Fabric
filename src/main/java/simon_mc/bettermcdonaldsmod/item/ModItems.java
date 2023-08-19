package simon_mc.bettermcdonaldsmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import simon_mc.bettermcdonaldsmod.BetterMcDonaldsMod;
import simon_mc.bettermcdonaldsmod.item.custom.DrinkItem;
import simon_mc.bettermcdonaldsmod.item.custom.KnifeItem;

public class ModItems {
    public static final Item SALT = registerItem("salt", new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)));
    public static final Item CHEESE = registerItem("cheese", new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON).food(new FoodComponent.Builder().hunger(3).saturationModifier(1.5f).meat().build())));
    public static final Item BEEF_PATTY = registerItem("beef_patty", new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON).food(new FoodComponent.Builder().hunger(4).saturationModifier(2f).meat().build())));
    public static final Item COOKED_BEEF_PATTY = registerItem("cooked_beef_patty", new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON).food(new FoodComponent.Builder().hunger(6).saturationModifier(3f).meat().build())));
    public static final Item MAYONNAISE = registerItem("mayonnaise", new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON).food(new FoodComponent.Builder().hunger(2).saturationModifier(1f).build())));
    public static final Item SWEET_SOUR_SAUCE = registerItem("sweet_sour_sauce", new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON).food(new FoodComponent.Builder().hunger(2).saturationModifier(1f).build())));
    public static final Item KETCHUP = registerItem("ketchup", new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON).food(new FoodComponent.Builder().hunger(2).saturationModifier(1f).build())));
    public static final Item HAMBURGER = registerItem("hamburger", new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON).food(new FoodComponent.Builder().hunger(8).saturationModifier(4f).build())));
    public static final Item CHEESEBURGER = registerItem("cheeseburger", new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON).food(new FoodComponent.Builder().hunger(10).saturationModifier(5f).build())));
    public static final Item BIG_MAC = registerItem("big_mac", new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON).food(new FoodComponent.Builder().hunger(12).saturationModifier(6f).build())));
    public static final Item CHICKENBURGER = registerItem("chickenburger", new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON).food(new FoodComponent.Builder().hunger(9).saturationModifier(4.5f).build())));
    public static final Item MCCHICKEN = registerItem("mcchicken", new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON).food(new FoodComponent.Builder().hunger(10).saturationModifier(5f).build())));
    public static final Item FILET_O_FISH = registerItem("filet_o_fish", new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON).food(new FoodComponent.Builder().hunger(8).saturationModifier(4f).build())));
    public static final Item CHICKEN_MCNUGGETS = registerItem("chicken_mcnuggets", new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON).food(new FoodComponent.Builder().hunger(6).saturationModifier(3f).build())));
    public static final Item FRIES = registerItem("fries", new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON).food(new FoodComponent.Builder().hunger(4).saturationModifier(2f).build())));
    public static final Item HAPPY_MEAL = registerItem("happy_meal", new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.UNCOMMON).food(new FoodComponent.Builder().hunger(14).saturationModifier(7f).build())));
    public static final Item COCA_COLA = registerItem("coca_cola", new DrinkItem(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON).food(new FoodComponent.Builder().hunger(4).saturationModifier(2f).build())));
    public static final Item FANTA = registerItem("fanta", new DrinkItem(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON).food(new FoodComponent.Builder().hunger(4).saturationModifier(2f).build())));
    public static final Item SPRITE = registerItem("sprite", new DrinkItem(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON).food(new FoodComponent.Builder().hunger(4).saturationModifier(2f).build())));
    public static final Item LIPTON_ICE_TEA_PEACH = registerItem("lipton_ice_tea_peach", new DrinkItem(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON).food(new FoodComponent.Builder().hunger(4).saturationModifier(2f).build())));
    public static final Item MCFLURRY = registerItem("mcflurry", new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON).food(new FoodComponent.Builder().hunger(6).saturationModifier(3f).build())));
    public static final SwordItem KNIFE = registerSwordItem(new KnifeItem(3, 3, new FabricItemSettings().rarity(Rarity.COMMON)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BetterMcDonaldsMod.MOD_ID, name), item);
    }

    private static SwordItem registerSwordItem(SwordItem item) {
        return Registry.register(Registries.ITEM, new Identifier(BetterMcDonaldsMod.MOD_ID, "knife"), item);
    }

    public static void registerModItems() {
        BetterMcDonaldsMod.LOGGER.info("Registering ModItems for " + BetterMcDonaldsMod.MOD_ID);
    }
}