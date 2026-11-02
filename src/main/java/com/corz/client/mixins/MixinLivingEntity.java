package com.corz.client.mixins;

import gg.corz.IIlllIIilIlllIIi;
import gg.corz.ilIiiIiIii;
import gg.corz.ilIllIiIll;
import net.minecraft.class_1268;
import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_1309.class})
public abstract class MixinLivingEntity {
   @Inject(
      method = {"method_6043()V"},
      at = {@At("TAIL")}
   )
   private void corzJumpMoveFix(CallbackInfo ci) {
      if (this == ilIllIiIll.Iiiilllliiilll.field_1724) {
         if (ilIiiIiIii.IIlllIlliIll()) {
            class_1309 self = (class_1309)this;
            if (self.method_5624()) {
               float real = self.method_36454() * (float) (Math.PI / 180.0);
               float srv = ilIiiIiIii.Iilllilliill() * (float) (Math.PI / 180.0);
               class_243 v = self.method_18798();
               double nx = v.field_1352 + (double)class_3532.method_15374((double)real) * 0.2 - (double)class_3532.method_15374((double)srv) * 0.2;
               double nz = v.field_1350 - (double)class_3532.method_15362((double)real) * 0.2 + (double)class_3532.method_15362((double)srv) * 0.2;
               self.method_18800(nx, v.field_1351, nz);
            }
         }
      }
   }

   @Inject(
      method = {"method_23667(Lnet/minecraft/class_1268;Z)V"},
      at = {@At("TAIL")}
   )
   private void corz$knifeSwing(class_1268 hand, boolean fromServerPlayer, CallbackInfo ci) {
      class_1309 self = (class_1309)this;
      if (self.field_6252 && self.field_6279 == -1 && self.field_6266 == hand) {
         IIlllIIilIlllIIi.Iiiilliiil(self, hand);
      }
   }
}
