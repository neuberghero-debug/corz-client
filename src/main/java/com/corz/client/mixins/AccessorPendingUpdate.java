package com.corz.client.mixins;

import net.minecraft.class_2680;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(
   targets = {"net/minecraft/class_7202$class_7203"}
)
public interface AccessorPendingUpdate {
   @Accessor("field_37958")
   class_2680 corzServerState();

   @Accessor("field_37957")
   int corzSequence();
}
