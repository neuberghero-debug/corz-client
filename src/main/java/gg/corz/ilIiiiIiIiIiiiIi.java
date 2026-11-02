package gg.corz;

public final class ilIiiiIiIiIiiiIi {
   private static final float iIIIiIIlIi = -15.0F;
   public static final double iliilIIlIi = 0.15;
   public static final double lliilIIlIi = 0.07;
   private static final double IiiilIIlIi = 0.35;
   private static final double iiiilIIlIi = 0.1;
   private static final double lIIIiIIlIi = 0.98;
   private static final double liiilIIlIi = 0.3;
   public static final double IliilIIlIi = 0.3;
   private static final double IIIIiIIlIi = 0.04;

   public static float IilliliilIIi(double dropY, double horizDist) {
      if (dropY <= 0.25) {
         return 89.0F;
      } else {
         double var4 = iIlIlllllill(dropY);
         float var6 = 89.0F;
         double var7 = Double.MAX_VALUE;

         for (float var9 = 89.0F; var9 >= -15.0F; var9 -= 0.5F) {
            double var10 = lIiiIiIlilli(var9, var4, horizDist);
            if (var10 < var7) {
               var7 = var10;
               var6 = var9;
            }
         }

         return var6;
      }
   }

   public static double iliIiiliiiii(double dropY, double horizDist) {
      double var4 = lIiiIiIlilli(IilliliilIIi(dropY, horizDist), iIlIlllllill(dropY), horizDist);
      return var4 == Double.MAX_VALUE ? -1.0 : 0.35 - var4;
   }

   public static double iIlIlllllill(double horizDist) {
      return Math.max(0.25, horizDist - 0.15);
   }

   public static double IliIlllilIi(float dropY, double pitchDeg) {
      return liiiIIllIl(dropY, pitchDeg, 0.0);
   }

   private ilIiiiIiIiIiiiIi() {
   }

   public static double liiiIIllIl(float dropY, double lift, double pitchDeg) {
      long var22 = -9147470380469255531L;
      double var5 = Math.toRadians((double)dropY);
      double var7 = Math.cos(var5) * 0.3;
      double var9 = -Math.sin(var5) * 0.3 + 0.1 + pitchDeg;
      double var11 = 0.0;
      double var13 = 0.0;

      for (long var25 = var22 ^ (0L ^ var22) & -1L << 32; (int)(var25 >>> 32) < 200; var25 += 4294967296L) {
         var9 -= 0.04;
         double var16 = var11 + var7;
         double var18 = var13 + var9;
         if (var13 > lift && var18 <= lift) {
            double var20 = (var13 - lift) / (var13 - var18);
            return var11 + (var16 - var11) * var20;
         }

         var11 = var16;
         var13 = var18;
         var7 *= 0.98;
         var9 *= 0.98;
      }

      return Double.NaN;
   }

   public static double lIiiIiIlilli(float pitchDeg, double aim, double dropY) {
      double var5 = liiiIIllIl(pitchDeg, dropY, -0.07);
      double var7 = liiiIIllIl(pitchDeg, dropY, 0.07);
      return !Double.isNaN(var5) && !Double.isNaN(var7) ? Math.max(Math.abs(var5 - aim), Math.abs(var7 - aim)) : Double.MAX_VALUE;
   }
}
