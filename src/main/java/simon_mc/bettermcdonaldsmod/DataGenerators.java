package simon_mc.bettermcdonaldsmod;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import simon_mc.bettermcdonaldsmod.data.*;
import simon_mc.bettermcdonaldsmod.world.ModConfiguredFeatures;
import simon_mc.bettermcdonaldsmod.world.ModPlacedFeatures;

public class DataGenerators implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		ModBlockTagProvider blockTagProvider = pack.addProvider(ModBlockTagProvider::new);

		pack.addProvider(ModAdvancementProvider::new);
		pack.addProvider((output, completableFuture) -> new ModItemTagProvider(output, completableFuture, blockTagProvider));
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModWorldGenProvider::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
	}
}
