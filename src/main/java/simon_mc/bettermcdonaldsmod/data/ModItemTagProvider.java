package simon_mc.bettermcdonaldsmod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;
import simon_mc.bettermcdonaldsmod.BetterMcDonaldsMod;
import simon_mc.bettermcdonaldsmod.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public static final TagKey<Item> SALT = registerItemTag("c", "salt");
    public static final TagKey<Item> TOMATO = registerItemTag("c", "tomato");
    public static final TagKey<Item> LETTUCE = registerItemTag("c", "lettuce");
    public static final TagKey<Item> TOMATO_SEEDS = registerItemTag("c", "seeds/tomato");
    public static final TagKey<Item> LETTUCE_SEEDS = registerItemTag("c", "seeds/lettuce");
    public static final TagKey<Item> BURGERS = registerItemTag(BetterMcDonaldsMod.MOD_ID, "burgers");
    public static final TagKey<Item> DRINKS = registerItemTag(BetterMcDonaldsMod.MOD_ID, "drinks");
    public static final TagKey<Item> SIDE_DISHES = registerItemTag(BetterMcDonaldsMod.MOD_ID, "side_dishes");
    public static final TagKey<Item> SAUCES = registerItemTag(BetterMcDonaldsMod.MOD_ID, "sauces");

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture, @Nullable BlockTagProvider blockTagProvider) {
        super(output, completableFuture, blockTagProvider);
    }

    private static TagKey<Item> registerItemTag(String namespace, String path) {
        return TagKey.of(Registries.ITEM.getKey(), new Identifier(namespace, path));
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(SALT).add(ModItems.SALT);
        getOrCreateTagBuilder(TOMATO).add(ModItems.TOMATO);
        getOrCreateTagBuilder(LETTUCE).add(ModItems.LETTUCE);
        getOrCreateTagBuilder(TOMATO_SEEDS).add(ModItems.TOMATO_SEEDS);
        getOrCreateTagBuilder(LETTUCE_SEEDS).add(ModItems.LETTUCE_SEEDS);

        getOrCreateTagBuilder(BURGERS)
                .add(ModItems.HAMBURGER)
                .add(ModItems.CHEESEBURGER)
                .add(ModItems.MCBACON)
                .add(ModItems.BIG_MAC)
                .add(ModItems.CHICKENBURGER)
                .add(ModItems.MCCHICKEN)
                .add(ModItems.FILET_O_FISH);

        getOrCreateTagBuilder(DRINKS)
                .add(ModItems.COCA_COLA)
                .add(ModItems.FANTA)
                .add(ModItems.SPRITE)
                .add(ModItems.LIPTON_ICE_TEA_PEACH);

        getOrCreateTagBuilder(SIDE_DISHES)
                .add(ModItems.CHICKEN_MCNUGGETS)
                .add(ModItems.FRIES);

        getOrCreateTagBuilder(SAUCES)
                .add(ModItems.MAYONNAISE)
                .add(ModItems.SWEET_SOUR_SAUCE)
                .add(ModItems.KETCHUP)
                .add(ModItems.MUSTARD);
    }
}