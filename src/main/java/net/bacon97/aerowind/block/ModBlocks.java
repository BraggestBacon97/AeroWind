package net.bacon97.aerowind.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import static net.bacon97.aerowind.AeroWind.MOD_ID;

public class ModBlocks {
    // Hier erstellen wir nur die Registry, die .register() Methode passiert jetzt in der AeroWind Klasse
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);

    public static final DeferredBlock<Block> ANEMOMETER = BLOCKS.register("anemometer",
            () -> new AnemometerBlock(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion()));
}