package gg.corz;

public final class llIiIiililIiIiil {
   public static final int[] iiilIIilil = new int[]{0, 1, -1, -2, 2, -3};
   public static final int[] IiilIIilil = new int[]{0, 1};
   public static final int[] liilIIilil = new int[]{-1, -2, 2, -3};
   private static final double ililIIilil = 0.001;
   public static final double llilIIilil = 0.26;

   public static int IIlllIlliIll(long packed) {
      return (int)(packed << 52 >> 52);
   }

   private llIiIiililIiIiil() {
   }

   private static int iliIiiliiiii(double v) {
      return (int)Math.floor(v);
   }

   public static int Illlllllilll(long packed) {
      return (int)(packed << 26 >> 38);
   }

   public static String IlIlllIlilIl(long packed) {
      return IiIlliIliiIl(packed)
         + Iilllilliill<"Iilllilliill","g1uxGzbe9DhIxxDWQjYwHpxT3JUz1BcvOd+0YcSA">()
         + IIlllIlliIll(packed)
         + Iilllilliill<"Iilllilliill","g1uxGzbe9DhIxxDWQjYwHpxT3JUz1BcvOd+0YcSA">()
         + Illlllllilll(packed);
   }

   public static long IIIllIIliIIl(int y, int x, int z) {
      return ((long)y & 67108863L) << 38 | ((long)z & 67108863L) << 12 | (long)x & 4095L;
   }

   public static int IilliliilIIi(double z, double y, double tops, IIillIIllIillIIl x) {
      long var12 = 8517058908439161543L;
      long var14 = 3577435800329210892L;
      var12 ^= ((long)iliIiiliiiii(z) << 32 ^ var12) & -1L << 32;
      var12 ^= ((long)iliIiiliiiii(y) ^ var12) & -1L >>> 32;
      var14 ^= ((long)iliIiiliiiii(tops) << 32 ^ var14) & -1L << 32;
      double var10 = x.top((int)(var12 >>> 32), (int)var12, (int)(var14 >>> 32));
      return var10 > 0.26 && y - (double)((int)var12) >= var10 - 0.001 ? (int)var12 + 1 : (int)var12;
   }

   public static boolean lIiiIiIlilli(double cellY, double cellZ, double y, int tops, int x, int cellX, IIillIIllIillIIl z) {
      return iliIiiliiiii(cellY) == tops && iliIiiliiiii(y) == cellX && IilliliilIIi(cellY, cellZ, y, z) == x;
   }

   public static boolean IliIlllilIi(int targetY, int feetY) {
      return targetY == feetY || targetY == feetY + 1;
   }

   public static long iIlIlllllill(double tops, double y, double z, IIillIIllIillIIl x) {
      long var10 = 8083112010825605244L;
      long var12 = 3430822854631642495L;
      var10 ^= ((long)iliIiiliiiii(tops) << 32 ^ var10) & -1L << 32;
      var10 ^= ((long)iliIiiliiiii(z) ^ var10) & -1L >>> 32;
      var12 ^= ((long)IilliliilIIi(tops, y, z, x) << 32 ^ var12) & -1L << 32;
      return IIIllIIliIIl((int)(var10 >>> 32), (int)(var12 >>> 32), (int)var10);
   }

   public static int IiIlliIliiIl(long packed) {
      return (int)(packed << 0 >> 38);
   }

   public static int liiiIIllIl(int feetY, int targetY) {
      return IliIlllilIi(feetY, targetY) ? 0 : (feetY == targetY - 1 ? 1 : 2);
   }
}
