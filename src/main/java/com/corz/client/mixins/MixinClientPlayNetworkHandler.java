package com.corz.client.mixins;

import gg.corz.IIiIlilllIiIlill;
import gg.corz.IIilliillIilliil;
import gg.corz.illiIliIiliIli;
import gg.corz.llilIllililIll;
import net.minecraft.class_2622;
import net.minecraft.class_634;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_634.class})
public class MixinClientPlayNetworkHandler {
   @Inject(
      method = {"method_45730(Ljava/lang/String;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void corzFakePay(String command, CallbackInfo ci) {
      illiIliIiliIli fakePay = (illiIliIiliIli)llilIllililIll.iliIiiliiiii(illiIliIiliIli.class);
      if (fakePay != null && fakePay.IliIlllilIi() && fakePay.iiiIlIIIll(command)) {
         ci.cancel();
      } else {
         IIilliillIilliil fakeStats = (IIilliillIilliil)llilIllililIll.iliIiiliiiii(IIilliillIilliil.class);
         if (fakeStats != null && fakeStats.IliIlllilIi() && fakeStats.liilliiill(command)) {
            ci.cancel();
         }
      }
   }

   @Inject(
      method = {"method_11094(Lnet/minecraft/class_2622;)V"},
      at = {@At("TAIL")}
   )
   private void corzSpawnerFinderBlockEntity(class_2622 packet, CallbackInfo ci) {
      IIiIlilllIiIlill.Iillllilll(packet.method_11293());
   }
}
