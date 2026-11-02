package gg.corz;

public final class lIlIlIIiiIlIlIIi {
   public static double IliIlllilIi(double feetZ, double feetY, double pz, double px, double halfWidth, double py, double height, double feetX) {
      double var16 = liiiIIllIl(feetZ, px - height, px + height);
      double var18 = liiiIIllIl(feetY, halfWidth, halfWidth + feetX);
      double var20 = liiiIIllIl(pz, py - height, py + height);
      double var22 = feetZ - var16;
      double var24 = feetY - var18;
      double var26 = pz - var20;
      return Math.sqrt(var22 * var22 + var24 * var24 + var26 * var26);
   }

   static double liiiIIllIl(double hi, double lo, double v) {
      return hi < lo ? lo : Math.min(hi, v);
   }

   private lIlIlIIiiIlIlIIi() {
   }
}
