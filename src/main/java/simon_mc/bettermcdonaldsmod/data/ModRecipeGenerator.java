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
import simon_mc.bettermcdonaldsmod.BetterMcDonaldsMod;
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
                .input('#', ModItemTagProvider.SALT)
                .pattern("##")
                .pattern("##")
                .criterion(FabricRecipeProvider.hasItem(ModItems.SALT), FabricRecipeProvider.conditionsFromTag(ModItemTagProvider.SALT))
                .offerTo(exporter, new Identifier(BetterMcDonaldsMod.MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.SALT_BLOCK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.CHEESE)
                .input(Items.MILK_BUCKET)
                .input(ModItemTagProvider.SALT)
                .criterion(FabricRecipeProvider.hasItem(Items.MILK_BUCKET), FabricRecipeProvider.conditionsFromItem(Items.MILK_BUCKET))
                .criterion(FabricRecipeProvider.hasItem(ModItems.SALT), FabricRecipeProvider.conditionsFromTag(ModItemTagProvider.SALT))
                .offerTo(exporter, new Identifier(BetterMcDonaldsMod.MOD_ID, FabricRecipeProvider.getRecipeName(ModItems.CHEESE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.BEEF_PATTY, 2)
                .input(ModItems.KNIFE)
                .input(Items.BEEF)
                .criterion(FabricRecipeProvider.hasItem(ModItems.KNIFE), FabricRecipeProvider.conditionsFromItem(ModItems.KNIFE))
                .criterion(FabricRecipeProvider.hasItem(Items.BEEF), FabricRecipeProvider.conditionsFromItem(Items.BEEF))
                .offerTo(exporter, new Identifier(BetterMcDonaldsMod.MOD_ID, FabricRecipeProvider.getRecipeName(ModItems.BEEF_PATTY)));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(ModItems.BEEF_PATTY), RecipeCategory.FOOD, ModItems.COOKED_BEEF_PATTY, 1.0f, 200)
                .criterion(FabricRecipeProvider.hasItem(ModItems.BEEF_PATTY), FabricRecipeProvider.conditionsFromItem(ModItems.BEEF_PATTY))
                .offerTo(exporter, new Identifier(BetterMcDonaldsMod.MOD_ID, FabricRecipeProvider.getRecipeName(ModItems.COOKED_BEEF_PATTY) + "_smelting"));

        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(ModItems.BEEF_PATTY), RecipeCategory.FOOD, ModItems.COOKED_BEEF_PATTY, 1.0f, 100)
                .criterion(FabricRecipeProvider.hasItem(ModItems.BEEF_PATTY), FabricRecipeProvider.conditionsFromItem(ModItems.BEEF_PATTY))
                .offerTo(exporter, new Identifier(BetterMcDonaldsMod.MOD_ID, FabricRecipeProvider.getRecipeName(ModItems.COOKED_BEEF_PATTY) + "_smoking"));

        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(ModItems.BEEF_PATTY), RecipeCategory.FOOD, ModItems.COOKED_BEEF_PATTY, 1.0f, 600)
                .criterion(FabricRecipeProvider.hasItem(ModItems.BEEF_PATTY), FabricRecipeProvider.conditionsFromItem(ModItems.BEEF_PATTY))
                .offerTo(exporter, new Identifier(BetterMcDonaldsMod.MOD_ID, FabricRecipeProvider.getRecipeName(ModItems.COOKED_BEEF_PATTY) + "_campfire_cooking"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.MAYONNAISE)
                .input(Items.EGG)
                .criterion(FabricRecipeProvider.hasItem(Items.EGG), FabricRecipeProvider.conditionsFromItem(Items.EGG))
                .offerTo(exporter, new Identifier(BetterMcDonaldsMod.MOD_ID, FabricRecipeProvider.getRecipeName(ModItems.MAYONNAISE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.SWEET_SOUR_SAUCE)
                .input(Items.WATER_BUCKET)
                .input(Items.SUGAR)
                .input(ModItemTagProvider.SALT)
                .input(Items.WHEAT)
                .input(Items.ORANGE_DYE)
                .criterion(FabricRecipeProvider.hasItem(Items.WATER_BUCKET), FabricRecipeProvider.conditionsFromItem(Items.WATER_BUCKET))
                .criterion(FabricRecipeProvider.hasItem(Items.SUGAR), FabricRecipeProvider.conditionsFromItem(Items.SUGAR))
                .criterion(FabricRecipeProvider.hasItem(ModItems.SALT), FabricRecipeProvider.conditionsFromTag(ModItemTagProvider.SALT))
                .criterion(FabricRecipeProvider.hasItem(Items.WHEAT), FabricRecipeProvider.conditionsFromItem(Items.WHEAT))
                .criterion(FabricRecipeProvider.hasItem(Items.ORANGE_DYE), FabricRecipeProvider.conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter, new Identifier(BetterMcDonaldsMod.MOD_ID, FabricRecipeProvider.getRecipeName(ModItems.SWEET_SOUR_SAUCE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.KETCHUP)
                .input(Items.WATER_BUCKET)
                .input(Items.SUGAR)
                .input(ModItemTagProvider.SALT)
                .input(Items.RED_DYE)
                .criterion(FabricRecipeProvider.hasItem(Items.WATER_BUCKET), FabricRecipeProvider.conditionsFromItem(Items.WATER_BUCKET))
                .criterion(FabricRecipeProvider.hasItem(Items.SUGAR), FabricRecipeProvider.conditionsFromItem(Items.SUGAR))
                .criterion(FabricRecipeProvider.hasItem(ModItems.SALT), FabricRecipeProvider.conditionsFromTag(ModItemTagProvider.SALT))
                .criterion(FabricRecipeProvider.hasItem(Items.RED_DYE), FabricRecipeProvider.conditionsFromItem(Items.RED_DYE))
                .offerTo(exporter, new Identifier(BetterMcDonaldsMod.MOD_ID, FabricRecipeProvider.getRecipeName(ModItems.KETCHUP)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.KNIFE)
                .input('I', Items.IRON_INGOT)
                .input('S', Items.STICK)
                .pattern(" I ")
                .pattern(" S ")
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_INGOT), FabricRecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(BetterMcDonaldsMod.MOD_ID, FabricRecipeProvider.getRecipeName(ModItems.KNIFE)));
    }
}
