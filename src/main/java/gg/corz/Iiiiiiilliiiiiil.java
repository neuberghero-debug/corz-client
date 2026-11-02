package gg.corz;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTextureView;
import java.nio.ByteBuffer;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import net.minecraft.class_12137;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.system.MemoryUtil;

public class Iiiiiiilliiiiiil {
   private ByteBuffer liiIliIiil;
   private GpuBuffer IiiIliIiil;
   private class_12137 lliIliIiil;
   private static final Vector4f IIiIliIiil = new Vector4f(1.0F, 1.0F, 1.0F, 1.0F);
   private static final Vector3f lIiIliIiil = new Vector3f(0.0F, 0.0F, 0.0F);
   private static final Matrix4f iIiIliIiil = new Matrix4f();
   private static final int IliIliIiil = 64;
   private boolean iiiIliIiil;
   private GpuBuffer iliIliIiil;

   public void IliIlllilIi(
      GpuTextureView b,
      GpuTextureView smokeView,
      GpuTextureView speed,
      GpuTextureView mask,
      int intensity,
      int target,
      float a,
      float smoke,
      float r,
      float g,
      float activity,
      float radius,
      float scene,
      float blurRadius,
      float time,
      float h,
      float softness,
      float w,
      float flameHeight
   ) {
      if (b != null && smokeView != null && speed != null && mask != null) {
         if (intensity > 0 && target > 0) {
            this.liiiIIllIl();
            this.iIlIlllllill(intensity, target, a, smoke, r, g, activity, radius, scene, blurRadius, time, h, softness, w, flameHeight);
            CommandEncoder var20 = RenderSystem.getDevice().createCommandEncoder();
            this.IilliliilIIi(var20);
            GpuBufferSlice var21 = RenderSystem.getDynamicUniforms().method_71106(RenderSystem.getModelViewMatrix(), IIiIliIiil, lIiIliIiil, iIiIliIiil);
            RenderPass var22 = var20.createRenderPass(
               () -> IIlllIlliIll<"IIlllIlliIll","YLW4fmeXPw2FOwcOCwwshs8wDdeLK2+KfaRk/xnJCPVkuVJZ5OlfPJfW1cV/8kZg">(), b, OptionalInt.empty()
            );

            try {
               var22.setPipeline(lIliiiliIliiil.IiIiillliliIiillli);
               var22.setVertexBuffer(0, this.IiiIliIiil);
               var22.bindTexture(IIlllIlliIll<"IIlllIlliIll","Wr4r4VhHSQJp52StW0K2BT7Eken2UWY0AIzM2nxTDfa4bt1UqL36+g==">(), smokeView, this.lliIliIiil);
               var22.bindTexture(IIlllIlliIll<"IIlllIlliIll","WdiKXWfPuXoHZLca6039DvoYccspnHNOi56vNJlQwkN4+Zr3NCrj">(), speed, this.lliIliIiil);
               var22.bindTexture(IIlllIlliIll<"IIlllIlliIll","M+Mb5tl5KajkVpLh3++RHjcVg9W5za0EaT0gp1Re9qXaBDIQhJiL">(), mask, this.lliIliIiil);
               RenderSystem.bindDefaultUniforms(var22);
               var22.setUniform(IIlllIlliIll<"IIlllIlliIll","JNzs4vRIGGWg84lDaAhre9/TB65a+a+gJZFH+4RYl/A+5/3poqES9apayEC9">(), var21);
               var22.setUniform(IIlllIlliIll<"IIlllIlliIll","BmQa7eccnNcubrahgkrFiT949H8uydujtFuHO4Nmq2rDjITPHBEJJg==">(), this.iliIliIiil);
               var22.draw(0, 6);
            } catch (Throwable var26) {
               if (var22 != null) {
                  try {
                     var22.close();
                  } catch (Throwable var25) {
                     var26.addSuppressed(var25);
                  }
               }

               throw var26;
            }

            if (var22 != null) {
               var22.close();
            }
         }
      }
   }

   private static GpuBuffer lIiiIiIlilli(String name) {
      ByteBuffer var1 = MemoryUtil.memAlloc(4);

      GpuBuffer var2;
      try {
         var1.putInt(0);
         var1.flip();
         var2 = RenderSystem.getDevice().createBuffer(() -> name, 32, var1);
      } finally {
         MemoryUtil.memFree(var1);
      }

      return var2;
   }

   private void liiiIIllIl() {
      if (!this.iiiIliIiil) {
         this.liiIliIiil = MemoryUtil.memAlloc(64);
         this.IiiIliIiil = lIiiIiIlilli(IIlllIlliIll<"IIlllIlliIll","ZAr3mCkeVCMpFxeJWdzCwMowquVFaiHsbIzQP+9DN+wvCZHrg+7DXebWIwFHpaj9WqKRuyjvJiBu3s9MXg==">());
         this.lliIliIiil = RenderSystem.getDevice()
            .createSampler(AddressMode.CLAMP_TO_EDGE, AddressMode.CLAMP_TO_EDGE, FilterMode.LINEAR, FilterMode.LINEAR, 1, OptionalDouble.empty());
         this.iiiIliIiil = true;
      }
   }

   private void iIlIlllllill(
      int softness,
      int w,
      float activity,
      float speed,
      float radius,
      float blurRadius,
      float smoke,
      float a,
      float r,
      float g,
      float intensity,
      float flameHeight,
      float time,
      float b,
      float h
   ) {
      this.liiIliIiil.clear();
      this.liiIliIiil.putFloat((float)softness);
      this.liiIliIiil.putFloat((float)w);
      this.liiIliIiil.putFloat(activity);
      this.liiIliIiil.putFloat(speed);
      this.liiIliIiil.putFloat(radius);
      this.liiIliIiil.putFloat(blurRadius);
      this.liiIliIiil.putFloat(smoke);
      this.liiIliIiil.putFloat(a);
      this.liiIliIiil.putFloat(r);
      this.liiIliIiil.putFloat(g);
      this.liiIliIiil.putFloat(intensity);
      this.liiIliIiil.putFloat(flameHeight);
      this.liiIliIiil.putFloat(time);
      this.liiIliIiil.putFloat(b);
      this.liiIliIiil.putFloat(h);
      this.liiIliIiil.putFloat(0.0F);
      this.liiIliIiil.flip();
   }

   public void iliIiiliiiii() {
      if (this.lliIliIiil != null) {
         this.lliIliIiil.close();
         this.lliIliIiil = null;
      }

      if (this.iliIliIiil != null) {
         this.iliIliIiil.close();
         this.iliIliIiil = null;
      }

      if (this.IiiIliIiil != null) {
         this.IiiIliIiil.close();
         this.IiiIliIiil = null;
      }

      if (this.liiIliIiil != null) {
         MemoryUtil.memFree(this.liiIliIiil);
         this.liiIliIiil = null;
      }

      this.iiiIliIiil = false;
   }

   private void IilliliilIIi(CommandEncoder encoder) {
      long var3 = 1525832398703363555L;
      var3 ^= ((long)this.liiIliIiil.remaining() << 32 ^ var3) & -1L << 32;
      if (this.iliIliIiil == null || this.iliIliIiil.size() < (long)((int)(var3 >>> 32))) {
         if (this.iliIliIiil != null) {
            this.iliIliIiil.close();
         }

         this.iliIliIiil = RenderSystem.getDevice()
            .createBuffer(
               () -> IIlllIlliIll<"IIlllIlliIll","fhhFLKDKe2YwyLz+HQdpa/ENNIohwBe4Ik8IONiTD14IHxV9p0STthU6VtOhrlibponrT9UNxjc=">(),
               136,
               (long)((int)(var3 >>> 32))
            );
      }

      encoder.writeToBuffer(this.iliIliIiil.slice(), this.liiIliIiil);
   }
}
