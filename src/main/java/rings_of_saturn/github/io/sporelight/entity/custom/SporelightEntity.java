package rings_of_saturn.github.io.sporelight.entity.custom;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MovementType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.ai.pathing.BirdNavigation;
import net.minecraft.entity.ai.pathing.EntityNavigation;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import rings_of_saturn.github.io.sporelight.entity.ModEntities;
import rings_of_saturn.github.io.sporelight.item.ModItems;

import static rings_of_saturn.github.io.sporelight.particle.ModParticles.*;

public class SporelightEntity extends PathAwareEntity {
    public SporelightEntity(EntityType<SporelightEntity> entityType, World world) {
        super(ModEntities.SPORELIGHT, world);

    }
    protected SporelightEntity(World world) {
        super(ModEntities.SPORELIGHT, world);
    }

    @Override
    protected ActionResult interactMob(PlayerEntity player, Hand hand) {
        if(player.getStackInHand(hand).getItem() == Items.BRUSH){
            this.dropItem(ModItems.MOSS_BALL);
            player.getStackInHand(hand).damage(4, player, getSlotForHand(hand));
            return ActionResult.success(this.getWorld().isClient);
        }
        return super.interactMob(player, hand);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(1, new FlyGoal(this, 1f));
        this.goalSelector.add(2, new FollowMobGoal(this, 1.0, 5.0F, 7.0F));
        this.goalSelector.add(3, new LookAtEntityGoal(this, PlayerEntity.class, 4.0F, 0.25f));
        this.goalSelector.add(3, new LookAroundGoal(this));
    }

    @Override
    protected EntityNavigation createNavigation(World world) {
        BirdNavigation birdNavigation = new BirdNavigation(this, world);
        birdNavigation.setCanPathThroughDoors(false);
        birdNavigation.setCanSwim(true);
        birdNavigation.setCanEnterOpenDoors(true);
        return birdNavigation;
    }

    @Override
    protected void fall(double heightDifference, boolean onGround, BlockState state, BlockPos landedPosition) {
    }

    @Override
    public void tick() {
        super.tick();
        if(!this.getWorld().isClient) {
            if (this.getRandom().nextBetween(1, 10) == 1) {
                this.getServer().getWorld(this.getWorld().getRegistryKey()).spawnParticles(MOSS, this.getX(), this.getY(), this.getZ(), 1, 0.2, 0, 0.2, 0);
            }
            if (this.getRandom().nextBetween(1, 20 * 60) == 1) {
                this.dropItem(ModItems.MOSS_BALL);
            }
        }
    }

    @Override
    public void travel(Vec3d movementInput) {
        if (this.isLogicalSideForUpdatingMovement()) {
            if (this.isTouchingWater()) {
                this.updateVelocity(0.02F, movementInput);
                this.move(MovementType.SELF, this.getVelocity());
                this.setVelocity(this.getVelocity().multiply(0.8F));
            } else if (this.isInLava()) {
                this.updateVelocity(0.02F, movementInput);
                this.move(MovementType.SELF, this.getVelocity());
                this.setVelocity(this.getVelocity().multiply(0.5));
            } else {
                float f = 0.91F;
                if (this.isOnGround()) {
                    f = this.getWorld().getBlockState(this.getVelocityAffectingPos()).getBlock().getSlipperiness() * 0.91F;
                }

                float g = 0.16277137F / (f * f * f);
                f = 0.91F;
                if (this.isOnGround()) {
                    f = this.getWorld().getBlockState(this.getVelocityAffectingPos()).getBlock().getSlipperiness() * 0.91F;
                }

                this.updateVelocity(this.isOnGround() ? 0.1F * g : 0.02F, movementInput);
                this.move(MovementType.SELF, this.getVelocity());
                this.setVelocity(this.getVelocity().multiply(f));
            }
        }

        this.updateLimbs(false);
    }

    @Override
    public boolean isClimbing() {
        return false;
    }
}
