package com.corz.client.mixins;

import gg.corz.IiiIlllliiIlll;
import gg.corz.llilIllililIll;
import net.minecraft.class_11908;
import net.minecraft.class_309;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_309.class})
public class MixinKeyboard {
   @Inject(
      method = {"method_1466(JILnet/minecraft/class_11908;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onKey(long window, int action, class_11908 input, CallbackInfo ci) {
      IiiIlllliiIlll event = new IiiIlllliiIlll(input.comp_4795(), action);
      llilIllililIll.IiIiliIiiiIi(event);
      if (event.iIlIlllllill()) {
         ci.cancel();
      }
   }
}
