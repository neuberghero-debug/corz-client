package com.corz.client.mixins;

import gg.corz.IillIlilillIli;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import net.minecraft.class_2960;
import net.minecraft.class_4231;
import net.minecraft.class_4237;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_4237.class})
public class MixinSoundLoaderKnifePack {
   @Shadow
   @Final
   private Map<class_2960, CompletableFuture<class_4231>> field_18944;

   @Inject(
      method = {"method_19743(Lnet/minecraft/class_2960;)Ljava/util/concurrent/CompletableFuture;"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void corz$knifePackSound(class_2960 id, CallbackInfoReturnable<CompletableFuture<class_4231>> cir) {
      if (IillIlilillIli.Iliilliiilii(id)) {
         cir.setReturnValue(this.field_18944.computeIfAbsent(id, IillIlilillIli::IiIIlliIIl));
      }
   }

   @Inject(
      method = {"method_19738()V"},
      at = {@At("HEAD")}
   )
   private void corz$knifePackReleased(CallbackInfo ci) {
      IillIlilillIli.IIIIllIIIl();
   }
}
