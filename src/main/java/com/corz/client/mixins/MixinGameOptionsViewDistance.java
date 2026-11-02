package com.corz.client.mixins;

import gg.corz.lIilillliIililll;
import net.minecraft.class_315;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_315.class})
public class MixinGameOptionsViewDistance {
   @Inject(
      method = {"method_38521()I"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void corz$clampViewDistance(CallbackInfoReturnable<Integer> cir) {
      lIilillliIililll cw = lIilillliIililll.iiiIlIIIll();
      if (cw != null && cw.liIlliiIll()) {
         int original = cir.getReturnValueI();
         int chunks = Math.max(2, (int)(cw.Iillllilll() / 16.0F));
         cir.setReturnValue(Math.min(chunks, original));
      }
   }
}
