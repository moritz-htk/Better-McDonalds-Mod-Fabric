package simon_mc.bettermcdonaldsmod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import simon_mc.bettermcdonaldsmod.block.ModBlocks;
import simon_mc.bettermcdonaldsmod.item.ModItems;

import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SALT_BLOCK)
                .input('#', ModItems.SALT)
                .pattern("##")
                .pattern("##")
                .criterion(FabricRecipeProvider.hasItem(ModItems.SALT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.SALT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.SALT_BLOCK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.CHEESE)
                .input(Items.MILK_BUCKET)
                .input(ModItems.SALT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.SALT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.SALT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CHEESE)));
    }
}
