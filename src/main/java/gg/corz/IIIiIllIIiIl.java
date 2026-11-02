package gg.corz;

import java.util.function.LongPredicate;

public final class IIIiIllIIiIl {
   public static final int illlIillIillIill = 1309;
   public static final int IlllIillllllIill = 273;
   private static final int[] iIilIillIlilIill = new int[]{-1, 0, 1, 0};
   private static final iIIIliIlIIli[] iiilIillIIIiIill = iIIIliIlIIli.values();
   private static final int[] IiilIillliilIill = new int[]{1, -1, 1, -1};
   static final double lillIilliillIill = 0.001;
   private static final int[] IIilIilllIilIill = new int[]{0, 1, 0, -1};
   private static final int[] llilIillililIill = new int[]{1, 1, -1, -1};

   public static long iIlIlllllill(int z, int y, int x) {
      return (long)(z & 67108863) << 38 | (long)(x & 67108863) << 12 | (long)y & 4095L;
   }

   public static int lIiiIiIlilli(double feetY) {
      return (int)Math.floor(feetY + 0.001);
   }

   public static double IIIllIIliIIl(IlIIlIilllIIlIil z, int x, int up, double fromFeet, double down, int w) {
      long var16 = -4906436586945448766L;
      long var18 = -2002199321628456928L;
      long var20 = -2924960808642809767L;
      if (z != null && Double.isFinite(fromFeet)) {
         var16 ^= ((long)((int)Math.floor(fromFeet + Math.max(down, 1.8) - 0.001)) << 32 ^ var16) & -1L << 32;
         var16 ^= ((long)((int)Math.floor(fromFeet + 0.001) - w - 1) ^ var16) & -1L >>> 32;

         for (var18 ^= ((long)((int)(var16 >>> 32)) << 32 ^ var18) & -1L << 32; (int)(var18 >>> 32) >= (int)var16; var18 += -4294967296L) {
            if (z.IliIlllilIi(x, (int)(var18 >>> 32), up)) {
               double var11 = z.liiiIIllIl(x, (int)(var18 >>> 32), up);
               if (!Double.isNaN(var11)) {
                  if (var11 > fromFeet + down + 0.001) {
                     return Double.POSITIVE_INFINITY;
                  }

                  if (fromFeet - var11 > (double)w + 0.001) {
                     return Double.NaN;
                  }

                  var18 ^= ((long)Math.max((int)(var18 >>> 32) + 1, (int)Math.floor(var11 + 0.001)) ^ var18) & -1L >>> 32;
                  var20 ^= ((long)((int)Math.floor(var11 + 1.8 - 0.001)) << 32 ^ var20) & -1L << 32;

                  for (long var27 = var20 ^ ((long)((int)var18) ^ var20) & -1L >>> 32;
                     (int)var27 <= (int)(var27 >>> 32);
                     var27 ^= (var27 ^ var27 + (long)1) & -1L >>> 32
                  ) {
                     if (z.IliIlllilIi(x, (int)var27, up)) {
                        return Double.POSITIVE_INFINITY;
                     }
                  }

                  return var11;
               }
            }
         }

         return Double.NaN;
      } else {
         return Double.NaN;
      }
   }

   private IIIiIllIIiIl() {
   }

   public static boolean iliIiiliiiii(int flags, boolean fireResistant) {
      return (flags & 1297) != 0 || !fireResistant && (flags & 8) != 0;
   }

   public static ilIIlIilIiIIlIil IliIlllilIi(
      IlIIlIilllIIlIil sx, int lim, int goal, double penalized, liiIIlliiiIIll w, lIiiiIlliIiiiIll feetY, iilIiiIIiIii sz, LongPredicate danger
   ) {
      return new ilIIlIilIiIIlIil(sx, lim, goal, penalized, w, feetY, sz, danger);
   }

   public static long IilliliilIIi(int x, int z) {
      return (long)x << 32 | (long)z & 4294967295L;
   }

   public static ilIilIilIiIilIil liiiIIllIl(
      IlIIlIilllIIlIil sz, int goal, int danger, double feetY, liiIIlliiiIIll lim, lIiiiIlliIiiiIll penalized, iilIiiIIiIii sx, LongPredicate w
   ) {
      ilIIlIilIiIIlIil var9 = IliIlllilIi(sz, goal, danger, feetY, lim, penalized, sx, w);
      var9.lIiiIiIlilli(Integer.MAX_VALUE);
      return var9.iliIiiliiiii();
   }
}
