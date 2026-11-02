package gg.corz;

import java.util.ArrayList;
import java.util.List;

public final class iliiiIiIiiiiIi {
   public static final double iIlIlliiiIllIlliii = 0.05;
   public static final double IilIlliiililIlliii = 0.05;
   public static final double ilIIlliiiIiIIlliii = 1.27;
   public static final double iilIlliiiIIiIlliii = 0.35;
   public static final double liIIlliiiiiIIlliii = 0.29000000000000004;
   public static final double lIIIlliiiiIIIlliii = 0.3;
   public static final double IIlIlliiilIlIlliii = 0.3;
   public static final double IlIIlliiillIIlliii = 1.62;
   public static final double[] lIiIlliiiiIiIlliii = new double[]{0.55, 0.67, 0.79};
   public static final double lllIlliiiillIlliii = 0.12;

   private static double lIiiIiIlilli(lliliiililii cz, double cx, double probe, double m, IIlIiiIilIlIiiIi start, double eyeY) {
      for (double var10 = eyeY; var10 >= 0.049999999999000004; var10 *= 0.5) {
         if (cz.IliIlllilIi(cx - var10, m, probe - var10, start) != null
            && cz.IliIlllilIi(cx + var10, m, probe - var10, start) != null
            && cz.IliIlllilIi(cx - var10, m, probe + var10, start) != null
            && cz.IliIlllilIi(cx + var10, m, probe + var10, start) != null) {
            return var10;
         }
      }

      return 0.0;
   }

   static List<IIlIiiIilIlIiiIi> liiiIIllIl(boolean sneakRequired, boolean sneakingNow) {
      ArrayList var2 = new ArrayList(2);
      if (sneakingNow) {
         var2.add(IIlIiiIilIlIiiIi.illIiiiIIi);
         return var2;
      } else {
         if (sneakRequired) {
            var2.add(IIlIiiIilIlIiiIi.illIiiiIIi);
            var2.add(IIlIiiIilIlIiiIi.lllIiiiIIi);
         } else {
            var2.add(IIlIiiIilIlIiiIi.lllIiiiIIi);
            var2.add(IIlIiiIilIlIiiIi.illIiiiIIi);
         }

         return var2;
      }
   }

   public static double IlIlllIlilIl(long stand, long x, double target, double z) {
      long var12 = -4494241825449463486L;
      long var14 = 942265716020141830L;
      var12 ^= ((long)llIiIiililIiIiil.IiIlliIliiIl(stand) << 32 ^ var12) & -1L << 32;
      var12 ^= ((long)llIiIiililIiIiil.Illlllllilll(stand) ^ var12) & -1L >>> 32;
      var14 ^= ((long)Integer.signum(llIiIiililIiIiil.IiIlliIliiIl(x) - (int)(var12 >>> 32)) << 32 ^ var14) & -1L << 32;
      var14 ^= ((long)Integer.signum(llIiIiililIiIiil.Illlllllilll(x) - (int)var12) ^ var14) & -1L >>> 32;
      return (int)(var14 >>> 32) != 0
         ? (target - ((double)((int)(var12 >>> 32)) + 0.5)) * (double)((int)(var14 >>> 32))
         : (z - ((double)((int)var12) + 0.5)) * (double)((int)var14);
   }

   private static iIliillIlliill IilliliilIIi(liIlliiiiIllii bodyY, lliliiililii r, long target, long probe, double cz, double cx, double stand) {
      long var20 = -1121907724667752087L;
      double var12 = bodyY.IilliliilIIi() ? Math.hypot(bodyY.lIiiIiIlilli() - cz, bodyY.IIIllIIliIIl() - cx) : 0.0;
      var20 ^= (0L ^ var20) & -1L << 32;

      for (IIlIiiIilIlIiiIi var16 : liiiIIllIl(bodyY.IlIlllIlilIl(), false)) {
         lIlIIiiliIlIIiil var17 = r.IliIlllilIi(cz, IliIlllilIi(stand, var16), cx, var16);
         if (var17 != null) {
            var20 ^= (4294967296L ^ var20) & -1L << 32;
            if (!bodyY.IilliliilIIi()) {
               return new iIliillIlliill(
                  iIilIIllIlilIIll.lilIlIllll,
                  lilllIIliilllIIl.lllliillIl,
                  target,
                  probe,
                  var16,
                  var16 == IIlIiiIilIlIiiIi.illIiiiIIi,
                  var17,
                  iilliIilIIiliIil.IliIlllilIi(cz, cx, 0.12),
                  0.0,
                  0.29000000000000004
               );
            }

            if (!(var12 < 0.1) && r.iIlIlllllill(cz, stand, cx, var16)) {
               double var18 = lIiiIiIlilli(r, cz, cx, IliIlllilIi(stand, var16), var16, Math.min(0.12, var12 * 0.5));
               if (!(var18 <= 0.0)) {
                  return new iIliillIlliill(
                     iIilIIllIlilIIll.IilIlIllll,
                     lilllIIliilllIIl.lllliillIl,
                     target,
                     probe,
                     var16,
                     var16 == IIlIiiIilIlIiiIi.illIiiiIIi,
                     var17,
                     iilliIilIIiliIil.IliIlllilIi(cz, cx, var18),
                     Math.max(0.0, var12 - var18),
                     0.29000000000000004
                  );
               }
            }
         }
      }

      return (int)(var20 >>> 32) != 0 ? iIliillIlliill.lIiiIiIlilli(target, probe, lilllIIliilllIIl.IliliillIl) : null;
   }

   private static iIliillIlliill iliIiiliiiii(liIlliiiiIllii nz, lliliiililii bodyY, long cx, long cz, double r, double nx, double target, int probe, int stand) {
      long var48 = -5455876813797306452L;
      long var44 = 1777405501049920650L;
      long var46 = -4119579139108077661L;
      double var14 = IliIlllilIi(target, IIlIiiIilIlIiiIi.illIiiiIIi);
      double var16 = -1.0;
      lIlIIiiliIlIIiil var18 = null;

      for (var44 ^= ((long)(lIiIlliiiiIiIlliii.length - 1) << 32 ^ var44) & -1L << 32; (int)(var44 >>> 32) >= 0; var44 += -4294967296L) {
         double var20 = lIiIlliiiiIiIlliii[(int)(var44 >>> 32)];
         lIlIIiiliIlIIiil var22 = bodyY.IliIlllilIi(r + (double)probe * var20, var14, nx + (double)stand * var20, IIlIiiIilIlIiiIi.illIiiiIIi);
         if (var22 == null) {
            if ((int)(var44 >>> 32) == lIiIlliiiiIiIlliii.length - 1) {
               return null;
            }
            break;
         }

         if (var18 == null) {
            var18 = var22;
         }

         var16 = var20;
      }

      double var19 = var16;
      double var21 = 0.8;
      double var23 = 0.79;
      double var25 = nz.IilliliilIIi() ? (probe != 0 ? (nz.lIiiIiIlilli() - r) * (double)probe : (nz.IIIllIIliIIl() - nx) * (double)stand) : 0.0;
      double var27 = nz.IilliliilIIi() ? (probe != 0 ? nz.IIIllIIliIIl() - nx : nz.lIiiIiIlilli() - r) : 0.0;
      double var29 = -1.0;
      double[] var31 = new double[]{0.35, 0.1};
      var44 ^= ((long)var31.length ^ var44) & -1L >>> 32;

      for (var46 ^= (0L ^ var46) & -1L << 32; (int)(var46 >>> 32) < (int)var44; var46 += 4294967296L) {
         double var34 = var31[(int)(var46 >>> 32)];
         double var36 = r + (double)probe * var19;
         double var38 = nx + (double)stand * var19;
         double var40 = probe != 0 ? 0.0 : var34;
         double var42 = probe != 0 ? var34 : 0.0;
         if (bodyY.IliIlllilIi(var36 + var40, var14, var38 + var42, IIlIiiIilIlIiiIi.illIiiiIIi) != null
            && bodyY.IliIlllilIi(var36 - var40, var14, var38 - var42, IIlIiiIilIlIiiIi.illIiiiIIi) != null) {
            var29 = var34;
            break;
         }
      }

      if (var29 < 0.0) {
         return null;
      } else {
         if (nz.IilliliilIIi() && var25 >= var19 - 1.0E-9 && Math.abs(var27) <= var29 + 1.0E-9) {
            var19 = var25 + 0.05;
            if (var19 > var23 + 1.0E-9) {
               return iIliillIlliill.lIiiIiIlilli(cx, cz, lilllIIliilllIIl.IliliillIl);
            }
         }

         if (!bodyY.iIlIlllllill(r + (double)probe * var23, target, nx + (double)stand * var23, IIlIiiIilIlIiiIi.illIiiiIIi)) {
            return iIliillIlliill.lIiiIiIlilli(cx, cz, lilllIIliilllIIl.lilliillIl);
         } else {
            if (nz.IilliliilIIi()) {
               double var50 = nz.lIiiIiIlilli();
               double var33 = nz.IIIllIIliIIl();
               double var35 = r + (double)probe * var23;
               double var37 = nx + (double)stand * var23;
               var46 ^= ((long)((int)Math.ceil(Math.hypot(var35 - var50, var37 - var33) / 0.1)) ^ var46) & -1L >>> 32;

               for (long var57 = var48 ^ (4294967296L ^ var48) & -1L << 32; (int)(var57 >>> 32) < (int)var46; var57 += 4294967296L) {
                  double var41 = (double)((int)(var57 >>> 32)) / (double)((int)var46);
                  if (!bodyY.iIlIlllllill(var50 + (var35 - var50) * var41, target, var33 + (var37 - var33) * var41, IIlIiiIilIlIiiIi.illIiiiIIi)) {
                     return iIliillIlliill.lIiiIiIlilli(cx, cz, lilllIIliilllIIl.lilliillIl);
                  }
               }
            }

            iilliIilIIiliIil var51 = IIIllIIliIIl(r, nx, probe, stand, var19, var21, var23);
            iilliIilIIiliIil var32 = probe != 0
               ? new iilliIilIIiliIil(0, var51.iliIiiliiiii(), var51.IIIllIIliIIl(), nx - var29, nx + var29, var51.IIlllIlliIll(), var51.Illlllllilll())
               : new iilliIilIIiliIil(2, var51.iliIiiliiiii(), var51.IIIllIIliIIl(), r - var29, r + var29, var51.IIlllIlliIll(), var51.Illlllllilll());
            double var52 = Math.max(0.0, var19 - var25);
            return new iIliillIlliill(
               iIilIIllIlilIIll.IilIlIllll, lilllIIliilllIIl.lllliillIl, cx, cz, IIlIiiIilIlIiiIi.illIiiiIIi, true, var18, var32, var52, 0.29000000000000004
            );
         }
      }
   }

   private iliiiIiIiiiiIi() {
   }

   static iilliIilIIiliIil IIIllIIliIIl(double nz, double settle, int lo, int cx, double hi, double cz, double nx) {
      if (lo != 0) {
         double var16 = lo > 0 ? nz + hi : nz - cz;
         double var17 = lo > 0 ? nz + cz : nz - hi;
         return new iilliIilIIiliIil(0, var16, var17, settle - 0.35, settle + 0.35, nz + (double)lo * nx, settle);
      } else {
         double var12 = cx > 0 ? settle + hi : settle - cz;
         double var14 = cx > 0 ? settle + cz : settle - hi;
         return new iilliIilIIiliIil(2, var12, var14, nz - 0.35, nz + 0.35, nz, settle + (double)cx * nx);
      }
   }

   public static iIliillIlliill iIlIlllllill(liIlliiiiIllii r, lliliiililii probe) {
      long var32 = -2602427299261275471L;
      long var24 = -724362553158017371L;
      long var26 = -3417207535585104171L;
      long var28 = 3793599551710323890L;
      long var30 = 5197218782496191554L;
      long var2 = r.IliIlllilIi();
      long var4 = r.liiiIIllIl();
      var24 ^= ((long)llIiIiililIiIiil.IiIlliIliiIl(var4) << 32 ^ var24) & -1L << 32;
      var24 ^= ((long)llIiIiililIiIiil.IIlllIlliIll(var4) ^ var24) & -1L >>> 32;
      var26 ^= ((long)llIiIiililIiIiil.Illlllllilll(var4) << 32 ^ var26) & -1L << 32;
      var26 ^= ((long)llIiIiililIiIiil.IiIlliIliiIl(var2) ^ var26) & -1L >>> 32;
      var28 ^= ((long)llIiIiililIiIiil.IIlllIlliIll(var2) << 32 ^ var28) & -1L << 32;
      var28 ^= ((long)llIiIiililIiIiil.Illlllllilll(var2) ^ var28) & -1L >>> 32;
      double var12 = (double)((int)(var24 >>> 32)) + 0.5;
      double var14 = (double)((int)(var26 >>> 32)) + 0.5;
      double var16 = r.IilliliilIIi() ? r.iliIiiliiiii() : (double)((int)var24);
      var30 ^= ((long)Integer.signum((int)var26 - (int)(var24 >>> 32)) << 32 ^ var30) & -1L << 32;
      var30 ^= ((long)Integer.signum((int)var28 - (int)(var26 >>> 32)) ^ var30) & -1L >>> 32;
      var32 ^= (
            (long)(
                     Math.abs((int)var26 - (int)(var24 >>> 32)) + Math.abs((int)var28 - (int)(var26 >>> 32)) == 1 && (int)(var28 >>> 32) == (int)var24 - 1
                        ? 1
                        : 0
                  )
                  << 32
               ^ var32
         )
         & -1L << 32;
      if (r.IilliliilIIi()) {
         for (IIlIiiIilIlIiiIi var22 : liiiIIllIl(r.IlIlllIlilIl(), r.IiIlliIliiIl())) {
            lIlIIiiliIlIIiil var23 = probe.IliIlllilIi(r.lIiiIiIlilli(), IliIlllilIi(var16, var22), r.IIIllIIliIIl(), var22);
            if (var23 != null) {
               return new iIliillIlliill(
                  iIilIIllIlilIIll.illIlIllll,
                  lilllIIliilllIIl.lllliillIl,
                  var2,
                  var4,
                  var22,
                  var22 == IIlIiiIilIlIiiIi.illIiiiIIi,
                  var23,
                  iilliIilIIiliIil.IliIlllilIi(r.lIiiIiIlilli(), r.IIIllIIliIIl(), 0.12),
                  0.0,
                  0.29000000000000004
               );
            }
         }
      }

      iIliillIlliill var34 = IilliliilIIi(r, probe, var2, var4, var12, var14, var16);
      if (var34 != null && var34.liiiIIllIl()) {
         return r.IilliliilIIi() ? var34 : var34.iliIiiliiiii();
      } else {
         if ((int)(var32 >>> 32) != 0) {
            iIliillIlliill var35 = iliIiiliiiii(r, probe, var2, var4, var12, var14, var16, (int)(var30 >>> 32), (int)var30);
            if (var35 != null && !var35.liiiIIllIl()) {
               return var35;
            }

            if (var35 != null) {
               return r.IilliliilIIi() ? var35 : var35.iliIiiliiiii();
            }
         }

         if (var34 != null) {
            return var34;
         } else {
            var32 ^= (
                  (long)(
                        !probe.liiiIIllIl(var12, IliIlllilIi(var16, IIlIiiIilIlIiiIi.illIiiiIIi), var14)
                              && (
                                 (int)(var32 >>> 32) == 0
                                    || !probe.liiiIIllIl(
                                       var12 + (double)((int)(var30 >>> 32)) * 0.79,
                                       IliIlllilIi(var16, IIlIiiIilIlIiiIi.illIiiiIIi),
                                       var14 + (double)((int)var30) * 0.79
                                    )
                              )
                           ? 0
                           : 1
                     )
                     ^ var32
               )
               & -1L >>> 32;
            return iIliillIlliill.lIiiIiIlilli(var2, var4, (int)var32 != 0 ? lilllIIliilllIIl.illliillIl : lilllIIliilllIIl.IilliillIl);
         }
      }
   }

   public static double IliIlllilIi(double mode, IIlIiiIilIlIiiIi bodyY) {
      return mode + (bodyY == IIlIiiIilIlIiiIi.illIiiiIIi ? 1.27 : 1.62);
   }
}
