package com.corz.client.mixins;

import gg.corz.IliiIilliiIi;
import net.minecraft.class_10868;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_10868.class})
public class MixinGlTexture {
   @Inject(
      at = {@At("HEAD")},
      method = {"close()V"}
   )
   private void corz$flushBeforeClose(CallbackInfo ci) {
      IliiIilliiIi.illIlIilIl();
   }
}
