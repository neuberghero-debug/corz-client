package com.corz.client.mixins;

import gg.corz.IIiIlilllIiIlill;
import gg.corz.IiiliIiliiliIi;
import gg.corz.IlIllIIillIllIIi;
import gg.corz.iIlIilIlIllIilIl;
import gg.corz.illIiIlIilIiIl;
import gg.corz.illIlIilIl;
import gg.corz.llIIlIIiilIIlIIi;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_638;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_638.class})
public class MixinClientWorldBlockUpdate {
   @Inject(
      method = {"method_41928(Lnet/minecraft/class_2338;Lnet/minecraft/class_2680;I)V"},
      at = {@At("HEAD")}
   )
   private void corzChunkFinderBlockUpdate(class_2338 pos, class_2680 state, int flags, CallbackInfo ci) {
      class_638 self = (class_638)this;
      class_2680 oldState = self.method_8320(pos);
      IiiliIiliiliIi.iIlllIllll(self, pos, oldState, state);
      IlIllIIillIllIIi.iilllIIill(pos, oldState, state);
      llIIlIIiilIIlIIi.iiiIlIIIll(pos, oldState, state);
      illIiIlIilIiIl.Ilillllill(pos, oldState, state);
      IIiIlilllIiIlill.iIlllIllll(self, pos, oldState, state);
      iIlIilIlIllIilIl.iiiliIIIii(pos, oldState, state);
      if (oldState != state) {
         illIlIilIl.IliIlllilIi(pos);
      }
   }

   @Inject(
      method = {"method_41926(Lnet/minecraft/class_2338;Lnet/minecraft/class_2680;Lnet/minecraft/class_243;)V"},
      at = {@At("HEAD")}
   )
   private void corzServerBlockAck(class_2338 pos, class_2680 state, class_243 playerPos, CallbackInfo ci) {
      iIlIilIlIllIilIl.lliliilili(pos, state);
   }
}
