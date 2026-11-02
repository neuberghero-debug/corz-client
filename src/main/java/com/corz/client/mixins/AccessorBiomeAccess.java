package com.corz.client.mixins;

import net.minecraft.class_4543;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_4543.class})
public interface AccessorBiomeAccess {
   @Accessor("field_20641")
   long getSeed();
}
