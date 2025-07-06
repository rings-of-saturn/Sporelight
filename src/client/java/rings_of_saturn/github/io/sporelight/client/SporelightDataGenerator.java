package rings_of_saturn.github.io.sporelight.client;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import rings_of_saturn.github.io.sporelight.client.datagen.SporelightItemModelProvider;

public class SporelightDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(SporelightItemModelProvider::new);
    }
}
