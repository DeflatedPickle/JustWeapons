package com.deflatedpickle.justweapons.events;

import com.deflatedpickle.justweapons.items.ItemDagger;
import com.deflatedpickle.justweapons.items.ItemMace;
import com.deflatedpickle.justweapons.items.ItemWarAxe;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ForgeEventHandler {
    @SubscribeEvent
    public void onLivingHurtEvent(LivingHurtEvent event){
        EntityLivingBase entity = (EntityLivingBase) event.getEntity();
        EntityLivingBase player = (EntityLivingBase) event.getSource().getSourceOfDamage();
        Item heldItem = ((EntityLivingBase) event.getSource().getSourceOfDamage()).getHeldItemMainhand().getItem();

        if (heldItem instanceof ItemDagger) {
            if (event.getSource().getSourceOfDamage().isSneaking() && entity.getHorizontalFacing().equals(player.getHorizontalFacing())) {
                event.setAmount(event.getAmount() + 4);
            }
        }
        else if (heldItem instanceof ItemWarAxe) {
            // Perhaps only ignore a portion of the armour so this isn't so OP with modded armour.
            event.getSource().setDamageBypassesArmor();
        }
        else if (heldItem instanceof ItemMace) {
            entity.addPotionEffect(new PotionEffect(Potion.getPotionById(9), 100, 0));
            entity.addPotionEffect(new PotionEffect(Potion.getPotionById(2), 100, 0));
        }
    }
}
