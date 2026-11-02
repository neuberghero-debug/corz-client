package gg.corz;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.systems.RenderSystem.class_5590;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import net.minecraft.class_10789;
import net.minecraft.class_10799;
import net.minecraft.class_276;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_9801;
import net.minecraft.class_9801.class_4574;
import org.joml.Matrix4f;

public final class liiiIlIliiiiIlIl {
   private static final int IlllllIiIl = 96;
   private static GpuBuffer lillllIiIl;
   private static final Matrix4f iillllIiIl = new Matrix4f();
   private static GpuBuffer IillllIiIl;
   public static final RenderPipeline llllllIiIl = RenderPipeline.builder(new Snippet[0])
      .withLocation(
         class_2960.method_60655(
            IIIllIIliIIl<"IIIllIIliIIl","OOemjxo6w6dPSiAUJt1wxedMwR7tEYc2LH9ehp/81MwZEMPGAtQ=">(),
            IIIllIIliIIl<"IIIllIIliIIl","1jXtnLvcPPd9LPT1qfywzOteio3ydFgSMeGguGOXxXgI0i7Il/1+vMal">()
         )
      )
      .withVertexShader(
         class_2960.method_60655(
            IIIllIIliIIl<"IIIllIIliIIl","OOemjxo6w6dPSiAUJt1wxedMwR7tEYc2LH9ehp/81MwZEMPGAtQ=">(),
            IIIllIIliIIl<"IIIllIIliIIl","e04twOJW4+2kv1TKwBFHo++ZilNjrl8hvL11RjtiqW/hwr7PxMInganucQ==">()
         )
      )
      .withFragmentShader(
         class_2960.method_60655(
            IIIllIIliIIl<"IIIllIIliIIl","OOemjxo6w6dPSiAUJt1wxedMwR7tEYc2LH9ehp/81MwZEMPGAtQ=">(),
            IIIllIIliIIl<"IIIllIIliIIl","e04twOJW4+2kv1TKwBFHo++ZilNjrl8hvL11RjtiqW/hwr7PxMInganucQ==">()
         )
      )
      .withVertexFormat(class_290.field_1592, class_5596.field_27382)
      .withUniform(IIIllIIliIIl<"IIIllIIliIIl","/7+KTCt4BCI851/SOT+iXpFsfPx4faE1jR0vQaWv1SHAWruolQ==">(), class_10789.field_60031)
      .withBlend(BlendFunction.TRANSLUCENT)
      .withCull(false)
      .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
      .withDepthWrite(false)
      .build();
   private static boolean illlllIiIl;
   private static final ByteBuffer IIilllIiIl = ByteBuffer.allocateDirect(96).order(ByteOrder.nativeOrder());

   public static void IliIlllilIi() {
      if (IlIIIillIIIi.IIIIllIIIl(illlllIiIl)) {
         illlllIiIl = true;
         class_10799.method_67887(llllllIiIl);
      }
   }

   private static GpuBuffer liiiIIllIl(GpuBuffer capacity, String usage, int name, int buffer) {
      if (capacity != null && capacity.size() >= (long)buffer) {
         return capacity;
      } else {
         if (capacity != null) {
            capacity.close();
         }

         return RenderSystem.getDevice().createBuffer(() -> usage, name, (long)buffer);
      }
   }

   private liiiIlIliiiiIlIl() {
   }

   public static boolean iIlIlllllill(
      float pa,
      float height,
      float styleMode,
      float pg,
      float scaledW,
      float pb,
      float sb,
      float sg,
      float fadeAlpha,
      float fbH,
      float time,
      float fbW,
      float bottomFade,
      float pr,
      float sr,
      float intensity,
      float speed,
      float scaledH,
      float centerClear,
      float glow,
      float opacity,
      float stripTop
   ) {
      return IlIIIillIIIi.iIIIlIlIIl(
         () -> {
            long var38 = 2267880748172095148L;
            IliIlllilIi();
            float var22 = height * (1.0F - stripTop);
            float var23 = styleMode / Math.max(1.0F, pg);
            ByteBuffer var24 = IIilllIiIl;
            var24.putFloat(0, pa);
            var24.putFloat(4, height);
            var24.putFloat(8, styleMode);
            var24.putFloat(12, pg);
            var24.putFloat(16, scaledW);
            var24.putFloat(20, pb);
            var24.putFloat(24, sb);
            var24.putFloat(28, sg);
            var24.putFloat(32, fadeAlpha);
            var24.putFloat(36, fbH);
            var24.putFloat(40, time);
            var24.putFloat(44, 1.0F);
            var24.putFloat(48, fbW);
            var24.putFloat(52, bottomFade);
            var24.putFloat(56, pr);
            var24.putFloat(60, sr);
            var24.putFloat(64, intensity);
            var24.putFloat(68, speed);
            var24.putFloat(72, scaledH);
            var24.putFloat(76, centerClear);
            var24.putFloat(80, glow);
            var24.putFloat(84, opacity);
            var24.putFloat(88, var23);
            var24.putFloat(92, stripTop);
            class_287 var25 = class_289.method_1348().method_60827(class_5596.field_27382, class_290.field_1592);
            var25.method_22918(iillllIiIl, 0.0F, var22, 0.0F);
            var25.method_22918(iillllIiIl, 0.0F, height, 0.0F);
            var25.method_22918(iillllIiIl, pa, height, 0.0F);
            var25.method_22918(iillllIiIl, pa, var22, 0.0F);
            GpuDevice var26 = RenderSystem.getDevice();
            class_9801 var27 = var25.method_60800();

            try {
               class_4574 var28 = var27.method_60822();
               ByteBuffer var29 = var27.method_60818();
               var38 ^= ((long)var29.remaining() << 32 ^ var38) & -1L << 32;
               IillllIiIl = liiiIIllIl(
                  IillllIiIl, IIIllIIliIIl<"IIIllIIliIIl","i29nLkjGg6O6SYCP5vO3Wsmx8/zFtX+0DCMEkDJdKF+1ZbkgOGZsWR26">(), 40, (int)(var38 >>> 32)
               );
               lillllIiIl = liiiIIllIl(lillllIiIl, IIIllIIliIIl<"IIIllIIliIIl","c72Er3O5n/Wg6I4fqY5ziKeTaz08gFcgGK6tSrF5LhbEPy7HXBnUXCnx">(), 136, 96);
               class_5590 var31 = RenderSystem.getSequentialBuffer(class_5596.field_27382);
               GpuBuffer var32 = var31.method_68274(var28.comp_751());
               class_276 var33 = ilIllIiIll.Iiiilllliiilll.method_1522();
               CommandEncoder var34 = var26.createCommandEncoder();
               var34.writeToBuffer(IillllIiIl.slice(0L, (long)((int)(var38 >>> 32))), var29);
               var34.writeToBuffer(lillllIiIl.slice(0L, 96L), var24);
               RenderPass var35 = var34.createRenderPass(
                  () -> IIIllIIliIIl<"IIIllIIliIIl","yOlCXTeXEdJlZ8H4TNL7qJXy/YSrKFwgxCxamAU99quz9KGEO1o=">(),
                  var33.method_71639(),
                  OptionalInt.empty(),
                  var33.method_71640(),
                  OptionalDouble.empty()
               );

               try {
                  var35.setPipeline(llllllIiIl);
                  iIIiilIiIlIiilIi.IilliliilIIi(var35);
                  var35.setUniform(IIIllIIliIIl<"IIIllIIliIIl","/7+KTCt4BCI851/SOT+iXpFsfPx4faE1jR0vQaWv1SHAWruolQ==">(), lillllIiIl);
                  var35.setVertexBuffer(0, IillllIiIl);
                  var35.setIndexBuffer(var32, var31.method_31924());
                  var35.drawIndexed(0, 0, var28.comp_751(), 1);
               } catch (Throwable var42) {
                  if (var35 != null) {
                     try {
                        var35.close();
                     } catch (Throwable var41) {
                        var42.addSuppressed(var41);
                     }
                  }

                  throw var42;
               }

               if (var35 != null) {
                  var35.close();
               }
            } catch (Throwable var43) {
               if (var27 != null) {
                  try {
                     var27.close();
                  } catch (Throwable var40) {
                     var43.addSuppressed(var40);
                  }
               }

               throw var43;
            }

            if (var27 != null) {
               var27.close();
            }

            return true;
         }
      );
   }
}
