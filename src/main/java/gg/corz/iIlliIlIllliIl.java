package gg.corz;

public final class iIlliIlIllliIl {
   public static int iIlIlllllill(int v, int lo, int hi) {
      long var9 = 5762837136476599860L;
      long var11 = 4409151122242718610L;
      int[] var3 = IliIlllilIi(lo, hi);
      if (var3.length == 0) {
         return v;
      } else {
         var9 ^= ((long)var3[0] << 32 ^ var9) & -1L << 32;
         int[] var5 = var3;
         var9 ^= ((long)var3.length ^ var9) & -1L >>> 32;
         var11 ^= (0L ^ var11) & -1L << 32;

         while ((int)(var11 >>> 32) < (int)var9) {
            var11 ^= ((long)var5[(int)(var11 >>> 32)] ^ var11) & -1L >>> 32;
            if (Math.abs((int)var11 - v) < Math.abs((int)(var9 >>> 32) - v)) {
               var9 ^= ((long)((int)var11) << 32 ^ var9) & -1L << 32;
            }

            var11 += 4294967296L;
         }

         return (int)(var9 >>> 32);
      }
   }

   public static boolean liiiIIllIl(int hi, int v, int lo) {
      long var7 = -2805307377118145060L;
      long var9 = 3239798713141516573L;
      if (hi >= v && hi <= lo) {
         var7 ^= ((long)(lo - v + 1) << 32 ^ var7) & -1L << 32;
         if ((int)(var7 >>> 32) < 3) {
            return hi == v;
         } else {
            var7 ^= ((long)(((int)(var7 >>> 32) + 2) / 3) ^ var7) & -1L >>> 32;
            var9 ^= ((long)(hi - v - 1) << 32 ^ var9) & -1L << 32;
            var9 ^= ((long)((int)(var9 >>> 32) >= 0 && (int)(var9 >>> 32) % 3 == 0 ? 1 : 0) ^ var9) & -1L >>> 32;
            switch ((int)(var7 >>> 32) % 3) {
               case 0:
                  return (boolean)((int)var9);
               case 2:
                  return hi == lo - 1 || (int)var9 != 0 && hi <= v + 1 + 3 * ((int)var7 - 2);
               default:
                  return (int)var7 == 2 ? hi == v + 1 || hi == lo : hi == lo - 1 || hi == lo - 3 || (int)var9 != 0 && hi <= v + 1 + 3 * ((int)var7 - 3);
            }
         }
      } else {
         return false;
      }
   }

   public static int[] IliIlllilIi(int hi, int lo) {
      long var6 = 3360051617545350617L;
      long var8 = -8192713085715805981L;
      var6 ^= ((long)(lo - hi + 1) << 32 ^ var6) & -1L << 32;
      if ((int)(var6 >>> 32) <= 0) {
         return new int[0];
      } else if ((int)(var6 >>> 32) < 3) {
         return new int[]{hi};
      } else {
         var6 ^= ((long)(((int)(var6 >>> 32) + 2) / 3) ^ var6) & -1L >>> 32;
         int[] var4 = new int[(int)var6];

         for (long var12 = var8 ^ (0L ^ var8) & -1L << 32; (int)(var12 >>> 32) < (int)var6; var12 += 4294967296L) {
            var4[(int)(var12 >>> 32)] = hi + 1 + 3 * (int)(var12 >>> 32);
         }

         switch ((int)(var6 >>> 32) % 3) {
            case 1:
               if ((int)var6 == 2) {
                  var4[1] = lo;
               } else {
                  var4[(int)var6 - 2] = lo - 3;
                  var4[(int)var6 - 1] = lo - 1;
               }
               break;
            case 2:
               var4[(int)var6 - 1] = lo - 1;
         }

         return var4;
      }
   }

   private iIlliIlIllliIl() {
   }

   public static int IilliliilIIi(int lo, int hi) {
      long var3 = -724992976799160794L;
      var3 ^= ((long)(hi - lo + 1) << 32 ^ var3) & -1L << 32;
      if ((int)(var3 >>> 32) <= 0) {
         return 0;
      } else {
         return (int)(var3 >>> 32) < 3 ? 1 : ((int)(var3 >>> 32) + 2) / 3;
      }
   }
}
