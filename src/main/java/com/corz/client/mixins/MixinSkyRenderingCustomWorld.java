package com.corz.client.mixins;

import gg.corz.lIilillliIililll;
import net.minecraft.class_9975;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_9975.class})
public class MixinSkyRenderingCustomWorld {
   @Inject(
      method = {"method_62310(FLnet/minecraft/class_4587;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void corz$hideStars(CallbackInfo ci) {
      lIilillliIililll cw = lIilillliIililll.iiiIlIIIll();
      if (cw != null && cw.IlIllllIll()) {
         ci.cancel();
      }
   }

   @Inject(
      method = {"method_62307(Lnet/minecraft/class_4587;FFFLnet/minecraft/class_12131;FF)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void corz$hideCelestial(CallbackInfo ci) {
      lIilillliIililll cw = lIilillliIililll.iiiIlIIIll();
      if (cw != null && cw.IlIllllIll()) {
         ci.cancel();
      }
   }
}
