package com.corz.client.mixins;

import gg.corz.IllIlIIilllIlIIi;
import java.util.concurrent.CompletableFuture;
import net.minecraft.class_2960;
import net.minecraft.class_4234;
import net.minecraft.class_4237;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_4237.class})
public class MixinSoundLoaderThemeMusic {
   @Inject(
      method = {"method_19744(Lnet/minecraft/class_2960;Z)Ljava/util/concurrent/CompletableFuture;"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void corz$seekThemeSong(class_2960 id, boolean repeatInstantly, CallbackInfoReturnable<CompletableFuture<class_4234>> cir) {
      CompletableFuture<class_4234> seeking = IllIlIIilllIlIIi.iliIiiliiiii(id, (CompletableFuture<class_4234>)cir.getReturnValue());
      if (seeking != null) {
         cir.setReturnValue(seeking);
      }
   }
}
