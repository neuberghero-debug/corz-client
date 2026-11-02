package gg.corz;

public final class llilIIllililIIll {
   public static final int lIiIlIllll = 100000;
   public static final int iIiIlIllll = 5;

   private static long iIlIlllllill(long v) {
      return Math.max(100000L, iliIiiliiiii(v) / 100L);
   }

   public static int IliIlllilIi(int value, int dir, boolean fine, int max) {
      long var4 = (long)Math.max(100000, max);
      if (dir == 0) {
         return value;
      } else if (value <= 0) {
         return dir > 0 ? 0 : (int)var4;
      } else {
         long var6 = (long)value;
         if (dir > 0) {
            if (var6 >= var4) {
               return 0;
            } else {
               long var12 = var6 < 100000L ? 100000L : (fine ? var6 / iIlIlllllill(var6) * iIlIlllllill(var6) + iIlIlllllill(var6) : IilliliilIIi(var6));
               return (int)Math.min(var4, var12);
            }
         } else if (var6 <= 100000L) {
            return value;
         } else {
            long var8 = iIlIlllllill(var6);
            long var10 = fine ? (var6 + var8 - 1L) / var8 * var8 - var8 : lIiiIiIlilli(var6);
            return (int)Math.max(100000L, Math.min(var4, var10));
         }
      }
   }

   private llilIIllililIIll() {
   }

   private static long lIiiIiIlilli(long v) {
      long var2 = iliIiiliiiii(v);
      long var4 = v / var2;
      if (v > var4 * var2) {
         return var4 * var2;
      } else {
         return var4 > 1L ? (var4 - 1L) * var2 : 9L * (var2 / 10L);
      }
   }

   public static int liiiIIllIl(int fine, int value, boolean dir, int max) {
      long var7 = 8005127938712416358L;
      long var9 = 8433325436573466607L;
      var7 ^= ((long)Math.max(0, max) << 32 ^ var7) & -1L << 32;
      var7 ^= ((long)Math.max(0, Math.min((int)(var7 >>> 32), fine)) ^ var7) & -1L >>> 32;
      if (value == 0) {
         return (int)var7;
      } else if (value > 0) {
         var9 ^= ((long)(dir ? 5 : ((int)var7 < 120 ? 15 : 60)) << 32 ^ var9) & -1L << 32;
         return Math.min((int)(var7 >>> 32), ((int)var7 / (int)(var9 >>> 32) + 1) * (int)(var9 >>> 32));
      } else {
         var9 ^= ((long)(dir ? 5 : ((int)var7 <= 120 ? 15 : 60)) << 32 ^ var9) & -1L << 32;
         return Math.max(0, ((int)var7 + (int)(var9 >>> 32) - 1) / (int)(var9 >>> 32) * (int)(var9 >>> 32) - (int)(var9 >>> 32));
      }
   }

   private static long IilliliilIIi(long v) {
      long var2 = iliIiiliiiii(v);
      return (v / var2 + 1L) * var2;
   }

   private static long iliIiiliiiii(long v) {
      long var2 = 1L;

      while (var2 <= v / 10L) {
         var2 *= 10L;
      }

      return var2;
   }
}
