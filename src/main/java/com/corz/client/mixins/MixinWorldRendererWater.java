package com.corz.client.mixins;

import gg.corz.iiliiIllIIiiiIll;
import net.minecraft.class_761;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_761.class})
public abstract class MixinWorldRendererWater {
   @Inject(
      method = {"method_3295(IIIZ)V"},
      at = {@At("HEAD")},
      require = 0
   )
   private void corz$waterSectionDirty(int x, int y, int z, boolean important, CallbackInfo ci) {
      iiliiIllIIiiiIll.iIlIlllllill(x, y, z);
   }
}
