package com.komas19.blockdimensions;

import com.komas19.blockdimensions.block.ModBlocks;
import com.komas19.blockdimensions.item.ModItems;
import com.komas19.blockdimensions.item.ModItemsGroup;
import com.komas19.blockdimensions.world.gen.ModWorldGeneration;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlockDimensions implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "blockdimensions";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Loading Block Dimensions!");
		ModItemsGroup.registerItemGroups();
        ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModWorldGeneration.generateModWorldGen();

		CustomPortalBuilder.beginPortal()
				.frameBlock(ModBlocks.COMPRESSED_COBBLESTONE)
				.lightWithItem(ModItems.IGNITER)
				.destDimID(new Identifier(BlockDimensions.MOD_ID, "compressed_cobblestone_dimension"))
				.tintColor(0xf2f3f4)
				.registerPortal();

		CustomPortalBuilder.beginPortal()
				.frameBlock(ModBlocks.COMPRESSED_STONE)
				.lightWithItem(ModItems.IGNITER)
				.destDimID(new Identifier(BlockDimensions.MOD_ID, "compressed_stone_dimension"))
				.tintColor(0xe5e7e9)
				.registerPortal();

		CustomPortalBuilder.beginPortal()
				.frameBlock(ModBlocks.COMPRESSED_DIRT)
				.lightWithItem(ModItems.IGNITER)
				.destDimID(new Identifier(BlockDimensions.MOD_ID, "compressed_dirt_dimension"))
				.tintColor(0xfaf5ef)
				.registerPortal();
		CustomPortalBuilder.beginPortal()
				.frameBlock(ModBlocks.COMPRESSED_GLASS)
				.lightWithItem(ModItems.IGNITER)
				.destDimID(new Identifier(BlockDimensions.MOD_ID, "compressed_glass_dimension"))
				.tintColor(0xfaf5ef)
				.registerPortal();
		CustomPortalBuilder.beginPortal()
				.frameBlock(ModBlocks.COMPRESSED_CYAN_WOOL)
				.lightWithItem(ModItems.IGNITER)
				.destDimID(new Identifier(BlockDimensions.MOD_ID, "compressed_cyan_wool_dimension"))
				.tintColor(0xfaf5ef)
				.registerPortal();
	}
}