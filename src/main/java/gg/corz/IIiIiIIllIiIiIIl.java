package gg.corz;

public final class IIiIiIIllIiIiIIl {
   private static float IIlIlIilIl;
   private static int llIIlIilIl;
   public static final int iiiiIIilIl = 50;
   private static long liIIlIilIl;
   private static int IlIIlIilIl = -1;
   private static int iiIIlIilIl;
   private static long ilIIlIilIl;
   private static final float[] iIIIlIilIl = new float[~((-1667643842 - -17) * -79) ^ 1400123936];
   public static final int IIIIlIilIl = 64;
   private static long IiIIlIilIl;
   public static final long liiiIIilIl = 100000000L;
   private static final long lIIIlIilIl = 2000000000L;

   public static float lIiiIiIlilli() {
      if (iiIIlIilIl > 0 && liIIlIilIl > (-2033932652079617356L ^ -2033932652079617356L)) {
         return (float)iiIIlIilIl * 1.0E9F / (float)liIIlIilIl;
      } else {
         return llIIlIilIl > 0 ? IilliliilIIi(0) : IIlIlIilIl;
      }
   }

   public static int iIlIlllllill() {
      return llIIlIilIl;
   }

   private static void liiiIIllIl(float fps) {
      IlIIlIilIl = (IlIIlIilIl + 1) % (1753593571 + 3 ^ -27 ^ -1753593533);
      iIIIlIilIl[IlIIlIilIl] = fps;
      if (llIIlIilIl < ((-628371892 - -49) * 1047552999 * -25 ^ -173642899)) {
         llIIlIilIl++;
      }
   }

   public static void IliIlllilIi() {
      long var0 = System.nanoTime();
      if (ilIIlIilIl == 0L) {
         ilIIlIilIl = var0;
         IiIIlIilIl = var0 + 100000000L;
      } else {
         long var2 = Math.max(1L, var0 - ilIIlIilIl);
         ilIIlIilIl = var0;
         IIlIlIilIl = 1.0E9F / (float)var2;
         if (var2 <= 2000000000L) {
            iiIIlIilIl++;

            for (liIIlIilIl += var2; var0 >= IiIIlIilIl; IiIIlIilIl += 100000000L) {
               liiiIIllIl(iiIIlIilIl > 0 ? (float)iiIIlIilIl * 1.0E9F / (float)Math.max(1L, liIIlIilIl) : IIlIlIilIl);
               iiIIlIilIl = 0;
               liIIlIilIl = 0L;
            }
         } else {
            float var4 = 1.0E9F / (float)var2;

            for (int var5 = 0; var5 < 50; var5++) {
               liiiIIllIl(var4);
            }

            iiIIlIilIl = 0;
            liIIlIilIl = 0L;
            IiIIlIilIl = var0 + 100000000L;
         }
      }
   }

   public static float IilliliilIIi(int i) {
      if (llIIlIilIl == 0) {
         return 0.0F;
      } else {
         i = Math.min(i, llIIlIilIl - 1);
         return iIIIlIilIl[(
               (IlIIlIilIl - i) % ((1753464283 * -57 * -35 << 15 | 1753464283 * -57 * -35 >>> 17) - -125 ^ 1154792849)
                  + (-((1385643014 >>> 7 | 1385643014 << 25) ^ -89) ^ 212151905)
            )
            % ((983030848 * -15 * 1455319497 >>> 17 | 983030848 * -15 * 1455319497 << 15) + 53 ^ -1524625172)];
      }
   }

   private IIiIiIIllIiIiIIl() {
   }

   public static float IIIllIIliIIl(int buckets) {
      int var1 = Math.min(buckets, llIIlIilIl);
      if (var1 == 0) {
         return lIiiIiIlilli();
      } else {
         float var2 = 0.0F;

         for (int var3 = 0; var3 < var1; var3++) {
            var2 += IilliliilIIi(var3);
         }

         return var2 / (float)var1;
      }
   }

   public static float iliIiiliiiii() {
      if (ilIIlIilIl == (4730161592082586450L ^ 4730161592082586450L)) {
         return 0.0F;
      } else {
         float var0 = 1.0F - (float)(IiIIlIilIl - System.nanoTime()) / 1.0E8F;
         return var0 < 0.0F ? 0.0F : (var0 > 1.0F ? 1.0F : var0);
      }
   }
}
