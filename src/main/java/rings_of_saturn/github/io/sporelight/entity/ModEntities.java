package rings_of_saturn.github.io.sporelight.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import rings_of_saturn.github.io.sporelight.Sporelight;
import rings_of_saturn.github.io.sporelight.entity.custom.MossballEntity;
import rings_of_saturn.github.io.sporelight.entity.custom.SporelightEntity;

import static rings_of_saturn.github.io.sporelight.Sporelight.MOD_ID;

public class ModEntities {
    public static EntityType<SporelightEntity> SPORELIGHT = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(MOD_ID, "sporelight"),
            EntityType.Builder.create(SporelightEntity::new, SpawnGroup.AXOLOTLS)
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
    }
}
