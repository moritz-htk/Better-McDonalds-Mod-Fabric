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
        Advancement START = createStartAdvancement(consumer, AdvancementFrame.TASK, ModItems.HAPPY_MEAL, "start");

        Advancement GET_SALT = createAdvancement(consumer, AdvancementFrame.TASK, ModItems.SALT, "get_salt", START);
        createAdvancement(consumer, AdvancementFrame.GOAL, ModItems.COCA_COLA, "craft_drink", GET_SALT);

        Advancement CRAFT_KNIFE = createAdvancement(consumer, AdvancementFrame.TASK, ModItems.KNIFE, "craft_knife", START);
        createAdvancement(consumer, AdvancementFrame.GOAL, ModItems.HAMBURGER, "craft_burger", CRAFT_KNIFE);

        Advancement GET_SEEDS = createAdvancement(consumer, AdvancementFrame.TASK, ModItems.LETTUCE_SEEDS, "get_seeds", START);
        Advancement HARVEST_LETTUCE = createAdvancement(consumer, AdvancementFrame.TASK, ModItems.LETTUCE, "harvest_lettuce", GET_SEEDS);
        createAdvancement(consumer, AdvancementFrame.GOAL, ModItems.SNACK_SALAD, "craft_snack_salad", HARVEST_LETTUCE);
    }

    public Advancement createStartAdvancement(Consumer<Advancement> consumer, AdvancementFrame frame, ItemConvertible item, String titleKey) {
        return Advancement.Builder.create()
                .display(item.asItem().getDefaultStack(),
                        Text.literal("Better McDonald's Mod"),
                        Text.translatable("advancement." + BetterMcDonaldsMod.MOD_ID + "." + titleKey + ".description"),
                        new Identifier(BetterMcDonaldsMod.MOD_ID, "textures/screens/advancement_tab.png"),
                        frame, false, false, false)
                .criterion("tick", TickCriterion.Conditions.createTick())
                .build(consumer, BetterMcDonaldsMod.MOD_ID + ":" + titleKey);
    }

    public Advancement createAdvancement(Consumer<Advancement> consumer, AdvancementFrame frame, ItemConvertible item, String titleKey, Advancement parent) {
        return Advancement.Builder.create()
                .display(createDisplay(frame, item, titleKey))
                .criterion("inventory_changed", InventoryChangedCriterion.Conditions.items(item))
                .parent(parent)
                .build(consumer, BetterMcDonaldsMod.MOD_ID + ":" + titleKey);
    }

    public AdvancementDisplay createDisplay(AdvancementFrame frame, ItemConvertible item, String titleKey) {
        return new AdvancementDisplay(item.asItem().getDefaultStack(),
                Text.translatable("advancement." + BetterMcDonaldsMod.MOD_ID + "." + titleKey + ".title"),
                Text.translatable("advancement." + BetterMcDonaldsMod.MOD_ID + "." + titleKey + ".description"),
                new Identifier(BetterMcDonaldsMod.MOD_ID, "textures/screens/advancement_tab.png"),
                frame, true, true, false);
    }
}