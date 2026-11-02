package com.corz.client.mixins;

import gg.corz.IilillIililillIi;
import gg.corz.iIllIiilIlllIiil;
import gg.corz.ilIllIiIll;
import gg.corz.llilIllililIll;
import net.minecraft.class_1657;
import net.minecraft.class_2680;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_1657.class})
public abstract class MixinPlayerEntity {
   @Inject(
      method = {"method_7351(Lnet/minecraft/class_2680;)F"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void corzFastbreak(class_2680 block, CallbackInfoReturnable<Float> cir) {
      if (this == ilIllIiIll.Iiiilllliiilll.field_1724) {
         iIllIiilIlllIiil m = (iIllIiilIlllIiil)llilIllililIll.iliIiiliiiii(iIllIiilIlllIiil.class);
         if (m != null && m.IliIlllilIi() && m.lIIlliIIll()) {
            cir.setReturnValue(cir.getReturnValueF() * m.iiiIlIIIll());
         }
      }
   }

   @Inject(
      method = {"method_55755()D"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void corzReach(CallbackInfoReturnable<Double> cir) {
      if (this == ilIllIiIll.Iiiilllliiilll.field_1724) {
         IilillIililillIi m = (IilillIililillIi)llilIllililIll.iliIiiliiiii(IilillIililillIi.class);
         if (m != null && m.IliIlllilIi()) {
            double range = m.iiiIlIIIll();
            if (range > cir.getReturnValueD()) {
               cir.setReturnValue(range);
            }
         }
      }
   }
}
