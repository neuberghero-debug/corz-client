package com.corz.client.mixins;

import gg.corz.lllllIllillllIll;
import net.minecraft.class_1922;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_761;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_761.class})
public class MixinWorldRendererFarmLag {
   @Inject(
      method = {"method_8570(Lnet/minecraft/class_1922;Lnet/minecraft/class_2338;Lnet/minecraft/class_2680;Lnet/minecraft/class_2680;I)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void corz$noFarmLagSkipRebuild(class_1922 world, class_2338 pos, class_2680 oldState, class_2680 newState, int flags, CallbackInfo ci) {
      if (oldState != newState && oldState.method_26204() == newState.method_26204() && lllllIllillllIll.lllllillll(newState)) {
         ci.cancel();
      }
   }
}
