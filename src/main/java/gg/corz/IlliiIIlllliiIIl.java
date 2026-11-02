package gg.corz;

public final class IlliiIIlllliiIIl {
   private static final double liliIlilIl = 0.3;
   private static final double iiliIlilIl = 0.6;

   public static double IliIlllilIi(double distanceToTargetCentre) {
      return !(distanceToTargetCentre > 0.0) ? 90.0 : Math.toDegrees(Math.atan(0.3 / distanceToTargetCentre));
   }

   public static float iIlIlllllill(double dx, double dz) {
      return (float)Math.toDegrees(Math.atan2(-dx, dz));
   }

   public static double[] IilliliilIIi(double uz, double targetX, double r, double targetZ, double ux) {
      return new double[]{uz - r * ux, targetX - targetZ * ux};
   }

   public static double liiiIIllIl(double distanceToTargetCentre) {
      return Math.min(5.0, 0.6 * IliIlllilIi(distanceToTargetCentre));
   }

   public static double[] lIiiIiIlilli(double targetZ, double uz, double targetX, double b, double ux) {
      return new double[]{targetZ + targetX * ux, uz + b * ux};
   }

   private IlliiIIlllliiIIl() {
   }
}
