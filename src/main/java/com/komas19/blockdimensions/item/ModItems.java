package com.komas19.blockdimensions.item;

import com.komas19.blockdimensions.BlockDimensions;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item IGNITER = registerItem("portal_igniter", new Item(new FabricItemSettings()));
    public static final Item IGNITING = registerItem("igniting", new Item(new FabricItemSettings()));

    private static void addItemToSearchItemGroup(FabricItemGroupEntries entries) {

        entries.add(IGNITER);
        entries.add(IGNITING);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BlockDimensions.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BlockDimensions.LOGGER.info("Registering mod items for " + BlockDimensions.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SEARCH).register(ModItems::addItemToSearchItemGroup);
    }
}
