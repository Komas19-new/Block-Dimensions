package com.komas19.blockdimensions.world.gen;

import com.komas19.blockdimensions.BlockDimensions;

public class ModWorldGeneration {
    public static void generateModWorldGen() {
        ModOreGeneration.generateOres();
        BlockDimensions.LOGGER.info("Generating ores... (" + BlockDimensions.MOD_ID + ")");
    }
}
