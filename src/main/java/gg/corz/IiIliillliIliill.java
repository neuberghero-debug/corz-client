package gg.corz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class IiIliillliIliill {
   private static final int[] iIiiIiiill = new int[]{1, -1, 0, 0};
   public static final double illiIiiill = 1.62;
   static final double liliIiiill = -20.0;
   static final double IIiiIiiill = 1.5;
   private static final int[] IliiIiiill = new int[]{0, 0, 1, -1};
   static final double lIiiIiiill = 3.5;
   static final double iiliIiiill = 60.0;
   public static final double llliIiiill = 4.3;
   public static final int IiliIiiill = 3;

   public static double IliIlllilIi(double ay, double ey, double az, int ax, int ez, int ex) {
      double var9 = (double)ax + Double.longBitsToDouble(-8780227147974325788L ^ -5060253855766296092L) - ay;
      double var11 = (double)ez + Double.longBitsToDouble(3496740719380639873L ^ 1109832916874276993L) - ey;
      double var13 = (double)ex + Double.longBitsToDouble(7866720022310966681L ^ 5966200979560617369L) - az;
      return Math.sqrt(var9 * var9 + var11 * var11 + var13 * var13);
   }

   public static double liiiIIllIl(double az, double ax, double ay, int ex, int ey, int ez) {
      double var9 = (double)ex + Double.longBitsToDouble(-753200484137439726L ^ -3860684227023081966L) - az;
      double var11 = (double)ey + Double.longBitsToDouble(1753671029345511659L ^ 2861556537678653675L) - ax;
      double var13 = (double)ez + Double.longBitsToDouble(7935200967415024780L ^ 5908581135098301580L) - ay;
      return Math.toDegrees(Math.atan2(-var11, Math.hypot(var9, var13)));
   }

   static boolean IlIlllIlilIl(lIilIiliIilIil x0, double az, double ax, double x1, double y0, double y1, double z0, int c, int z1, int ay) {
      double var16 = y0 - az;
      double var18 = y1 - ax;
      double var20 = z0 - x1;
      double var22 = Math.sqrt(var16 * var16 + var18 * var18 + var20 * var20);
      int var24 = Math.max(1, (int)Math.ceil(var22 / 0.05));
      int var25 = Integer.MIN_VALUE;
      int var26 = Integer.MIN_VALUE;
      int var27 = Integer.MIN_VALUE;

      for (int var28 = 1; var28 <= var24; var28++) {
         double var29 = (double)var28 / (double)var24;
         int var31 = (int)Math.floor(az + var16 * var29);
         int var32 = (int)Math.floor(ax + var18 * var29);
         int var33 = (int)Math.floor(x1 + var20 * var29);
         if (var31 != var25 || var32 != var26 || var33 != var27) {
            var25 = var31;
            var26 = var32;
            var27 = var33;
            if (var31 == c && var32 == z1 && var33 == ay) {
               return true;
            }

            if (lIilIiliIilIil.liiiIIllIl(x0.IliIlllilIi(var31, var32, var33), 1)) {
               return false;
            }
         }
      }

      return false;
   }

   public static boolean lIiiIiIlilli(lIilIiliIilIil z, int x, int c, int y) {
      for (int var4 = 0; var4 < 4; var4++) {
         int var5 = x + iIiiIiiill[var4];
         int var6 = y + IliiIiiill[var4];
         if (lIilIiliIilIil.iIlIlllllill(z.IliIlllilIi(var5, c, var6))
            && lIilIiliIilIil.iIlIlllllill(z.IliIlllilIi(var5, c + 1, var6))
            && iliIiiliiiii(z, var5, c, var6, 4) > 3) {
            return true;
         }
      }

      return false;
   }

   public static lliIllliliIlll iIlIlllllill(lIilIiliIilIil c, int sight, int ax, int az, lliIiIililiIiIil ay) {
      ArrayList var5 = new ArrayList();
      ArrayList var6 = new ArrayList();
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      int var11 = (int)Math.ceil(4.3);
      int var12 = (int)Math.floor((double)ax + 0.5 - 4.3 - 1.62);
      int var13 = (int)Math.ceil((double)ax + 0.5 + 4.3 - 1.62);

      for (int var14 = var12; var14 <= var13; var14++) {
         for (int var15 = sight - var11; var15 <= sight + var11; var15++) {
            for (int var16 = az - var11; var16 <= az + var11; var16++) {
               if (var15 != sight || var16 != az || var14 < ax - 1 || var14 > ax + 1) {
                  double var17 = (double)var15 + 0.5;
                  double var19 = (double)var14 + 1.62;
                  double var21 = (double)var16 + 0.5;
                  if (!(IliIlllilIi(var17, var19, var21, sight, ax, az) > 4.3)) {
                     int var23 = c.IliIlllilIi(var15, var14 - 1, var16);
                     int var24 = c.IliIlllilIi(var15, var14, var16);
                     int var25 = c.IliIlllilIi(var15, var14 + 1, var16);
                     if (!lIilIiliIilIil.liiiIIllIl(var23 | var24 | var25, 256)) {
                        if (!lIilIiliIilIil.liiiIIllIl(var23, 1)) {
                           if (lIilIiliIilIil.liiiIIllIl(var23, 2) && lIilIiliIilIil.iIlIlllllill(var24) && lIilIiliIilIil.iIlIlllllill(var25)) {
                              var8++;
                           }
                        } else if (lIilIiliIilIil.iIlIlllllill(var24) && lIilIiliIilIil.iIlIlllllill(var25)) {
                           var7++;
                           if (lIilIiliIilIil.IilliliilIIi(var23) && !lIilIiliIilIil.liiiIIllIl(var24 | var25, 10)) {
                              if (lIilIiliIilIil.liiiIIllIl(var24 | var25, 4)) {
                                 var9++;
                              } else if (lIilIiliIilIil.IIIllIIliIIl(c, var15, var14, var16)) {
                                 var8++;
                              } else if (ay != null && ay.sees(var17, var19, var21, sight, ax, az)) {
                                 var5.add(new Ilililllilil(var15, var14, var16, true, 0, IilliliilIIi(c, var15, var14, var16, sight, ax, az)));
                              }
                           } else if (lIilIiliIilIil.liiiIIllIl(var23 | var24 | var25, 10)) {
                              var8++;
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      for (int var26 = 0; var26 >= -1; var26--) {
         for (int var28 = 0; var28 < 4; var28++) {
            int var29 = sight + iIiiIiiill[var28];
            int var30 = ax + var26;
            int var18 = az + IliiIiiill[var28];
            int var31 = c.IliIlllilIi(var29, var30 - 1, var18);
            int var20 = c.IliIlllilIi(var29, var30, var18);
            int var32 = c.IliIlllilIi(var29, var30 + 1, var18);
            if (!lIilIiliIilIil.liiiIIllIl(var31 | var20 | var32, 256)) {
               if (lIilIiliIilIil.liiiIIllIl(var20 | var32, 4)) {
                  var9++;
               } else if (lIilIiliIilIil.IilliliilIIi(var31) && !lIilIiliIilIil.liiiIIllIl(var20 | var32, 10)) {
                  boolean var22 = lIilIiliIilIil.iIlIlllllill(var20) || lIilIiliIilIil.iliIiiliiiii(c, var29, var30, var18);
                  boolean var33 = lIilIiliIilIil.iIlIlllllill(var32) || lIilIiliIilIil.iliIiiliiiii(c, var29, var30 + 1, var18);
                  if (!var22 || !var33) {
                     if (lIilIiliIilIil.liiiIIllIl(var20 | var32, 96)) {
                        var10++;
                     }
                  } else if (lIilIiliIilIil.IIIllIIliIIl(c, var29, var30, var18)) {
                     var8++;
                  } else {
                     int var34 = (lIilIiliIilIil.iIlIlllllill(var20) ? 0 : 1) + (lIilIiliIilIil.iIlIlllllill(var32) ? 0 : 1);
                     var6.add(new Ilililllilil(var29, var30, var18, false, var34, 2.0 + (double)var34 + IilliliilIIi(c, var29, var30, var18, sight, ax, az)));
                  }
               } else if (lIilIiliIilIil.liiiIIllIl(var31 | var20 | var32, 2)) {
                  var8++;
               }
            }
         }
      }

      Comparator var27 = Comparator.comparingDouble(Ilililllilil::iliIiiliiiii)
         .thenComparingInt(Ilililllilil::liiiIIllIl)
         .thenComparingInt(Ilililllilil::IliIlllilIi)
         .thenComparingInt(Ilililllilil::iIlIlllllill);
      var5.sort(var27);
      var6.sort(var27);
      return new lliIllliliIlll(List.copyOf(var5), List.copyOf(var6), var7, var8, var9, var10);
   }

   public static lliIiIililiIiIil IIIllIIliIIl(lIilIiliIilIil c) {
      return (cx, az, ax, ex, ey, ay) -> {
         double[][] var10 = new double[][]{
            {(double)ex + 0.5, (double)ey + 0.99, (double)ay + 0.5},
            {(double)ex + 0.5, (double)ey + 0.01, (double)ay + 0.5},
            {(double)ex + 0.01, (double)ey + 0.5, (double)ay + 0.5},
            {(double)ex + 0.99, (double)ey + 0.5, (double)ay + 0.5},
            {(double)ex + 0.5, (double)ey + 0.5, (double)ay + 0.01},
            {(double)ex + 0.5, (double)ey + 0.5, (double)ay + 0.99}
         };

         for (double[] var14 : var10) {
            if (IlIlllIlilIl(c, cx, az, ax, var14[0], var14[1], var14[2], ex, ey, ay)) {
               return true;
            }
         }

         return false;
      };
   }

   public static int iliIiiliiiii(lIilIiliIilIil y, int z, int x, int c, int max) {
      int var5;
      for (var5 = 0; var5 < max; var5++) {
         int var6 = y.IliIlllilIi(z, x - 1 - var5, c);
         if (lIilIiliIilIil.liiiIIllIl(var6, 261)) {
            break;
         }
      }

      return var5;
   }

   static double IilliliilIIi(lIilIiliIilIil x, int z, int c, int az, int ay, int ax, int y) {
      double var7 = (double)z + 0.5;
      double var9 = (double)c + 1.62;
      double var11 = (double)az + 0.5;
      double var13 = IliIlllilIi(var7, var9, var11, ay, ax, y);
      double var15 = liiiIIllIl(var7, var9, var11, ay, ax, y);
      double var17 = var13;
      if (var13 < 1.5) {
         var17 = var13 + (1.5 - var13) * 2.0;
      }

      if (var13 > 3.5) {
         var17 += (var13 - 3.5) * 2.0;
      }

      if (var15 < -20.0) {
         var17 += (-20.0 - var15) / 10.0;
      }

      if (var15 > 60.0) {
         var17 += (var15 - 60.0) / 10.0;
      }

      if (lIiiIiIlilli(x, z, c, az)) {
         var17 += 2.0;
      }

      return var17;
   }

   private IiIliillliIliill() {
   }
}
