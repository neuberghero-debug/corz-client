package gg.corz;

import java.util.LinkedHashSet;

public final class iliililIiiilil {
   private iliililIiiilil() {
   }

   public static long[] liiiIIllIl(int tx, int tz, int ty, int supZ, int supX, int p, int supY, int sy, int sx, liIiIilliiIiIill sz) {
      long var16 = -7760405827458055902L;
      long var18 = -6306105130854601760L;
      LinkedHashSet var10 = new LinkedHashSet();
      var16 ^= (-4294967296L ^ var16) & -1L << 32;

      while ((int)(var16 >>> 32) <= 1) {
         for (var16 ^= ~var16 & -1L >>> 32; (int)var16 <= 1; var16 ^= (var16 ^ var16 + (long)1) & -1L >>> 32) {
            for (var18 ^= (-4294967296L ^ var18) & -1L << 32; (int)(var18 >>> 32) <= 1; var18 += 4294967296L) {
               var10.add(Long.valueOf(sz.pack(tx + (int)(var16 >>> 32), tz + (int)var16, ty + (int)(var18 >>> 32))));
            }
         }

         var16 += 4294967296L;
      }

      var10.add(Long.valueOf(sz.pack(supZ, supX, p)));
      var10.add(Long.valueOf(sz.pack(supY, sy - 1, sx)));
      var10.add(Long.valueOf(sz.pack(supY, sy, sx)));
      var10.add(Long.valueOf(sz.pack(supY, sy + 1, sx)));
      long[] var11 = new long[var10.size()];
      var16 ^= (0L ^ var16) & -1L >>> 32;

      for (long var14 : var10) {
         int var10001 = (int)var16;
         var16 ^= (var16 ^ var16 + (long)1) & -1L >>> 32;
         var11[var10001] = var14;
      }

      return var11;
   }

   public static long IliIlllilIi(long face, long sneak, int target, long stand, boolean support) {
      long var15 = 7323168022670960397L;
      long var8 = -3750763034362895579L;
      long[] var10 = new long[]{face, sneak, (long)target, stand, support ? 1L : 0L, 32319L};
      var15 ^= ((long)var10.length << 32 ^ var15) & -1L << 32;

      for (long var18 = var15 ^ (0L ^ var15) & -1L >>> 32; (int)var18 < (int)(var18 >>> 32); var18 ^= (var18 ^ var18 + (long)1) & -1L >>> 32) {
         long var13 = var10[(int)var18];
         var8 = (var8 ^ var13) * 1099511628211L;
      }

      return var8;
   }
}
