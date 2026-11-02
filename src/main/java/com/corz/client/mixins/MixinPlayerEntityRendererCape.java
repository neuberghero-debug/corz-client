package com.corz.client.mixins;

import gg.corz.llliIIllilliIIll;
import net.minecraft.class_10055;
import net.minecraft.class_1007;
import net.minecraft.class_11890;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_1007.class})
public class MixinPlayerEntityRendererCape {
   @Inject(
      method = {"method_62604(Lnet/minecraft/class_11890;Lnet/minecraft/class_10055;F)V"},
      at = {@At("TAIL")}
   )
   private void corz$captureCape3d(class_11890 entity, class_10055 state, float tickDelta, CallbackInfo ci) {
      llliIIllilliIIll.IilliliilIIi(entity, state, tickDelta);
   }
}
