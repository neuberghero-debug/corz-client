package com.corz.client.mixins;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import gg.corz.iIIIllIlIlIIllIl;
import net.minecraft.class_4184;
import net.minecraft.class_761;
import net.minecraft.class_9779;
import net.minecraft.class_9922;
import org.joml.Matrix4f;
import org.joml.Vector4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_761.class})
public abstract class MixinWorldRendererAtmo {
   @Inject(
      method = {"method_22710(Lnet/minecraft/class_9922;Lnet/minecraft/class_9779;ZLnet/minecraft/class_4184;Lorg/joml/Matrix4f;Lorg/joml/Matrix4f;Lorg/joml/Matrix4f;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Vector4f;Z)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_9909;method_61910(Lnet/minecraft/class_9922;Lnet/minecraft/class_9909$class_9912;)V",
         shift = Shift.AFTER
      )},
      require = 0
   )
   private void corz$atmoAfterFrameGraph(
      class_9922 allocator,
      class_9779 tickCounter,
      boolean renderBlockOutline,
      class_4184 camera,
      Matrix4f positionMatrix,
      Matrix4f basicProjection,
      Matrix4f projection,
      GpuBufferSlice fogBuffer,
      Vector4f fogColor,
      boolean renderSky,
      CallbackInfo ci
   ) {
      iIIIllIlIlIIllIl.lIiiIiIlilli(fogBuffer);
   }
}
