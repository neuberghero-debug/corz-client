package gg.corz;

import java.util.List;

public final class llIIllililIIllil {
   public static int IliIlllilIi(List<iiiiiIilIIIIIlil> hotbar) {
      long var8 = -1356610106514805593L;

      for (iiiiiIilIIIIIlil var2 : hotbar) {
         if (var2.lIlIiilIil && !var2.iIlIiilIil) {
            return var2.IIlIiilIil;
         }
      }

      var8 ^= (-4294967296L ^ var8) & -1L << 32;
      long var10 = Long.MAX_VALUE;

      for (iiiiiIilIIIIIlil var5 : hotbar) {
         if (liiiIIllIl(var5)) {
            long var6 = iIlIlllllill(var5);
            if (var6 < var10) {
               var10 = var6;
               var8 ^= ((long)var5.IIlIiilIil << 32 ^ var8) & -1L << 32;
            }
         }
      }

      return (int)(var8 >>> 32);
   }

   static long iIlIlllllill(iiiiiIilIIIIIlil s) {
      long var1 = 0L;
      if (s.lllIiilIil) {
         var1 += 1000000L;
      }

      var1 += (long)Math.max(0, s.iilIiilIil) * 10000L;
      var1 += (long)Math.max(0, s.IIiIiilIil) * 100L;
      return var1 + (long)Math.max(0, s.lilIiilIil);
   }

   static boolean liiiIIllIl(iiiiiIilIIIIIlil s) {
      return !s.lIlIiilIil && !s.iIlIiilIil && !s.IllIiilIil && !s.IilIiilIil && !s.illIiilIil;
   }

   private llIIllililIIllil() {
   }
}
