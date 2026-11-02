package com.corz.client.mixins;

import gg.corz.IIllIIlilIllIIli;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_636;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_636.class})
public class MixinClientPlayerInteractionManagerCombat {
   @Inject(
      method = {"method_2918(Lnet/minecraft/class_1657;Lnet/minecraft/class_1297;)V"},
      at = {@At("HEAD")}
   )
   private void corzOnAttackEntity(class_1657 player, class_1297 target, CallbackInfo ci) {
      IIllIIlilIllIIli.IiIIlliIIl(target);
   }
}
