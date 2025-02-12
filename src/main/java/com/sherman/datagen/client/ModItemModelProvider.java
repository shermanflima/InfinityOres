package com.sherman.datagen.client;

import com.sherman.InfinityOres;
import com.sherman.registry.ModRegistry;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {

    private static final String MOD_ID = InfinityOres.MOD_ID;

    public ModItemModelProvider(PackOutput packOutput, ExistingFileHelper helper) {
        super(packOutput, MOD_ID, helper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModRegistry.TOOL.get());
    }
}
