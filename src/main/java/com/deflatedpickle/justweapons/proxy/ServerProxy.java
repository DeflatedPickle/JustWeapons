package com.deflatedpickle.justweapons.proxy;

import com.deflatedpickle.justweapons.events.ForgeEventHandler;
import net.minecraftforge.common.MinecraftForge;

public class ServerProxy implements CommonProxy{
    @Override
    public void init() {
        MinecraftForge.EVENT_BUS.register(new ForgeEventHandler());
    }
}
