package com.deflatedpickle.justweapons.init;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class ModCrafting {
    public static void register(){
        // Daggers
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.WOODEN_DAGGER, "M", "S", 'M', "plankWood", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.STONE_DAGGER, "M", "S", 'M', "cobblestone", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.IRON_DAGGER, "M", "S", 'M', "ingotIron", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.GOLDEN_DAGGER, "M", "S", 'M', "ingotGold", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.DIAMOND_DAGGER, "M", "S", 'M', "gemDiamond", 'S', "stickWood"));

        // War Axes
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.WOODEN_WARAXE, "MM ", "MSM", " S ", 'M', "plankWood", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.STONE_WARAXE, "MM ", "MSM", " S ", 'M', "cobblestone", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.IRON_WARAXE, "MM ", "MSM", " S ", 'M', "ingotIron", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.GOLDEN_WARAXE, "MM ", "MSM", " S ", 'M', "ingotGold", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.DIAMOND_WARAXE, "MM ", "MSM", " S ", 'M', "gemDiamond", 'S', "stickWood"));

        // Maces
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.WOODEN_MACE, " MM", " SM", "S  ", 'M', "plankWood", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.STONE_MACE, " MM", " SM", "S  ", 'M', "cobblestone", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.IRON_MACE, " MM", " SM", "S  ", 'M', "ingotIron", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.GOLDEN_MACE, " MM", " SM", "S  ", 'M', "ingotGold", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.DIAMOND_MACE, " MM", " SM", "S  ", 'M', "gemDiamond", 'S', "stickWood"));

        // Greatswords
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.WOODEN_GREATSWORD, "M", "M", "S", 'M', "plankWood", 'S', "stickLong"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.STONE_GREATSWORD, "M", "M", "S", 'M', "cobblestone", 'S', "stickLong"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.IRON_GREATSWORD, "M", "M", "S", 'M', "ingotIron", 'S', "stickLong"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.GOLDEN_GREATSWORD, "M", "M", "S", 'M', "ingotGold", 'S', "stickLong"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.DIAMOND_GREATSWORD, "M", "M", "S", 'M', "gemDiamond", 'S', "stickLong"));

        // Battleaxes
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.WOODEN_BATTLEAXE, "MM ", "MSM", " S ", 'M', "plankWood", 'S', "stickLong"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.STONE_BATTLEAXE, "MM ", "MSM", " S ", 'M', "cobblestone", 'S', "stickLong"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.IRON_BATTLEAXE, "MM ", "MSM", " S ", 'M', "ingotIron", 'S', "stickLong"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.GOLDEN_BATTLEAXE, "MM ", "MSM", " S ", 'M', "ingotGold", 'S', "stickLong"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.DIAMOND_BATTLEAXE, "MM ", "MSM", " S ", 'M', "gemDiamond", 'S', "stickLong"));

        // Warhammers
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.WOODEN_WARHAMMER, "MMM", "MSM", " S ", 'M', "plankWood", 'S', "stickLong"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.STONE_WARHAMMER, "MMM", "MSM", " S ", 'M', "cobblestone", 'S', "stickLong"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.IRON_WARHAMMER, "MMM", "MSM", " S ", 'M', "ingotIron", 'S', "stickLong"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.GOLDEN_WARHAMMER, "MMM", "MSM", " S ", 'M', "ingotGold", 'S', "stickLong"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.DIAMOND_WARHAMMER, "MMM", "MSM", " S ", 'M', "gemDiamond", 'S', "stickLong"));

        // Knives
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.WOODEN_KNIFE, "   ", " M ", "S  ", 'M', "plankWood", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.STONE_KNIFE, "   ", " M ", "S  ", 'M', "cobblestone", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.IRON_KNIFE, "   ", " M ", "S  ", 'M', "ingotIron", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.GOLDEN_KNIFE, "   ", " M ", "S  ", 'M', "ingotGold", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.DIAMOND_KNIFE, "   ", " M ", "S  ", 'M', "gemDiamond", 'S', "stickWood"));

        // Other
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.STICK_LONG, "S", "S", 'S', "stickWood"));
    }
}
