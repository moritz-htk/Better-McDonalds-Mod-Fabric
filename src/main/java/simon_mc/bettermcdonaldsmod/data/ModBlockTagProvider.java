package simon_mc.bettermcdonaldsmod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import simon_mc.bettermcdonaldsmod.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public static final TagKey<Block> SALT = TagKey.of(Registries.BLOCK.getKey(), new Identifier("c", "salt_blocks"));
    public static final TagKey<Block> SHOVEL_MINEABLE = TagKey.of(Registries.BLOCK.getKey(), new Identifier("minecraft", "mineable/shovel"));

    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(SALT).add(ModBlocks.SALT_BLOCK);
        getOrCreateTagBuilder(SHOVEL_MINEABLE).add(ModBlocks.SALT_BLOCK);
    }
}