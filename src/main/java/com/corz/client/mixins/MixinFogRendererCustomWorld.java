package com.corz.client.mixins;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import gg.corz.lIilillliIililll;
import java.nio.ByteBuffer;
import net.minecraft.class_4184;
import net.minecraft.class_638;
import net.minecraft.class_758;
import org.joml.Vector4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_758.class})
public class MixinFogRendererCustomWorld {
   @Unique
   private static Vector4f corz$color(int c) {
      return new Vector4f((float)(c >> 16 & 0xFF) / 255.0F, (float)(c >> 8 & 0xFF) / 255.0F, (float)(c & 0xFF) / 255.0F, (float)(c >>> 24 & 0xFF) / 255.0F);
   }

   @Inject(
      method = {"method_62185(Lnet/minecraft/class_4184;FLnet/minecraft/class_638;IF)Lorg/joml/Vector4f;"},
      at = {@At("TAIL")},
      cancellable = true
   )
   private void corz$fogColor(class_4184 camera, float tickProgress, class_638 world, int viewDistance, float skyDarkness, CallbackInfoReturnable<Vector4f> cir) {
      lIilillliIililll cw = lIilillliIililll.iiiIlIIIll();
      if (cw != null && cw.liIlliiIll()) {
         cir.setReturnValue(corz$color(cw.iIlllIllll()));
      }
   }

   @WrapOperation(
      method = {"method_3211(Lnet/minecraft/class_4184;ILnet/minecraft/class_9779;FLnet/minecraft/class_638;)Lorg/joml/Vector4f;"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_758;method_71110(Ljava/nio/ByteBuffer;ILorg/joml/Vector4f;FFFFFF)V"
      )},
      require = 0
   )
   private void corz$worldFog(
      class_758 self,
      ByteBuffer buffer,
      int bufPos,
      Vector4f fogColor,
      float environmentalStart,
      float environmentalEnd,
      float renderDistanceStart,
      float renderDistanceEnd,
      float skyEnd,
      float cloudEnd,
      Operation<Void> original
   ) {
      lIilillliIililll cw = lIilillliIililll.iiiIlIIIll();
      if (cw != null && cw.liIlliiIll()) {
         float end = cw.Iillllilll();
         float start = Math.min(cw.lllllillll(), end);
         original.call(new Object[]{self, buffer, bufPos, corz$color(cw.iIlllIllll()), start, end, start, end, end, end});
      } else {
         original.call(
            new Object[]{self, buffer, bufPos, fogColor, environmentalStart, environmentalEnd, renderDistanceStart, renderDistanceEnd, skyEnd, cloudEnd}
         );
      }
   }
}
