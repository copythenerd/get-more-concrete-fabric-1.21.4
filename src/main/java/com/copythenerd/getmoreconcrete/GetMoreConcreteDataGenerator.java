package com.copythenerd.getmoreconcrete;

import com.copythenerd.getmoreconcrete.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class GetMoreConcreteDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ConcreteBlockTagProvider::new);
		pack.addProvider(ConcreteItemTagProvider::new);
		pack.addProvider(ConcreteLootTableProvider::new);
		pack.addProvider(ConcreteModelProvider::new);
		pack.addProvider(ConcreteRecipeProvider::new);

	}
}
