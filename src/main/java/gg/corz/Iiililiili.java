package gg.corz;

public final class Iiililiili {
   public static final float iiIlIlIlIIllIlIl = 0.0F;
   public static final float IiIlIlIlliIlIlIl = -1.0F;
   public static final float iIIlIlIlIlIlIlIl = 0.8888889F;
   public static final float llIlIlIlilIlIlIl = 0.001F;

   public static float liiiIIllIl(float diagonal, float origin, float northSouth, float eastWest) {
      if (!(northSouth >= 1.0F) && !(origin >= 1.0F)) {
         float var4 = 0.0F;
         float var5 = 0.0F;
         if (northSouth > 0.0F || origin > 0.0F) {
            if (eastWest >= 1.0F) {
               return 1.0F;
            }

            if (eastWest >= 0.8F) {
               var4 += eastWest * 10.0F;
               var5 += 10.0F;
            } else if (eastWest >= 0.0F) {
               var4 += eastWest;
               var5++;
            }
         }

         if (diagonal >= 0.8F) {
            var4 += diagonal * 10.0F;
            var5 += 10.0F;
         } else if (diagonal >= 0.0F) {
            var4 += diagonal;
            var5++;
         }

         if (northSouth >= 0.8F) {
            var4 += northSouth * 10.0F;
            var5 += 10.0F;
         } else if (northSouth >= 0.0F) {
            var4 += northSouth;
            var5++;
         }

         if (origin >= 0.8F) {
            var4 += origin * 10.0F;
            var5 += 10.0F;
         } else if (origin >= 0.0F) {
            var4 += origin;
            var5++;
         }

         return var4 / var5;
      } else {
         return 1.0F;
      }
   }

   public static float IliIlllilIi(boolean waterAbove, boolean fluidHeight, float solid, boolean water) {
      if (waterAbove) {
         return fluidHeight ? 1.0F : solid;
      } else {
         return water ? -1.0F : 0.0F;
      }
   }

   private Iiililiili() {
   }

   public static boolean IilliliilIIi(float[] c) {
      return c[0] == c[1] && c[1] == c[2] && c[2] == c[3];
   }

   public static void iIlIlllllill(float[] index, int stride, int grid, float[] out) {
      float var4 = index[grid];
      if (var4 >= 1.0F) {
         out[0] = out[1] = out[2] = out[3] = 1.0F;
      } else {
         float var5 = index[grid - stride];
         float var6 = index[grid + stride];
         float var7 = index[grid + 1];
         float var8 = index[grid - 1];
         out[0] = liiiIIllIl(var4, var5, var8, index[grid - stride - 1]);
         out[1] = liiiIIllIl(var4, var6, var8, index[grid + stride - 1]);
         out[2] = liiiIIllIl(var4, var6, var7, index[grid + stride + 1]);
         out[3] = liiiIIllIl(var4, var5, var7, index[grid - stride + 1]);
      }
   }

   public static float lIiiIiIlilli(float[] c) {
      return Math.min(Math.min(c[0], c[1]), Math.min(c[2], c[3]));
   }
}
