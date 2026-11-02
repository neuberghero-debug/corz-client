package gg.corz;

public final class iIlliIIlIllliIIl {
   public static final float lliilIilIl = 0.8F;
   public static final float iliilIilIl = 0.6F;
   public static final int lIiilIilIl = 3;
   public static final float[] IIiilIilIl = new float[]{0.58F, 0.72F, 0.86F, 1.0F};
   private static final float[] IiiilIilIl = new float[]{0.5F, 1.0F, 0.8F, 0.8F, 0.6F, 0.6F};
   public static final float IliilIilIl = 1.0F;
   public static final float iIiilIilIl = 0.5F;

   public static float lIiiIiIlilli(int directionIndex) {
      return directionIndex >= 0 && directionIndex < IiiilIilIl.length ? IiiilIilIl[directionIndex] : 1.0F;
   }

   public static int IilliliilIIi(float local) {
      return local < 0.5F ? -1 : 1;
   }

   public static float liiiIIllIl(int level) {
      return IIiilIilIl[level < 0 ? 0 : (level > 3 ? 3 : level)];
   }

   public static boolean iIlIlllllill(int a1, int a2, int a0, int a3) {
      return a1 + a0 < a2 + a3;
   }

   private iIlliIIlIllliIIl() {
   }

   private static int IIIllIIliIIl(int c, float k) {
      long var3 = -3479912625783647106L;
      var3 ^= ((long)Math.round((float)c * k) << 32 ^ var3) & -1L << 32;
      return (int)(var3 >>> 32) < 0 ? 0 : ((int)(var3 >>> 32) > 255 ? 255 : (int)(var3 >>> 32));
   }

   public static int iliIiiliiiii(int rgb, float k) {
      long var5 = -48211384221922893L;
      long var7 = -7960886494673429209L;
      var5 ^= ((long)IIIllIIliIIl(rgb >> 16 & 0xFF, k) << 32 ^ var5) & -1L << 32;
      var5 ^= ((long)IIIllIIliIIl(rgb >> 8 & 0xFF, k) ^ var5) & -1L >>> 32;
      var7 ^= ((long)IIIllIIliIIl(rgb & 0xFF, k) << 32 ^ var7) & -1L << 32;
      return (int)(var5 >>> 32) << 16 | (int)var5 << 8 | (int)(var7 >>> 32);
   }

   public static int IliIlllilIi(boolean side2, boolean corner, boolean side1) {
      return side2 && corner ? 0 : 3 - (side2 ? 1 : 0) - (corner ? 1 : 0) - (side1 ? 1 : 0);
   }
}
