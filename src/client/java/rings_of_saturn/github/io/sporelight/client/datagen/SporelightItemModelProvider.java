package rings_of_saturn.github.io.sporelight.client.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import rings_of_saturn.github.io.sporelight.item.ModItems;

public class SporelightItemModelProvider extends FabricModelProvider {
    public SporelightItemModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.MOSS_BALL, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPORELIGHT_SPAWN_EGG, Models.GENERATED);
    }
}
