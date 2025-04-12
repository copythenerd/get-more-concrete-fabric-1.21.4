package com.copythenerd.getmoreconcrete.datagen;

import com.copythenerd.getmoreconcrete.block.ConcreteBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ConcreteRecipeProvider extends FabricRecipeProvider {
    public ConcreteRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            public void generate() {

                //------------------------------ Stairs -----------------------------
                createStairsRecipe(ConcreteBlocks.WHITE_CONCRETE_STAIRS, Ingredient.ofItem(Blocks.WHITE_CONCRETE))
                        .criterion(hasItem(Blocks.WHITE_CONCRETE), conditionsFromItem(Blocks.WHITE_CONCRETE))
                        .offerTo(exporter);

                createStairsRecipe(ConcreteBlocks.ORANGE_CONCRETE_STAIRS, Ingredient.ofItem(Blocks.ORANGE_CONCRETE))
                        .criterion(hasItem(Blocks.ORANGE_CONCRETE), conditionsFromItem(Blocks.ORANGE_CONCRETE))
                        .offerTo(exporter);

                createStairsRecipe(ConcreteBlocks.MAGENTA_CONCRETE_STAIRS, Ingredient.ofItem(Blocks.MAGENTA_CONCRETE))
                        .criterion(hasItem(Blocks.MAGENTA_CONCRETE), conditionsFromItem(Blocks.MAGENTA_CONCRETE))
                        .offerTo(exporter);

                createStairsRecipe(ConcreteBlocks.LIGHT_BLUE_CONCRETE_STAIRS, Ingredient.ofItem(Blocks.LIGHT_BLUE_CONCRETE))
                        .criterion(hasItem(Blocks.LIGHT_BLUE_CONCRETE), conditionsFromItem(Blocks.LIGHT_BLUE_CONCRETE))
                        .offerTo(exporter);

                createStairsRecipe(ConcreteBlocks.YELLOW_CONCRETE_STAIRS, Ingredient.ofItem(Blocks.YELLOW_CONCRETE))
                        .criterion(hasItem(Blocks.YELLOW_CONCRETE), conditionsFromItem(Blocks.YELLOW_CONCRETE))
                        .offerTo(exporter);

                createStairsRecipe(ConcreteBlocks.LIME_CONCRETE_STAIRS, Ingredient.ofItem(Blocks.LIME_CONCRETE))
                        .criterion(hasItem(Blocks.LIME_CONCRETE), conditionsFromItem(Blocks.LIME_CONCRETE))
                        .offerTo(exporter);

                createStairsRecipe(ConcreteBlocks.PINK_CONCRETE_STAIRS, Ingredient.ofItem(Blocks.PINK_CONCRETE))
                        .criterion(hasItem(Blocks.PINK_CONCRETE), conditionsFromItem(Blocks.PINK_CONCRETE))
                        .offerTo(exporter);

                createStairsRecipe(ConcreteBlocks.GRAY_CONCRETE_STAIRS, Ingredient.ofItem(Blocks.GRAY_CONCRETE))
                        .criterion(hasItem(Blocks.GRAY_CONCRETE), conditionsFromItem(Blocks.GRAY_CONCRETE))
                        .offerTo(exporter);

                createStairsRecipe(ConcreteBlocks.LIGHT_GRAY_CONCRETE_STAIRS, Ingredient.ofItem(Blocks.LIGHT_GRAY_CONCRETE))
                        .criterion(hasItem(Blocks.LIGHT_GRAY_CONCRETE), conditionsFromItem(Blocks.LIGHT_GRAY_CONCRETE))
                        .offerTo(exporter);

                createStairsRecipe(ConcreteBlocks.CYAN_CONCRETE_STAIRS, Ingredient.ofItem(Blocks.CYAN_CONCRETE))
                        .criterion(hasItem(Blocks.CYAN_CONCRETE), conditionsFromItem(Blocks.CYAN_CONCRETE))
                        .offerTo(exporter);

                createStairsRecipe(ConcreteBlocks.PURPLE_CONCRETE_STAIRS, Ingredient.ofItem(Blocks.PURPLE_CONCRETE))
                        .criterion(hasItem(Blocks.PURPLE_CONCRETE), conditionsFromItem(Blocks.PURPLE_CONCRETE))
                        .offerTo(exporter);

                createStairsRecipe(ConcreteBlocks.BLUE_CONCRETE_STAIRS, Ingredient.ofItem(Blocks.BLUE_CONCRETE))
                        .criterion(hasItem(Blocks.BLUE_CONCRETE), conditionsFromItem(Blocks.BLUE_CONCRETE))
                        .offerTo(exporter);

                createStairsRecipe(ConcreteBlocks.BROWN_CONCRETE_STAIRS, Ingredient.ofItem(Blocks.BROWN_CONCRETE))
                        .criterion(hasItem(Blocks.BROWN_CONCRETE), conditionsFromItem(Blocks.BROWN_CONCRETE))
                        .offerTo(exporter);

                createStairsRecipe(ConcreteBlocks.GREEN_CONCRETE_STAIRS, Ingredient.ofItem(Blocks.GREEN_CONCRETE))
                        .criterion(hasItem(Blocks.GREEN_CONCRETE), conditionsFromItem(Blocks.GREEN_CONCRETE))
                        .offerTo(exporter);

                createStairsRecipe(ConcreteBlocks.RED_CONCRETE_STAIRS, Ingredient.ofItem(Blocks.RED_CONCRETE))
                        .criterion(hasItem(Blocks.RED_CONCRETE), conditionsFromItem(Blocks.RED_CONCRETE))
                        .offerTo(exporter);

                createStairsRecipe(ConcreteBlocks.BLACK_CONCRETE_STAIRS, Ingredient.ofItem(Blocks.BLACK_CONCRETE))
                        .criterion(hasItem(Blocks.BLACK_CONCRETE), conditionsFromItem(Blocks.BLACK_CONCRETE))
                        .offerTo(exporter);

                //------------------------------ Slabs -----------------------------
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.WHITE_CONCRETE_SLAB, Ingredient.ofItem(Blocks.WHITE_CONCRETE))
                        .criterion(hasItem(Blocks.WHITE_CONCRETE), conditionsFromItem(Blocks.WHITE_CONCRETE))
                        .offerTo(exporter);

                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.ORANGE_CONCRETE_SLAB, Ingredient.ofItem(Blocks.ORANGE_CONCRETE))
                        .criterion(hasItem(Blocks.ORANGE_CONCRETE), conditionsFromItem(Blocks.ORANGE_CONCRETE))
                        .offerTo(exporter);

                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.MAGENTA_CONCRETE_SLAB, Ingredient.ofItem(Blocks.MAGENTA_CONCRETE))
                        .criterion(hasItem(Blocks.MAGENTA_CONCRETE), conditionsFromItem(Blocks.MAGENTA_CONCRETE))
                        .offerTo(exporter);

                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.LIGHT_BLUE_CONCRETE_SLAB, Ingredient.ofItem(Blocks.LIGHT_BLUE_CONCRETE))
                        .criterion(hasItem(Blocks.LIGHT_BLUE_CONCRETE), conditionsFromItem(Blocks.LIGHT_BLUE_CONCRETE))
                        .offerTo(exporter);

                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.YELLOW_CONCRETE_SLAB, Ingredient.ofItem(Blocks.YELLOW_CONCRETE))
                        .criterion(hasItem(Blocks.YELLOW_CONCRETE), conditionsFromItem(Blocks.YELLOW_CONCRETE))
                        .offerTo(exporter);

                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.LIME_CONCRETE_SLAB, Ingredient.ofItem(Blocks.LIME_CONCRETE))
                        .criterion(hasItem(Blocks.LIME_CONCRETE), conditionsFromItem(Blocks.LIME_CONCRETE))
                        .offerTo(exporter);

                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.PINK_CONCRETE_SLAB, Ingredient.ofItem(Blocks.PINK_CONCRETE))
                        .criterion(hasItem(Blocks.PINK_CONCRETE), conditionsFromItem(Blocks.PINK_CONCRETE))
                        .offerTo(exporter);

                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.GRAY_CONCRETE_SLAB, Ingredient.ofItem(Blocks.GRAY_CONCRETE))
                        .criterion(hasItem(Blocks.GRAY_CONCRETE), conditionsFromItem(Blocks.GRAY_CONCRETE))
                        .offerTo(exporter);

                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.LIGHT_GRAY_CONCRETE_SLAB, Ingredient.ofItem(Blocks.LIGHT_GRAY_CONCRETE))
                        .criterion(hasItem(Blocks.LIGHT_GRAY_CONCRETE), conditionsFromItem(Blocks.LIGHT_GRAY_CONCRETE))
                        .offerTo(exporter);

                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.CYAN_CONCRETE_SLAB, Ingredient.ofItem(Blocks.CYAN_CONCRETE))
                        .criterion(hasItem(Blocks.CYAN_CONCRETE), conditionsFromItem(Blocks.CYAN_CONCRETE))
                        .offerTo(exporter);

                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.PURPLE_CONCRETE_SLAB, Ingredient.ofItem(Blocks.PURPLE_CONCRETE))
                        .criterion(hasItem(Blocks.PURPLE_CONCRETE), conditionsFromItem(Blocks.PURPLE_CONCRETE))
                        .offerTo(exporter);

                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.BLUE_CONCRETE_SLAB, Ingredient.ofItem(Blocks.BLUE_CONCRETE))
                        .criterion(hasItem(Blocks.BLUE_CONCRETE), conditionsFromItem(Blocks.BLUE_CONCRETE))
                        .offerTo(exporter);

                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.BROWN_CONCRETE_SLAB, Ingredient.ofItem(Blocks.BROWN_CONCRETE))
                        .criterion(hasItem(Blocks.BROWN_CONCRETE), conditionsFromItem(Blocks.BROWN_CONCRETE))
                        .offerTo(exporter);

                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.GREEN_CONCRETE_SLAB, Ingredient.ofItem(Blocks.GREEN_CONCRETE))
                        .criterion(hasItem(Blocks.GREEN_CONCRETE), conditionsFromItem(Blocks.GREEN_CONCRETE))
                        .offerTo(exporter);

                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.RED_CONCRETE_SLAB, Ingredient.ofItem(Blocks.RED_CONCRETE))
                        .criterion(hasItem(Blocks.RED_CONCRETE), conditionsFromItem(Blocks.RED_CONCRETE))
                        .offerTo(exporter);

                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.BLACK_CONCRETE_SLAB, Ingredient.ofItem(Blocks.BLACK_CONCRETE))
                        .criterion(hasItem(Blocks.BLACK_CONCRETE), conditionsFromItem(Blocks.BLACK_CONCRETE))
                        .offerTo(exporter);

                //------------------------------ Walls -----------------------------
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.WHITE_CONCRETE_WALL, Blocks.WHITE_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.ORANGE_CONCRETE_WALL, Blocks.ORANGE_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.MAGENTA_CONCRETE_WALL, Blocks.MAGENTA_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.LIGHT_BLUE_CONCRETE_WALL, Blocks.LIGHT_BLUE_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.YELLOW_CONCRETE_WALL, Blocks.YELLOW_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.LIME_CONCRETE_WALL, Blocks.LIME_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.PINK_CONCRETE_WALL, Blocks.PINK_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.GRAY_CONCRETE_WALL, Blocks.GRAY_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.LIGHT_GRAY_CONCRETE_WALL, Blocks.LIGHT_GRAY_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.CYAN_CONCRETE_WALL, Blocks.CYAN_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.PURPLE_CONCRETE_WALL, Blocks.PURPLE_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.BLUE_CONCRETE_WALL, Blocks.BLUE_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.BROWN_CONCRETE_WALL, Blocks.BROWN_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.GREEN_CONCRETE_WALL, Blocks.GREEN_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.RED_CONCRETE_WALL, Blocks.RED_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.BLACK_CONCRETE_WALL, Blocks.BLACK_CONCRETE);

                //------------------------------ Stone cutting recipes -----------------------------
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.WHITE_CONCRETE_STAIRS, Blocks.WHITE_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.WHITE_CONCRETE_SLAB, Blocks.WHITE_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, ConcreteBlocks.WHITE_CONCRETE_WALL, Blocks.WHITE_CONCRETE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.ORANGE_CONCRETE_STAIRS, Blocks.ORANGE_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.ORANGE_CONCRETE_SLAB, Blocks.ORANGE_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, ConcreteBlocks.ORANGE_CONCRETE_WALL, Blocks.ORANGE_CONCRETE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.MAGENTA_CONCRETE_STAIRS, Blocks.MAGENTA_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.MAGENTA_CONCRETE_SLAB, Blocks.MAGENTA_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, ConcreteBlocks.MAGENTA_CONCRETE_WALL, Blocks.MAGENTA_CONCRETE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.LIGHT_BLUE_CONCRETE_STAIRS, Blocks.LIGHT_BLUE_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.LIGHT_BLUE_CONCRETE_SLAB, Blocks.LIGHT_BLUE_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, ConcreteBlocks.LIGHT_BLUE_CONCRETE_WALL, Blocks.LIGHT_BLUE_CONCRETE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.YELLOW_CONCRETE_STAIRS, Blocks.YELLOW_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.YELLOW_CONCRETE_SLAB, Blocks.YELLOW_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, ConcreteBlocks.YELLOW_CONCRETE_WALL, Blocks.YELLOW_CONCRETE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.LIME_CONCRETE_STAIRS, Blocks.LIME_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.LIME_CONCRETE_SLAB, Blocks.LIME_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, ConcreteBlocks.LIME_CONCRETE_WALL, Blocks.LIME_CONCRETE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.PINK_CONCRETE_STAIRS, Blocks.PINK_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.PINK_CONCRETE_SLAB, Blocks.PINK_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, ConcreteBlocks.PINK_CONCRETE_WALL, Blocks.PINK_CONCRETE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.GRAY_CONCRETE_STAIRS, Blocks.GRAY_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.GRAY_CONCRETE_SLAB, Blocks.GRAY_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, ConcreteBlocks.GRAY_CONCRETE_WALL, Blocks.GRAY_CONCRETE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.LIGHT_GRAY_CONCRETE_STAIRS, Blocks.LIGHT_GRAY_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.LIGHT_GRAY_CONCRETE_SLAB, Blocks.LIGHT_GRAY_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, ConcreteBlocks.LIGHT_GRAY_CONCRETE_WALL, Blocks.LIGHT_GRAY_CONCRETE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.CYAN_CONCRETE_STAIRS, Blocks.CYAN_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.CYAN_CONCRETE_SLAB, Blocks.CYAN_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, ConcreteBlocks.CYAN_CONCRETE_WALL, Blocks.CYAN_CONCRETE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.PURPLE_CONCRETE_STAIRS, Blocks.PURPLE_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.PURPLE_CONCRETE_SLAB, Blocks.PURPLE_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, ConcreteBlocks.PURPLE_CONCRETE_WALL, Blocks.PURPLE_CONCRETE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.BLUE_CONCRETE_STAIRS, Blocks.BLUE_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.BLUE_CONCRETE_SLAB, Blocks.BLUE_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, ConcreteBlocks.BLUE_CONCRETE_WALL, Blocks.BLUE_CONCRETE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.BROWN_CONCRETE_STAIRS, Blocks.BROWN_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.BROWN_CONCRETE_SLAB, Blocks.BROWN_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, ConcreteBlocks.BROWN_CONCRETE_WALL, Blocks.BROWN_CONCRETE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.GREEN_CONCRETE_STAIRS, Blocks.GREEN_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.GREEN_CONCRETE_SLAB, Blocks.GREEN_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, ConcreteBlocks.GREEN_CONCRETE_WALL, Blocks.GREEN_CONCRETE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.RED_CONCRETE_STAIRS, Blocks.RED_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.RED_CONCRETE_SLAB, Blocks.RED_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, ConcreteBlocks.RED_CONCRETE_WALL, Blocks.RED_CONCRETE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.BLACK_CONCRETE_STAIRS, Blocks.BLACK_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ConcreteBlocks.BLACK_CONCRETE_SLAB, Blocks.BLACK_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, ConcreteBlocks.BLACK_CONCRETE_WALL, Blocks.BLACK_CONCRETE);
            }
        };
    }

    @Override
    public String getName() {
        return "GetMoreConcrete Recipes";
    }
}
