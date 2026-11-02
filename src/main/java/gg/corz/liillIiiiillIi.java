package gg.corz;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import java.nio.ByteBuffer;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import net.minecraft.class_10789;
import net.minecraft.class_12137;
import net.minecraft.class_276;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import org.joml.Matrix4f;
import org.lwjgl.system.MemoryUtil;

public final class liillIiiiillIi {
   public static final float IIiiliIiilIiiliIii = 2.0F;
   private static class_12137 liIIiiIiiiiIIiiIii;
   private static final int IiiiliIiiliiiliIii = 24;
   private static boolean lIIIiiIiiiIIIiiIii;
   private static final GpuTextureView[] iIlIiiIiiIllIiiIii = new GpuTextureView[24];
   private static int lllIiiIiiillIiiIii;
   private static final int lliiliIiiiliiliIii = 192;
   public static final RenderPipeline iiiiliIiiIIIIiiIii = RenderPipeline.builder(new Snippet[0])
      .withLocation(
         class_2960.method_60655(
            IiIlliIliiIl<"IiIlliIliiIl","oyjQTAdynzMuLqV4FQT0xF5RJBdGfegmfDLMaps6OajXfv5JMuo=">(),
            IiIlliIliiIl<"IiIlliIliiIl","jwLf64gs8gW1eb+ULunfWZ9DGW089cXiAq+9SyWHzpOOD+kHxAaznkki+bKL0pQ6">()
         )
      )
      .withVertexShader(
         class_2960.method_60655(
            IiIlliIliiIl<"IiIlliIliiIl","oyjQTAdynzMuLqV4FQT0xF5RJBdGfegmfDLMaps6OajXfv5JMuo=">(),
            IiIlliIliiIl<"IiIlliIliiIl","wgtkVLzvkR7gm8SzaMMzJuuZ3QDkcJ0Tzx99wSFRnOkPxNq2NU4agMKr0rQ=">()
         )
      )
      .withFragmentShader(
         class_2960.method_60655(
            IiIlliIliiIl<"IiIlliIliiIl","oyjQTAdynzMuLqV4FQT0xF5RJBdGfegmfDLMaps6OajXfv5JMuo=">(),
            IiIlliIliiIl<"IiIlliIliiIl","wgtkVLzvkR7gm8SzaMMzJuuZ3QDkcJ0Tzx99wSFRnOkPxNq2NU4agMKr0rQ=">()
         )
      )
      .withVertexFormat(class_290.field_60033, class_5596.field_27379)
      .withUniform(IiIlliIliiIl<"IiIlliIliiIl","rSDbFZNaGbVYOsjmhuXFWzS/EIfsFkCAspaqL25KqTIKbH3H/GYR/f+2">(), class_10789.field_60031)
      .withSampler(IiIlliIliiIl<"IiIlliIliiIl","ENuuGnXrgKF3g+j7tDXdVELfmTMcPD17QkI/sf6P6+rofXP3">())
      .withBlend(BlendFunction.TRANSLUCENT_PREMULTIPLIED_ALPHA)
      .withCull(false)
      .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
      .withDepthWrite(false)
      .build();
   private static boolean IlIIiiIiillIIiiIii;
   private static final GpuBufferSlice[] IIlIiiIiilIlIiiIii = new GpuBufferSlice[24];
   public static final float illiliIiiIililiIii = 0.0F;
   public static final float lililiIiiiililiIii = 1.0F;
   private static GpuBuffer ilIIiiIiiIiIIiiIii;
   public static final float iIiiliIiiIliiliIii = 3.0F;

   static void lIiiIiIlilli(
      GpuTextureView glowB,
      Matrix4f strength,
      float glowStrength,
      float rim,
      float qy0,
      float offsetY,
      float glowR,
      float u1,
      float texture,
      float radius,
      float shinePos,
      float alpha,
      float mvp,
      float exact,
      float wx0,
      float qx0,
      float u0,
      float qy1,
      float wy1,
      float lightG,
      float v0,
      float feather,
      float wy0,
      float clip,
      float glowG,
      float mode,
      float shineStrength,
      float wx1,
      float lightB,
      float qx1,
      float lightR,
      float shineWidth,
      float v1,
      float spread
   ) {
      if (lllIiiIiiillIiiIii < 24 && glowB != null) {
         ByteBuffer var34 = IIlliiillIlliiil.IliIlllilIi(192);
         strength.get(0, var34);
         var34.putFloat(64, glowStrength);
         var34.putFloat(68, rim);
         var34.putFloat(72, qy0);
         var34.putFloat(76, offsetY);
         var34.putFloat(80, glowR);
         var34.putFloat(84, u1);
         var34.putFloat(88, texture);
         var34.putFloat(92, radius);
         var34.putFloat(96, shinePos);
         var34.putFloat(100, alpha);
         var34.putFloat(104, mvp);
         var34.putFloat(108, exact);
         var34.putFloat(112, wx0);
         var34.putFloat(116, qx0);
         var34.putFloat(120, u0);
         var34.putFloat(124, qy1);
         var34.putFloat(128, wy1);
         var34.putFloat(132, lightG);
         var34.putFloat(136, v0);
         var34.putFloat(140, feather);
         var34.putFloat(144, wy0);
         var34.putFloat(148, clip);
         var34.putFloat(152, glowG);
         var34.putFloat(156, mode);
         var34.putFloat(160, shineStrength);
         var34.putFloat(164, wx1);
         var34.putFloat(168, lightB);
         var34.putFloat(172, qx1);
         var34.putFloat(176, lightR);
         var34.putFloat(180, shineWidth);
         var34.putFloat(184, v1);
         var34.putFloat(188, spread);
         IIlIiiIiilIlIiiIii[lllIiiIiiillIiiIii] = IIlliiillIlliiil.liiiIIllIl(var34);
         iIlIiiIiiIllIiiIii[lllIiiIiiillIiiIii] = glowB;
         lllIiiIiiillIiiIii++;
      }
   }

   private liillIiiiillIi() {
   }

   public static boolean IliIlllilIi() {
      if (!lIIIiiIiiiIIIiiIii) {
         lIIIiiIiiiIIIiiIii = true;

         try {
            IlIIiiIiillIIiiIii = RenderSystem.getDevice().precompilePipeline(iiiiliIiiIIIIiiIii).isValid();
         } catch (Throwable var1) {
            IlIIiiIiillIIiiIii = false;
         }

         if (!IlIIiiIiillIIiiIii) {
            iIIlIllIlIlIll.lliIliliIl(
               IiIlliIliiIl<"IiIlliIliiIl","BUCeWdRw+PAfB+OCjsN6OVTK7ulEfgwFwQx33Dgw5K/rkw==">(),
               new IllegalStateException(
                  IiIlliIliiIl<"IiIlliIliiIl","JNlGkY6fO3+AP2DMCOXklHfYKDP3pC/W6oEkBFmDrqRHNmubwzwMgIMX7JoBf4xCUU2LCsKDDrXh5P5vZH7/hw==">()
               )
            );
         }
      }

      return IlIIiiIiillIIiiIii;
   }

   private static class_12137 iIlIlllllill() {
      if (liIIiiIiiiiIIiiIii == null) {
         liIIiiIiiiiIIiiIii = RenderSystem.getDevice()
            .createSampler(AddressMode.CLAMP_TO_EDGE, AddressMode.CLAMP_TO_EDGE, FilterMode.LINEAR, FilterMode.LINEAR, 1, OptionalDouble.empty());
      }

      return liIIiiIiiiiIIiiIii;
   }

   private static GpuBuffer liiiIIllIl() {
      if (ilIIiiIiiIiIIiiIii == null) {
         ByteBuffer var0 = MemoryUtil.memAlloc(4);

         try {
            var0.putInt(0);
            var0.flip();
            ilIIiiIiiIiIIiiIii = RenderSystem.getDevice()
               .createBuffer(() -> IiIlliIliiIl<"IiIlliIliiIl","fF+xZpHaYqu0PDsRSJYGQXZMvlTC4vuJ5WYxewNRGE2RKBvpVURU+337Rrc=">(), 32, var0);
         } finally {
            MemoryUtil.memFree(var0);
         }
      }

      return ilIIiiIiiIiIIiiIii;
   }

   static void iliIiiliiiii(class_276 real) {
      long var8 = 1473960482623099578L;
      if (lllIiiIiiillIiiIii != 0) {
         try {
            GpuBuffer var1 = liiiIIllIl();
            class_12137 var2 = iIlIlllllill();
            CommandEncoder var3 = RenderSystem.getDevice().createCommandEncoder();
            RenderPass var4 = var3.createRenderPass(
               () -> IiIlliIliiIl<"IiIlliIliiIl","G+PfUN0AvrWY55Tpu1B1OBIyhhoebF0im+3SRxNgDzuvZDhkMooRYBdL7RU=">(), real.method_71639(), OptionalInt.empty()
            );

            try {
               IIlliiillIlliiil.iliillIiil++;
               var4.setPipeline(iiiiliIiiIIIIiiIii);
               var4.setVertexBuffer(0, var1);

               for (long var16 = var8 ^ (0L ^ var8) & -1L << 32; (int)(var16 >>> 32) < lllIiiIiiillIiiIii; var16 += 4294967296L) {
                  var4.bindTexture(
                     IiIlliIliiIl<"IiIlliIliiIl","ENuuGnXrgKF3g+j7tDXdVELfmTMcPD17QkI/sf6P6+rofXP3">(), iIlIiiIiiIllIiiIii[(int)(var16 >>> 32)], var2
                  );
                  var4.setUniform(
                     IiIlliIliiIl<"IiIlliIliiIl","rSDbFZNaGbVYOsjmhuXFWzS/EIfsFkCAspaqL25KqTIKbH3H/GYR/f+2">(), IIlIiiIiilIlIiiIii[(int)(var16 >>> 32)]
                  );
                  var4.draw(0, 6);
               }
            } catch (Throwable var14) {
               if (var4 != null) {
                  try {
                     var4.close();
                  } catch (Throwable var13) {
                     var14.addSuppressed(var13);
                  }
               }

               throw var14;
            }

            if (var4 != null) {
               var4.close();
            }
         } finally {
            IilliliilIIi();
         }
      }
   }

   static void IilliliilIIi() {
      long var1 = 8556293259256429993L;

      for (long var3 = var1 ^ (0L ^ var1) & -1L << 32; (int)(var3 >>> 32) < lllIiiIiiillIiiIii; var3 += 4294967296L) {
         IIlIiiIiilIlIiiIii[(int)(var3 >>> 32)] = null;
         iIlIiiIiiIllIiiIii[(int)(var3 >>> 32)] = null;
      }

      lllIiiIiiillIiiIii = 0;
   }
}
