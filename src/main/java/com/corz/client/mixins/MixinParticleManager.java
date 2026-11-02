package com.corz.client.mixins;

import gg.corz.lIiiliIliIiiliIl;
import gg.corz.liIIllIiiiIIllIi;
import gg.corz.llilIllililIll;
import gg.corz.lllllIllillllIll;
import net.minecraft.class_1297;
import net.minecraft.class_2394;
import net.minecraft.class_2398;
import net.minecraft.class_702;
import net.minecraft.class_703;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_702.class})
public class MixinParticleManager {
   @Inject(
      method = {"method_3061(Lnet/minecraft/class_1297;Lnet/minecraft/class_2394;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void corz$hideVanillaCrits2(class_1297 entity, class_2394 effect, CallbackInfo ci) {
      if (corz$isVanillaCrit(effect)) {
         ci.cancel();
      }
   }

   @Inject(
      method = {"method_3051(Lnet/minecraft/class_1297;Lnet/minecraft/class_2394;I)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void corz$hideVanillaCrits3(class_1297 entity, class_2394 effect, int maxAge, CallbackInfo ci) {
      if (corz$isVanillaCrit(effect)) {
         ci.cancel();
      }
   }

   @Unique
   private static boolean corz$isVanillaCrit(class_2394 effect) {
      if (effect == null) {
         return false;
      } else if (effect.method_10295() != class_2398.field_11205 && effect.method_10295() != class_2398.field_11208) {
         return false;
      } else {
         liIIllIiiiIIllIi particles = (liIIllIiiiIIllIi)llilIllililIll.iliIiiliiiii(liIIllIiiiIIllIi.class);
         return particles != null && particles.iiiIlIIIll();
      }
   }

   @Inject(
      method = {"method_3056(Lnet/minecraft/class_2394;DDDDDD)Lnet/minecraft/class_703;"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onAddParticle(
      class_2394 parameters, double x, double y, double z, double velocityX, double velocityY, double velocityZ, CallbackInfoReturnable<class_703> cir
   ) {
      lllllIllillllIll farmLag = lllllIllillllIll.iiiIlIIIll();
      if (farmLag != null && farmLag.IIllllIlll() && parameters.method_10295() == class_2398.field_11224) {
         cir.setReturnValue(null);
      } else if (farmLag == null
         || !farmLag.liIlliiIll()
         || parameters.method_10295() != class_2398.field_11236 && parameters.method_10295() != class_2398.field_11221) {
         lIiiliIliIiiliIl module = (lIiiliIliIiiliIl)llilIllililIll.iliIiiliiiii(lIiiliIliIiiliIl.class);
         if (module != null && module.IliIlllilIi()) {
            if (parameters.method_10295() == class_2398.field_11236 || parameters.method_10295() == class_2398.field_11221) {
               if (module.iiiIlIIIll()) {
                  cir.setReturnValue(null);
                  return;
               }

               if (module.lIIlliIIll()) {
                  cir.setReturnValue(null);
               }
            }
         }
      } else {
         cir.setReturnValue(null);
      }
   }
}
