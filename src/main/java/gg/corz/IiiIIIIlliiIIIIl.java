package gg.corz;

public final class IiiIIIIlliiIIIIl {
   public static double iIlIlllllill(double current, double rate, double target, double dt) {
      if (dt <= 0.0) {
         return current;
      } else {
         return target <= 0.0 ? rate : current + (rate - current) * (1.0 - Math.exp(-target * dt));
      }
   }

   public static double IliIlllilIi(double t, double a, double b) {
      return t + (a - t) * b;
   }

   private IiiIIIIlliiIIIIl() {
   }

   public static double liiiIIllIl(double lo, double v, double hi) {
      return lo < v ? v : (lo > hi ? hi : lo);
   }
}
