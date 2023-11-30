package com.komas19.blockdimensions.world.dimension;

import com.komas19.blockdimensions.BlockDimensions;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.dimension.DimensionTypes;

import java.util.OptionalLong;

public class ModDimensions {
    public static final RegistryKey<DimensionOptions> COMPRESSED_COBBLESTONE_DIMENSION_KEY = RegistryKey.of(RegistryKeys.DIMENSION,
            new Identifier(BlockDimensions.MOD_ID, "compressed_cobblestone_dimension"));
    public static final RegistryKey<World> COMPRESSED_COBBLESTONE_DIMENSION_LEVEL_KEY = RegistryKey.of(RegistryKeys.WORLD,
            new Identifier(BlockDimensions.MOD_ID, "compressed_cobblestone_dimension"));
    public static final RegistryKey<DimensionType> COMPRESSED_COBBLESTONE_DIMENSION_TYPE = RegistryKey.of(RegistryKeys.DIMENSION_TYPE,
            new Identifier(BlockDimensions.MOD_ID, "compressed_cobblestone_dimension_type"));

    public static final RegistryKey<DimensionOptions> COMPRESSED_STONE_DIMENSION_KEY = RegistryKey.of(RegistryKeys.DIMENSION,
            new Identifier(BlockDimensions.MOD_ID, "compressed_stone_dimension"));
    public static final RegistryKey<World> COMPRESSED_STONE_DIMENSION_LEVEL_KEY = RegistryKey.of(RegistryKeys.WORLD,
            new Identifier(BlockDimensions.MOD_ID, "compressed_stone_dimension"));
    public static final RegistryKey<DimensionType> COMPRESSED_STONE_DIMENSION_TYPE = RegistryKey.of(RegistryKeys.DIMENSION_TYPE,
            new Identifier(BlockDimensions.MOD_ID, "compressed_stone_dimension_type"));

    public static final RegistryKey<DimensionOptions> COMPRESSED_DIRT_DIMENSION_KEY = RegistryKey.of(RegistryKeys.DIMENSION,
            new Identifier(BlockDimensions.MOD_ID, "compressed_dirt_dimension"));
    public static final RegistryKey<World> COMPRESSED_DIRT_DIMENSION_LEVEL_KEY = RegistryKey.of(RegistryKeys.WORLD,
            new Identifier(BlockDimensions.MOD_ID, "compressed_dirt_dimension"));
    public static final RegistryKey<DimensionType> COMPRESSED_DIRT_DIMENSION_TYPE = RegistryKey.of(RegistryKeys.DIMENSION_TYPE,
            new Identifier(BlockDimensions.MOD_ID, "compressed_dirt_dimension_type"));
    public static final RegistryKey<DimensionOptions> COMPRESSED_GLASS_DIMENSION_KEY = RegistryKey.of(RegistryKeys.DIMENSION,
            new Identifier(BlockDimensions.MOD_ID, "compressed_glass_dimension"));
    public static final RegistryKey<World> COMPRESSED_GLASS_DIMENSION_LEVEL_KEY = RegistryKey.of(RegistryKeys.WORLD,
            new Identifier(BlockDimensions.MOD_ID, "compressed_glass_dimension"));
    public static final RegistryKey<DimensionType> COMPRESSED_GLASS_DIMENSION_TYPE = RegistryKey.of(RegistryKeys.DIMENSION_TYPE,
            new Identifier(BlockDimensions.MOD_ID, "compressed_glass_dimension_type"));
    public static final RegistryKey<DimensionType> COMPRESSED_CYAN_WOOL_DIMENSION_TYPE = RegistryKey.of(RegistryKeys.DIMENSION_TYPE,
            new Identifier(BlockDimensions.MOD_ID, "compressed_cyan_wool_dimension"));
    public static final RegistryKey<World> COMPRESSED_CYAN_WOOL_DIMENSION_LEVEL_KEY = RegistryKey.of(RegistryKeys.WORLD,
            new Identifier(BlockDimensions.MOD_ID, "compressed_cyan_wool_dimension"));
    public static final RegistryKey<DimensionOptions> COMPRESSED_CYAN_WOOL_DIMENSION_KEY = RegistryKey.of(RegistryKeys.DIMENSION,
            new Identifier(BlockDimensions.MOD_ID, "compressed_cyan_wool_dimension"));

    public static void bootstrapType(Registerable<DimensionType> context) {
        context.register(COMPRESSED_COBBLESTONE_DIMENSION_TYPE, new DimensionType(
                OptionalLong.of(12000), // fixedTime
                false, // hasSkylight
                false, // hasCeiling
                false, // ultraWarm
                true, // natural
                1.0, // coordinateScale
                true, // bedWorks
                false, // respawnAnchorWorks
                0, // minY
                256, // height
                256, // logicalHeight
                BlockTags.INFINIBURN_OVERWORLD, // infiniburn
                DimensionTypes.OVERWORLD_ID, // effectsLocation
                1.0f, // ambientLight
                new DimensionType.MonsterSettings(false, false, UniformIntProvider.create(0, 0), 0)));

        context.register(COMPRESSED_STONE_DIMENSION_TYPE, new DimensionType(
                OptionalLong.of(12000), // fixedTime
                false, // hasSkylight
                false, // hasCeiling
                false, // ultraWarm
                true, // natural
                1.0, // coordinateScale
                true, // bedWorks
                false, // respawnAnchorWorks
                0, // minY
                256, // height
                256, // logicalHeight
                BlockTags.INFINIBURN_OVERWORLD, // infiniburn
                DimensionTypes.OVERWORLD_ID, // effectsLocation
                1.0f, // ambientLight
                new DimensionType.MonsterSettings(false, false, UniformIntProvider.create(0, 0), 0)));

        context.register(COMPRESSED_DIRT_DIMENSION_TYPE, new DimensionType(
                OptionalLong.of(12000), // fixedTime
                false, // hasSkylight
                false, // hasCeiling
                false, // ultraWarm
                true, // natural
                1.0, // coordinateScale
                true, // bedWorks
                false, // respawnAnchorWorks
                0, // minY
                256, // height
                256, // logicalHeight
                BlockTags.INFINIBURN_OVERWORLD, // infiniburn
                DimensionTypes.OVERWORLD_ID, // effectsLocation
                1.0f, // ambientLight
                new DimensionType.MonsterSettings(false, false, UniformIntProvider.create(0, 0), 0)));

        context.register(COMPRESSED_GLASS_DIMENSION_TYPE, new DimensionType(
                OptionalLong.of(12000), // fixedTime
                false, // hasSkylight
                false, // hasCeiling
                false, // ultraWarm
                true, // natural
                1.0, // coordinateScale
                true, // bedWorks
                false, // respawnAnchorWorks
                0, // minY
                256, // height
                256, // logicalHeight
                BlockTags.INFINIBURN_OVERWORLD, // infiniburn
                DimensionTypes.OVERWORLD_ID, // effectsLocation
                1.0f, // ambientLight
                new DimensionType.MonsterSettings(false, false, UniformIntProvider.create(0, 0), 0)));

        context.register(COMPRESSED_CYAN_WOOL_DIMENSION_TYPE, new DimensionType(
                OptionalLong.of(12000), // fixedTime
                false, // hasSkylight
                false, // hasCeiling
                false, // ultraWarm
                true, // natural
                1.0, // coordinateScale
                true, // bedWorks
                false, // respawnAnchorWorks
                0, // minY
                256, // height
                256, // logicalHeight
                BlockTags.INFINIBURN_OVERWORLD, // infiniburn
                DimensionTypes.OVERWORLD_ID, // effectsLocation
                1.0f, // ambientLight
                new DimensionType.MonsterSettings(false, false, UniformIntProvider.create(0, 0), 0)));
    }
}