package com.sherman.datagen.client;

import com.sherman.registry.ModRegistry;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

import static com.sherman.InfinityOres.MOD_ID;

public class ModLanguageProvider extends LanguageProvider {

    public ModLanguageProvider(PackOutput packOutput) {
        super(packOutput, MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." +  MOD_ID, "Infinity Ores");

        addBlock(ModRegistry.ANCIENT_DEBRIS, "Infinty Ancient Debris");
        addBlock(ModRegistry.BUDDING_AMETHYST, "Infinty Budding Amethyst");
        addBlock(ModRegistry.COAL_ORE, "Infinty Coal Ore");
        addBlock(ModRegistry.COPPER_ORE, "Infinty Copper Ore");
        addBlock(ModRegistry.DIAMOND_ORE, "Infinty Diamond Ore");
        addBlock(ModRegistry.EMERALD_ORE, "Infinty Emerald Ore");
        addBlock(ModRegistry.GLOWSTONE, "Infinty Glowstone");
        addBlock(ModRegistry.GOLD_ORE, "Infinty Gold Ore");
        addBlock(ModRegistry.IRON_ORE, "Infinty Iron Ore");
        addBlock(ModRegistry.LAPIS_ORE, "Infinty Lapis Ore");
        addBlock(ModRegistry.NETHER_QUARTZ_ORE, "Infinty Nether Quartz Ore");
        addBlock(ModRegistry.REDSTONE_ORE, "Infinty Redstone Ore");

        addItem(ModRegistry.TOOL, "Infinity Tool");
        add("tooltip." + MOD_ID + ".tool", "Shift Right-click to remove a block");
    }
}
