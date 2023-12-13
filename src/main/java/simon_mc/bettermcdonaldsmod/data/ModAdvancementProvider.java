package simon_mc.bettermcdonaldsmod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementDisplay;
import net.minecraft.advancement.AdvancementEntry;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.advancement.criterion.TickCriterion;
import net.minecraft.item.ItemConvertible;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import simon_mc.bettermcdonaldsmod.BetterMcDonaldsMod;
import simon_mc.bettermcdonaldsmod.item.ModItems;

import java.util.Optional;
import java.util.function.Consumer;

public class ModAdvancementProvider extends FabricAdvancementProvider {
    public ModAdvancementProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateAdvancement(Consumer<AdvancementEntry> consumer) {
        AdvancementEntry ROOT = createRootAdvancement(consumer, AdvancementFrame.TASK, ModItems.HAPPY_MEAL, "root");

        AdvancementEntry GET_SALT = createAdvancement(consumer, AdvancementFrame.TASK, ModItems.SALT, "get_salt", ROOT);
        createAdvancement(consumer, AdvancementFrame.GOAL, ModItems.COCA_COLA, "craft_drink", GET_SALT);

        AdvancementEntry CRAFT_KNIFE = createAdvancement(consumer, AdvancementFrame.TASK, ModItems.KNIFE, "craft_knife", ROOT);
        createAdvancement(consumer, AdvancementFrame.GOAL, ModItems.HAMBURGER, "craft_burger", CRAFT_KNIFE);

        AdvancementEntry GET_SEEDS = createAdvancement(consumer, AdvancementFrame.TASK, ModItems.LETTUCE_SEEDS, "get_seeds", ROOT);
        AdvancementEntry HARVEST_LETTUCE = createAdvancement(consumer, AdvancementFrame.TASK, ModItems.LETTUCE, "harvest_lettuce", GET_SEEDS);
        createAdvancement(consumer, AdvancementFrame.GOAL, ModItems.SNACK_SALAD, "craft_snack_salad", HARVEST_LETTUCE);
    }

    private AdvancementEntry createRootAdvancement(Consumer<AdvancementEntry> consumer, AdvancementFrame frame, ItemConvertible item, String titleKey) {
        return Advancement.Builder.create()
                .display(createAdvancementDisplay(item,
                        Text.literal("Better McDonald's Mod"),
                        titleKey, frame, false, false))
                .criterion("tick", TickCriterion.Conditions.createTick())
                .build(consumer, new Identifier(BetterMcDonaldsMod.MOD_ID, BetterMcDonaldsMod.MOD_ID + "/" + titleKey).toString());
    }

    private AdvancementEntry createAdvancement(Consumer<AdvancementEntry> consumer, AdvancementFrame frame, ItemConvertible item, String titleKey, AdvancementEntry parent) {
        return Advancement.Builder.create()
                .display(createAdvancementDisplay(item,
                        Text.translatable("advancement." + BetterMcDonaldsMod.MOD_ID + "." + titleKey + ".title"),
                        titleKey, frame, true, true))
                .criterion("inventory_changed", InventoryChangedCriterion.Conditions.items(item))
                .parent(parent)
                .build(consumer, new Identifier(BetterMcDonaldsMod.MOD_ID, BetterMcDonaldsMod.MOD_ID + "/" + titleKey).toString());
    }

    private AdvancementDisplay createAdvancementDisplay(ItemConvertible item, Text text, String titleKey, AdvancementFrame frame, boolean showToast, boolean announceToChat) {
        return new AdvancementDisplay(item.asItem().getDefaultStack(), text,
                Text.translatable("advancement." + BetterMcDonaldsMod.MOD_ID + "." + titleKey + ".description"),
                Optional.of(new Identifier(BetterMcDonaldsMod.MOD_ID, "textures/screens/advancement_tab.png")),
                frame, showToast, announceToChat, false);
    }
}