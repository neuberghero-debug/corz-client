package com.corz.client.mixins;

import gg.corz.iIlIilIlIllIilIl;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_1937.class})
public class MixinWorldSetBlockState {
   @Inject(
      method = {"method_30092(Lnet/minecraft/class_2338;Lnet/minecraft/class_2680;II)Z"},
      at = {@At("HEAD")}
   )
   private void corzContentHash(class_2338 pos, class_2680 state, int flags, int maxUpdateDepth, CallbackInfoReturnable<Boolean> cir) {
      class_1937 self = (class_1937)this;
      if (self.method_8608()) {
         class_2680 old = self.method_8320(pos);
         if (old != state) {
            iIlIilIlIllIilIl.lIIiiiIIii(pos, old, state);
         }
      }
   }
}
