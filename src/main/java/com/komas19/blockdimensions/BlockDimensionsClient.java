package com.komas19.blockdimensions;

import net.fabricmc.api.ClientModInitializer;
import com.komas19.blockdimensions.block.ModBlocks;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class BlockDimensionsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COMPRESSED_GLASS, RenderLayer.getCutout());
    }
}
