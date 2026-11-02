package com.corz.client.mixins;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import gg.corz.lllllIllillllIll;
import net.minecraft.class_2464;
import net.minecraft.class_2680;
import net.minecraft.class_9810;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin({class_9810.class})
public class MixinSectionBuilderFarmLag {
   @WrapOperation(
      method = {"method_60904(Lnet/minecraft/class_4076;Lnet/minecraft/class_853;Lnet/minecraft/class_8251;Lnet/minecraft/class_750;)Lnet/minecraft/class_9810$class_9811;"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_2680;method_26217()Lnet/minecraft/class_2464;"
      )}
   )
   private class_2464 corz$noFarmLagRedstone(class_2680 state, Operation<class_2464> original) {
      return lllllIllillllIll.lllllillll(state) ? class_2464.field_11455 : (class_2464)original.call(new Object[]{state});
   }
}
