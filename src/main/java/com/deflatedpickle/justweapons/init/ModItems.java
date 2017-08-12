package com.deflatedpickle.justweapons.init;

import com.deflatedpickle.justweapons.items.ItemDagger;
import com.deflatedpickle.justweapons.items.ItemWarAxe;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
    // Daggers
    public static ItemDagger WOODEN_DAGGER;
    public static ItemDagger STONE_DAGGER;
    public static ItemDagger IRON_DAGGER;
    public static ItemDagger GOLD_DAGGER;
    public static ItemDagger DIAMOND_DAGGER;

    // War Axes
    public static ItemWarAxe WOODEN_WARAXE;
    public static ItemWarAxe STONE_WARAXE;
    public static ItemWarAxe IRON_WARAXE;
    public static ItemWarAxe GOLD_WARAXE;
    public static ItemWarAxe DIAMOND_WARAXE;

    public static void init(){
        // Daggers
        WOODEN_DAGGER = new ItemDagger(Item.ToolMaterial.WOOD, "daggerWood", "wooden_dagger");
        STONE_DAGGER = new ItemDagger(Item.ToolMaterial.STONE, "daggerStone", "stone_dagger");
        IRON_DAGGER = new ItemDagger(Item.ToolMaterial.IRON, "daggerIron", "iron_dagger");
        GOLD_DAGGER = new ItemDagger(Item.ToolMaterial.GOLD, "daggerGold", "gold_dagger");
        DIAMOND_DAGGER = new ItemDagger(Item.ToolMaterial.DIAMOND, "daggerDiamond", "diamond_dagger");

        // War Axes
        WOODEN_WARAXE = new ItemWarAxe(Item.ToolMaterial.WOOD, "waraxeWood", "wooden_waraxe");
        STONE_WARAXE = new ItemWarAxe(Item.ToolMaterial.STONE, "waraxeStone", "stone_waraxe");
        IRON_WARAXE = new ItemWarAxe(Item.ToolMaterial.IRON, "waraxeIron", "iron_waraxe");
        GOLD_WARAXE = new ItemWarAxe(Item.ToolMaterial.GOLD, "waraxeGold", "gold_waraxe");
        DIAMOND_WARAXE = new ItemWarAxe(Item.ToolMaterial.DIAMOND, "waraxeDiamond", "diamond_waraxe");
    }

    public static void register(){
        // Daggers
        GameRegistry.register(WOODEN_DAGGER);
        GameRegistry.register(STONE_DAGGER);
        GameRegistry.register(IRON_DAGGER);
        GameRegistry.register(GOLD_DAGGER);
        GameRegistry.register(DIAMOND_DAGGER);

        // War Axes
        GameRegistry.register(WOODEN_WARAXE);
        GameRegistry.register(STONE_WARAXE);
        GameRegistry.register(IRON_WARAXE);
        GameRegistry.register(GOLD_WARAXE);
        GameRegistry.register(DIAMOND_WARAXE);
    }

    public static void registerRenders(){
        // Daggers
        registerRender(WOODEN_DAGGER);
        registerRender(STONE_DAGGER);
        registerRender(IRON_DAGGER);
        registerRender(GOLD_DAGGER);
        registerRender(DIAMOND_DAGGER);

        // War Axes
        registerRender(WOODEN_WARAXE);
        registerRender(STONE_WARAXE);
        registerRender(IRON_WARAXE);
        registerRender(GOLD_WARAXE);
        registerRender(DIAMOND_WARAXE);
    }

    private static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
