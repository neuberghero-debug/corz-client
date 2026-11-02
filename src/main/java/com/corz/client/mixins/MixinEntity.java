package com.corz.client.mixins;

import gg.corz.IllIillllllIilll;
import gg.corz.iIIilIIiIlIilIIi;
import gg.corz.iIIlIllIlIlIll;
import gg.corz.iIiIliiIliIlii;
import gg.corz.iIiIlillIliIlill;
import gg.corz.iIlIilIlIllIilIl;
import gg.corz.ilIiIiiIiIiIii;
import gg.corz.ilIiiIiIii;
import gg.corz.iliiiiIiIiiiiiIi;
import gg.corz.lilIliIiiilIliIi;
import gg.corz.llilIllililIll;
import gg.corz.lliliiiililiii;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_1297.class})
public class MixinEntity {
   @Shadow
   protected static class_243 method_18795(class_243 movementInput, float speed, float yaw) {
      throw new AssertionError("shadow");
   }

   @Inject(
      method = {"method_5862()Z"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onDoesRenderOnFire(CallbackInfoReturnable<Boolean> cir) {
      iliiiiIiIiiiiiIi noFlame = (iliiiiIiIiiiiiIi)llilIllililIll.iliIiiliiiii(iliiiiIiIiiiiiIi.class);
      if (noFlame != null && noFlame.IliIlllilIi()) {
         cir.setReturnValue(false);
      }
   }

   @Inject(
      method = {"method_5851()Z"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onIsGlowing(CallbackInfoReturnable<Boolean> cir) {
      class_1297 self = (class_1297)this;
      IllIillllllIilll playerESP = (IllIillllllIilll)llilIllililIll.iliIiiliiiii(IllIillllllIilll.class);
      if (playerESP != null && playerESP.iiiIlIIIll(self)) {
         cir.setReturnValue(true);
      }
   }

   @Inject(
      method = {"method_22861()I"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onGetTeamColorValue(CallbackInfoReturnable<Integer> cir) {
      class_1297 self = (class_1297)this;
      IllIillllllIilll playerESP = (IllIillllllIilll)llilIllililIll.iliIiiliiiii(IllIillllllIilll.class);
      if (playerESP != null && playerESP.iiiIlIIIll(self)) {
         cir.setReturnValue(playerESP.lIIlliIIll());
      }
   }

   @Inject(
      method = {"method_5756(Lnet/minecraft/class_1657;)Z"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void corzFreecamSeeOwnBody(class_1657 viewer, CallbackInfoReturnable<Boolean> cir) {
      class_310 mc = class_310.method_1551();
      if (mc.field_1724 != null && this == mc.field_1724 && viewer == mc.field_1724) {
         if (lilIliIiiilIliIi.lIIlliIIll() || iIIlIllIlIlIll.IIIllIIliIIl()) {
            cir.setReturnValue(false);
         }
      }
   }

   @Inject(
      method = {"method_5871()F"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onGetTargetingMargin(CallbackInfoReturnable<Float> cir) {
      ilIiIiiIiIiIii hitBoxes = (ilIiIiiIiIiIii)llilIllililIll.iliIiiliiiii(ilIiIiiIiIiIii.class);
      if (hitBoxes != null && hitBoxes.IliIlllilIi()) {
         class_1297 self = (class_1297)this;
         if (self != class_310.method_1551().field_1724) {
            if (hitBoxes.lIIlliIIll() ? self instanceof class_1657 : self instanceof class_1309) {
               cir.setReturnValue(hitBoxes.iiiIlIIIll());
            }
         }
      }
   }

   @Inject(
      method = {"method_5872(DD)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onChangeLookDirection(double cursorDeltaX, double cursorDeltaY, CallbackInfo ci) {
      if (this == class_310.method_1551().field_1724) {
         if (lilIliIiiilIliIi.iiiIlIIIll()) {
            lilIliIiiilIliIi.IIiillIiil().lIliliIlil(cursorDeltaX, cursorDeltaY);
            ci.cancel();
         } else {
            iIiIlillIliIlill silentAim = (iIiIlillIliIlill)llilIllililIll.iliIiiliiiii(iIiIlillIliIlill.class);
            if (silentAim != null && silentAim.iIlllIllll()) {
               silentAim.lllllillll(cursorDeltaX, cursorDeltaY);
               ci.cancel();
            } else {
               iIIilIIiIlIilIIi freelook = (iIIilIIiIlIilIIi)llilIllililIll.iliIiiliiiii(iIIilIIiIlIilIIi.class);
               if (freelook != null && freelook.IliIlllilIi()) {
                  freelook.iiiIlIIIll(cursorDeltaX, cursorDeltaY);
                  ci.cancel();
               } else {
                  if (iIlIilIlIllIilIl.illliiIillii()) {
                     iIlIilIlIllIilIl.lilliiiillii(cursorDeltaX, cursorDeltaY);
                     ci.cancel();
                  }

                  if (!ci.isCancelled() && iIiIliiIliIlii.Iillllilll()) {
                     iIiIliiIliIlii.iilllIIill(cursorDeltaX, cursorDeltaY);
                     ci.cancel();
                  }

                  if (!ci.isCancelled() && lliliiiililiii.Iillllilll()) {
                     ci.cancel();
                  }
               }
            }
         }
      }
   }

   @Redirect(
      method = {"method_5724(FLnet/minecraft/class_243;)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_1297;method_18795(Lnet/minecraft/class_243;FF)Lnet/minecraft/class_243;"
      )
   )
   private class_243 corzMoveFix(class_243 input, float speed, float yaw) {
      if (ilIiiIiIii.IIlllIlliIll() && this == class_310.method_1551().field_1724) {
         float serverYaw = ilIiiIiIii.Iilllilliill();
         return method_18795(input, speed, serverYaw);
      } else {
         return method_18795(input, speed, yaw);
      }
   }
}
