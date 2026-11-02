package com.corz.client.mixins;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import gg.corz.iiiliiIiIIIiiiIi;
import net.minecraft.class_10055;
import net.minecraft.class_1007;
import net.minecraft.class_1058;
import net.minecraft.class_11659;
import net.minecraft.class_11890;
import net.minecraft.class_1921;
import net.minecraft.class_4587;
import net.minecraft.class_591;
import net.minecraft.class_630;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_1007.class})
public class MixinPlayerEntityRendererBrainrot {
   @Inject(
      method = {"method_62604(Lnet/minecraft/class_11890;Lnet/minecraft/class_10055;F)V"},
      at = {@At("TAIL")}
   )
   private void corz$captureBrainrot(class_11890 entity, class_10055 state, float tickDelta, CallbackInfo ci) {
      iiiliiIiIIIiiiIi.iIlIlllllill(entity, state);
   }

   @Inject(
      method = {"method_62606(Lnet/minecraft/class_10055;)Z"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void corz$brainrotHidesFeatures(class_10055 state, CallbackInfoReturnable<Boolean> cir) {
      if (iiiliiIiIIIiiiIi.IilliliilIIi(state)) {
         cir.setReturnValue(false);
      }
   }

   @WrapOperation(
      method = {"method_23205(Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;ILnet/minecraft/class_2960;Lnet/minecraft/class_630;Z)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_11659;method_73491(Lnet/minecraft/class_630;Lnet/minecraft/class_4587;Lnet/minecraft/class_1921;IILnet/minecraft/class_1058;)V"
      )}
   )
   private void corz$brainrotArm(
      class_11659 queue, class_630 part, class_4587 matrices, class_1921 layer, int light, int overlay, class_1058 sprite, Operation<Void> original
   ) {
      class_591 model = (class_591)((class_1007)this).method_4038();
      if (!iiiliiIiIIIiiiIi.IIIllIIliIIl(queue, part, matrices, light, part == model.field_3401)) {
         original.call(new Object[]{queue, part, matrices, layer, light, overlay, sprite});
      }
   }
}
