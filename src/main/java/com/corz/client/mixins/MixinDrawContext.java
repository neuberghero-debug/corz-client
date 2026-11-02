package com.corz.client.mixins;

import gg.corz.iIIiilIiIlIiilIi;
import gg.corz.liIlliIiiiIlliIi;
import net.minecraft.class_2561;
import net.minecraft.class_332;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_332.class})
public class MixinDrawContext {
   @Inject(
      method = {"method_44379(IIII)V"},
      at = {@At("HEAD")}
   )
   private void corz_enableScissor(int x1, int y1, int x2, int y2, CallbackInfo ci) {
      iIIiilIiIlIiilIi.IliIlllilIi(x1, y1, x2, y2);
   }

   @Inject(
      method = {"method_44380()V"},
      at = {@At("HEAD")}
   )
   private void corz_disableScissor(CallbackInfo ci) {
      iIIiilIiIlIiilIi.liiiIIllIl();
   }

   @ModifyVariable(
      method = {"method_51439(Lnet/minecraft/class_327;Lnet/minecraft/class_2561;IIIZ)V"},
      at = @At("HEAD"),
      argsOnly = true,
      index = 2
   )
   private class_2561 corz_maskDrawnName(class_2561 text) {
      return liIlliIiiiIlliIi.iilllIIill(text);
   }
}
