package com.copythenerd.getmoreconcrete.datagen;

import com.copythenerd.getmoreconcrete.block.ConcreteBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ConcreteBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ConcreteBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }
    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
        .add(ConcreteBlocks.WHITE_CONCRETE_STAIRS)
        .add(ConcreteBlocks.ORANGE_CONCRETE_STAIRS)
        .add(ConcreteBlocks.MAGENTA_CONCRETE_STAIRS)
        .add(ConcreteBlocks.LIGHT_BLUE_CONCRETE_STAIRS)
        .add(ConcreteBlocks.YELLOW_CONCRETE_STAIRS)
        .add(ConcreteBlocks.LIME_CONCRETE_STAIRS)
        .add(ConcreteBlocks.PINK_CONCRETE_STAIRS)
        .add(ConcreteBlocks.GRAY_CONCRETE_STAIRS)
        .add(ConcreteBlocks.LIGHT_GRAY_CONCRETE_STAIRS)
        .add(ConcreteBlocks.CYAN_CONCRETE_STAIRS)
        .add(ConcreteBlocks.PURPLE_CONCRETE_STAIRS)
        .add(ConcreteBlocks.BLUE_CONCRETE_STAIRS)
        .add(ConcreteBlocks.BROWN_CONCRETE_STAIRS)
        .add(ConcreteBlocks.GREEN_CONCRETE_STAIRS)
        .add(ConcreteBlocks.RED_CONCRETE_STAIRS)
        .add(ConcreteBlocks.BLACK_CONCRETE_STAIRS)

        .add(ConcreteBlocks.WHITE_CONCRETE_SLAB)
        .add(ConcreteBlocks.ORANGE_CONCRETE_SLAB)
        .add(ConcreteBlocks.MAGENTA_CONCRETE_SLAB)
        .add(ConcreteBlocks.LIGHT_BLUE_CONCRETE_SLAB)
        .add(ConcreteBlocks.YELLOW_CONCRETE_SLAB)
        .add(ConcreteBlocks.LIME_CONCRETE_SLAB)
        .add(ConcreteBlocks.PINK_CONCRETE_SLAB)
        .add(ConcreteBlocks.GRAY_CONCRETE_SLAB)
        .add(ConcreteBlocks.LIGHT_GRAY_CONCRETE_SLAB)
        .add(ConcreteBlocks.CYAN_CONCRETE_SLAB)
        .add(ConcreteBlocks.PURPLE_CONCRETE_SLAB)
        .add(ConcreteBlocks.BLUE_CONCRETE_SLAB)
        .add(ConcreteBlocks.BROWN_CONCRETE_SLAB)
        .add(ConcreteBlocks.GREEN_CONCRETE_SLAB)
        .add(ConcreteBlocks.RED_CONCRETE_SLAB)
        .add(ConcreteBlocks.BLACK_CONCRETE_SLAB);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ConcreteBlocks.WHITE_CONCRETE_WALL)
                .add(ConcreteBlocks.ORANGE_CONCRETE_WALL)
                .add(ConcreteBlocks.MAGENTA_CONCRETE_WALL)
                .add(ConcreteBlocks.LIGHT_BLUE_CONCRETE_WALL)
                .add(ConcreteBlocks.YELLOW_CONCRETE_WALL)
                .add(ConcreteBlocks.LIME_CONCRETE_WALL)
                .add(ConcreteBlocks.PINK_CONCRETE_WALL)
                .add(ConcreteBlocks.GRAY_CONCRETE_WALL)
                .add(ConcreteBlocks.LIGHT_GRAY_CONCRETE_WALL)
                .add(ConcreteBlocks.CYAN_CONCRETE_WALL)
                .add(ConcreteBlocks.PURPLE_CONCRETE_WALL)
                .add(ConcreteBlocks.BLUE_CONCRETE_WALL)
                .add(ConcreteBlocks.BROWN_CONCRETE_WALL)
                .add(ConcreteBlocks.GREEN_CONCRETE_WALL)
                .add(ConcreteBlocks.RED_CONCRETE_WALL)
                .add(ConcreteBlocks.BLACK_CONCRETE_WALL);
    }
}
