package simon_mc.bettermcdonaldsmod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import simon_mc.bettermcdonaldsmod.block.ModBlocks;
import simon_mc.bettermcdonaldsmod.item.ModItemGroup;
import simon_mc.bettermcdonaldsmod.item.ModItems;
import simon_mc.bettermcdonaldsmod.world.gen.ModWorldGeneration;

public class BetterMcDonaldsMod implements ModInitializer {

	public static final String MOD_ID = "bettermcdonaldsmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(BetterMcDonaldsMod.MOD_ID);

	@Override
	public void onInitialize() {
        ModItemGroup.registerItemGroups();
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
		ModWorldGeneration.generateModWorldGen();
	}
}