package com.komas19.blockdimensions.block;

import com.komas19.blockdimensions.BlockDimensions;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block HI = registerBlock("hi", new Block(FabricBlockSettings.copyOf(Blocks.BEDROCK)));
    public static final Block IGNITING_ORE = registerBlock("igniting_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE).strength(2.0f), UniformIntProvider.create(2, 5)));
    public static final Block COMPRESSED_STONE = registerBlock("compressed_stone", new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(3.0f, 12.0f)));
    public static final Block COMPRESSED_COBBLESTONE = registerBlock("compressed_cobblestone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).strength(4.0f, 12.0f)));
    public static final Block COMPRESSED_COAL_ORE = registerBlock("compressed_coal_ore", new Block(FabricBlockSettings.copyOf(Blocks.COAL_ORE).strength(6.0f, 6.0f)));
    public static final Block COMPRESSED_CYAN_WOOL = registerBlock("compressed_cyan_wool", new Block(FabricBlockSettings.copyOf(Blocks.CYAN_WOOL).strength(1.6f)));
    public static final Block COMPRESSED_DIRT = registerBlock("compressed_dirt", new Block(FabricBlockSettings.copyOf(Blocks.DIRT).strength(1.0f, 1.0f)));
    public static final Block COMPRESSED_GLASS = registerBlock("compressed_glass", new Block(FabricBlockSettings.copyOf(Blocks.GLASS).strength(0.6f, 0.6f)));
    public static final Block COMPRESSED_GRAVEL = registerBlock("compressed_gravel", new Block(FabricBlockSettings.copyOf(Blocks.GRAVEL).strength(1.2f, 1.2f)));
    public static final Block COMPRESSED_SAND = registerBlock("compressed_sand", new Block(FabricBlockSettings.copyOf(Blocks.SAND).strength(1.0f, 1.0f)));
    public static final Block COMPRESSED_SPONGE = registerBlock("compressed_sponge", new Block(FabricBlockSettings.copyOf(Blocks.SPONGE).strength(1.2f, 1.2f)));
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
