package com.komas19.blockdimensions.item;

import com.komas19.blockdimensions.BlockDimensions;
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

    }).build());
    public static void registerItemGroups() {
        BlockDimensions.LOGGER.info("Registering Item Groups for " + BlockDimensions.MOD_ID);
    }
}