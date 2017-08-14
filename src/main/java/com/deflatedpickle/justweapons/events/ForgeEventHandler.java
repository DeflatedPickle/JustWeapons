package com.deflatedpickle.justweapons.events;

import com.deflatedpickle.justweapons.JustWeapons;
import com.deflatedpickle.justweapons.api.IReach;
import com.deflatedpickle.justweapons.items.ItemDagger;
import com.deflatedpickle.justweapons.items.ItemMace;
import com.deflatedpickle.justweapons.items.ItemWarAxe;
import com.deflatedpickle.justweapons.packets.MessageExtendedReachAttack;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.RayTraceResult;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.deflatedpickle.justweapons.util.Mouse.getMouseOverExtended;

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

    @SideOnly(Side.CLIENT)
    @SubscribeEvent(priority= EventPriority.NORMAL, receiveCanceled=true)
    public void onEvent(MouseEvent event)
    {
        if (event.getButton() == 0 && event.isButtonstate())
        {
            Minecraft mc = Minecraft.getMinecraft();
            EntityPlayer thePlayer = mc.player;
            if (thePlayer != null)
            {
                ItemStack itemstack = thePlayer.getHeldItemMainhand();
                IReach ieri;
                if (itemstack != null)
                {
                    if (itemstack.getItem() instanceof IReach)
                    {
                        ieri = (IReach) itemstack.getItem();
                    } else
                    {
                        ieri = null;
                    }

                    if (ieri != null)
                    {
                        float reach = ieri.getReach();
                        RayTraceResult mov = getMouseOverExtended(reach);

                        if (mov != null)
                        {
                            if (mov.entityHit != null && mov.entityHit.hurtResistantTime == 0)
                            {
                                if (mov.entityHit != thePlayer )
                                {
                                    JustWeapons.network.sendToServer(new MessageExtendedReachAttack(mov.entityHit.getEntityId()));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

}
