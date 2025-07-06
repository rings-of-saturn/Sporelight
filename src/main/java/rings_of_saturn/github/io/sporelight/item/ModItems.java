package rings_of_saturn.github.io.sporelight.item;

import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import rings_of_saturn.github.io.sporelight.block.ModBlocks;
import rings_of_saturn.github.io.sporelight.entity.ModEntities;
import rings_of_saturn.github.io.sporelight.item.custom.MossBallItem;

import static rings_of_saturn.github.io.sporelight.Sporelight.MOD_ID;

public class ModItems {

    public static final Item MOSS_BALL = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "moss_ball"),
            new MossBallItem(ModBlocks.MOSS_LAYERS, new Item.Settings().maxCount(64)));

    public static final Item SPORELIGHT_SPAWN_EGG = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "sporelight_spawn_egg"), new SpawnEggItem(ModEntities.SPORELIGHT, 0xc4c4c4, 0xadadad, new Item.Settings().maxCount(64)));



    public static void registerItems(){

    }
}
