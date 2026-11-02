package com.corz.client.mixins;

import gg.corz.lllIIlIlillIIlIl;
import net.minecraft.class_757;
import net.minecraft.class_9779;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_757.class})
public abstract class MixinGameRendererMotionBlur {
   @Inject(
      method = {"method_3188(Lnet/minecraft/class_9779;)V"},
      at = {@At("TAIL")}
   )
   private void corz$motionBlurWorldDrawn(class_9779 tickCounter, CallbackInfo ci) {
      lllIIlIlillIIlIl.iiiIlIIIll();
   }

   @Inject(
      method = {"method_3192(Lnet/minecraft/class_9779;Z)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_758;method_71108()V"
      )}
   )
   private void corz$motionBlurBeforeHud(class_9779 tickCounter, boolean tick, CallbackInfo ci) {
      lllIIlIlillIIlIl.lIIlliIIll();
   }
}
