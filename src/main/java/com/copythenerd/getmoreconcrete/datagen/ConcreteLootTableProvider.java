package com.copythenerd.getmoreconcrete.datagen;

import com.copythenerd.getmoreconcrete.block.ConcreteBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ConcreteLootTableProvider extends FabricBlockLootTableProvider {
    public ConcreteLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ConcreteBlocks.WHITE_CONCRETE_STAIRS);
        addDrop(ConcreteBlocks.ORANGE_CONCRETE_STAIRS);
        addDrop(ConcreteBlocks.MAGENTA_CONCRETE_STAIRS);
        addDrop(ConcreteBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        addDrop(ConcreteBlocks.YELLOW_CONCRETE_STAIRS);
        addDrop(ConcreteBlocks.LIME_CONCRETE_STAIRS);
        addDrop(ConcreteBlocks.PINK_CONCRETE_STAIRS);
        addDrop(ConcreteBlocks.GRAY_CONCRETE_STAIRS);
        addDrop(ConcreteBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        addDrop(ConcreteBlocks.CYAN_CONCRETE_STAIRS);
        addDrop(ConcreteBlocks.PURPLE_CONCRETE_STAIRS);
        addDrop(ConcreteBlocks.BLUE_CONCRETE_STAIRS);
        addDrop(ConcreteBlocks.BROWN_CONCRETE_STAIRS);
        addDrop(ConcreteBlocks.GREEN_CONCRETE_STAIRS);
        addDrop(ConcreteBlocks.RED_CONCRETE_STAIRS);
        addDrop(ConcreteBlocks.BLACK_CONCRETE_STAIRS);

        addDrop(ConcreteBlocks.WHITE_CONCRETE_SLAB, slabDrops(ConcreteBlocks.WHITE_CONCRETE_SLAB));
        addDrop(ConcreteBlocks.ORANGE_CONCRETE_SLAB, slabDrops(ConcreteBlocks.ORANGE_CONCRETE_SLAB));
        addDrop(ConcreteBlocks.MAGENTA_CONCRETE_SLAB, slabDrops(ConcreteBlocks.MAGENTA_CONCRETE_SLAB));
        addDrop(ConcreteBlocks.LIGHT_BLUE_CONCRETE_SLAB, slabDrops(ConcreteBlocks.LIGHT_BLUE_CONCRETE_SLAB));
        addDrop(ConcreteBlocks.YELLOW_CONCRETE_SLAB, slabDrops(ConcreteBlocks.YELLOW_CONCRETE_SLAB));
        addDrop(ConcreteBlocks.LIME_CONCRETE_SLAB, slabDrops(ConcreteBlocks.LIME_CONCRETE_SLAB));
        addDrop(ConcreteBlocks.PINK_CONCRETE_SLAB, slabDrops(ConcreteBlocks.PINK_CONCRETE_SLAB));
        addDrop(ConcreteBlocks.GRAY_CONCRETE_SLAB, slabDrops(ConcreteBlocks.GRAY_CONCRETE_SLAB));
        addDrop(ConcreteBlocks.LIGHT_GRAY_CONCRETE_SLAB, slabDrops(ConcreteBlocks.LIGHT_GRAY_CONCRETE_SLAB));
        addDrop(ConcreteBlocks.CYAN_CONCRETE_SLAB, slabDrops(ConcreteBlocks.CYAN_CONCRETE_SLAB));
        addDrop(ConcreteBlocks.PURPLE_CONCRETE_SLAB, slabDrops(ConcreteBlocks.PURPLE_CONCRETE_SLAB));
        addDrop(ConcreteBlocks.BLUE_CONCRETE_SLAB, slabDrops(ConcreteBlocks.BLUE_CONCRETE_SLAB));
        addDrop(ConcreteBlocks.BROWN_CONCRETE_SLAB, slabDrops(ConcreteBlocks.BROWN_CONCRETE_SLAB));
        addDrop(ConcreteBlocks.GREEN_CONCRETE_SLAB, slabDrops(ConcreteBlocks.GREEN_CONCRETE_SLAB));
        addDrop(ConcreteBlocks.RED_CONCRETE_SLAB, slabDrops(ConcreteBlocks.RED_CONCRETE_SLAB));
        addDrop(ConcreteBlocks.BLACK_CONCRETE_SLAB, slabDrops(ConcreteBlocks.BLACK_CONCRETE_SLAB));

        addDrop(ConcreteBlocks.WHITE_CONCRETE_WALL);
        addDrop(ConcreteBlocks.ORANGE_CONCRETE_WALL);
        addDrop(ConcreteBlocks.MAGENTA_CONCRETE_WALL);
        addDrop(ConcreteBlocks.LIGHT_BLUE_CONCRETE_WALL);
        addDrop(ConcreteBlocks.YELLOW_CONCRETE_WALL);
        addDrop(ConcreteBlocks.LIME_CONCRETE_WALL);
        addDrop(ConcreteBlocks.PINK_CONCRETE_WALL);
        addDrop(ConcreteBlocks.GRAY_CONCRETE_WALL);
        addDrop(ConcreteBlocks.LIGHT_GRAY_CONCRETE_WALL);
        addDrop(ConcreteBlocks.CYAN_CONCRETE_WALL);
        addDrop(ConcreteBlocks.PURPLE_CONCRETE_WALL);
        addDrop(ConcreteBlocks.BLUE_CONCRETE_WALL);
        addDrop(ConcreteBlocks.BROWN_CONCRETE_WALL);
        addDrop(ConcreteBlocks.GREEN_CONCRETE_WALL);
        addDrop(ConcreteBlocks.RED_CONCRETE_WALL);
        addDrop(ConcreteBlocks.BLACK_CONCRETE_WALL);
    }
}