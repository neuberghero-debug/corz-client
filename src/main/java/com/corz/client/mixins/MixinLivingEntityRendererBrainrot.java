package com.corz.client.mixins;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import gg.corz.iiiliiIiIIIiiiIi;
import net.minecraft.class_10055;
import net.minecraft.class_1058;
import net.minecraft.class_11659;
import net.minecraft.class_1921;
import net.minecraft.class_3879;
import net.minecraft.class_4587;
import net.minecraft.class_922;
import net.minecraft.class_11683.class_11792;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin({class_922.class})
public class MixinLivingEntityRendererBrainrot {
   @WrapOperation(
      method = {"method_4054(Lnet/minecraft/class_10042;Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;Lnet/minecraft/class_12075;)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_11659;method_73490(Lnet/minecraft/class_3879;Ljava/lang/Object;Lnet/minecraft/class_4587;Lnet/minecraft/class_1921;IIILnet/minecraft/class_1058;ILnet/minecraft/class_11683$class_11792;)V"
      )}
   )
   private void corz$brainrotBody(
      class_11659 queue,
      class_3879<?> model,
      Object state,
      class_4587 matrices,
      class_1921 layer,
      int light,
      int overlay,
      int color,
      class_1058 sprite,
      int outline,
      class_11792 crumbling,
      Operation<Void> original
   ) {
      if (state instanceof class_10055 s && iiiliiIiIIIiiiIi.lIiiIiIlilli(queue, s, matrices, layer, light, overlay, color, outline)) {
         return;
      }

      original.call(new Object[]{queue, model, state, matrices, layer, light, overlay, color, sprite, outline, crumbling});
   }
}
