package com.deflatedpickle.justweapons.events;

import com.deflatedpickle.justweapons.items.ItemDagger;
import com.deflatedpickle.justweapons.items.ItemWarAxe;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ForgeEventHandler {
    @SubscribeEvent
    public void onLivingHurtEvent(LivingHurtEvent event){
        Item heldItem = ((EntityLivingBase) event.getSource().getSourceOfDamage()).getHeldItemMainhand().getItem();
        if (heldItem instanceof ItemDagger) {
            if (event.getSource().getSourceOfDamage().isSneaking() && event.getEntity().getHorizontalFacing().equals(event.getSource().getSourceOfDamage().getHorizontalFacing())) {
                event.setAmount(event.getAmount() + 4);
            }
        }
        else if (heldItem instanceof ItemWarAxe) {
            event.getSource().setDamageBypassesArmor();
        }
    }
}
