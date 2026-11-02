package gg.corz;

import java.util.Objects;
import java.util.Random;
import net.minecraft.class_332;

public final class iilIllIiIIiIllIi {
   private static long iIiIliIIIi;
   public static final int lIiiIiIIIi = 5;
   private static float iIIlliIIIi = 30.0F;
   public static final int IliiIiIIIi = 7;
   private static boolean ilIlliIIIi;
   private static final int iIilIiIIIi = 4;
   public static final int illiIiIIIi = 0;
   private static final float[] IiIlliIIIi = new float[24];
   private static int llllliIIIi;
   private static final float IlIiIiIIIi = 0.16F;
   private static final int[] IliIliIIIi = new int[5];
   private static final double liilIiIIIi = 0.6;
   private static final float IlIIliIIIi = 0.12F;
   private static final float lIliIiIIIi = 10.0F;
   private static final double IiilIiIIIi = 0.67;
   private static final float iIliIiIIIi = 44.0F;
   private static long liiIliIIIi;
   private static final float liiiIiIIIi = 0.9F;
   private static final float lliiIiIIIi = 0.95F;
   private static int lIllliIIIi;
   private static final float IiIIliIIIi = 12.0F;
   private static final float lIIiIiIIIi = 2.9F;
   private static String IIllliIIIi;
   public static final int iiliIiIIIi = 3;
   public static final int lillIiIIIi = 0;
   private static final int llilIiIIIi = 5;
   private static boolean iliIliIIIi;
   private static float IlIlliIIIi = 27.0F;
   private static final float iliiIiIIIi = 0.7F;
   private static final float iiIiIiIIIi = 0.12F;
   private static final float iIIiIiIIIi = 0.3F;
   private static final float IIliIiIIIi = 0.2F;
   private static final int lIilIiIIIi = 6;
   private static final float iiiiIiIIIi = 40.0F;
   private static final float lIlIliIIIi = 0.42F;
   private static final float iilIliIIIi = 8.0F;
   private static final float IIlIliIIIi = 0.004F;
   private static int IlllliIIIi;
   public static final int iillIiIIIi = 1;
   private static final float IIIiIiIIIi = 0.52F;
   private static float lIiIliIIIi = -1.0F;
   private static final liIiliiliiIiliil[] IIiIliIIIi = new liIiliiliiIiliil[]{
      new liIiliiliiIiliil(3, 2, 1.0F, 1.0F), new liIiliiliiIiliil(1, 4, 0.6F, 1.3F), new liIiliiliiIiliil(2, 2, 0.9F, 1.0F)
   };
   private static final float IiiiIiIIIi = 0.76F;
   private static boolean llIlliIIIi;
   private static final float llliIiIIIi = 2.2F;
   public static final int IIiiIiIIIi = 4;
   private static final float iIIIliIIIi = 0.86F;
   private static final long IilIliIIIi = 650000000L;
   private static final float[] iIlIliIIIi = new float[]{0.0F, 1.0F, 1.0F, 0.0F, 0.5F, 1.0F, 0.5F, 0.0F};
   private static final int IlilIiIIIi = 4;
   private static final float[] lliIliIIIi = new float[15];
   public static final int IiliIiIIIi = 1;
   private static long IiiIliIIIi;
   private static final float IlliIiIIIi = 0.64F;
   public static final int iIiiIiIIIi = 6;
   public static final int liliIiIIIi = 2;
   private static final float iiIIliIIIi = -30.0F;
   private static final float llIiIiIIIi = 0.64F;
   private static boolean iiIlliIIIi;
   private static int iIllliIIIi;
   private static final float lIIIliIIIi = 0.4F;
   public static final int IIilIiIIIi = 2;
   private static final double iiilIiIIIi = 1.34;
   private static double IIIlliIIIi;
   private static final long lllIliIIIi = 250000000L;
   private static double iiiIliIIIi;
   private static final float llIIliIIIi = 0.16F;
   private static final float liIiIiIIIi = 0.28F;
   private static final boolean ililIiIIIi = true;
   private static final float liIIliIIIi = 8.0F;
   private static final float lilIliIIIi = 10.0F;
   private static final float IiIiIiIIIi = 0.58F;
   private static final float[] IllIliIIIi = new float[]{0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.5F, 1.0F, 0.5F};
   private static final float ilIiIiIIIi = 0.06F;
   private static float lIIlliIIIi = 1.0F;
   private static final float[] liIlliIIIi = new float[18];
   private static final float ilIIliIIIi = 0.07F;
   private static final float IIIIliIIIi = 130.0F;
   private static final long illIliIIIi = 1000000L;

   public static void IiIlliIliiIl(int y, float seed, float strength, float x, float h, float radius, float w, float unit) {
      long var13 = -2346326124250863065L;
      long var15 = -8821120140533476977L;
      if (!llIlliIIIi && !(x <= 1.0F) && !(h <= 1.0F)) {
         float var8 = Math.min(0.42F, iIlIlllllill() * Ililllililil() * 0.95F)
            * (IilIIIIililIIIIi.liiiIIllIl() ? 0.7F : 1.0F)
            * unit
            * IliiIilliiIi.ilIlllIIlIiIlllIIl;
         if (!(var8 < 0.004F)) {
            try {
               if (!ilIlliIIIi && !lIiiIiIlilli()) {
                  return;
               }

               IlIillIiilIi();
               var13 ^= ((long)(y & 7) << 32 ^ var13) & -1L << 32;
               var13 ^= ((long)Illlllllilll(y) ^ var13) & -1L >>> 32;
               float var11 = Math.max(40.0F * w, Math.min(130.0F * w, 0.9F * Math.max(x, h))) * Math.max(0.6F, Math.min(1.5F, Iiilliiliiil()));
               IIlllIlliIll(0, (int)(var13 >>> 32), (int)var13, seed, strength, x, h, var11, 1.0F, 0);
               var15 ^= (4294967296L ^ var15) & -1L << 32;
               if ((int)(var13 >>> 32) < 4) {
                  IIlllIlliIll(1, (int)(var13 >>> 32) ^ 2, Illlllllilll((int)var13), seed, strength, x, h, var11 * 0.86F, 0.76F, 4);
                  var15 ^= (8589934592L ^ var15) & -1L << 32;
               }

               IliiIilliiIi.IIlilIliiIli(
                  IIIiiIillIIiiIil.liiiIIllIl().method_23760().method_23761(),
                  seed,
                  strength,
                  x,
                  h,
                  radius,
                  IIIiiIillIIiiIil.Illlllllilll(),
                  var8,
                  IiIlliIIIi,
                  liIlliIIIi,
                  (int)(var15 >>> 32)
               );
            } catch (Throwable var17) {
               Iilllilliill(String.valueOf(var17));
            }
         }
      }
   }

   private static void Iliilliiilii(liIiliiliiIiliil bloom, float y, float h, float x, float fd, float w) {
      long var19 = 4595032188442669401L;
      long var21 = -8784038336703643257L;
      float var6 = Math.min(x, fd) * 0.58F * bloom.IIIiIIIiil * Iiilliiliiil() * (0.88F + 0.12F * w);
      float var7 = x / (float)bloom.ililIIIiil;
      float var8 = fd / (float)bloom.IiilIIIiil;
      float var9 = 0.88F;
      double var10 = iiiIliIIIi;
      var19 ^= (0L ^ var19) & -1L << 32;

      while ((int)(var19 >>> 32) < bloom.liilIIIiil) {
         var19 ^= ((long)((int)(var19 >>> 32) * 5) ^ var19) & -1L >>> 32;
         float var14 = (float)(
            0.62 * Math.sin(var10 * (double)bloom.ilIiIIIiil[(int)var19] + (double)bloom.IiIiIIIiil[(int)var19])
               + 0.38 * Math.sin(var10 * (double)bloom.ilIiIIIiil[(int)var19 + 1] * 1.618 + (double)bloom.IiIiIIIiil[(int)var19 + 1])
         );
         float var15 = (float)(
            0.62 * Math.cos(var10 * (double)bloom.ilIiIIIiil[(int)var19 + 2] + (double)bloom.IiIiIIIiil[(int)var19 + 2])
               + 0.38 * Math.sin(var10 * (double)bloom.ilIiIIIiil[(int)var19 + 3] * 1.618 + (double)bloom.IiIiIIIiil[(int)var19 + 3])
         );
         float var16 = 1.0F + 0.12F * (float)Math.sin(var10 * (double)bloom.ilIiIIIiil[(int)var19 + 4] + (double)bloom.IiIiIIIiil[(int)var19 + 4]);
         bloom.iiIiIIIiil[(int)(var19 >>> 32) * 4] = y + x * (0.06F + var9 * bloom.lIIiIIIiil[(int)(var19 >>> 32)]) + var14 * var7 * 0.28F;
         bloom.iiIiIIIiil[(int)(var19 >>> 32) * 4 + 1] = h + fd * (0.06F + var9 * bloom.iIIiIIIiil[(int)(var19 >>> 32)]) + var15 * var8 * 0.28F;
         bloom.iiIiIIIiil[(int)(var19 >>> 32) * 4 + 2] = var6 * bloom.IlIiIIIiil[(int)(var19 >>> 32)];
         var21 ^= ((long)(bloom.liIiIIIiil[(int)(var19 >>> 32)] * 3) << 32 ^ var21) & -1L << 32;
         float var18 = 0.2126F * lliIliIIIi[(int)(var21 >>> 32)]
            + 0.7152F * lliIliIIIi[(int)(var21 >>> 32) + 1]
            + 0.0722F * lliIliIIIi[(int)(var21 >>> 32) + 2];
         bloom.iiIiIIIiil[(int)(var19 >>> 32) * 4 + 3] = Math.min(1.0F, bloom.llIiIIIiil[(int)(var19 >>> 32)] * var16)
            * Math.min(1.0F, 0.3F / Math.max(var18, 0.001F));
         bloom.IIliIIIiil[(int)(var19 >>> 32) * 3] = lliIliIIIi[(int)(var21 >>> 32)];
         bloom.IIliIIIiil[(int)(var19 >>> 32) * 3 + 1] = lliIliIIIi[(int)(var21 >>> 32) + 1];
         bloom.IIliIIIiil[(int)(var19 >>> 32) * 3 + 2] = lliIliIIIi[(int)(var21 >>> 32) + 2];
         var19 += 4294967296L;
      }
   }

   public static int IlIlllIlilIl(int salt, int anchor) {
      return anchor << 3 | salt & 7;
   }

   public static void IilliliilIIi() {
      IIillIiliIil(new Random());
      if (!llIlliIIIi) {
         lIiiIiIlilli();
      }

      liiIliIIIi = System.nanoTime();
   }

   private static void Iilllilliill(String why) {
      llIlliIIIi = true;
   }

   private static float IIIilIIiiIIi() {
      if (liiIliIIIi == 0L) {
         return 1.0F;
      } else {
         float var0 = (float)(System.nanoTime() - liiIliIIIi) / 6.5E8F;
         if (var0 >= 1.0F) {
            return 1.0F;
         } else {
            float var1 = 1.0F - Math.max(0.0F, var0);
            return 1.0F - var1 * var1 * var1;
         }
      }
   }

   private static float Ililllililil() {
      Iiliililliliilil var0 = IliIlllilIi();
      double var1 = var0 == null ? 0.402 : var0.iIilllllil.Iilllilliill() * var0.Ililllllil.Iilllilliill();
      float var3 = (float)Math.max(0.0, Math.min(1.0, var1));
      return 0.52F * (1.0F - (float)Math.exp((double)(-2.9F * var3)));
   }

   private static void IlIillIiilIi() {
      long var10 = 8407857349800710290L;
      long var12 = -769565840015786129L;
      long var0 = System.nanoTime();
      long var2 = var0 - IiiIliIIIi;
      if (!iliIliIIIi || var2 < 0L || var2 >= 1000000L) {
         var10 ^= ((long)(iliIliIIIi && var2 >= 0L && var2 <= 250000000L ? 0 : 1) << 32 ^ var10) & -1L << 32;
         IiiIliIIIi = var0;
         float var5 = (int)(var10 >>> 32) != 0 ? 0.0F : (float)var2 / 1.0E9F;
         IIIlliIIIi += (double)var5;
         Iiliililliliilil var6 = IliIlllilIi();
         if (var6 != null && var6.iiilllllil.Iilllilliill()) {
            iiiIliIIIi = iiiIliIIIi + (double)var5 * var6.IIIillllil.Iilllilliill();
         }

         Illillliilli();
         float var7 = (int)(var10 >>> 32) != 0 ? 1.0F : 1.0F - (float)Math.exp((double)(-8.0F * var5));

         for (long var15 = var10 ^ (0L ^ var10) & -1L >>> 32; (int)var15 <= 4; var15 ^= (var15 ^ var15 + (long)1) & -1L >>> 32) {
            var12 ^= ((long)IliIliIIIi[(int)var15] << 32 ^ var12) & -1L << 32;
            IiIiliIiiiIi((int)var15 * 3, IIlilIliiIli((int)(var12 >>> 32) >> 16 & 0xFF), var7);
            IiIiliIiiiIi((int)var15 * 3 + 1, IIlilIliiIli((int)(var12 >>> 32) >> 8 & 0xFF), var7);
            IiIiliIiiiIi((int)var15 * 3 + 2, IIlilIliiIli((int)(var12 >>> 32) & 0xFF), var7);
         }

         iliIliIIIi = true;
      }
   }

   private static int IIiilIiiiIii(int color, int accent) {
      color |= -16777216;
      float var2 = Math.max(iIillliIlillli.IiIiliIiiiIi(color), Math.max(iIillliIlillli.IIlilIliiIli(color), iIillliIlillli.Illillliilli(color)));
      float var3 = iIillliIlillli.liiiIIllIl((0.5F - var2) / 0.5F);
      return var3 <= 0.0F ? color : iIillliIlillli.IIIllIIliIIl(color, 0xFF000000 | accent, 0.85F * var3);
   }

   public static int iliIiiliiiii(int argb) {
      long var3 = 1112322368191522348L;
      if (IilIIIIililIIIIi.liiiIIllIl()) {
         return argb;
      } else {
         float var1 = 0.16F * iIlIlllllill() * Math.min(1.0F, Ililllililil() * 8.0F);
         if (var1 <= 0.002F) {
            return argb;
         } else {
            var3 ^= ((long)Math.round((float)(argb >>> 24 & 0xFF) * (1.0F - var1)) << 32 ^ var3) & -1L << 32;
            return (int)(var3 >>> 32) << 24 | argb & 16777215;
         }
      }
   }

   private static Iiliililliliilil IliIlllilIi() {
      return Iiliililliliilil.llllllllil;
   }

   private static void Illillliilli() {
      long var8 = -8470099841500994430L;
      long var10 = 1498283546211861985L;
      long var12 = 9061969262785986727L;
      Iiliililliliilil var0 = IliIlllilIi();
      String var1 = var0 == null ? Iiiiliiiiiii<"Iiiiliiiiiii","kqDzv+kcFFq6zc/zczO1C3odaT61WlbodhmUUYki2s2n">() : var0.ililllllil.Iilllilliill();
      var8 ^= ((long)(var0 == null ? 0 : var0.Iiilllllil.Iilllilliill()) << 32 ^ var8) & -1L << 32;
      var8 ^= ((long)(var0 == null ? 0 : var0.liilllllil.Iilllilliill()) ^ var8) & -1L >>> 32;
      var10 ^= ((long)(var0 == null ? 0 : var0.Iillllllil.Iilllilliill()) << 32 ^ var10) & -1L << 32;
      var10 ^= ((long)IlIIilIlllIIilIl.lliiIlliIl ^ var10) & -1L >>> 32;
      if (!iiIlliIIIi
         || !Objects.equals(var1, IIllliIIIi)
         || (int)(var8 >>> 32) != lIllliIIIi
         || (int)var8 != iIllliIIIi
         || (int)(var10 >>> 32) != IlllliIIIi
         || (int)var10 != llllliIIIi) {
         iiIlliIIIi = true;
         IIllliIIIi = var1;
         lIllliIIIi = (int)(var8 >>> 32);
         iIllliIIIi = (int)var8;
         IlllliIIIi = (int)(var10 >>> 32);
         llllliIIIi = (int)var10;
         if (Iiiiliiiiiii<"Iiiiliiiiiii","e97Xzi9nLvKS1T30yg1UUsadi2fEHoOO+loNHz6b/bO+nktEng==">().equals(var1)) {
            var12 ^= ((long)(0xFF000000 | (int)(var8 >>> 32)) << 32 ^ var12) & -1L << 32;
            var12 ^= ((long)(0xFF000000 | (int)var8) ^ var12) & -1L >>> 32;
            IliIliIIIi[0] = (int)(var12 >>> 32);
            IliIliIIIi[1] = (int)var12;
            IliIliIIIi[2] = iIillliIlillli.IIIllIIliIIl((int)(var12 >>> 32), (int)var12, 0.34F);
            IliIliIIIi[3] = iIillliIlillli.IIIllIIliIIl((int)(var12 >>> 32), (int)var12, 0.67F);
            IliIliIIIi[4] = (int)var12;
         } else if (Iiiiliiiiiii<"Iiiiliiiiiii","jairZesKM1/vwiF9l7ya6G5xc1Q9xS6nK6w8Eedphd8rKA==">().equals(var1)) {
            Iilililiiili((int)(var8 >>> 32));
         } else {
            int[] var6 = liIliiiliiIliiil.lIiiIiIlilli();
            if (var6 != null && var6.length >= 4) {
               for (long var18 = var12 ^ (0L ^ var12) & -1L >>> 32; (int)var18 < 4; var18 ^= (var18 ^ var18 + (long)1) & -1L >>> 32) {
                  IliIliIIIi[(int)var18] = IIiilIiiiIii(var6[(int)var18], (int)var10);
               }

               IliIliIIIi[4] = IliIliIIIi[1];
            } else {
               Iilililiiili((int)var10);
            }
         }
      }
   }

   private static float Iiilliiliiil() {
      Iiliililliliilil var0 = IliIlllilIi();
      return (float)((var0 == null ? 1.34 : var0.llilllllil.Iilllilliill()) / 1.34);
   }

   static {
      IIillIiliIil(new Random());
   }

   private static float IIlilIliiIli(int channel) {
      return (float)Math.pow((double)channel / 255.0, 2.2F);
   }

   private iilIllIiIIiIllIi() {
   }

   public static void IIIllIIliIIl(class_332 x, int radius, float w, float h, float y, float ctx, float field, float strength) {
      if (!llIlliIIIi && radius >= 0 && radius < IIiIliIIIi.length && !(y <= 1.0F) && !(ctx <= 1.0F)) {
         float var8 = iIlIlllllill() * Ililllililil() * strength * IliiIilliiIi.ilIlllIIlIiIlllIIl;
         if (!(var8 < 0.003F)) {
            try {
               if (!ilIlliIIIi && !lIiiIiIlilli()) {
                  return;
               }

               IlIillIiilIi();
               liIiliiliiIiliil var9 = IIiIliIIIi[radius];
               float var10 = IIIilIIiiIIi();
               Iliilliiilii(var9, w, h, y, ctx, var10);
               float var11 = Math.max(10.0F, Math.min(44.0F, Math.min(y, ctx) * 0.2F));
               IliiIilliiIi.IIlilIliiIli(
                  IIIiiIillIIiiIil.liiiIIllIl().method_23760().method_23761(),
                  w,
                  h,
                  y,
                  ctx,
                  field,
                  var11,
                  var8 * var9.iiilIIIiil * (0.35F + 0.65F * var10),
                  var9.iiIiIIIiil,
                  var9.IIliIIIiil,
                  var9.liilIIIiil
               );
            } catch (Throwable var12) {
               Iilllilliill(String.valueOf(var12));
            }
         }
      }
   }

   public static float iIlIlllllill() {
      if (llIlliIIIi) {
         return 0.0F;
      } else {
         float var0 = liiiIIllIl() ? 1.0F : 0.0F;
         long var1 = System.nanoTime();
         long var3 = var1 - iIiIliIIIi;
         iIiIliIIIi = var1;
         if (!(lIiIliIIIi < 0.0F) && var3 <= 250000000L) {
            lIiIliIIIi = lIiIliIIIi + (var0 - lIiIliIIIi) * (1.0F - (float)Math.exp((double)(-10.0F * ((float)var3 / 1.0E9F))));
            if (Math.abs(var0 - lIiIliIIIi) < 0.002F) {
               lIiIliIIIi = var0;
            }
         } else {
            lIiIliIIIi = var0;
         }

         return lIiIliIIIi;
      }
   }

   public static boolean liiiIIllIl() {
      Iiliililliliilil var0 = IliIlllilIi();
      return var0 == null ? true : var0.lIilllllil.Iilllilliill();
   }

   private static void Iilililiiili(int base) {
      base |= -16777216;
      float var1 = iIillliIlillli.IlIlllIlilIl(base);
      if (var1 > 0.02F && var1 < 0.64F) {
         base = iIillliIlillli.IiIlliIliiIl(base, 0.0F, 0.64F / var1, 1.0F);
      }

      IliIliIIIi[0] = base;
      IliIliIIIi[1] = iIillliIlillli.IiIlliIliiIl(base, lIIlliIIIi * iIIlliIIIi, 1.0F, 1.0F);
      IliIliIIIi[2] = iIillliIlillli.IiIlliIliiIl(base, -lIIlliIIIi * IlIlliIIIi * 0.4F, 1.14F, 0.82F);
      IliIliIIIi[3] = iIillliIlillli.IiIlliIliiIl(base, -lIIlliIIIi * IlIlliIIIi, 0.82F, 1.0F);
      IliIliIIIi[4] = iIillliIlillli.IiIlliIliiIl(base, -30.0F, 1.0F, 1.0F);
   }

   private static void IiIiliIiiiIi(int k, float index, float goal) {
      lliIliIIIi[k] = lliIliIIIi[k] + (index - lliIliIIIi[k]) * goal;
   }

   private static void IIillIiliIil(Random rng) {
      long var5 = -6381283247525313396L;
      lIIlliIIIi = rng.nextBoolean() ? 1.0F : -1.0F;
      iIIlliIIIi = 25.0F + 10.0F * rng.nextFloat();
      IlIlliIIIi = 22.0F + 10.0F * rng.nextFloat();
      iiIlliIIIi = false;
      liIiliiliiIiliil[] var1 = IIiIliIIIi;
      var5 ^= ((long)var1.length << 32 ^ var5) & -1L << 32;

      for (long var8 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
         liIiliiliiIiliil var4 = var1[(int)var8];
         var4.IliIlllilIi(rng);
      }
   }

   private static void IIlllIlliIll(int weight, int i, int slot, float anchor, float hash, float x, float h, float y, float reach, int w) {
      long var23 = -2387367809277938991L;
      float var10 = iIlIliIIIi[i];
      float var11 = IllIliIIIi[i];
      float var12 = (var10 - 0.5F) * 2.0F;
      float var13 = (var11 - 0.5F) * 2.0F;
      float var14 = y * 0.12F;
      float var15 = (float)(slot & 0xFF) / 255.0F;
      float var16 = (float)(slot >>> 8 & 0xFF) / 255.0F;
      float var17 = 12.0F + 8.0F * ((float)(slot >>> 16 & 0xFF) / 255.0F);
      float var18 = 12.0F + 8.0F * ((float)(slot >>> 24) / 255.0F);
      float var19 = (float)Math.sin(IIIlliIIIi * ((Math.PI * 2) / (double)var17) + (double)(var15 * (float) (Math.PI * 2)));
      float var20 = (float)Math.cos(IIIlliIIIi * ((Math.PI * 2) / (double)var18) + (double)(var16 * (float) (Math.PI * 2)));
      IiIlliIIIi[weight * 4] = anchor + x * var10 + var12 * var14 + (var12 == 0.0F ? var15 - 0.5F : -var12 * var15) * 0.16F * x + var19 * y * 0.07F;
      IiIlliIIIi[weight * 4 + 1] = hash + h * var11 + var13 * var14 + (var13 == 0.0F ? (var16 - 0.5F) * 0.16F * h : 0.0F) + var20 * y * 0.07F;
      IiIlliIIIi[weight * 4 + 2] = y * 0.4F;
      var23 ^= ((long)(w * 3) << 32 ^ var23) & -1L << 32;
      float var22 = 0.2126F * lliIliIIIi[(int)(var23 >>> 32)] + 0.7152F * lliIliIIIi[(int)(var23 >>> 32) + 1] + 0.0722F * lliIliIIIi[(int)(var23 >>> 32) + 2];
      IiIlliIIIi[weight * 4 + 3] = reach * Math.min(1.0F, 0.3F / Math.max(var22, 0.001F));
      liIlliIIIi[weight * 3] = lliIliIIIi[(int)(var23 >>> 32)];
      liIlliIIIi[weight * 3 + 1] = lliIliIIIi[(int)(var23 >>> 32) + 1];
      liIlliIIIi[weight * 3 + 2] = lliIliIIIi[(int)(var23 >>> 32) + 2];
   }

   private static int Illlllllilll(int v) {
      v ^= v >>> 16;
      v *= 2146121005;
      v ^= v >>> 15;
      v *= -2073254261;
      return v ^ v >>> 16;
   }

   private static boolean lIiiIiIlilli() {
      ilIlliIIIi = true;

      try {
         if (IliiIilliiIi.IiIiliIiiiIi()) {
            return true;
         }

         Iilllilliill(Iiiiliiiiiii<"Iiiiliiiiiii","QlauovbGWj+oDH86ShVqwqn8K/kXCvRCUnWFDf/kTYHsBRA6YmkVLdwaMkIUmWOgSb4=">());
      } catch (Throwable var1) {
         Iilllilliill(String.valueOf(var1));
      }

      return false;
   }
}
