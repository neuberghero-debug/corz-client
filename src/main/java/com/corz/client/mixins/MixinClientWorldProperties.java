package com.corz.client.mixins;

import gg.corz.lIilillliIililll;
import net.minecraft.class_638.class_5271;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_5271.class})
public class MixinClientWorldProperties {
   @Inject(
      method = {"method_217()J"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void corz$timeOfDay(CallbackInfoReturnable<Long> cir) {
      lIilillliIililll cw = lIilillliIililll.iiiIlIIIll();
      if (cw != null) {
         cir.setReturnValue(cw.lIilliIill(cir.getReturnValueJ()));
      }
   }
}
