package com.corz.client.mixins;

import gg.corz.Iiiilillliiilill;
import net.minecraft.class_1937;
import net.minecraft.class_2394;
import net.minecraft.class_4770;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({class_4770.class})
public class MixinAbstractFireBlock {
   @Redirect(
      method = {"method_9496(Lnet/minecraft/class_2680;Lnet/minecraft/class_1937;Lnet/minecraft/class_2338;Lnet/minecraft/class_5819;)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_1937;method_8406(Lnet/minecraft/class_2394;DDDDDD)V"
      )
   )
   private void corz_suppressFireSmoke(class_1937 world, class_2394 effect, double x, double y, double z, double vx, double vy, double vz) {
      if (!Iiiilillliiilill.lIIlliIIll()) {
         world.method_8406(effect, x, y, z, vx, vy, vz);
      }
   }
}
