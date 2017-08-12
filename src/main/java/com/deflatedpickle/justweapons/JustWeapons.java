package com.deflatedpickle.justweapons;

import com.deflatedpickle.justweapons.init.ModCrafting;
import com.deflatedpickle.justweapons.init.ModItems;
import com.deflatedpickle.justweapons.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class JustWeapons {
    @Instance
    public static JustWeapons instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModItems.init();
        ModItems.register();
    }

    @EventHandler
    public void Init(FMLInitializationEvent event) {
        proxy.init();
        ModCrafting.register();
    }

    @EventHandler
    public void PostInit(FMLPostInitializationEvent event) {
    }
}
