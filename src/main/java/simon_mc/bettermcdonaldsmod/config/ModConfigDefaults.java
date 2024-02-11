package simon_mc.bettermcdonaldsmod.config;

public class ModConfigDefaults implements ModConfig {
    public static final int KNIFE_DURABILITY = 125;
    public static final boolean KNIFE_CRAFTING_DAMAGE = true;
    public static final float TOMATO_SEED_LOOT_CHANCE = 0.15f;
    public static final float LETTUCE_SEED_LOOT_CHANCE = 0.15f;
    public static final float TOMATO_COMPOSTER_CHANCE = 0.65f;
    public static final float TOMATO_SEED_COMPOSTER_CHANCE = 0.2f;
    public static final float LETTUCE_COMPOSTER_CHANCE = 0.65f;
    public static final float LETTUCE_SEED_COMPOSTER_CHANCE = 0.2f;

    @Override
    public int knifeDurability() {
        return KNIFE_DURABILITY;
    }

    @Override
    public boolean knifeCraftingDamage() {
        return KNIFE_CRAFTING_DAMAGE;
    }

    @Override
    public float tomatoSeedLootChance() {
        return TOMATO_SEED_LOOT_CHANCE;
    }

    @Override
    public float lettuceSeedLootChance() {
        return LETTUCE_SEED_LOOT_CHANCE;
    }

    @Override
    public float tomatoComposterChance() {
        return TOMATO_COMPOSTER_CHANCE;
    }

    @Override
    public float tomatoSeedComposterChance() {
        return TOMATO_SEED_COMPOSTER_CHANCE;
    }

    @Override
    public float lettuceComposterChance() {
        return LETTUCE_COMPOSTER_CHANCE;
    }

    @Override
    public float lettuceSeedComposterChance() {
        return LETTUCE_SEED_COMPOSTER_CHANCE;
    }
}