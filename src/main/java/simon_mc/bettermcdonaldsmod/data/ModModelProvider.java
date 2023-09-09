package simon_mc.bettermcdonaldsmod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import simon_mc.bettermcdonaldsmod.block.ModBlocks;
import simon_mc.bettermcdonaldsmod.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SALT_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.SALT, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOMATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOMATO_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.LETTUCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.LETTUCE_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHEESE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BEEF_PATTY, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_BEEF_PATTY, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_BACON, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_BACON, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAYONNAISE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SWEET_SOUR_SAUCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.KETCHUP, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSTARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.HAMBURGER, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHEESEBURGER, Models.GENERATED);
        itemModelGenerator.register(ModItems.BIG_MAC, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHICKENBURGER, Models.GENERATED);
        itemModelGenerator.register(ModItems.MCCHICKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.FILET_O_FISH, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHICKEN_MCNUGGETS, Models.GENERATED);
        itemModelGenerator.register(ModItems.FRIES, Models.GENERATED);
        itemModelGenerator.register(ModItems.HAPPY_MEAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.COCA_COLA, Models.GENERATED);
        itemModelGenerator.register(ModItems.FANTA, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPRITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIPTON_ICE_TEA_PEACH, Models.GENERATED);
        itemModelGenerator.register(ModItems.MCFLURRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.KNIFE, Models.HANDHELD);
    }
}