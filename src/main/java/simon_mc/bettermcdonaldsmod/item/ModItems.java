package simon_mc.bettermcdonaldsmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import simon_mc.bettermcdonaldsmod.BetterMcDonaldsMod;
import simon_mc.bettermcdonaldsmod.block.ModBlocks;
import simon_mc.bettermcdonaldsmod.item.custom.DrinkItem;
import simon_mc.bettermcdonaldsmod.item.custom.KnifeItem;

public class ModItems {
    public static final Item SALT = registerItem("salt", new Item(new FabricItemSettings()));
    public static final Item TOMATO = registerItem("tomato", new Item(new FabricItemSettings().food(registerFoodValues(1, 0.5f).build())));
    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds", new AliasedBlockItem(ModBlocks.TOMATO_CROP, new FabricItemSettings()));
    public static final Item LETTUCE = registerItem("lettuce", new Item(new FabricItemSettings().food(registerFoodValues(1, 0.5f).build())));
    public static final Item LETTUCE_SEEDS = registerItem("lettuce_seeds", new AliasedBlockItem(ModBlocks.LETTUCE_CROP, new FabricItemSettings()));
    public static final Item CHEESE = registerItem("cheese", new Item(new FabricItemSettings().food(registerFoodValues(2, 1f).meat().build())));
    public static final Item TORTILLA = registerItem("tortilla", new Item(new FabricItemSettings().food(registerFoodValues(2, 1f).build())));
    public static final Item BEEF_PATTY = registerItem("beef_patty", new Item(new FabricItemSettings().food(registerFoodValues(4, 2f).meat().build())));
    public static final Item COOKED_BEEF_PATTY = registerItem("cooked_beef_patty", new Item(new FabricItemSettings().food(registerFoodValues(5, 2.5f).meat().build())));
    public static final Item RAW_BACON = registerItem("raw_bacon", new Item(new FabricItemSettings().food(registerFoodValues(3, 1.5f).meat().build())));
    public static final Item COOKED_BACON = registerItem("cooked_bacon", new Item(new FabricItemSettings().food(registerFoodValues(4, 2f).meat().build())));
    public static final Item MAYONNAISE = registerItem("mayonnaise", new Item(new FabricItemSettings().food(registerFoodValues(1, 0.5f).build())));
    public static final Item SWEET_SOUR_SAUCE = registerItem("sweet_sour_sauce", new Item(new FabricItemSettings().food(registerFoodValues(1, 0.5f).build())));
    public static final Item KETCHUP = registerItem("ketchup", new Item(new FabricItemSettings().food(registerFoodValues(1, 0.5f).build())));
    public static final Item MUSTARD = registerItem("mustard", new Item(new FabricItemSettings().food(registerFoodValues(1, 0.5f).build())));
    public static final Item HAMBURGER = registerItem("hamburger", new Item(new FabricItemSettings().food(registerFoodValues(6, 3f).build())));
    public static final Item CHEESEBURGER = registerItem("cheeseburger", new Item(new FabricItemSettings().food(registerFoodValues(8, 4f).build())));
    public static final Item MCBACON = registerItem("mcbacon", new Item(new FabricItemSettings().food(registerFoodValues(8, 4f).build())));
    public static final Item BIG_MAC = registerItem("big_mac", new Item(new FabricItemSettings().food(registerFoodValues(10, 5f).build())));
    public static final Item CHICKENBURGER = registerItem("chickenburger", new Item(new FabricItemSettings().food(registerFoodValues(7, 3.5f).build())));
    public static final Item MCCHICKEN = registerItem("mcchicken", new Item(new FabricItemSettings().food(registerFoodValues(8, 4f).build())));
    public static final Item FILET_O_FISH = registerItem("filet_o_fish", new Item(new FabricItemSettings().food(registerFoodValues(6, 3f).build())));
    public static final Item MCWRAP = registerItem("mcwrap", new Item(new FabricItemSettings().food(registerFoodValues(5, 2.5f).build())));
    public static final Item CHICKEN_MCNUGGETS = registerItem("chicken_mcnuggets", new Item(new FabricItemSettings().food(registerFoodValues(4, 2f).build())));
    public static final Item FRIES = registerItem("fries", new Item(new FabricItemSettings().food(registerFoodValues(5, 2.5f).build())));
    public static final Item HAPPY_MEAL = registerItem("happy_meal", new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).food(registerFoodValues(14, 7f).build())));
    public static final Item COCA_COLA = registerItem("coca_cola", new DrinkItem(new FabricItemSettings().food(registerFoodValues(3, 1.5f).build())));
    public static final Item FANTA = registerItem("fanta", new DrinkItem(new FabricItemSettings().food(registerFoodValues(3, 1.5f).build())));
    public static final Item SPRITE = registerItem("sprite", new DrinkItem(new FabricItemSettings().food(registerFoodValues(3, 1.5f).build())));
    public static final Item LIPTON_ICE_TEA_PEACH = registerItem("lipton_ice_tea_peach", new DrinkItem(new FabricItemSettings().food(registerFoodValues(3, 1.5f).build())));
    public static final Item MCFLURRY = registerItem("mcflurry", new Item(new FabricItemSettings().food(registerFoodValues(6, 3f).build())));
    public static final SwordItem KNIFE = registerSwordItem(new KnifeItem(3, 3, new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BetterMcDonaldsMod.MOD_ID, name), item);
    }

    private static SwordItem registerSwordItem(SwordItem item) {
        return Registry.register(Registries.ITEM, new Identifier(BetterMcDonaldsMod.MOD_ID, "knife"), item);
    }

    public static FoodComponent.Builder registerFoodValues(int hunger, float saturation) {
        return new FoodComponent.Builder().hunger(hunger).saturationModifier(saturation);
    }

    public static void registerModItems() {
        BetterMcDonaldsMod.LOGGER.info("Registering ModItems for " + BetterMcDonaldsMod.MOD_ID);
    }
}