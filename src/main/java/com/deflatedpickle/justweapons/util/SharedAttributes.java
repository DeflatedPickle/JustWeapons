package com.deflatedpickle.justweapons.util;

import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.ai.attributes.RangedAttribute;

public class SharedAttributes {
    public static final IAttribute ATTACK_RANGE = (new RangedAttribute(null, "generic.attackRange", 1.0D, 0.0D, 2048.0D)).setDescription("Attack Range");
    public static final IAttribute THROWN_DAMAGE = (new RangedAttribute(null, "generic.thrownDamage", 1.0D, 0.0D, 2048.0D)).setDescription("Thrown Damage");
}
