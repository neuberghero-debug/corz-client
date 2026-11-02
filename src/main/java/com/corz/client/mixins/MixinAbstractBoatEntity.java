package com.corz.client.mixins;

import gg.corz.iilliIIlIIiliIIl;
import gg.corz.llilIllililIll;
import net.minecraft.class_10255;
import net.minecraft.class_1313;
import net.minecraft.class_243;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({class_10255.class})
public class MixinAbstractBoatEntity {
   @Redirect(
      method = {"method_5773()V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_10255;method_5784(Lnet/minecraft/class_1313;Lnet/minecraft/class_243;)V"
      )
   )
   private void corzBoatFlyMove(class_10255 boat, class_1313 type, class_243 velocity) {
      iilliIIlIIiliIIl boatFly = (iilliIIlIIiliIIl)llilIllililIll.iliIiiliiiii(iilliIIlIIiliIIl.class);
      if (boatFly == null || !boatFly.IliIlllilIi() || !boatFly.iiiIlIIIll(boat, type)) {
         boat.method_5784(type, velocity);
      }
   }
}
