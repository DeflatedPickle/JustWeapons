package com.deflatedpickle.justweapons.init;

import com.deflatedpickle.justweapons.items.ItemBattleaxe;
import com.deflatedpickle.justweapons.items.ItemDagger;
import com.deflatedpickle.justweapons.items.ItemMace;
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

    // Maces
    public static ItemMace WOODEN_MACE;
    public static ItemMace STONE_MACE;
    public static ItemMace IRON_MACE;
    public static ItemMace GOLD_MACE;
    public static ItemMace DIAMOND_MACE;

    // Battleaxe
    public static ItemBattleaxe WOODEN_BATTLEAXE;
    public static ItemBattleaxe STONE_BATTLEAXE;
    public static ItemBattleaxe IRON_BATTLEAXE;
    public static ItemBattleaxe GOLD_BATTLEAXE;
    public static ItemBattleaxe DIAMOND_BATTLEAXE;

    // Other
    public static Item STICK_LONG;

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

        // Maces
        WOODEN_MACE = new ItemMace(Item.ToolMaterial.WOOD, "maceWood", "wooden_mace");
        STONE_MACE = new ItemMace(Item.ToolMaterial.STONE, "maceStone", "stone_mace");
        IRON_MACE = new ItemMace(Item.ToolMaterial.IRON, "maceIron", "iron_mace");
        GOLD_MACE = new ItemMace(Item.ToolMaterial.GOLD, "maceGold", "gold_mace");
        DIAMOND_MACE = new ItemMace(Item.ToolMaterial.DIAMOND, "maceDiamond", "diamond_mace");

        // Battleaxe
        WOODEN_BATTLEAXE = new ItemBattleaxe(Item.ToolMaterial.WOOD, "battleaxeWood", "wooden_battleaxe");
        STONE_BATTLEAXE = new ItemBattleaxe(Item.ToolMaterial.STONE, "battleaxeStone", "stone_battleaxe");
        IRON_BATTLEAXE = new ItemBattleaxe(Item.ToolMaterial.IRON, "battleaxeIron", "iron_battleaxe");
        GOLD_BATTLEAXE = new ItemBattleaxe(Item.ToolMaterial.GOLD, "battleaxeGold", "gold_battleaxe");
        DIAMOND_BATTLEAXE = new ItemBattleaxe(Item.ToolMaterial.DIAMOND, "battleaxeDiamond", "diamond_battleaxe");

        // Other
        STICK_LONG = new Item().setUnlocalizedName("longStick").setRegistryName("stick_long");
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

        // Maces
        GameRegistry.register(WOODEN_MACE);
        GameRegistry.register(STONE_MACE);
        GameRegistry.register(IRON_WARAXE);
        GameRegistry.register(GOLD_MACE);
        GameRegistry.register(DIAMOND_MACE);

        // Battleaxe
        GameRegistry.register(WOODEN_BATTLEAXE);
        GameRegistry.register(STONE_BATTLEAXE);
        GameRegistry.register(IRON_BATTLEAXE);
        GameRegistry.register(GOLD_BATTLEAXE);
        GameRegistry.register(DIAMOND_BATTLEAXE);

        // Other
        GameRegistry.register(STICK_LONG);
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

        // Maces
        registerRender(WOODEN_MACE);
        registerRender(STONE_MACE);
        registerRender(IRON_MACE);
        registerRender(GOLD_MACE);
        registerRender(DIAMOND_MACE);

        // Battleaxe
        registerRender(WOODEN_BATTLEAXE);
        registerRender(STONE_BATTLEAXE);
        registerRender(IRON_BATTLEAXE);
        registerRender(GOLD_BATTLEAXE);
        registerRender(DIAMOND_BATTLEAXE);

        // Other
        registerRender(STICK_LONG);
    }

    private static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
