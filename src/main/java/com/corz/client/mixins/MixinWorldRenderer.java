package com.corz.client.mixins;

import gg.corz.lIiiliIliIiiliIl;
import gg.corz.llilIllililIll;
import net.minecraft.class_1297;
import net.minecraft.class_2338;
import net.minecraft.class_638;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_638.class})
public class MixinWorldRenderer {
   @Inject(
      method = {"method_8444(Lnet/minecraft/class_1297;ILnet/minecraft/class_2338;I)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onProcessWorldEvent(class_1297 source, int eventId, class_2338 pos, int data, CallbackInfo ci) {
      lIiiliIliIiiliIl module = (lIiiliIliIiiliIl)llilIllililIll.iliIiiliiiii(lIiiliIliIiiliIl.class);
      if (module != null && module.IliIlllilIi()) {
         if (eventId == 2003 && module.lIIlliIIll()) {
            ci.cancel();
         }
      }
   }
}
