package simon_mc.bettermcdonaldsmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import simon_mc.bettermcdonaldsmod.BetterMcDonaldsMod;

public class ModItems {
    public static final Item SALT = registerItem("salt",
            new Item(new FabricItemSettings()));
    public static final Item CHEESE = registerItem("cheese",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BetterMcDonaldsMod.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ModItemGroup.BETTER_MCDONALDS_MOD_TAB, SALT);
        addToItemGroup(ModItemGroup.BETTER_MCDONALDS_MOD_TAB, CHEESE);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void registerModItems() {
        BetterMcDonaldsMod.LOGGER.info("Registering ModItems for " + BetterMcDonaldsMod.MOD_ID);
        addItemsToItemGroup();
    }
}
