package gg.corz;

public final class Iillllillillllil {
   private static final float IiIIliiIil = 1.0E-4F;
   private static final double ilIIliiIil = 1.0 / Math.sqrt(2.0);
   private static final double llIIliiIil = 0.05;
   private static final double IlIIliiIil = 1.0E-6;

   private static float iIlIlllllill(boolean b, boolean a) {
      return b == a ? 0.0F : (b ? 1.0F : -1.0F);
   }

   private static boolean IilliliilIIi(int[] c) {
      long var3 = -3330608357564842552L;
      if (c != null && c.length >= 2) {
         var3 ^= ((long)c[0] << 32 ^ var3) & -1L << 32;
         var3 ^= ((long)c[1] ^ var3) & -1L >>> 32;
         return (int)(var3 >>> 32) >= -1 && (int)(var3 >>> 32) <= 1 && (int)var3 >= -1 && (int)var3 <= 1 && ((int)(var3 >>> 32) != 0 || (int)var3 != 0);
      } else {
         return false;
      }
   }

   private static double lIiiIiIlilli(int uf, int ul, double s, double f) {
      double var6 = uf != 0 && ul != 0 ? ilIIliiIil : 1.0;
      return ((double)uf * s + (double)ul * f) * var6;
   }

   public static float[] liiiIIllIl(liIiIIiiiIiIIi k) {
      if (k == null) {
         return new float[]{0.0F, 0.0F};
      } else {
         float var1 = iIlIlllllill(k.iIlIlllllill(), k.IilliliilIIi());
         float var2 = iIlIlllllill(k.IliIlllilIi(), k.liiiIIllIl());
         float var3 = (float)Math.sqrt((double)(var1 * var1 + var2 * var2));
         return var3 < 1.0E-4F ? new float[]{0.0F, 0.0F} : new float[]{var1 / var3, var2 / var3};
      }
   }

   public static int[] IliIlllilIi(double yaw, double worldX, float worldZ, int[] previous) {
      long var32 = 6391491538368802037L;
      long var30 = 22524626323341952L;
      double var6 = Math.toRadians((double)worldZ);
      double var8 = Math.sin(var6);
      double var10 = Math.cos(var6);
      double var12 = -yaw * var8 + worldX * var10;
      double var14 = yaw * var10 + worldX * var8;
      double var16 = Math.hypot(var14, var12);
      if (var16 >= 1.0E-6 && !Double.isInfinite(var16)) {
         double var18 = var14 / var16;
         double var20 = var12 / var16;
         var30 ^= (0L ^ var30) & -1L << 32;
         var30 ^= (0L ^ var30) & -1L >>> 32;
         double var24 = -Double.MAX_VALUE;
         var32 ^= (-4294967296L ^ var32) & -1L << 32;

         while ((int)(var32 >>> 32) <= 1) {
            for (var32 ^= ~var32 & -1L >>> 32; (int)var32 <= 1; var32 ^= (var32 ^ var32 + (long)1) & -1L >>> 32) {
               if ((int)(var32 >>> 32) != 0 || (int)var32 != 0) {
                  double var28 = lIiiIiIlilli((int)var32, (int)(var32 >>> 32), var18, var20);
                  if (var28 > var24) {
                     var24 = var28;
                     var30 ^= ((long)((int)var32) << 32 ^ var30) & -1L << 32;
                     var30 ^= ((long)((int)(var32 >>> 32)) ^ var30) & -1L >>> 32;
                  }
               }
            }

            var32 += 4294967296L;
         }

         return IilliliilIIi(previous) && lIiiIiIlilli(previous[0], previous[1], var18, var20) >= var24 - 0.05
            ? new int[]{previous[0], previous[1]}
            : new int[]{(int)(var30 >>> 32), (int)var30};
      } else {
         return new int[]{0, 0};
      }
   }

   private Iillllillillllil() {
   }
}
