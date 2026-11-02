package gg.corz;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Builder;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.systems.RenderSystem.class_5590;
import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat.class_5595;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import net.minecraft.class_1044;
import net.minecraft.class_1059;
import net.minecraft.class_10789;
import net.minecraft.class_12137;
import net.minecraft.class_276;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_4722;
import net.minecraft.class_6367;
import org.joml.Matrix4f;

public final class iilIIiiIIiIIii {
   public static final RenderPipeline IiIIillIIl = IliIlllilIi(
         IIIilIIiiIIi<"IIIilIIiiIIi","REPA/SeS2GbCfaqZHBlfxA46SaVKbENbWVIVMums2LRXyZ+67R1Eh8hKHP9Wrcg=">()
      )
      .withDepthWrite(true)
      .build();
   private static IlIIllillIIlli IilIillIIl;
   public static final float lIIIillIIl = 0.004F;
   private static class_6367 IllIillIIl;
   private static int iilIillIIl = -1;
   private static final Matrix4f liiIillIIl = new Matrix4f();
   public static final int iiiilllIIl = 2;
   private static final int llIIillIIl = 48;
   public static final float iIIIillIIl = 0.5F;
   private static int lliIillIIl;
   private static final ByteBuffer illIillIIl = ByteBuffer.allocateDirect(80).order(ByteOrder.nativeOrder());
   private static class_12137 lllIillIIl;
   private static IlIIllillIIlli lilIillIIl;
   public static final float IIIIillIIl = 0.5F;
   private static final int IlIIillIIl = 80;
   private static boolean lIlIillIIl;
   private static int IIiIillIIl = -1;
   public static final RenderPipeline iiIIillIIl = RenderPipeline.builder(new Snippet[0])
      .withLocation(
         class_2960.method_60655(
            IIIilIIiiIIi<"IIIilIIiiIIi","mbDmPJGaT8piqE3of8wRnoENxzbDUNqZEAxWmlumlrSzrqP9Z+E=">(),
            IIIilIIiiIIi<"IIIilIIiiIIi","gS/S7n0H1fUiwwVGFDEI5HIwTRJD/1rb084i6m9S3qajVyk7xwAM5nGG9uNSKexQZX2HDD6s9KVR1tAu">()
         )
      )
      .withVertexShader(
         class_2960.method_60655(
            IIIilIIiiIIi<"IIIilIIiiIIi","mbDmPJGaT8piqE3of8wRnoENxzbDUNqZEAxWmlumlrSzrqP9Z+E=">(),
            IIIilIIiiIIi<"IIIilIIiiIIi","2OGJWETAA5ETaUWInrMoHWYn9ibfz7cL4Wz88e39G4WLsgKHZVxUCveyrcs64BCXDZ3V3K8=">()
         )
      )
      .withFragmentShader(
         class_2960.method_60655(
            IIIilIIiiIIi<"IIIilIIiiIIi","mbDmPJGaT8piqE3of8wRnoENxzbDUNqZEAxWmlumlrSzrqP9Z+E=">(),
            IIIilIIiiIIi<"IIIilIIiiIIi","2OGJWETAA5ETaUWInrMoHWYn9ibfz7cL4Wz88e39G4WLsgKHZVxUCveyrcs64BCXDZ3V3K8=">()
         )
      )
      .withVertexFormat(class_290.field_1585, class_5596.field_27382)
      .withUniform(IIIilIIiiIIi<"IIIilIIiiIIi","w3sYfsAfHzojd7qlXP4xVMllLbt1CNs/YBsHBYmvRZRwT2z4Whq4TUwJR1isEQ==">(), class_10789.field_60031)
      .withSampler(IIIilIIiiIIi<"IIIilIIiiIIi","cNBIo7H04VdUxLGUmip81E0mJsukhUNYhhc2L+UyDoYx9N1U">())
      .withBlend(BlendFunction.TRANSLUCENT_PREMULTIPLIED_ALPHA)
      .withCull(false)
      .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
      .withDepthWrite(false)
      .build();
   private static int IiiIillIIl = -1;
   private static boolean IIlIillIIl;
   private static final int ilIIillIIl = 20;
   private static boolean iIlIillIIl;
   private static int lIiIillIIl = -1;
   public static final RenderPipeline liIIillIIl = IliIlllilIi(
         IIIilIIiiIIi<"IIIilIIiiIIi","/37eNUOzqzuAqpCsnJ+4zvxL+YMkeI1u9at3icwcFlakw4JYz6z01DzxaM34ElWeUGwRbHY=">()
      )
      .withBlend(BlendFunction.TRANSLUCENT)
      .withDepthWrite(false)
      .build();
   private static int iIiIillIIl = -1;
   private static int iliIillIIl = -1;
   private static int IliIillIIl;

   private static void Illlllllilll(ByteBuffer u, float v, float y, float x, float b) {
      u.putFloat(v).putFloat(y).putFloat(0.0F).putFloat(x).putFloat(b);
   }

   public static void IIlllIlliIll(Matrix4f radius, float h, float m, float alpha, float x, float w, float y) {
      long var26 = 8721128345966261834L;
      if (IllIillIIl != null && !(y <= 0.002F) && !(alpha <= 0.0F) && !(x <= 0.0F)) {
         class_310 var7 = class_310.method_1551();
         float var8 = 1.0F / IliiIilliiIi.Illlllllilll();
         var26 ^= ((long)var7.method_22683().method_4489() << 32 ^ var26) & -1L << 32;
         var26 ^= ((long)var7.method_22683().method_4506() ^ var26) & -1L >>> 32;
         float var11 = IliiIilliiIi.lIIlllIIliIIlllIIl > 0.0F
            ? IliiIilliiIi.lIIlllIIliIIlllIIl
            : (float)((int)(var26 >>> 32)) / (float)var7.method_22683().method_4495();
         float var12 = IliiIilliiIi.IlIlllIIlllIlllIIl > 0.0F
            ? IliiIilliiIi.IlIlllIIlllIlllIIl
            : (float)((int)var26) / (float)var7.method_22683().method_4495();
         float var13 = radius.m00() * h + radius.m10() * m + radius.m30();
         float var14 = radius.m01() * h + radius.m11() * m + radius.m31();
         float var15 = radius.m00() * (h + alpha) + radius.m10() * (m + x) + radius.m30();
         float var16 = radius.m01() * (h + alpha) + radius.m11() * (m + x) + radius.m31();
         illIillIIl.clear();
         Illlllllilll(illIillIIl, var13, var16, 0.0F, 0.0F);
         Illlllllilll(illIillIIl, var15, var16, 1.0F, 0.0F);
         Illlllllilll(illIillIIl, var15, var14, 1.0F, 1.0F);
         Illlllllilll(illIillIIl, var13, var14, 0.0F, 1.0F);
         illIillIIl.flip();
         illliiIillii var17 = IIlliiillIlliiil.iIlIlllllill(illIillIIl, 20);
         ByteBuffer var18 = IIlliiillIlliiil.IliIlllilIi(48);
         var18.putFloat(0, var11);
         var18.putFloat(4, var12);
         var18.putFloat(8, (float)((int)(var26 >>> 32)));
         var18.putFloat(12, (float)((int)var26));
         var18.putFloat(16, Math.min(var13, var15) * var8);
         var18.putFloat(20, (float)((int)var26) - Math.max(var14, var16) * var8);
         var18.putFloat(24, Math.max(var13, var15) * var8);
         var18.putFloat(28, (float)((int)var26) - Math.min(var14, var16) * var8);
         var18.putFloat(32, Math.max(0.0F, w * Math.abs(radius.m00()) * var8));
         var18.putFloat(36, Math.min(1.0F, y));
         var18.putFloat(40, 0.0F);
         var18.putFloat(44, 0.0F);
         GpuBufferSlice var19 = IIlliiillIlliiil.liiiIIllIl(var18);
         class_5590 var20 = RenderSystem.getSequentialBuffer(class_5596.field_27382);
         GpuBuffer var21 = var20.method_68274(6);
         class_276 var22 = var7.method_1522();
         RenderPass var23 = RenderSystem.getDevice()
            .createCommandEncoder()
            .createRenderPass(
               () -> IIIilIIiiIIi<"IIIilIIiiIIi","dCEnnCNn+MXTa6tJXW9Y2ToqsemEfYLdSJpRjyqm3EeF8HXI1V2JDF7okWu2KvO3sUYKDWZuX/M=">(),
               var22.method_71639(),
               OptionalInt.empty(),
               var22.method_71640(),
               OptionalDouble.empty()
            );

         try {
            IIlliiillIlliiil.iliillIiil++;
            var23.setPipeline(iiIIillIIl);
            iIIiilIiIlIiilIi.IilliliilIIi(var23);
            var23.setUniform(IIIilIIiiIIi<"IIIilIIiiIIi","w3sYfsAfHzojd7qlXP4xVMllLbt1CNs/YBsHBYmvRZRwT2z4Whq4TUwJR1isEQ==">(), var19);
            var23.bindTexture(IIIilIIiiIIi<"IIIilIIiiIIi","cNBIo7H04VdUxLGUmip81E0mJsukhUNYhhc2L+UyDoYx9N1U">(), IllIillIIl.method_71639(), IIillIiliIil());
            var23.setVertexBuffer(0, var17.IliIlllilIi());
            var23.setIndexBuffer(var21, var20.method_31924());
            var23.drawIndexed(var17.liiiIIllIl(), 0, 6, 1);
         } catch (Throwable var29) {
            if (var23 != null) {
               try {
                  var23.close();
               } catch (Throwable var28) {
                  var29.addSuppressed(var28);
               }
            }

            throw var29;
         }

         if (var23 != null) {
            var23.close();
         }
      }
   }

   public static boolean iIlIlllllill() {
      return iIlIillIIl;
   }

   private static void IlIlllIlilIl(RenderPass pass, GpuBuffer toQuad, int fromQuad, int buffer) {
      if (toQuad != null && buffer > fromQuad) {
         pass.setVertexBuffer(0, toQuad);
         pass.drawIndexed(fromQuad * 4, 0, (buffer - fromQuad) * 6, 1);
      }
   }

   private iilIIiiIIiIIii() {
   }

   public static void lIiiIiIlilli() {
      IilIillIIl = null;
      lilIillIIl = null;
      iIiIillIIl = -1;
      lIiIillIIl = -1;
      IIiIillIIl = -1;
      iilIillIIl = -1;
      IiiIillIIl = -1;
      iliIillIIl = -1;
      if (IllIillIIl != null) {
         try {
            IllIillIIl.method_1238();
         } catch (Throwable var1) {
         }

         IllIillIIl = null;
      }
   }

   private static class_12137 IIillIiliIil() {
      if (lllIillIIl == null) {
         lllIillIIl = RenderSystem.getDevice()
            .createSampler(AddressMode.CLAMP_TO_EDGE, AddressMode.CLAMP_TO_EDGE, FilterMode.LINEAR, FilterMode.LINEAR, 1, OptionalDouble.empty());
      }

      return lllIillIIl;
   }

   public static boolean liiiIIllIl() {
      if (iIlIillIIl) {
         return false;
      } else {
         if (!IIlIillIIl) {
            IIlIillIIl = true;

            try {
               GpuDevice var0 = RenderSystem.getDevice();
               lIlIillIIl = var0.precompilePipeline(IiIIillIIl).isValid()
                  && var0.precompilePipeline(liIIillIIl).isValid()
                  && var0.precompilePipeline(iiIIillIIl).isValid();
            } catch (Throwable var1) {
               lIlIillIIl = false;
            }

            if (!lIlIillIIl) {
               IilliliilIIi(
                  IIIilIIiiIIi<"IIIilIIiiIIi","reB8elzFunOUifa+CsqGvOa2edI3BxSlSbLDW1Zud3h8SdE=">(),
                  new IllegalStateException(
                     IIIilIIiiIIi<"IIIilIIiiIIi","F/SX27JylKJt7G0jkNbaXP2028g6ShIdqp8zHA1MO745tG5m7nhuxCFgzRUxQHf6srv0A3WnRW4HDdbjnW5ti77AbINEt5Y=">()
                  )
               );
            }
         }

         return lIlIillIIl && !iIlIillIIl;
      }
   }

   private static GpuBufferSlice IiIlliIliiIl(Matrix4f opaque, float cutout, float mvp, float light) {
      ByteBuffer var4 = IIlliiillIlliiil.IliIlllilIi(80);
      opaque.get(0, var4);
      var4.putFloat(64, cutout);
      var4.putFloat(68, mvp);
      var4.putFloat(72, light);
      var4.putFloat(76, 0.0F);
      return IIlliiillIlliiil.liiiIIllIl(var4);
   }

   public static int iliIiiliiiii(int h, int w) {
      long var4 = 6570131239082355045L;

      try {
         var4 ^= ((long)RenderSystem.getDevice().getMaxTextureSize() << 32 ^ var4) & -1L << 32;
      } catch (Throwable var6) {
         var4 ^= (17592186044416L ^ var4) & -1L << 32;
      }

      var4 ^= ((long)Math.min((int)(var4 >>> 32), 8192) << 32 ^ var4) & -1L << 32;
      return h * 2 <= (int)(var4 >>> 32) && w * 2 <= (int)(var4 >>> 32) ? 2 : 1;
   }

   private static boolean Iilllilliill(int h, int w) {
      if (IllIillIIl == null) {
         IllIillIIl = new class_6367(IIIilIIiiIIi<"IIIilIIiiIIi","F8b9z73pZzUbyj5SVAYw6WcbhkXIssqyDEIPapoTGfVu8HaX5rudLJYOhaFKvw==">(), h, w, true);
         return true;
      } else if (IllIillIIl.field_1482 == h && IllIillIIl.field_1481 == w) {
         return false;
      } else {
         IllIillIIl.method_1234(h, w);
         return true;
      }
   }

   private static Builder IliIlllilIi(String name) {
      return RenderPipeline.builder(new Snippet[0])
         .withLocation(
            class_2960.method_60655(
               IIIilIIiiIIi<"IIIilIIiiIIi","mbDmPJGaT8piqE3of8wRnoENxzbDUNqZEAxWmlumlrSzrqP9Z+E=">(),
               IIIilIIiiIIi<"IIIilIIiiIIi","ObBV32nwV2DJWTVkRCaIsw80hFFQzlJYi/K2L8wNFZmQ46UjJA==">() + name
            )
         )
         .withVertexShader(
            class_2960.method_60655(
               IIIilIIiiIIi<"IIIilIIiiIIi","mbDmPJGaT8piqE3of8wRnoENxzbDUNqZEAxWmlumlrSzrqP9Z+E=">(),
               IIIilIIiiIIi<"IIIilIIiiIIi","Jro/p7XkXjrRMZO3b0iiaQVUO51IurwAE8Pm0y+JwMkdYXy/ZcvAVo1g8CMk+D1xTw==">()
            )
         )
         .withFragmentShader(
            class_2960.method_60655(
               IIIilIIiiIIi<"IIIilIIiiIIi","mbDmPJGaT8piqE3of8wRnoENxzbDUNqZEAxWmlumlrSzrqP9Z+E=">(),
               IIIilIIiiIIi<"IIIilIIiiIIi","Jro/p7XkXjrRMZO3b0iiaQVUO51IurwAE8Pm0y+JwMkdYXy/ZcvAVo1g8CMk+D1xTw==">()
            )
         )
         .withVertexFormat(class_290.field_1575, class_5596.field_27382)
         .withUniform(IIIilIIiiIIi<"IIIilIIiiIIi","I+rHuv5HlGXvYBevuNXXI2k/g4rqfvS97bbJFSQS8PsWyEzYMxQWPpuZ">(), class_10789.field_60031)
         .withSampler(IIIilIIiiIIi<"IIIilIIiiIIi","cNBIo7H04VdUxLGUmip81E0mJsukhUNYhhc2L+UyDoYx9N1U">())
         .withCull(true)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST);
   }

   public static void IilliliilIIi(String where, Throwable t) {
      if (!iIlIillIIl) {
         iIlIillIIl = true;
         lIiiIiIlilli();
      }
   }

   public static void IIIllIIliIIl(
      IlIIllillIIlli height,
      int mesh,
      int caps,
      int chestQuads,
      int solidQuads,
      int width,
      int translucentQuads,
      IlIIllillIIlli mvp,
      Matrix4f translucentBelow,
      int solidBelow,
      int chestBelow
   ) {
      long var49 = -2687416886492989029L;
      long var51 = -19501993170635675L;
      long var53 = -4800906073714993833L;
      long var55 = 5963412377550334497L;
      long var45 = 456728434030853149L;
      long var47 = -2378098197988193499L;
      var45 ^= ((long)Math.max(1, solidBelow) << 32 ^ var45) & -1L << 32;
      var45 ^= ((long)Math.max(1, chestBelow) ^ var45) & -1L >>> 32;
      var47 ^= ((long)Iilllilliill((int)(var45 >>> 32), (int)var45) << 32 ^ var47) & -1L << 32;
      if ((int)(var47 >>> 32) != 0
         || height != IilIillIIl
         || mvp != lilIillIIl
         || mesh != iilIillIIl
         || caps != IIiIillIIl
         || chestQuads != lIiIillIIl
         || solidQuads != iIiIillIIl
         || width != iliIillIIl
         || translucentQuads != IiiIillIIl
         || (int)(var45 >>> 32) != IliIillIIl
         || (int)var45 != lliIillIIl
         || !liiIillIIl.equals(translucentBelow)) {
         IilIillIIl = height;
         lilIillIIl = mvp;
         iilIillIIl = mesh;
         IIiIillIIl = caps;
         lIiIillIIl = chestQuads;
         iIiIillIIl = solidQuads;
         iliIillIIl = width;
         IiiIillIIl = translucentQuads;
         IliIillIIl = (int)(var45 >>> 32);
         lliIillIIl = (int)var45;
         liiIillIIl.set(translucentBelow);
         GpuDevice var14 = RenderSystem.getDevice();
         CommandEncoder var15 = var14.createCommandEncoder();
         var15.clearColorAndDepthTextures(IllIillIIl.method_30277(), 0, IllIillIIl.method_30278(), 1.0);
         GpuBuffer var16 = height == null ? null : height.iIlIlllllill();
         GpuBuffer var17 = height == null ? null : height.IilliliilIIi();
         GpuBuffer var18 = mvp == null ? null : mvp.iIlIlllllill();
         GpuBuffer var19 = mvp == null ? null : mvp.IilliliilIIi();
         var47 ^= ((long)(var16 == null ? 0 : Math.min(mesh, height.iliIiiliiiii())) ^ var47) & -1L >>> 32;
         var49 ^= ((long)(var17 == null ? 0 : Math.min(caps, height.IIIllIIliIIl())) << 32 ^ var49) & -1L << 32;
         var49 ^= ((long)(var18 == null ? 0 : mvp.iliIiiliiiii()) ^ var49) & -1L >>> 32;
         var51 ^= ((long)(var19 == null ? 0 : mvp.IIIllIIliIIl()) << 32 ^ var51) & -1L << 32;
         GpuBuffer var24 = height == null ? null : height.lIiiIiIlilli();
         var51 ^= ((long)(var24 == null ? 0 : Math.min(width, height.IlIlllIlilIl())) ^ var51) & -1L >>> 32;
         GpuTextureView var26 = null;
         class_12137 var27 = null;
         if ((int)var51 > 0) {
            try {
               class_1044 var28 = class_310.method_1551().method_1531().method_4619(class_4722.field_21709);
               var26 = var28.method_71659();
               var27 = var28.method_75484() != null ? var28.method_75484() : IIillIiliIil();
            } catch (Throwable var58) {
               var26 = null;
            }

            if (var26 == null) {
               var51 ^= (0L ^ var51) & -1L >>> 32;
            }
         }

         if ((int)var47 + (int)(var49 >>> 32) + (int)var51 + (int)var49 + (int)(var51 >>> 32) != 0) {
            class_1044 var60 = class_310.method_1551().method_1531().method_4619(class_1059.field_5275);
            GpuTextureView var29 = var60.method_71659();
            class_12137 var30 = var60.method_75484() != null ? var60.method_75484() : IIillIiliIil();
            var53 ^= ((long)Math.max(0, Math.min(chestQuads, (int)var47)) << 32 ^ var53) & -1L << 32;
            var53 ^= ((long)Math.max(0, Math.min(solidQuads, (int)(var49 >>> 32))) ^ var53) & -1L >>> 32;
            var55 ^= ((long)Math.max(0, Math.min(translucentQuads, (int)var51)) << 32 ^ var55) & -1L << 32;
            GpuBufferSlice var34 = IiIlliIliiIl(translucentBelow, 0.5F, 1.0F, 1.0F);
            GpuBufferSlice var35 = (int)(var53 >>> 32) <= 0 && (int)(var55 >>> 32) <= 0 ? null : IiIlliIliiIl(translucentBelow, 0.5F, 1.0F, 0.5F);
            GpuBufferSlice var36 = IiIlliIliiIl(translucentBelow, 0.004F, 0.0F, 1.0F);
            GpuBufferSlice var37 = (int)var53 > 0 ? IiIlliIliiIl(translucentBelow, 0.004F, 0.0F, 0.5F) : null;
            var55 ^= ((long)Math.max(Math.max(Math.max((int)var47, (int)(var49 >>> 32)), (int)var51), Math.max((int)var49, (int)(var51 >>> 32))) ^ var55)
               & -1L >>> 32;
            class_5590 var39 = RenderSystem.getSequentialBuffer(class_5596.field_27382);
            GpuBuffer var40 = var39.method_68274((int)var55 * 6);
            class_5595 var41 = var39.method_31924();
            RenderPass var42 = var15.createRenderPass(
               () -> IIIilIIiiIIi<"IIIilIIiiIIi","F8b9z73pZzUbyj5SVAYw6WcbhkXIssqyDEIPapoTGfVu8HaX5rudLJYOhaFKvw==">(),
               IllIillIIl.method_71639(),
               OptionalInt.empty(),
               IllIillIIl.method_71640(),
               OptionalDouble.empty()
            );

            try {
               IIlliiillIlliiil.iliillIiil++;
               if ((int)var47 + (int)var49 + (int)var51 > 0) {
                  var42.setPipeline(IiIIillIIl);
                  var42.bindTexture(IIIilIIiiIIi<"IIIilIIiiIIi","cNBIo7H04VdUxLGUmip81E0mJsukhUNYhhc2L+UyDoYx9N1U">(), var29, var30);
                  var42.setIndexBuffer(var40, var41);
                  if ((int)(var53 >>> 32) > 0) {
                     var42.setUniform(IIIilIIiiIIi<"IIIilIIiiIIi","I+rHuv5HlGXvYBevuNXXI2k/g4rqfvS97bbJFSQS8PsWyEzYMxQWPpuZ">(), var35);
                     IlIlllIlilIl(var42, var16, 0, (int)(var53 >>> 32));
                  }

                  var42.setUniform(IIIilIIiiIIi<"IIIilIIiiIIi","I+rHuv5HlGXvYBevuNXXI2k/g4rqfvS97bbJFSQS8PsWyEzYMxQWPpuZ">(), var34);
                  IlIlllIlilIl(var42, var16, (int)(var53 >>> 32), (int)var47);
                  IlIlllIlilIl(var42, var18, 0, (int)var49);
                  if ((int)var51 > 0) {
                     var42.bindTexture(IIIilIIiiIIi<"IIIilIIiiIIi","cNBIo7H04VdUxLGUmip81E0mJsukhUNYhhc2L+UyDoYx9N1U">(), var26, var27);
                     if ((int)(var55 >>> 32) > 0) {
                        var42.setUniform(IIIilIIiiIIi<"IIIilIIiiIIi","I+rHuv5HlGXvYBevuNXXI2k/g4rqfvS97bbJFSQS8PsWyEzYMxQWPpuZ">(), var35);
                        IlIlllIlilIl(var42, var24, 0, (int)(var55 >>> 32));
                     }

                     var42.setUniform(IIIilIIiiIIi<"IIIilIIiiIIi","I+rHuv5HlGXvYBevuNXXI2k/g4rqfvS97bbJFSQS8PsWyEzYMxQWPpuZ">(), var34);
                     IlIlllIlilIl(var42, var24, (int)(var55 >>> 32), (int)var51);
                  }
               }

               if ((int)(var49 >>> 32) + (int)(var51 >>> 32) > 0) {
                  var42.setPipeline(liIIillIIl);
                  var42.bindTexture(IIIilIIiiIIi<"IIIilIIiiIIi","cNBIo7H04VdUxLGUmip81E0mJsukhUNYhhc2L+UyDoYx9N1U">(), var29, var30);
                  var42.setIndexBuffer(var40, var41);
                  if ((int)var53 > 0) {
                     var42.setUniform(IIIilIIiiIIi<"IIIilIIiiIIi","I+rHuv5HlGXvYBevuNXXI2k/g4rqfvS97bbJFSQS8PsWyEzYMxQWPpuZ">(), var37);
                     IlIlllIlilIl(var42, var17, 0, (int)var53);
                  }

                  var42.setUniform(IIIilIIiiIIi<"IIIilIIiiIIi","I+rHuv5HlGXvYBevuNXXI2k/g4rqfvS97bbJFSQS8PsWyEzYMxQWPpuZ">(), var36);
                  IlIlllIlilIl(var42, var17, (int)var53, (int)(var49 >>> 32));
                  IlIlllIlilIl(var42, var19, 0, (int)(var51 >>> 32));
               }
            } catch (Throwable var59) {
               if (var42 != null) {
                  try {
                     var42.close();
                  } catch (Throwable var57) {
                     var59.addSuppressed(var57);
                  }
               }

               throw var59;
            }

            if (var42 != null) {
               var42.close();
            }
         }
      }
   }
}
