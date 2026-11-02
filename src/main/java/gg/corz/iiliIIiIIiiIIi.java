package gg.corz;

public final class iiliIIiIIiiIIi {
   private static final int lillIIIiiiillIIIii = 10000;
   private static final double illlIIIiiIillIIIii = 1000000.0;
   private static final double iiIlIIIiiIIllIIIii = 8.0;
   private static final double IlllIIIiillllIIIii = 20.0;
   private static final double IiIlIIIiiliIlIIIii = 0.8;
   private static final double lIllIIIiiiIllIIIii = 25.0;

   public static double IliIlllilIi(double dealt, double taken, int kill, int death, boolean popsTaken, boolean popsDealt) {
      double var8 = liiiIIllIl(dealt)
         - 0.8 * liiiIIllIl(taken)
         + 8.0 * (double)iIlIlllllill(kill)
         - 8.0 * (double)iIlIlllllill(death)
         + (popsTaken ? 25.0 : 0.0)
         - (popsDealt ? 25.0 : 0.0);
      return Math.tanh(var8 / 20.0);
   }

   private static int iIlIlllllill(int v) {
      return Math.max(0, Math.min(10000, v));
   }

   private iiliIIiIIiiIIi() {
   }

   private static double liiiIIllIl(double v) {
      return Double.isNaN(v) ? 0.0 : IiIIIlliIIIl.IIiilIiiiIii(v, 0.0, 1000000.0);
   }
}
