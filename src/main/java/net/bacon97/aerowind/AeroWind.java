package net.bacon97.aerowind;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.bacon97.aerowind.block.ModBlocks;
import net.bacon97.aerowind.block.entity.ModBlockEntities;

@Mod(AeroWind.MOD_ID)
public class AeroWind {
    public static final String MOD_ID = "aerowind";

    // In NeoForge 1.21.1 wird der IEventBus direkt übergeben!
    public AeroWind(IEventBus modEventBus) {

        // Wir übergeben den Bus direkt an die Registrierungen
        ModBlocks.BLOCKS.register(modEventBus);
        ModBlockEntities.BLOCK_ENTITIES.register(modEventBus);
    }
}