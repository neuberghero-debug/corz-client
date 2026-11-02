package com.corz.client.mixins;

import gg.corz.Ilillllill;
import gg.corz.ilIllIiIll;
import gg.corz.liIlliIiiiIlliIi;
import gg.corz.llilIllililIll;
import net.minecraft.class_10017;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_238;
import net.minecraft.class_897;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_897.class})
public class MixinEntityRenderer<T extends class_1297> {
   @Inject(
      method = {"method_62358(Lnet/minecraft/class_1297;)Lnet/minecraft/class_238;"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void onGetBoundingBox(T entity, CallbackInfoReturnable<class_238> cir) {
      if (entity != ilIllIiIll.Iiiilllliiilll.field_1724) {
         if (entity instanceof class_1657) {
            Ilillllill autoTrap = (Ilillllill)llilIllililIll.iliIiiliiiii(Ilillllill.class);
            if (autoTrap != null && autoTrap.IliIlllilIi() && autoTrap.iiiIlIIIll() > 0.0) {
               class_238 box = (class_238)cir.getReturnValue();
               if (box != null) {
                  cir.setReturnValue(box.method_1014(autoTrap.iiiIlIIIll()));
               }
            }
         }
      }
   }

   @Inject(
      method = {"method_62354(Lnet/minecraft/class_1297;Lnet/minecraft/class_10017;F)V"},
      at = {@At("TAIL")}
   )
   private void corz_maskNameLabel(class_1297 entity, class_10017 state, float tickDelta, CallbackInfo ci) {
      if (state.field_53337 != null) {
         if (entity == ilIllIiIll.Iiiilllliiilll.field_1724 || liIlliIiiiIlliIi.ilIllIiIll()) {
            state.field_53337 = liIlliIiiiIlliIi.iilllIIill(state.field_53337);
         }
      }
   }
}
