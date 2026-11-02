package com.corz.client.mixins;

import gg.corz.iIIliiiIlIliii;
import gg.corz.liIlIIIliiIlIIIl;
import net.minecraft.class_9919;
import net.minecraft.class_9919.class_10601;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_9919.class})
public class MixinInactivityFpsLimiter {
   @Inject(
      method = {"method_66514()Lnet/minecraft/class_9919$class_10601;"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void corzBotKeepsFrames(CallbackInfoReturnable<class_10601> cir) {
      if (iIIliiiIlIliii.iIlIlllllill()) {
         cir.setReturnValue(class_10601.field_55843);
      } else if (liIlIIIliiIlIIIl.IliIlllilIi()) {
         cir.setReturnValue(class_10601.field_55843);
      }
   }
}
