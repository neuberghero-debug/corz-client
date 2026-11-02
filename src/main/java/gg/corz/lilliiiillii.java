package gg.corz;

public final class lilliiiillii {
   public static final double IilIiilIllilIiilIl = 0.5;
   public static final double iIiliilIlIliliilIl = 0.25;
   public static final double IllliilIllllliilIl = 1.0;
   public static final double iIIliilIlIlIliilIl = 1.0;
   public static final double lIlliilIliIlliilIl = 6.0;
   public static final double lliliilIlililiilIl = 12.0;
   public static final double iliIiilIlIiiIiilIl = -2.5;
   public static final double lIIiiilIliIIiiilIl = 4.5;
   public static final double lIiIiilIliIiIiilIl = -0.5;
   public static final double lilliilIliilliilIl = 4.0;
   public static final double illliilIlIilliilIl = 0.0;
   public static final double iiIliilIlIIlliilIl = 20.0;
   public static final double IIiliilIllIiliilIl = 20.0;
   public static final double iiiliilIlIIIiiilIl = 3.0;
   public static final double liiIiilIliiiIiilIl = 3.0;
   public static final double IIIliilIllIIliilIl = 0.4;
   public static final double IiiliilIlliiliilIl = 0.5;
   public static final int ilIiiilIlIiIiiilIl = 2;
   public static final double IiIliilIlliIliilIl = 4.0;
   public static final int IlIiiilIlllIiiilIl = 6;
   public static final double IliIiilIllliIiilIl = -1.5;
   public static final double llIliilIlilIliilIl = 4.0;
   public static final double iilIiilIlIIiIiilIl = -3.5;

   public static double IliIlllilIi(double feetY, double hisLevel) {
      return !Double.isNaN(feetY) && !Double.isNaN(hisLevel) ? 1.0 - IIiiIIllIiiIIl.IilliliilIIi(feetY, hisLevel) : 0.0;
   }

   public static double IilliliilIIi(double rel) {
      if (Double.isNaN(rel)) {
         return 6.0;
      } else if (rel > 0.5) {
         return 20.0;
      } else if (rel > -0.5) {
         return 6.0;
      } else if (rel > -1.5) {
         return 1.0;
      } else if (rel > -2.5) {
         return 0.0;
      } else {
         return rel >= -3.5 ? 4.0 : 20.0;
      }
   }

   public static IiIIIIliliIIIIli IlIlllIlilIl(double walkEta, int pearlOk, int aimTicks, boolean above, boolean underFire, boolean pearlFlight) {
      long var12 = -2993920490706827485L;
      if (!above) {
         return IiIIIIliliIIIIli.llliiIIlIi;
      } else {
         var12 ^= ((long)(Double.isFinite(walkEta) && walkEta >= 0.0 ? 1 : 0) << 32 ^ var12) & -1L << 32;
         double var8 = (double)(Math.max(0, pearlOk) + Math.max(0, aimTicks)) + 1.0;
         double var10 = underFire ? 2.0 : 6.0;
         if ((int)(var12 >>> 32) != 0 && walkEta <= var8 + var10) {
            return IiIIIIliliIIIIli.iIliiIIlIi;
         } else if (!pearlFlight) {
            return (int)(var12 >>> 32) != 0 ? IiIIIIliliIIIIli.iIliiIIlIi : IiIIIIliliIIIIli.llliiIIlIi;
         } else {
            return IiIIIIliliIIIIli.IlliiIIlIi;
         }
      }
   }

   public static double lIiiIiIlilli(double rel, boolean reachOk) {
      if (Double.isNaN(rel)) {
         return 0.0;
      } else if (rel > 0.5) {
         return -4.0 * rel;
      } else if (rel < -3.5) {
         return -4.0;
      } else {
         double var3 = IliIlllilIi(rel, 0.0) * 3.0;
         if (rel <= -0.5 && rel > -1.5) {
            var3 += 0.4;
         }

         if (rel <= -2.5 && !reachOk) {
            var3--;
         }

         return var3;
      }
   }

   public static boolean iliIiiliiiii(double h, double usFeetY, double hisLandingY) {
      if (!Double.isNaN(h) && !Double.isNaN(usFeetY) && !Double.isNaN(hisLandingY)) {
         double var6 = usFeetY - h;
         return var6 >= 0.5 && var6 <= 3.0 && hisLandingY <= 4.5;
      } else {
         return false;
      }
   }

   public static int IIIllIIliIIl(boolean onGround, double vy, double drop) {
      long var10 = 4292059114594878091L;
      if (!onGround && Double.isFinite(vy) && Double.isFinite(drop) && !(drop < 0.0)) {
         double var5 = 0.0;
         double var7 = vy;

         for (var10 ^= (0L ^ var10) & -1L << 32; (int)(var10 >>> 32) < 40; var10 += 4294967296L) {
            var5 += var7;
            var7 = (var7 - 0.08) * 0.98;
            if (var5 <= -drop) {
               break;
            }
         }

         return (int)(var10 >>> 32);
      } else {
         return 0;
      }
   }

   public static boolean liiiIIllIl(double rel) {
      return rel > 0.5;
   }

   public static double IiIlliIliiIl(double distToCentre, double feetY, double baseTop) {
      if (!Double.isNaN(distToCentre) && !Double.isNaN(feetY) && !Double.isNaN(baseTop)) {
         double var6 = 1.0 - feetY / 12.0;
         return var6 <= 0.0 ? 0.0 : var6 * IIiiIIllIiiIIl.IilliliilIIi(distToCentre, baseTop);
      } else {
         return 0.0;
      }
   }

   private lilliiiillii() {
   }

   public static int iIlIlllllill(double rel) {
      return Double.isNaN(rel) ? 0 : (int)Math.max(-3L, Math.min(3L, Math.round(rel)));
   }
}
