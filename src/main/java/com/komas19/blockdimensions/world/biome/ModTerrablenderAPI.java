package com.komas19.blockdimensions.world.biome;

import com.komas19.blockdimensions.BlockDimensions;
import com.komas19.blockdimensions.world.biome.surface.ModMaterialRules;
import net.minecraft.util.Identifier;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class ModTerrablenderAPI implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new ModOverworldRegion(new Identifier(BlockDimensions.MOD_ID, "overworld"), 4));

        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, BlockDimensions.MOD_ID, ModMaterialRules.makeRules());
    }
}