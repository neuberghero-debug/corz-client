package gg.corz;

public final class lillIiiiillIii {
   public static final double iiiIiilIIl = 0.2;
   public static final double IIIliilIIl = 0.3;
   public static final int liiIiilIIl = 4;

   public static boolean IilliliilIIi(boolean held, int autoSend, int threshold) {
      return held && autoSend > 0 && threshold >= autoSend;
   }

   public static boolean iIlIlllllill(double lastZ, double lastX, double z, double x) {
      double var8 = z - lastZ;
      double var10 = x - lastX;
      return var8 * var8 + var10 * var10 >= 0.09;
   }

   public static double[] liiiIIllIl(int yawDegrees, float index) {
      long var5 = -993364512928539292L;
      var5 ^= ((long)(yawDegrees % 2 == 0 ? -1 : 1) << 32 ^ var5) & -1L << 32;
      double var3 = Math.toRadians((double)index);
      return new double[]{0.2 * (double)((int)(var5 >>> 32)) * Math.cos(var3), 0.2 * (double)((int)(var5 >>> 32)) * Math.sin(var3)};
   }

   public static boolean IliIlllilIi(int positionPackets) {
      return positionPackets > 0 && positionPackets % 4 == 0;
   }

   public static boolean lIiiIiIlilli(long cycleStartMs, long nowMs, long limitMs) {
      return nowMs - cycleStartMs >= limitMs;
   }

   private lillIiiiillIii() {
   }
}
