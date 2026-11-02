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
import com.mojang.blaze3d.systems.RenderSystem.class_5590;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import java.nio.ByteBuffer;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents.Load;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents.Unload;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents.EndExtraction;
import net.minecraft.class_10789;
import net.minecraft.class_10799;
import net.minecraft.class_12076;
import net.minecraft.class_12137;
import net.minecraft.class_243;
import net.minecraft.class_276;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_4184;
import net.minecraft.class_4604;
import net.minecraft.class_5636;
import net.minecraft.class_2874.class_12326;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.system.MemoryUtil;

public final class iiliiIllIIiiiIll {
   private static lIlIIIliiIlIIIli lIIiliilll;
   private static final Vector3f lIliliilll = new Vector3f();
   private static final Vector3f llliliilll = new Vector3f();
   private static boolean liilliilll;
   private static Iiliiillliliiill iIIiliilll;
   private static final int[] iiIiliilll = new int[1024];
   private static final GpuBuffer[] liIiliilll = new GpuBuffer[1024];
   private static final long lIilliilll = 450000000L;
   private static boolean iiilliilll;
   private static long ilIiliilll = -1L;
   private static boolean Ililliilll;
   private static class_4604 IIIiliilll;
   private static ByteBuffer llIiliilll;
   private static final GpuBufferSlice[] IiIiliilll = new GpuBufferSlice[1024];
   private static boolean llilliilll;
   private static GpuBuffer IlIiliilll;
   public static final RenderPipeline iIilliilll = RenderPipeline.builder(new Snippet[]{class_10799.field_60127})
      .withLocation(
         class_2960.method_60655(
            Iilililiiili<"Iilililiiili","/HFxnDCin7Wlmv0/L56WrtKqknh/ct2iXlo0zMAN7Z+grevbeW8=">(),
            Iilililiiili<"Iilililiiili","69Z+GfcswmF4P3x8YaJPS3+buBV3y7PdkwEWKVdeYpBVoEPWdcTxtSw/PladiFuRm4DkIQ==">()
         )
      )
      .withVertexShader(
         class_2960.method_60655(
            Iilililiiili<"Iilililiiili","/HFxnDCin7Wlmv0/L56WrtKqknh/ct2iXlo0zMAN7Z+grevbeW8=">(),
            Iilililiiili<"Iilililiiili","tDcsfWjp0aCbhnr6HiqQpuUrT0i90XtSQurijvLSe1gaOLEfT+W0Ry9iWw==">()
         )
      )
      .withFragmentShader(
         class_2960.method_60655(
            Iilililiiili<"Iilililiiili","/HFxnDCin7Wlmv0/L56WrtKqknh/ct2iXlo0zMAN7Z+grevbeW8=">(),
            Iilililiiili<"Iilililiiili","tDcsfWjp0aCbhnr6HiqQpuUrT0i90XtSQurijvLSe1gaOLEfT+W0Ry9iWw==">()
         )
      )
      .withUniform(Iilililiiili<"Iilililiiili","AyygYyVU9EbWGnI24YYK4AkdxSDkjq6RHbd6bCcKcGPfLzg6qw==">(), class_10789.field_60031)
      .withSampler(Iilililiiili<"Iilililiiili","VvSnnBnBKxDxDGYzWvpIF4fspr4GVyQrjKovYR3fYRrEzsx9">())
      .withSampler(Iilililiiili<"Iilililiiili","DHRWiXFV67xMGvRahWesLtb9oWDhUiKflNh/31dr6+mGZH2S">())
      .withVertexFormat(llIIiIlilIIiIl.iiilillllIIIiillll, class_5596.field_27382)
      .withBlend(BlendFunction.TRANSLUCENT_PREMULTIPLIED_ALPHA)
      .withCull(false)
      .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
      .withDepthWrite(false)
      .withDepthBias(-1.0F, -2.0F)
      .build();
   static final int iillliilll = 144;
   private static boolean ililliilll;
   private static final Vector3f Illiliilll = new Vector3f();
   private static final Matrix4f iIliliilll = new Matrix4f();
   private static final int IIilliilll = 1024;
   private static final Vector4f IIliliilll = new Vector4f(1.0F, 1.0F, 1.0F, 1.0F);
   private static final float[] illiliilll = new float[10];
   private static boolean Iiilliilll;

   private static float Iilllilliill(float b, float t, float a) {
      return b + (t - b) * a;
   }

   private static boolean iliIiiliiiii() {
      if (!ililliilll) {
         ililliilll = true;

         try {
            Iiilliilll = RenderSystem.getDevice().precompilePipeline(iIilliilll).isValid();
         } catch (Throwable var1) {
            Iiilliilll = false;
         }

         if (!Iiilliilll) {
            Ililllililil(
               Iilililiiili<"Iilililiiili","RwXEu2nu2bypIfpqWm3McG6VlPzbiNhp2zh97pbwXrT8NA==">(),
               new IllegalStateException(Iilililiiili<"Iilililiiili","w+UHQ0uTTXDxQnYCzhesMHSQpmNAAMWCkhFLkRbF00lvNIn/kKra5MaLwHslFlJEWAxT+P3j">())
            );
         }
      }

      return Iiilliilll;
   }

   private static float IIillIiliIil(float e0, float x, float e1) {
      float var3 = Illlllllilll((e1 - e0) / (x - e0));
      return var3 * var3 * (3.0F - 2.0F * var3);
   }

   private static void lIiiIiIlilli() {
      if (iIIiliilll == null) {
         lIIiliilll = new lIlIIIliiIlIIIli();
         iIIiliilll = new Iiliiillliliiill(lIIiliilll);
      }
   }

   private static float Illlllllilll(float v) {
      return v < 0.0F ? 0.0F : (v > 1.0F ? 1.0F : v);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static void IlIlllIlilIl(class_310 vis, WorldRenderContext now, ilIlilIiIlil ctx, long mod, float mc) {
      long var32 = 3645115622799260433L;
      long var34 = 1463285037656183300L;
      long var36 = 932752893347156158L;
      long var28 = -5140318231512628032L;
      long var30 = -3255815392367085111L;
      class_4184 var6 = vis.field_1773.method_19418();
      if (var6.method_19334() != class_5636.field_27886) {
         if (iliIiiliiiii()) {
            iIIiliilll.IilliliilIIi(vis, 2);
            class_243 var7 = var6.method_71156();
            var28 ^= ((long)((int)Math.floor(var7.field_1352) >> 4 >> 2) << 32 ^ var28) & -1L << 32;
            var28 ^= ((long)((int)Math.floor(var7.field_1350) >> 4 >> 2) ^ var28) & -1L >>> 32;
            lIIiliilll.IilliliilIIi(iIIiliilll.Iilliiiill, (int)(var28 >>> 32), (int)var28, 8, 1500000L, mod);
            if (!lIIiliilll.liiiIIllIl()) {
               float var10 = (float)iIIiliilll.iIlIlllllill() * 16.0F - 6.0F;
               float var11 = Math.max(8.0F, var10 - 64.0F);
               Matrix4f var12 = RenderSystem.getModelViewMatrix();
               var30 ^= (0L ^ var30) & -1L << 32;
               var30 ^= (0L ^ var30) & -1L >>> 32;

               for (long var54 = var32 ^ (0L ^ var32) & -1L << 32;
                  (int)(var54 >>> 32) < lIIiliilll.IlIIIlIlIi.size() && (int)(var30 >>> 32) < 1024;
                  var54 += 4294967296L
               ) {
                  iiiIllIlIIIlllIl var16 = lIIiliilll.IlIIIlIlIi.get((int)(var54 >>> 32));
                  if (var16.lIllliIiIl != null
                     && var16.IlllliIiIl != 0
                     && var16.illlliIiIl != null
                     && (IIIiliilll == null || IIIiliilll.method_23093(var16.illlliIiIl))) {
                     double var17 = Math.max(Math.max(var16.illlliIiIl.field_1323 - var7.field_1352, var7.field_1352 - var16.illlliIiIl.field_1320), 0.0);
                     double var19 = Math.max(Math.max(var16.illlliIiIl.field_1321 - var7.field_1350, var7.field_1350 - var16.illlliIiIl.field_1324), 0.0);
                     if (!(var17 * var17 + var19 * var19 > (double)var10 * (double)var10)) {
                        float var21 = var16.llllliIiIl < 0L ? 1.0F : Math.min(1.0F, (float)(mod - var16.llllliIiIl) / 4.5E8F);
                        IIliliilll.set(1.0F, 1.0F, 1.0F, var21 * var21 * (3.0F - 2.0F * var21));
                        lIliliilll.set(
                           (float)((double)var16.IliIlllilIi() - var7.field_1352),
                           (float)(-var7.field_1351),
                           (float)((double)var16.liiiIIllIl() - var7.field_1350)
                        );
                        IiIiliilll[(int)(var30 >>> 32)] = RenderSystem.getDynamicUniforms().method_71106(var12, IIliliilll, lIliliilll, iIliliilll);
                        liIiliilll[(int)(var30 >>> 32)] = var16.lIllliIiIl;
                        var54 ^= ((long)(var16.IlllliIiIl / 4 * 6) ^ var54) & -1L >>> 32;
                        iiIiliilll[(int)(var30 >>> 32)] = (int)var54;
                        var30 ^= ((long)Math.max((int)var30, (int)var54) ^ var30) & -1L >>> 32;
                        var30 += 4294967296L;
                     }
                  }
               }

               if ((int)(var30 >>> 32) != 0) {
                  ctx.IlIllllIll(mod);
                  float var15 = ctx.iIlllIllll();
                  GpuTextureView var45 = vis.field_1773.method_22974().method_71650();
                  GpuTextureView var46 = var45;
                  if (var15 > 0.001F) {
                     if (lliliilili.iIlIlllllill(mod)) {
                        var46 = lliliilili.IliIlllilIi();
                     } else {
                        var15 = 0.0F;
                     }
                  } else {
                     var15 = 0.0F;
                  }

                  if (var46 != null && var45 != null) {
                     IiIlliIliiIl(now.worldState().field_63087, ctx, var15, mc, var11, var10, mod);
                     class_276 var18 = now.worldRenderer().method_29360();
                     if (var18 == null) {
                        var18 = vis.method_1522();
                     }

                     if (var18.method_71639() != null && var18.method_71640() != null) {
                        class_5590 var47 = RenderSystem.getSequentialBuffer(class_5596.field_27382);
                        GpuBuffer var20 = var47.method_68274((int)var30);
                        class_12137 var48 = RenderSystem.getSamplerCache().method_75294(FilterMode.LINEAR);
                        CommandEncoder var22 = RenderSystem.getDevice().createCommandEncoder();
                        boolean var41 = false /* VF: Semaphore variable */;

                        try {
                           var41 = true;
                           RenderPass var23 = var22.createRenderPass(
                              () -> Iilililiiili<"Iilililiiili","hzw/1lC7o06niai1a8k8a/M/jnxWBR8cZCAMZ+LkHf4w/RB3moKBXzaWQ4uFe1eO">(),
                              var18.method_71639(),
                              OptionalInt.empty(),
                              var18.method_71640(),
                              OptionalDouble.empty()
                           );

                           try {
                              var23.setPipeline(iIilliilll);
                              RenderSystem.bindDefaultUniforms(var23);
                              var23.setUniform(Iilililiiili<"Iilililiiili","AyygYyVU9EbWGnI24YYK4AkdxSDkjq6RHbd6bCcKcGPfLzg6qw==">(), IlIiliilll);
                              var23.bindTexture(Iilililiiili<"Iilililiiili","VvSnnBnBKxDxDGYzWvpIF4fspr4GVyQrjKovYR3fYRrEzsx9">(), var46, var48);
                              var23.bindTexture(Iilililiiili<"Iilililiiili","DHRWiXFV67xMGvRahWesLtb9oWDhUiKflNh/31dr6+mGZH2S">(), var45, var48);
                              var23.setIndexBuffer(var20, var47.method_31924());

                              for (var34 ^= (0L ^ var34) & -1L << 32; (int)(var34 >>> 32) < (int)(var30 >>> 32); var34 += 4294967296L) {
                                 var23.setUniform(
                                    Iilililiiili<"Iilililiiili","g/jo8YGYFpac6zQenJMzumqObrw4bI3QYlPa5EefinDzy9ONPka4wwInW8hl">(),
                                    IiIiliilll[(int)(var34 >>> 32)]
                                 );
                                 var23.setVertexBuffer(0, liIiliilll[(int)(var34 >>> 32)]);
                                 var23.drawIndexed(0, 0, iiIiliilll[(int)(var34 >>> 32)], 1);
                              }
                           } catch (Throwable var43) {
                              if (var23 != null) {
                                 try {
                                    var23.close();
                                 } catch (Throwable var42) {
                                    var43.addSuppressed(var42);
                                 }
                              }

                              throw var43;
                           }

                           if (var23 != null) {
                              var23.close();
                              var41 = false;
                           } else {
                              var41 = false;
                           }
                        } finally {
                           if (var41) {
                              for (long var57 = var36 ^ (0L ^ var36) & -1L << 32; (int)(var57 >>> 32) < (int)(var30 >>> 32); var57 += 4294967296L) {
                                 IiIiliilll[(int)(var57 >>> 32)] = null;
                                 liIiliilll[(int)(var57 >>> 32)] = null;
                              }
                           }
                        }

                        for (long var56 = var34 ^ (0L ^ var34) & -1L >>> 32; (int)var56 < (int)(var30 >>> 32); var56 ^= (var56 ^ var56 + (long)1) & -1L >>> 32) {
                           IiIiliilll[(int)var56] = null;
                           liIiliilll[(int)var56] = null;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private static float IIlllIlliIll(class_12076 sky) {
      long var3 = -2204355503242307852L;
      if (sky.field_63096 == null) {
         return 0.6F;
      } else {
         var3 ^= ((long)sky.field_63096.ordinal() << 32 ^ var3) & -1L << 32;
         var3 ^= ((long)Math.min((int)(var3 >>> 32), 8 - (int)(var3 >>> 32)) ^ var3) & -1L >>> 32;
         return 0.08F + 0.92F * (1.0F - (float)((int)var3) / 4.0F);
      }
   }

   public static void IilliliilIIi(class_310 mc) {
      if (!llilliilll) {
         liilliilll = true;

         try {
            lIiiIiIlilli();
            iIIiliilll.liiiIIllIl(mc);
         } catch (Throwable var2) {
            Ililllililil(Iilililiiili<"Iilililiiili","mj7i7GWzVV7INIDPqPtwm1DzSnbKYrmf6ZTHjqocKkA=">(), var2);
         }
      }
   }

   private iiliiIllIIiiiIll() {
   }

   public static void Iiilliiliiil() {
      iiilliilll = false;
      liilliilll = false;
      if (iIIiliilll != null) {
         iIIiliilll.IIlllIlliIll();
      }

      if (lIIiliilll != null) {
         lIIiliilll.IlIlllIlilIl();
      }

      lliliilili.IilliliilIIi();
      if (IlIiliilll != null) {
         IlIiliilll.close();
         IlIiliilll = null;
      }

      if (llIiliilll != null) {
         MemoryUtil.memFree(llIiliilll);
         llIiliilll = null;
      }

      ilIiliilll = -1L;
   }

   private static void IiIlliIliiIl(class_12076 fadeStart, ilIlilIiIlil now, float mod, float sky, float vis, float custom, long fadeEnd) {
      long var25 = -7223981637711408668L;
      long var27 = 253514480967563610L;
      if (llIiliilll == null) {
         llIiliilll = MemoryUtil.memAlloc(144);
      }

      if (IlIiliilll == null || IlIiliilll.isClosed()) {
         IlIiliilll = RenderSystem.getDevice()
            .createBuffer(() -> Iilililiiili<"Iilililiiili","1o0HKPiMjD+QOHbAjhfBXWue0yRHqIiclJNQHFYUrXKTI2TvE0PHky0h">(), 136, 144L);
      }

      if (ilIiliilll < 0L) {
         ilIiliilll = fadeEnd;
      }

      double var8 = (double)(fadeEnd - ilIiliilll) / 1.0E9;
      IIIIlilIIIli.IilliliilIIi(var8, illiliilll);
      var25 ^= ((long)(fadeStart != null && fadeStart.field_64464 == class_12326.field_64386 ? 1 : 0) << 32 ^ var25) & -1L << 32;
      float var11 = (int)(var25 >>> 32) != 0 ? Illlllllilll(1.0F - fadeStart.field_63093) : 0.0F;
      float var12 = 0.0F;
      float var13 = 0.0F;
      float var14 = 0.0F;
      float var15 = 1.0F;
      float var16 = 0.93F;
      float var17 = 0.8F;
      float var18 = 0.05F;
      float var19 = 0.04F;
      float var20 = 0.09F;
      if ((int)(var25 >>> 32) != 0) {
         iIIiliIiIlIiliIi.IlIlllIlilIl(fadeStart.field_63091, Illiliilll);
         iIIiliIiIlIiliIi.IlIlllIlilIl(fadeStart.field_64465, llliliilll);
         var12 = (1.0F - var11) * IIillIiliIil(-0.04F, 0.07F, Illiliilll.y);
         float var21 = IIillIiliIil(-0.1F, 0.2F, Illiliilll.y);
         var13 = (1.0F - var11) * IIillIiliIil(-0.04F, 0.07F, llliliilll.y) * IIlllIlliIll(fadeStart) * (1.0F - 0.85F * var21);
         var14 = Illlllllilll(fadeStart.field_63094) * (1.0F - var11);
         var25 ^= ((long)fadeStart.field_63095 ^ var25) & -1L >>> 32;
         float var23 = (float)((int)var25 >>> 24 & 0xFF) / 255.0F;
         if (var23 > 0.0F) {
            float var24 = var23 * (1.0F - IIillIiliIil(0.0F, 0.4F, Illiliilll.y));
            var15 = Iilllilliill(var15, (float)((int)var25 >> 16 & 0xFF) / 255.0F, var24);
            var16 = Iilllilliill(var16, (float)((int)var25 >> 8 & 0xFF) / 255.0F, var24);
            var17 = Iilllilliill(var17, (float)((int)var25 & 0xFF) / 255.0F, var24);
         }

         var27 ^= ((long)fadeStart.field_63097 << 32 ^ var27) & -1L << 32;
         var18 = (float)((int)(var27 >>> 32) >> 16 & 0xFF) / 255.0F;
         var19 = (float)((int)(var27 >>> 32) >> 8 & 0xFF) / 255.0F;
         var20 = (float)((int)(var27 >>> 32) & 0xFF) / 255.0F;
      } else {
         Illiliilll.set(0.0F, -1.0F, 0.0F);
         llliliilll.set(0.0F, -1.0F, 0.0F);
      }

      ByteBuffer var29 = llIiliilll;
      var29.clear();
      var29.putFloat(0, now.ilIllIiIll());
      var29.putFloat(4, now.liIlliiIll());
      var29.putFloat(8, now.IIllllIlll());
      var29.putFloat(12, (float)(var8 % 3600.0));
      var29.putFloat(16, Illiliilll.x);
      var29.putFloat(20, Illiliilll.y);
      var29.putFloat(24, Illiliilll.z);
      var29.putFloat(28, var12);
      var29.putFloat(32, llliliilll.x);
      var29.putFloat(36, llliliilll.y);
      var29.putFloat(40, llliliilll.z);
      var29.putFloat(44, var13);
      var29.putFloat(48, var18);
      var29.putFloat(52, var19);
      var29.putFloat(56, var20);
      var29.putFloat(60, mod);
      var29.putFloat(64, var15);
      var29.putFloat(68, var16);
      var29.putFloat(72, var17);
      var29.putFloat(76, var14);

      for (long var31 = var25 ^ (0L ^ var25) & -1L >>> 32; (int)var31 < 10; var31 ^= (var31 ^ var31 + (long)1) & -1L >>> 32) {
         var29.putFloat(80 + (int)var31 * 4, illiliilll[(int)var31]);
      }

      var29.putFloat(120, IIIIlilIIIli.lIiiIiIlilli(var8));
      var29.putFloat(124, 0.0F);
      var29.putFloat(128, vis);
      var29.putFloat(132, custom);
      var29.putFloat(136, sky);
      var29.putFloat(140, var11);
      var29.position(0).limit(144);
      RenderSystem.getDevice().createCommandEncoder().writeToBuffer(IlIiliilll.slice(), var29);
   }

   private static void IIIllIIliIIl(WorldRenderContext ctx) {
      if (!llilliilll) {
         ilIlilIiIlil var1 = ilIlilIiIlil.iiiIlIIIll();
         if (var1 != null) {
            long var2 = System.nanoTime();
            float var4 = var1.lIIlliIIll(var2);
            if (var4 <= 0.0F) {
               if (!var1.IliIlllilIi() && iiilliilll) {
                  Iiilliiliiil();
               }
            } else if (!IIiIIllIiIIl.IliIlllilIi()) {
               class_310 var5 = class_310.method_1551();
               if (var5.field_1687 != null && var5.field_1724 != null && iIIiliilll != null) {
                  iiilliilll = true;

                  try {
                     IlIlllIlilIl(var5, ctx, var1, var2, var4);
                  } catch (Throwable var7) {
                     Ililllililil(Iilililiiili<"Iilililiiili","/U7OTT6JipwL0PDO1UmZr4/rhKwxh4uR0SD4sn7NpDBoOg==">(), var7);
                  }
               }
            }
         }
      }
   }

   public static void IliIlllilIi() {
      if (!Ililliilll) {
         Ililliilll = true;

         try {
            WorldRenderEvents.END_EXTRACTION.register((EndExtraction)ctx -> IIIiliilll = ctx.frustum());
            WorldRenderEvents.END_MAIN.register(iiliiIllIIiiiIll::IIIllIIliIIl);
            ClientChunkEvents.CHUNK_LOAD.register((Load)(w, chunk) -> {
               if (liilliilll && iIIiliilll != null) {
                  iIIiliilll.IIIllIIliIIl(chunk.method_12004().field_9181, chunk.method_12004().field_9180);
               }
            });
            ClientChunkEvents.CHUNK_UNLOAD.register((Unload)(chunk, w) -> {
               if (liilliilll && iIIiliilll != null) {
                  iIIiliilll.IlIlllIlilIl(w.method_12004().field_9181, w.method_12004().field_9180);
               }
            });
         } catch (Throwable var1) {
            llilliilll = true;
         }
      }
   }

   private static void Ililllililil(String where, Throwable t) {
      llilliilll = true;

      try {
         Iiilliiliiil();
      } catch (Throwable var3) {
      }
   }

   public static void iIlIlllllill(int sy, int sz, int sx) {
      if (liilliilll && iIIiliilll != null) {
         iIIiliilll.iliIiiliiiii(sy, sz, sx);
      }
   }

   public static boolean liiiIIllIl() {
      return llilliilll;
   }
}
