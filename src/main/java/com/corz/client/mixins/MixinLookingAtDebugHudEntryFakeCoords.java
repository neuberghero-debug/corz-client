package com.corz.client.mixins;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import gg.corz.IlIllllllIllll;
import net.minecraft.class_11615;
import net.minecraft.class_11617;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin({class_11615.class, class_11617.class})
public abstract class MixinLookingAtDebugHudEntryFakeCoords {
   @ModifyExpressionValue(
      method = {"method_72751(Lnet/minecraft/class_11630;Lnet/minecraft/class_1937;Lnet/minecraft/class_2818;Lnet/minecraft/class_2818;)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_2338;method_10263()I"
      )}
   )
   private int corz$fakeX(int x) {
      return IlIllllllIllll.ilIllIiIll(x);
   }

   @ModifyExpressionValue(
      method = {"method_72751(Lnet/minecraft/class_11630;Lnet/minecraft/class_1937;Lnet/minecraft/class_2818;Lnet/minecraft/class_2818;)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_2338;method_10260()I"
      )}
   )
   private int corz$fakeZ(int z) {
      return IlIllllllIllll.liIlliiIll(z);
   }
}
