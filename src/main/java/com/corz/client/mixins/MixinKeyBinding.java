package com.corz.client.mixins;

import gg.corz.lilIliIiiilIliIi;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_315;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_304.class})
public class MixinKeyBinding {
   @Inject(
      method = {"method_1434()Z"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void freecam_blockInputs(CallbackInfoReturnable<Boolean> cir) {
      if (lilIliIiiilIliIi.iiiIlIIIll()) {
         if (!lilIliIiiilIliIi.ilIllIiIll()) {
            class_304 self = (class_304)this;
            if (this.isMovementKey(self)) {
               cir.setReturnValue(false);
            }
         }
      }
   }

   private boolean isMovementKey(class_304 key) {
      class_315 o = class_310.method_1551().field_1690;
      return key == o.field_1894
         || key == o.field_1881
         || key == o.field_1913
         || key == o.field_1849
         || key == o.field_1903
         || key == o.field_1832
         || key == o.field_1867;
   }
}
