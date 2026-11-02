package gg.corz;

public final class lIlllllliIllllll {
   public static final int iIIlIiIill = 3;
   public static final int lIIlIiIill = 4;
   public static final int iiiIIiIill = 8;
   public static final int llIlIiIill = 9;
   public static final int IIIlIiIill = 4;
   public static final int IlIlIiIill = 40;
   private static final iiIlIlilIIllIlil ilIlIiIill = iiIlIlilIIllIlil.liilIIiIil;

   public static int IilliliilIIi(boolean finalCleanup, int candidates) {
      return finalCleanup ? candidates : Math.min(candidates, 4);
   }

   public static boolean iIlIlllllill(int maxSafeDrop, int finalCleanup, int chainMinY, int feetY, int topY, boolean workAtOrAboveExit, boolean surfaceSize) {
      if (surfaceSize || !workAtOrAboveExit) {
         return false;
      } else if (feetY < 9) {
         return false;
      } else {
         return maxSafeDrop < finalCleanup ? false : maxSafeDrop - chainMinY > topY + 1;
      }
   }

   public static iiIlIlilIIllIlil lIiiIiIlilli(boolean retriesLeft, boolean tempDebtBlocked) {
      if (retriesLeft) {
         return ilIlIiIill;
      } else {
         return tempDebtBlocked ? iiIlIlilIIllIlil.iiilIIiIil : iiIlIlilIIllIlil.IIIiIIiIil;
      }
   }

   public static int IliIlllilIi(int cap, int baseHighValue, int liveTemp) {
      long var4 = 2767620927628529891L;
      var4 ^= ((long)Math.max(0, cap - baseHighValue) << 32 ^ var4) & -1L << 32;
      return liveTemp + ((int)(var4 >>> 32) + 1) / 2;
   }

   public static boolean liiiIIllIl(int cap, int liveTemp, boolean towerNearRemainingWork) {
      return !towerNearRemainingWork || cap >= 2 * liveTemp;
   }

   private lIlllllliIllllll() {
   }
}
