package com.sherman.datagen.server;

import com.sherman.registry.ModRegistry;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {

    // The parameters are stored in protected fields
    public ModRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    @Override
    protected void buildRecipes() {
        threeByThreePacker(RecipeCategory.MISC, ModRegistry.ANCIENT_DEBRIS.get(), Blocks.ANCIENT_DEBRIS);
        threeByThreePacker(RecipeCategory.MISC, ModRegistry.BUDDING_AMETHYST.get(), Blocks.AMETHYST_BLOCK);
        threeByThreePacker(RecipeCategory.MISC, ModRegistry.COAL_ORE.get(), Blocks.COAL_BLOCK);
        threeByThreePacker(RecipeCategory.MISC, ModRegistry.COPPER_ORE.get(), Blocks.RAW_COPPER_BLOCK);
        threeByThreePacker(RecipeCategory.MISC, ModRegistry.DIAMOND_ORE.get(), Blocks.DIAMOND_BLOCK);
        threeByThreePacker(RecipeCategory.MISC, ModRegistry.EMERALD_ORE.get(), Blocks.EMERALD_BLOCK);
        threeByThreePacker(RecipeCategory.MISC, ModRegistry.GLOWSTONE.get(), Blocks.GLOWSTONE);
        threeByThreePacker(RecipeCategory.MISC, ModRegistry.GOLD_ORE.get(), Blocks.RAW_GOLD_BLOCK);
        threeByThreePacker(RecipeCategory.MISC, ModRegistry.IRON_ORE.get(), Blocks.RAW_IRON_BLOCK);
        threeByThreePacker(RecipeCategory.MISC, ModRegistry.LAPIS_ORE.get(), Blocks.LAPIS_BLOCK);
        threeByThreePacker(RecipeCategory.MISC, ModRegistry.NETHER_QUARTZ_ORE.get(), Blocks.QUARTZ_BLOCK);
        threeByThreePacker(RecipeCategory.MISC, ModRegistry.REDSTONE_ORE.get(), Blocks.REDSTONE_BLOCK);
    }

    // The runner class, this should be added to the DataGenerator as a DataProvider
    public static class Runner extends RecipeProvider.Runner {

        public Runner(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
            super(output, registries);
        }

        @Override
        protected @NotNull RecipeProvider createRecipeProvider(HolderLookup.@NotNull Provider registries, @NotNull RecipeOutput output) {
            return new ModRecipeProvider(registries, output);
        }

        @Override
        public @NotNull String getName() {
            return "Mod Recipes";
        }
    }
}
