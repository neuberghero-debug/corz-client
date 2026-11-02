package gg.corz;

import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.util.Arrays;
import java.util.List;
import net.minecraft.class_1058;
import net.minecraft.class_10889;
import net.minecraft.class_11515;
import net.minecraft.class_11582;
import net.minecraft.class_2248;
import net.minecraft.class_2281;
import net.minecraft.class_2336;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_2404;
import net.minecraft.class_2464;
import net.minecraft.class_2531;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_2745;
import net.minecraft.class_287;
import net.minecraft.class_290;
import net.minecraft.class_310;
import net.minecraft.class_3610;
import net.minecraft.class_4587;
import net.minecraft.class_4608;
import net.minecraft.class_4696;
import net.minecraft.class_4722;
import net.minecraft.class_5819;
import net.minecraft.class_630;
import net.minecraft.class_776;
import net.minecraft.class_777;
import net.minecraft.class_7833;
import net.minecraft.class_9799;
import net.minecraft.class_9801;
import net.minecraft.class_9848;
import net.minecraft.class_9944;
import net.minecraft.class_11959.class_11960;
import net.minecraft.class_2338.class_2339;
import org.joml.Vector3fc;

final class lIIlliiIIlli implements AutoCloseable {
   private static final int IIlliiIIllIlliiIIl = 18;
   private class_287 iIiIiiIIlIliIiiIIl;
   private static final class_2350[] iililiIIlIIiiliIIl = class_2350.values();
   private final class_4587 llIIiiIIlilIIiiIIl;
   private static final class_11515[] lIiiliIIliIiiliIIl = class_11515.values();
   private class_630 lIIliiIIliIIliiIIl;
   private static final int IliiliIIllliiliIIl = 15728880;
   private class_630 IlIliiIIlllIliiIIl;
   private final class_9799 IIIIiiIIllIIIiiIIl;
   private final class_9799 liiiliIIliiiiliIIl;
   private static final IIlIlIllIlIlIl[] IililiIIllililiIIl = IIlIlIllIlIlIl.values();
   private class_630 iiiIiiIIlIIIliiIIl;
   private final class_9799 iIIIiiIIlIlIIiiIIl;
   private int lilIiiIIliilIiiIIl;
   private class_287 IiiIiiIIlliiIiiIIl;
   private final class_2339 iiIIiiIIlIIlIiiIIl;
   private final LongOpenHashSet lIlIiiIIliIlIiiIIl;
   private final ililiiilIiiliiil liIliiIIliiIliiIIl;
   private final class_5819 IiIIiiIIlliIIiiIIl;
   private final int[] IllIiiIIllllIiiIIl;
   private final class_9799[] iliiliIIlIiiiliIIl;
   private final float[] ilIliiIIlIiIliiIIl;
   private final IntArrayList illIiiIIlIilIiiIIl;
   private class_287 lliIiiIIliliIiiIIl;
   private final class_287[] IIiIiiIIllIiIiiIIl;

   private static void Iiilliiliiil(int[] j, int l, int b, int g, int a, int f, int o, int i, int h, int d, int k, int c, int e) {
      j[0] = l;
      j[1] = b;
      j[2] = g;
      j[3] = a;
      j[4] = f;
      j[5] = o;
      j[6] = i;
      j[7] = h;
      j[8] = d;
      j[9] = k;
      j[10] = c;
      j[11] = e;
   }

   private boolean IIIllIIliIIl(class_776 ctx, class_11515 layer, IlilIlIillilIlIi brm, class_2338 idx, class_2680 want, IllIIlilllIIli sec, int pos) {
      long var11 = 7754736884060637102L;
      class_287 var8 = this.liiiIIllIl(layer.ordinal());
      if (this.IiIiliIiiiIi(ctx, var8, brm, idx, want, sec)) {
         return true;
      } else {
         var11 ^= (0L ^ var11) & -1L << 32;
         if (IIiilIiiiIii(want)) {
            var11 ^= ((long)this.Iliilliiilii(this.iIlIlllllill(), brm, idx, want) << 32 ^ var11) & -1L << 32;
         }

         if ((int)(var11 >>> 32) > 0) {
            var11 ^= (1L ^ var11) & -1L >>> 32;
            this.lilIiiIIliilIiiIIl += (int)(var11 >>> 32);
         } else {
            var11 ^= ((long)this.Illillliilli(ctx, var8, brm, idx, want, sec) ^ var11) & -1L >>> 32;
            if ((int)var11 != 0) {
               this.lilIiiIIliilIiiIIl += 6;
            }
         }

         this.illIiiIIlIilIiiIIl.add(pos);
         return (boolean)((int)var11);
      }
   }

   private static void lIlIliIlIl(class_287 az, float r, float width, float bx, float b, float ay, float g, int by, int buf, int ax, int bz, float a) {
      float var12 = b - r;
      float var13 = ay - width;
      float var14 = g - bx;
      float var15 = (float)Math.sqrt((double)(var12 * var12 + var13 * var13 + var14 * var14));
      if (var15 > 1.0E-6F) {
         var12 /= var15;
         var13 /= var15;
         var14 /= var15;
      } else {
         var12 = 0.0F;
         var13 = 1.0F;
         var14 = 0.0F;
      }

      az.method_22912(r, width, bx).method_1336(by, buf, ax, bz).method_22914(var12, var13, var14).method_75298(a);
      az.method_22912(b, ay, g).method_1336(by, buf, ax, bz).method_22914(var12, var13, var14).method_75298(a);
   }

   private static void Ililllililil(class_2350 y0, int x0, int z0, int dir, int[] out) {
      long var8 = 6373123015530661566L;
      long var10 = 2190763690899091751L;
      var8 ^= ((long)(x0 + 1) << 32 ^ var8) & -1L << 32;
      var8 ^= ((long)(z0 + 1) ^ var8) & -1L >>> 32;
      var10 ^= ((long)(dir + 1) << 32 ^ var10) & -1L << 32;
      switch (y0) {
         case field_11033:
            Iiilliiliiil(out, x0, z0, dir, (int)(var8 >>> 32), z0, dir, (int)(var8 >>> 32), z0, (int)(var10 >>> 32), x0, z0, (int)(var10 >>> 32));
            break;
         case field_11036:
            Iiilliiliiil(
               out,
               x0,
               (int)var8,
               dir,
               (int)(var8 >>> 32),
               (int)var8,
               dir,
               (int)(var8 >>> 32),
               (int)var8,
               (int)(var10 >>> 32),
               x0,
               (int)var8,
               (int)(var10 >>> 32)
            );
            break;
         case field_11043:
            Iiilliiliiil(out, x0, z0, dir, (int)(var8 >>> 32), z0, dir, (int)(var8 >>> 32), (int)var8, dir, x0, (int)var8, dir);
            break;
         case field_11035:
            Iiilliiliiil(
               out,
               x0,
               z0,
               (int)(var10 >>> 32),
               (int)(var8 >>> 32),
               z0,
               (int)(var10 >>> 32),
               (int)(var8 >>> 32),
               (int)var8,
               (int)(var10 >>> 32),
               x0,
               (int)var8,
               (int)(var10 >>> 32)
            );
            break;
         case field_11039:
            Iiilliiliiil(out, x0, z0, dir, x0, z0, (int)(var10 >>> 32), x0, (int)var8, (int)(var10 >>> 32), x0, (int)var8, dir);
            break;
         case field_11034:
            Iiilliiliiil(
               out,
               (int)(var8 >>> 32),
               z0,
               dir,
               (int)(var8 >>> 32),
               z0,
               (int)(var10 >>> 32),
               (int)(var8 >>> 32),
               (int)var8,
               (int)(var10 >>> 32),
               (int)(var8 >>> 32),
               (int)var8,
               dir
            );
      }
   }

   @Override
   public void close() {
      long var5 = 2276068933729948639L;
      class_9799[] var1 = this.iliiliIIlIiiiliIIl;
      var5 ^= ((long)var1.length << 32 ^ var5) & -1L << 32;

      for (long var8 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
         class_9799 var4 = var1[(int)var8];
         var4.close();
      }

      this.IIIIiiIIllIIIiiIIl.close();
      this.iIIIiiIIlIlIIiiIIl.close();
   }

   private class_287 liiiIIllIl(int layerIndex) {
      if (this.IIiIiiIIllIiIiiIIl[layerIndex] == null) {
         this.iliiliIIlIiiiliIIl[layerIndex].method_60811();
         this.IIiIiiIIllIiIiiIIl[layerIndex] = new class_287(this.iliiliIIlIiiiliIIl[layerIndex], class_5596.field_27382, class_290.field_1590);
      }

      return this.IIiIiiIIllIiIiiIIl[layerIndex];
   }

   private class_630 Iiiiliiiiiii(class_2745 type) {
      switch (type) {
         case field_12574:
            if (this.lIIliiIIliIIliiIIl == null) {
               this.lIIliiIIliIIliiIIl = class_9944.method_62072().method_32109();
            }

            return this.lIIliiIIliIIliiIIl;
         case field_12571:
            if (this.IlIliiIIlllIliiIIl == null) {
               this.IlIliiIIlllIliiIIl = class_9944.method_62071().method_32109();
            }

            return this.IlIliiIIlllIliiIIl;
         default:
            if (this.iiiIiiIIlIIIliiIIl == null) {
               this.iiiIiiIIlIIIliiIIl = class_9944.method_62070().method_32109();
            }

            return this.iiiIiiIIlIIIliiIIl;
      }
   }

   private static boolean IIiilIiiiIii(class_2680 state) {
      class_2248 var1 = state.method_26204();
      return var1 instanceof class_2281 || var1 instanceof class_2336;
   }

   private static int Iilililiiili(int s, float argb) {
      return class_9848.method_61321(s, argb);
   }

   private void Illlllllilll(class_287 want, class_776 pos, IlilIlIillilIlIi rgb, class_2338 sec, class_2680 brm, int width, float buf) {
      long var22 = -1383950187594279010L;
      long var24 = -5531113036773804880L;
      long var26 = -2063725640264610189L;
      long var28 = 4342353155332262079L;

      List var8;
      try {
         this.IiIIiiIIlliIIiiIIl.method_43052(brm.method_26190(sec));
         var8 = pos.method_3349(brm).method_68512(this.IiIIiiIIlliIIiiIIl);
      } catch (Throwable var30) {
         this.IIlllIlliIll(want, rgb, sec.method_10263(), sec.method_10264(), sec.method_10260(), width, buf);
         return;
      }

      float var9 = (float)(sec.method_10263() - rgb.IIliIIIIIi);
      float var10 = (float)(sec.method_10264() - rgb.lIliIIIIIi);
      float var11 = (float)(sec.method_10260() - rgb.iIliIIIIIi);
      var22 ^= ((long)(width >> 16 & 0xFF) << 32 ^ var22) & -1L << 32;
      var22 ^= ((long)(width >> 8 & 0xFF) ^ var22) & -1L >>> 32;
      var24 ^= ((long)(width & 0xFF) << 32 ^ var24) & -1L << 32;
      var24 ^= ((long)Math.round(255.0F) ^ var24) & -1L >>> 32;
      var26 ^= (0L ^ var26) & -1L << 32;

      while ((int)(var26 >>> 32) < var8.size()) {
         class_10889 var17 = (class_10889)var8.get((int)(var26 >>> 32));
         this.Iilllilliill(want, var17.method_68509(null), var9, var10, var11, (int)(var22 >>> 32), (int)var22, (int)(var24 >>> 32), (int)var24, buf);
         class_2350[] var18 = iililiIIlIIiiliIIl;
         var26 ^= ((long)var18.length ^ var26) & -1L >>> 32;

         for (var28 ^= (0L ^ var28) & -1L << 32; (int)(var28 >>> 32) < (int)var26; var28 += 4294967296L) {
            class_2350 var21 = var18[(int)(var28 >>> 32)];
            this.Iilllilliill(want, var17.method_68509(var21), var9, var10, var11, (int)(var22 >>> 32), (int)var22, (int)(var24 >>> 32), (int)var24, buf);
         }

         var26 += 4294967296L;
      }
   }

   private void IlIlllIlilIl(IlilIlIillilIlIi sec, IllIIlilllIIli ctx, class_776 brm) {
      long var16 = -1727428329546802614L;
      long var18 = -2337573120308835387L;
      long var20 = -8043699917845554937L;
      long var22 = 5446744844826189437L;
      long var24 = 2515821419568008448L;
      IlIlilillIlili var4 = ctx.liIiIiiiiiiIiIiiii;
      float var5 = var4.IiIlliIliiIl();

      for (var16 ^= (0L ^ var16) & -1L << 32; (int)(var16 >>> 32) < sec.llliIIIIIi.length; var16 += 4294967296L) {
         IIlIlIllIlIlIl var7 = IililiIIllililiIIl[sec.illiIIIIIi[(int)(var16 >>> 32)]];
         if (var7 != IIlIlIllIlIlIl.IliIIIIlllliIIIIll) {
            var16 ^= ((long)sec.llliIIIIIi[(int)(var16 >>> 32)] ^ var16) & -1L >>> 32;
            class_2338 var9 = ctx.iiilIiiiiIIIiIiiii.get((int)var16);
            class_2680 var10 = ctx.lIIiIiiiiiIIiIiiii.get((int)var16);
            if (var10 != null && !var10.method_26215() && var4.IIIilIIiiIIi(var9.method_10264())) {
               var18 ^= ((long)(var10.method_26217() != class_2464.field_11455 ? 1 : 0) << 32 ^ var18) & -1L << 32;
               var18 ^= (0L ^ var18) & -1L >>> 32;
               if (var4.iIlIlllllill(var7)) {
                  class_3610 var13 = var10.method_26227();
                  if (!var13.method_15769()) {
                     this.llIIlilIIl(brm, this.liiiIIllIl(class_4696.method_23680(var13).ordinal()), var9, var10, ctx);
                     var18 ^= (1L ^ var18) & -1L >>> 32;
                  }

                  if ((int)(var18 >>> 32) != 0) {
                     var18 ^= ((long)((int)var18 | this.IIIllIIliIIl(brm, class_4696.method_23679(var10), sec, var9, var10, ctx, (int)var16)) ^ var18)
                        & -1L >>> 32;
                  }
               }

               if (var4.IilliliilIIi(var7)) {
                  var20 ^= ((long)IililIllililIl.IliIlllilIi(var7) << 32 ^ var20) & -1L << 32;
                  float var14 = var4.IIIllIIliIIl(var7, (boolean)((int)var18));
                  if (var14 > 0.002F) {
                     this.IiIlliIliiIl(this.IilliliilIIi(), sec, var9.method_10263(), var9.method_10264(), var9.method_10260(), (int)(var20 >>> 32), var14);
                  }

                  if (var4.illIlIilIl()) {
                     var20 ^= ((long)(var7 == IIlIlIllIlIlIl.lllIIIIllillIIIIll && (int)(var18 >>> 32) != 0 ? 1 : 0) ^ var20) & -1L >>> 32;
                     if ((int)var20 != 0) {
                        this.Illlllllilll(this.lIiiIiIlilli(), brm, sec, var9, var10, (int)(var20 >>> 32), var5);
                     } else {
                        this.IIlllIlliIll(this.lIiiIiIlilli(), sec, var9.method_10263(), var9.method_10264(), var9.method_10260(), (int)(var20 >>> 32), var5);
                     }
                  }
               }
            }
         }
      }

      if (var4.IilliliilIIi(IIlIlIllIlIlIl.lIiIIIIlliIiIIIIll) && sec.iiliIIIIIi.length > 0) {
         var16 ^= ((long)IililIllililIl.IliIlllilIi(IIlIlIllIlIlIl.lIiIIIIlliIiIIIIll) << 32 ^ var16) & -1L << 32;
         float var26 = var4.IIIllIIliIIl(IIlIlIllIlIlIl.lIiIIIIlliIiIIIIll, false);
         long[] var8 = sec.iiliIIIIIi;
         var22 ^= ((long)var8.length << 32 ^ var22) & -1L << 32;

         for (long var32 = var22 ^ (0L ^ var22) & -1L >>> 32; (int)var32 < (int)(var32 >>> 32); var32 ^= (var32 ^ var32 + (long)1) & -1L >>> 32) {
            long var11 = var8[(int)var32];
            var20 ^= ((long)class_2338.method_10061(var11) << 32 ^ var20) & -1L << 32;
            var24 ^= ((long)class_2338.method_10071(var11) << 32 ^ var24) & -1L << 32;
            var20 ^= ((long)class_2338.method_10083(var11) ^ var20) & -1L >>> 32;
            if (var4.IIIilIIiiIIi((int)(var24 >>> 32))) {
               if (var26 > 0.002F) {
                  this.IiIlliIliiIl(this.IilliliilIIi(), sec, (int)(var20 >>> 32), (int)(var24 >>> 32), (int)var20, (int)(var16 >>> 32), var26);
               }

               if (var4.illIlIilIl()) {
                  this.IIlllIlliIll(this.lIiiIiIlilli(), sec, (int)(var20 >>> 32), (int)(var24 >>> 32), (int)var20, (int)(var16 >>> 32), var5);
               }
            }
         }
      }
   }

   private void IiIlliIliiIl(class_287 buf, IlilIlIillilIlIi alpha, int wy, int wz, int sec, int rgb, float wx) {
      long var18 = -7935188601910830333L;
      long var20 = -7507537729073171634L;
      float var8 = (float)(wy - alpha.IIliIIIIIi);
      float var9 = (float)(wz - alpha.lIliIIIIIi);
      float var10 = (float)(sec - alpha.iIliIIIIIi);
      float var11 = var8 + 1.0F;
      float var12 = var9 + 1.0F;
      float var13 = var10 + 1.0F;
      var18 ^= ((long)(rgb >> 16 & 0xFF) << 32 ^ var18) & -1L << 32;
      var18 ^= ((long)(rgb >> 8 & 0xFF) ^ var18) & -1L >>> 32;
      var20 ^= ((long)(rgb & 0xFF) << 32 ^ var20) & -1L << 32;
      var20 ^= ((long)Math.round(Math.min(1.0F, Math.max(0.0F, wx)) * 255.0F) ^ var20) & -1L >>> 32;
      if ((int)var20 > 0) {
         iiIIlIIlIl(
            buf, var8, var9, var10, var11, var9, var10, var11, var9, var13, var8, var9, var13, (int)(var18 >>> 32), (int)var18, (int)(var20 >>> 32), (int)var20
         );
         iiIIlIIlIl(
            buf,
            var8,
            var12,
            var13,
            var11,
            var12,
            var13,
            var11,
            var12,
            var10,
            var8,
            var12,
            var10,
            (int)(var18 >>> 32),
            (int)var18,
            (int)(var20 >>> 32),
            (int)var20
         );
         iiIIlIIlIl(
            buf,
            var11,
            var9,
            var10,
            var8,
            var9,
            var10,
            var8,
            var12,
            var10,
            var11,
            var12,
            var10,
            (int)(var18 >>> 32),
            (int)var18,
            (int)(var20 >>> 32),
            (int)var20
         );
         iiIIlIIlIl(
            buf,
            var8,
            var9,
            var13,
            var11,
            var9,
            var13,
            var11,
            var12,
            var13,
            var8,
            var12,
            var13,
            (int)(var18 >>> 32),
            (int)var18,
            (int)(var20 >>> 32),
            (int)var20
         );
         iiIIlIIlIl(
            buf, var8, var9, var10, var8, var9, var13, var8, var12, var13, var8, var12, var10, (int)(var18 >>> 32), (int)var18, (int)(var20 >>> 32), (int)var20
         );
         iiIIlIIlIl(
            buf,
            var11,
            var9,
            var13,
            var11,
            var9,
            var10,
            var11,
            var12,
            var10,
            var11,
            var12,
            var13,
            (int)(var18 >>> 32),
            (int)var18,
            (int)(var20 >>> 32),
            (int)var20
         );
      }
   }

   private static int IlIillIiilIi(IIlIlIllIlIlIl cls, IllIIlilllIIli ctx) {
      return switch (cls) {
         case lllIIIIllillIIIIll -> ctx.llliIiiiiilliIiiii;
         case IilIIIIlllilIIIIll -> ctx.IiliIiiiililiIiiii;
         case iilIIIIllIIiIIIIll -> ctx.iiliIiiiiIIiiIiiii;
         case lIiIIIIlliIiIIIIll -> ctx.lIiiIiiiiiIiiIiiii;
         case iIlIIIIllIllIIIIll -> ctx.iIliIiiiiIlliIiiii;
         case IliIIIIlllliIIIIll -> ctx.IIliIiiiilIliIiiii;
      };
   }

   void IliIlllilIi(IlilIlIillilIlIi ctx, IllIIlilllIIli sec) {
      long var13 = 8074874094998501565L;
      long var15 = 8613041400755364716L;
      class_310 var3 = class_310.method_1551();
      class_776 var4 = var3.method_1541();
      this.lIlIiiIIliIlIiiIIl.clear();
      this.illIiiIIlIilIiiIIl.clear();
      this.lilIiiIIliilIiiIIl = 0;
      class_2350[] var5 = iililiIIlIIiiliIIl;
      var13 ^= ((long)var5.length << 32 ^ var13) & -1L << 32;

      for (long var41 = var13 ^ (0L ^ var13) & -1L >>> 32; (int)var41 < (int)(var41 >>> 32); var41 ^= (var41 ^ var41 + (long)1) & -1L >>> 32) {
         class_2350 var8 = var5[(int)var41];
         this.ilIliiIIlIiIliiIIl[var8.ordinal()] = sec.ilIiIiiiiIiIiIiiii.method_24852(var8, true);
      }

      Arrays.fill(this.IIiIiiIIllIiIiiIIl, null);
      this.iIiIiiIIlIliIiiIIl = null;
      this.lliIiiIIliliIiiIIl = null;
      this.IiiIiiIIlliiIiiIIl = null;
      if (sec.liIiIiiiiiiIiIiiii.liiiIIllIl()) {
         this.IlIlllIlilIl(ctx, sec, var4);
      } else {
         this.iliIiiliiiii(ctx, sec, var4);
      }

      for (long var42 = var15 ^ (0L ^ var15) & -1L << 32; (int)(var42 >>> 32) < this.IIiIiiIIllIiIiiIIl.length; var42 += 4294967296L) {
         class_9801 var6 = this.IIiIiiIIllIiIiiIIl[(int)(var42 >>> 32)] == null ? null : this.IIiIiiIIllIiIiiIIl[(int)(var42 >>> 32)].method_60794();
         Iililllllilillll var7 = ctx.iIlIlllllill(lIiiliIIliIiiliIIl[(int)(var42 >>> 32)]);

         try {
            var7.iIlIlllllill(var6);
         } finally {
            if (var6 != null) {
               var6.close();
            }
         }
      }

      class_9801 var37 = this.iIiIiiIIlIliIiiIIl == null ? null : this.iIiIiiIIlIliIiiIIl.method_60794();

      try {
         ctx.IilliliilIIi().iIlIlllllill(var37);
      } finally {
         if (var37 != null) {
            var37.close();
         }
      }

      class_9801 var38 = this.lliIiiIIliliIiiIIl == null ? null : this.lliIiiIIliliIiiIIl.method_60794();

      try {
         ctx.lIiiIiIlilli().iIlIlllllill(var38);
      } finally {
         if (var38 != null) {
            var38.close();
         }
      }

      ctx.IiliIIIIIi = this.illIiiIIlIilIiiIIl.isEmpty() ? new int[0] : this.illIiiIIlIilIiiIIl.toIntArray();
      ctx.liliIIIIIi = this.lilIiiIIliilIiiIIl;
      class_9801 var39 = this.IiiIiiIIlliiIiiIIl == null ? null : this.IiiIiiIIlliiIiiIIl.method_60794();

      try {
         ctx.iliIiiliiiii().iIlIlllllill(var39);
      } finally {
         if (var39 != null) {
            var39.close();
         }
      }
   }

   lIIlliiIIlli() {
      long var2 = -2653214175791742715L;
      super();
      this.iliiliIIlIiiiliIIl = new class_9799[class_11515.values().length];
      this.liiiliIIliiiiliIIl = new class_9799(262144);
      this.IIIIiiIIllIIIiiIIl = new class_9799(262144);
      this.iIIIiiIIlIlIIiiIIl = new class_9799(131072);
      this.llIIiiIIlilIIiiIIl = new class_4587();
      this.IiIIiiIIlliIIiiIIl = class_5819.method_43047();
      this.iiIIiiIIlIIlIiiIIl = new class_2339();
      this.lIlIiiIIliIlIiiIIl = new LongOpenHashSet();
      this.IllIiiIIllllIiiIIl = new int[12];
      this.illIiiIIlIilIiiIIl = new IntArrayList();
      this.IIiIiiIIllIiIiiIIl = new class_287[class_11515.values().length];
      this.ilIliiIIlIiIliiIIl = new float[6];
      this.liIliiIIliiIliiIIl = new ililiiilIiiliiil(this.ilIliiIIlIiIliiIIl);

      for (long var4 = var2 ^ (0L ^ var2) & -1L << 32; (int)(var4 >>> 32) < this.iliiliIIlIiiiliIIl.length; var4 += 4294967296L) {
         this.iliiliIIlIiiiliIIl[(int)(var4 >>> 32)] = new class_9799(lIiiliIIliIiiliIIl[(int)(var4 >>> 32)].method_72021());
      }
   }

   private void Iilllilliill(class_287 a, List<class_777> width, float quads, float g, float buf, int r, int oz, int b, int ox, float oy) {
      long var16 = -4445710817766559360L;
      var16 ^= (0L ^ var16) & -1L << 32;

      while ((int)(var16 >>> 32) < width.size()) {
         class_777 var12 = (class_777)width.get((int)(var16 >>> 32));

         for (var16 ^= (0L ^ var16) & -1L >>> 32; (int)var16 < 4; var16 ^= (var16 ^ var16 + (long)1) & -1L >>> 32) {
            Vector3fc var14 = var12.method_76648((int)var16);
            Vector3fc var15 = var12.method_76648((int)var16 + 1 & 3);
            lIlIliIlIl(a, quads + var14.x(), g + var14.y(), buf + var14.z(), quads + var15.x(), g + var15.y(), buf + var15.z(), r, oz, b, ox, oy);
         }

         var16 += 4294967296L;
      }
   }

   private static void iiIIlIIlIl(
      class_287 ay,
      float bx,
      float dx,
      float buf,
      float bz,
      float az,
      float dy,
      float ax,
      float by,
      float r,
      float b,
      float cx,
      float cy,
      int dz,
      int cz,
      int a,
      int g
   ) {
      ay.method_22912(bx, dx, buf).method_1336(dz, cz, a, g);
      ay.method_22912(bz, az, dy).method_1336(dz, cz, a, g);
      ay.method_22912(ax, by, r).method_1336(dz, cz, a, g);
      ay.method_22912(b, cx, cy).method_1336(dz, cz, a, g);
   }

   private int Iliilliiilii(class_287 want, IlilIlIillilIlIi buf, class_2338 sec, class_2680 pos) {
      try {
         class_2745 var5 = pos.method_28498(class_2281.field_10770) ? (class_2745)pos.method_11654(class_2281.field_10770) : class_2745.field_12569;
         class_630 var6 = this.Iiiiliiiiiii(var5);
         if (var6 == null) {
            return 0;
         } else {
            class_1058 var7 = IIIIllIIIl(pos, var5);
            if (var7 == null) {
               return 0;
            } else {
               class_2350 var8 = pos.method_28498(class_2281.field_10768) ? (class_2350)pos.method_11654(class_2281.field_10768) : class_2350.field_11043;
               this.llIIiiIIlilIIiiIIl.method_22903();

               try {
                  this.llIIiiIIlilIIiiIIl
                     .method_46416(
                        (float)(sec.method_10263() - buf.IIliIIIIIi),
                        (float)(sec.method_10264() - buf.lIliIIIIIi),
                        (float)(sec.method_10260() - buf.iIliIIIIIi)
                     );
                  this.llIIiiIIlilIIiiIIl.method_46416(0.5F, 0.5F, 0.5F);
                  this.llIIiiIIlilIIiiIIl.method_22907(class_7833.field_40716.rotationDegrees(-var8.method_10144()));
                  this.llIIiiIIlilIIiiIIl.method_46416(-0.5F, -0.5F, -0.5F);
                  var6.method_22698(this.llIIiiIIlilIIiiIIl, this.liIliiIIliiIliiIIl.IliIlllilIi(var7.method_24108(want)), 15728880, class_4608.field_21444);
               } finally {
                  this.llIIiiIIlilIIiiIIl.method_22909();
               }

               return 18;
            }
         }
      } catch (Throwable var13) {
         return 0;
      }
   }

   private boolean Illillliilli(class_776 brm, class_287 want, IlilIlIillilIlIi ctx, class_2338 buf, class_2680 sec, IllIIlilllIIli pos) {
      class_1058 var7 = null;

      try {
         var7 = brm.method_3349(sec).method_68511();
      } catch (Throwable var36) {
      }

      if (var7 == null) {
         try {
            var7 = brm.method_3351().method_3339(sec);
         } catch (Throwable var35) {
         }
      }

      if (var7 == null) {
         return false;
      } else {
         double var8 = 0.0;
         double var10 = 0.0;
         double var12 = 0.0;
         double var14 = 1.0;
         double var16 = 1.0;
         double var18 = 1.0;

         try {
            class_265 var20 = sec.method_26218(pos.ilIiIiiiiIiIiIiiii, buf);
            if (var20 != null && !var20.method_1110()) {
               class_238 var21 = var20.method_1107();
               var8 = var21.field_1323;
               var10 = var21.field_1322;
               var12 = var21.field_1321;
               var14 = var21.field_1320;
               var16 = var21.field_1325;
               var18 = var21.field_1324;
            } else {
               var12 = 0.0;
               var10 = 0.0;
               var8 = 0.0;
               var18 = 1.0;
               var16 = 1.0;
               var14 = 1.0;
            }
         } catch (Throwable var37) {
            var12 = 0.0;
            var10 = 0.0;
            var8 = 0.0;
            var18 = 1.0;
            var16 = 1.0;
            var14 = 1.0;
         }

         double var44 = 0.0625;
         if (var14 - var8 < 0.0625) {
            double var22 = (var8 + var14) * 0.5;
            var8 = var22 - 0.03125;
            var14 = var22 + 0.03125;
         }

         if (var16 - var10 < 0.0625) {
            double var45 = (var10 + var16) * 0.5;
            var10 = var45 - 0.03125;
            var16 = var45 + 0.03125;
         }

         if (var18 - var12 < 0.0625) {
            double var46 = (var12 + var18) * 0.5;
            var12 = var46 - 0.03125;
            var18 = var46 + 0.03125;
         }

         float var47 = (float)(buf.method_10263() - ctx.IIliIIIIIi);
         float var23 = (float)(buf.method_10264() - ctx.lIliIIIIIi);
         float var24 = (float)(buf.method_10260() - ctx.iIliIIIIIi);
         float var25 = var47 + (float)var8;
         float var26 = var23 + (float)var10;
         float var27 = var24 + (float)var12;
         float var28 = var47 + (float)var14;
         float var29 = var23 + (float)var16;
         float var30 = var24 + (float)var18;
         float var31 = var7.method_4594();
         float var32 = var7.method_4577();
         float var33 = var7.method_4593();
         float var34 = var7.method_4575();
         this.iIIIlIlIIl(
            want, var25, var26, var27, var28, var26, var27, var28, var26, var30, var25, var26, var30, var31, var33, var32, var34, 0.0F, -1.0F, 0.0F
         );
         this.iIIIlIlIIl(want, var25, var29, var30, var28, var29, var30, var28, var29, var27, var25, var29, var27, var31, var33, var32, var34, 0.0F, 1.0F, 0.0F);
         this.iIIIlIlIIl(
            want, var28, var26, var27, var25, var26, var27, var25, var29, var27, var28, var29, var27, var31, var33, var32, var34, 0.0F, 0.0F, -1.0F
         );
         this.iIIIlIlIIl(want, var25, var26, var30, var28, var26, var30, var28, var29, var30, var25, var29, var30, var31, var33, var32, var34, 0.0F, 0.0F, 1.0F);
         this.iIIIlIlIIl(
            want, var25, var26, var27, var25, var26, var30, var25, var29, var30, var25, var29, var27, var31, var33, var32, var34, -1.0F, 0.0F, 0.0F
         );
         this.iIIIlIlIIl(want, var28, var26, var30, var28, var26, var27, var28, var29, var27, var28, var29, var30, var31, var33, var32, var34, 1.0F, 0.0F, 0.0F);
         return true;
      }
   }

   private void iIIIlIlIIl(
      class_287 ay,
      float ny,
      float u0,
      float by,
      float cy,
      float u1,
      float bx,
      float buf,
      float cx,
      float dx,
      float dz,
      float az,
      float cz,
      float v0,
      float bz,
      float ax,
      float dy,
      float nz,
      float v1,
      float nx
   ) {
      long var22 = 5985902367854909090L;
      var22 ^= ((long)Iilililiiili(-1, this.ilIliiIIlIiIliiIIl[class_2350.method_10147(nz, v1, nx).ordinal()]) << 32 ^ var22) & -1L << 32;
      ay.method_22912(ny, u0, by).method_39415((int)(var22 >>> 32)).method_22913(v0, dy).method_60803(15728880).method_22914(nz, v1, nx);
      ay.method_22912(cy, u1, bx).method_39415((int)(var22 >>> 32)).method_22913(ax, dy).method_60803(15728880).method_22914(nz, v1, nx);
      ay.method_22912(buf, cx, dx).method_39415((int)(var22 >>> 32)).method_22913(ax, bz).method_60803(15728880).method_22914(nz, v1, nx);
      ay.method_22912(dz, az, cz).method_39415((int)(var22 >>> 32)).method_22913(v0, bz).method_60803(15728880).method_22914(nz, v1, nx);
   }

   private class_287 iIlIlllllill() {
      if (this.iIiIiiIIlIliIiiIIl == null) {
         this.liiiliIIliiiiliIIl.method_60811();
         this.iIiIiiIIlIliIiiIIl = new class_287(this.liiiliIIliiiiliIIl, class_5596.field_27382, class_290.field_1590);
      }

      return this.iIiIiiIIlIliIiiIIl;
   }

   private void iliIiiliiiii(IlilIlIillilIlIi brm, IllIIlilllIIli sec, class_776 ctx) {
      long var12 = -5001466900894424303L;
      long var14 = -4014689364505624579L;
      var12 ^= (0L ^ var12) & -1L << 32;

      while ((int)(var12 >>> 32) < brm.llliIIIIIi.length) {
         IIlIlIllIlIlIl var5 = IililiIIllililiIIl[brm.illiIIIIIi[(int)(var12 >>> 32)]];
         var12 ^= ((long)brm.llliIIIIIi[(int)(var12 >>> 32)] ^ var12) & -1L >>> 32;
         class_2338 var7 = sec.iiilIiiiiIIIiIiiii.get((int)var12);
         class_2680 var8 = sec.lIIiIiiiiiIIiIiiii.get((int)var12);
         if (sec.liIiIiiiiiiIiIiiii.IIIilIIiiIIi(var7.method_10264())) {
            var14 ^= (0L ^ var14) & -1L << 32;
            if (sec.liIiIiiiiiiIiIiiii.iIlIlllllill(var5) && var8 != null && !var8.method_26215()) {
               var14 ^= ((long)(!var8.method_26227().method_15769() && var8.method_26204() instanceof class_2404 ? 1 : 0) ^ var14) & -1L >>> 32;
               class_11515 var11 = (int)var14 != 0 ? class_4696.method_23680(var8.method_26227()) : class_4696.method_23679(var8);
               if ((int)var14 != 0) {
                  this.llIIlilIIl(ctx, this.liiiIIllIl(var11.ordinal()), var7, var8, sec);
                  var14 ^= (4294967296L ^ var14) & -1L << 32;
               } else {
                  var14 ^= ((long)this.IIIllIIliIIl(ctx, var11, brm, var7, var8, sec, (int)var12) << 32 ^ var14) & -1L << 32;
               }
            }

            if (sec.liIiIiiiiiiIiIiiii.IilliliilIIi(var5) && var5 != IIlIlIllIlIlIl.IliIIIIlllliIIIIll) {
               var14 ^= ((long)IlIillIiilIi(var5, sec) ^ var14) & -1L >>> 32;
               float var16 = sec.liIiIiiiiiiIiIiiii.IIIllIIliIIl(var5, (boolean)((int)(var14 >>> 32)));
               if (var16 > 0.002F) {
                  this.IiIIlliIIl(this.IilliliilIIi(), brm, var7, var5, (int)var14, var16, sec);
               }

               if (sec.liIiIiiiiiiIiIiiii.illIlIilIl()) {
                  this.IIillIiliIil(
                     this.lIiiIiIlilli(), brm, var7, var5, (int)var14, sec.liIiIiiiiiiIiIiiii.IlIlllIlilIl(), sec.liIiIiiiiiiIiIiiii.lilIliilIl(), sec
                  );
               }
            }
         }

         var12 += 4294967296L;
      }
   }

   private static boolean IIlilIliiIli(List<class_10889> parts) {
      long var7 = -5151023006883962725L;
      long var9 = -7253636378965630632L;
      var7 ^= (0L ^ var7) & -1L << 32;

      while ((int)(var7 >>> 32) < parts.size()) {
         class_10889 var2 = (class_10889)parts.get((int)(var7 >>> 32));
         if (!var2.method_68509(null).isEmpty()) {
            return true;
         }

         class_2350[] var3 = iililiIIlIIiiliIIl;
         var7 ^= ((long)var3.length ^ var7) & -1L >>> 32;

         for (var9 ^= (0L ^ var9) & -1L << 32; (int)(var9 >>> 32) < (int)var7; var9 += 4294967296L) {
            class_2350 var6 = var3[(int)(var9 >>> 32)];
            if (!var2.method_68509(var6).isEmpty()) {
               return true;
            }
         }

         var7 += 4294967296L;
      }

      return false;
   }

   private void IIlllIlliIll(class_287 rgb, IlilIlIillilIlIi buf, int wy, int width, int sec, int wz, float wx) {
      long var18 = -6515995604834011164L;
      long var20 = -6178192508827097403L;
      float var8 = (float)(wy - buf.IIliIIIIIi);
      float var9 = (float)(width - buf.lIliIIIIIi);
      float var10 = (float)(sec - buf.iIliIIIIIi);
      float var11 = var8 + 1.0F;
      float var12 = var9 + 1.0F;
      float var13 = var10 + 1.0F;
      var18 ^= ((long)(wz >> 16 & 0xFF) << 32 ^ var18) & -1L << 32;
      var18 ^= ((long)(wz >> 8 & 0xFF) ^ var18) & -1L >>> 32;
      var20 ^= ((long)(wz & 0xFF) << 32 ^ var20) & -1L << 32;
      var20 ^= ((long)Math.round(255.0F) ^ var20) & -1L >>> 32;
      lIlIliIlIl(rgb, var8, var9, var10, var11, var9, var10, (int)(var18 >>> 32), (int)var18, (int)(var20 >>> 32), (int)var20, wx);
      lIlIliIlIl(rgb, var8, var12, var10, var11, var12, var10, (int)(var18 >>> 32), (int)var18, (int)(var20 >>> 32), (int)var20, wx);
      lIlIliIlIl(rgb, var8, var9, var13, var11, var9, var13, (int)(var18 >>> 32), (int)var18, (int)(var20 >>> 32), (int)var20, wx);
      lIlIliIlIl(rgb, var8, var12, var13, var11, var12, var13, (int)(var18 >>> 32), (int)var18, (int)(var20 >>> 32), (int)var20, wx);
      lIlIliIlIl(rgb, var8, var9, var10, var8, var12, var10, (int)(var18 >>> 32), (int)var18, (int)(var20 >>> 32), (int)var20, wx);
      lIlIliIlIl(rgb, var11, var9, var10, var11, var12, var10, (int)(var18 >>> 32), (int)var18, (int)(var20 >>> 32), (int)var20, wx);
      lIlIliIlIl(rgb, var8, var9, var13, var8, var12, var13, (int)(var18 >>> 32), (int)var18, (int)(var20 >>> 32), (int)var20, wx);
      lIlIliIlIl(rgb, var11, var9, var13, var11, var12, var13, (int)(var18 >>> 32), (int)var18, (int)(var20 >>> 32), (int)var20, wx);
      lIlIliIlIl(rgb, var8, var9, var10, var8, var9, var13, (int)(var18 >>> 32), (int)var18, (int)(var20 >>> 32), (int)var20, wx);
      lIlIliIlIl(rgb, var11, var9, var10, var11, var9, var13, (int)(var18 >>> 32), (int)var18, (int)(var20 >>> 32), (int)var20, wx);
      lIlIliIlIl(rgb, var8, var12, var10, var8, var12, var13, (int)(var18 >>> 32), (int)var18, (int)(var20 >>> 32), (int)var20, wx);
      lIlIliIlIl(rgb, var11, var12, var10, var11, var12, var13, (int)(var18 >>> 32), (int)var18, (int)(var20 >>> 32), (int)var20, wx);
   }

   private class_287 IilliliilIIi() {
      if (this.lliIiiIIliliIiiIIl == null) {
         this.IIIIiiIIllIIIiiIIl.method_60811();
         this.lliIiiIIliliIiiIIl = new class_287(this.IIIIiiIIllIIIiiIIl, class_5596.field_27382, class_290.field_1576);
      }

      return this.lliIiiIIliliIiiIIl;
   }

   private void IiIIlliIIl(class_287 cls, IlilIlIillilIlIi alpha, class_2338 ctx, IIlIlIllIlIlIl rgb, int sec, float buf, IllIIlilllIIli pos) {
      long var23 = -2591665371644471988L;
      long var25 = 3247805131444979064L;
      long var27 = -5861042308455848366L;
      long var29 = -1063627525250906669L;
      float var8 = (float)(ctx.method_10263() - alpha.IIliIIIIIi);
      float var9 = (float)(ctx.method_10264() - alpha.lIliIIIIIi);
      float var10 = (float)(ctx.method_10260() - alpha.iIliIIIIIi);
      float var11 = var8 + 1.0F;
      float var12 = var9 + 1.0F;
      float var13 = var10 + 1.0F;
      var23 ^= ((long)(sec >> 16 & 0xFF) << 32 ^ var23) & -1L << 32;
      var23 ^= ((long)(sec >> 8 & 0xFF) ^ var23) & -1L >>> 32;
      var25 ^= ((long)(sec & 0xFF) << 32 ^ var25) & -1L << 32;
      var25 ^= ((long)Math.round(Math.min(1.0F, Math.max(0.0F, buf)) * 255.0F) ^ var25) & -1L >>> 32;
      if ((int)var25 > 0) {
         class_2350[] var18 = iililiIIlIIiiliIIl;
         var27 ^= ((long)var18.length << 32 ^ var27) & -1L << 32;

         for (long var36 = var27 ^ (0L ^ var27) & -1L >>> 32; (int)var36 < (int)(var36 >>> 32); var36 ^= (var36 ^ var36 + (long)1) & -1L >>> 32) {
            class_2350 var21 = var18[(int)var36];
            this.iiIIiiIIlIIlIiiIIl
               .method_10103(ctx.method_10263() + var21.method_10148(), ctx.method_10264() + var21.method_10164(), ctx.method_10260() + var21.method_10165());
            var29 ^= ((long)pos.IlIiIiiiillIiIiiii.getOrDefault(this.iiIIiiIIlIIlIiiIIl.method_10063(), (byte)-1) << 32 ^ var29) & -1L << 32;
            if ((int)(var29 >>> 32) < 0 || IililiIIllililiIIl[(int)(var29 >>> 32)] != rgb) {
               switch (var21) {
                  case field_11033:
                     iiIIlIIlIl(
                        cls,
                        var8,
                        var9,
                        var10,
                        var11,
                        var9,
                        var10,
                        var11,
                        var9,
                        var13,
                        var8,
                        var9,
                        var13,
                        (int)(var23 >>> 32),
                        (int)var23,
                        (int)(var25 >>> 32),
                        (int)var25
                     );
                     break;
                  case field_11036:
                     iiIIlIIlIl(
                        cls,
                        var8,
                        var12,
                        var13,
                        var11,
                        var12,
                        var13,
                        var11,
                        var12,
                        var10,
                        var8,
                        var12,
                        var10,
                        (int)(var23 >>> 32),
                        (int)var23,
                        (int)(var25 >>> 32),
                        (int)var25
                     );
                     break;
                  case field_11043:
                     iiIIlIIlIl(
                        cls,
                        var11,
                        var9,
                        var10,
                        var8,
                        var9,
                        var10,
                        var8,
                        var12,
                        var10,
                        var11,
                        var12,
                        var10,
                        (int)(var23 >>> 32),
                        (int)var23,
                        (int)(var25 >>> 32),
                        (int)var25
                     );
                     break;
                  case field_11035:
                     iiIIlIIlIl(
                        cls,
                        var8,
                        var9,
                        var13,
                        var11,
                        var9,
                        var13,
                        var11,
                        var12,
                        var13,
                        var8,
                        var12,
                        var13,
                        (int)(var23 >>> 32),
                        (int)var23,
                        (int)(var25 >>> 32),
                        (int)var25
                     );
                     break;
                  case field_11039:
                     iiIIlIIlIl(
                        cls,
                        var8,
                        var9,
                        var10,
                        var8,
                        var9,
                        var13,
                        var8,
                        var12,
                        var13,
                        var8,
                        var12,
                        var10,
                        (int)(var23 >>> 32),
                        (int)var23,
                        (int)(var25 >>> 32),
                        (int)var25
                     );
                     break;
                  case field_11034:
                     iiIIlIIlIl(
                        cls,
                        var11,
                        var9,
                        var13,
                        var11,
                        var9,
                        var10,
                        var11,
                        var12,
                        var10,
                        var11,
                        var12,
                        var13,
                        (int)(var23 >>> 32),
                        (int)var23,
                        (int)(var25 >>> 32),
                        (int)var25
                     );
               }
            }
         }
      }
   }

   private void IIillIiliIil(class_287 alpha, IlilIlIillilIlIi cls, class_2338 sec, IIlIlIllIlIlIl pos, int width, float buf, float ctx, IllIIlilllIIli rgb) {
      long var33 = -4704826600433212352L;
      long var23 = -8596276463493889266L;
      long var25 = 6126010980007564429L;
      long var27 = 4628616554189770792L;
      long var29 = 8187044782060838085L;
      long var31 = 3268075935815439213L;
      if (!(buf <= 0.002F)) {
         var23 ^= ((long)(sec.method_10263() - cls.IIliIIIIIi) << 32 ^ var23) & -1L << 32;
         var23 ^= ((long)(sec.method_10264() - cls.lIliIIIIIi) ^ var23) & -1L >>> 32;
         var25 ^= ((long)(sec.method_10260() - cls.iIliIIIIIi) << 32 ^ var25) & -1L << 32;
         var25 ^= ((long)(width >> 16 & 0xFF) ^ var25) & -1L >>> 32;
         var27 ^= ((long)(width >> 8 & 0xFF) << 32 ^ var27) & -1L << 32;
         var27 ^= ((long)(width & 0xFF) ^ var27) & -1L >>> 32;
         var29 ^= ((long)Math.round(Math.min(1.0F, Math.max(0.0F, buf)) * 255.0F) << 32 ^ var29) & -1L << 32;
         class_2350[] var16 = iililiIIlIIiiliIIl;
         var29 ^= ((long)var16.length ^ var29) & -1L >>> 32;
         var31 ^= (0L ^ var31) & -1L << 32;

         while ((int)(var31 >>> 32) < (int)var29) {
            class_2350 var19 = var16[(int)(var31 >>> 32)];
            this.iiIIiiIIlIIlIiiIIl
               .method_10103(sec.method_10263() + var19.method_10148(), sec.method_10264() + var19.method_10164(), sec.method_10260() + var19.method_10165());
            var31 ^= ((long)rgb.IlIiIiiiillIiIiiii.getOrDefault(this.iiIIiiIIlIIlIiiIIl.method_10063(), (byte)-1) ^ var31) & -1L >>> 32;
            if ((int)var31 < 0 || IililiIIllililiIIl[(int)var31] != pos) {
               Ililllililil(var19, (int)(var23 >>> 32), (int)var23, (int)(var25 >>> 32), this.IllIiiIIllllIiiIIl);
               var33 ^= (0L ^ var33) & -1L << 32;

               while ((int)(var33 >>> 32) < 4) {
                  var33 ^= ((long)((int)(var33 >>> 32) + 1 & 3) ^ var33) & -1L >>> 32;
                  if (this.lIlIiiIIliIlIiiIIl.add(IIIilIIiiIIi(this.IllIiiIIllllIiiIIl, (int)(var33 >>> 32), (int)var33, pos))) {
                     lIlIliIlIl(
                        alpha,
                        (float)this.IllIiiIIllllIiiIIl[(int)(var33 >>> 32) * 3],
                        (float)this.IllIiiIIllllIiiIIl[(int)(var33 >>> 32) * 3 + 1],
                        (float)this.IllIiiIIllllIiiIIl[(int)(var33 >>> 32) * 3 + 2],
                        (float)this.IllIiiIIllllIiiIIl[(int)var33 * 3],
                        (float)this.IllIiiIIllllIiiIIl[(int)var33 * 3 + 1],
                        (float)this.IllIiiIIllllIiiIIl[(int)var33 * 3 + 2],
                        (int)var25,
                        (int)(var27 >>> 32),
                        (int)var27,
                        (int)(var29 >>> 32),
                        ctx
                     );
                  }

                  var33 += 4294967296L;
               }
            }

            var31 += 4294967296L;
         }
      }
   }

   private static long IIIilIIiiIIi(int[] i, int c, int cls, IIlIlIllIlIlIl j) {
      long var4 = (long)i[c * 3] << 10 | (long)i[c * 3 + 1] << 5 | (long)i[c * 3 + 2];
      long var6 = (long)i[cls * 3] << 10 | (long)i[cls * 3 + 1] << 5 | (long)i[cls * 3 + 2];
      long var8 = var4 <= var6 ? var4 << 15 | var6 : var6 << 15 | var4;
      return var8 << 3 | (long)j.ordinal();
   }

   private static class_1058 IIIIllIIIl(class_2680 want, class_2745 type) {
      class_2248 var2 = want.method_26204();
      class_11960 var3;
      if (var2 instanceof class_2336) {
         var3 = class_11960.field_62697;
      } else if (var2 instanceof class_11582 var4) {
         var3 = switch (var4.method_72601()) {
            case field_28705 -> class_11960.field_62701;
            case field_28706 -> class_11960.field_62702;
            case field_28707 -> class_11960.field_62703;
            default -> class_11960.field_62700;
         };
      } else if (var2 instanceof class_2531) {
         var3 = class_11960.field_62699;
      } else {
         var3 = class_11960.field_62704;
      }

      if (var3 == class_11960.field_62697) {
         type = class_2745.field_12569;
      }

      return class_310.method_1551().method_72703().method_73030(class_4722.method_24062(var3, type));
   }

   private void llIIlilIIl(class_776 buf, class_287 ctx, class_2338 brm, class_2680 pos, IllIIlilllIIli want) {
      try {
         buf.method_3352(brm, want.ilIiIiiiiIiIiIiiii, ctx, pos, pos.method_26227());
      } catch (Throwable var7) {
      }
   }

   private class_287 lIiiIiIlilli() {
      if (this.IiiIiiIIlliiIiiIIl == null) {
         this.iIIIiiIIlIlIIiiIIl.method_60811();
         this.IiiIiiIIlliiIiiIIl = new class_287(this.iIIIiiIIlIlIIiiIIl, class_5596.field_27377, class_290.field_63455);
      }

      return this.IiiIiiIIlliiIiiIIl;
   }

   private boolean IiIiliIiiiIi(class_776 buf, class_287 sec, IlilIlIillilIlIi pos, class_2338 want, class_2680 brm, IllIIlilllIIli ctx) {
      long var11 = -341155468791312582L;

      List var7;
      try {
         this.IiIIiiIIlliIIiiIIl.method_43052(brm.method_26190(want));
         var7 = buf.method_3349(brm).method_68512(this.IiIIiiIIlliIIiiIIl);
      } catch (Throwable var20) {
         return false;
      }

      try {
         var11 ^= ((long)IIlilIliiIli(var7) << 32 ^ var11) & -1L << 32;
      } catch (Throwable var19) {
         var11 ^= (0L ^ var11) & -1L << 32;
      }

      if ((int)(var11 >>> 32) == 0) {
         return false;
      } else {
         this.llIIiiIIlilIIiiIIl.method_22903();

         try {
            this.llIIiiIIlilIIiiIIl
               .method_46416(
                  (float)(want.method_10263() - pos.IIliIIIIIi), (float)(want.method_10264() - pos.lIliIIIIIi), (float)(want.method_10260() - pos.iIliIIIIIi)
               );
            buf.method_3355(brm, want, ctx.ilIiIiiiiIiIiIiiii, this.llIIiiIIlilIIiiIIl, sec, true, var7);
         } catch (Throwable var17) {
         } finally {
            this.llIIiiIIlilIIiiIIl.method_22909();
         }

         return true;
      }
   }
}
