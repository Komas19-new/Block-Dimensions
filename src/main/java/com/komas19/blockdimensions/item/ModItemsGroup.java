package com.komas19.blockdimensions.item;

import com.komas19.blockdimensions.BlockDimensions;
import com.komas19.blockdimensions.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemsGroup {

    public static final ItemGroup BLOCK_DIMENSIONS = Registry.register(Registries.ITEM_GROUP, new Identifier(BlockDimensions.MOD_ID, "portal_igniter"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.blockdimensions")).icon(() -> new ItemStack(ModItems.IGNITER)).entries((displayContext, entries) -> {
        entries.add(ModItems.IGNITER);
        entries.add(ModItems.IGNITING);

        entries.add(ModBlocks.IGNITING_ORE);
        entries.add(ModBlocks.COMPRESSED_STONE);
        entries.add(ModBlocks.COMPRESSED_COBBLESTONE);
        entries.add(ModBlocks.COMPRESSED_COAL_ORE);
        entries.add(ModBlocks.COMPRESSED_CYAN_WOOL);
        entries.add(ModBlocks.COMPRESSED_DIRT);
        entries.add(ModBlocks.COMPRESSED_GLASS);
        entries.add(ModBlocks.COMPRESSED_GRAVEL);
        entries.add(ModBlocks.COMPRESSED_SAND);

    }).build());
    public static void registerItemGroups() {
        BlockDimensions.LOGGER.info("Registering Item Groups for " + BlockDimensions.MOD_ID);
    }
}
