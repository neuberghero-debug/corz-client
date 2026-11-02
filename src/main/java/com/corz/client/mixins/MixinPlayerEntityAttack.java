package com.corz.client.mixins;

import gg.corz.ilIllIiIll;
import gg.corz.lIiiiiiIiiii;
import gg.corz.lliIiiIliliIiiIl;
import gg.corz.llilIllililIll;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_1657.class})
public abstract class MixinPlayerEntityAttack {
   @Inject(
      method = {"method_7324(Lnet/minecraft/class_1297;)V"},
      at = {@At("RETURN")}
   )
   private void onAttackReturn(class_1297 target, CallbackInfo ci) {
      if (this == ilIllIiIll.Iiiilllliiilll.field_1724) {
         lliIiiIliliIiiIl keepSprint = (lliIiiIliliIiiIl)llilIllililIll.iliIiiliiiii(lliIiiIliliIiiIl.class);
         if (keepSprint != null && keepSprint.IliIlllilIi()) {
            ilIllIiIll.Iiiilllliiilll.field_1724.method_5728(true);
         }

         if (target instanceof class_1657 victim) {
            lIiiiiiIiiii autoPromo = (lIiiiiiIiiii)llilIllililIll.iliIiiliiiii(lIiiiiiIiiii.class);
            if (autoPromo != null && autoPromo.IliIlllilIi()) {
               autoPromo.lIIlliIIll(victim);
            }
         }
      }
   }
}
