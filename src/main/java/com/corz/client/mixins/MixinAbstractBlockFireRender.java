package com.corz.client.mixins;

import gg.corz.Iiiilillliiilill;
import net.minecraft.class_2464;
import net.minecraft.class_2680;
import net.minecraft.class_4770;
import net.minecraft.class_4970;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_4970.class})
public class MixinAbstractBlockFireRender {
   @Inject(
      method = {"method_9604(Lnet/minecraft/class_2680;)Lnet/minecraft/class_2464;"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void corz_hideFireForCustomFlame(class_2680 state, CallbackInfoReturnable<class_2464> cir) {
      if (this instanceof class_4770 && Iiiilillliiilill.lIIlliIIll()) {
         cir.setReturnValue(class_2464.field_11455);
      }
   }
}
