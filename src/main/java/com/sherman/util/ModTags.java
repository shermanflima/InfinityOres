package com.sherman.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

import static com.sherman.InfinityOres.MOD_ID;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> INFINITY_BLOCK = createTag("infinity_block");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(MOD_ID, name));
        }
    }
}