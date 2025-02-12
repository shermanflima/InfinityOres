package com.sherman.datagen.server;

import com.sherman.InfinityOres;
import com.sherman.registry.ModRegistry;
import com.sherman.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {

    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, InfinityOres.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {

        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .addTag(ModTags.Blocks.INFINITY_BLOCK);

        tag(ModTags.Blocks.INFINITY_BLOCK)
                .add(ModRegistry.ANCIENT_DEBRIS.get())
                .add(ModRegistry.BUDDING_AMETHYST.get())
                .add(ModRegistry.COAL_ORE.get())
                .add(ModRegistry.COPPER_ORE.get())
                .add(ModRegistry.DIAMOND_ORE.get())
                .add(ModRegistry.EMERALD_ORE.get())
                .add(ModRegistry.GLOWSTONE.get())
                .add(ModRegistry.GOLD_ORE.get())
                .add(ModRegistry.IRON_ORE.get())
                .add(ModRegistry.LAPIS_ORE.get())
                .add(ModRegistry.NETHER_QUARTZ_ORE.get())
                .add(ModRegistry.REDSTONE_ORE.get());

        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModRegistry.COAL_ORE.get())
                .add(ModRegistry.COPPER_ORE.get())
                .add(ModRegistry.IRON_ORE.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModRegistry.BUDDING_AMETHYST.get())
                .add(ModRegistry.DIAMOND_ORE.get())
                .add(ModRegistry.EMERALD_ORE.get())
                .add(ModRegistry.GLOWSTONE.get())
                .add(ModRegistry.GOLD_ORE.get())
                .add(ModRegistry.LAPIS_ORE.get())
                .add(ModRegistry.NETHER_QUARTZ_ORE.get())
                .add(ModRegistry.REDSTONE_ORE.get());

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModRegistry.ANCIENT_DEBRIS.get());

    }
}