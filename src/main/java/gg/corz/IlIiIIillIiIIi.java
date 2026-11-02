package gg.corz;

public final class IlIiIIillIiIIi {
   public static final double illIiiiliIilIiiili = 0.3;
   public static final double IIiIiiililIiIiiili = 0.19;
   public static final int lliIiiiliiliIiiili = 20;
   public static final int iIiIiiiliIliIiiili = 10;
   public static final double lilIiiiliiilIiiili = 0.01;

   public static double IilliliilIIi(double c, int v) {
      double var3 = IliIlllilIi(v);
      double var5 = liiiIIllIl(v);
      return c < var3 ? var3 : (c > var5 ? var5 : c);
   }

   public static double iliIiiliiiii(double cz, double cx, int x, int z) {
      return Math.hypot(lIiiIiIlilli(cz, x), lIiiIiIlilli(cx, z));
   }

   public static double IliIlllilIi(int c) {
      return (double)c + 0.3 + 0.01;
   }

   public static double lIiiIiIlilli(double c, int v) {
      double var3 = IliIlllilIi(v);
      double var5 = liiiIIllIl(v);
      return c < var3 ? var3 - c : (c > var5 ? c - var5 : 0.0);
   }

   public static double liiiIIllIl(int c) {
      return (double)c + 1.0 - 0.3 - 0.01;
   }

   private IlIiIIillIiIIi() {
   }

   public static iilliIilIIiliIil IIIllIIliIIl(int cx, int cz) {
      return iilliIilIIiliIil.IliIlllilIi((double)cx + 0.5, (double)cz + 0.5, 0.19);
   }

   public static boolean iIlIlllllill(double cx, double x, int z, int cz) {
      return cx >= IliIlllilIi(z) && cx <= liiiIIllIl(z) && x >= IliIlllilIi(cz) && x <= liiiIIllIl(cz);
   }
}
