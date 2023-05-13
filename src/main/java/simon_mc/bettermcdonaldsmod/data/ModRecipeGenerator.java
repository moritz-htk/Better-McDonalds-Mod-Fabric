package simon_mc.bettermcdonaldsmod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
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

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.BEEF_PATTY, 2)
                .input(ModItems.KNIFE)
                .input(Items.BEEF)
                .criterion(FabricRecipeProvider.hasItem(Items.BEEF),
                        FabricRecipeProvider.conditionsFromItem(Items.BEEF))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.BEEF_PATTY)));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(ModItems.BEEF_PATTY), RecipeCategory.FOOD, ModItems.COOKED_BEEF_PATTY, 1.0f, 200)
                .criterion(FabricRecipeProvider.hasItem(ModItems.BEEF_PATTY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.BEEF_PATTY))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.COOKED_BEEF_PATTY) + "_smelting"));

        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(ModItems.BEEF_PATTY), RecipeCategory.FOOD, ModItems.COOKED_BEEF_PATTY, 1.0f, 100)
                .criterion(FabricRecipeProvider.hasItem(ModItems.BEEF_PATTY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.BEEF_PATTY))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.COOKED_BEEF_PATTY) + "_smoking"));

        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(ModItems.BEEF_PATTY), RecipeCategory.FOOD, ModItems.COOKED_BEEF_PATTY, 1.0f, 600)
                .criterion(FabricRecipeProvider.hasItem(ModItems.BEEF_PATTY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.BEEF_PATTY))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.COOKED_BEEF_PATTY) + "_campfire_cooking"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.KNIFE)
                .input('I', Items.IRON_INGOT)
                .input('S', Items.STICK)
                .pattern(" I ")
                .pattern(" S ")
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.KNIFE)));
    }
}
