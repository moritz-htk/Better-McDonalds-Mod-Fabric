package simon_mc.bettermcdonaldsmod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementDisplay;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.advancement.criterion.TickCriterion;
import net.minecraft.item.ItemConvertible;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import simon_mc.bettermcdonaldsmod.BetterMcDonaldsMod;
import simon_mc.bettermcdonaldsmod.item.ModItems;

import java.util.function.Consumer;

public class ModAdvancementProvider extends FabricAdvancementProvider {
    public ModAdvancementProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateAdvancement(Consumer<Advancement> consumer) {
        Advancement START = Advancement.Builder.create()
                .display(makeRootDisplay(AdvancementFrame.TASK, ModItems.HAPPY_MEAL, "start"))
                .criterion("start", TickCriterion.Conditions.createTick())
                .build(consumer, BetterMcDonaldsMod.MOD_ID + ":start");

        Advancement GET_SALT = Advancement.Builder.create()
                .display(makeNormalDisplay(AdvancementFrame.TASK, ModItems.SALT, "get_salt"))
                .criterion("inventory_changed", InventoryChangedCriterion.Conditions.items(ModItems.SALT))
                .parent(START)
                .build(consumer, BetterMcDonaldsMod.MOD_ID + ":get_salt");

        Advancement CRAFT_KNIFE = Advancement.Builder.create()
                .display(makeNormalDisplay(AdvancementFrame.TASK, ModItems.KNIFE, "craft_knife"))
                .criterion("inventory_changed", InventoryChangedCriterion.Conditions.items(ModItems.KNIFE))
                .parent(START)
                .build(consumer, BetterMcDonaldsMod.MOD_ID + ":craft_knife");

        Advancement.Builder.create()
                .display(makeNormalDisplay(AdvancementFrame.GOAL, ModItems.BIG_MAC, "craft_burger"))
                .criterion("inventory_changed", InventoryChangedCriterion.Conditions.items(ModItems.HAMBURGER))
                .parent(CRAFT_KNIFE)
                .build(consumer, BetterMcDonaldsMod.MOD_ID + ":craft_burger");

        Advancement.Builder.create()
                .display(makeNormalDisplay(AdvancementFrame.GOAL, ModItems.COCA_COLA, "craft_drink"))
                .criterion("inventory_changed", InventoryChangedCriterion.Conditions.items(ModItems.COCA_COLA))
                .parent(GET_SALT)
                .build(consumer, BetterMcDonaldsMod.MOD_ID + ":craft_drink");
    }

    public static AdvancementDisplay makeRootDisplay(AdvancementFrame frame, ItemConvertible item, String titleKey) {
        return new AdvancementDisplay(item.asItem().getDefaultStack(),
                Text.translatable("advancement." + BetterMcDonaldsMod.MOD_ID + "." + titleKey + ".title"),
                Text.translatable("advancement." + BetterMcDonaldsMod.MOD_ID + "." + titleKey + ".description"),
                new Identifier(BetterMcDonaldsMod.MOD_ID, "textures/screens/advancement_tab.png"),
                frame, false, false, false);
    }

    public static AdvancementDisplay makeNormalDisplay(AdvancementFrame frame, ItemConvertible item, String titleKey) {
        return new AdvancementDisplay(item.asItem().getDefaultStack(),
                Text.translatable("advancement." + BetterMcDonaldsMod.MOD_ID + "." + titleKey + ".title"),
                Text.translatable("advancement." + BetterMcDonaldsMod.MOD_ID + "." + titleKey + ".description"),
                new Identifier(BetterMcDonaldsMod.MOD_ID, "textures/screens/advancement_tab.png"),
                frame, true, true, false);
    }
}
