package simon_mc.bettermcdonaldsmod;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import simon_mc.bettermcdonaldsmod.data.ModLootTableGenerator;
import simon_mc.bettermcdonaldsmod.data.ModModelProvider;
import simon_mc.bettermcdonaldsmod.data.ModRecipeGenerator;

public class DataGenerators implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModLootTableGenerator::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeGenerator::new);
	}
}
