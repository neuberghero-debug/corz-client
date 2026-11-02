package gg.corz;

import java.util.Arrays;

public final class iliIlIIlIiiIlIIl {
   public static final double IIlIlillIl = 0.35;
   public static final int IiiIlillIl = 1;
   public static final double lllIlillIl = 2.5;
   public static final double IIiIlillIl = 0.5;
   public static final double IllIlillIl = 1.0;
   public static final int iiiIlillIl = 512;
   public static final double IilIlillIl = 0.7;
   public static final double iliIlillIl = 0.05;
   public static final double illIlillIl = 1.1;
   public static final double lIiIlillIl = 1.0;
   public static final double IliIlillIl = 1.0E-4;
   public static final double iIlIlillIl = 0.35;
   public static final int liiIlillIl = 4;
   public static final double lilIlillIl = 0.03;
   public static final double iiIIlillIl = 1.3;
   public static final double lIlIlillIl = 1.5;
   public static final double iilIlillIl = 0.5;
   public static final double iIiIlillIl = 0.5;
   public static final double lliIlillIl = 0.08;

   public static float Iiiiliiiiiii(double capOutlineTopY, boolean capped, double baseOutlineTopY) {
      return capped
         ? (float)(1.0 + lIlIliIlIl(baseOutlineTopY, 0.0, Double.longBitsToDouble(8447451868693266351L ^ 5394011321336070063L)))
         : (float)lIlIliIlIl(capOutlineTopY, 0.0, 1.0);
   }

   public static boolean IlIillIiilIi(double sinceEvict) {
      return sinceEvict >= Double.longBitsToDouble(-885047227966806706L ^ -3745916417372442315L);
   }

   public static double IIIilIIiiIIi(double sinceEvict) {
      return !(sinceEvict > Double.longBitsToDouble(8879636463293311974L ^ 8879636463293311974L))
         ? 1.0
         : 1.0 - iiIIlIIlIl(0.0, Double.longBitsToDouble(741896031360774361L ^ 3891044535876838562L), sinceEvict);
   }

   public static boolean Ililllililil(double lift) {
      return lift >= Double.longBitsToDouble(-5405611853711056714L ^ -8402079761212604914L);
   }

   public static double Iilllilliill(double t, double life, double speed, double radius, double distance) {
      double var10 = IIIllIIliIIl(iliIiiliiiii(t, life, speed));
      if (var10 <= Double.longBitsToDouble(-6836676802616931745L ^ -6836676802616931745L)) {
         return 0.0;
      } else {
         double var12 = IlIlllIlilIl(life, radius);
         return var12 <= Double.longBitsToDouble(3159882839410212720L ^ 3159882839410212720L)
            ? 0.0
            : var10 * var12 * IiIlliIliiIl(t) * Illlllllilll(t, distance);
      }
   }

   public static double IIillIiliIil(double life, double t, double radius, double distance, double speed, double height) {
      return Math.max(0.0, radius) * Iilllilliill(life, t, distance, speed, height);
   }

   public static double iliIiiliiiii(double distance, double speed, double t) {
      return (speed - iIlIlllllill(distance, t)) / liiiIIllIl(t);
   }

   public static boolean Iilililiiili(
      boolean aboveCollisionEmpty,
      boolean air,
      boolean blockEntity,
      boolean topY,
      boolean fluid,
      boolean collisionEmpty,
      double translucent,
      boolean aboveFluid,
      boolean fullFootprint,
      boolean modelRendered
   ) {
      if (aboveCollisionEmpty || !air || blockEntity || topY || fluid) {
         return false;
      } else if (collisionEmpty || !aboveFluid) {
         return false;
      } else {
         return !(translucent < Double.longBitsToDouble(-2900442167163682222L ^ -1702484666283130286L))
               && !(translucent > Double.longBitsToDouble(-3845088628717373890L ^ -769130083223325122L))
            ? fullFootprint && !modelRendered
            : false;
      }
   }

   public static double IlIlllIlilIl(double life, double t) {
      if (!(t > Double.longBitsToDouble(-2063121289741079311L ^ -2063121289741079311L))) {
         return 0.0;
      } else {
         double var4 = life / t;
         if (var4 <= Double.longBitsToDouble(49721003255924708L ^ 49721003255924708L)) {
            return 1.0;
         } else {
            return var4 >= Double.longBitsToDouble(6747580551932255024L ^ 7085350523985042224L)
               ? 0.0
               : Math.exp(Double.longBitsToDouble(-5062159814253180277L ^ 454302681288610577L) * var4)
                  * (1.0 - iiIIlIIlIl(Double.longBitsToDouble(559208483109273861L ^ 4045590643181578083L), 1.0, var4));
         }
      }
   }

   public static double IIlllIlliIll(double radius) {
      return lIlIliIlIl(
         radius * Double.longBitsToDouble(-8189491038866735389L ^ -5652172372908959611L),
         1.0,
         Double.longBitsToDouble(4341653839136123717L ^ 8954465757470354245L)
      );
   }

   public static int IIIIllIIIl(float[] cap, int distances, int out, int[] count) {
      int var4 = Math.max(0, Math.min(distances, cap.length));
      long[] var5 = new long[var4];
      int var6 = 0;

      for (int var7 = 0; var7 < var4; var7++) {
         float var8 = cap[var7];
         if (var8 >= 0.0F) {
            var5[var6++] = (long)Float.floatToIntBits(var8) << 32 | (long)var7 & 4294967295L;
         }
      }

      Arrays.sort(var5, 0, var6);
      int var9 = Math.min(var6, Math.min(Math.max(0, out), count.length));

      for (int var10 = 0; var10 < var9; var10++) {
         count[var10] = (int)var5[var10];
      }

      return var9;
   }

   public static double IiIlliIliiIl(double distance) {
      return iiIIlIIlIl(
         Double.longBitsToDouble(4295947256407592536L ^ 308535206256273470L), Double.longBitsToDouble(-4434348847844956365L ^ -176195400166152397L), distance
      );
   }

   public static int llIIlilIIl(int rgb, float k) {
      long var5 = -4521447763483225778L;
      long var7 = -590652428129548786L;
      if (!(k > 0.0F)) {
         return (
               (-1103497037 * 1041204193 >>> 15 | -1103497037 * 1041204193 << 17) * -47 >>> 25
                  | (-1103497037 * 1041204193 >>> 15 | -1103497037 * 1041204193 << 17) * -47 << 7
            )
            ^ 1633023102;
      } else {
         if (k > 1.0F) {
            k = 1.0F;
         }

         var5 ^= (
               (long)Math.round(
                        (float)(
                              rgb >> (-(--1359334240) ^ -1359334224)
                                 & (
                                    ((--1369279014 << 23 | --1369279014 >>> 9) << 19 | (--1369279014 << 23 | --1369279014 >>> 9) >>> 13) * 1527099483
                                       ^ -903046371
                                 )
                           )
                           * k
                     )
                     << 32
                  ^ var5
            )
            & -1L << 32;
         var5 ^= (
               (long)Math.round(
                     (float)(rgb >> ((-1595634878 * 25 - -57) * -5 * -2014922929 ^ -659573713) & (~(~(-2052025667 * 1062196213 * 79)) ^ -1373658992)) * k
                  )
                  ^ var5
            )
            & -1L >>> 32;
         var7 ^= ((long)Math.round((float)(rgb & (~-177335191 + 85 ^ 177335060)) * k) << 32 ^ var7) & -1L << 32;
         return ~(-1593778177 ^ 87) ^ -1577115561
            | (int)(var5 >>> 32)
               << ((-(1411379241 + -69 >>> 25 | 1411379241 + -69 << 7) << 17 | -(1411379241 + -69 >>> 25 | 1411379241 + -69 << 7) >>> 15) ^ 464379904)
            | (int)var5 << ((-571210831 - 101 >>> 29 | -571210831 - 101 << 3) ^ -274720146)
            | (int)(var7 >>> 32);
      }
   }

   public static double Iiilliiliiil(double speed, double life, double radius) {
      return Math.max(0.0, Math.min(radius, iIlIlllllill(speed, life) + liiiIIllIl(life)));
   }

   public static double IliIlllilIi(double speed) {
      return Math.max(Double.longBitsToDouble(-4755072906345312374L ^ -9087535747875729526L), speed);
   }

   public static boolean IiIiliIiiiIi(double distance, double speed, double t) {
      return speed >= iIlIlllllill(distance, t) - Double.longBitsToDouble(316981734414162081L ^ 4309870818987508027L)
         && iliIiiliiiii(distance, speed, t) < Double.longBitsToDouble(4862315270240859108L ^ 8974101730030121956L);
   }

   private static double lIlIliIlIl(double hi, double lo, double v) {
      return hi < lo ? lo : (hi > v ? v : hi);
   }

   public static double IIIllIIliIIl(double phase) {
      if (phase > Double.longBitsToDouble(-1177836216949334447L ^ -1177836216949334447L)
         && !(phase >= Double.longBitsToDouble(500164038605458834L ^ 4107547340129226130L))) {
         double var2 = Math.sin(Double.longBitsToDouble(2728794270085312473L ^ 7338543115659788993L) * phase);
         return var2 * var2;
      } else {
         return 0.0;
      }
   }

   public static double Iliilliiilii(double baseTopY, boolean capped, boolean capCollisionEmpty, double capCollisionTopY) {
      return capped && !capCollisionEmpty ? Math.max(baseTopY, 1.0 + capCollisionTopY) : baseTopY;
   }

   public static int iIIIlIlIIl(int argb, int k, float rgb) {
      if (!(rgb > 0.0F)) {
         return argb;
      } else {
         if (rgb > 1.0F) {
            rgb = 1.0F;
         }

         int var3 = argb >>> 24;
         int var4 = IiIIlliIIl(argb >> 16 & 0xFF, k >> 16 & 0xFF, rgb);
         int var5 = IiIIlliIIl(argb >> 8 & 0xFF, k >> 8 & 0xFF, rgb);
         int var6 = IiIIlliIIl(argb & 0xFF, k & 0xFF, rgb);
         return var3 << 24 | var4 << 16 | var5 << 8 | var6;
      }
   }

   private iliIlIIlIiiIlIIl() {
   }

   public static boolean IIiilIiiiIii(
      boolean air,
      boolean outlineTopY,
      boolean collisionEmpty,
      boolean blockEntity,
      boolean outlineEmpty,
      boolean fluid,
      double outlineFullFootprint,
      double translucent,
      boolean modelRendered,
      boolean outlineMinY,
      double collisionTopY
   ) {
      if (air || !outlineTopY || collisionEmpty || blockEntity || outlineEmpty) {
         return false;
      } else if (fluid || !modelRendered) {
         return false;
      } else {
         return !(outlineFullFootprint > Double.longBitsToDouble(-6512375285482939217L ^ -7312346282249560190L))
               && !(translucent > Double.longBitsToDouble(4904687575005972972L ^ 8930905846743273742L))
            ? outlineMinY || collisionTopY < Double.longBitsToDouble(8056999335084932865L ^ 5778177923635461889L)
            : false;
      }
   }

   public static double IilliliilIIi(double distance, double speed) {
      return iIlIlllllill(distance, speed) + Double.longBitsToDouble(-987447335429579152L ^ -3626556717068689808L) * liiiIIllIl(speed);
   }

   public static boolean Illillliilli(double feetY, double candidateTop, double bestTop) {
      if (Double.isNaN(candidateTop)) {
         return true;
      } else {
         double var6 = Math.abs(feetY - bestTop);
         double var8 = Math.abs(candidateTop - bestTop);
         return var6 < var8 - Double.longBitsToDouble(4456509381474705131L ^ 272922564376397950L)
            ? true
            : Math.abs(var6 - var8) <= Double.longBitsToDouble(-910131231211995821L ^ -3652491331768915002L) && feetY < candidateTop;
      }
   }

   public static double iiIIlIIlIl(double edge1, double edge0, double x) {
      if (edge0 <= edge1) {
         return x < edge1 ? 0.0 : 1.0;
      } else {
         double var6 = lIlIliIlIl((x - edge1) / (edge0 - edge1), 0.0, 1.0);
         return var6 * var6 * (3.0 - 2.0 * var6);
      }
   }

   private static int IiIIlliIIl(int k, int a, float b) {
      return Math.round((float)k + (float)(a - k) * b);
   }

   public static boolean IIlilIliiIli(double dx, double dz, double radius) {
      return dx * dx + dz * dz <= radius * radius;
   }

   public static double iIlIlllllill(double speed, double distance) {
      return Math.max(0.0, speed) / IliIlllilIi(distance);
   }

   public static double liiiIIllIl(double speed) {
      return Double.longBitsToDouble(-4741832566597109263L ^ -129077529807588036L) / IliIlllilIi(speed);
   }

   public static double lIiiIiIlilli(double speed, double t) {
      return IliIlllilIi(t) * speed - Double.longBitsToDouble(5976054974408764444L ^ 7862153118117257425L);
   }

   public static double Illlllllilll(double distance, double radius) {
      return distance >= radius ? 0.0 : 1.0 - iiIIlIIlIl(radius - IIlllIlliIll(radius), radius, distance);
   }
}
