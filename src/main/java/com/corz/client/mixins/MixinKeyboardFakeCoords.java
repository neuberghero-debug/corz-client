package com.corz.client.mixins;

import gg.corz.IlIllllllIllll;
import net.minecraft.class_309;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin({class_309.class})
public abstract class MixinKeyboardFakeCoords {
   @ModifyArg(
      method = {"method_1468(Lnet/minecraft/class_11908;)Z", "method_1475(Lnet/minecraft/class_2680;Lnet/minecraft/class_2338;Lnet/minecraft/class_2487;)V", "method_1469(Lnet/minecraft/class_2960;Lnet/minecraft/class_243;Lnet/minecraft/class_2487;)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_309;method_1455(Ljava/lang/String;)V"
      )
   )
   private String corz$fakeCopiedCoords(String text) {
      return IlIllllllIllll.iilllIIill(text);
   }
}
