package gg.corz;

import java.util.function.BiPredicate;

public final class illiIIIlIiliIIIl {
   public static final double iIIIllllIl = 1.0;
   public static final double iiiiIlllIl = 0.3;
   public static final double IIIIllllIl = 2.0;
   public static final double IlIIllllIl = 0.01;
   public static final double lIIIllllIl = 0.25;

   public static boolean iIlIlllllill(IIilIIlllIilIIll z) {
      return z == IIilIIlllIilIIll.iIlIlIllll || z == IIilIIlllIilIIll.IllIlIllll;
   }

   public static boolean IilliliilIIi(IIilIIlllIilIIll z) {
      return z == IIilIIlllIilIIll.iiIIlIllll || z == IIilIIlllIilIIll.IIlIlIllll;
   }

   public static boolean IliIlllilIi(double minX, double floor, double maxZ, double maxX, BiPredicate<Integer, Integer> minZ) {
      long var11 = -1666070378553002299L;
      var11 ^= ((long)((int)Math.floor(minX)) << 32 ^ var11) & -1L << 32;

      while ((double)((int)(var11 >>> 32)) <= Math.floor(floor - 1.0E-7)) {
         for (var11 ^= ((long)((int)Math.floor(maxZ)) ^ var11) & -1L >>> 32;
            (double)((int)var11) <= Math.floor(maxX - 1.0E-7);
            var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32
         ) {
            if (!minZ.test((int)(var11 >>> 32), (int)var11)) {
               return false;
            }
         }

         var11 += 4294967296L;
      }

      return true;
   }

   private illiIIIlIiliIIIl() {
   }

   public static IIilIIlllIilIIll liiiIIllIl(double x, double z, double floor, double vz, boolean placingAtEdge, BiPredicate<Integer, Integer> vx) {
      long var39 = 6027273353982389705L;
      double var10 = x - 0.3;
      double var12 = x + 0.3;
      double var14 = z - 0.3;
      double var16 = z + 0.3;
      if (!IliIlllilIi(var10, var12, var14, var16, vx)) {
         return IIilIIlllIilIIll.IllIlIllll;
      } else {
         double var18 = floor * 2.0;
         double var20 = vz * 2.0;
         double var22 = Math.min(var10, var10 + var18);
         double var24 = Math.max(var12, var12 + var18);
         double var26 = Math.min(var14, var14 + var20);
         double var28 = Math.max(var16, var16 + var20);
         var39 ^= ((long)(Math.abs(floor) < 0.01 && Math.abs(vz) < 0.01 ? 1 : 0) << 32 ^ var39) & -1L << 32;
         double var31 = var22 - ((int)(var39 >>> 32) == 0 && !(floor <= -0.01) ? 0.0 : 0.25);
         double var33 = var24 + ((int)(var39 >>> 32) == 0 && !(floor >= 0.01) ? 0.0 : 0.25);
         double var35 = var26 - ((int)(var39 >>> 32) == 0 && !(vz <= -0.01) ? 0.0 : 0.25);
         double var37 = var28 + ((int)(var39 >>> 32) == 0 && !(vz >= 0.01) ? 0.0 : 0.25);
         if (!IliIlllilIi(var31, var33, var35, var37, vx)) {
            return placingAtEdge ? IIilIIlllIilIIll.iIlIlIllll : IIilIIlllIilIIll.lIlIlIllll;
         } else {
            return IliIlllilIi(var10 - 1.0, var12 + 1.0, var14 - 1.0, var16 + 1.0, vx) ? IIilIIlllIilIIll.iiIIlIllll : IIilIIlllIilIIll.IIlIlIllll;
         }
      }
   }
}
