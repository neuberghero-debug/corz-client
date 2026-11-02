package gg.corz;

public final class IIiiIIllIiiIIl {
   private static final double iIIIiiiIlIlIIiiiIl = 1.0E-6;
   public static final double[] IIIIiiiIllIIIiiiIl = new double[]{0.0, 0.391304, 0.782609, 1.173913, 1.565217};

   public static int liiiIIllIl(double feetY, double baseTop) {
      long var10 = 7247946018724022513L;
      long var12 = 6230752386510162029L;
      if (!Double.isNaN(feetY) && !Double.isNaN(baseTop)) {
         var10 ^= (0L ^ var10) & -1L << 32;
         double[] var5 = IIIIiiiIllIIIiiiIl;
         var10 ^= ((long)var5.length ^ var10) & -1L >>> 32;

         for (long var16 = var12 ^ (0L ^ var12) & -1L << 32; (int)(var16 >>> 32) < (int)var10; var16 += 4294967296L) {
            double var8 = var5[(int)(var16 >>> 32)];
            if (feetY + var8 >= baseTop - 1.0E-6) {
               var10 += 4294967296L;
            }
         }

         return (int)(var10 >>> 32);
      } else {
         return IIIIiiiIllIIIiiiIl.length;
      }
   }

   public static boolean iIlIlllllill(double baseTop, double feetY) {
      return liiiIIllIl(baseTop, feetY) == 0;
   }

   public static int IliIlllilIi(double feetY, double baseTop) {
      long var10 = -4328926874612694221L;
      long var12 = -8574906959078459556L;
      var10 ^= (0L ^ var10) & -1L << 32;
      double[] var5 = IIIIiiiIllIIIiiiIl;
      var10 ^= ((long)var5.length ^ var10) & -1L >>> 32;

      for (long var16 = var12 ^ (0L ^ var12) & -1L << 32; (int)(var16 >>> 32) < (int)var10; var16 += 4294967296L) {
         double var8 = var5[(int)(var16 >>> 32)];
         if (feetY + var8 > baseTop + 1.0E-6) {
            var10 += 4294967296L;
         }
      }

      return (int)(var10 >>> 32);
   }

   public static double IilliliilIIi(double feetY, double baseTop) {
      return (double)liiiIIllIl(feetY, baseTop) / (double)IIIIiiiIllIIIiiiIl.length;
   }

   private IIiiIIllIiiIIl() {
   }
}
