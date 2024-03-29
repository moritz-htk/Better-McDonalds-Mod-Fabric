package simon_mc.bettermcdonaldsmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import simon_mc.bettermcdonaldsmod.BetterMcDonaldsMod;
import simon_mc.bettermcdonaldsmod.block.ModBlocks;

public class ModItemGroup {
    public static ItemGroup BETTER_MCDONALDS_MOD_TAB = Registry.register(Registries.ITEM_GROUP, new Identifier(BetterMcDonaldsMod.MOD_ID, BetterMcDonaldsMod.MOD_ID), FabricItemGroup.builder()
            .displayName(Text.literal("Better McDonald's Mod"))
            .icon(() -> new ItemStack(ModItems.HAPPY_MEAL))
            .entries((displayContext, entries) -> {
                entries.add(ModBlocks.SALT_BLOCK);
                entries.add(ModItems.SALT);
                entries.add(ModItems.TOMATO);
                entries.add(ModItems.TOMATO_SEEDS);
                entries.add(ModItems.LETTUCE);
                entries.add(ModItems.LETTUCE_SEEDS);
                entries.add(ModItems.CHEESE);
                entries.add(ModItems.TORTILLA);
                entries.add(ModItems.BEEF_PATTY);
                entries.add(ModItems.COOKED_BEEF_PATTY);
                entries.add(ModItems.RAW_BACON);
                entries.add(ModItems.COOKED_BACON);
                entries.add(ModItems.MAYONNAISE);
                entries.add(ModItems.SWEET_SOUR_SAUCE);
                entries.add(ModItems.KETCHUP);
                entries.add(ModItems.MUSTARD);
                entries.add(ModItems.HAMBURGER);
                entries.add(ModItems.CHEESEBURGER);
                entries.add(ModItems.MCBACON);
                entries.add(ModItems.BIG_MAC);
                entries.add(ModItems.CHICKENBURGER);
                entries.add(ModItems.MCCHICKEN);
                entries.add(ModItems.FILET_O_FISH);
                entries.add(ModItems.MCWRAP);
                entries.add(ModItems.SNACK_SALAD);
                entries.add(ModItems.CHICKEN_MCNUGGETS);
                entries.add(ModItems.FRIES);
                entries.add(ModItems.HAPPY_MEAL);
                entries.add(ModItems.COCA_COLA);
                entries.add(ModItems.FANTA);
                entries.add(ModItems.SPRITE);
                entries.add(ModItems.LIPTON_ICE_TEA_PEACH);
                entries.add(ModItems.MCFLURRY);
                entries.add(ModItems.KNIFE);
            }).build());

    public static void registerItemGroups() {
        BetterMcDonaldsMod.LOGGER.info("Registering ModItemGroups for " + BetterMcDonaldsMod.MOD_ID);
    }
}