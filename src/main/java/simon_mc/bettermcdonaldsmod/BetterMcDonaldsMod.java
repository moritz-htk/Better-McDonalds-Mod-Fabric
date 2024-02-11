package simon_mc.bettermcdonaldsmod;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.ComposterBlock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import simon_mc.bettermcdonaldsmod.block.ModBlocks;
import simon_mc.bettermcdonaldsmod.config.ModConfig;
import simon_mc.bettermcdonaldsmod.config.ModConfigData;
import simon_mc.bettermcdonaldsmod.config.ModConfigDefaults;
import simon_mc.bettermcdonaldsmod.item.ModItemGroup;
import simon_mc.bettermcdonaldsmod.item.ModItems;
import simon_mc.bettermcdonaldsmod.loot.ModLootTableModifiers;
import simon_mc.bettermcdonaldsmod.world.gen.ModWorldGeneration;

public class BetterMcDonaldsMod implements ModInitializer {
	public static final String MOD_ID = "bettermcdonaldsmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(BetterMcDonaldsMod.MOD_ID);
	public static ModConfig CONFIG = new ModConfigDefaults();

	@Override
	public void onInitialize() {
		LOGGER.info("Loading " + BetterMcDonaldsMod.MOD_ID);
		CONFIG = AutoConfig.register(ModConfigData.class, GsonConfigSerializer::new).getConfig();
        ModItemGroup.registerItemGroups();
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
		ModLootTableModifiers.modifyLootTables();
		ModWorldGeneration.generateModWorldGen();
		postInitialize();
		LOGGER.info("Loading of " + BetterMcDonaldsMod.MOD_ID + " complete");
	}

	private static void postInitialize() {
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.TOMATO, CONFIG.tomatoComposterChance());
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.TOMATO_SEEDS, CONFIG.tomatoSeedComposterChance());
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.LETTUCE, CONFIG.lettuceComposterChance());
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.LETTUCE_SEEDS, CONFIG.lettuceSeedComposterChance());
	}
}