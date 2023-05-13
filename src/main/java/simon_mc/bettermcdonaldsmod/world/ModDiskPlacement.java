package simon_mc.bettermcdonaldsmod.world;

import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModDiskPlacement {
    public static List<PlacementModifier> modifiers(CountPlacementModifier countPlacementModifier, SquarePlacementModifier squarePlacementModifier, HeightmapPlacementModifier heightmapPlacementModifier, BlockFilterPlacementModifier blockFilterPlacementModifier, BiomePlacementModifier biomePlacementModifier) {
        return List.of(countPlacementModifier, squarePlacementModifier, heightmapPlacementModifier, blockFilterPlacementModifier, biomePlacementModifier);
    }
}
