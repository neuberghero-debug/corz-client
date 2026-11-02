package com.corz.client.mixins;

import gg.corz.IllIlIIilllIlIIi;
import net.minecraft.class_757;
import net.minecraft.class_9779;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_757.class})
public class MixinGameRendererThemeMusic {
   @Inject(
      method = {"method_3192(Lnet/minecraft/class_9779;Z)V"},
      at = {@At("HEAD")}
   )
   private void corz$themeMusicFrame(class_9779 tickCounter, boolean tick, CallbackInfo ci) {
      IllIlIIilllIlIIi.IliIlllilIi();
   }
}
