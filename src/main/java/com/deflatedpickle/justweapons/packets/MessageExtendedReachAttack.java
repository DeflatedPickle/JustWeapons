package com.deflatedpickle.justweapons.packets;

import com.deflatedpickle.justweapons.api.IReach;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MessageExtendedReachAttack implements IMessage {
    private int entityId;

    public MessageExtendedReachAttack() {
        // need this constructor
    }

    public MessageExtendedReachAttack(int parEntityId) {
        entityId = parEntityId;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        entityId = ByteBufUtils.readVarInt(buf, 4);
    }

    @Override
    public void toBytes(ByteBuf buf) {
        ByteBufUtils.writeVarInt(buf, entityId, 4);
    }

    public static class Handler implements IMessageHandler<MessageExtendedReachAttack, IMessage> {

        @Override
        public IMessage onMessage(final MessageExtendedReachAttack message, MessageContext ctx) {
            final EntityPlayerMP player = ctx.getServerHandler().playerEntity;
            player.getServer().addScheduledTask(new Runnable() {
                @Override
                public void run() {
                    Entity theEntity = player.world.getEntityByID(message.entityId);
                    if (player.inventory.getCurrentItem() == null || player.inventory.getCurrentItem().isEmpty()) {
                        return;
                    }
                    if (player.inventory.getCurrentItem().getItem() instanceof IReach) {
                        IReach theExtendedReachWeapon = (IReach) player.inventory.getCurrentItem()
                                .getItem();
                        double distanceSq = player.getDistanceSqToEntity(theEntity);
                        double reachSq = theExtendedReachWeapon.getReach() * theExtendedReachWeapon.getReach();
                        if (reachSq >= distanceSq) {
                            player.attackTargetEntityWithCurrentItem(theEntity);
                        }
                    }
                }
            });
            return null;
        }
    }
}
