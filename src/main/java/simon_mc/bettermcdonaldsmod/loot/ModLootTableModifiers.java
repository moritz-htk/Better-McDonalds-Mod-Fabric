package simon_mc.bettermcdonaldsmod.loot;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;
import simon_mc.bettermcdonaldsmod.item.ModItems;

public class ModLootTableModifiers {
    private static final Identifier GRASS_BLOCK_ID = new Identifier("minecraft", "blocks/grass");
    private static final Identifier FERN_BLOCK_ID = new Identifier("minecraft", "blocks/fern");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if(GRASS_BLOCK_ID.equals(id)) {
                LootPool.Builder tomatoPoolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1)).conditionally(RandomChanceLootCondition.builder(0.15f)).with(ItemEntry.builder(ModItems.TOMATO_SEEDS));
                tableBuilder.pool(tomatoPoolBuilder.build());

                LootPool.Builder lettucePoolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1)).conditionally(RandomChanceLootCondition.builder(0.15f)).with(ItemEntry.builder(ModItems.LETTUCE_SEEDS));
                tableBuilder.pool(lettucePoolBuilder.build());
            }

            if(FERN_BLOCK_ID.equals(id)) {
                LootPool.Builder tomatoPoolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1)).conditionally(RandomChanceLootCondition.builder(0.15f)).with(ItemEntry.builder(ModItems.TOMATO_SEEDS));
                tableBuilder.pool(tomatoPoolBuilder.build());

                LootPool.Builder lettucePoolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1)).conditionally(RandomChanceLootCondition.builder(0.15f)).with(ItemEntry.builder(ModItems.LETTUCE_SEEDS));
                tableBuilder.pool(lettucePoolBuilder.build());
            }
        });
    }
}