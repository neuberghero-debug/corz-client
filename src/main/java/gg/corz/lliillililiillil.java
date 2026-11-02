package gg.corz;

public final class lliillililiillil {
   public static double IliIlllilIi(double degrees) {
      double var2 = degrees % 360.0;
      if (var2 >= 180.0) {
         var2 -= 360.0;
      }

      if (var2 < -180.0) {
         var2 += 360.0;
      }

      return var2;
   }

   public static double liiiIIllIl(double dx, double dz) {
      return Math.toDegrees(Math.atan2(-dx, dz));
   }

   public static double iliIiiliiiii(double b, double f, double a) {
      return f + b * (a - f);
   }

   public static double lIiiIiIlilli(double v, double lo, double hi) {
      return v < lo ? lo : (v > hi ? hi : v);
   }

   private lliillililiillil() {
   }

   public static double IIIllIIliIIl(double edge1, double x, double edge0) {
      double var6 = lIiiIiIlilli((edge0 - edge1) / (x - edge1), 0.0, 1.0);
      return var6 * var6 * (3.0 - 2.0 * var6);
   }

   public static double iIlIlllllill(double dy, double horizontal) {
      return -Math.toDegrees(Math.atan2(dy, Math.max(horizontal, 1.0E-4)));
   }

   public static double IilliliilIIi(double viewYaw, double dx, double dz) {
      return IliIlllilIi(liiiIIllIl(dx, dz) - viewYaw);
   }
}
