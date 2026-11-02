package gg.corz;

public final class Iilllilillli {
   public static final double IIiIlIlIllIiIlIlIl = 0.99;
   private static final int[] ilIllIlIlIiIllIlIl = new int[]{5, 7, 10, 15, 23};
   public static final double iIiIlIlIlIliIlIlIl = 0.1;
   public static final double IiiIlIlIlliiIlIlIl = 0.91;
   public static final double lilIlIlIliilIlIlIl = 0.03;
   public static final double illIlIlIlIilIlIlIl = 1.5;
   public static final double lliIlIlIliliIlIlIl = 0.546;
   private static final int liIllIlIliiIllIlIl = 400;
   private static final double[] IlIllIlIlllIllIlIl = new double[]{6.0, 10.0, 14.0, 20.0, 30.0};
   public static final double iiiIlIlIlIIIllIlIl = 0.08;
   private static final double IIlllIlIllIlllIlIl = 1.0E-9;
   public static final double lIIllIlIliIIllIlIl = 0.98;

   public static double[] IilliliilIIi(double my, double mx, double onGround, boolean ticks, int mz) {
      long var15 = 5401803607155233795L;
      double var8 = my;
      double var10 = mx;
      double var12 = onGround;

      for (long var17 = var15 ^ (0L ^ var15) & -1L << 32; (int)(var17 >>> 32) < mz; var17 += 4294967296L) {
         if (ticks) {
            var8 *= 0.546;
            var12 *= 0.546;
            var10 = 0.0;
         } else {
            var8 *= 0.91;
            var12 *= 0.91;
            var10 = (var10 - 0.08) * 0.98;
         }
      }

      return new double[]{var8, var10, var12};
   }

   public static double[] IliIlllilIi(float motionX, float motionY, double pitchDegrees, double motionZ, double yawDegrees) {
      double var8 = Math.toRadians((double)motionX);
      double var10 = Math.toRadians((double)motionY);
      double var12 = -Math.sin(var8) * Math.cos(var10);
      double var14 = -Math.sin(var10);
      double var16 = Math.cos(var8) * Math.cos(var10);
      double var18 = Math.sqrt(var12 * var12 + var14 * var14 + var16 * var16);
      if (var18 > 0.0) {
         var12 /= var18;
         var14 /= var18;
         var16 /= var18;
      }

      return new double[]{var12 * 1.5 + pitchDegrees, var14 * 1.5 + motionZ, var16 * 1.5 + yawDegrees};
   }

   public static double IlIlllIlilIl(double spawnHeight, double pitchDegrees) {
      long var21 = 7987971211481894560L;
      if (Double.isFinite(spawnHeight) && Double.isFinite(pitchDegrees)) {
         double var4 = Math.toRadians(spawnHeight);
         double var6 = Math.cos(var4) * 1.5;
         double var8 = -Math.sin(var4) * 1.5;
         double var10 = 0.0;
         double var12 = pitchDegrees;

         for (long var24 = var21 ^ (4294967296L ^ var21) & -1L << 32; (int)(var24 >>> 32) <= 400; var24 += 4294967296L) {
            double var23 = var8 - 0.03;
            var6 *= 0.99;
            var8 = var23 * 0.99;
            double var15 = var10 + var6;
            double var17 = var12 + var8;
            if (var17 <= 0.0) {
               double var19 = var12 - var17 > 0.0 ? var12 / (var12 - var17) : 0.0;
               return var10 + (var15 - var10) * Math.max(0.0, var19);
            }

            var10 = var15;
            var12 = var17;
         }

         return Double.POSITIVE_INFINITY;
      } else {
         return Double.POSITIVE_INFINITY;
      }
   }

   public static double iIlIlllllill(double lz, double lx, double errDeg) {
      return Math.hypot(lz, lx) * Math.sin(Math.toRadians(errDeg));
   }

   private Iilllilillli() {
   }

   public static int IIIllIIliIIl(double distance) {
      long var12 = 8449661709710960429L;
      var12 ^= ((long)(IlIllIlIlllIllIlIl.length - 1) << 32 ^ var12) & -1L << 32;
      if (!Double.isNaN(distance) && !(distance >= IlIllIlIlllIllIlIl[(int)(var12 >>> 32)])) {
         if (distance <= IlIllIlIlllIllIlIl[0]) {
            return ilIllIlIlIiIllIlIl[0];
         } else {
            for (var12 ^= (0L ^ var12) & -1L >>> 32; (int)var12 < (int)(var12 >>> 32); var12 ^= (var12 ^ var12 + (long)1) & -1L >>> 32) {
               double var4 = IlIllIlIlllIllIlIl[(int)var12];
               double var6 = IlIllIlIlllIllIlIl[(int)var12 + 1];
               if (distance <= var6) {
                  double var8 = (distance - var4) / (var6 - var4);
                  double var10 = (double)ilIllIlIlIiIllIlIl[(int)var12] + var8 * (double)(ilIllIlIlIiIllIlIl[(int)var12 + 1] - ilIllIlIlIiIllIlIl[(int)var12]);
                  return (int)Math.ceil(var10 - 1.0E-9);
               }
            }

            return ilIllIlIlIiIllIlIl[(int)(var12 >>> 32)];
         }
      } else {
         return ilIllIlIlIiIllIlIl[(int)(var12 >>> 32)];
      }
   }

   static double iliIiiliiiii(double x) {
      return (x % 360.0 + 540.0) % 360.0 - 180.0;
   }

   static double lIiiIiIlilli(double dz, double dx) {
      return Math.toDegrees(Math.atan2(-dz, dx));
   }

   public static double liiiIIllIl(double gz, double gx, double lx, double lz) {
      return iliIiiliiiii(lIiiIiIlilli(gz, gx) - lIiiIiIlilli(lx, lz));
   }
}
