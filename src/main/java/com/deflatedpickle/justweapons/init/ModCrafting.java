package com.deflatedpickle.justweapons.init;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class ModCrafting {
    public static void register(){
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.WOODEN_DAGGER, "   ", " M ", " S ", 'M', "plankWood", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.STONE_DAGGER, "   ", " M ", " S ", 'M', "cobblestone", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.IRON_DAGGER, "   ", " M ", " S ", 'M', "ingotIron", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.GOLD_DAGGER, "   ", " M ", " S ", 'M', "ingotGold", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.DIAMOND_DAGGER, "   ", " M ", " S ", 'M', "gemDiamond", 'S', "stickWood"));
    }
}
