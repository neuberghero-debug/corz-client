package com.corz.client.mixins;

import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({class_310.class})
public interface AccessorMinecraftClient {
   @Invoker("method_1536")
   boolean corzDoAttack();

   @Accessor("field_1771")
   void corzSetAttackCooldown(int var1);

   @Accessor("field_1771")
   int corzGetAttackCooldown();
}
