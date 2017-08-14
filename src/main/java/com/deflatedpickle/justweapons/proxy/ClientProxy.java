package com.deflatedpickle.justweapons.proxy;

import com.deflatedpickle.justweapons.JustWeapons;
import com.deflatedpickle.justweapons.Reference;
import com.deflatedpickle.justweapons.events.ForgeEventHandler;
import com.deflatedpickle.justweapons.init.ModItems;
import com.deflatedpickle.justweapons.packets.MessageExtendedReachAttack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.relauncher.Side;

public class ClientProxy implements CommonProxy{
    @Override
    public void init() {
        ModItems.registerRenders();
        MinecraftForge.EVENT_BUS.register(new ForgeEventHandler());

        JustWeapons.network = NetworkRegistry.INSTANCE.newSimpleChannel(Reference.MOD_ID);

        int packetId = 0;
        JustWeapons.network.registerMessage(MessageExtendedReachAttack.Handler.class, MessageExtendedReachAttack.class, packetId++, Side.SERVER);
    }
}
