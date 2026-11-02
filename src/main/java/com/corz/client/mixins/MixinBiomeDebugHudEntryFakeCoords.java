package com.corz.client.mixins;

import gg.corz.IlIllllllIllll;
import net.minecraft.class_11604;
import net.minecraft.class_11630;
import net.minecraft.class_1937;
import net.minecraft.class_2818;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_11604.class})
public abstract class MixinBiomeDebugHudEntryFakeCoords {
   @Inject(
      method = {"method_72751(Lnet/minecraft/class_11630;Lnet/minecraft/class_1937;Lnet/minecraft/class_2818;Lnet/minecraft/class_2818;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void corz$hideBiome(class_11630 lines, class_1937 world, class_2818 clientChunk, class_2818 chunk, CallbackInfo ci) {
      if (IlIllllllIllll.iIlllIllll()) {
         ci.cancel();
      }
   }
}
