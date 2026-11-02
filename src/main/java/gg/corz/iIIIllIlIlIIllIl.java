package gg.corz;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.systems.RenderSystem.class_5590;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.Supplier;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents;
import net.minecraft.class_243;
import net.minecraft.class_276;
import net.minecraft.class_290;
import net.minecraft.class_310;
import net.minecraft.class_4184;
import net.minecraft.class_638;
import net.minecraft.class_746;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.system.MemoryUtil;

public final class iIIIllIlIlIIllIl {
   private static final Matrix4f lIiIilIiIl = new Matrix4f();
   private static final liIIIlIliiIIIlIl IiIIilIiIl = new liIIIlIliiIIIlIl();
   private static final GpuBuffer[] liIlilIiIl = new GpuBuffer[3];
   private static final int iIlillIiIl = IIlIIlillIlIIlil.IllliilIil.illliilIil + IIlIIlillIlIIlil.lllliilIil.illliilIil;
   private static boolean lIIIilIiIl;
   private static float lIiillIiIl = Float.POSITIVE_INFINITY;
   private static float IilIilIiIl;
   private static final Vector3f lliIilIiIl = new Vector3f();
   private static final float IIiillIiIl = 0.011F;
   private static final float lilillIiIl = (float) Math.PI;
   private static int lIllilIiIl;
   private static final Supplier<String> IliillIiIl = () -> IllIllllIl<"IllIllllIl","xTd7ZvMt0XAaPiXiJtySu6ESTODUeua+yn4E7FrY76GmoXXxa2nbqTcQqo/74yg=">();
   private static final int IIlillIiIl = iIIIllIlIlIIllIl.iiIillIiIl * 4 * 28;
   private static final float illillIiIl = 0.8F;
   private static final int lIlillIiIl = 3;
   private static boolean IiiillIiIl;
   private static final int IllillIiIl = 128;
   private static boolean IIIIilIiIl;
   private static int iiIlilIiIl;
   private static boolean liIIilIiIl;
   private static liiiililiiiiilil iliillIiIl;
   private static long iiIIilIiIl;
   private static final float[] iiiIilIiIl = new float[iIlillIiIl];
   private static final int[] iIIlilIiIl = new int[iIlillIiIl];
   private static final Supplier<String> lliillIiIl = () -> IllIllllIl<"IllIllllIl","gYSvBBN9qvEyhLwA8tEjTKooVGW6N9tjMN/KCV5pIypldCCW8vbwSV0=">();
   private static final int[] liiIilIiIl = new int[iIlillIiIl];
   private static final float[] IIIlilIiIl = new float[iIlillIiIl];
   private static final int liIillIiIl = 28;
   private static boolean liiillIiIl;
   private static ByteBuffer ilIlilIiIl;
   private static float ilIIilIiIl;
   private static int IIllilIiIl;
   private static final float[] lIIlilIiIl = new float[iIlillIiIl];
   private static final float IilillIiIl = 240.0F;
   private static double IllIilIiIl;
   private static final Vector3f IliIilIiIl = new Vector3f();
   private static final Matrix4f IIiIilIiIl = new Matrix4f();
   private static Boolean iiiillIiIl;
   private static final Vector3f iliIilIiIl = new Vector3f();
   private static final int iiIillIiIl = IIlIIlillIlIIlil.IllliilIil.illliilIil + IIlIIlillIlIIlil.lllliilIil.illliilIil * 2;
   private static float llIIilIiIl;
   private static float iIiillIiIl = Float.POSITIVE_INFINITY;
   private static double illIilIiIl;
   private static float lilIilIiIl;
   private static final float lllillIiIl = 1.1F;
   private static double lllIilIiIl;
   private static IIiiIlIilIiiIlIi IlIIilIiIl;
   private static long IiIlilIiIl;
   private static final float iilillIiIl = 0.032F;
   private static final int[] llIlilIiIl = new int[129];
   private static final float[] lIlIilIiIl = new float[3];
   private static float iilIilIiIl;
   private static final Vector4f iIiIilIiIl = new Vector4f(1.0F, 1.0F, 1.0F, 1.0F);
   private static double IIlIilIiIl;
   private static boolean iIlIilIiIl;
   private static final int[] IlIlilIiIl = new int[iIlillIiIl];
   private static final Vector3f IiiIilIiIl = new Vector3f();
   private static IIiiIlIilIiiIlIi iIIIilIiIl;
   private static long iIllilIiIl;

   private static int IlIillIiilIi(IIiiIlIilIiiIlIi f, int i) {
      long var3 = -2893968669352981307L;
      var3 ^= (
            (long)IiIIilIiIl.iIlIlllllill(IIiiIlIilIiiIlIi.Iliilliiilii(f.IliliIIIIi[i]), IIiiIlIilIiiIlIi.Iliilliiilii(f.ililiIIIIi[i]), f.lliliIIIIi[i])
                  << 32
               ^ var3
         )
         & -1L << 32;
      return (int)(var3 >>> 32) << 4 | 15728640;
   }

   private static long Iiilliiliiil(long cy, IIiiIlIilIiiIlIi dist, int i, float a, float f, double alpha, double cz, double pxPerDist, float cx) {
      long var33 = 5005772079391308139L;
      long var31 = -1345474408806538133L;
      float var13 = dist.llIiiIIIIi[i];
      float var14 = 1.0F - lIlliIiiIlliIi.IiIlliIliiIl(2.0F, 9.0F, f);
      a *= 0.78F + 0.22F * var14;
      float var15 = 0.88F + 0.12F * var14;
      float var16 = 1.15F * cx * f;
      if (var13 < var16) {
         float var17 = var13 / var16;
         a *= var17 * var17;
         var13 = var16;
      }

      float var40 = (float)(dist.IliliIIIIi[i] - alpha);
      float var18 = (float)(dist.lliliIIIIi[i] - cz);
      float var19 = (float)(dist.ililiIIIIi[i] - pxPerDist);
      float var20 = -(IiiIilIiIl.x * var40 + IiiIilIiIl.y * var18 + IiiIilIiIl.z * var19);
      if (var20 <= 0.02F) {
         return cy;
      } else {
         var13 = Math.min(var13, iIiillIiIl * var20);
         var31 ^= ((long)IIIIllIIIl(a) << 32 ^ var31) & -1L << 32;
         if ((int)(var31 >>> 32) <= 0) {
            return cy;
         } else {
            float var22 = dist.IiliiIIIIi[i];
            var31 ^= ((long)iIIIlIlIIl(var15 * (1.0F - 0.1F * var22), var15 * (1.0F - 0.06F * var22), var15, (int)(var31 >>> 32)) ^ var31) & -1L >>> 32;
            var33 ^= ((long)IlIillIiilIi(dist, i) << 32 ^ var33) & -1L << 32;
            float var25 = lliIilIiIl.x * var13;
            float var26 = lliIilIiIl.y * var13;
            float var27 = lliIilIiIl.z * var13;
            float var28 = iliIilIiIl.x * var13;
            float var29 = iliIilIiIl.y * var13;
            float var30 = iliIilIiIl.z * var13;
            cy = IiIiliIiiiIi(cy, var40 - var25 - var28, var18 - var26 - var29, var19 - var27 - var30, -1.0F, -1.0F, (int)var31, (int)(var33 >>> 32));
            cy = IiIiliIiiiIi(cy, var40 + var25 - var28, var18 + var26 - var29, var19 + var27 - var30, 1.0F, -1.0F, (int)var31, (int)(var33 >>> 32));
            cy = IiIiliIiiiIi(cy, var40 + var25 + var28, var18 + var26 + var29, var19 + var27 + var30, 1.0F, 1.0F, (int)var31, (int)(var33 >>> 32));
            return IiIiliIiiiIi(cy, var40 - var25 + var28, var18 - var26 + var29, var19 - var27 + var30, -1.0F, 1.0F, (int)var31, (int)(var33 >>> 32));
         }
      }
   }

   private static int IIIIllIIIl(float a) {
      long var2 = 2153664196187498758L;
      var2 ^= ((long)((int)(a * 255.0F + 0.5F)) << 32 ^ var2) & -1L << 32;
      return (int)(var2 >>> 32) < 0 ? 0 : Math.min((int)(var2 >>> 32), 255);
   }

   private static void IIillIiliIil(int n) {
      long var5 = 500245879817137309L;
      long var7 = -7383566191087199691L;
      float var1 = 1.0F;

      for (var5 ^= (0L ^ var5) & -1L << 32; (int)(var5 >>> 32) < n; var5 += 4294967296L) {
         if (IIIlilIiIl[(int)(var5 >>> 32)] > var1) {
            var1 = IIIlilIiIl[(int)(var5 >>> 32)];
         }
      }

      float var2 = 127.0F / var1;

      for (var5 ^= (0L ^ var5) & -1L >>> 32; (int)var5 <= 128; var5 ^= (var5 ^ var5 + (long)1) & -1L >>> 32) {
         llIlilIiIl[(int)var5] = 0;
      }

      for (var5 ^= (0L ^ var5) & -1L >>> 32; (int)var5 < n; var5 ^= (var5 ^ var5 + (long)1) & -1L >>> 32) {
         var7 ^= ((long)(127 - (int)(IIIlilIiIl[(int)var5] * var2)) << 32 ^ var7) & -1L << 32;
         if ((int)(var7 >>> 32) < 0) {
            var7 ^= (0L ^ var7) & -1L << 32;
         } else if ((int)(var7 >>> 32) >= 128) {
            var7 ^= (545460846592L ^ var7) & -1L << 32;
         }

         iIIlilIiIl[(int)var5] = (int)(var7 >>> 32);
         llIlilIiIl[(int)(var7 >>> 32) + 1]++;
      }

      for (var5 ^= (0L ^ var5) & -1L >>> 32; (int)var5 < 128; var5 ^= (var5 ^ var5 + (long)1) & -1L >>> 32) {
         llIlilIiIl[(int)var5 + 1] = llIlilIiIl[(int)var5 + 1] + llIlilIiIl[(int)var5];
      }

      for (long var13 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var13 < n; var13 ^= (var13 ^ var13 + (long)1) & -1L >>> 32) {
         IlIlilIiIl[llIlilIiIl[iIIlilIiIl[(int)var13]]++] = (int)var13;
      }
   }

   private static float Iliilliiilii(float v) {
      return v < 0.0F ? 0.0F : (v > 1.0F ? 1.0F : v);
   }

   private static void IilliliilIIi(WorldRenderContext ctx) {
      if (!liiillIiIl && iliillIiIl != null && !IIIIilIiIl) {
         try {
            IIiIilIiIl.set(RenderSystem.getModelViewMatrix()).mul(ctx.matrices().method_23760().method_23761());
            IiIlliIliiIl(null);
            lIIIilIiIl = true;
         } catch (Throwable var2) {
            iliIiiliiiii(IllIllllIl<"IllIllllIl","ljcSO9xNLfAqyC6EXoBi/Nlq5jJSEZja+BwGdaS+8h1GzQ==">(), var2);
         }
      }
   }

   static float IIiilIiiiIii(float p) {
      return p * p * (3.0F - 2.0F * p);
   }

   private static int llIIlilIIl(int rgb, float s, int a8) {
      return iIIIlIlIIl((float)(rgb >> 16 & 0xFF) / 255.0F * s, (float)(rgb >> 8 & 0xFF) / 255.0F * s, (float)(rgb & 0xFF) / 255.0F * s, a8);
   }

   public static void lIiiIiIlilli(GpuBufferSlice fog) {
      if (!liiillIiIl && iliillIiIl != null) {
         IIIIilIiIl = true;
         if (lIIIilIiIl) {
            lIIIilIiIl = false;
         } else {
            try {
               IIiIilIiIl.set(RenderSystem.getModelViewMatrix());
               IiIlliIliiIl(fog);
            } catch (Throwable var2) {
               iliIiiliiiii(IllIllllIl<"IllIllllIl","ljcSO9xNLfAqyC6EXoBi/Nlq5jJSEZja+BwGdaS+8h1GzQ==">(), var2);
            }
         }
      }
   }

   private static int Ililllililil(int cy, double pxPerDist, double n, double cx, float cz) {
      long var17 = -591560752906889311L;
      long var19 = 7811126502889263923L;
      long var21 = -668685493474689891L;
      long var8 = IiIlilIiIl;
      var17 ^= (0L ^ var17) & -1L << 32;

      for (var17 ^= (0L ^ var17) & -1L >>> 32; (int)var17 < cy; var17 ^= (var17 ^ var17 + (long)1) & -1L >>> 32) {
         long var26 = var19 ^ ((long)IlIlilIiIl[(int)var17] << 32 ^ var19) & -1L << 32;
         var19 = var26 ^ ((long)liiIilIiIl[(int)(var26 >>> 32)] ^ var26) & -1L >>> 32;
         var21 ^= ((long)((int)var19 & 65535) << 32 ^ var21) & -1L << 32;
         if ((int)var19 >>> 16 == 0) {
            if ((int)(var17 >>> 32) + 1 > iiIillIiIl) {
               break;
            }

            long var15 = Iiilliiliiil(
               var8, iIIIilIiIl, (int)(var21 >>> 32), iiiIilIiIl[(int)(var19 >>> 32)], IIIlilIiIl[(int)(var19 >>> 32)], pxPerDist, n, cx, cz
            );
            if (var15 != var8) {
               var8 = var15;
               var17 += 4294967296L;
            }
         } else {
            if ((int)(var17 >>> 32) + 2 > iiIillIiIl) {
               break;
            }

            long var23 = IIIilIIiiIIi(
               var8,
               IlIIilIiIl,
               (int)(var21 >>> 32),
               iiiIilIiIl[(int)(var19 >>> 32)],
               lIIlilIiIl[(int)(var19 >>> 32)],
               IIIlilIiIl[(int)(var19 >>> 32)],
               pxPerDist,
               n,
               cx,
               cz
            );
            if (var23 != var8) {
               var8 = var23;
               var17 += 8589934592L;
            }
         }
      }

      return (int)(var17 >>> 32);
   }

   public static void IliIlllilIi(liiiililiiiiilil s) {
      iliillIiIl = s;
      if (!IiiillIiIl) {
         IiiillIiIl = true;

         try {
            WorldRenderEvents.END_MAIN.register(iIIIllIlIlIIllIl::IilliliilIIi);
         } catch (Throwable var2) {
            iliIiiliiiii(IllIllllIl<"IllIllllIl","QWlBgpdtAK/AHMVbPGbIA+K60C1NC8D4gdaffpj01ILqcyM=">(), var2);
         }
      }
   }

   private static int iIIIlIlIIl(float b, float r, float g, int a8) {
      long var7 = 2369172079599762582L;
      long var9 = -2064316051964357220L;
      var7 ^= ((long)((int)(Iliilliiilii(b) * 255.0F + 0.5F)) << 32 ^ var7) & -1L << 32;
      var7 ^= ((long)((int)(Iliilliiilii(r) * 255.0F + 0.5F)) ^ var7) & -1L >>> 32;
      var9 ^= ((long)((int)(Iliilliiilii(g) * 255.0F + 0.5F)) << 32 ^ var9) & -1L << 32;
      return a8 << 24 | (int)(var9 >>> 32) << 16 | (int)var7 << 8 | (int)(var7 >>> 32);
   }

   private iIIIllIlIlIIllIl() {
   }

   private static void Illlllllilll(double dt, double y, double x, float z) {
      if (!iIlIilIiIl) {
         iIlIilIiIl = true;
         IllIilIiIl = dt;
         lllIilIiIl = y;
         illIilIiIl = x;
         IilIilIiIl = 0.0F;
         lilIilIiIl = 0.0F;
         iilIilIiIl = 0.0F;
      } else {
         if (z > 0.0F) {
            float var7 = (float)((dt - IllIilIiIl) / (double)z);
            float var8 = (float)((y - lllIilIiIl) / (double)z);
            float var9 = (float)((x - illIilIiIl) / (double)z);
            if (var7 * var7 + var8 * var8 + var9 * var9 > 6400.0F) {
               IilIilIiIl = 0.0F;
               lilIilIiIl = 0.0F;
               iilIilIiIl = 0.0F;
            } else {
               float var10 = 1.0F - (float)Math.exp((double)(-z / 0.08F));
               IilIilIiIl = IilIilIiIl + (var7 - IilIilIiIl) * var10;
               lilIilIiIl = lilIilIiIl + (var8 - lilIilIiIl) * var10;
               iilIilIiIl = iilIilIiIl + (var9 - iilIilIiIl) * var10;
            }
         }

         IllIilIiIl = dt;
         lllIilIiIl = y;
         illIilIiIl = x;
      }
   }

   static float Iilililiiili(float p, boolean dt, float want) {
      return dt ? Math.min(1.0F, p + want / 1.1F) : Math.max(0.0F, p - want / 0.8F);
   }

   private static int Iilllilliill(IIiiIlIilIiiIlIi f, int cy, float n, double cz, double fieldId, double presence, int cx) {
      long var35 = 7402930024057176704L;
      IIlIIlillIlIIlil var10 = f.IIiliIIIIi;
      float var11 = var10.IilliilIil;
      float var12 = var11 * 0.62F;
      float var13 = var11 * 0.97F;
      float var14 = var10.iilliilIil - 4.5F;
      float var15 = var10.iilliilIil - 0.2F;
      float var16 = -var10.lilliilIil + 0.2F;
      float var17 = -var10.lilliilIil + 3.5F;
      var35 ^= ((long)(var10 == IIlIIlillIlIIlil.lllliilIil ? 1 : 0) << 32 ^ var35) & -1L << 32;
      float var19 = (int)(var35 >>> 32) != 0 ? 1.3F : 0.5F;
      float var20 = (int)(var35 >>> 32) != 0 ? 3.0F : 2.0F;
      float var21 = -IiiIilIiIl.x;
      float var22 = -IiiIilIiIl.y;
      float var23 = -IiiIilIiIl.z;
      float var24 = var10.IliliilIil * n;

      for (long var41 = var35 ^ (0L ^ var35) & -1L >>> 32; (int)var41 < f.iIiiiIIIIi && cx < iIlillIiIl; var41 ^= (var41 ^ var41 + (long)1) & -1L >>> 32) {
         float var26 = f.IIIiiIIIIi[(int)var41];
         if (!(var26 <= 0.002F)) {
            float var27 = (float)(f.IliliIIIIi[(int)var41] - cz);
            float var28 = (float)(f.lliliIIIIi[(int)var41] - fieldId);
            float var29 = (float)(f.ililiIIIIi[(int)var41] - presence);
            float var30 = f.llIiiIIIIi[(int)var41] * 2.5F;
            if (!(var27 * var21 + var28 * var22 + var29 * var23 < -var30)) {
               float var31 = (float)Math.sqrt((double)(var27 * var27 + var29 * var29));
               float var32 = 1.0F - lIlliIiiIlliIi.IiIlliIliiIl(var12, var13, var31);
               var32 *= 1.0F - lIlliIiiIlliIi.IiIlliIliiIl(var14, var15, var28);
               var32 *= lIlliIiiIlliIi.IiIlliIliiIl(var16, var17, var28);
               float var33 = var24 * var26 * f.IIiilIiiiIii((int)var41) * ((int)(var41 >>> 32) != 0 ? (float)Math.sqrt((double)var32) : var32);
               float var34 = (float)Math.sqrt((double)(var31 * var31 + var28 * var28));
               var33 *= lIlliIiiIlliIi.IiIlliIliiIl(var19, var20, var34);
               if (!(var33 < 0.004F)) {
                  liiIilIiIl[cx] = cy << 16 | (int)var41;
                  iiiIilIiIl[cx] = var33;
                  lIIlilIiIl[cx] = var32;
                  IIIlilIiIl[cx] = var34;
                  cx++;
               }
            }
         }
      }

      return cx;
   }

   public static boolean liiiIIllIl() {
      return liiillIiIl;
   }

   private static void IIIllIIliIIl() {
      if (iIIIilIiIl != null) {
         iIIIilIiIl.IIIllIIliIIl();
      }

      if (IlIIilIiIl != null) {
         IlIIilIiIl.IIIllIIliIIl();
      }

      llIIilIiIl = 0.0F;
      ilIIilIiIl = 0.0F;
      IlIlllIlilIl();
      iIlIilIiIl = false;
      iiIIilIiIl = 0L;
   }

   private static boolean IIlilIliiIli() {
      long var2 = -529146622168798931L;
      if (iiiillIiIl == null) {
         try {
            var2 ^= (
                  (long)(
                           class_290.field_1584.getVertexSize() == 28
                                 && ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN
                                 && RenderSystem.getDevice().precompilePipeline(liIIiiiiIIii.illllllIlIilllllIl).isValid()
                              ? 1
                              : 0
                        )
                        << 32
                     ^ var2
               )
               & -1L << 32;
         } catch (Throwable var4) {
            var2 ^= (0L ^ var2) & -1L << 32;
         }

         iiiillIiIl = Boolean.valueOf((boolean)((int)(var2 >>> 32)));
         if ((int)(var2 >>> 32) == 0) {
            iliIiiliiiii(
               IllIllllIl<"IllIllllIl","WhYKFe7mYJOFNSka/8moJscUzz4Xy7Srbv4K256fFFO+43MF">(),
               new IllegalStateException(
                  IllIllllIl<"IllIllllIl","PHvTAMGaBiUavvuhLvHX6Mpfm7mKBD9ylXlI8Q9W2a2el3EHV8iTwetD+qfe+djdFa8Rz+AYBOVW109R+OXHmlQ7EFVmOOl+Aw==">()
               )
            );
            return false;
         }
      }

      if (!iiiillIiIl) {
         return false;
      } else {
         if (ilIlilIiIl == null) {
            ilIlilIiIl = MemoryUtil.memAlloc(IIlillIiIl);
            IiIlilIiIl = MemoryUtil.memAddress(ilIlilIiIl);
         }

         return true;
      }
   }

   private static void IIlllIlliIll(IIiiIlIilIiiIlIi wind, float cx, float f, double amount, double cz, double cy, float dt) {
      wind.iIlIlllllill(wind.IIiliIIIIi.iIlIlllllill(cx));
      wind.IilliliilIIi(lIlIilIiIl[0], lIlIilIiIl[1], f, lIlIilIiIl[2]);
      if (iIlIilIiIl) {
         wind.lIiiIiIlilli(IllIilIiIl, lllIilIiIl, illIilIiIl, IilIilIiIl, lilIilIiIl, iilIilIiIl);
      } else {
         wind.iliIiiliiiii();
      }

      wind.Illlllllilll(amount, cz, cy, dt, IiIIilIiIl);
   }

   static int IiIIlliIIl(int c0, int t, float c1) {
      long var6 = 6059249048657709482L;
      long var8 = 5756374934224605048L;
      var6 ^= ((long)Math.round((float)(c0 >> 16 & 0xFF) + (float)((t >> 16 & 0xFF) - (c0 >> 16 & 0xFF)) * c1) << 32 ^ var6) & -1L << 32;
      var6 ^= ((long)Math.round((float)(c0 >> 8 & 0xFF) + (float)((t >> 8 & 0xFF) - (c0 >> 8 & 0xFF)) * c1) ^ var6) & -1L >>> 32;
      var8 ^= ((long)Math.round((float)(c0 & 0xFF) + (float)((t & 0xFF) - (c0 & 0xFF)) * c1) << 32 ^ var8) & -1L << 32;
      return (int)(var6 >>> 32) << 16 | (int)var6 << 8 | (int)(var8 >>> 32);
   }

   private static long IiIiliIiiiIi(long a, float x, float light, float v, float z, float abgr, int u, int y) {
      MemoryUtil.memPutFloat(a, x);
      MemoryUtil.memPutFloat(a + 4L, light);
      MemoryUtil.memPutFloat(a + 8L, v);
      MemoryUtil.memPutFloat(a + 12L, z);
      MemoryUtil.memPutFloat(a + 16L, abgr);
      MemoryUtil.memPutInt(a + 20L, u);
      MemoryUtil.memPutInt(a + 24L, y);
      return a + 28L;
   }

   private static void IiIlliIliiIl(GpuBufferSlice fog) {
      long var35 = -4504758038545155685L;
      long var37 = 4542707932705302977L;
      long var39 = 6179371672576813237L;
      class_310 var1 = class_310.method_1551();
      class_638 var2 = var1.field_1687;
      class_746 var3 = var1.field_1724;
      if (var2 != null && var3 != null && !IIiIIllIiIIl.IliIlllilIi()) {
         long var4 = System.nanoTime();
         float var6 = iiIIilIiIl == 0L ? 0.0F : (float)Math.min(0.25, (double)(var4 - iiIIilIiIl) / 1.0E9);
         iiIIilIiIl = var4;
         var35 ^= ((long)(iliillIiIl.iiiIlIIIll() && var2.method_8597().comp_642() && !var2.method_8597().comp_643() ? 1 : 0) << 32 ^ var35) & -1L << 32;
         var35 ^= ((long)iliillIiIl.lIIlliIIll() ^ var35) & -1L >>> 32;
         var37 ^= ((long)((int)(var35 >>> 32) != 0 && (int)var35 == 0 ? 1 : 0) << 32 ^ var37) & -1L << 32;
         var37 ^= ((long)((int)(var35 >>> 32) != 0 && (int)var35 == 1 ? 1 : 0) ^ var37) & -1L >>> 32;
         llIIilIiIl = Iilililiiili(llIIilIiIl, (boolean)((int)(var37 >>> 32)), var6);
         ilIIilIiIl = Iilililiiili(ilIIilIiIl, (boolean)((int)var37), var6);
         if (llIIilIiIl <= 0.0F && (int)(var37 >>> 32) == 0 && iIIIilIiIl != null && iIIIilIiIl.IliIlllilIi() > 0) {
            iIIIilIiIl.IIIllIIliIIl();
         }

         if (ilIIilIiIl <= 0.0F && (int)var37 == 0 && IlIIilIiIl != null && IlIIilIiIl.IliIlllilIi() > 0) {
            IlIIilIiIl.IIIllIIliIIl();
         }

         if (llIIilIiIl <= 0.0F && ilIIilIiIl <= 0.0F && (int)(var37 >>> 32) == 0 && (int)var37 == 0) {
            IlIlllIlilIl();
            iIlIilIiIl = false;
            IIllilIiIl = 0;
            lIllilIiIl = 0;
         } else {
            long var11 = System.nanoTime();
            IIlIilIiIl += (double)var6;
            float var13 = Iliilliiilii(iliillIiIl.ilIllIiIll());
            float var14 = Iliilliiilii(iliillIiIl.IlIllllIll());
            IIiiIlIilIiiIlIi.IIlllIlliIll(IIlIilIiIl, var13, lIlIilIiIl);
            class_4184 var15 = var1.field_1773.method_19418();
            class_243 var16 = var15.method_71156();
            double var17 = var16.field_1352;
            double var19 = var16.field_1351;
            double var21 = var16.field_1350;
            float var23 = var1.method_61966().method_60637(false);
            double var24 = var3.field_6014 + (var3.method_23317() - var3.field_6014) * (double)var23;
            double var26 = var3.field_6036 + (var3.method_23318() - var3.field_6036) * (double)var23;
            double var28 = var3.field_5969 + (var3.method_23321() - var3.field_5969) * (double)var23;
            Illlllllilll(var24, var26, var28, var6);
            liIIilIiIl = true;
            IiIIilIiIl.IliIlllilIi(var2);
            if ((int)(var37 >>> 32) != 0 || llIIilIiIl > 0.0F) {
               if (iIIIilIiIl == null) {
                  iIIIilIiIl = new IIiiIlIilIiiIlIi(IIlIIlillIlIIlil.IllliilIil, (int)var4);
               }

               IIlllIlliIll(iIIIilIiIl, var14, var13, var17, var19, var21, var6);
            }

            if ((int)var37 != 0 || ilIIilIiIl > 0.0F) {
               if (IlIIilIiIl == null) {
                  IlIIilIiIl = new IIiiIlIilIiiIlIi(IIlIIlillIlIIlil.lllliilIil, (int)(var4 >>> 7));
               }

               IIlllIlliIll(IlIIilIiIl, var14, var13, var17, var19, var21, var6);
            }

            IIiIilIiIl.normalizedPositiveX(lliIilIiIl);
            IIiIilIiIl.normalizedPositiveY(iliIilIiIl);
            IIiIilIiIl.normalizedPositiveZ(IiiIilIiIl);
            float var30 = (float)Math.max(1, var1.method_22683().method_4506());
            float var31 = IiilIIiliilIIi.liiiIIllIl();
            if (!(var31 > 1.0F) || !(var31 < 179.0F)) {
               var31 = 70.0F;
            }

            float var32 = (float)(2.0 * Math.tan(Math.toRadians((double)var31) * 0.5)) / var30;
            lIiillIiIl = 0.016F * var30 * var32;
            iIiillIiIl = 0.011F * var30 * var32;
            var39 ^= (0L ^ var39) & -1L << 32;
            if (iIIIilIiIl != null && llIIilIiIl > 0.0F) {
               var39 ^= ((long)Iilllilliill(iIIIilIiIl, 0, IIiilIiiiIii(llIIilIiIl), var17, var19, var21, (int)(var39 >>> 32)) << 32 ^ var39) & -1L << 32;
            }

            if (IlIIilIiIl != null && ilIIilIiIl > 0.0F) {
               var39 ^= ((long)Iilllilliill(IlIIilIiIl, 1, IIiilIiiiIii(ilIIilIiIl), var17, var19, var21, (int)(var39 >>> 32)) << 32 ^ var39) & -1L << 32;
            }

            lIllilIiIl = (int)(var39 >>> 32);
            if ((int)(var39 >>> 32) == 0) {
               IIllilIiIl = 0;
               iIllilIiIl = System.nanoTime() - var11;
            } else if (IIlilIliiIli()) {
               IIillIiliIil((int)(var39 >>> 32));
               var39 ^= ((long)Ililllililil((int)(var39 >>> 32), var17, var19, var21, var32) ^ var39) & -1L >>> 32;
               IIllilIiIl = (int)var39;
               iIllilIiIl = System.nanoTime() - var11;
               if ((int)var39 > 0) {
                  Illillliilli(var1, (int)var39, fog);
               }
            }
         }
      } else {
         IIIllIIliIIl();
      }
   }

   private static void Illillliilli(class_310 fog, int quads, GpuBufferSlice mc) {
      long var17 = -9056055882297244366L;
      long var15 = -7073321789561025647L;
      var15 ^= ((long)(quads * 4 * 28) << 32 ^ var15) & -1L << 32;
      var15 ^= ((long)iiIlilIiIl ^ var15) & -1L >>> 32;
      iiIlilIiIl = (iiIlilIiIl + 1) % 3;
      GpuBuffer var5 = liIlilIiIl[(int)var15];
      if (var5 == null || var5.isClosed()) {
         var5 = RenderSystem.getDevice().createBuffer(lliillIiIl, 40, (long)IIlillIiIl);
         liIlilIiIl[(int)var15] = var5;
      }

      CommandEncoder var6 = RenderSystem.getDevice().createCommandEncoder();
      ilIlilIiIl.clear();
      ilIlilIiIl.limit((int)(var15 >>> 32));
      var6.writeToBuffer(var5.slice(0L, (long)((int)(var15 >>> 32))), ilIlilIiIl);
      ilIlilIiIl.clear();
      var17 ^= ((long)(quads * 6) << 32 ^ var17) & -1L << 32;
      class_5590 var8 = RenderSystem.getSequentialBuffer(class_5596.field_27382);
      GpuBuffer var9 = var8.method_68274((int)(var17 >>> 32));
      GpuBufferSlice var10 = RenderSystem.getDynamicUniforms().method_71106(IIiIilIiIl, iIiIilIiIl, IliIilIiIl, lIiIilIiIl);
      class_276 var11 = fog.method_1522();
      RenderPass var12 = var6.createRenderPass(IliillIiIl, var11.method_71639(), OptionalInt.empty(), var11.method_71640(), OptionalDouble.empty());

      try {
         var12.setPipeline(liIIiiiiIIii.illllllIlIilllllIl);
         RenderSystem.bindDefaultUniforms(var12);
         if (mc != null) {
            var12.setUniform(IllIllllIl<"IllIllllIl","nT6UnPGEO3o+21g0XC27TLuArwYaAc0fAu4MjprOjA==">(), mc);
         }

         var12.setUniform(IllIllllIl<"IllIllllIl","yamT9sYBEF7O87LnGvmE2WXw02vNeCPEve1NvS3r4URvJD9dMQfRTewxWJlO">(), var10);
         var12.bindTexture(
            IllIllllIl<"IllIllllIl","Nw+JgfVRcZR11nmajyir/gFGqg0P483Z2vIksilq5XGrzIc5">(),
            fog.field_1773.method_22974().method_71650(),
            RenderSystem.getSamplerCache().method_75294(FilterMode.LINEAR)
         );
         var12.setVertexBuffer(0, var5);
         var12.setIndexBuffer(var9, var8.method_31924());
         var12.drawIndexed(0, 0, (int)(var17 >>> 32), 1);
      } catch (Throwable var20) {
         if (var12 != null) {
            try {
               var12.close();
            } catch (Throwable var19) {
               var20.addSuppressed(var19);
            }
         }

         throw var20;
      }

      if (var12 != null) {
         var12.close();
      }
   }

   public static String iIlIlllllill() {
      return String.format(
         Locale.ROOT,
         IllIllllIl<"IllIllllIl","qe0SgcB2wg4rUPdQyvP5hnG+I8kbs88VikVTHPFgt6QJWQna3dOFJRltki0yTTr8EbWcWJQozMZ/nY8z2hAfcYiKXqpaS2viOADIir21t3WlbHrAXfmQm+6DfiHWX8wJBQQk8fSMUcVCiYzqpoMYneKPWeRAFUD59EWqojGZF6xDTMN+jay4yy6WNPt16OIuMWrH3qWmXnF7HRWSmlLZwn/Mq7hAu/J5">(),
         liiillIiIl,
         IIIIilIiIl
            ? IllIllllIl<"IllIllllIl","D7CzmzyqqHl+OP1TfAhD9L2INbmLSRpqvbXNa3J9OXw=">()
            : IllIllllIl<"IllIllllIl","10y/RZP1W3vzgWfEV2AHMcgqlUOMomw8lVUxH0Vy6Z4=">(),
         iIIIilIiIl == null ? 0 : iIIIilIiIl.IliIlllilIi(),
         iIIIilIiIl == null ? 0 : iIIIilIiIl.IlIlllIlilIl(),
         llIIilIiIl,
         IlIIilIiIl == null ? 0 : IlIIilIiIl.IliIlllilIi(),
         IlIIilIiIl == null ? 0 : IlIIilIiIl.IlIlllIlilIl(),
         ilIIilIiIl,
         lIllilIiIl,
         IIllilIiIl,
         (double)iIllilIiIl / 1000000.0
      );
   }

   private static float Iiiiliiiiiii(float v) {
      return v - (float)Math.floor((double)v);
   }

   private static long IIIilIIiiIIi(long alpha, IIiiIlIilIiiIlIi edge, int i, float cx, float f, float cy, double dist, double a, double pxPerDist, float cz) {
      long var82 = -180590443729996035L;
      long var84 = 1116354043698226841L;
      long var86 = 3641579774856527378L;
      long var88 = -8366690963591816868L;
      long var90 = 6347759508860238824L;
      float var14 = 0.35F + 0.65F * f;
      float var15 = edge.llIiiIIIIi[i] * var14;
      float var16 = var15 * edge.ilIiiIIIIi[i];
      float var17 = 1.6F * cz * cy;
      if (var15 < var17) {
         float var18 = var15 / var17;
         cx *= var18 * var18;
         float var19 = var17 / var15;
         var15 *= var19;
         var16 *= var19;
      }

      float var99 = (float)(edge.IliliIIIIi[i] - dist);
      float var100 = (float)(edge.lliliIIIIi[i] - a);
      float var20 = (float)(edge.ililiIIIIi[i] - pxPerDist);
      float var21 = -(IiiIilIiIl.x * var99 + IiiIilIiIl.y * var100 + IiiIilIiIl.z * var20);
      if (var21 <= 0.05F) {
         return alpha;
      } else {
         float var22 = var21 / Math.max(cy, var21);
         float var23 = lIiillIiIl * var21 * var22 * var22;
         if (var15 > var23) {
            var16 *= var23 / var15;
            var15 = var23;
         }

         var82 ^= ((long)IIIIllIIIl(cx) << 32 ^ var82) & -1L << 32;
         if ((int)(var82 >>> 32) <= 0) {
            return alpha;
         } else {
            float var25 = edge.IiliiIIIIi[i];
            float var26 = 4.0F * (float)(1 + (int)(Iiiiliiiiiii(var25 * 13.7F) * 4.0F));
            float var27 = Iiiiliiiiiii(var25 * 7.31F);
            float var28 = edge.liliiIIIIi[i];
            float var29 = edge.iiliiIIIIi[i];
            float var30 = edge.IIiiiIIIIi[i] + (Iiiiliiiiiii(var25 * 11.3F) - 0.5F) * 1.1F;
            float var31 = edge.lIiiiIIIIi[i];
            if (var31 > 0.0F) {
               float var32 = (float)Math.round(var29 / (float) Math.PI) * (float) Math.PI;
               var29 += (var32 - var29) * var31;
               var30 *= 1.0F - var31;
            }

            float var101 = (float)Math.cos((double)var28);
            float var33 = (float)Math.sin((double)var28);
            float var34 = (float)Math.cos((double)var29);
            float var35 = (float)Math.sin((double)var29);
            float var36 = (float)Math.cos((double)var30);
            float var37 = (float)Math.sin((double)var30);
            float var38 = -var33 * var34;
            float var39 = var35;
            float var40 = var101 * var34;
            float var41 = var33 * var35;
            float var43 = -var101 * var35;
            float var44 = var101 * var36 + var41 * var37;
            float var45 = var34 * var37;
            float var46 = var33 * var36 + var43 * var37;
            float var47 = -var101 * var37 + var41 * var36;
            float var48 = var34 * var36;
            float var49 = -var33 * var37 + var43 * var36;
            if (var31 > 0.0F && var48 < 0.0F) {
               var47 = -var47;
               var48 = -var48;
               var49 = -var49;
               var38 = -var38;
               var39 = -var35;
               var40 = -var40;
            }

            float var50 = 0.22F + 0.16F * Iiiiliiiiiii(var25 * 3.7F);
            float var51 = 0.12F + 0.18F * Iiiiliiiiiii(var25 * 5.3F);
            var82 ^= ((long)(-(var47 * var99 + var48 * var100 + var49 * var20) >= 0.0F ? 1 : 0) ^ var82) & -1L >>> 32;
            if (var25 < 0.1F) {
               var84 ^= ((long)IiIIlliIIl(15637162, 16036542, var27) << 32 ^ var84) & -1L << 32;
               var84 ^= ((long)IiIIlliIIl(12858966, 13782120, var27) ^ var84) & -1L >>> 32;
            } else {
               float var55 = (var25 - 0.1F) / 0.9F;
               var84 ^= (
                     (long)(var55 < 0.5F ? IiIIlliIIl(11413056, 13645903, var55 * 2.0F) : IiIIlliIIl(13645903, 14964332, var55 * 2.0F - 1.0F)) << 32 ^ var84
                  )
                  & -1L << 32;
               var84 ^= ((long)(var55 < 0.5F ? IiIIlliIIl(7604766, 10226728, var55 * 2.0F) : IiIIlliIIl(10226728, 12457526, var55 * 2.0F - 1.0F)) ^ var84)
                  & -1L >>> 32;
               var84 ^= ((long)IiIIlliIIl((int)(var84 >>> 32), (int)var84, 0.18F * var27) << 32 ^ var84) & -1L << 32;
            }

            if ((int)var82 == 0) {
               var84 ^= ((long)IiIIlliIIl((int)(var84 >>> 32), 15773884, 0.24F) << 32 ^ var84) & -1L << 32;
               var84 ^= ((long)IiIIlliIIl((int)var84, 14711438, 0.24F) ^ var84) & -1L >>> 32;
            }

            float var102 = 1.0F / (float)Math.sqrt((double)(1.0F + var50 * var50));
            float var56 = 0.7F + 0.3F * Math.abs((var48 + var39 * var50) * var102);
            float var57 = 0.7F + 0.3F * Math.abs((var48 - var39 * var50) * var102);
            var86 ^= ((long)IlIillIiilIi(edge, i) << 32 ^ var86) & -1L << 32;
            float var59 = var44 * var15;
            float var60 = var45 * var15;
            float var61 = var46 * var15;
            float var62 = var38 * var16;
            float var63 = var39 * var16;
            float var64 = var40 * var16;
            float var65 = var50 * var16;
            float var66 = var51 * var15;
            float var67 = var99 - var59;
            float var68 = var100 - var60;
            float var69 = var20 - var61;
            float var70 = var99 + var59 + var47 * var66;
            float var71 = var100 + var60 + var48 * var66;
            float var72 = var20 + var61 + var49 * var66;
            float var73 = var47 * var65;
            float var74 = var48 * var65;
            float var75 = var49 * var65;
            var86 ^= ((long)llIIlilIIl((int)(var84 >>> 32), var56, (int)(var82 >>> 32)) ^ var86) & -1L >>> 32;
            var88 ^= ((long)llIIlilIIl((int)var84, var56, (int)(var82 >>> 32)) << 32 ^ var88) & -1L << 32;
            var88 ^= ((long)llIIlilIIl((int)(var84 >>> 32), var57, (int)(var82 >>> 32)) ^ var88) & -1L >>> 32;
            var90 ^= ((long)llIIlilIIl((int)var84, var57, (int)(var82 >>> 32)) << 32 ^ var90) & -1L << 32;
            float var80 = var26 - 1.0F;
            float var81 = var26 + 1.0F;
            alpha = IiIiliIiiiIi(alpha, var67 - var62 + var73, var68 - var63 + var74, var69 - var64 + var75, var80, -1.0F, (int)var86, (int)(var86 >>> 32));
            alpha = IiIiliIiiiIi(alpha, var67, var68, var69, var26, -1.0F, (int)var86, (int)(var86 >>> 32));
            alpha = IiIiliIiiiIi(alpha, var70, var71, var72, var26, 1.0F, (int)(var88 >>> 32), (int)(var86 >>> 32));
            alpha = IiIiliIiiiIi(
               alpha, var70 - var62 + var73, var71 - var63 + var74, var72 - var64 + var75, var80, 1.0F, (int)(var88 >>> 32), (int)(var86 >>> 32)
            );
            alpha = IiIiliIiiiIi(alpha, var67, var68, var69, var26, -1.0F, (int)var88, (int)(var86 >>> 32));
            alpha = IiIiliIiiiIi(alpha, var67 + var62 + var73, var68 + var63 + var74, var69 + var64 + var75, var81, -1.0F, (int)var88, (int)(var86 >>> 32));
            alpha = IiIiliIiiiIi(
               alpha, var70 + var62 + var73, var71 + var63 + var74, var72 + var64 + var75, var81, 1.0F, (int)(var90 >>> 32), (int)(var86 >>> 32)
            );
            return IiIiliIiiiIi(alpha, var70, var71, var72, var26, 1.0F, (int)(var90 >>> 32), (int)(var86 >>> 32));
         }
      }
   }

   private static void IlIlllIlilIl() {
      if (liIIilIiIl) {
         liIIilIiIl = false;
         IiIIilIiIl.liiiIIllIl();
      }
   }

   private static void iliIiiliiiii(String t, Throwable where) {
      liiillIiIl = true;
   }
}
