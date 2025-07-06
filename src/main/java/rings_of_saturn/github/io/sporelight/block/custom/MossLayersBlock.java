package rings_of_saturn.github.io.sporelight.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import rings_of_saturn.github.io.sporelight.item.ModItems;

public class MossLayersBlock extends MultifaceGrowthBlock implements Waterloggable{
    public static final MapCodec<MossLayersBlock> CODEC = createCodec(MossLayersBlock::new);
    private static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
    private static final IntProperty MOSSYNESS = IntProperty.of("mossyness", 1, 6);

    @Override
    protected MapCodec<MossLayersBlock> getCodec() {
        return CODEC;
    }

    public MossLayersBlock(AbstractBlock.Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState()
                .with(WATERLOGGED, false)
                .with(MOSSYNESS, 1)
        );
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(WATERLOGGED);
        builder.add(MOSSYNESS);

        for (Direction direction : DIRECTIONS) {
            if (this.canHaveDirection(direction)) {
                builder.add(getProperty(direction));
            }
        }
    }

    @Override
    protected BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (state.get(WATERLOGGED)) {
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public ItemStack getPickStack(WorldView world, BlockPos pos, BlockState state) {
        return ModItems.MOSS_BALL.getDefaultStack();
    }

    @Override
    protected ItemActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if(stack.isOf(ModItems.MOSS_BALL) && state.get(MOSSYNESS)+1 <= 6) {
            world.setBlockState(pos, state.with(MOSSYNESS, state.get(MOSSYNESS)+1));
            stack.decrementUnlessCreative(1, player);
            return ItemActionResult.SUCCESS;
        } else
            return super.onUseWithItem(stack, state, world, pos, player, hand, hit);
    }

    @Override
    protected FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    @Override
    protected boolean isTransparent(BlockState state, BlockView world, BlockPos pos) {
        return state.getFluidState().isEmpty();
    }

    @Override
    public LichenGrower getGrower() {
        return null;
    }
}
