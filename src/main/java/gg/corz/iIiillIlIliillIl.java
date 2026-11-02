package gg.corz;

public final class iIiillIlIliillIl {
   public static double iIlIlllllill(double x1, double x0, double t) {
      return x1 + (x0 - x1) * IliIlllilIi(t);
   }

   private iIiillIlIliillIl() {
   }

   public static double lIiiIiIlilli(long durationMs, long elapsedMs) {
      if (elapsedMs <= 0L) {
         return 1.0;
      } else {
         double var4 = (double)durationMs / (double)elapsedMs;
         return var4 < 0.0 ? 0.0 : (var4 > 1.0 ? 1.0 : var4);
      }
   }

   public static long liiiIIllIl(double maxMs, double speed, long distancePx, long minMs) {
      double var8 = speed <= 0.0 ? 1.0 : speed;
      long var10 = Math.round(maxMs / var8 * 6.0);
      return Math.max(distancePx, Math.min(minMs, var10));
   }

   public static double IilliliilIIi(double y0, double t, double y1) {
      return y0 + (t - y0) * IliIlllilIi(y1);
   }

   public static double IliIlllilIi(double t) {
      t = t < 0.0 ? 0.0 : (t > 1.0 ? 1.0 : t);
      return t * t * (3.0 - 2.0 * t);
   }
}
