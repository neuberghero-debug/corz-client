package com.corz.client.mixins;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import gg.corz.llliIIllilliIIll;
import net.minecraft.class_10055;
import net.minecraft.class_11659;
import net.minecraft.class_1799;
import net.minecraft.class_1921;
import net.minecraft.class_3879;
import net.minecraft.class_4587;
import net.minecraft.class_972;
import net.minecraft.class_10186.class_10190;
import net.minecraft.class_11683.class_11792;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;

@Mixin({class_972.class})
public abstract class MixinCapeFeatureRenderer {
   @Shadow
   private boolean method_64257(class_1799 stack, class_10190 layerType) {
      throw new AssertionError();
   }

   @WrapOperation(
      method = {"method_4177(Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;ILnet/minecraft/class_10055;FF)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_11659;method_73489(Lnet/minecraft/class_3879;Ljava/lang/Object;Lnet/minecraft/class_4587;Lnet/minecraft/class_1921;IIILnet/minecraft/class_11683$class_11792;)V"
      )}
   )
   private void corz$submitCape3d(
      class_11659 queue,
      class_3879<?> model,
      Object state,
      class_4587 matrices,
      class_1921 layer,
      int light,
      int overlay,
      int outline,
      class_11792 crumbling,
      Operation<Void> original
   ) {
      if (state instanceof class_10055 s
         && llliIIllilliIIll.lIiiIiIlilli(s)
         && llliIIllilliIIll.iliIiiliiiii(queue, model, s, matrices, layer, light, overlay, outline, this.method_64257(s.field_53418, class_10190.field_54125))
         )
       {
         return;
      }

      original.call(new Object[]{queue, model, state, matrices, layer, light, overlay, outline, crumbling});
   }
}
