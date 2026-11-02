package com.corz.client.mixins;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import gg.corz.Iiiilillliiilill;
import gg.corz.IlIIIillIIIi;
import gg.corz.iIIlIllIlIlIll;
import gg.corz.iliiiiIiIiiiiiIi;
import gg.corz.llilIllililIll;
import net.minecraft.class_1058;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_4603;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_4603.class})
public class MixinInGameOverlayRenderer {
   @Inject(
      method = {"method_23070(Lnet/minecraft/class_4587;Lnet/minecraft/class_4597;Lnet/minecraft/class_1058;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void onRenderFireOverlay(class_4587 matrices, class_4597 vertexConsumers, class_1058 sprite, CallbackInfo ci) {
      iliiiiIiIiiiiiIi noFlame = (iliiiiIiIiiiiiIi)llilIllililIll.iliIiiliiiii(iliiiiIiIiiiiiIi.class);
      Iiiilillliiilill customFlame = (Iiiilillliiilill)llilIllililIll.iliIiiliiiii(Iiiilillliiilill.class);
      boolean firstPerson = true;
      class_310 client = class_310.method_1551();
      if (client != null && client.field_1690 != null && client.field_1690.method_31044() != null) {
         firstPerson = client.field_1690.method_31044().method_31034();
      }

      boolean cancel = IlIIIillIIIi.IlIillIiilIi(
         customFlame != null && customFlame.IliIlllilIi(),
         customFlame != null && customFlame.iiiIlIIIll(),
         firstPerson,
         noFlame != null && noFlame.IliIlllilIi()
      );
      if (cancel) {
         ci.cancel();
      }
   }

   @ModifyExpressionValue(
      method = {"method_23067(ZFLnet/minecraft/class_11659;)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_5498;method_31034()Z"
      )}
   )
   private boolean corz$gui3dOverlays(boolean isFirstPerson) {
      return isFirstPerson && !iIIlIllIlIlIll.IIIllIIliIIl();
   }
}
