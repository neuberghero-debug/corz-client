package com.corz.client.mixins;

import gg.corz.lllllIllillllIll;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2457;
import net.minecraft.class_2680;
import net.minecraft.class_5819;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_2457.class})
public class MixinRedstoneWireFarmLag {
   @Inject(
      method = {"method_9496(Lnet/minecraft/class_2680;Lnet/minecraft/class_1937;Lnet/minecraft/class_2338;Lnet/minecraft/class_5819;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void corz$noFarmLagDustParticles(class_2680 state, class_1937 world, class_2338 pos, class_5819 random, CallbackInfo ci) {
      if (world.method_8608() && lllllIllillllIll.lllllillll(state)) {
         ci.cancel();
      }
   }
}
