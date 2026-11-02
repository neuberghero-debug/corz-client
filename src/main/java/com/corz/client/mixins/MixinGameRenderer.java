package com.corz.client.mixins;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.llamalad7.mixinextras.sugar.Local;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import gg.corz.IIiIiIIllIiIiIIl;
import gg.corz.IiilIIiliilIIi;
import gg.corz.iIIlIllIlIlIll;
import gg.corz.iIiliIiIliliIi;
import gg.corz.iIlilIlIllilIl;
import gg.corz.ilIllIiIll;
import gg.corz.iliIliIlIiiIliIl;
import gg.corz.lIllIiiIllIi;
import gg.corz.lilIliIiiilIliIi;
import gg.corz.llilIllililIll;
import net.minecraft.class_11228;
import net.minecraft.class_11286;
import net.minecraft.class_4184;
import net.minecraft.class_757;
import net.minecraft.class_758;
import net.minecraft.class_9779;
import net.minecraft.class_758.class_4596;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_757.class})
public abstract class MixinGameRenderer {
   @Shadow
   @Final
   private class_4184 field_18765;
   @Shadow
   @Final
   private class_11228 field_59965;
   @Shadow
   @Final
   private class_758 field_60793;

   @ModifyExpressionValue(
      method = {"method_3172(FZLorg/joml/Matrix4f;)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_5498;method_31034()Z"
      )}
   )
   private boolean corzFreecamHands(boolean isFirstPerson) {
      if (lilIliIiiilIliIi.iiiIlIIIll()) {
         return lilIliIiiilIliIi.IlIllllIll();
      } else {
         return iIIlIllIlIlIll.IIIllIIliIIl() ? false : isFirstPerson;
      }
   }

   @Inject(
      method = {"method_3192(Lnet/minecraft/class_9779;Z)V"},
      at = {@At("HEAD")}
   )
   private void corz$gui3dFrame(class_9779 tickCounter, boolean tick, CallbackInfo ci) {
      IIiIiIIllIiIiIIl.IliIlllilIi();
      iIIlIllIlIlIll.IiiIlliiIl();
   }

   @Inject(
      method = {"method_3192(Lnet/minecraft/class_9779;Z)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_437;method_47413(Lnet/minecraft/class_332;IIF)V"
      )}
   )
   private void corz$gui3dBegin(class_9779 tickCounter, boolean tick, CallbackInfo ci) {
      if (iIIlIllIlIlIll.IIIIllIIIl()) {
         try {
            this.field_59965.method_70890(this.field_60793.method_71109(class_4596.field_60101));
         } catch (Throwable var5) {
            iIIlIllIlIlIll.iIIIlIlIIl(var5);
         }
      }

      lIllIiiIllIi.iIlIlllllill();
   }

   @Inject(
      method = {"method_3192(Lnet/minecraft/class_9779;Z)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_11228;method_70890(Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V",
         shift = Shift.AFTER
      )}
   )
   private void corz$gui3dEnd(class_9779 tickCounter, boolean tick, CallbackInfo ci) {
      lIllIiiIllIi.IilliliilIIi();
   }

   @Inject(
      method = {"method_3192(Lnet/minecraft/class_9779;Z)V"},
      at = {@At("RETURN")}
   )
   private void corz$gui3dLeave(class_9779 tickCounter, boolean tick, CallbackInfo ci) {
      lIllIiiIllIi.lIiiIiIlilli();
   }

   @Redirect(
      method = {"method_3188(Lnet/minecraft/class_9779;)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_11286;method_71123(Lorg/joml/Matrix4f;)Lcom/mojang/blaze3d/buffers/GpuBufferSlice;"
      )
   )
   private GpuBufferSlice corz_captureProjection(class_11286 instance, Matrix4f projection) {
      iliIliIlIiiIliIl.lIiIIiiIll.set(projection);
      return instance.method_71123(projection);
   }

   @Inject(
      method = {"method_3188(Lnet/minecraft/class_9779;)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_3695;method_15405(Ljava/lang/String;)V",
         ordinal = 1
      )}
   )
   private void onWorldRender(class_9779 rtc, CallbackInfo ci) {
      class_4184 cam = ilIllIiIll.Iiiilllliiilll.field_1773.method_19418();
      iliIliIlIiiIliIl.iIiIIiiIll.identity();
      iliIliIlIiiIliIl.IliIIiiIll.set(new Matrix4f().rotation(cam.method_23767().conjugate(new Quaternionf())));
   }

   @ModifyReturnValue(
      method = {"method_3196(Lnet/minecraft/class_4184;FZ)F"},
      at = {@At("RETURN")}
   )
   private float corz_customFovAndZoom(float original, @Local(argsOnly = true) boolean changingFov) {
      float result = original;
      iIiliIiIliliIi customFov = (iIiliIiIliliIi)llilIllililIll.iliIiiliiiii(iIiliIiIliliIi.class);
      if (customFov != null && customFov.IliIlllilIi()) {
         result = customFov.iiiIlIIIll(original);
      }

      iIlilIlIllilIl zoom = (iIlilIlIllilIl)llilIllililIll.iliIiiliiiii(iIlilIlIllilIl.class);
      if (zoom != null) {
         double factor = zoom.iiiIlIIIll();
         if (factor > 1.0001) {
            result = (float)((double)result / factor);
         }
      }

      if (changingFov && iIIlIllIlIlIll.IIIllIIliIIl()) {
         result = iIIlIllIlIlIll.iIlllIllll(result);
      }

      if (changingFov) {
         IiilIIiliilIIi.IliIlllilIi(result);
      }

      return result;
   }

   @Inject(
      method = {"method_3202()Z"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onShouldRenderBlockOutline(CallbackInfoReturnable<Boolean> cir) {
      if (lilIliIiiilIliIi.iiiIlIIIll() || iIIlIllIlIlIll.IIIllIIliIIl()) {
         cir.setReturnValue(false);
      }
   }
}
