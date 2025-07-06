package rings_of_saturn.github.io.sporelight.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import rings_of_saturn.github.io.sporelight.entity.ModEntities;
import rings_of_saturn.github.io.sporelight.item.ModItems;

public class MossballEntity extends ThrownItemEntity {

    public MossballEntity(EntityType<MossballEntity> entityType, World world) {
        super(ModEntities.MOSS_BALL, world);
    }

    public MossballEntity(World world, double x, double y, double z) {
        super(ModEntities.MOSS_BALL, x, y, z, world);
    }

    public MossballEntity(World world, LivingEntity owner) {
        super(ModEntities.MOSS_BALL, owner, world);
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.MOSS_BALL;
    }
}
