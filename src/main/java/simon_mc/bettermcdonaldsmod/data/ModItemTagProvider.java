package simon_mc.bettermcdonaldsmod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;
import simon_mc.bettermcdonaldsmod.block.ModBlocks;
import simon_mc.bettermcdonaldsmod.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public static final TagKey<Item> SALTS = registerItemTag("c", "salts");
    public static final TagKey<Item> SALT = registerItemTag("c", "salt");
    public static final TagKey<Item> SALT_BLOCKS = registerItemTag("c", "salt_blocks");
    public static final TagKey<Item> CROPS = registerItemTag("c", "crops");
    public static final TagKey<Item> TOMATO = registerItemTag("c", "tomatoes");
    public static final TagKey<Item> CROPS_TOMATO = registerItemTag("c", "crops/tomato");
    public static final TagKey<Item> LETTUCE = registerItemTag("c", "lettuce");
    public static final TagKey<Item> CROPS_LETTUCE = registerItemTag("c", "crops/lettuce");
    public static final TagKey<Item> SEEDS = registerItemTag("c", "seeds");
    public static final TagKey<Item> TOMATO_SEEDS = registerItemTag("c", "tomato_seeds");
    public static final TagKey<Item> SEEDS_TOMATO = registerItemTag("c", "seeds/tomato");
    public static final TagKey<Item> LETTUCE_SEEDS = registerItemTag("c", "lettuce_seeds");
    public static final TagKey<Item> SEEDS_LETTUCE = registerItemTag("c", "seeds/lettuce");
    public static final TagKey<Item> COOKED_MEAT = registerItemTag("c", "cooked_meat");
    public static final TagKey<Item> COOKED_BACON = registerItemTag("c", "cooked_bacon");
    public static final TagKey<Item> BURGERS = registerItemTag("c", "burgers");
    public static final TagKey<Item> HAMBURGER = registerItemTag("c", "hamburger");
    public static final TagKey<Item> BURGER_HAMBURGER = registerItemTag("c", "burgers/hamburger");
    public static final TagKey<Item> CHEESEBURGER = registerItemTag("c", "cheeseburger");
    public static final TagKey<Item> BURGER_CHEESEBURGER = registerItemTag("c", "burgers/cheeseburger");
    public static final TagKey<Item> CHICKENBURGER = registerItemTag("c", "chickenburger");
    public static final TagKey<Item> BURGER_CHICKENBURGER = registerItemTag("c", "burgers/chickenburger");
    public static final TagKey<Item> FISHBURGER = registerItemTag("c", "fishburger");
    public static final TagKey<Item> BURGER_FISHBURGER = registerItemTag("c", "burgers/fishburger");
    public static final TagKey<Item> SIDE_DISHES = registerItemTag("c", "side_dishes");
    public static final TagKey<Item> DRINKS = registerItemTag("c", "drinks");
    public static final TagKey<Item> SAUCES = registerItemTag("c", "sauces");
    public static final TagKey<Item> MAYONNAISE = registerItemTag("c", "mayonnaise");
    public static final TagKey<Item> SAUCES_MAYONNAISE = registerItemTag("c", "sauces/mayonnaise");
    public static final TagKey<Item> SWEET_SOUR_SAUCE = registerItemTag("c", "sweet_sour_sauce");
    public static final TagKey<Item> SAUCES_SWEET_SOUR_SAUCE = registerItemTag("c", "sauces/sweet_sour_sauce");
    public static final TagKey<Item> KETCHUP = registerItemTag("c", "ketchup");
    public static final TagKey<Item> SAUCES_KETCHUP = registerItemTag("c", "sauces/ketchup");
    public static final TagKey<Item> MUSTARD = registerItemTag("c", "mustard");
    public static final TagKey<Item> SAUCES_MUSTARD = registerItemTag("c", "sauces/mustard");
    public static final TagKey<Item> KNIVES = registerItemTag("c", "knives");

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture, @Nullable BlockTagProvider blockTagProvider) {
        super(output, completableFuture, blockTagProvider);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(SALTS).add(ModItems.SALT).addTag(SALT);
        getOrCreateTagBuilder(SALT).add(ModItems.SALT);
        getOrCreateTagBuilder(SALT_BLOCKS).add(ModBlocks.SALT_BLOCK.asItem());
        getOrCreateTagBuilder(CROPS).addTag(TOMATO).addTag(LETTUCE);
        getOrCreateTagBuilder(TOMATO).add(ModItems.TOMATO).addTag(CROPS_TOMATO);
        getOrCreateTagBuilder(CROPS_TOMATO).add(ModItems.TOMATO);
        getOrCreateTagBuilder(LETTUCE).add(ModItems.LETTUCE).addTag(CROPS_LETTUCE);
        getOrCreateTagBuilder(CROPS_LETTUCE).add(ModItems.LETTUCE);
        getOrCreateTagBuilder(SEEDS).addTag(TOMATO_SEEDS).addTag(LETTUCE_SEEDS);
        getOrCreateTagBuilder(TOMATO_SEEDS).add(ModItems.TOMATO_SEEDS).addTag(SEEDS_TOMATO);
        getOrCreateTagBuilder(SEEDS_TOMATO).add(ModItems.TOMATO_SEEDS);
        getOrCreateTagBuilder(LETTUCE_SEEDS).add(ModItems.LETTUCE_SEEDS).addTag(SEEDS_LETTUCE);
        getOrCreateTagBuilder(SEEDS_LETTUCE).add(ModItems.LETTUCE_SEEDS);

        getOrCreateTagBuilder(COOKED_MEAT).add(ModItems.COOKED_BEEF_PATTY);
        getOrCreateTagBuilder(COOKED_BACON).add(ModItems.COOKED_BACON);

        getOrCreateTagBuilder(BURGERS).addTag(HAMBURGER).addTag(CHEESEBURGER).addTag(CHICKENBURGER).addTag(FISHBURGER);
        getOrCreateTagBuilder(HAMBURGER).add(ModItems.HAMBURGER).add(ModItems.MCBACON).add(ModItems.BIG_MAC).addTag(BURGER_HAMBURGER);
        getOrCreateTagBuilder(BURGER_HAMBURGER).add(ModItems.HAMBURGER).add(ModItems.MCBACON).add(ModItems.BIG_MAC);
        getOrCreateTagBuilder(CHEESEBURGER).add(ModItems.CHEESEBURGER).addTag(BURGER_HAMBURGER);
        getOrCreateTagBuilder(BURGER_CHEESEBURGER).add(ModItems.CHEESEBURGER);
        getOrCreateTagBuilder(CHICKENBURGER).add(ModItems.CHICKENBURGER).add(ModItems.MCCHICKEN).addTag(BURGER_CHICKENBURGER);
        getOrCreateTagBuilder(BURGER_CHICKENBURGER).add(ModItems.CHICKENBURGER).add(ModItems.MCCHICKEN);
        getOrCreateTagBuilder(FISHBURGER).add(ModItems.FILET_O_FISH).addTag(BURGER_FISHBURGER);
        getOrCreateTagBuilder(BURGER_FISHBURGER).add(ModItems.FILET_O_FISH);
        getOrCreateTagBuilder(SIDE_DISHES).add(ModItems.SNACK_SALAD).add(ModItems.CHICKEN_MCNUGGETS).add(ModItems.FRIES);
        getOrCreateTagBuilder(DRINKS).add(ModItems.COCA_COLA).add(ModItems.FANTA).add(ModItems.SPRITE).add(ModItems.LIPTON_ICE_TEA_PEACH);
        getOrCreateTagBuilder(SAUCES).addTag(MAYONNAISE).addTag(SWEET_SOUR_SAUCE).addTag(KETCHUP).addTag(MUSTARD);
        getOrCreateTagBuilder(MAYONNAISE).add(ModItems.MAYONNAISE).addTag(SAUCES_MAYONNAISE);
        getOrCreateTagBuilder(SAUCES_MAYONNAISE).add(ModItems.MAYONNAISE);
        getOrCreateTagBuilder(SWEET_SOUR_SAUCE).add(ModItems.SWEET_SOUR_SAUCE).addTag(SAUCES_SWEET_SOUR_SAUCE);
        getOrCreateTagBuilder(SAUCES_SWEET_SOUR_SAUCE).add(ModItems.SWEET_SOUR_SAUCE);
        getOrCreateTagBuilder(KETCHUP).add(ModItems.KETCHUP).addTag(SAUCES_KETCHUP);
        getOrCreateTagBuilder(SAUCES_KETCHUP).add(ModItems.KETCHUP);
        getOrCreateTagBuilder(MUSTARD).add(ModItems.MUSTARD).addTag(SAUCES_MUSTARD);
        getOrCreateTagBuilder(SAUCES_MUSTARD).add(ModItems.MUSTARD);
        getOrCreateTagBuilder(KNIVES).add(ModItems.KNIFE);
    }

    private static TagKey<Item> registerItemTag(String namespace, String path) {
        return TagKey.of(Registries.ITEM.getKey(), new Identifier(namespace, path));
    }
}