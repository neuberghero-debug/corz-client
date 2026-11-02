package com.corz.client.mixins;

import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
import gg.corz.lllllIllillllIll;
import net.minecraft.class_1297;
import net.minecraft.class_1937;
import net.minecraft.class_2394;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin({class_1297.class})
public class MixinEntityFarmLag {
   @WrapWithCondition(
      method = {"method_5746()V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_1937;method_8406(Lnet/minecraft/class_2394;DDDDDD)V"
      )}
   )
   private boolean corz$noFarmLagSplash(class_1937 world, class_2394 effect, double x, double y, double z, double vx, double vy, double vz) {
      if (!world.method_8608()) {
         return true;
      } else {
         lllllIllillllIll module = lllllIllillllIll.iiiIlIIIll();
         return module == null || !module.ilIllIiIll((class_1297)this);
      }
   }
}
