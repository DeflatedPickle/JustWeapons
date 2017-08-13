package com.deflatedpickle.justweapons.init;

import com.deflatedpickle.justweapons.items.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
    // Daggers
    public static ItemDagger WOODEN_DAGGER;
    public static ItemDagger STONE_DAGGER;
    public static ItemDagger IRON_DAGGER;
    public static ItemDagger GOLDEN_DAGGER;
    public static ItemDagger DIAMOND_DAGGER;

    // War Axes
    public static ItemWarAxe WOODEN_WARAXE;
    public static ItemWarAxe STONE_WARAXE;
    public static ItemWarAxe IRON_WARAXE;
    public static ItemWarAxe GOLDEN_WARAXE;
    public static ItemWarAxe DIAMOND_WARAXE;

    // Maces
    public static ItemMace WOODEN_MACE;
    public static ItemMace STONE_MACE;
    public static ItemMace IRON_MACE;
    public static ItemMace GOLDEN_MACE;
    public static ItemMace DIAMOND_MACE;

    // Greatswords
    public static ItemGreatsword WOODEN_GREATSWORD;
    public static ItemGreatsword STONE_GREATSWORD;
    public static ItemGreatsword IRON_GREATSWORD;
    public static ItemGreatsword GOLDEN_GREATSWORD;
    public static ItemGreatsword DIAMOND_GREATSWORD;

    // Battleaxe
    public static ItemBattleaxe WOODEN_BATTLEAXE;
    public static ItemBattleaxe STONE_BATTLEAXE;
    public static ItemBattleaxe IRON_BATTLEAXE;
    public static ItemBattleaxe GOLDEN_BATTLEAXE;
    public static ItemBattleaxe DIAMOND_BATTLEAXE;

    // Other
    public static Item STICK_LONG;

    public static void init(){
        // Daggers
        WOODEN_DAGGER = new ItemDagger(Item.ToolMaterial.WOOD, "daggerWood", "wooden_dagger");
        STONE_DAGGER = new ItemDagger(Item.ToolMaterial.STONE, "daggerStone", "stone_dagger");
        IRON_DAGGER = new ItemDagger(Item.ToolMaterial.IRON, "daggerIron", "iron_dagger");
        GOLDEN_DAGGER = new ItemDagger(Item.ToolMaterial.GOLD, "daggerGold", "golden_dagger");
        DIAMOND_DAGGER = new ItemDagger(Item.ToolMaterial.DIAMOND, "daggerDiamond", "diamond_dagger");

        // War Axes
        WOODEN_WARAXE = new ItemWarAxe(Item.ToolMaterial.WOOD, "waraxeWood", "wooden_waraxe");
        STONE_WARAXE = new ItemWarAxe(Item.ToolMaterial.STONE, "waraxeStone", "stone_waraxe");
        IRON_WARAXE = new ItemWarAxe(Item.ToolMaterial.IRON, "waraxeIron", "iron_waraxe");
        GOLDEN_WARAXE = new ItemWarAxe(Item.ToolMaterial.GOLD, "waraxeGold", "golden_waraxe");
        DIAMOND_WARAXE = new ItemWarAxe(Item.ToolMaterial.DIAMOND, "waraxeDiamond", "diamond_waraxe");

        // Maces
        WOODEN_MACE = new ItemMace(Item.ToolMaterial.WOOD, "maceWood", "wooden_mace");
        STONE_MACE = new ItemMace(Item.ToolMaterial.STONE, "maceStone", "stone_mace");
        IRON_MACE = new ItemMace(Item.ToolMaterial.IRON, "maceIron", "iron_mace");
        GOLDEN_MACE = new ItemMace(Item.ToolMaterial.GOLD, "maceGold", "golden_mace");
        DIAMOND_MACE = new ItemMace(Item.ToolMaterial.DIAMOND, "maceDiamond", "diamond_mace");

        // Greatswords
        WOODEN_GREATSWORD = new ItemGreatsword(Item.ToolMaterial.WOOD, "greatswordWood", "wooden_greatsword");
        STONE_GREATSWORD = new ItemGreatsword(Item.ToolMaterial.STONE, "greatswordStone", "stone_greatsword");
        IRON_GREATSWORD = new ItemGreatsword(Item.ToolMaterial.IRON, "greatswordIron", "iron_greatsword");
        GOLDEN_GREATSWORD = new ItemGreatsword(Item.ToolMaterial.GOLD, "greatswordGold", "golden_greatsword");
        DIAMOND_GREATSWORD = new ItemGreatsword(Item.ToolMaterial.DIAMOND, "greatswordDiamond", "diamond_greatsword");

        // Battleaxe
        WOODEN_BATTLEAXE = new ItemBattleaxe(Item.ToolMaterial.WOOD, "battleaxeWood", "wooden_battleaxe");
        STONE_BATTLEAXE = new ItemBattleaxe(Item.ToolMaterial.STONE, "battleaxeStone", "stone_battleaxe");
        IRON_BATTLEAXE = new ItemBattleaxe(Item.ToolMaterial.IRON, "battleaxeIron", "iron_battleaxe");
        GOLDEN_BATTLEAXE = new ItemBattleaxe(Item.ToolMaterial.GOLD, "battleaxeGold", "golden_battleaxe");
        DIAMOND_BATTLEAXE = new ItemBattleaxe(Item.ToolMaterial.DIAMOND, "battleaxeDiamond", "diamond_battleaxe");

        // Other
        STICK_LONG = new Item().setUnlocalizedName("longStick").setRegistryName("stick_long");
    }

    public static void register(){
        // Daggers
        GameRegistry.register(WOODEN_DAGGER);
        GameRegistry.register(STONE_DAGGER);
        GameRegistry.register(IRON_DAGGER);
        GameRegistry.register(GOLDEN_DAGGER);
        GameRegistry.register(DIAMOND_DAGGER);

        // War Axes
        GameRegistry.register(WOODEN_WARAXE);
        GameRegistry.register(STONE_WARAXE);
        GameRegistry.register(IRON_WARAXE);
        GameRegistry.register(GOLDEN_WARAXE);
        GameRegistry.register(DIAMOND_WARAXE);

        // Maces
        GameRegistry.register(WOODEN_MACE);
        GameRegistry.register(STONE_MACE);
        GameRegistry.register(IRON_WARAXE);
        GameRegistry.register(GOLDEN_MACE);
        GameRegistry.register(DIAMOND_MACE);

        // Greatsword
        GameRegistry.register(WOODEN_GREATSWORD);
        GameRegistry.register(STONE_GREATSWORD);
        GameRegistry.register(IRON_GREATSWORD);
        GameRegistry.register(GOLDEN_GREATSWORD);
        GameRegistry.register(DIAMOND_GREATSWORD);

        // Battleaxe
        GameRegistry.register(WOODEN_BATTLEAXE);
        GameRegistry.register(STONE_BATTLEAXE);
        GameRegistry.register(IRON_BATTLEAXE);
        GameRegistry.register(GOLDEN_BATTLEAXE);
        GameRegistry.register(DIAMOND_BATTLEAXE);

        // Other
        GameRegistry.register(STICK_LONG);
    }

    public static void registerRenders(){
        // Daggers
        registerRender(WOODEN_DAGGER);
        registerRender(STONE_DAGGER);
        registerRender(IRON_DAGGER);
        registerRender(GOLDEN_DAGGER);
        registerRender(DIAMOND_DAGGER);

        // War Axes
        registerRender(WOODEN_WARAXE);
        registerRender(STONE_WARAXE);
        registerRender(IRON_WARAXE);
        registerRender(GOLDEN_WARAXE);
        registerRender(DIAMOND_WARAXE);

        // Maces
        registerRender(WOODEN_MACE);
        registerRender(STONE_MACE);
        registerRender(IRON_MACE);
        registerRender(GOLDEN_MACE);
        registerRender(DIAMOND_MACE);

        // Greatsword
        registerRender(WOODEN_GREATSWORD);
        registerRender(STONE_GREATSWORD);
        registerRender(IRON_GREATSWORD);
        registerRender(GOLDEN_GREATSWORD);
        registerRender(DIAMOND_GREATSWORD);

        // Battleaxe
        registerRender(WOODEN_BATTLEAXE);
        registerRender(STONE_BATTLEAXE);
        registerRender(IRON_BATTLEAXE);
        registerRender(GOLDEN_BATTLEAXE);
        registerRender(DIAMOND_BATTLEAXE);

        // Other
        registerRender(STICK_LONG);
    }

    private static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
