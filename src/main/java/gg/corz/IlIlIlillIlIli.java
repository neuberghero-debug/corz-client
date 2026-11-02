package gg.corz;

public final class IlIlIlillIlIli {
   public static final double iIilIIIIIl = -0.8;
   public static final double lIilIIIIIl = 1.5;
   public static final double IIilIIIIIl = 3.0;
   public static final double IillIIIIIl = 0.4;
   public static final double lillIIIIIl = -4.0;
   public static final double illlIIIIIl = 3.0;
   public static final double IlllIIIIIl = 2.0;
   public static final double iillIIIIIl = -5.0;
   public static final double llllIIIIIl = 6.0;
   public static final double iIllIIIIIl = 3.0;

   private IlIlIlillIlIli() {
   }

   public static double liiiIIllIl(double d, double max, double min) {
      if (Double.isNaN(d)) {
         return Double.POSITIVE_INFINITY;
      } else if (d < max) {
         return (max - d) * 3.0;
      } else {
         return d > min ? (d - min) * 2.0 : 0.0;
      }
   }

   public static double IliIlllilIi(
      double w,
      double offense,
      double dy,
      int bandMin,
      double nearCurrent,
      double distToTarget,
      double holeBonus,
      int threat,
      double bandMax,
      double defensive,
      boolean hazard,
      lilliIiiilliIi jumps,
      boolean pathTicks
   ) {
      if (jumps == null) {
         return Double.NEGATIVE_INFINITY;
      } else {
         double var21 = (double)jumps.liiiIIllIl() * w
            - (double)jumps.IilliliilIIi() * offense
            - (double)jumps.lIiiIiIlilli() * (dy + 6.0 * (double)Math.max(0, bandMin))
            - (double)jumps.iliIiiliiiii() * liiiIIllIl(nearCurrent, distToTarget, holeBonus)
            + (double)jumps.IIIllIIliIIl() * iIlIlllllill(threat)
            - (double)jumps.IlIlllIlilIl() * bandMax
            + (pathTicks ? 3.0 * (double)jumps.IilliliilIIi() : 3.0) * defensive
            + (hazard ? 0.4 : 0.0);
         return Double.isNaN(var21) ? Double.NEGATIVE_INFINITY : var21;
      }
   }

   public static double iIlIlllllill(int dy) {
      if (dy == 1) {
         return -4.0;
      } else if (dy >= 2) {
         return -5.0;
      } else if (dy == -1) {
         return 3.0;
      } else if (dy == -2) {
         return 1.5;
      } else {
         return dy <= -3 ? -0.8 : 0.0;
      }
   }
}
