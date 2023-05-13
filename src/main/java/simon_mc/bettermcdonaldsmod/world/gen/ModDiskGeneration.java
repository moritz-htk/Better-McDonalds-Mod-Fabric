package simon_mc.bettermcdonaldsmod.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import simon_mc.bettermcdonaldsmod.world.ModPlacedFeatures;

public class ModDiskGeneration {
    public static void generateDisks() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.RIVER),
                GenerationStep.Feature.RAW_GENERATION, ModPlacedFeatures.SALT_BLOCK_PLACED_KEY);
    }
}
