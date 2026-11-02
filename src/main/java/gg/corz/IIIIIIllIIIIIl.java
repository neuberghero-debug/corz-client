package gg.corz;

import java.util.Arrays;
import java.util.function.LongPredicate;

public final class IIIIIIllIIIIIl {
   private static final double liIilIiIliiIilIiIl = 1.0E-7;

   public static IliilIIllliilIIl liiiIIllIl(double x, double z, int walkable, LongPredicate feetY) {
      double var6 = 0.3;
      return IliIlllilIi(x - var6, x + var6, z - var6, z + var6, walkable, feetY);
   }

   public static IliilIIllliilIIl IliIlllilIi(double maxX, double minX, double minZ, double maxZ, int feetY, LongPredicate walkable) {
      long var48 = -103304340507572375L;
      long var50 = -7205937039823333802L;
      long var52 = 4244282572353882144L;
      long var42 = -1974360690938173774L;
      long var44 = -7733691850478560276L;
      long var46 = 6151900622165575959L;
      double var10 = (maxX + minX) * 0.5;
      double var12 = (minZ + maxZ) * 0.5;
      var42 ^= ((long)((int)Math.floor(var10)) << 32 ^ var42) & -1L << 32;
      var42 ^= ((long)((int)Math.floor(var12)) ^ var42) & -1L >>> 32;
      var44 ^= ((long)((int)Math.floor(maxX)) << 32 ^ var44) & -1L << 32;
      var44 ^= ((long)((int)Math.floor(minX - 1.0E-7)) ^ var44) & -1L >>> 32;
      var46 ^= ((long)((int)Math.floor(minZ)) << 32 ^ var46) & -1L << 32;
      var46 ^= ((long)((int)Math.floor(maxZ - 1.0E-7)) ^ var46) & -1L >>> 32;
      long var20 = llIiIiililIiIiil.IIIllIIliIIl((int)(var42 >>> 32), feetY, (int)var42);
      long var22 = 0L;
      double var24 = -1.0;
      double var26 = Double.MAX_VALUE;
      long[] var28 = new long[((int)var44 - (int)(var44 >>> 32) + 1) * ((int)var46 - (int)(var46 >>> 32) + 1)];
      var48 ^= (0L ^ var48) & -1L << 32;

      for (var48 ^= ((long)((int)(var44 >>> 32)) ^ var48) & -1L >>> 32; (int)var48 <= (int)var44; var48 ^= (var48 ^ var48 + (long)1) & -1L >>> 32) {
         for (var50 ^= ((long)((int)(var46 >>> 32)) << 32 ^ var50) & -1L << 32; (int)(var50 >>> 32) <= (int)var46; var50 += 4294967296L) {
            long var32 = llIiIiililIiIiil.IIIllIIliIIl((int)var48, feetY, (int)(var50 >>> 32));
            if (walkable.test(var32)) {
               int var10001 = (int)(var48 >>> 32);
               var48 += 4294967296L;
               var28[var10001] = var32;
               double var34 = Math.min(minX, (double)((int)var48 + 1)) - Math.max(maxX, (double)((int)var48));
               double var36 = Math.min(maxZ, (double)((int)(var50 >>> 32) + 1)) - Math.max(minZ, (double)((int)(var50 >>> 32)));
               double var38 = Math.max(0.0, var34) * Math.max(0.0, var36);
               double var40 = Math.hypot((double)((int)var48) + 0.5 - var10, (double)((int)(var50 >>> 32)) + 0.5 - var12);
               if (var38 > var24 + 1.0E-9 || Math.abs(var38 - var24) <= 1.0E-9 && var40 < var26) {
                  var22 = var32;
                  var24 = var38;
                  var26 = var40;
               }
            }
         }
      }

      long[] var30 = Arrays.copyOf(var28, (int)(var48 >>> 32));
      if ((int)(var48 >>> 32) == 0) {
         return new IliilIIllliilIIl(0L, var30);
      } else {
         long[] var31 = var30;
         var50 ^= ((long)var30.length ^ var50) & -1L >>> 32;

         for (long var64 = var52 ^ (0L ^ var52) & -1L << 32; (int)(var64 >>> 32) < (int)var50; var64 += 4294967296L) {
            long var54 = var31[(int)(var64 >>> 32)];
            if (var54 == var20) {
               return new IliilIIllliilIIl(var20, var30);
            }
         }

         return new IliilIIllliilIIl(var22, var30);
      }
   }

   private IIIIIIllIIIIIl() {
   }
}
