package com.corz.client.mixins;

import gg.corz.IlIlllIlilIl;
import gg.corz.iIllIIlIlllIIl;
import gg.corz.iiIiilIIliil;
import gg.corz.lIlIiliIlIil;
import net.minecraft.class_2960;
import net.minecraft.class_742;
import net.minecraft.class_7920;
import net.minecraft.class_8685;
import net.minecraft.class_12079.class_12081;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_742.class})
public class MixinAbstractClientPlayerEntity implements IlIlllIlilIl {
   @Unique
   private lIlIiliIlIil corz$capeFrame;

   @Override
   public lIlIiliIlIil corz$capeFrame() {
      return this.corz$capeFrame;
   }

   @Override
   public void corz$capeFrame(lIlIiliIlIil frame) {
      this.corz$capeFrame = frame;
   }

   @Inject(
      method = {"method_52814()Lnet/minecraft/class_8685;"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void corzCosmeticsOverride(CallbackInfoReturnable<class_8685> cir) {
      class_742 self = (class_742)this;
      class_8685 orig = (class_8685)cir.getReturnValue();
      if (orig != null) {
         class_8685 skin = iiIiilIIliil.iilllIIill(self);
         class_2960 cape = iIllIIlIlllIIl.iilllIIill(self);
         if (skin != null || cape != null) {
            class_12081 body = skin != null ? skin.comp_1626() : orig.comp_1626();
            class_7920 model = skin != null ? skin.comp_1629() : orig.comp_1629();
            class_12081 capeAsset = cape != null ? iIllIIlIlllIIl.Ilillllill(cape) : orig.comp_1627();
            cir.setReturnValue(class_8685.method_74884(body, capeAsset, orig.comp_1628(), model));
         }
      }
   }
}
