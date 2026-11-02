package gg.corz;

public final class IIiiIlilIiiIli {
   private static final float lIiIllIIIl = 1.0E-4F;

   private IIiiIlilIiiIli() {
   }

   public static int IliIlllilIi(float[] speed, boolean[] current, int suitable) {
      long var6 = 4189206597831492204L;
      long var8 = -6809483187316343774L;
      var6 ^= ((long)Math.min(speed.length, current.length) << 32 ^ var6) & -1L << 32;
      if ((int)(var6 >>> 32) == 0) {
         return suitable;
      } else {
         var6 ^= ((long)(suitable >= 0 && suitable < (int)(var6 >>> 32) ? suitable : 0) ^ var6) & -1L >>> 32;

         for (long var12 = var8 ^ (0L ^ var8) & -1L << 32; (int)(var12 >>> 32) < (int)(var6 >>> 32); var12 += 4294967296L) {
            if ((int)(var12 >>> 32) != (int)var6 && liiiIIllIl(speed[(int)(var12 >>> 32)], current[(int)(var12 >>> 32)], speed[(int)var6], current[(int)var6])) {
               var6 ^= ((long)((int)(var12 >>> 32)) ^ var6) & -1L >>> 32;
            }
         }

         return (int)var6;
      }
   }

   private static boolean liiiIIllIl(float bestSu, boolean s, float bestS, boolean su) {
      if (bestSu > bestS + 1.0E-4F) {
         return true;
      } else {
         return bestSu < bestS - 1.0E-4F ? false : s && !su;
      }
   }
}
