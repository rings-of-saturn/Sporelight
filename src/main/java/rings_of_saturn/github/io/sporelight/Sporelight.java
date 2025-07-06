package rings_of_saturn.github.io.sporelight;

import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;

import static rings_of_saturn.github.io.sporelight.block.ModBlocks.registerBlocks;
import static rings_of_saturn.github.io.sporelight.entity.ModEntities.registerEntities;
import static rings_of_saturn.github.io.sporelight.item.ModItems.registerItems;
import static rings_of_saturn.github.io.sporelight.particle.ModParticles.registerParticles;

public class Sporelight implements ModInitializer {
    public static final String MOD_ID = "sporelight";

    public static DefaultAttributeContainer createAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 8)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.35)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 0)
                .add(EntityAttributes.GENERIC_FLYING_SPEED, 0.35)
                .add(EntityAttributes.GENERIC_GRAVITY, 0)
                .build();
    }


    @Override
    public void onInitialize() {
        registerEntities();
        registerItems();
        registerBlocks();
        registerParticles();
    }
}
