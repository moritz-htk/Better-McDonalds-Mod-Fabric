package simon_mc.bettermcdonaldsmod.world;

import net.minecraft.fluid.Fluids;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.Heightmap;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.*;
import simon_mc.bettermcdonaldsmod.BetterMcDonaldsMod;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> SALT_BLOCK_PLACED_KEY = registerKey("salt_block_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SALT_BLOCK_KEY),
                ModDiskPlacement.modifiers(CountPlacementModifier.of(2), SquarePlacementModifier.of(), HeightmapPlacementModifier.of(Heightmap.Type.OCEAN_FLOOR_WG), BlockFilterPlacementModifier.of(BlockPredicate.matchingFluids(Fluids.WATER)), BiomePlacementModifier.of()));
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(BetterMcDonaldsMod.MOD_ID, name));
    }
    private static void register(Registerable<PlacedFeature> context, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(ModPlacedFeatures.SALT_BLOCK_PLACED_KEY, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
