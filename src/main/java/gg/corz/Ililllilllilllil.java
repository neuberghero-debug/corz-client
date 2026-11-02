package gg.corz;

public final class Ililllilllilllil {
   public static final int IIllliiIil = 20;

   public static lllilliillilli IliIlllilIi(
      int feetCell, boolean verticalSpeed, double onGround, long ticksUnknown, long certifiedStand, boolean improving, boolean standStillStandable
   ) {
      long var11 = 1322134967062365891L;
      var11 ^= ((long)liiIlIliiiIlIl.lIiiIiIlilli(verticalSpeed, onGround) << 32 ^ var11) & -1L << 32;
      if ((int)(var11 >>> 32) != 0) {
         if (certifiedStand == Long.MIN_VALUE) {
            return lllilliillilli.llIiliIIIl;
         } else if (!improving) {
            return ticksUnknown == certifiedStand ? lllilliillilli.ilIiliIIIl : lllilliillilli.llIiliIIIl;
         } else {
            return ticksUnknown != certifiedStand ? lllilliillilli.IlIiliIIIl : lllilliillilli.ilIiliIIIl;
         }
      } else {
         return feetCell < 20 && standStillStandable ? lllilliillilli.iIIiliIIIl : (feetCell < 20 ? lllilliillilli.iIIiliIIIl : lllilliillilli.ilIiliIIIl);
      }
   }

   private Ililllilllilllil() {
   }
}
