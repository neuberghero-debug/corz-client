package com.corz.client.mixins;

import gg.corz.iIiilIIiIliilIIi;
import gg.corz.lIilillliIililll;
import net.minecraft.class_1937;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_1937.class})
public class MixinWorldGradient {
   @Inject(
      method = {"method_8430(F)F"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void corz$rainGradient(float delta, CallbackInfoReturnable<Float> cir) {
      iIiilIIiIliilIIi wc = iIiilIIiIliilIIi.iiiIlIIIll();
      if (wc != null) {
         float wg = wc.lIIlliIIll();
         if (wg != -1.0F) {
            cir.setReturnValue(wg);
            return;
         }
      }

      lIilillliIililll cw = lIilillliIililll.iiiIlIIIll();
      if (cw != null) {
         float g = cw.Ilillllill();
         if (g != -1.0F) {
            cir.setReturnValue(g);
         }
      }
   }

   @Inject(
      method = {"method_8478(F)F"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void corz$thunderGradient(float delta, CallbackInfoReturnable<Float> cir) {
      iIiilIIiIliilIIi wc = iIiilIIiIliilIIi.iiiIlIIIll();
      if (wc != null) {
         float wg = wc.IlIllllIll();
         if (wg != -1.0F) {
            cir.setReturnValue(wg);
            return;
         }
      }

      lIilillliIililll cw = lIilillliIililll.iiiIlIIIll();
      if (cw != null) {
         float g = cw.ilillIiill();
         if (g != -1.0F) {
            cir.setReturnValue(g);
         }
      }
   }
}
