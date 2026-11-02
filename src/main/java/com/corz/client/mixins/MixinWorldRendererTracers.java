package com.corz.client.mixins;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.systems.RenderSystem;
import gg.corz.Iillllilll;
import net.minecraft.class_12075;
import net.minecraft.class_761;
import net.minecraft.class_9909;
import net.minecraft.class_9916;
import net.minecraft.class_9960;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_761.class})
public abstract class MixinWorldRendererTracers {
   @Shadow
   @Final
   private class_9960 field_53081;

   @Inject(
      method = {"method_62199(Lnet/minecraft/class_9909;Lnet/minecraft/class_12075;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Matrix4f;)V"},
      at = {@At("HEAD")},
      require = 0
   )
   private void corz$tracerPass(class_9909 frameGraphBuilder, class_12075 cameraState, GpuBufferSlice fogBuffer, Matrix4f matrix, CallbackInfo ci) {
      class_9916 pass = frameGraphBuilder.method_61911("corz_tracers");
      this.field_53081.field_53091 = pass.method_61933(this.field_53081.field_53091);
      pass.method_61929(() -> {
         RenderSystem.setShaderFog(fogBuffer);
         Iillllilll.liiiIIllIl();
      });
   }
}
