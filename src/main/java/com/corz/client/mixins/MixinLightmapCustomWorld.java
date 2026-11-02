package com.corz.client.mixins;

import gg.corz.lIilillliIililll;
import net.minecraft.class_765;
import org.joml.Vector3f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_765.class})
public class MixinLightmapCustomWorld {
   @Shadow
   private boolean field_4135;

   @Inject(
      method = {"method_3314()V"},
      at = {@At("HEAD")},
      require = 0
   )
   private void corz$keepDirty(CallbackInfo ci) {
      lIilillliIililll cw = lIilillliIililll.iiiIlIIIll();
      if (cw != null && cw.ilIllIiIll()) {
         this.field_4135 = true;
      }
   }

   @ModifyVariable(
      method = {"method_3313(F)V"},
      at = @At("STORE"),
      ordinal = 0,
      require = 0
   )
   private Vector3f corz$tintLight(Vector3f original) {
      lIilillliIililll cw = lIilillliIililll.iiiIlIIIll();
      if (cw != null && cw.ilIllIiIll()) {
         int c = cw.IIllllIlll();
         return new Vector3f((float)(c >> 16 & 0xFF) / 255.0F, (float)(c >> 8 & 0xFF) / 255.0F, (float)(c & 0xFF) / 255.0F);
      } else {
         return original;
      }
   }
}
