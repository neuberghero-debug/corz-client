package com.corz.client.mixins;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.systems.RenderSystem;
import gg.corz.IiIliIllliIliIll;
import net.minecraft.class_243;
import net.minecraft.class_4063;
import net.minecraft.class_4184;
import net.minecraft.class_761;
import net.minecraft.class_9909;
import net.minecraft.class_9916;
import net.minecraft.class_9960;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_761.class})
public abstract class MixinWorldRendererCustomSky {
   @Shadow
   @Final
   private class_9960 field_53081;

   @Inject(
      method = {"method_62200(Lnet/minecraft/class_9909;Lnet/minecraft/class_4184;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void corz$customSky(class_9909 frameGraphBuilder, class_4184 camera, GpuBufferSlice fogBuffer, CallbackInfo ci) {
      IiIliIllliIliIll sf = IiIliIllliIliIll.iiiIlIIIll();
      if (sf != null) {
         float vis = sf.IlIllllIll();
         if (!(vis < 1.0F)) {
            this.corz$addSkyPass(frameGraphBuilder, fogBuffer, sf, 1.0F);
            ci.cancel();
         }
      }
   }

   @Inject(
      method = {"method_62200(Lnet/minecraft/class_9909;Lnet/minecraft/class_4184;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V"},
      at = {@At("RETURN")}
   )
   private void corz$customSkyFade(class_9909 frameGraphBuilder, class_4184 camera, GpuBufferSlice fogBuffer, CallbackInfo ci) {
      IiIliIllliIliIll sf = IiIliIllliIliIll.iiiIlIIIll();
      if (sf != null) {
         float vis = sf.ilIllIiIll();
         if (!(vis <= 0.0F) && !(vis >= 1.0F)) {
            this.corz$addSkyPass(frameGraphBuilder, fogBuffer, sf, vis);
         }
      }
   }

   @Unique
   private void corz$addSkyPass(class_9909 frameGraphBuilder, GpuBufferSlice fogBuffer, IiIliIllliIliIll sf, float fade) {
      class_9916 framePass = frameGraphBuilder.method_61911("corz_custom_sky");
      this.field_53081.field_53091 = framePass.method_61933(this.field_53081.field_53091);
      framePass.method_61929(() -> {
         RenderSystem.setShaderFog(fogBuffer);
         sf.Ilillllill(fade);
      });
   }

   @Inject(
      method = {"method_62204(Lnet/minecraft/class_9909;Lnet/minecraft/class_4063;Lnet/minecraft/class_243;JFIF)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void corz$customSkyClouds(class_9909 frameGraphBuilder, class_4063 mode, class_243 cameraPos, long l, float f, int i, float g, CallbackInfo ci) {
      IiIliIllliIliIll sf = IiIliIllliIliIll.iiiIlIIIll();
      if (sf != null && sf.liIlliiIll()) {
         ci.cancel();
      }
   }
}
