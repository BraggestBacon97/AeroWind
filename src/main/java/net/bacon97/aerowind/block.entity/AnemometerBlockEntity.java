package net.bacon97.aerowind.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.bacon97.aerowind.block.AnemometerBlock;
import net.bacon97.aerowind.core.WindManager;

public class AnemometerBlockEntity extends BlockEntity {

    public AnemometerBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.ANEMOMETER_BE.get(), pos, state);
    }

    public static void tick(Level level, BlockPos pos, BlockState state, AnemometerBlockEntity be) {
        if (!level.isClientSide()) {
            int angle = WindManager.getWindAngleDegrees(level.getGameTime());
            int power = angle / 23;
            if (power > 15) power = 15;

            if (state.getValue(AnemometerBlock.POWER) != power) {
                level.setBlock(pos, state.setValue(AnemometerBlock.POWER, power), 3);
            }
            level.scheduleTick(pos, state.getBlock(), 10);
        }
    }
}