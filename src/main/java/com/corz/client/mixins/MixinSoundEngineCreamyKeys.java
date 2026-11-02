package com.corz.client.mixins;

import gg.corz.lIiIIIIiiIiIIIIi;
import net.minecraft.class_4225;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_4225.class})
public class MixinSoundEngineCreamyKeys {
   @Inject(
      method = {"method_19664()V"},
      at = {@At("HEAD")}
   )
   private void corz$creamyKeysRelease(CallbackInfo ci) {
      lIiIIIIiiIiIIIIi.iiiIlIIIll();
   }
}
