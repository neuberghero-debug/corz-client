package gg.corz;

import java.util.ArrayList;

final class lIIIliliIIIlil {
   private static final float IIliIiiIilIliIiiIi = 0.5F;
   private static final float liIiIiiIiiiIiIiiIi = 0.5F;
   private static final float lIIiIiiIiiIIiIiiIi = 1.4F;
   private static final float llliIiiIiilliIiiIi = 3200.0F;
   private static final float ilIiIiiIiIiIiIiiIi = -1.6F;
   private static final float IiliIiiIililiIiiIi = 0.045F;
   private static final float IlIiIiiIillIiIiiIi = 0.5F;
   private static final float iIliIiiIiIlliIiiIi = 180.0F;

   private static float liiiIIllIl(float deg) {
      return -0.20000005F - 1.4F * (float)Math.cos(Math.toRadians((double)deg));
   }

   private static float IliIlllilIi(float deg) {
      return 0.5F + 1.4F * (float)Math.sin(Math.toRadians((double)deg));
   }

   private lIIIliliIIIlil() {
   }

   static void iIlIlllllill(iliiiIiiii a, float n, float o, int c) {
      int var4 = Math.min(c, 3);
      float var5 = 1.0F + 0.045F * (float)(var4 - 1);
      a.illlliIlIillliIl = 3200.0F * var5;
      float var6 = Math.min(n, 45.0F);
      float var7 = Math.min(o, 36.0F);
      lIIIiIiiIIIiIi var8 = new lIIIiIiiIIIiIi();
      lIIIiIiiIIIiIi var9 = new lIIIiIiiIIIiIi();
      lIIIiIiiIIIiIi var10 = new lIIIiIiiIIIiIi();
      lIIIiIiiIIIiIi var11 = new lIIIiIiiIIIiIi();
      lIIIiIiiIIIiIi var12 = new lIIIiIiiIIIiIi();
      lIIIiIiiIIIiIi var13 = new lIIIiIiiIIIiIi();
      lIIIiIiiIIIiIi var14 = new lIIIiIiiIIIiIi();
      lIIIiIiiIIIiIi var15 = new lIIIiIiiIIIiIi();
      lIIIiIiiIIIiIi var16 = new lIIIiIiiIIIiIi();
      lIIIiIiiIIIiIi var17 = new lIIIiIiiIIIiIi();
      lIIIiIiiIIIiIi var18 = new lIIIiIiiIIIiIi();
      lIIIiIiiIIIiIi var19 = new lIIIiIiiIIIiIi();
      lIIIiIiiIIIiIi var20 = new lIIIiIiiIIIiIi();
      lIIIiIiiIIIiIi var21 = new lIIIiIiiIIIiIi();
      lIIIiIiiIIIiIi var22 = new lIIIiIiiIIIiIi();

      for (lIIIiIiiIIIiIi var26 : new lIIIiIiiIIIiIi[]{var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21, var22}) {
         var26.IliIlllilIi(0.0F, 0.0F);
      }

      var20.IliIlllilIi(0.012F, -3.0F).IliIlllilIi(0.08F, 92.0F).IliIlllilIi(0.14F, 170.0F).IliIlllilIi(0.2F, 180.0F);
      var18.IliIlllilIi(0.012F, 0.0F).IliIlllilIi(0.075F, 0.6F).IliIlllilIi(0.14F, 0.0F);
      var19.IliIlllilIi(0.03F, 4.0F).IliIlllilIi(0.13F, -9.0F);
      var15.IliIlllilIi(0.05F, -6.0F).IliIlllilIi(0.13F, -10.0F);
      var14.IliIlllilIi(0.04F, 3.0F).IliIlllilIi(0.13F, -5.0F);
      var9.IliIlllilIi(0.02F, -0.006F).IliIlllilIi(0.11F, 0.02F);
      var8.IliIlllilIi(0.11F, -0.012F);
      var10.IliIlllilIi(0.11F, 0.012F);
      var11.IliIlllilIi(0.02F, 2.0F).IliIlllilIi(0.11F, -2.0F);
      var12.IliIlllilIi(0.11F, -3.0F);
      var13.IliIlllilIi(0.11F, -1.0F);
      var22.IliIlllilIi(0.14F, 0.0F).IliIlllilIi(0.155F, 7.0F).IliIlllilIi(0.19F, 70.0F).IliIlllilIi(0.222F, 150.0F).IliIlllilIi(0.236F, 172.0F);
      var17.IliIlllilIi(0.15F, 0.0F).IliIlllilIi(0.236F, 0.5F);
      var19.IliIlllilIi(0.15F, -9.5F).IliIlllilIi(0.236F, -12.0F);
      var14.IliIlllilIi(0.15F, -5.0F).IliIlllilIi(0.236F, -8.0F);
      var9.IliIlllilIi(0.236F, 0.024F);
      var19.IliIlllilIi(0.27F, -16.0F).IliIlllilIi(0.3F, -15.0F).IliIlllilIi(0.318F, -11.0F);
      var15.IliIlllilIi(0.236F, -10.0F).IliIlllilIi(0.28F, 3.0F).IliIlllilIi(0.315F, -5.0F);
      var12.IliIlllilIi(0.275F, -5.0F).IliIlllilIi(0.318F, -4.0F);
      var9.IliIlllilIi(0.3F, 0.028F).IliIlllilIi(0.318F, 0.02F);
      var11.IliIlllilIi(0.236F, -2.0F).IliIlllilIi(0.3F, -3.0F).IliIlllilIi(0.318F, 0.0F);
      var22.IliIlllilIi(0.326F, 172.0F)
         .IliIlllilIi(0.3305F, 166.0F)
         .IliIlllilIi(0.3415F, 88.0F)
         .IliIlllilIi(0.3475F, 22.0F)
         .IliIlllilIi(0.3505F, 0.0F)
         .IliIlllilIi(var5, 0.0F);
      var17.IliIlllilIi(0.3505F, 0.5F).IliIlllilIi(0.4F, -1.6F);
      var16.IliIlllilIi(0.3505F, 0.0F).IliIlllilIi(0.4F, 0.5F);
      var19.IliIlllilIi(0.3505F, -9.5F).IliIlllilIi(0.357F, -5.0F).IliIlllilIi(0.38F, -11.0F);
      var9.IliIlllilIi(0.3505F, 0.024F).IliIlllilIi(0.357F, 0.034F).IliIlllilIi(0.38F, 0.02F);
      var13.IliIlllilIi(0.3505F, -1.0F).IliIlllilIi(0.357F, -3.0F).IliIlllilIi(0.38F, 0.0F);
      var11.IliIlllilIi(0.35F, 1.0F).IliIlllilIi(0.365F, -4.0F).IliIlllilIi(0.39F, -2.0F);
      var14.IliIlllilIi(0.3505F, -8.0F).IliIlllilIi(0.358F, -2.0F).IliIlllilIi(0.38F, -7.0F);
      var15.IliIlllilIi(0.358F, 2.0F).IliIlllilIi(0.39F, -4.0F);
      float var44 = 0.42F;
      float var45 = 0.44F;
      float var46 = 0.46F;
      float var47 = 0.08F + 0.045F * (float)var4;
      float var27 = -var6 * 0.5F;
      var19.IliIlllilIi(var44, -4.0F).IliIlllilIi(var46, var27);
      var21.IliIlllilIi(var44, -6.0F).IliIlllilIi(var46, 0.0F);
      var16.IliIlllilIi(var44, 0.5F).IliIlllilIi(var46, IliIlllilIi(var27));
      var17.IliIlllilIi(var44, -1.6F).IliIlllilIi(var46, liiiIIllIl(var27));
      var18.IliIlllilIi(var44, 0.0F).IliIlllilIi(var46, 0.5F);
      var15.IliIlllilIi(var44, -6.0F).IliIlllilIi(var46, -2.0F);
      var14.IliIlllilIi(var44, -4.0F).IliIlllilIi(var45, -1.0F).IliIlllilIi(var46, -3.0F);
      var9.IliIlllilIi(var44, 0.016F).IliIlllilIi(var45, 0.008F).IliIlllilIi(var46, 0.022F);
      var8.IliIlllilIi(var44, -0.01F).IliIlllilIi(var46, -0.012F);
      var10.IliIlllilIi(var44, 0.01F).IliIlllilIi(var46, 0.004F);
      var11.IliIlllilIi(var44, -3.0F).IliIlllilIi(var45, 0.0F).IliIlllilIi(var46, 1.0F);
      var12.IliIlllilIi(var44, -3.0F).IliIlllilIi(var46, -2.0F);
      var13.IliIlllilIi(var44, 0.0F).IliIlllilIi(var45, 2.0F).IliIlllilIi(var46, 0.0F);
      ArrayList var28 = new ArrayList();

      for (byte var29 = 45; var29 <= 360 * var4; var29 += 45) {
         var28.add((float)var29);
      }

      var28.add(360.0F * (float)var4 + var7 * 0.6F);
      float[] var48 = new float[var28.size()];
      float var30 = var27;
      float var31 = 0.0F;

      for (int var32 = 0; var32 < var48.length; var32++) {
         float var33 = (Float)var28.get(var32);
         float var34 = (var30 + var33) * 0.5F;
         float var35 = (var33 - var30) / 45.0F * (1.0F + 0.18F * (float)Math.cos(Math.toRadians((double)var34)));
         if (var32 == 0) {
            var35 *= 1.5F;
         }

         if (var32 == var48.length - 2) {
            var35 *= 1.15F;
         }

         if (var32 == var48.length - 1) {
            var35 = Math.max(var35, 0.9F) * 1.6F;
         }

         var48[var32] = var35;
         var31 += var35;
         var30 = var33;
      }

      float var49 = var46;

      for (int var50 = 0; var50 < var48.length; var50++) {
         var49 += var47 * var48[var50] / var31;
         float var51 = (Float)var28.get(var50);
         var19.IliIlllilIi(var49, var51);
         var16.IliIlllilIi(var49, IliIlllilIi(var51));
         var17.IliIlllilIi(var49, liiiIIllIl(var51));
         if (var50 < var48.length - 2 && var51 % 360.0F == 90.0F) {
            var9.IliIlllilIi(var49, 0.012F);
            var13.IliIlllilIi(var49, 3.0F);
            var15.IliIlllilIi(var49, -6.0F);
            var8.IliIlllilIi(var49, -0.016F);
         } else if (var50 < var48.length - 2 && var51 % 360.0F == 270.0F) {
            var9.IliIlllilIi(var49, 0.03F);
            var13.IliIlllilIi(var49, -2.0F);
            var15.IliIlllilIi(var49, 2.0F);
            var8.IliIlllilIi(var49, -0.008F);
         }
      }

      float var52 = var49 + 0.028F;
      float var53 = var52 + 0.022F;
      float var36 = 360.0F * (float)var4;
      var19.IliIlllilIi(var52, var36);
      var16.IliIlllilIi(var52, IliIlllilIi(0.0F)).IliIlllilIi(var53, 0.0F).IliIlllilIi(var5, 0.0F);
      var17.IliIlllilIi(var52, liiiIIllIl(0.0F)).IliIlllilIi(var53, 0.0F).IliIlllilIi(var5, 0.0F);
      var18.IliIlllilIi(var52, 0.5F).IliIlllilIi(var53, 0.0F);
      var9.IliIlllilIi(var49, 0.026F).IliIlllilIi(var52, 0.012F).IliIlllilIi(var53, 0.016F);
      var11.IliIlllilIi(var49, 2.0F).IliIlllilIi(var52, -3.0F).IliIlllilIi(var53, -1.0F);
      var15.IliIlllilIi(var49, -2.0F).IliIlllilIi(var52, -7.0F).IliIlllilIi(var53, -5.0F);
      var14.IliIlllilIi(var49, -3.0F).IliIlllilIi(var52, 2.0F).IliIlllilIi(var53, -2.0F);
      var13.IliIlllilIi(var49, 0.0F).IliIlllilIi(var52, 3.0F).IliIlllilIi(var53, 1.0F);
      var8.IliIlllilIi(var52, -0.012F);
      var10.IliIlllilIi(var52, 0.004F);
      var12.IliIlllilIi(var52, -3.0F);
      float var37 = var53 + 0.015F;
      float var38 = var5 - 0.09F;
      float var39 = var38 - var37;
      float var40 = var37 + Math.max(0.034F, 0.15F * var39);
      float var41 = var37 + 0.36F * var39;
      float var42 = var37 + 0.57F * var39;
      float var43 = var37 + 0.8F * var39;
      var20.IliIlllilIi(var37, 180.0F)
         .IliIlllilIi(var40, 162.0F)
         .IliIlllilIi(var41, 165.0F)
         .IliIlllilIi(var42, 362.0F)
         .IliIlllilIi(var43, 366.0F)
         .IliIlllilIi(var38, 360.0F + var7 * 0.25F)
         .IliIlllilIi(var5 - 0.07F, 360.0F)
         .IliIlllilIi(var5, 360.0F);
      var19.IliIlllilIi(var37, var36)
         .IliIlllilIi(var40, var36 + 6.0F)
         .IliIlllilIi(var41, var36 + 4.0F)
         .IliIlllilIi(var42, var36 - 116.0F)
         .IliIlllilIi(var43, var36 - 118.0F)
         .IliIlllilIi(var38, var36)
         .IliIlllilIi(var5, var36);
      var21.IliIlllilIi(var37, 0.0F)
         .IliIlllilIi(var40, -3.0F)
         .IliIlllilIi(var41, -4.0F)
         .IliIlllilIi(var42, -4.0F)
         .IliIlllilIi(var43, -5.0F)
         .IliIlllilIi(var38, -2.0F)
         .IliIlllilIi(var5 - 0.07F, 0.0F);
      var18.IliIlllilIi(var41, 0.0F).IliIlllilIi((var41 + var42) * 0.5F, 0.5F).IliIlllilIi(var42, 0.0F).IliIlllilIi(var5, 0.0F);
      var14.IliIlllilIi(var40, 10.0F).IliIlllilIi(var41, 12.0F).IliIlllilIi(var42, -25.0F).IliIlllilIi(var43, -26.0F).IliIlllilIi(var38, -3.0F);
      var15.IliIlllilIi(var40, -8.0F).IliIlllilIi(var41, -8.0F).IliIlllilIi(var42, -4.0F).IliIlllilIi(var43, -4.0F).IliIlllilIi(var38, -2.0F);
      var12.IliIlllilIi(var40, -5.0F).IliIlllilIi(var42, -6.0F).IliIlllilIi(var43, -6.0F).IliIlllilIi(var38, -2.0F);
      var8.IliIlllilIi(var40, -0.016F).IliIlllilIi(var42, -0.006F).IliIlllilIi(var43, -0.006F).IliIlllilIi(var38, -0.008F);
      var9.IliIlllilIi(var40, 0.022F).IliIlllilIi(var42, -0.008F).IliIlllilIi(var43, -0.006F).IliIlllilIi(var38, 0.01F);
      var10.IliIlllilIi(var40, -0.008F).IliIlllilIi(var42, -0.004F).IliIlllilIi(var43, -0.002F).IliIlllilIi(var38, -0.004F);
      var11.IliIlllilIi(var40, -3.0F).IliIlllilIi(var43, -3.0F).IliIlllilIi(var38, -1.0F);
      var13.IliIlllilIi(var40, 1.0F).IliIlllilIi(var42, 0.0F).IliIlllilIi(var38, 0.0F);
      var8.IliIlllilIi(var5 - 0.035F, 0.003F).IliIlllilIi(var5, 0.0F);
      var9.IliIlllilIi(var5 - 0.038F, -0.005F).IliIlllilIi(var5, 0.0F);
      var10.IliIlllilIi(var5 - 0.035F, -0.003F).IliIlllilIi(var5, 0.0F);
      var12.IliIlllilIi(var5 - 0.035F, 1.0F).IliIlllilIi(var5, 0.0F);
      var13.IliIlllilIi(var5, 0.0F);
      var11.IliIlllilIi(var5 - 0.038F, 1.5F).IliIlllilIi(var5, 0.0F);
      var15.IliIlllilIi(var5 - 0.035F, 1.0F).IliIlllilIi(var5, 0.0F);
      var14.IliIlllilIi(var5, 0.0F);
      var21.IliIlllilIi(var5, 0.0F);
      var8.liiiIIllIl(a, 0, var5);
      var9.liiiIIllIl(a, 1, var5);
      var10.liiiIIllIl(a, 2, var5);
      var11.liiiIIllIl(a, 3, var5);
      var12.liiiIIllIl(a, 4, var5);
      var13.liiiIIllIl(a, 5, var5);
      var14.liiiIIllIl(a, 6, var5);
      var15.liiiIIllIl(a, 7, var5);
      var16.liiiIIllIl(a, 8, var5);
      var17.liiiIIllIl(a, 9, var5);
      var18.liiiIIllIl(a, 10, var5);
      var19.liiiIIllIl(a, 11, var5);
      var20.liiiIIllIl(a, 12, var5);
      var21.liiiIIllIl(a, 13, var5);
      var22.liiiIIllIl(a, 14, var5);
   }
}
