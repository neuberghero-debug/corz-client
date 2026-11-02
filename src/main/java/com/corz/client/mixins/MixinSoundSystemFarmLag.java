package com.corz.client.mixins;

import gg.corz.lllllIllillllIll;
import net.minecraft.class_1113;
import net.minecraft.class_1140;
import net.minecraft.class_1140.class_11518;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_1140.class})
public class MixinSoundSystemFarmLag {
   @Inject(
      method = {"method_4854(Lnet/minecraft/class_1113;)Lnet/minecraft/class_1140$class_11518;"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void corz$noFarmLagMuteSpam(class_1113 sound, CallbackInfoReturnable<class_11518> cir) {
      lllllIllillllIll module = lllllIllillllIll.iiiIlIIIll();
      if (module != null && module.Iillllilll(sound)) {
         cir.setReturnValue(class_11518.field_60956);
      }
   }
}
