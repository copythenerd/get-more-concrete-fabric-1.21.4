package com.copythenerd.getmoreconcrete.block;

import com.copythenerd.getmoreconcrete.GetMoreConcrete;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ConcreteBlocks {
    // Helper methode for stairs registry
    public static Block registerConcreteStairs(String name, Block block) {
        return registerBlock(name,
                new StairsBlock(block.getDefaultState(), AbstractBlock.Settings.create()
                        .strength(1.8F, 1.8F)
                        .requiresTool()
                        .instrument(NoteBlockInstrument.BASEDRUM)
                        .sounds(BlockSoundGroup.STONE)
                        .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GetMoreConcrete.MOD_ID, name)))));
    }

    // Helper methode for slab registry
    public static Block registerConcreteSlab(String name) {
        return registerBlock(name,
                new SlabBlock(AbstractBlock.Settings.create()
                        .strength(2.0F,1.8F)
                        .requiresTool()
                        .instrument(NoteBlockInstrument.BASEDRUM)
                        .sounds(BlockSoundGroup.STONE)
                        .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GetMoreConcrete.MOD_ID, name)))));
    }

    // Helper methode for wall registry
    public static Block registerConcreteWall(String name) {
        return registerBlock(name,
                new WallBlock(AbstractBlock.Settings.create()
                        .strength(1.8F, 1.8F)
                        .requiresTool()
                        .instrument(NoteBlockInstrument.BASEDRUM)
                        .sounds(BlockSoundGroup.STONE)
                        .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GetMoreConcrete.MOD_ID, name)))));
    }

    // Register Stairs

    public static final Block WHITE_CONCRETE_STAIRS = registerConcreteStairs("white_concrete_stairs", Blocks.WHITE_CONCRETE);
    public static final Block ORANGE_CONCRETE_STAIRS = registerConcreteStairs("orange_concrete_stairs", Blocks.ORANGE_CONCRETE);
    public static final Block MAGENTA_CONCRETE_STAIRS = registerConcreteStairs("magenta_concrete_stairs", Blocks.MAGENTA_CONCRETE);
    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = registerConcreteStairs("light_blue_concrete_stairs", Blocks.LIGHT_BLUE_CONCRETE);
    public static final Block YELLOW_CONCRETE_STAIRS = registerConcreteStairs("yellow_concrete_stairs", Blocks.YELLOW_CONCRETE);
    public static final Block LIME_CONCRETE_STAIRS = registerConcreteStairs("lime_concrete_stairs", Blocks.LIME_CONCRETE);
    public static final Block PINK_CONCRETE_STAIRS = registerConcreteStairs("pink_concrete_stairs", Blocks.PINK_CONCRETE);
    public static final Block GRAY_CONCRETE_STAIRS = registerConcreteStairs("gray_concrete_stairs", Blocks.GRAY_CONCRETE);
    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = registerConcreteStairs("light_gray_concrete_stairs", Blocks.LIGHT_GRAY_CONCRETE);
    public static final Block CYAN_CONCRETE_STAIRS = registerConcreteStairs("cyan_concrete_stairs", Blocks.CYAN_CONCRETE);
    public static final Block PURPLE_CONCRETE_STAIRS = registerConcreteStairs("purple_concrete_stairs", Blocks.PURPLE_CONCRETE);
    public static final Block BLUE_CONCRETE_STAIRS = registerConcreteStairs("blue_concrete_stairs", Blocks.BLUE_CONCRETE);
    public static final Block BROWN_CONCRETE_STAIRS = registerConcreteStairs("brown_concrete_stairs", Blocks.BROWN_CONCRETE);
    public static final Block GREEN_CONCRETE_STAIRS = registerConcreteStairs("green_concrete_stairs", Blocks.GREEN_CONCRETE);
    public static final Block RED_CONCRETE_STAIRS = registerConcreteStairs("red_concrete_stairs", Blocks.RED_CONCRETE);
    public static final Block BLACK_CONCRETE_STAIRS = registerConcreteStairs("black_concrete_stairs", Blocks.BLACK_CONCRETE);

    // Register Slabs
    public static final Block WHITE_CONCRETE_SLAB = registerConcreteSlab("white_concrete_slab");
    public static final Block ORANGE_CONCRETE_SLAB = registerConcreteSlab("orange_concrete_slab");
    public static final Block MAGENTA_CONCRETE_SLAB = registerConcreteSlab("magenta_concrete_slab");
    public static final Block LIGHT_BLUE_CONCRETE_SLAB = registerConcreteSlab("light_blue_concrete_slab");
    public static final Block YELLOW_CONCRETE_SLAB = registerConcreteSlab("yellow_concrete_slab");
    public static final Block LIME_CONCRETE_SLAB = registerConcreteSlab("lime_concrete_slab");
    public static final Block PINK_CONCRETE_SLAB = registerConcreteSlab("pink_concrete_slab");
    public static final Block GRAY_CONCRETE_SLAB = registerConcreteSlab("gray_concrete_slab");
    public static final Block LIGHT_GRAY_CONCRETE_SLAB = registerConcreteSlab("light_gray_concrete_slab");
    public static final Block CYAN_CONCRETE_SLAB = registerConcreteSlab("cyan_concrete_slab");
    public static final Block PURPLE_CONCRETE_SLAB = registerConcreteSlab("purple_concrete_slab");
    public static final Block BLUE_CONCRETE_SLAB = registerConcreteSlab("blue_concrete_slab");
    public static final Block BROWN_CONCRETE_SLAB = registerConcreteSlab("brown_concrete_slab");
    public static final Block GREEN_CONCRETE_SLAB = registerConcreteSlab("green_concrete_slab");
    public static final Block RED_CONCRETE_SLAB = registerConcreteSlab("red_concrete_slab");
    public static final Block BLACK_CONCRETE_SLAB = registerConcreteSlab("black_concrete_slab");

    // Register Walls
    public static final Block WHITE_CONCRETE_WALL = registerConcreteWall("white_concrete_wall");
    public static final Block ORANGE_CONCRETE_WALL = registerConcreteWall("orange_concrete_wall");
    public static final Block MAGENTA_CONCRETE_WALL = registerConcreteWall("magenta_concrete_wall");
    public static final Block LIGHT_BLUE_CONCRETE_WALL = registerConcreteWall("light_blue_concrete_wall");
    public static final Block YELLOW_CONCRETE_WALL = registerConcreteWall("yellow_concrete_wall");
    public static final Block LIME_CONCRETE_WALL = registerConcreteWall("lime_concrete_wall");
    public static final Block PINK_CONCRETE_WALL = registerConcreteWall("pink_concrete_wall");
    public static final Block GRAY_CONCRETE_WALL = registerConcreteWall("gray_concrete_wall");
    public static final Block LIGHT_GRAY_CONCRETE_WALL = registerConcreteWall("light_gray_concrete_wall");
    public static final Block CYAN_CONCRETE_WALL = registerConcreteWall("cyan_concrete_wall");
    public static final Block PURPLE_CONCRETE_WALL = registerConcreteWall("purple_concrete_wall");
    public static final Block BLUE_CONCRETE_WALL = registerConcreteWall("blue_concrete_wall");
    public static final Block BROWN_CONCRETE_WALL = registerConcreteWall("brown_concrete_wall");
    public static final Block GREEN_CONCRETE_WALL = registerConcreteWall("green_concrete_wall");
    public static final Block RED_CONCRETE_WALL = registerConcreteWall("red_concrete_wall");
    public static final Block BLACK_CONCRETE_WALL = registerConcreteWall("black_concrete_wall");

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(GetMoreConcrete.MOD_ID, name), block);
    }

    // Register Block Item
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(GetMoreConcrete.MOD_ID, name),
                new BlockItem(block, new Item.Settings()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(GetMoreConcrete.MOD_ID, name))).useBlockPrefixedTranslationKey()));
    }

    public static void registerConcreteBlocks() {
        GetMoreConcrete.LOGGER.info("Registering Mod Items for " + GetMoreConcrete.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(entries -> {
            entries.addAfter(Items.WHITE_CONCRETE, ConcreteBlocks.WHITE_CONCRETE_STAIRS);
            entries.addAfter(ConcreteBlocks.WHITE_CONCRETE_STAIRS, ConcreteBlocks.WHITE_CONCRETE_SLAB);
            entries.addAfter(ConcreteBlocks.WHITE_CONCRETE_SLAB, ConcreteBlocks.WHITE_CONCRETE_WALL);

            entries.addAfter(Items.ORANGE_CONCRETE, ConcreteBlocks.ORANGE_CONCRETE_STAIRS);
            entries.addAfter(ConcreteBlocks.ORANGE_CONCRETE_STAIRS, ConcreteBlocks.ORANGE_CONCRETE_SLAB);
            entries.addAfter(ConcreteBlocks.ORANGE_CONCRETE_SLAB, ConcreteBlocks.ORANGE_CONCRETE_WALL);

            entries.addAfter(Items.MAGENTA_CONCRETE, ConcreteBlocks.MAGENTA_CONCRETE_STAIRS);
            entries.addAfter(ConcreteBlocks.MAGENTA_CONCRETE_STAIRS, ConcreteBlocks.MAGENTA_CONCRETE_SLAB);
            entries.addAfter(ConcreteBlocks.MAGENTA_CONCRETE_SLAB, ConcreteBlocks.MAGENTA_CONCRETE_WALL);

            entries.addAfter(Items.LIGHT_BLUE_CONCRETE, ConcreteBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
            entries.addAfter(ConcreteBlocks.LIGHT_BLUE_CONCRETE_STAIRS, ConcreteBlocks.LIGHT_BLUE_CONCRETE_SLAB);
            entries.addAfter(ConcreteBlocks.LIGHT_BLUE_CONCRETE_SLAB, ConcreteBlocks.LIGHT_BLUE_CONCRETE_WALL);

            entries.addAfter(Items.YELLOW_CONCRETE, ConcreteBlocks.YELLOW_CONCRETE_STAIRS);
            entries.addAfter(ConcreteBlocks.YELLOW_CONCRETE_STAIRS, ConcreteBlocks.YELLOW_CONCRETE_SLAB);
            entries.addAfter(ConcreteBlocks.YELLOW_CONCRETE_SLAB, ConcreteBlocks.YELLOW_CONCRETE_WALL);

            entries.addAfter(Items.LIME_CONCRETE, ConcreteBlocks.LIME_CONCRETE_STAIRS);
            entries.addAfter(ConcreteBlocks.LIME_CONCRETE_STAIRS, ConcreteBlocks.LIME_CONCRETE_SLAB);
            entries.addAfter(ConcreteBlocks.LIME_CONCRETE_SLAB, ConcreteBlocks.LIME_CONCRETE_WALL);

            entries.addAfter(Items.PINK_CONCRETE, ConcreteBlocks.PINK_CONCRETE_STAIRS);
            entries.addAfter(ConcreteBlocks.PINK_CONCRETE_STAIRS, ConcreteBlocks.PINK_CONCRETE_SLAB);
            entries.addAfter(ConcreteBlocks.PINK_CONCRETE_SLAB, ConcreteBlocks.PINK_CONCRETE_WALL);

            entries.addAfter(Items.GRAY_CONCRETE, ConcreteBlocks.GRAY_CONCRETE_STAIRS);
            entries.addAfter(ConcreteBlocks.GRAY_CONCRETE_STAIRS, ConcreteBlocks.GRAY_CONCRETE_SLAB);
            entries.addAfter(ConcreteBlocks.GRAY_CONCRETE_SLAB, ConcreteBlocks.GRAY_CONCRETE_WALL);

            entries.addAfter(Items.LIGHT_GRAY_CONCRETE, ConcreteBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
            entries.addAfter(ConcreteBlocks.LIGHT_GRAY_CONCRETE_STAIRS, ConcreteBlocks.LIGHT_GRAY_CONCRETE_SLAB);
            entries.addAfter(ConcreteBlocks.LIGHT_GRAY_CONCRETE_SLAB, ConcreteBlocks.LIGHT_GRAY_CONCRETE_WALL);

            entries.addAfter(Items.CYAN_CONCRETE, ConcreteBlocks.CYAN_CONCRETE_STAIRS);
            entries.addAfter(ConcreteBlocks.CYAN_CONCRETE_STAIRS, ConcreteBlocks.CYAN_CONCRETE_SLAB);
            entries.addAfter(ConcreteBlocks.CYAN_CONCRETE_SLAB, ConcreteBlocks.CYAN_CONCRETE_WALL);

            entries.addAfter(Items.PURPLE_CONCRETE, ConcreteBlocks.PURPLE_CONCRETE_STAIRS);
            entries.addAfter(ConcreteBlocks.PURPLE_CONCRETE_STAIRS, ConcreteBlocks.PURPLE_CONCRETE_SLAB);
            entries.addAfter(ConcreteBlocks.PURPLE_CONCRETE_SLAB, ConcreteBlocks.PURPLE_CONCRETE_WALL);

            entries.addAfter(Items.BLUE_CONCRETE, ConcreteBlocks.BLUE_CONCRETE_STAIRS);
            entries.addAfter(ConcreteBlocks.BLUE_CONCRETE_STAIRS, ConcreteBlocks.BLUE_CONCRETE_SLAB);
            entries.addAfter(ConcreteBlocks.BLUE_CONCRETE_SLAB, ConcreteBlocks.BLUE_CONCRETE_WALL);

            entries.addAfter(Items.BROWN_CONCRETE, ConcreteBlocks.BROWN_CONCRETE_STAIRS);
            entries.addAfter(ConcreteBlocks.BROWN_CONCRETE_STAIRS, ConcreteBlocks.BROWN_CONCRETE_SLAB);
            entries.addAfter(ConcreteBlocks.BROWN_CONCRETE_SLAB, ConcreteBlocks.BROWN_CONCRETE_WALL);

            entries.addAfter(Items.GREEN_CONCRETE, ConcreteBlocks.GREEN_CONCRETE_STAIRS);
            entries.addAfter(ConcreteBlocks.GREEN_CONCRETE_STAIRS, ConcreteBlocks.GREEN_CONCRETE_SLAB);
            entries.addAfter(ConcreteBlocks.GREEN_CONCRETE_SLAB, ConcreteBlocks.GREEN_CONCRETE_WALL);

            entries.addAfter(Items.RED_CONCRETE, ConcreteBlocks.RED_CONCRETE_STAIRS);
            entries.addAfter(ConcreteBlocks.RED_CONCRETE_STAIRS, ConcreteBlocks.RED_CONCRETE_SLAB);
            entries.addAfter(ConcreteBlocks.RED_CONCRETE_SLAB, ConcreteBlocks.RED_CONCRETE_WALL);

            entries.addAfter(Items.BLACK_CONCRETE, ConcreteBlocks.BLACK_CONCRETE_STAIRS);
            entries.addAfter(ConcreteBlocks.BLACK_CONCRETE_STAIRS, ConcreteBlocks.BLACK_CONCRETE_SLAB);
            entries.addAfter(ConcreteBlocks.BLACK_CONCRETE_SLAB, ConcreteBlocks.BLACK_CONCRETE_WALL);
        });
    }


}
