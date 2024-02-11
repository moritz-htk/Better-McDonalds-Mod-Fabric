package simon_mc.bettermcdonaldsmod.loot;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.item.Item;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;
import simon_mc.bettermcdonaldsmod.BetterMcDonaldsMod;
import simon_mc.bettermcdonaldsmod.item.ModItems;

public class ModLootTableModifiers {
    private static final Identifier GRASS_BLOCK_ID = new Identifier("minecraft", "blocks/short_grass");
    private static final Identifier FERN_BLOCK_ID = new Identifier("minecraft", "blocks/fern");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (GRASS_BLOCK_ID.equals(id) || FERN_BLOCK_ID.equals(id)) {
                addSeedLoot(tableBuilder, ModItems.TOMATO_SEEDS, BetterMcDonaldsMod.CONFIG.tomatoSeedLootChance());
                addSeedLoot(tableBuilder, ModItems.LETTUCE_SEEDS, BetterMcDonaldsMod.CONFIG.lettuceSeedLootChance());
            }
        });
    }

    private static void addSeedLoot(LootTable.Builder tableBuilder, Item item, float chance) {
        LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1)).conditionally(RandomChanceLootCondition.builder(chance)).with(ItemEntry.builder(item));
        tableBuilder.pool(poolBuilder.build());
    }
}