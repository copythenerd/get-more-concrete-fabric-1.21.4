package com.copythenerd.getmoreconcrete.datagen;

import com.copythenerd.getmoreconcrete.block.ConcreteBlocks;
import com.copythenerd.getmoreconcrete.GetMoreConcrete;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Blocks;
import net.minecraft.client.data.*;

public class ConcreteModelProvider extends FabricModelProvider {
    public ConcreteModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        // Will generate blockstates/.json, block/model/.json and item/model/.json

        BlockStateModelGenerator.BlockTexturePool whiteConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WHITE_CONCRETE);
        whiteConcretePool.stairs(ConcreteBlocks.WHITE_CONCRETE_STAIRS);
        whiteConcretePool.slab(ConcreteBlocks.WHITE_CONCRETE_SLAB);
        whiteConcretePool.wall(ConcreteBlocks.WHITE_CONCRETE_WALL);

        BlockStateModelGenerator.BlockTexturePool orangeConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ORANGE_CONCRETE);
        orangeConcretePool.stairs(ConcreteBlocks.ORANGE_CONCRETE_STAIRS);
        orangeConcretePool.slab(ConcreteBlocks.ORANGE_CONCRETE_SLAB);
        orangeConcretePool.wall(ConcreteBlocks.ORANGE_CONCRETE_WALL);

        BlockStateModelGenerator.BlockTexturePool magentaConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MAGENTA_CONCRETE);
        magentaConcretePool.stairs(ConcreteBlocks.MAGENTA_CONCRETE_STAIRS);
        magentaConcretePool.slab(ConcreteBlocks.MAGENTA_CONCRETE_SLAB);
        magentaConcretePool.wall(ConcreteBlocks.MAGENTA_CONCRETE_WALL);

        BlockStateModelGenerator.BlockTexturePool lightBlueConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_CONCRETE);
        lightBlueConcretePool.stairs(ConcreteBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        lightBlueConcretePool.slab(ConcreteBlocks.LIGHT_BLUE_CONCRETE_SLAB);
        lightBlueConcretePool.wall(ConcreteBlocks.LIGHT_BLUE_CONCRETE_WALL);

        BlockStateModelGenerator.BlockTexturePool yellowConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.YELLOW_CONCRETE);
        yellowConcretePool.stairs(ConcreteBlocks.YELLOW_CONCRETE_STAIRS);
        yellowConcretePool.slab(ConcreteBlocks.YELLOW_CONCRETE_SLAB);
        yellowConcretePool.wall(ConcreteBlocks.YELLOW_CONCRETE_WALL);

        BlockStateModelGenerator.BlockTexturePool limeConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIME_CONCRETE);
        limeConcretePool.stairs(ConcreteBlocks.LIME_CONCRETE_STAIRS);
        limeConcretePool.slab(ConcreteBlocks.LIME_CONCRETE_SLAB);
        limeConcretePool.wall(ConcreteBlocks.LIME_CONCRETE_WALL);

        BlockStateModelGenerator.BlockTexturePool pinkConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PINK_CONCRETE);
        pinkConcretePool.stairs(ConcreteBlocks.PINK_CONCRETE_STAIRS);
        pinkConcretePool.slab(ConcreteBlocks.PINK_CONCRETE_SLAB);
        pinkConcretePool.wall(ConcreteBlocks.PINK_CONCRETE_WALL);

        BlockStateModelGenerator.BlockTexturePool grayConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRAY_CONCRETE);
        grayConcretePool.stairs(ConcreteBlocks.GRAY_CONCRETE_STAIRS);
        grayConcretePool.slab(ConcreteBlocks.GRAY_CONCRETE_SLAB);
        grayConcretePool.wall(ConcreteBlocks.GRAY_CONCRETE_WALL);

        BlockStateModelGenerator.BlockTexturePool lightGrayConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_CONCRETE);
        lightGrayConcretePool.stairs(ConcreteBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        lightGrayConcretePool.slab(ConcreteBlocks.LIGHT_GRAY_CONCRETE_SLAB);
        lightGrayConcretePool.wall(ConcreteBlocks.LIGHT_GRAY_CONCRETE_WALL);

        BlockStateModelGenerator.BlockTexturePool cyanConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CYAN_CONCRETE);
        cyanConcretePool.stairs(ConcreteBlocks.CYAN_CONCRETE_STAIRS);
        cyanConcretePool.slab(ConcreteBlocks.CYAN_CONCRETE_SLAB);
        cyanConcretePool.wall(ConcreteBlocks.CYAN_CONCRETE_WALL);

        BlockStateModelGenerator.BlockTexturePool purpleConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPLE_CONCRETE);
        purpleConcretePool.stairs(ConcreteBlocks.PURPLE_CONCRETE_STAIRS);
        purpleConcretePool.slab(ConcreteBlocks.PURPLE_CONCRETE_SLAB);
        purpleConcretePool.wall(ConcreteBlocks.PURPLE_CONCRETE_WALL);

        BlockStateModelGenerator.BlockTexturePool blueConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLUE_CONCRETE);
        blueConcretePool.stairs(ConcreteBlocks.BLUE_CONCRETE_STAIRS);
        blueConcretePool.slab(ConcreteBlocks.BLUE_CONCRETE_SLAB);
        blueConcretePool.wall(ConcreteBlocks.BLUE_CONCRETE_WALL);

        BlockStateModelGenerator.BlockTexturePool brownConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BROWN_CONCRETE);
        brownConcretePool.stairs(ConcreteBlocks.BROWN_CONCRETE_STAIRS);
        brownConcretePool.slab(ConcreteBlocks.BROWN_CONCRETE_SLAB);
        brownConcretePool.wall(ConcreteBlocks.BROWN_CONCRETE_WALL);

        BlockStateModelGenerator.BlockTexturePool greenConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GREEN_CONCRETE);
        greenConcretePool.stairs(ConcreteBlocks.GREEN_CONCRETE_STAIRS);
        greenConcretePool.slab(ConcreteBlocks.GREEN_CONCRETE_SLAB);
        greenConcretePool.wall(ConcreteBlocks.GREEN_CONCRETE_WALL);

        BlockStateModelGenerator.BlockTexturePool redConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_CONCRETE);
        redConcretePool.stairs(ConcreteBlocks.RED_CONCRETE_STAIRS);
        redConcretePool.slab(ConcreteBlocks.RED_CONCRETE_SLAB);
        redConcretePool.wall(ConcreteBlocks.RED_CONCRETE_WALL);

        BlockStateModelGenerator.BlockTexturePool blackConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLACK_CONCRETE);
        blackConcretePool.stairs(ConcreteBlocks.BLACK_CONCRETE_STAIRS);
        blackConcretePool.slab(ConcreteBlocks.BLACK_CONCRETE_SLAB);
        blackConcretePool.wall(ConcreteBlocks.BLACK_CONCRETE_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
