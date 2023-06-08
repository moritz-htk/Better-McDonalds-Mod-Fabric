package simon_mc.bettermcdonaldsmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import simon_mc.bettermcdonaldsmod.BetterMcDonaldsMod;

public class ModItemGroup {
    public static final RegistryKey<ItemGroup> BETTER_MCDONALDS_MOD_TAB = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(BetterMcDonaldsMod.MOD_ID, "bettermcdonaldsmod"));

    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, BETTER_MCDONALDS_MOD_TAB, FabricItemGroup.builder()
                .displayName(Text.literal("Better McDonald's Mod"))
                .icon(() -> new ItemStack(ModItems.HAPPY_MEAL)).build());
    }
}
