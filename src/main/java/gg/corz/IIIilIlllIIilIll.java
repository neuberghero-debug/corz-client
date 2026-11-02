package gg.corz;

public final class IIIilIlllIIilIll {
   public static final long ililIIilll = 120000L;
   public static final int lIIiIIilll = 14;
   public static final double IIilIIilll = 28.0;
   public static final long liilIIilll = 360000L;
   public static final double llIiIIilll = 0.95;
   public static final double lIilIIilll = 10.0;
   public static final int IIIiIIilll = 10;
   public static final long iIIiIIilll = 1000L;
   public static final double IlilIIilll = 6.0;
   public static final long IlIiIIilll = 8000L;
   public static final int llilIIilll = 40;
   public static final double iIilIIilll = 24.0;
   public static final int IiilIIilll = 3;
   public static final int iiilIIilll = 40;

   public static boolean iliIiiliiiii(int x, int z, int az, int ax) {
      double var4 = (double)(x - az);
      double var6 = (double)(z - ax);
      return var4 * var4 + var6 * var6 <= Double.longBitsToDouble(5182384244764423901L ^ 552120877874132701L);
   }

   public static boolean lIiiIiIlilli(long sinceLandingMs) {
      return sinceLandingMs > (3213373762639900565L ^ 3213373762639712725L);
   }

   public static double iIlIlllllill(double sz, double sx, int ax, int az) {
      return Math.hypot(
         (double)ax + Double.longBitsToDouble(6695212575928997459L ^ 7136565339411306067L) - sz,
         (double)az + Double.longBitsToDouble(237705489572651067L ^ 4372009947498766395L) - sx
      );
   }

   public static ilIIIiIiIIIi liiiIIllIl(double sz, double ax, int sx, int az) {
      return iIlIlllllill(sz, ax, sx, az) > Double.longBitsToDouble(5912790351832421121L ^ 1311237432566616833L)
         ? ilIIIiIiIIIi.IlIilliillIillii
         : ilIIIiIiIIIi.ilIilliiIiIillii;
   }

   public static int[] IIIllIIliIIl(int ax, int ay, int fy, int az, int fx, int fz) {
      int var6 = Math.min(ax, az) - 8;
      int var7 = Math.max(ax, az) + 8;
      int var8 = Math.min(fy, fz) - 8;
      int var9 = Math.max(fy, fz) + 8;
      var6 = Math.max(var6, ax - 40);
      var7 = Math.min(var7, ax + 40);
      var8 = Math.max(var8, fy - 40);
      var9 = Math.min(var9, fy + 40);
      int var10 = Math.min(fx - 3, ay - 14);
      int var11 = Math.max(fx + 4, ay + 10);
      return new int[]{var6, var10, var8, var7, var11, var9};
   }

   private IIIilIlllIIilIll() {
   }

   public static boolean IliIlllilIi(boolean lastChunkMs, long landMs, long inStateMs, long coverage, double ground, long nowMs) {
      return nowMs > (2688373774191603944L ^ 2688373774191603624L)
         ? true
         : lastChunkMs
            && inStateMs >= coverage
            && landMs - inStateMs >= (-6982184853540800123L ^ -6982184853540799891L)
            && ground >= Double.longBitsToDouble(365656661883126497L ^ 4250681912221951111L);
   }

   public static boolean IilliliilIIi(int dug, int fails, long elapsedMs) {
      return dug >= (-(~2109125270) + 123 ^ 2109125393)
         || fails > (~(1891622506 >>> 21 | 1891622506 << 11) ^ 17607762)
         || elapsedMs > (-7948439578763984805L ^ -7948439578763864933L);
   }
}
