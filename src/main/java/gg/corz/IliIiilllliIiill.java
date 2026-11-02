package gg.corz;

import java.util.List;

public final class IliIiilllliIiill {
   public static final double liililiill = 6.0;
   public static final double[] lIIiiliill = new double[]{0.0, 25.0, -25.0, 50.0, -50.0, 75.0, -75.0};
   public static final double IlIiiliill = 0.3;
   public static final int IIIiiliill = 1;
   public static final int iiililiill = 3;
   public static final double ilililiill = 24.0;
   public static final double Iiililiill = 1.0;
   static final double iIIiiliill = 0.04;

   static iiliIiIIiiIi iIlIlllllill(
      double turn, int dx, double dz, double sy, double sz, List<Iiiiiilliiiiil> now, double[] threats, IiIilIIiliIilIIi ground, double sx
   ) {
      int var14 = dx;
      double var15 = turn;
      double var17 = dz;
      double var19 = 0.0;
      int var21 = dx;

      for (double var22 = 1.0; var22 <= 24.000000001; var22++) {
         double var24 = turn + sy * var22;
         double var26 = dz + sz * var22;
         int var28 = (int)Math.floor(var24);
         int var29 = (int)Math.floor(var26);
         int var30 = ground.feet(var28, var29, var14);
         if (var30 == Integer.MIN_VALUE || var30 == -2147483647 || var30 == -2147483646 || var14 - var30 > 3 || var30 - var14 > 1) {
            break;
         }

         boolean var31 = false;

         for (int var32 = 0; var32 < now.size(); var32++) {
            double var33 = Math.hypot(var24 - ((Iiiiiilliiiiil)now.get(var32)).IliIlllilIi(), var26 - ((Iiiiiilliiiiil)now.get(var32)).liiiIIllIl());
            if (var33 < threats[var32]) {
               var31 = true;
               break;
            }
         }

         if (var31) {
            break;
         }

         var14 = var30;
         var15 = var24;
         var17 = var26;
         var19 = var22;
         var21 = var30;
      }

      if (var19 < 6.0) {
         return null;
      } else {
         double var35 = Double.POSITIVE_INFINITY;

         for (int var36 = 0; var36 < now.size(); var36++) {
            double var25 = Math.hypot(var15 - ((Iiiiiilliiiiil)now.get(var36)).IliIlllilIi(), var17 - ((Iiiiiilliiiiil)now.get(var36)).liiiIIllIl());
            var35 = Math.min(var35, var25 - threats[var36]);
         }

         return new iiliIiIIiiIi(var15, var21, var17, var35, sx);
      }
   }

   public static iiliIiIIiiIi liiiIIllIl(double ground, int sz, double sx, List<Iiiiiilliiiiil> sy, IiIilIIiliIilIIi threats) {
      if (sy != null && !sy.isEmpty() && threats != null) {
         double[] var7 = IliIlllilIi(ground, sx, sy);
         if (var7 == null) {
            return null;
         } else {
            double[] var8 = new double[sy.size()];

            for (int var9 = 0; var9 < var8.length; var9++) {
               var8[var9] = Math.hypot(ground - ((Iiiiiilliiiiil)sy.get(var9)).IliIlllilIi(), sx - ((Iiiiiilliiiiil)sy.get(var9)).liiiIIllIl());
            }

            iiliIiIIiiIi var30 = null;
            double var10 = Double.NEGATIVE_INFINITY;

            for (double var15 : lIIiiliill) {
               double var17 = Math.toRadians(var15);
               double var19 = Math.cos(var17);
               double var21 = Math.sin(var17);
               double var23 = var7[0] * var19 - var7[1] * var21;
               double var25 = var7[0] * var21 + var7[1] * var19;
               iiliIiIIiiIi var27 = iIlIlllllill(ground, sz, sx, var23, var25, sy, var8, threats, var15);
               if (var27 != null) {
                  double var28 = var27.IilliliilIIi() - Math.abs(var15) * 0.04;
                  if (var28 > var10) {
                     var10 = var28;
                     var30 = var27;
                  }
               }
            }

            return var30;
         }
      } else {
         return null;
      }
   }

   public static double[] IliIlllilIi(double threats, double sz, List<Iiiiiilliiiiil> sx) {
      double var5 = 0.0;
      double var7 = 0.0;

      for (Iiiiiilliiiiil var10 : sx) {
         double var11 = threats - var10.IliIlllilIi();
         double var13 = sz - var10.liiiIIllIl();
         double var15 = var11 * var11 + var13 * var13;
         if (var15 < 1.0E-6) {
            var15 = 1.0E-6;
            var11 = 0.001;
         }

         var5 += var11 / var15;
         var7 += var13 / var15;
      }

      double var17 = Math.hypot(var5, var7);
      return var17 < 1.0E-9 ? null : new double[]{var5 / var17, var7 / var17};
   }

   private IliIiilllliIiill() {
   }

   public static boolean IilliliilIIi(double sx, double threats, iiliIiIIiiIi sz, List<Iiiiiilliiiiil> w) {
      if (sz != null && w != null && !w.isEmpty()) {
         double var6 = sz.IliIlllilIi() - sx;
         double var8 = sz.iIlIlllllill() - threats;
         double var10 = Math.hypot(var6, var8);
         if (var10 < Double.longBitsToDouble(4531653058289157255L ^ 23481744776145162L)) {
            return false;
         } else {
            double[] var12 = IliIlllilIi(sx, threats, w);
            return var12 == null ? false : (var6 * var12[0] + var8 * var12[1]) / var10 < Double.longBitsToDouble(5947528853570984757L ^ 7879873041122928646L);
         }
      } else {
         return false;
      }
   }
}
