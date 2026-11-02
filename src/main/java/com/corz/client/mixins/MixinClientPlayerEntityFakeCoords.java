package com.corz.client.mixins;

import gg.corz.IlIllllllIllll;
import net.minecraft.class_2561;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin({class_746.class})
public abstract class MixinClientPlayerEntityFakeCoords {
   @ModifyVariable(
      method = {"method_7353(Lnet/minecraft/class_2561;Z)V"},
      at = @At("HEAD"),
      argsOnly = true
   )
   private class_2561 corz$fakeCoordsInClientChat(class_2561 message) {
      return IlIllllllIllll.lllllillll(message);
   }
}
