package simon_mc.bettermcdonaldsmod.block;

import com.mojang.serialization.MapCodec;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FallingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import simon_mc.bettermcdonaldsmod.BetterMcDonaldsMod;
import simon_mc.bettermcdonaldsmod.block.custom.LettuceCropBlock;
import simon_mc.bettermcdonaldsmod.block.custom.TomatoCropBlock;

public class ModBlocks {
    public static final Block SALT_BLOCK = registerBlock(new FallingBlock(FabricBlockSettings.copyOf(Blocks.SAND).strength(0.5f).sounds(BlockSoundGroup.SAND)) {
        @Override
        protected MapCodec<? extends FallingBlock> getCodec() {
            return null;
        }
    });
    public static final Block TOMATO_CROP = registerBlockWithoutBlockItem("tomato_crop", new TomatoCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block LETTUCE_CROP = registerBlockWithoutBlockItem("lettuce_crop", new LettuceCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    private static Block registerBlock(Block block) {
        registerBlockItem(block);
        return Registry.register(Registries.BLOCK, new Identifier(BetterMcDonaldsMod.MOD_ID, "salt_block"), block);
    }

    private static Item registerBlockItem(Block block) {
        Item item = Registry.register(Registries.ITEM, new Identifier(BetterMcDonaldsMod.MOD_ID, "salt_block"), new BlockItem(block, new FabricItemSettings()));
        return item;
    }

    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(BetterMcDonaldsMod.MOD_ID, name), block);
    }

    public static void registerModBlocks() {
        BetterMcDonaldsMod.LOGGER.info("Registering ModBlocks for " + BetterMcDonaldsMod.MOD_ID);
    }
}