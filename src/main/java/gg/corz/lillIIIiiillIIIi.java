package gg.corz;

public final class lillIIIiiillIIIi {
   private static final double lliIlIliil = 2.0;
   private static final double iliIlIliil = 1.0E-9;

   private lillIIIiiillIIIi() {
   }

   private static double liiiIIllIl(double hi, double v, double lo) {
      return hi < v ? v : Math.min(hi, lo);
   }

   public static double IliIlllilIi(lllIililillIilil maxIterations, double hi, double lo, double miss, double seed, int tolerance) {
      long var28 = 2048030139141722636L;
      long var30 = 4779932311304309710L;
      if (maxIterations != null && Double.isFinite(lo) && Double.isFinite(miss) && tolerance >= 1) {
         if (lo > miss) {
            double var10 = lo;
            lo = miss;
            miss = var10;
         }

         double var32 = Double.isNaN(seed) ? 0.0 : Math.abs(seed);
         iIliiiIlliii var12 = new iIliiiIlliii(tolerance + 4);
         double var13 = Double.isFinite(hi) ? liiiIIllIl(hi, lo, miss) : 0.5 * (lo + miss);
         double var15 = var12.IliIlllilIi(maxIterations, var13);
         if (Math.abs(var15) <= var32) {
            return var13;
         } else if (var12.liIIlIiIliiIIlIiIl >= tolerance) {
            return var12.lIiiIiIlilli();
         } else {
            double var17 = liiiIIllIl(var13 + 2.0, lo, miss);
            if (var17 == var13) {
               var17 = liiiIIllIl(var13 - 2.0, lo, miss);
            }

            if (var17 == var13) {
               return Double.NaN;
            } else {
               double var19 = var12.IliIlllilIi(maxIterations, var17);
               if (Math.abs(var19) <= var32) {
                  return var17;
               } else {
                  var28 ^= ((long)(var13 != lo && var17 != lo ? 0 : 1) << 32 ^ var28) & -1L << 32;
                  var28 ^= ((long)(var13 != miss && var17 != miss ? 0 : 1) ^ var28) & -1L >>> 32;

                  while (var12.liIIlIiIliiIIlIiIl < tolerance) {
                     double var23 = Double.NaN;
                     if (Double.isFinite(var15) && Double.isFinite(var19) && var19 != var15) {
                        var23 = var17 - var19 * (var17 - var13) / (var19 - var15);
                     }

                     var30 ^= ((long)(Double.isFinite(var23) && var23 >= lo && var23 <= miss && Math.abs(var23 - var17) > 1.0E-9 ? 1 : 0) << 32 ^ var30)
                        & -1L << 32;
                     if ((int)(var30 >>> 32) != 0 && var12.liiiIIllIl()) {
                        var30 ^= ((long)(var23 > var12.IIlIlIiIllIlIlIiIl && var23 < var12.iIlIlIiIlIllIlIiIl ? 1 : 0) << 32 ^ var30) & -1L << 32;
                     }

                     if ((int)(var30 >>> 32) == 0) {
                        if (!var12.liiiIIllIl()) {
                           if ((int)(var28 >>> 32) == 0) {
                              var28 ^= (4294967296L ^ var28) & -1L << 32;
                              double var26 = var12.IliIlllilIi(maxIterations, lo);
                              if (Math.abs(var26) <= var32) {
                                 return lo;
                              }

                              if (var12.liIIlIiIliiIIlIiIl >= tolerance) {
                                 break;
                              }
                           }

                           if (!var12.liiiIIllIl() && (int)var28 == 0) {
                              var28 ^= (1L ^ var28) & -1L >>> 32;
                              double var33 = var12.IliIlllilIi(maxIterations, miss);
                              if (Math.abs(var33) <= var32) {
                                 return miss;
                              }

                              if (var12.liIIlIiIliiIIlIiIl >= tolerance) {
                                 break;
                              }
                           }

                           if (!var12.liiiIIllIl()) {
                              return Double.NaN;
                           }
                        }

                        var23 = 0.5 * (var12.IIlIlIiIllIlIlIiIl + var12.iIlIlIiIlIllIlIiIl);
                     }

                     double var34 = var12.IliIlllilIi(maxIterations, var23);
                     if (Math.abs(var34) <= var32) {
                        return var23;
                     }

                     var13 = var17;
                     var15 = var19;
                     var17 = var23;
                     var19 = var34;
                  }

                  return var12.lIiiIiIlilli();
               }
            }
         }
      } else {
         return Double.NaN;
      }
   }
}
