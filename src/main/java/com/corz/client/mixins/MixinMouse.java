package com.corz.client.mixins;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import gg.corz.IIilllilIillli;
import gg.corz.IiiiIIIlliiiIIIl;
import gg.corz.iIIlIllIlIlIll;
import gg.corz.iilIIlilIIiIIlil;
import gg.corz.llilIllililIll;
import net.minecraft.class_1041;
import net.minecraft.class_11910;
import net.minecraft.class_312;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_312.class})
public class MixinMouse {
   @Shadow
   private double field_1795;
   @Shadow
   private double field_1794;
   @Shadow
   private double field_1789;
   @Shadow
   private double field_1787;
   @Unique
   private double corz$cursorDeltaXBefore;
   @Unique
   private double corz$cursorDeltaYBefore;

   @Inject(
      method = {"method_1600(JDD)V"},
      at = {@At("HEAD")}
   )
   private void onCursorPos(long window, double newX, double newY, CallbackInfo ci) {
      this.corz$cursorDeltaXBefore = this.field_1789;
      this.corz$cursorDeltaYBefore = this.field_1787;
   }

   @Inject(
      method = {"method_1600(JDD)V"},
      at = {@At("RETURN")}
   )
   private void corzAfterCursorPos(long window, double newX, double newY, CallbackInfo ci) {
      double deltaX = this.field_1789 - this.corz$cursorDeltaXBefore;
      double deltaY = this.field_1787 - this.corz$cursorDeltaYBefore;
      if (deltaX != 0.0 || deltaY != 0.0) {
         IIilllilIillli event = new IIilllilIillli(deltaX, deltaY);
         llilIllililIll.Iiilliiliiil(event);
      }
   }

   @Inject(
      method = {"method_1598(JDD)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onMouseScroll(long window, double horizontal, double vertical, CallbackInfo ci) {
      iilIIlilIIiIIlil event = new iilIIlilIIiIIlil(vertical);
      llilIllililIll.IlIillIiilIi(event);
      if (event.liiiIIllIl()) {
         ci.cancel();
      }
   }

   @Inject(
      method = {"method_1601(JLnet/minecraft/class_11910;I)V"},
      at = {@At("HEAD")}
   )
   private void onMouseButton(long window, class_11910 input, int action, CallbackInfo ci) {
      IiiiIIIlliiiIIIl event = new IiiiIIIlliiiIIIl(input.comp_4801(), action);
      llilIllililIll.IIIilIIiiIIi(event);
   }

   @ModifyReturnValue(
      method = {"method_68879(Lnet/minecraft/class_1041;)D"},
      at = {@At("RETURN")}
   )
   private double corz$gui3dScaledX(double original, class_1041 window) {
      return iIIlIllIlIlIll.lliililiil(original, this.field_1794, window);
   }

   @ModifyReturnValue(
      method = {"method_68883(Lnet/minecraft/class_1041;)D"},
      at = {@At("RETURN")}
   )
   private double corz$gui3dScaledY(double original, class_1041 window) {
      return iIIlIllIlIlIll.Iiiilliiil(this.field_1795, original, window);
   }
}
