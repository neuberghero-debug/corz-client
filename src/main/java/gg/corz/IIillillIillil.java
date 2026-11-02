package gg.corz;

final class IIillillIillil {
   private static final float IIillIIlilIillIIli = 1.2F;
   private static final float lilllIIliiilllIIli = 0.3F;
   private static final float ilIilIIliIiIilIIli = 0.014F;
   private static final float IiillIIliliillIIli = 0.15F;
   private static final float lIIilIIliiIIilIIli = 1.3F;
   private static final float llillIIliilillIIli = 0.04F;
   private static final double liIilIIliiiIilIIli = -196.0;
   private static final double IIlilIIlilIlilIIli = 0.3;
   private static final float iiillIIliIIIilIIli = 0.15F;
   private static final float IlIilIIlillIilIIli = 0.4F;
   private static final float iIillIIliIlillIIli = -0.08F;
   private static final double iIlilIIliIllilIIli = 1.0;

   private static float[] liiiIIllIl(int spins) {
      int var1 = 14 * spins + 6;
      float[] var2 = new float[var1 + 6];
      var2[0] = 0.02F;
      var2[1] = 0.04F;
      var2[2] = 0.07F;
      var2[3] = 0.1F;

      for (int var3 = 1; var3 <= var1; var3++) {
         var2[3 + var3] = 0.1F + 0.86F * (float)var3 / (float)(var1 + 1);
      }

      var2[var1 + 4] = 0.975F;
      var2[var1 + 5] = 0.99F;
      return var2;
   }

   private static double[] lIiiIiIlilli(double gain, float steps, int w) {
      double[] var4 = new double[w + 1];
      double var5 = 1.0 / (double)w;

      for (int var7 = 1; var7 <= w; var7++) {
         double var8 = ((double)var7 - 1.0) * var5;
         double var10 = var4[var7 - 1] + 0.5 * var5 * gain * IilliliilIIi(var8, (double)steps - var4[var7 - 1]);
         var4[var7] = var4[var7 - 1] + var5 * gain * IilliliilIIi(var8 + 0.5 * var5, (double)steps - var10);
      }

      return var4;
   }

   static void IliIlllilIi(iliiiIiiii o, float n, float c, int a) {
      int var4 = Math.min(a, 3);
      float var5 = Math.min(n, 40.0F);
      float var6 = Math.min(c, 30.0F);
      float var7 = 0.06F * (float)(var4 - 1);
      float var8 = -360.0F * (float)var4;
      float var9 = 1.0F - var7 / 0.6F;
      liIliIIliiIliIIl var10 = new liIliIIliiIliIIl();
      float var11 = 0.035F * var9;
      float var12 = 0.095F * var9;
      float var13 = 0.15F * var9;
      float var14 = 0.3F * var9;
      float var15 = 0.33F * var9;
      float var16 = 0.385F * var9;
      float var17 = 0.41F * var9;
      float var18 = 0.44F * var9;
      float var19 = 0.57F * var9;
      float var20 = 0.6F - var7;
      float var21 = var20 + 0.05F;
      float var22 = var21 + 0.15F + var7;
      float var23 = var22 + 0.045F;
      float var24 = var23 + 0.025F;
      float var25 = var24 + 0.07F;
      float var26 = var25 + 0.03F;
      var10.IliIlllilIi(0.0F).iIlIlllllill(0, 1, 2, 3, 4, 5, 6, 7, 11, 12, 13, 10);
      var10.IliIlllilIi(var11)
         .liiiIIllIl(0, 0.006F)
         .liiiIIllIl(1, -0.012F)
         .liiiIIllIl(2, -0.004F)
         .liiiIIllIl(3, -var5 * 0.08F)
         .liiiIIllIl(5, -var5 * 0.1F)
         .liiiIIllIl(7, var5 * 0.3F)
         .liiiIIllIl(11, var5 * 0.12F);
      var10.IliIlllilIi(var12)
         .liiiIIllIl(0, -0.012F)
         .liiiIIllIl(1, 0.03F)
         .liiiIIllIl(2, -0.02F)
         .liiiIIllIl(3, 2.0F)
         .liiiIIllIl(5, 13.0F)
         .liiiIIllIl(7, -12.0F - var6 * 0.2F)
         .liiiIIllIl(11, -1.0F)
         .liiiIIllIl(13, 3.0F);
      var10.IliIlllilIi(var13)
         .liiiIIllIl(0, -0.012F)
         .liiiIIllIl(1, 0.028F)
         .liiiIIllIl(2, -0.02F)
         .liiiIIllIl(3, 1.5F)
         .liiiIIllIl(5, 12.0F)
         .liiiIIllIl(7, -12.0F)
         .liiiIIllIl(11, 0.0F)
         .liiiIIllIl(13, 3.0F)
         .liiiIIllIl(12, 0.0F)
         .liiiIIllIl(10, 0.0F);
      float var27 = var14 - var13;
      var10.IliIlllilIi(var13 + var27 * 0.5F)
         .liiiIIllIl(7, 5.0F)
         .liiiIIllIl(5, 9.0F)
         .liiiIIllIl(3, 0.0F)
         .liiiIIllIl(4, -3.0F)
         .liiiIIllIl(2, -0.026F)
         .liiiIIllIl(13, 1.0F)
         .liiiIIllIl(11, -3.0F);
      var10.IliIlllilIi(var14)
         .liiiIIllIl(0, -0.01F)
         .liiiIIllIl(1, 0.024F)
         .liiiIIllIl(2, -0.014F)
         .liiiIIllIl(3, 1.0F)
         .liiiIIllIl(4, 0.0F)
         .liiiIIllIl(5, 7.0F)
         .liiiIIllIl(7, 18.0F + var6 * 0.2F)
         .liiiIIllIl(12, 0.0F)
         .liiiIIllIl(11, -6.0F)
         .liiiIIllIl(13, 0.0F)
         .liiiIIllIl(10, 0.0F)
         .liiiIIllIl(6, 0.0F);
      var10.IliIlllilIi(var15)
         .liiiIIllIl(7, 18.0F)
         .liiiIIllIl(12, -var5 * 0.25F)
         .liiiIIllIl(5, 7.0F)
         .liiiIIllIl(3, 1.0F)
         .liiiIIllIl(10, 0.72F)
         .liiiIIllIl(6, -1.0F - var5 * 0.08F);
      var10.IliIlllilIi((var15 + var16) * 0.5F).liiiIIllIl(10, 1.2F).liiiIIllIl(6, 3.0F);
      var10.IliIlllilIi(var16)
         .liiiIIllIl(7, 15.0F)
         .liiiIIllIl(12, 180.0F + var6 * 0.6F)
         .liiiIIllIl(5, 8.0F)
         .liiiIIllIl(3, 3.0F)
         .liiiIIllIl(10, 0.66F)
         .liiiIIllIl(6, 1.0F);
      var10.IliIlllilIi(var17).liiiIIllIl(7, 17.0F).liiiIIllIl(12, 180.0F).liiiIIllIl(5, 7.0F).liiiIIllIl(3, 2.0F).liiiIIllIl(10, 0.3F).liiiIIllIl(6, 0.0F);
      var10.IliIlllilIi(var18)
         .liiiIIllIl(7, 18.0F)
         .liiiIIllIl(12, 180.0F)
         .liiiIIllIl(5, 7.0F)
         .liiiIIllIl(2, -0.014F)
         .liiiIIllIl(13, 0.0F)
         .liiiIIllIl(4, 0.0F)
         .liiiIIllIl(3, 2.0F)
         .liiiIIllIl(10, 0.0F)
         .liiiIIllIl(11, -6.0F);
      float var28 = var19 - var18;
      var10.IliIlllilIi(var18 + var28 * 0.55F)
         .liiiIIllIl(7, -24.0F)
         .liiiIIllIl(5, 1.0F)
         .liiiIIllIl(2, -0.02F)
         .liiiIIllIl(4, -2.0F)
         .liiiIIllIl(3, 0.0F)
         .liiiIIllIl(11, -2.0F);
      var10.IliIlllilIi(var19)
         .liiiIIllIl(7, -12.0F + var6 * 0.3F)
         .liiiIIllIl(12, 180.0F)
         .liiiIIllIl(5, 6.0F)
         .liiiIIllIl(0, -0.01F)
         .liiiIIllIl(1, 0.025F)
         .liiiIIllIl(2, -0.016F)
         .liiiIIllIl(13, 0.0F)
         .liiiIIllIl(4, -1.0F)
         .liiiIIllIl(3, 1.0F)
         .liiiIIllIl(11, 0.0F);
      var10.IliIlllilIi(var20)
         .liiiIIllIl(0, -0.01F)
         .liiiIIllIl(1, 0.025F)
         .liiiIIllIl(2, -0.012F)
         .liiiIIllIl(12, 180.0F)
         .liiiIIllIl(7, -10.0F)
         .liiiIIllIl(11, 0.0F)
         .liiiIIllIl(4, 0.0F)
         .liiiIIllIl(5, 5.0F)
         .liiiIIllIl(3, 2.0F)
         .liiiIIllIl(6, 0.0F)
         .liiiIIllIl(13, 0.0F)
         .liiiIIllIl(10, 0.0F);
      float var29 = 8.0F + var5 * 0.3F;
      float var30 = var29 - var8;
      float var31 = Math.min(var6 * 0.55F, 10.0F) * 1.3F;
      float var32 = var22 - var21;
      float var33 = var21 + var32 * 0.15F;
      var10.IliIlllilIi(var21).liiiIIllIl(11, var29).liiiIIllIl(7, -12.0F).liiiIIllIl(6, -var5 * 0.3F).liiiIIllIl(3, 3.0F).liiiIIllIl(10, 0.3F);
      float[] var34 = liiiIIllIl(var4);
      float[] var35 = iliIiiliiiii(var34, var29, var30);

      for (int var36 = 0; var36 < var34.length; var36++) {
         var10.IliIlllilIi(var21 + var32 * var34[var36]).liiiIIllIl(11, var29 - var30 * var35[var36]);
      }

      var10.IliIlllilIi(var33).liiiIIllIl(1, 0.065F).liiiIIllIl(2, -0.08F);
      var10.IliIlllilIi(var21 + var32 * 0.3F).liiiIIllIl(6, 2.0F).liiiIIllIl(3, 2.0F).liiiIIllIl(7, -11.0F);
      var10.IliIlllilIi(var22 - 0.012F)
         .liiiIIllIl(1, 0.065F)
         .liiiIIllIl(2, -0.08F)
         .liiiIIllIl(6, 1.0F)
         .liiiIIllIl(3, 2.5F)
         .liiiIIllIl(7, -10.0F)
         .liiiIIllIl(10, 0.3F);
      var10.IliIlllilIi(var22).liiiIIllIl(11, var8).liiiIIllIl(6, var31 * 0.4F).liiiIIllIl(7, -12.0F).liiiIIllIl(3, 4.0F).liiiIIllIl(0, -0.01F);
      var10.IliIlllilIi(var22 + 0.014F).liiiIIllIl(6, var31);
      var10.IliIlllilIi(var23)
         .liiiIIllIl(11, var8)
         .liiiIIllIl(6, -2.0F)
         .liiiIIllIl(7, -10.0F)
         .liiiIIllIl(3, 2.5F)
         .liiiIIllIl(1, 0.057000004F)
         .liiiIIllIl(2, -0.064F)
         .liiiIIllIl(10, 0.3F);
      var10.IliIlllilIi(var24)
         .liiiIIllIl(12, 180.0F)
         .liiiIIllIl(7, -10.0F)
         .liiiIIllIl(11, var8)
         .liiiIIllIl(6, 0.0F)
         .liiiIIllIl(3, 2.0F)
         .liiiIIllIl(4, 0.0F)
         .liiiIIllIl(5, 5.0F)
         .liiiIIllIl(0, -0.01F)
         .liiiIIllIl(1, 0.049000002F)
         .liiiIIllIl(2, -0.048F)
         .liiiIIllIl(10, 0.72F);
      var10.IliIlllilIi((var24 + var25) * 0.5F).liiiIIllIl(10, 1.2F);
      var10.IliIlllilIi(var25)
         .liiiIIllIl(12, -var6 * 0.3F)
         .liiiIIllIl(7, 8.0F)
         .liiiIIllIl(3, 1.0F)
         .liiiIIllIl(5, 2.0F)
         .liiiIIllIl(0, -0.004F)
         .liiiIIllIl(1, 0.01F)
         .liiiIIllIl(2, -0.005F)
         .liiiIIllIl(10, 0.6F);
      var10.IliIlllilIi(var26)
         .liiiIIllIl(12, 0.0F)
         .liiiIIllIl(7, 2.0F)
         .liiiIIllIl(3, 0.0F)
         .liiiIIllIl(5, 0.5F)
         .liiiIIllIl(0, -0.001F)
         .liiiIIllIl(1, 0.002F)
         .liiiIIllIl(2, -0.001F)
         .liiiIIllIl(10, 0.120000005F);
      var10.IliIlllilIi(1.0F).iIlIlllllill(0, 1, 2, 3, 4, 5, 6, 7, 13, 12, 10).liiiIIllIl(11, var8);
      var10.IilliliilIIi(o);
   }

   private IIillillIillil() {
   }

   private static float[] iliIiiliiiii(float[] w, float A, float fs) {
      short var3 = 1000;
      double var4 = 0.0;
      double var6 = (double)fs * 4.0;

      for (int var8 = 0; var8 < 24; var8++) {
         double var9 = (var4 + var6) * 0.5;
         if (lIiiIiIlilli(var9, A, var3)[var3] < (double)fs) {
            var4 = var9;
         } else {
            var6 = var9;
         }
      }

      double[] var11 = lIiiIiIlilli((var4 + var6) * 0.5, A, var3);
      float[] var12 = new float[w.length];

      for (int var10 = 0; var10 < w.length; var10++) {
         var12[var10] = (float)(var11[Math.round(w[var10] * (float)var3)] / var11[var3]);
      }

      return var12;
   }

   private static double IilliliilIIi(double tw, double f) {
      double var4 = Math.cos(Math.toRadians(f - Double.longBitsToDouble(6143128109078169081L ^ -7698826083133405703L)));
      double var6 = (1.0 + var4) * Double.longBitsToDouble(7710084212242931043L ^ 6133824342663257443L);
      double var8 = var4 * var4;
      return iIlIlllllill(tw) * (1.0 + Double.longBitsToDouble(7250414802111240604L ^ 6579080562711997103L) * var6 * var6 + 1.0 * var8 * var8);
   }

   private static double iIlIlllllill(double f) {
      if (f < Double.longBitsToDouble(109109967740814237L ^ 4483961703796365831L)) {
         double var4 = f / Double.longBitsToDouble(-7279144222253924295L ^ -6538433374687700573L);
         return var4
            * var4
            * (
               Double.longBitsToDouble(-1953657572966635754L ^ -6563091791580338410L)
                  - Double.longBitsToDouble(4144801716256259073L ^ 8756487734683646977L) * var4
            );
      } else {
         double var2 = Double.longBitsToDouble(6026848708829071298L ^ 7804569056405326607L)
            + Double.longBitsToDouble(-792674631452959134L ^ -3803779138992355336L)
               * Math.exp(
                  -(f - Double.longBitsToDouble(-4384719743941620269L ^ -243263621743881143L))
                     / Double.longBitsToDouble(1185066595207996807L ^ 3444033616652565533L)
               );
         return f > Double.longBitsToDouble(8282340318793897520L ^ 5557245943013375413L)
            ? var2 * (1.0 - f) / Double.longBitsToDouble(-7759609790459174017L ^ -6062148219657470521L)
            : var2;
      }
   }
}
