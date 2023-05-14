package simon_mc.bettermcdonaldsmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import simon_mc.bettermcdonaldsmod.BetterMcDonaldsMod;

public class ModItemGroup {
    public static ItemGroup BETTER_MCDONALDS_MOD_TAB;

    public static void registerItemGroups() {
        BETTER_MCDONALDS_MOD_TAB = FabricItemGroup.builder(new Identifier(BetterMcDonaldsMod.MOD_ID, "bettermcdonaldsmod"))
                .displayName(Text.translatable("itemgroup.bettermcdonaldsmod"))
                .icon(() -> new ItemStack(ModItems.HAPPY_MEAL)).build();
    }
}
