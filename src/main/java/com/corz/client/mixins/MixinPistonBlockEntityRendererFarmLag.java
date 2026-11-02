package com.corz.client.mixins;

import gg.corz.lllllIllillllIll;
import net.minecraft.class_11968;
import net.minecraft.class_243;
import net.minecraft.class_2669;
import net.minecraft.class_835;
import net.minecraft.class_11683.class_11792;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_835.class})
public class MixinPistonBlockEntityRendererFarmLag {
   @Inject(
      method = {"method_74380(Lnet/minecraft/class_2669;Lnet/minecraft/class_11968;FLnet/minecraft/class_243;Lnet/minecraft/class_11683$class_11792;)V"},
      at = {@At("TAIL")}
   )
   private void corz$noFarmLagSnapPiston(class_2669 piston, class_11968 state, float tickDelta, class_243 cameraPos, class_11792 crumbling, CallbackInfo ci) {
      lllllIllillllIll module = lllllIllillllIll.iiiIlIIIll();
      if (module != null && module.iIlllIllll()) {
         state.field_62731 = 0.0F;
         state.field_62732 = 0.0F;
         state.field_62733 = 0.0F;
      }
   }
}
