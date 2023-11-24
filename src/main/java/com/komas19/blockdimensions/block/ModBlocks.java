package com.komas19.blockdimensions.block;

import com.komas19.blockdimensions.BlockDimensions;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block COMPRESSED_STONE = registerBlock("compressed_stone", new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(3.0f, 12.0f)));
    public static final Block COMPRESSED_COBBLESTONE = registerBlock("compressed_cobblestone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).strength(4.0f, 12.0f)));
    public static final Block COMPRESSED_COAL_ORE = registerBlock("compressed_coal_ore", new Block(FabricBlockSettings.copyOf(Blocks.COAL_ORE).strength(6.0f, 6.0f)));
    private static Block registerBlock(String name, Block block) {
        registerItemBlock(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(BlockDimensions.MOD_ID, name), block);
    }
    private static Item registerItemBlock(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(BlockDimensions.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        BlockDimensions.LOGGER.info("Registering mod blocks for " + BlockDimensions.MOD_ID);
    }
}
