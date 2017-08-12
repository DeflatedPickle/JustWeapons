package com.deflatedpickle.justweapons.events;

import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ForgeEventHandler {
    @SubscribeEvent
    public void onLivingHurtEvent(LivingHurtEvent event){
        if (event.getEntity().getHorizontalFacing().equals(event.getSource().getSourceOfDamage().getHorizontalFacing())) {
            event.setAmount(event.getAmount() + 4);
        }
    }
}
