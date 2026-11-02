package com.corz.client.mixins;

import gg.corz.IllIlIIilllIlIIi;
import net.minecraft.class_1140;
import net.minecraft.class_3419;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_1140.class})
public class MixinSoundSystemThemeMusic {
   @Inject(
      method = {"method_19762()V"},
      at = {@At("TAIL")}
   )
   private void corz$keepThemeMusicParked(CallbackInfo ci) {
      IllIlIIilllIlIIi.IiIlliIliiIl();
   }

   @Inject(
      method = {"method_43222(FLnet/minecraft/class_3419;)F"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void corz$duckMusicUnderTheme(float volume, class_3419 category, CallbackInfoReturnable<Float> cir) {
      if (category == class_3419.field_15253) {
         float duck = IllIlIIilllIlIIi.IIlllIlliIll();
         if (duck < 1.0F) {
            cir.setReturnValue(cir.getReturnValueF() * duck);
         }
      }
   }
}
