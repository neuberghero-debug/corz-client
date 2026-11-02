package com.corz.client.mixins;

import gg.corz.iliIliIlIiiIliIl;
import gg.corz.llilIllililIll;
import net.minecraft.class_10055;
import net.minecraft.class_1007;
import net.minecraft.class_11659;
import net.minecraft.class_12075;
import net.minecraft.class_4587;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_1007.class})
public class MixinPlayerEntityRenderer {
   @Inject(
      method = {"method_4213(Lnet/minecraft/class_10055;Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;Lnet/minecraft/class_12075;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void corz_cancelPlayerLabel(class_10055 state, class_4587 matrices, class_11659 queue, class_12075 cameraState, CallbackInfo ci) {
      iliIliIlIiiIliIl nameTags = (iliIliIlIiiIliIl)llilIllililIll.iliIiiliiiii(iliIliIlIiiIliIl.class);
      if (nameTags != null && nameTags.IIililIili()) {
         ci.cancel();
      }
   }
}
