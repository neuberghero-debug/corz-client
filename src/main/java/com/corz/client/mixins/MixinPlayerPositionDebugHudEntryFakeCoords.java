package com.corz.client.mixins;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import gg.corz.IlIllllllIllll;
import net.minecraft.class_11621;
import net.minecraft.class_2338;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin({class_11621.class})
public abstract class MixinPlayerPositionDebugHudEntryFakeCoords {
   @ModifyExpressionValue(
      method = {"method_72751(Lnet/minecraft/class_11630;Lnet/minecraft/class_1937;Lnet/minecraft/class_2818;Lnet/minecraft/class_2818;)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_1297;method_23317()D"
      )}
   )
   private double corz$fakeX(double x) {
      return IlIllllllIllll.lIIlliIIll(x);
   }

   @ModifyExpressionValue(
      method = {"method_72751(Lnet/minecraft/class_11630;Lnet/minecraft/class_1937;Lnet/minecraft/class_2818;Lnet/minecraft/class_2818;)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_1297;method_23321()D"
      )}
   )
   private double corz$fakeZ(double z) {
      return IlIllllllIllll.IlIllllIll(z);
   }

   @ModifyExpressionValue(
      method = {"method_72751(Lnet/minecraft/class_11630;Lnet/minecraft/class_1937;Lnet/minecraft/class_2818;Lnet/minecraft/class_2818;)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_1297;method_24515()Lnet/minecraft/class_2338;"
      )}
   )
   private class_2338 corz$fakeBlock(class_2338 pos) {
      return IlIllllllIllll.IIllllIlll(pos);
   }
}
