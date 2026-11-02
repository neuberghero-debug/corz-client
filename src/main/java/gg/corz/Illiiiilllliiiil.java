package gg.corz;

public final class Illiiiilllliiiil {
   public static final float liiIIiIiil = 0.016F;
   public static final int llllIiIiil = 6;
   public static final int llIlIiIiil = 312;
   public static final int llilIiIiil = 3;
   public static final int lIilIiIiil = 0;
   public static final int liIlIiIiil = 0;
   private static final int[] iIIiIiIiil = new int[12];
   public static final int iIIlIiIiil = 12;
   public static final float[][] IIIiIiIiil = new float[][]{
      {-4.0F, 24.0F, -4.0F, 4.0F, 32.0F, 4.0F, 0.0F, 0.0F, 8.0F, 8.0F, 8.0F},
      {-4.5F, 23.5F, -4.5F, 4.5F, 32.5F, 4.5F, 32.0F, 0.0F, 8.0F, 8.0F, 8.0F},
      {-4.0F, 12.0F, -2.0F, 4.0F, 24.0F, 2.0F, 16.0F, 16.0F, 8.0F, 12.0F, 4.0F},
      {-4.0F, 11.75F, -2.25F, 4.0F, 24.25F, 2.25F, 16.0F, 32.0F, 8.0F, 12.0F, 4.0F},
      {-8.0F, 12.0F, -2.0F, -4.0F, 24.0F, 2.0F, 40.0F, 16.0F, 4.0F, 12.0F, 4.0F},
      {-8.25F, 11.75F, -2.25F, -4.0F, 24.25F, 2.25F, 40.0F, 32.0F, 4.0F, 12.0F, 4.0F},
      {4.0F, 12.0F, -2.0F, 8.0F, 24.0F, 2.0F, 32.0F, 48.0F, 4.0F, 12.0F, 4.0F},
      {4.0F, 11.75F, -2.25F, 8.25F, 24.25F, 2.25F, 48.0F, 48.0F, 4.0F, 12.0F, 4.0F},
      {-3.9F, 0.0F, -2.0F, 0.0F, 12.0F, 2.0F, 0.0F, 16.0F, 4.0F, 12.0F, 4.0F},
      {-4.15F, -0.25F, -2.25F, 0.0F, 12.25F, 2.25F, 0.0F, 32.0F, 4.0F, 12.0F, 4.0F},
      {0.0F, 0.0F, -2.0F, 3.9F, 12.0F, 2.0F, 16.0F, 48.0F, 4.0F, 12.0F, 4.0F},
      {0.0F, -0.25F, -2.25F, 4.15F, 12.25F, 2.25F, 0.0F, 48.0F, 4.0F, 12.0F, 4.0F}
   };
   public static final int illlIiIiil = 7;
   public static final int iIllIiIiil = 4;
   public static final int IIIlIiIiil = 5;
   public static final int IlIlIiIiil = 7;
   public static final int IlilIiIiil = 2;
   public static final int lillIiIiil = 9;
   public static final int IlllIiIiil = 5;
   public static final int IIilIiIiil = 11;
   public static final float IiIlIiIiil = 32.5F;
   public static final int liilIiIiil = 4095;
   public static final int IillIiIiil = 8;
   public static final int IiilIiIiil = 5;
   public static final int iIilIiIiil = 1;
   public static final int ililIiIiil = 4;
   public static final float[][] lIIiIiIiil = new float[][]{
      IIIiIiIiil[0],
      IIIiIiIiil[1],
      IIIiIiIiil[2],
      IIIiIiIiil[3],
      {-7.0F, 12.0F, -2.0F, -4.0F, 24.0F, 2.0F, 40.0F, 16.0F, 3.0F, 12.0F, 4.0F},
      {-7.25F, 11.75F, -2.25F, -4.0F, 24.25F, 2.25F, 40.0F, 32.0F, 3.0F, 12.0F, 4.0F},
      {4.0F, 12.0F, -2.0F, 7.0F, 24.0F, 2.0F, 32.0F, 48.0F, 3.0F, 12.0F, 4.0F},
      {4.0F, 11.75F, -2.25F, 7.25F, 24.25F, 2.25F, 48.0F, 48.0F, 3.0F, 12.0F, 4.0F},
      IIIiIiIiil[8],
      IIIiIiIiil[9],
      IIIiIiIiil[10],
      IIIiIiIiil[11]
   };
   private static final float[] llIiIiIiil = iIlIlllllill(true);
   public static final int iiilIiIiil = 1365;
   public static final int iiiIIiIiil = 64;
   public static final float IiiIIiIiil = 0.05859375F;
   public static final int IIllIiIiil = 2;
   public static final float ilIlIiIiil = -0.25F;
   public static final int iillIiIiil = 10;
   public static final int iiIlIiIiil = 1;
   public static final int lIIlIiIiil = 6;
   private static final float[] IlIiIiIiil = iIlIlllllill(false);
   public static final int lIllIiIiil = 3;

   public static float[][] liiiIIllIl(boolean slim) {
      return slim ? lIIiIiIiil : IIIiIiIiil;
   }

   public static int IlIlllIlilIl(float[] mesh, int boxMask, float cut, float soft, float[] out) {
      return IiIlliIliiIl(mesh, boxMask, cut, soft, out, false);
   }

   private static int IilliliilIIi(float[] out, int v, float... o) {
      for (int var3 = 0; var3 < 4; var3++) {
         out[v++] = o[var3 * 5];
         out[v++] = o[var3 * 5 + 1];
         out[v++] = o[var3 * 5 + 2];
         out[v++] = o[var3 * 5 + 3] / 64.0F;
         out[v++] = o[var3 * 5 + 4] / 64.0F;
      }

      return v;
   }

   private static int Illlllllilll(float[] z, int y, float w, float o, float v, float x, float out, float u) {
      z[y] = w;
      z[y + 1] = o;
      z[y + 2] = v;
      z[y + 3] = x;
      z[y + 4] = out;
      z[y + 5] = u;
      return y + (-863197414 * 1227133513 ^ 71 ^ 1964014123);
   }

   public static float lIiiIiIlilli(float v) {
      return v < 0.0F ? 0.0F : (v > 1.0F ? 1.0F : v);
   }

   public static float[] IliIlllilIi(boolean slim) {
      return slim ? llIiIiIiil : IlIiIiIiil;
   }

   public static float iliIiiliiiii(float soft, float reveal) {
      return -0.25F - reveal + lIiiIiIlilli(soft) * (32.75F + 2.0F * reveal);
   }

   public static float IIIllIIliIIl(float y, float soft, float cut) {
      if (cut <= 0.0F) {
         return y <= soft ? 1.0F : 0.0F;
      } else {
         float var3 = lIiiIiIlilli((y - (soft - cut)) / (2.0F * cut));
         return 1.0F - var3 * var3 * (3.0F - 2.0F * var3);
      }
   }

   private Illiiiilllliiiil() {
   }

   private static float Iilllilliill(float lo, float v, float hi) {
      return lo < v ? v : (lo > hi ? hi : lo);
   }

   public static float[] iIlIlllllill(boolean slim) {
      float[][] var1 = slim ? lIIiIiIiil : IIIiIiIiil;
      float[] var2 = new float[var1.length * 6 * 4 * 5];
      int var3 = 0;

      for (float[] var7 : var1) {
         float var8 = var7[0];
         float var9 = var7[1];
         float var10 = var7[2];
         float var11 = var7[3];
         float var12 = var7[4];
         float var13 = var7[5];
         float var14 = var7[6];
         float var15 = var7[7];
         float var16 = var7[8];
         float var17 = var7[9];
         float var18 = var7[10];
         float var20 = var14 + var18;
         float var21 = var14 + var18 + var16;
         float var22 = var14 + var18 + var16 + var16;
         float var23 = var14 + var18 + var16 + var18;
         float var24 = var14 + var18 + var16 + var18 + var16;
         float var26 = var15 + var18;
         float var27 = var15 + var18 + var17;
         var3 = IilliliilIIi(
            var2,
            var3,
            var11,
            var12,
            var10,
            var21,
            var15,
            var8,
            var12,
            var10,
            var20,
            var15,
            var8,
            var12,
            var13,
            var20,
            var26,
            var11,
            var12,
            var13,
            var21,
            var26
         );
         var3 = IilliliilIIi(
            var2, var3, var11, var9, var13, var22, var26, var8, var9, var13, var21, var26, var8, var9, var10, var21, var15, var11, var9, var10, var22, var15
         );
         var3 = IilliliilIIi(
            var2, var3, var8, var12, var13, var20, var26, var8, var12, var10, var14, var26, var8, var9, var10, var14, var27, var8, var9, var13, var20, var27
         );
         var3 = IilliliilIIi(
            var2, var3, var11, var12, var13, var21, var26, var8, var12, var13, var20, var26, var8, var9, var13, var20, var27, var11, var9, var13, var21, var27
         );
         var3 = IilliliilIIi(
            var2,
            var3,
            var11,
            var12,
            var10,
            var23,
            var26,
            var11,
            var12,
            var13,
            var21,
            var26,
            var11,
            var9,
            var13,
            var21,
            var27,
            var11,
            var9,
            var10,
            var23,
            var27
         );
         var3 = IilliliilIIi(
            var2, var3, var8, var12, var10, var24, var26, var11, var12, var10, var23, var26, var11, var9, var10, var23, var27, var8, var9, var10, var24, var27
         );
      }

      return var2;
   }

   private static int IIlllIlliIll(float[] o, int lo, float[] out, int s, int hi, float y, float mesh, float w) {
      return Illlllllilll(
         o,
         lo,
         out[s] + (out[hi] - out[s]) * y,
         mesh,
         out[s + 2] + (out[hi + 2] - out[s + 2]) * y,
         out[s + 3] + (out[hi + 3] - out[s + 3]) * y,
         out[s + 4] + (out[hi + 4] - out[s + 4]) * y,
         w
      );
   }

   static {
      iIIiIiIiil[2] = 23;
      iIIiIiIiil[4] = 16;
      iIIiIiIiil[6] = 4;
      iIIiIiIiil[8] = 17;
      iIIiIiIiil[10] = 5;
   }

   public static int IiIlliIliiIl(float[] out, int soft, float shell, float boxMask, float[] mesh, boolean cut) {
      float[] var6 = new float[7];
      int var7 = 0;

      for (int var8 = 0; var8 < 12; var8++) {
         if ((soft >> var8 & 1) != 0) {
            for (int var9 = 0; var9 < 6; var9++) {
               if (!cut || (iIIiIiIiil[var8] >> var9 & 1) == 0) {
                  int var10 = (var8 * 6 + var9) * 4 * 5;
                  if (var9 != 0 && var9 != 1) {
                     int var28 = var10;
                     int var29 = var10 + 5;
                     int var13 = var10 + 10;
                     int var14 = var10 + 15;
                     float var15 = out[var10 + 1];
                     float var16 = out[var14 + 1];
                     float var17 = var15 - var16;
                     var6[0] = var16;
                     var6[1] = Iilllilliill(shell - boxMask, var16, var15);
                     var6[2] = Iilllilliill(shell - boxMask * 0.5F, var16, var15);
                     var6[3] = Iilllilliill(shell, var16, var15);
                     var6[4] = Iilllilliill(shell + boxMask * 0.5F, var16, var15);
                     var6[5] = Iilllilliill(shell + boxMask, var16, var15);
                     var6[6] = var15;

                     for (int var18 = 0; var18 < 6; var18++) {
                        float var19 = var6[var18];
                        float var20 = var6[var18 + 1];
                        if (!(var20 - var19 <= 1.0E-4F)) {
                           float var21 = (var19 - var16) / var17;
                           float var22 = (var20 - var16) / var17;
                           float var23 = IIIllIIliIIl(var19, shell, boxMask);
                           float var24 = IIIllIIliIIl(var20, shell, boxMask);
                           var7 = IIlllIlliIll(mesh, var7, out, var14, var28, var22, var20, var24);
                           var7 = IIlllIlliIll(mesh, var7, out, var13, var29, var22, var20, var24);
                           var7 = IIlllIlliIll(mesh, var7, out, var13, var29, var21, var19, var23);
                           var7 = IIlllIlliIll(mesh, var7, out, var14, var28, var21, var19, var23);
                        }
                     }
                  } else {
                     for (int var11 = 0; var11 < 4; var11++) {
                        int var12 = var10 + var11 * 5;
                        var7 = Illlllllilll(
                           mesh, var7, out[var12], out[var12 + 1], out[var12 + 2], out[var12 + 3], out[var12 + 4], IIIllIIliIIl(out[var12 + 1], shell, boxMask)
                        );
                     }
                  }
               }
            }
         }
      }

      return var7 / 6;
   }
}
