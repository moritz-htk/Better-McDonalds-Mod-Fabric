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
    public static final TagKey<Item> SALT = TagKey.of(Registries.ITEM.getKey(), new Identifier("c", "salt"));
    public static final TagKey<Item> BURGERS = TagKey.of(Registries.ITEM.getKey(), new Identifier(BetterMcDonaldsMod.MOD_ID, "burgers"));
    public static final TagKey<Item> SAUCES = TagKey.of(Registries.ITEM.getKey(), new Identifier(BetterMcDonaldsMod.MOD_ID, "sauces"));

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture, @Nullable BlockTagProvider blockTagProvider) {
        super(output, completableFuture, blockTagProvider);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(SALT)
                .add(ModItems.SALT);

        getOrCreateTagBuilder(BURGERS)
                .add(ModItems.HAMBURGER)
                .add(ModItems.CHEESEBURGER)
                .add(ModItems.BIG_MAC);

        getOrCreateTagBuilder(SAUCES)
                .add(ModItems.MAYONNAISE)
                .add(ModItems.SWEET_SOUR_SAUCE)
                .add(ModItems.KETCHUP);
    }
}
