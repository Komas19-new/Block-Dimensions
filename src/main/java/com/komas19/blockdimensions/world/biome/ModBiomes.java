package com.komas19.blockdimensions.world.biome;

import com.komas19.blockdimensions.BlockDimensions;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;

public class ModBiomes {
    public static final RegistryKey<Biome> COMPRESSED_COBBLESTONE_BIOME = RegistryKey.of(RegistryKeys.BIOME,
            new Identifier(BlockDimensions.MOD_ID, "compressed_cobblestone_biome"));
    public static final RegistryKey<Biome> COMPRESSED_STONE_BIOME = RegistryKey.of(RegistryKeys.BIOME,
            new Identifier(BlockDimensions.MOD_ID, "compressed_stone_biome"));
    public static final RegistryKey<Biome> COMPRESSED_DIRT_BIOME = RegistryKey.of(RegistryKeys.BIOME,
            new Identifier(BlockDimensions.MOD_ID, "compressed_dirt_biome"));
    public static final RegistryKey<Biome> COMPRESSED_GLASS_BIOME = RegistryKey.of(RegistryKeys.BIOME,
            new Identifier(BlockDimensions.MOD_ID, "compressed_glass_biome"));
    public static final RegistryKey<Biome> COMPRESSED_CYAN_WOOL_BIOME = RegistryKey.of(RegistryKeys.BIOME,
            new Identifier(BlockDimensions.MOD_ID, "compressed_cyan_wool_biome"));

    public static void boostrap(Registerable<Biome> context) {
        context.register(COMPRESSED_COBBLESTONE_BIOME, biome(context));
        context.register(COMPRESSED_STONE_BIOME, biome(context));
        context.register(COMPRESSED_DIRT_BIOME, biome(context));
        context.register(COMPRESSED_GLASS_BIOME, biome(context));
        context.register(COMPRESSED_CYAN_WOOL_BIOME, biome(context));
    }

    public static void globalOverworldGeneration(GenerationSettings.LookupBackedBuilder builder) {
        DefaultBiomeFeatures.addLandCarvers(builder);
        DefaultBiomeFeatures.addAmethystGeodes(builder);
        DefaultBiomeFeatures.addDungeons(builder);
        DefaultBiomeFeatures.addMineables(builder);
        DefaultBiomeFeatures.addSprings(builder);
        DefaultBiomeFeatures.addFrozenTopLayer(builder);
    }

    public static Biome biome(Registerable<Biome> context) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();

        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));

        globalOverworldGeneration(biomeBuilder);

        return new Biome.Builder()
                .precipitation(true)
                .downfall(0.4f)
                .temperature(0.7f)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .effects((new BiomeEffects.Builder())
                        .waterColor(0xe82e3b)
                        .waterFogColor(0xbf1b26)
                        .skyColor(0x30c918)
                        .grassColor(0x7f03fc)
                        .foliageColor(0xd203fc)
                        .fogColor(0x22a1e6)
                        .moodSound(BiomeMoodSound.CAVE)
                        .build())
                .build();
    }
}