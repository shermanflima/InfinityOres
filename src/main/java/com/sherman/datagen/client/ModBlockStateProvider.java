package com.sherman.datagen.client;

import com.sherman.registry.ModRegistry;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

import static com.sherman.InfinityOres.MOD_ID;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        cubeAll(ModRegistry.ANCIENT_DEBRIS);
        cubeAll(ModRegistry.BUDDING_AMETHYST);
        cubeAll(ModRegistry.COAL_ORE);
        cubeAll(ModRegistry.COPPER_ORE);
        cubeAll(ModRegistry.DIAMOND_ORE);
        cubeAll(ModRegistry.EMERALD_ORE);
        cubeAll(ModRegistry.GOLD_ORE);
        cubeAll(ModRegistry.IRON_ORE);
        cubeAll(ModRegistry.GLOWSTONE);
        cubeAll(ModRegistry.LAPIS_ORE);
        cubeAll(ModRegistry.NETHER_QUARTZ_ORE);
        cubeAll(ModRegistry.REDSTONE_ORE);
    }

    private void cubeAll(DeferredBlock<Block> deferredBlock) {
        Block block = deferredBlock.get();
        simpleBlockWithItem(block, cubeAll(block));
    }
}
