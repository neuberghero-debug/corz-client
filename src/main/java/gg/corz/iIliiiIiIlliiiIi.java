package gg.corz;

import java.util.function.IntSupplier;

final class iIliiiIiIlliiiIi {
   private int IilIiIIlIi = ((2010451851 * 799063683 ^ -57) + 41) * 113 ^ 260229279;
   private long lilIiIIlIi = -5216753664725295305L ^ 4006618372129480503L;
   private boolean iilIiIIlIi;

   void liiiIIllIl() {
      this.IilIiIIlIi = (~(532226486 << 1 | 532226486 >>> 31) << 3 | ~(532226486 << 1 | 532226486 >>> 31) >>> 29) ^ -2073172834;
      this.lilIiIIlIi = 1776344780659479974L ^ -7447027256195295834L;
      this.iilIiIIlIi = false;
   }

   boolean IliIlllilIi(int chancePercent, long rollPercent, int stamp, IntSupplier entityId) {
      if (chancePercent != this.IilIiIIlIi || rollPercent != this.lilIiIIlIi) {
         this.IilIiIIlIi = chancePercent;
         this.lilIiIIlIi = rollPercent;
         this.iilIiIIlIi = entityId.getAsInt() < stamp;
      }

      return this.iilIiIIlIi;
   }
}
