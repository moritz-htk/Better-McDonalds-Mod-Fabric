package simon_mc.bettermcdonaldsmod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;
import simon_mc.bettermcdonaldsmod.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture, @Nullable BlockTagProvider blockTagProvider) {
        super(output, completableFuture, blockTagProvider);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        TagKey<Item> SALT = TagKey.of(Registries.ITEM.getKey(), new Identifier("c", "salt"));
        TagKey<Item> SAUCES = TagKey.of(Registries.ITEM.getKey(), new Identifier("bettermcdonaldsmod", "sauces"));

        getOrCreateTagBuilder(SALT)
                .add(ModItems.SALT);

        getOrCreateTagBuilder(SAUCES)
                .add(ModItems.MAYONNAISE)
                .add(ModItems.SWEET_SOUR_SAUCE)
                .add(ModItems.KETCHUP);
    }
}
