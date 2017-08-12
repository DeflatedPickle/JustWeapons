package com.deflatedpickle.justweapons.proxy;

import com.deflatedpickle.justweapons.events.ForgeEventHandler;
import com.deflatedpickle.justweapons.init.ModItems;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy implements CommonProxy{
    @Override
    public void init() {
        ModItems.registerRenders();
        MinecraftForge.EVENT_BUS.register(new ForgeEventHandler());
    }
}
