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

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SALT_BLOCK)
                .input('#', ModItemTagProvider.SALT)
                .pattern("##")
                .pattern("##")
                .criterion(hasItem(ModItems.SALT), conditionsFromTag(ModItemTagProvider.SALT))
                .offerTo(exporter, new Identifier(BetterMcDonaldsMod.MOD_ID, getRecipeName(ModBlocks.SALT_BLOCK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.CHEESE, 2)
                .input(Items.MILK_BUCKET)
                .input(ModItemTagProvider.SALT)
                .criterion(hasItem(Items.MILK_BUCKET), conditionsFromItem(Items.MILK_BUCKET))
                .criterion(hasItem(ModItems.SALT), conditionsFromTag(ModItemTagProvider.SALT))
                .offerTo(exporter, new Identifier(BetterMcDonaldsMod.MOD_ID, getRecipeName(ModItems.CHEESE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.BEEF_PATTY, 2)
                .input(ModItems.KNIFE)
                .input(Items.BEEF)
                .criterion(hasItem(ModItems.KNIFE), conditionsFromItem(ModItems.KNIFE))
                .criterion(hasItem(Items.BEEF), conditionsFromItem(Items.BEEF))
                .offerTo(exporter, new Identifier(BetterMcDonaldsMod.MOD_ID, getRecipeName(ModItems.BEEF_PATTY)));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(ModItems.BEEF_PATTY), RecipeCategory.FOOD, ModItems.COOKED_BEEF_PATTY, 1.0f, 200)
                .criterion(hasItem(ModItems.BEEF_PATTY), conditionsFromItem(ModItems.BEEF_PATTY))
                .offerTo(exporter, new Identifier(BetterMcDonaldsMod.MOD_ID, getRecipeName(ModItems.COOKED_BEEF_PATTY) + "_smelting"));

        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(ModItems.BEEF_PATTY), RecipeCategory.FOOD, ModItems.COOKED_BEEF_PATTY, 1.0f, 100)
                .criterion(hasItem(ModItems.BEEF_PATTY), conditionsFromItem(ModItems.BEEF_PATTY))
                .offerTo(exporter, new Identifier(BetterMcDonaldsMod.MOD_ID, getRecipeName(ModItems.COOKED_BEEF_PATTY) + "_smoking"));

        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(ModItems.BEEF_PATTY), RecipeCategory.FOOD, ModItems.COOKED_BEEF_PATTY, 1.0f, 600)
                .criterion(hasItem(ModItems.BEEF_PATTY), conditionsFromItem(ModItems.BEEF_PATTY))
                .offerTo(exporter, new Identifier(BetterMcDonaldsMod.MOD_ID, getRecipeName(ModItems.COOKED_BEEF_PATTY) + "_campfire_cooking"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.RAW_BACON, 2)
                .input(ModItems.KNIFE)
                .input(Items.PORKCHOP)
                .criterion(hasItem(ModItems.KNIFE), conditionsFromItem(ModItems.KNIFE))
                .criterion(hasItem(Items.PORKCHOP), conditionsFromItem(Items.PORKCHOP))
                .offerTo(exporter, new Identifier(BetterMcDonaldsMod.MOD_ID, getRecipeName(ModItems.RAW_BACON)));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(ModItems.RAW_BACON), RecipeCategory.FOOD, ModItems.COOKED_BACON, 1.0f, 200)
                .criterion(hasItem(ModItems.RAW_BACON), conditionsFromItem(ModItems.RAW_BACON))
                .offerTo(exporter, new Identifier(BetterMcDonaldsMod.MOD_ID, getRecipeName(ModItems.COOKED_BACON) + "_smelting"));

        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(ModItems.RAW_BACON), RecipeCategory.FOOD, ModItems.COOKED_BACON, 1.0f, 100)
                .criterion(hasItem(ModItems.RAW_BACON), conditionsFromItem(ModItems.RAW_BACON))
                .offerTo(exporter, new Identifier(BetterMcDonaldsMod.MOD_ID, getRecipeName(ModItems.COOKED_BACON) + "_smoking"));

        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(ModItems.RAW_BACON), RecipeCategory.FOOD, ModItems.COOKED_BACON, 1.0f, 600)
                .criterion(hasItem(ModItems.RAW_BACON), conditionsFromItem(ModItems.RAW_BACON))
                .offerTo(exporter, new Identifier(BetterMcDonaldsMod.MOD_ID, getRecipeName(ModItems.COOKED_BACON) + "_campfire_cooking"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.MAYONNAISE, 2)
                .input(Items.MILK_BUCKET)
                .input(Items.EGG)
                .criterion(hasItem(Items.MILK_BUCKET), conditionsFromItem(Items.MILK_BUCKET))
                .criterion(hasItem(Items.EGG), conditionsFromItem(Items.EGG))
                .offerTo(exporter, new Identifier(BetterMcDonaldsMod.MOD_ID, getRecipeName(ModItems.MAYONNAISE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.SWEET_SOUR_SAUCE, 2)
                .input(Items.WATER_BUCKET)
                .input(Items.SUGAR)
                .input(ModItemTagProvider.SALT)
                .input(Items.HONEY_BOTTLE)
                .criterion(hasItem(Items.WATER_BUCKET), conditionsFromItem(Items.WATER_BUCKET))
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(Items.SUGAR))
                .criterion(hasItem(ModItems.SALT), conditionsFromTag(ModItemTagProvider.SALT))
                .criterion(hasItem(Items.HONEY_BOTTLE), conditionsFromItem(Items.HONEY_BOTTLE))
                .offerTo(exporter, new Identifier(BetterMcDonaldsMod.MOD_ID, getRecipeName(ModItems.SWEET_SOUR_SAUCE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.KETCHUP, 2)
                .input(Items.WATER_BUCKET)
                .input(Items.SUGAR)
                .input(ModItemTagProvider.SALT)
                .input(Items.RED_DYE)
                .criterion(hasItem(Items.WATER_BUCKET), conditionsFromItem(Items.WATER_BUCKET))
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(Items.SUGAR))
                .criterion(hasItem(ModItems.SALT), conditionsFromTag(ModItemTagProvider.SALT))
                .criterion(hasItem(Items.RED_DYE), conditionsFromItem(Items.RED_DYE))
                .offerTo(exporter, new Identifier(BetterMcDonaldsMod.MOD_ID, getRecipeName(ModItems.KETCHUP)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.MUSTARD, 2)
                .input(Items.WATER_BUCKET)
                .input(Items.SUGAR)
                .input(ModItemTagProvider.SALT)
                .input(Items.PUMPKIN_SEEDS)
                .criterion(hasItem(Items.WATER_BUCKET), conditionsFromItem(Items.WATER_BUCKET))
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(Items.SUGAR))
                .criterion(hasItem(ModItems.SALT), conditionsFromTag(ModItemTagProvider.SALT))
                .criterion(hasItem(Items.PUMPKIN_SEEDS), conditionsFromItem(Items.PUMPKIN_SEEDS))
                .offerTo(exporter, new Identifier(BetterMcDonaldsMod.MOD_ID, getRecipeName(ModItems.MUSTARD)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.HAMBURGER)
                .input(Items.BREAD)
                .input(ModItems.COOKED_BEEF_PATTY)
                .criterion(hasItem(Items.BREAD), conditionsFromItem(Items.BREAD))
                .criterion(hasItem(ModItems.COOKED_BEEF_PATTY), conditionsFromItem(ModItems.COOKED_BEEF_PATTY))
                .offerTo(exporter, new Identifier(BetterMcDonaldsMod.MOD_ID, getRecipeName(ModItems.HAMBURGER)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.CHEESEBURGER)
                .input(Items.BREAD)
                .input(ModItems.COOKED_BEEF_PATTY)
                .input(ModItems.CHEESE)
                .criterion(hasItem(Items.BREAD), conditionsFromItem(Items.BREAD))
                .criterion(hasItem(ModItems.COOKED_BEEF_PATTY), conditionsFromItem(ModItems.COOKED_BEEF_PATTY))
                .criterion(hasItem(ModItems.CHEESE), conditionsFromItem(ModItems.CHEESE))
                .offerTo(exporter, new Identifier(BetterMcDonaldsMod.MOD_ID, getRecipeName(ModItems.CHEESEBURGER)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.BIG_MAC)
                .input(Items.BREAD)
                .input(ModItems.COOKED_BEEF_PATTY, 2)
                .input(ModItems.CHEESE)
                .input(Items.GRASS)
                .criterion(hasItem(Items.BREAD), conditionsFromItem(Items.BREAD))
                .criterion(hasItem(ModItems.COOKED_BEEF_PATTY), conditionsFromItem(ModItems.COOKED_BEEF_PATTY))
                .criterion(hasItem(ModItems.CHEESE), conditionsFromItem(ModItems.CHEESE))
                .criterion(hasItem(Items.GRASS), conditionsFromItem(Items.GRASS))
                .offerTo(exporter, new Identifier(BetterMcDonaldsMod.MOD_ID, getRecipeName(ModItems.BIG_MAC)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.CHICKENBURGER)
                .input(Items.BREAD)
                .input(Items.COOKED_CHICKEN)
                .input(ModItems.KETCHUP)
                .input(Items.GRASS)
                .criterion(hasItem(Items.BREAD), conditionsFromItem(Items.BREAD))
                .criterion(hasItem(Items.COOKED_CHICKEN), conditionsFromItem(Items.COOKED_CHICKEN))
                .criterion(hasItem(ModItems.KETCHUP), conditionsFromItem(ModItems.KETCHUP))
                .criterion(hasItem(Items.GRASS), conditionsFromItem(Items.GRASS))
                .offerTo(exporter, new Identifier(BetterMcDonaldsMod.MOD_ID, getRecipeName(ModItems.CHICKENBURGER)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.MCCHICKEN)
                .input(Items.BREAD)
                .input(Items.COOKED_CHICKEN)
                .input(ModItems.MAYONNAISE)
                .input(Items.GRASS)
                .criterion(hasItem(Items.BREAD), conditionsFromItem(Items.BREAD))
                .criterion(hasItem(Items.COOKED_CHICKEN), conditionsFromItem(Items.COOKED_CHICKEN))
                .criterion(hasItem(ModItems.MAYONNAISE), conditionsFromItem(ModItems.MAYONNAISE))
                .criterion(hasItem(Items.GRASS), conditionsFromItem(Items.GRASS))
                .offerTo(exporter, new Identifier(BetterMcDonaldsMod.MOD_ID, getRecipeName(ModItems.MCCHICKEN)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.FILET_O_FISH)
                .input(Items.BREAD)
                .input(Items.COOKED_SALMON)
                .input(ModItems.CHEESE)
                .criterion(hasItem(Items.BREAD), conditionsFromItem(Items.BREAD))
                .criterion(hasItem(Items.COOKED_SALMON), conditionsFromItem(Items.COOKED_SALMON))
                .criterion(hasItem(ModItems.CHEESE), conditionsFromItem(ModItems.CHEESE))
                .offerTo(exporter, new Identifier(BetterMcDonaldsMod.MOD_ID, getRecipeName(ModItems.FILET_O_FISH)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.CHICKEN_MCNUGGETS)
                .input(ModItems.KNIFE)
                .input(Items.COOKED_CHICKEN)
                .criterion(hasItem(ModItems.KNIFE), conditionsFromItem(ModItems.KNIFE))
                .criterion(hasItem(Items.COOKED_CHICKEN), conditionsFromItem(Items.COOKED_CHICKEN))
                .offerTo(exporter, new Identifier(BetterMcDonaldsMod.MOD_ID, getRecipeName(ModItems.CHICKEN_MCNUGGETS)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.FRIES)
                .input(ModItems.KNIFE)
                .input(Items.BAKED_POTATO)
                .input(ModItemTagProvider.SALT)
                .criterion(hasItem(ModItems.KNIFE), conditionsFromItem(ModItems.KNIFE))
                .criterion(hasItem(Items.BAKED_POTATO), conditionsFromItem(Items.BAKED_POTATO))
                .criterion(hasItem(ModItems.SALT), conditionsFromTag(ModItemTagProvider.SALT))
                .offerTo(exporter, new Identifier(BetterMcDonaldsMod.MOD_ID, getRecipeName(ModItems.FRIES)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.HAPPY_MEAL)
                .input(ModItemTagProvider.BURGERS)
                .input(ModItemTagProvider.DRINKS)
                .input(ModItemTagProvider.SIDE_DISHES)
                .input(Items.APPLE)
                .criterion("has_burger", conditionsFromTag(ModItemTagProvider.BURGERS))
                .criterion("has_drink", conditionsFromTag(ModItemTagProvider.DRINKS))
                .criterion("has_side_dish", conditionsFromTag(ModItemTagProvider.SIDE_DISHES))
                .criterion(hasItem(Items.APPLE), conditionsFromItem(Items.APPLE))
                .offerTo(exporter, new Identifier(BetterMcDonaldsMod.MOD_ID, getRecipeName(ModItems.HAPPY_MEAL)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.COCA_COLA)
                .input(Items.WATER_BUCKET)
                .input(Items.SUGAR)
                .input(ModItemTagProvider.SALT)
                .input(Items.BROWN_DYE)
                .criterion(hasItem(Items.WATER_BUCKET), conditionsFromItem(Items.WATER_BUCKET))
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(Items.SUGAR))
                .criterion(hasItem(ModItems.SALT), conditionsFromTag(ModItemTagProvider.SALT))
                .criterion(hasItem(Items.BROWN_DYE), conditionsFromItem(Items.BROWN_DYE))
                .offerTo(exporter, new Identifier(BetterMcDonaldsMod.MOD_ID, getRecipeName(ModItems.COCA_COLA)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.FANTA)
                .input(Items.WATER_BUCKET)
                .input(Items.SUGAR)
                .input(ModItemTagProvider.SALT)
                .input(Items.YELLOW_DYE)
                .criterion(hasItem(Items.WATER_BUCKET), conditionsFromItem(Items.WATER_BUCKET))
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(Items.SUGAR))
                .criterion(hasItem(ModItems.SALT), conditionsFromTag(ModItemTagProvider.SALT))
                .criterion(hasItem(Items.YELLOW_DYE), conditionsFromItem(Items.YELLOW_DYE))
                .offerTo(exporter, new Identifier(BetterMcDonaldsMod.MOD_ID, getRecipeName(ModItems.FANTA)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.SPRITE)
                .input(Items.WATER_BUCKET)
                .input(Items.SUGAR)
                .input(ModItemTagProvider.SALT)
                .input(Items.GREEN_DYE)
                .criterion(hasItem(Items.WATER_BUCKET), conditionsFromItem(Items.WATER_BUCKET))
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(Items.SUGAR))
                .criterion(hasItem(ModItems.SALT), conditionsFromTag(ModItemTagProvider.SALT))
                .criterion(hasItem(Items.GREEN_DYE), conditionsFromItem(Items.GREEN_DYE))
                .offerTo(exporter, new Identifier(BetterMcDonaldsMod.MOD_ID, getRecipeName(ModItems.SPRITE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.LIPTON_ICE_TEA_PEACH)
                .input(Items.WATER_BUCKET)
                .input(Items.SUGAR)
                .input(ModItemTagProvider.SALT)
                .input(Items.PINK_DYE)
                .criterion(hasItem(Items.WATER_BUCKET), conditionsFromItem(Items.WATER_BUCKET))
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(Items.SUGAR))
                .criterion(hasItem(ModItems.SALT), conditionsFromTag(ModItemTagProvider.SALT))
                .criterion(hasItem(Items.PINK_DYE), conditionsFromItem(Items.PINK_DYE))
                .offerTo(exporter, new Identifier(BetterMcDonaldsMod.MOD_ID, getRecipeName(ModItems.LIPTON_ICE_TEA_PEACH)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.MCFLURRY)
                .input(Items.MILK_BUCKET)
                .input(Items.SNOWBALL)
                .input(Items.SUGAR)
                .criterion(hasItem(Items.MILK_BUCKET), conditionsFromItem(Items.MILK_BUCKET))
                .criterion(hasItem(Items.SNOWBALL), conditionsFromItem(Items.SNOWBALL))
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(Items.SUGAR))
                .offerTo(exporter, new Identifier(BetterMcDonaldsMod.MOD_ID, getRecipeName(ModItems.MCFLURRY)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.KNIFE)
                .input('I', Items.IRON_INGOT)
                .input('S', Items.STICK)
                .pattern(" I ")
                .pattern(" S ")
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(BetterMcDonaldsMod.MOD_ID, getRecipeName(ModItems.KNIFE)));
    }
}