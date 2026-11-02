package gg.corz;

public final class IIIIlilIIIli {
   static final int[] iIIlilIIlIlIlilIIl = new int[]{11, -7, 27, 9, -64, -109, 77, 150, -74, 364};
   public static final double liiIilIIliiiIilIIl = 4.905;
   static final int[] llIlilIIlilIlilIIl = new int[]{5, 18, -14, 47, -38, 40, -132, 150, -277, 64};
   public static final double IIIlilIIllIIlilIIl = 2.5;
   public static final int IliIilIIllliIilIIl = 256;
   static final float[] IiIlilIIlliIlilIIl = new float[]{0.16F, 0.14F, 0.12F, 0.1F, 0.085F, 0.07F, 0.06F, 0.05F, 0.04F, 0.032F};
   private static final double[] lIllilIIliIllilIIl = new double[10];
   private static final double iiIlilIIlIIllilIIl = Math.PI * 2;
   public static final int iliIilIIlIiiIilIIl = 10;

   public static double iIlIlllllill(int i) {
      return lIllilIIliIllilIIl[i];
   }

   public static int IIIllIIliIIl(int worldBlock) {
      return Math.floorMod(worldBlock, 256);
   }

   static {
      long var1 = 6234308434566147893L;

      for (long var3 = var1 ^ (0L ^ var1) & -1L << 32; (int)(var3 >>> 32) < 10; var3 += 4294967296L) {
         lIllilIIliIllilIIl[(int)(var3 >>> 32)] = Math.sqrt(4.905 * IliIlllilIi((int)(var3 >>> 32)));
      }
   }

   public static void IilliliilIIi(double seconds, float[] out) {
      long var6 = 175741929575780382L;

      for (long var8 = var6 ^ (0L ^ var6) & -1L << 32; (int)(var8 >>> 32) < 10; var8 += 4294967296L) {
         double var4 = lIllilIIliIllilIIl[(int)(var8 >>> 32)] * seconds % (Math.PI * 2);
         if (var4 < 0.0) {
            var4 += Math.PI * 2;
         }

         out[(int)(var8 >>> 32)] = (float)var4;
      }
   }

   public static double IliIlllilIi(int i) {
      return 0.02454369260617026 * Math.hypot((double)iIIlilIIlIlIlilIIl[i], (double)llIlilIIlilIlilIIl[i]);
   }

   private IIIIlilIIIli() {
   }

   public static double liiiIIllIl(int i) {
      return (Math.PI * 2) / IliIlllilIi(i);
   }

   public static float iliIiiliiiii(double seconds, double x, double z) {
      long var15 = 6645797174237132086L;
      double var6 = 0.0;

      for (long var17 = var15 ^ (0L ^ var15) & -1L << 32; (int)(var17 >>> 32) < 10; var17 += 4294967296L) {
         double var9 = 0.02454369260617026 * (double)iIIlilIIlIlIlilIIl[(int)(var17 >>> 32)];
         double var11 = 0.02454369260617026 * (double)llIlilIIlilIlilIIl[(int)(var17 >>> 32)];
         double var13 = var9 * seconds + var11 * x - lIllilIIliIllilIIl[(int)(var17 >>> 32)] * z;
         var6 += (double)IiIlilIIlliIlilIIl[(int)(var17 >>> 32)] / IliIlllilIi((int)(var17 >>> 32)) * Math.exp(Math.sin(var13) - 1.0);
      }

      return (float)var6;
   }

   public static float lIiiIiIlilli(double seconds) {
      double var2 = seconds / 2.5 % 1.0;
      if (var2 < 0.0) {
         var2++;
      }

      return (float)var2;
   }
}
