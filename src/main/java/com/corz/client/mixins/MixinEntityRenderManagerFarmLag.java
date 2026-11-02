package com.corz.client.mixins;

import gg.corz.lllllIllillllIll;
import net.minecraft.class_1297;
import net.minecraft.class_4604;
import net.minecraft.class_898;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_898.class})
public class MixinEntityRenderManagerFarmLag {
   @Inject(
      method = {"method_3950(Lnet/minecraft/class_1297;Lnet/minecraft/class_4604;DDD)Z"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private <E extends class_1297> void corz$noFarmLagHide(E entity, class_4604 frustum, double x, double y, double z, CallbackInfoReturnable<Boolean> cir) {
      lllllIllillllIll module = lllllIllillllIll.iiiIlIIIll();
      if (module != null && module.ilIllIiIll(entity)) {
         cir.setReturnValue(false);
      }
   }
}
