package rings_of_saturn.github.io.sporelight.entity;

import net.fabricmc.fabric.api.biome.v1.BiomeModification;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.*;
import net.minecraft.entity.mob.FlyingEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.AxolotlEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.BiomeKeys;
import rings_of_saturn.github.io.sporelight.Sporelight;
import rings_of_saturn.github.io.sporelight.entity.custom.MossballEntity;
import rings_of_saturn.github.io.sporelight.entity.custom.SporelightEntity;

import static rings_of_saturn.github.io.sporelight.Sporelight.MOD_ID;

public class ModEntities {
    public static EntityType<SporelightEntity> SPORELIGHT = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(MOD_ID, "sporelight"),
            EntityType.Builder.create(SporelightEntity::new, SpawnGroup.UNDERGROUND_WATER_CREATURE)
                    .dimensions(0.8f,0.8f)
                    .build()
    );
    public static final EntityType<MossballEntity> MOSS_BALL = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(MOD_ID, "moss_ball"),
            EntityType.Builder.<MossballEntity>create(MossballEntity::new, SpawnGroup.MISC)
                    .dimensions(0.25F, 0.25F)
                    .maxTrackingRange(4)
                    .trackingTickInterval(10)
                    .build()
    );



    public static void registerEntities(){
        FabricDefaultAttributeRegistry.register(ModEntities.SPORELIGHT, Sporelight.createAttributes());

        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.LUSH_CAVES), SpawnGroup.UNDERGROUND_WATER_CREATURE, ModEntities.SPORELIGHT, 30, 1, 2);

        SpawnRestriction.register(ModEntities.SPORELIGHT, SpawnLocationTypes.UNRESTRICTED, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, (type, world, spawnReason, pos, random) ->
        {
            return world.getBiome(pos).getKey().get() == (BiomeKeys.LUSH_CAVES);
        });
    }
}
