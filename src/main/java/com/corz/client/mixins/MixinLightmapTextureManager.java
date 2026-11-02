package com.corz.client.mixins;

import gg.corz.iiilIIIiIIIiIIIi;
import gg.corz.llilIllililIll;
import net.minecraft.class_765;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin({class_765.class})
public class MixinLightmapTextureManager {
   @ModifyArg(
      method = {"method_3313(F)V"},
      at = @At(
         value = "INVOKE",
         target = "Lcom/mojang/blaze3d/buffers/Std140Builder;putFloat(F)Lcom/mojang/blaze3d/buffers/Std140Builder;",
         ordinal = 0
      )
   )
   private float corz$forceAmbientLightFactor(float ambientLightFactor) {
      iiilIIIiIIIiIIIi fullbright = (iiilIIIiIIIiIIIi)llilIllililIll.iliIiiliiiii(iiilIIIiIIIiIIIi.class);
      return fullbright != null && fullbright.IliIlllilIi() ? 1.0F : ambientLightFactor;
   }
}
