package com.corz.client.mixins;

import gg.corz.liIlliIiiiIlliIi;
import net.minecraft.class_2561;
import net.minecraft.class_327;
import net.minecraft.class_5348;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin({class_327.class})
public class MixinTextRendererNameProtect {
   @ModifyVariable(
      method = {"method_27525(Lnet/minecraft/class_5348;)I"},
      at = @At("HEAD"),
      argsOnly = true,
      require = 0
   )
   private class_5348 corz_maskMeasuredName(class_5348 text) {
      if (text instanceof class_2561 t && liIlliIiiiIlliIi.ilIllIiIll()) {
         return liIlliIiiiIlliIi.iilllIIill(t);
      }

      return text;
   }
}
