package gg.corz;

import net.minecraft.class_332;
import net.minecraft.class_4588;

public final class IIiIllIllIiIllIl {
   public static final float IiIIIiIiIl = 1.0F;

   private static int IIIilIIiiIIi(double enabled) {
      return enabled > 0.004 ? IilIIIIililIIIIi.Illlllllilll(234881023, IilIIIIililIIIIi.IIlllIlliIll(0.42), enabled) : 234881023;
   }

   public static void IIillIiliIil(class_332 w, int y, int ctx, int x, int h) {
      long var17 = 5792201322392606311L;
      long var19 = 8189267391384484640L;
      long var21 = 3244748002551980234L;
      long var23 = 534665307687816230L;
      long var25 = 1933882169434386744L;
      if (x > 0) {
         var17 ^= ((long)(h / 2) << 32 ^ var17) & -1L << 32;
         var17 ^= ((long)IlIIilIlllIIilIl.lliiIlliIl ^ var17) & -1L >>> 32;
         var19 ^= ((long)IilIIIIililIIIIi.Illlllllilll(-14673876, (int)var17, 0.4) << 32 ^ var19) & -1L << 32;
         var19 ^= ((long)IilIIIIililIIIIi.Illlllllilll(-14410956, (int)var17, 0.64) ^ var19) & -1L >>> 32;
         IIIiiIillIIiiIil.iliIiiliiiii(w, y, ctx, x, h, (int)(var17 >>> 32), IilIIIIililIIIIi.IIlllIlliIll(0.34), 3.5F, 0.34F);
         IIIiiIillIIiiIil.lIiiIiIlilli(w, y, ctx, x, h, (int)(var17 >>> 32), (int)(var19 >>> 32));
         var21 ^= ((long)(y + (int)(var17 >>> 32)) << 32 ^ var21) & -1L << 32;
         var21 ^= ((long)(y + x) ^ var21) & -1L >>> 32;
         if ((int)var21 - (int)(var21 >>> 32) >= 1) {
            class_4588 var11 = llIllIililIllIil.IilliliilIIi();
            var23 ^= ((long)Math.max(1, ((int)var21 - (int)(var21 >>> 32)) / 2) << 32 ^ var23) & -1L << 32;

            for (long var34 = var23 ^ (0L ^ var23) & -1L >>> 32; (int)var34 < (int)(var34 >>> 32); var34 ^= (var34 ^ var34 + (long)1) & -1L >>> 32) {
               var25 ^= ((long)((int)(var21 >>> 32) + (int)var34 * ((int)var21 - (int)(var21 >>> 32)) / (int)(var34 >>> 32)) << 32 ^ var25) & -1L << 32;
               var25 ^= ((long)((int)(var21 >>> 32) + ((int)var34 + 1) * ((int)var21 - (int)(var21 >>> 32)) / (int)(var34 >>> 32)) ^ var25) & -1L >>> 32;
               if ((int)var25 <= (int)(var25 >>> 32)) {
                  var25 ^= ((long)((int)(var25 >>> 32) + 1) ^ var25) & -1L >>> 32;
               }

               float var16 = ((float)((int)(var25 >>> 32) + (int)var25) * 0.5F - (float)y) / (float)x;
               llIllIililIllIil.iliIiiliiiii(
                  var11,
                  (float)((int)(var25 >>> 32)),
                  (float)ctx,
                  (float)((int)var25),
                  (float)(ctx + h),
                  IliiIilliiIi.IlIlllIlilIl(iIillliIlillli.iliIiiliiiii((int)(var19 >>> 32), (int)var19, var16))
               );
            }

            llIllIililIllIil.IIillIiliIil();
         }
      }
   }

   public static void lIiiIiIlilli(class_332 y, float x, float r, float edge, float w, float h, int fill, int ctx) {
      IIIiiIillIIiiIil.Iilllilliill(y, x, r, edge, w, h, iilIllIiIIiIllIi.iliIiiliiiii(fill), ctx);
   }

   public static void iliIiiliiiii(class_332 w, float x, float h, float r, float ctx, float y) {
      long var7 = 267744317589784717L;
      if (!IilIIIIililIIIIi.liiiIIllIl()) {
         IIIiiIillIIiiIil.IIlllIlliIll(w, x, h, r, ctx, y, IilIIIIililIIIIi.IIlllIlliIll(0.13), 4.0F, 0.85F);
      }

      var7 ^= ((long)IilIIIIililIIIIi.Illlllllilll(IilIIIIililIIIIi.IiIlliIliiIl(), IlIIilIlllIIilIl.lliiIlliIl, 0.08) << 32 ^ var7) & -1L << 32;
      lIiiIiIlilli(w, x, h, r, ctx, y, (int)(var7 >>> 32), IilIIIIililIIIIi.IIlllIlliIll(0.34));
   }

   public static void IIIllIIliIIl(class_332 y, float h, float alpha, float ctx, double x) {
      if (!(ctx <= 0.0F) && !(x <= 0.004)) {
         IIIiiIillIIiiIil.IlIlllIlilIl(y, h, alpha, 1.0F, ctx, 0.5F, IilIIIIililIIIIi.IIlllIlliIll(x));
      }
   }

   public static void IliIlllilIi(class_332 y, int x, int r, int ctx, int h, int fill, int w) {
      IIIiiIillIIiiIil.lIiiIiIlilli(y, x, r, ctx, h, fill, w);
   }

   public static void Iilllilliill(class_332 w, int ctx, int y, int h, int x) {
      long var6 = -232327632597079525L;
      var6 ^= ((long)IilIIIIililIIIIi.Illlllllilll(-13948620, IlIIilIlllIIilIl.lliiIlliIl, 0.04) << 32 ^ var6) & -1L << 32;
      IIIiiIillIIiiIil.lIiiIiIlilli(w, ctx, y, h, x, x / 2, (int)(var6 >>> 32));
   }

   public static void IlIlllIlilIl(class_332 x, float press, float r, float hover, float enabled, float w, double y, double ctx, double h) {
      IiIlliIliiIl(x, press, r, hover, enabled, w, y);
      lIiiIiIlilli(x, press, r, hover, enabled, w, Iiilliiliiil(IilIIIIililIIIIi.iliIiiliiiii(), y, ctx, h), IIIilIIiiIIi(y));
   }

   private static int IlIillIiilIi(int rgb, double a) {
      return Math.max(0, Math.min(255, (int)Math.round(a * 255.0))) << 24 | rgb & 16777215;
   }

   public static void Ililllililil(class_332 ctx, int active, int cx, int r, double cy) {
      long var12 = -674997878288386974L;
      double var6 = Math.max(0.0, Math.min(1.0, cy));
      var12 ^= ((long)Math.max(2, r - 1) << 32 ^ var12) & -1L << 32;
      double var9 = 0.24 + 0.18 * var6;
      float var11 = (float)(0.34 + 0.16 * var6);
      IIIiiIillIIiiIil.iliIiiliiiii(
         ctx,
         active - (int)(var12 >>> 32),
         cx - (int)(var12 >>> 32),
         (int)(var12 >>> 32) * 2,
         (int)(var12 >>> 32) * 2,
         (int)(var12 >>> 32),
         IilIIIIililIIIIi.IIlllIlliIll(var9),
         4.0F,
         var11
      );
      IIIiiIillIIiiIil.lIiiIiIlilli(
         ctx, active - (int)(var12 >>> 32), cx - (int)(var12 >>> 32), (int)(var12 >>> 32) * 2, (int)(var12 >>> 32) * 2, (int)(var12 >>> 32), -658441
      );
   }

   private static int Iiilliiliiil(int enabled, double base, double press, double hover) {
      long var8 = -4892746966112348306L;
      var8 ^= ((long)enabled << 32 ^ var8) & -1L << 32;
      if (base > 0.004) {
         var8 ^= ((long)IilIIIIililIIIIi.Illlllllilll((int)(var8 >>> 32), IlIIilIlllIIilIl.lliiIlliIl, 0.05 * base) << 32 ^ var8) & -1L << 32;
      }

      if (press > 0.004) {
         var8 ^= ((long)IilIIIIililIIIIi.Illlllllilll((int)(var8 >>> 32), -1, 0.04 * press) << 32 ^ var8) & -1L << 32;
      }

      if (hover > 0.004) {
         var8 ^= ((long)IilIIIIililIIIIi.Illlllllilll((int)(var8 >>> 32), -1, 0.07 * hover) << 32 ^ var8) & -1L << 32;
      }

      return (int)(var8 >>> 32);
   }

   public static void Illlllllilll(class_332 y, int x, int w, int reveal, double ctx) {
      long var7 = -4532970415621382514L;
      var7 ^= ((long)((int)Math.round(31.0 * Math.max(0.0, Math.min(1.0, ctx)))) << 32 ^ var7) & -1L << 32;
      if ((int)(var7 >>> 32) > 0) {
         IIIiiIillIIiiIil.IilliliilIIi(y, (float)x, (float)w, (float)reveal, IIIiiIillIIiiIil.Illlllllilll(), (int)(var7 >>> 32) << 24 | 16777215);
      }
   }

   private static void IiIlliIliiIl(class_332 y, float w, float enabled, float ctx, float x, float r, double h) {
      long var9 = -6612026130978547775L;
      if (!IilIIIIililIIIIi.liiiIIllIl()) {
         if (!(h <= 0.02)) {
            var9 ^= ((long)IilIIIIililIIIIi.IIlllIlliIll(0.2 * h) << 32 ^ var9) & -1L << 32;
            IIIiiIillIIiiIil.IIlllIlliIll(y, w, enabled, ctx, x, r, (int)(var9 >>> 32), 3.0F, 0.85F);
         }
      }
   }

   public static void IIlllIlliIll(class_332 y, float enabled, float r, float w, float x, float ctx, double press, double hover, double h) {
      IiIlliIliiIl(y, enabled, r, w, x, ctx, press);
      lIiiIiIlilli(y, enabled, r, w, x, ctx, Iiilliiliiil(IilIIIIililIIIIi.IIIllIIliIIl(), press, hover, h), IIIilIIiiIIi(press));
   }

   public static void IilliliilIIi(class_332 x, float w, float hov, float r, float ctx, float y, double h) {
      if (!(h <= 0.01)) {
         IIIiiIillIIiiIil.IlIlllIlilIl(x, w, hov, r, ctx, y, IlIillIiilIi(16777215, 0.045 * h));
      }
   }

   public static void liiiIIllIl(class_332 h, float x, float ctx, float fill, float r, float y, int w) {
      IIIiiIillIIiiIil.IlIlllIlilIl(h, x, ctx, fill, r, y, w);
      if (y > 0.0F) {
         IIIiiIillIIiiIil.IilliliilIIi(h, x, ctx, y, r, w);
      }
   }

   private IIiIllIllIiIllIl() {
   }

   public static void iIlIlllllill(class_332 r, int x, int h, int y, int ctx, int w) {
      IIIiiIillIIiiIil.lIiiIiIlilli(r, x, h, y, ctx, w, 234881023);
   }
}
