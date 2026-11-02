package com.corz.client.mixins;

import gg.corz.iIiIlillIliIlill;
import gg.corz.ilIllIiIll;
import net.minecraft.class_10042;
import net.minecraft.class_1309;
import net.minecraft.class_922;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_922.class})
public class MixinLivingEntityRenderer {
   @Inject(
      method = {"method_62355(Lnet/minecraft/class_1309;Lnet/minecraft/class_10042;F)V"},
      at = {@At("TAIL")}
   )
   private void corz_silentAimPose(class_1309 entity, class_10042 state, float tickDelta, CallbackInfo ci) {
      if (entity == ilIllIiIll.Iiiilllliiilll.field_1724) {
         if (iIiIlillIliIlill.Iillllilll()) {
            state.field_53446 = iIiIlillIliIlill.lIilliIill();
            state.field_53447 = 0.0F;
            state.field_53448 = iIiIlillIliIlill.Ilillllill();
         }
      }
   }
}
