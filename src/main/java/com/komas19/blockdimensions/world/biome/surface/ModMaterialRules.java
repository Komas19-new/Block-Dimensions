package com.komas19.blockdimensions.world.biome.surface;

import com.komas19.blockdimensions.block.ModBlocks;
import com.komas19.blockdimensions.world.biome.ModBiomes;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;

public class ModMaterialRules {
    private static final MaterialRules.MaterialRule DIRT = makeStateRule(Blocks.DIRT);
    private static final MaterialRules.MaterialRule GRASS_BLOCK = makeStateRule(Blocks.GRASS_BLOCK);
    private static final MaterialRules.MaterialRule COBBLESTONE = makeStateRule(Blocks.COBBLESTONE);
    private static final MaterialRules.MaterialRule COMPRESSED_COBBLESTONE = makeStateRule(ModBlocks.COMPRESSED_COBBLESTONE);
    private static final MaterialRules.MaterialRule STONE = makeStateRule(Blocks.STONE);
    private static final MaterialRules.MaterialRule COMPRESSED_STONE = makeStateRule(ModBlocks.COMPRESSED_STONE);
    private static final MaterialRules.MaterialRule COMPRESSED_DIRT = makeStateRule(ModBlocks.COMPRESSED_DIRT);
    private static final MaterialRules.MaterialRule GLASS = makeStateRule(Blocks.GLASS);
    private static final MaterialRules.MaterialRule COMPRESSED_GLASS = makeStateRule(ModBlocks.COMPRESSED_GLASS);
    private static final MaterialRules.MaterialRule CYAN_WOOL = makeStateRule(Blocks.CYAN_WOOL);
    private static final MaterialRules.MaterialRule COMPRESSED_CYAN_WOOL = makeStateRule(ModBlocks.COMPRESSED_CYAN_WOOL);

    public static MaterialRules.MaterialRule makeRules() {
        MaterialRules.MaterialCondition isAtOrAboveWaterLevel = MaterialRules.water(-1, 0);

        MaterialRules.MaterialRule grassSurface = MaterialRules.sequence(MaterialRules.condition(isAtOrAboveWaterLevel, GRASS_BLOCK), DIRT);

        return MaterialRules.sequence(
                MaterialRules.sequence(MaterialRules.condition(MaterialRules.biome(ModBiomes.COMPRESSED_COBBLESTONE_BIOME),
                                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, COMPRESSED_COBBLESTONE)),
                        MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, COBBLESTONE)),

                MaterialRules.sequence(MaterialRules.condition(MaterialRules.biome(ModBiomes.COMPRESSED_STONE_BIOME),
                                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, COMPRESSED_STONE)),
                        MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, STONE)),

                MaterialRules.sequence(MaterialRules.condition(MaterialRules.biome(ModBiomes.COMPRESSED_DIRT_BIOME),
                                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, COMPRESSED_DIRT)),
                        MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, DIRT)),

                MaterialRules.sequence(MaterialRules.condition(MaterialRules.biome(ModBiomes.COMPRESSED_GLASS_BIOME),
                                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, COMPRESSED_GLASS)),
                        MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, GLASS)),
                MaterialRules.sequence(MaterialRules.condition(MaterialRules.biome(ModBiomes.COMPRESSED_CYAN_WOOL_BIOME),
                                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, COMPRESSED_CYAN_WOOL)),
                        MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, CYAN_WOOL)),

                // Default to a grass and dirt surface
                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, grassSurface)
        );
    }

    private static MaterialRules.MaterialRule makeStateRule(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }
}