package com.corz.client.mixins;

import gg.corz.IIllIIlilIllIIli;
import net.minecraft.class_2664;
import net.minecraft.class_2743;
import net.minecraft.class_634;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_634.class})
public class MixinClientPlayNetworkHandlerCombat {
   @Inject(
      method = {"method_11132(Lnet/minecraft/class_2743;)V"},
      at = {@At("TAIL")}
   )
   private void corzSelfVelocity(class_2743 packet, CallbackInfo ci) {
      IIllIIlilIllIIli.iiIIlIIlIl(packet.method_11818());
   }

   @Inject(
      method = {"method_11124(Lnet/minecraft/class_2664;)V"},
      at = {@At("TAIL")}
   )
   private void corzSelfExplosion(class_2664 packet, CallbackInfo ci) {
      packet.comp_2884().ifPresent(IIllIIlilIllIIli::lIlIliIlIl);
   }
}
