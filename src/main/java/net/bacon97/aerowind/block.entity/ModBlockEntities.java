package net.bacon97.aerowind.block.entity;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.bacon97.aerowind.block.ModBlocks;

import java.util.function.Supplier;

import static net.bacon97.aerowind.AeroWind.MOD_ID;

public class ModBlockEntities {
    // Auch hier nur die Registry
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, MOD_ID);

    public static final Supplier<BlockEntityType<AnemometerBlockEntity>> ANEMOMETER_BE = BLOCK_ENTITIES.register("anemometer_be",
            () -> BlockEntityType.Builder.of(AnemometerBlockEntity::new, ModBlocks.ANEMOMETER.get()).build(null));
}