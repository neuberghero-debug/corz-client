package com.corz.client.mixins;

import net.minecraft.class_636;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({class_636.class})
public interface AccessorClientPlayerInteractionManager {
   @Accessor("field_3716")
   void setBlockBreakingCooldown(int var1);

   @Accessor("field_3716")
   int getBlockBreakingCooldown();

   @Accessor("field_3715")
   float corzBreakingProgress();

   @Invoker("method_2911")
   void corzSyncSelectedSlot();
}
