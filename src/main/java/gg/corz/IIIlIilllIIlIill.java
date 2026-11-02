package gg.corz;

final class IIIlIilllIIlIill {
   static boolean IliIlllilIi(double speed, int moved, double gapTicks) {
      long var8 = -705268270820747786L;
      var8 ^= ((long)Math.max(1, moved) << 32 ^ var8) & -1L << 32;
      double var6 = Double.isFinite(gapTicks) ? Math.max(0.0, gapTicks) : 0.0;
      return speed > 2.0 + var6 * (double)((int)(var8 >>> 32)) + 0.04 * (double)((int)(var8 >>> 32)) * (double)((int)(var8 >>> 32));
   }

   private IIIlIilllIIlIill() {
   }
}
