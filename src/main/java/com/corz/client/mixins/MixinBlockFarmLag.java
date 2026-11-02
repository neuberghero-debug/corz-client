package com.corz.client.mixins;

import gg.corz.lllllIllillllIll;
import net.minecraft.class_2248;
import net.minecraft.class_2350;
import net.minecraft.class_2680;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_2248.class})
public class MixinBlockFarmLag {
   @Inject(
      method = {"method_9607(Lnet/minecraft/class_2680;Lnet/minecraft/class_2680;Lnet/minecraft/class_2350;)Z"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void corz$noFarmLagUncull(class_2680 state, class_2680 otherState, class_2350 side, CallbackInfoReturnable<Boolean> cir) {
      if (lllllIllillllIll.lllllillll(otherState)) {
         cir.setReturnValue(true);
      }
   }
}
