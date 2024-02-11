package simon_mc.bettermcdonaldsmod.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import simon_mc.bettermcdonaldsmod.BetterMcDonaldsMod;

@Config(name = BetterMcDonaldsMod.MOD_ID)
@Config.Gui.Background("minecraft:textures/block/red_concrete_powder.png")
public class ModConfigData implements ConfigData, ModConfig {
    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.Category("items")
    public int knifeDurability = ModConfigDefaults.KNIFE_DURABILITY;

    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.Category("items")
    public boolean knifeCraftingDamage = ModConfigDefaults.KNIFE_CRAFTING_DAMAGE;

    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.Category("loot")
    public float tomatoSeedLootChance = ModConfigDefaults.TOMATO_SEED_LOOT_CHANCE;

    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.Category("loot")
    public float lettuceSeedLootChance = ModConfigDefaults.LETTUCE_SEED_LOOT_CHANCE;

    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.Category("composting")
    public float tomatoComposterChance = ModConfigDefaults.TOMATO_COMPOSTER_CHANCE;

    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.Category("composting")
    public float tomatoSeedComposterChance = ModConfigDefaults.TOMATO_SEED_COMPOSTER_CHANCE;

    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.Category("composting")
    public float lettuceComposterChance = ModConfigDefaults.LETTUCE_COMPOSTER_CHANCE;

    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.Category("composting")
    public float lettuceSeedComposterChance = ModConfigDefaults.LETTUCE_SEED_COMPOSTER_CHANCE;

    @Override
    public int knifeDurability() {
        return knifeDurability;
    }

    @Override
    public boolean knifeCraftingDamage() {
        return knifeCraftingDamage;
    }

    @Override
    public float tomatoSeedLootChance() {
        return tomatoSeedLootChance;
    }

    @Override
    public float lettuceSeedLootChance() {
        return lettuceSeedLootChance;
    }

    @Override
    public float tomatoComposterChance() {
        return tomatoComposterChance;
    }

    @Override
    public float tomatoSeedComposterChance() {
        return tomatoSeedComposterChance;
    }

    @Override
    public float lettuceComposterChance() {
        return lettuceComposterChance;
    }

    @Override
    public float lettuceSeedComposterChance() {
        return lettuceSeedComposterChance;
    }
}