package com.deflatedpickle.justweapons.entities;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EntityKnife extends EntityThrowable {
    private Item thrownItem;
    private final float attackDamage;

    public EntityKnife(World worldIn) {
        super(worldIn);
        this.attackDamage = 0;
    }

    public EntityKnife(World worldIn, EntityLivingBase throwerIn, Item thrownItem, Float attackDamage) {
        super(worldIn, throwerIn);
        this.thrownItem = thrownItem;
        this.attackDamage = attackDamage;
    }

    public EntityKnife(World worldIn, double x, double y, double z) {
        super(worldIn, x, y, z);
        this.attackDamage = 0;
    }

    public static void registerFixesKnife(DataFixer fixer) {
        EntityThrowable.registerFixesThrowable(fixer, "Knife");
    }

    protected void onImpact(RayTraceResult result) {
        BlockPos position;
        switch (result.typeOfHit) {
            case BLOCK:
                position = result.getBlockPos();
                break;
            case ENTITY:
                result.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), this.attackDamage);
                position = result.entityHit.getPosition();
                break;
            default:
                position = null;
                break;
        }

        if (!this.world.isRemote && position != null) {
            ItemStack item = new ItemStack(this.thrownItem, 1);

            this.world.spawnEntity(new EntityItem(this.world, position.getX(), position.getY() + 1, position.getZ(), item));
            this.world.setEntityState(this, (byte) 3);
            this.setDead();
        }
    }
}
