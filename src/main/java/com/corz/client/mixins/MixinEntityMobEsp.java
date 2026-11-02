package com.corz.client.mixins;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import gg.corz.iilIiIIiIi;
import net.minecraft.class_1297;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin({class_1297.class})
public abstract class MixinEntityMobEsp {
   @ModifyReturnValue(
      method = {"method_5851()Z"},
      at = {@At("RETURN")}
   )
   private boolean corz$mobEspGlow(boolean original) {
      return original || iilIiIIiIi.iiiIlIIIll((class_1297)this) != 0;
   }

   @ModifyReturnValue(
      method = {"method_22861()I"},
      at = {@At("RETURN")}
   )
   private int corz$mobEspColor(int original) {
      int color = iilIiIIiIi.iiiIlIIIll((class_1297)this);
      return color != 0 ? color : original;
   }
}
