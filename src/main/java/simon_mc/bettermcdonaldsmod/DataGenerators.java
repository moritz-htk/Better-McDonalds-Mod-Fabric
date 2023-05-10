package simon_mc.bettermcdonaldsmod;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import simon_mc.bettermcdonaldsmod.data.*;

public class DataGenerators implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		ModBlockTagProvider blockTagProvider = pack.addProvider(ModBlockTagProvider::new);

		pack.addProvider((output, completableFuture) -> new ModItemTagProvider(output, completableFuture, blockTagProvider));
		pack.addProvider(ModLootTableGenerator::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeGenerator::new);
	}
}
