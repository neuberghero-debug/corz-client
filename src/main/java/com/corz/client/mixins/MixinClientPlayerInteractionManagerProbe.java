package com.corz.client.mixins;

import gg.corz.iIllIiilIlllIiil;
import gg.corz.llilIllililIll;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_636;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_636.class})
public abstract class MixinClientPlayerInteractionManagerProbe {
   @Inject(
      method = {"method_2899(Lnet/minecraft/class_2338;)Z"},
      at = {@At("HEAD")}
   )
   private void corzOnBreakBlock(class_2338 pos, CallbackInfoReturnable<Boolean> cir) {
      iIllIiilIlllIiil fb = (iIllIiilIlllIiil)llilIllililIll.iliIiiliiiii(iIllIiilIlllIiil.class);
      if (fb != null && fb.IliIlllilIi() && fb.IlIllllIll()) {
         class_310 mc = class_310.method_1551();
         if (mc.field_1687 != null) {
            class_2680 original = mc.field_1687.method_8320(pos);
            if (!original.method_26215()) {
               fb.ilIllIiIll(pos.method_10062(), original);
            }
         }
      }
   }
}
