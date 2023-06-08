package simon_mc.bettermcdonaldsmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import simon_mc.bettermcdonaldsmod.BetterMcDonaldsMod;
import simon_mc.bettermcdonaldsmod.item.ModItemGroup;

public class ModBlocks {
    public static final Block SALT_BLOCK = registerBlock(
            new FallingBlock(FabricBlockSettings.create()
                    .mapColor(MapColor.WHITE_GRAY)
                    .strength(0.5f)
                    .sounds(BlockSoundGroup.SAND))
    );

    private static Block registerBlock(Block block) {
        registerBlockItem(block);
        return Registry.register(Registries.BLOCK, new Identifier(BetterMcDonaldsMod.MOD_ID, "salt_block"), block);
    }

    private static void registerBlockItem(Block block) {
        Item item = Registry.register(Registries.ITEM, new Identifier(BetterMcDonaldsMod.MOD_ID, "salt_block"),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(ModItemGroup.BETTER_MCDONALDS_MOD_TAB).register(entries -> entries.add(item));
    }

    public static void registerModBlocks() {
        BetterMcDonaldsMod.LOGGER.info("Registering ModBlocks for " + BetterMcDonaldsMod.MOD_ID);
    }
}
