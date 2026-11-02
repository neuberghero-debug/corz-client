package gg.corz;

import java.util.List;

public final class IlIIiillllIIiill {
   private static final double iiIilliill = 1.0E-7;
   public static final lIiIlIIliIiIlIIl Illilliill = (y, x, z) -> false;
   private static final double lIlilliill = 1.0E8;
   public static final double lIIilliill = 0.98;
   public static final double ilIilliill = 0.3;
   public static final double IlIilliill = 0.546;
   private static final int IIlilliill = 64;
   public static final double IiIilliill = 1.8;
   private static final double iIlilliill = 0.6;
   public static final double IIIilliill = 0.08;
   private static final double liIilliill = 3.92;
   public static final double llIilliill = 0.003;
   public static final double iIIilliill = 0.91;

   private static liIIiIlliiIIiIll IlIlllIlilIl(
      liIIiIlliiIIiIll airInputX, lIiIlIIliIiIlIIl s, double keepGroundSpeed, double sigmaPerTick, boolean t, double kicked, boolean airInputZ
   ) {
      long var48 = 7856103650933369418L;
      long var50 = -8520627670834991839L;
      long var52 = 5605414405598151804L;
      long var54 = -311656737229331024L;
      long var40 = 152344578097741814L;
      long var42 = -1323375021078472462L;
      long var44 = -5803511746008791206L;
      long var46 = 3303167276745358549L;
      lIiIlIIliIiIlIIl var10 = s == null ? Illilliill : s;
      if (IIlllIlliIll(airInputX.IliIlllilIi(), airInputX.liiiIIllIl(), airInputX.iIlIlllllill())
         && IIlllIlliIll(airInputX.IilliliilIIi(), airInputX.lIiiIiIlilli(), airInputX.iliIiiliiiii())
         && IIlllIlliIll(keepGroundSpeed, sigmaPerTick, 0.0)
         && !(Math.abs(airInputX.IliIlllilIi()) > 1.0E8)
         && !(Math.abs(airInputX.liiiIIllIl()) > 1.0E8)
         && !(Math.abs(airInputX.iIlIlllllill()) > 1.0E8)) {
         var40 ^= ((long)airInputX.IIIllIIliIIl() << 32 ^ var40) & -1L << 32;
         double var12 = (int)(var40 >>> 32) != 0 ? 0.546 : 0.91;
         double var14 = airInputX.IilliliilIIi();
         double var16 = airInputX.lIiiIiIlilli();
         double var18 = airInputX.iliIiiliiiii();
         if ((int)(var40 >>> 32) == 0) {
            var14 += keepGroundSpeed;
            var18 += sigmaPerTick;
         }

         double var20 = airInputX.IliIlllilIi();
         double var22 = airInputX.liiiIIllIl();
         double var24 = airInputX.iIlIlllllill();
         var40 ^= (0L ^ var40) & -1L >>> 32;
         var42 ^= ((long)Illlllllilll(var20 - 0.3 + 1.0E-7) << 32 ^ var42) & -1L << 32;
         var42 ^= ((long)Illlllllilll(var20 + 0.3 - 1.0E-7) ^ var42) & -1L >>> 32;
         var44 ^= ((long)Illlllllilll(var24 - 0.3 + 1.0E-7) << 32 ^ var44) & -1L << 32;
         var44 ^= ((long)Illlllllilll(var24 + 0.3 - 1.0E-7) ^ var44) & -1L >>> 32;
         if (var16 < 0.0) {
            double var31 = var22 + var16;
            var46 ^= ((long)Illlllllilll(var22 + 1.0E-7) << 32 ^ var46) & -1L << 32;
            var46 ^= (
                  (long)(
                        (int)(var40 >>> 32) != 0
                              && var22 - (double)((int)(var46 >>> 32)) > 1.0E-7
                              && IiIlliIliiIl(var10, (int)(var42 >>> 32), (int)var42, (int)(var46 >>> 32), (int)(var46 >>> 32), (int)(var44 >>> 32), (int)var44)
                           ? 1
                           : 0
                     )
                     ^ var46
               )
               & -1L >>> 32;
            if ((int)var46 == 0) {
               var48 ^= ((long)((int)(var46 >>> 32) - 1) << 32 ^ var48) & -1L << 32;
               var48 ^= ((long)Math.max(Illlllllilll(var31), (int)(var48 >>> 32) - 64) ^ var48) & -1L >>> 32;

               for (var50 ^= ((long)((int)(var48 >>> 32)) << 32 ^ var50) & -1L << 32; (int)(var50 >>> 32) >= (int)var48; var50 += -4294967296L) {
                  if (IiIlliIliiIl(var10, (int)(var42 >>> 32), (int)var42, (int)(var50 >>> 32), (int)(var50 >>> 32), (int)(var44 >>> 32), (int)var44)) {
                     var22 = (double)((int)(var50 >>> 32)) + 1.0;
                     var46 ^= (1L ^ var46) & -1L >>> 32;
                     break;
                  }
               }
            }

            if ((int)var46 != 0) {
               var16 = 0.0;
               var40 ^= (1L ^ var40) & -1L >>> 32;
            } else {
               var22 = var31;
            }
         } else if (var16 > 0.0) {
            double var57 = var22 + var16;
            var46 ^= ((long)Iilllilliill(var22 + 1.8 - 1.0E-7) << 32 ^ var46) & -1L << 32;
            var46 ^= ((long)Math.min(Iilllilliill(var57 + 1.8) - 1, (int)(var46 >>> 32) + 64) ^ var46) & -1L >>> 32;
            var48 ^= (0L ^ var48) & -1L << 32;

            for (var48 ^= ((long)((int)(var46 >>> 32)) ^ var48) & -1L >>> 32; (int)var48 <= (int)var46; var48 ^= (var48 ^ var48 + (long)1) & -1L >>> 32) {
               if (IiIlliIliiIl(var10, (int)(var42 >>> 32), (int)var42, (int)var48, (int)var48, (int)(var44 >>> 32), (int)var44)) {
                  var22 = (double)((int)var48) - 1.8;
                  var48 ^= (4294967296L ^ var48) & -1L << 32;
                  break;
               }
            }

            if ((int)(var48 >>> 32) != 0) {
               var16 = 0.0;
            } else {
               var22 = var57;
            }
         }

         var50 ^= ((long)Illlllllilll(var22 + 1.0E-7) ^ var50) & -1L >>> 32;
         if ((int)(var40 >>> 32) != 0 || (int)var40 != 0) {
            var50 ^= ((long)Math.max((int)var50, Illlllllilll(((int)(var40 >>> 32) != 0 ? airInputX.liiiIIllIl() : var22) + 0.6)) ^ var50) & -1L >>> 32;
         }

         var52 ^= ((long)Illlllllilll(var22 + 1.8 - 1.0E-7) << 32 ^ var52) & -1L << 32;
         if (var14 != 0.0) {
            double var33 = var20 + var14;
            if (var14 > 0.0) {
               var48 ^= ((long)Iilllilliill(var20 + 0.3 - 1.0E-7) ^ var48) & -1L >>> 32;
               var50 ^= ((long)Math.min(Iilllilliill(var33 + 0.3) - 1, (int)var48 + 64) << 32 ^ var50) & -1L << 32;
               var48 ^= (
                     (long)(
                              (int)var48 <= (int)(var50 >>> 32)
                                    && IiIlliIliiIl(var10, (int)var48, (int)(var50 >>> 32), (int)var50, (int)(var52 >>> 32), (int)(var44 >>> 32), (int)var44)
                                 ? 1
                                 : 0
                           )
                           << 32
                        ^ var48
                  )
                  & -1L << 32;
            } else {
               var48 ^= ((long)(Illlllllilll(var20 - 0.3 + 1.0E-7) - 1) ^ var48) & -1L >>> 32;
               var50 ^= ((long)Math.max(Illlllllilll(var33 - 0.3), (int)var48 - 64) << 32 ^ var50) & -1L << 32;
               var48 ^= (
                     (long)(
                              (int)(var50 >>> 32) <= (int)var48
                                    && IiIlliIliiIl(var10, (int)(var50 >>> 32), (int)var48, (int)var50, (int)(var52 >>> 32), (int)(var44 >>> 32), (int)var44)
                                 ? 1
                                 : 0
                           )
                           << 32
                        ^ var48
                  )
                  & -1L << 32;
            }

            if ((int)(var48 >>> 32) != 0) {
               var14 = 0.0;
            } else {
               var20 = var33;
            }
         }

         var46 ^= ((long)Illlllllilll(var20 - 0.3 + 1.0E-7) << 32 ^ var46) & -1L << 32;
         var46 ^= ((long)Illlllllilll(var20 + 0.3 - 1.0E-7) ^ var46) & -1L >>> 32;
         if (var18 != 0.0) {
            double var35 = var24 + var18;
            if (var18 > 0.0) {
               var52 ^= ((long)Iilllilliill(var24 + 0.3 - 1.0E-7) ^ var52) & -1L >>> 32;
               var54 ^= ((long)Math.min(Iilllilliill(var35 + 0.3) - 1, (int)var52 + 64) << 32 ^ var54) & -1L << 32;
               var50 ^= (
                     (long)(
                              (int)var52 <= (int)(var54 >>> 32)
                                    && IiIlliIliiIl(var10, (int)(var46 >>> 32), (int)var46, (int)var50, (int)(var52 >>> 32), (int)var52, (int)(var54 >>> 32))
                                 ? 1
                                 : 0
                           )
                           << 32
                        ^ var50
                  )
                  & -1L << 32;
            } else {
               var52 ^= ((long)(Illlllllilll(var24 - 0.3 + 1.0E-7) - 1) ^ var52) & -1L >>> 32;
               var54 ^= ((long)Math.max(Illlllllilll(var35 - 0.3), (int)var52 - 64) << 32 ^ var54) & -1L << 32;
               var50 ^= (
                     (long)(
                              (int)(var54 >>> 32) <= (int)var52
                                    && IiIlliIliiIl(var10, (int)(var46 >>> 32), (int)var46, (int)var50, (int)(var52 >>> 32), (int)(var54 >>> 32), (int)var52)
                                 ? 1
                                 : 0
                           )
                           << 32
                        ^ var50
                  )
                  & -1L << 32;
            }

            if ((int)(var50 >>> 32) != 0) {
               var18 = 0.0;
            } else {
               var24 = var35;
            }
         }

         var16 = (var16 - 0.08) * 0.98;
         if (!t || (int)(var40 >>> 32) == 0 || airInputZ) {
            var14 *= var12;
            var18 *= var12;
         }

         if (Math.abs(var14) < 0.003) {
            var14 = 0.0;
         }

         if (Math.abs(var18) < 0.003) {
            var18 = 0.0;
         }

         return new liIIiIlliiIIiIll(var20, var22, var24, var14, var16, var18, (boolean)((int)var40), airInputX.IlIlllIlilIl() + kicked);
      } else {
         return new liIIiIlliiIIiIll(
            airInputX.IliIlllilIi(),
            airInputX.liiiIIllIl(),
            airInputX.iIlIlllllill(),
            airInputX.IilliliilIIi(),
            airInputX.lIiiIiIlilli(),
            airInputX.iliIiiliiiii(),
            airInputX.IIIllIIliIIl(),
            airInputX.IlIlllIlilIl() + kicked
         );
      }
   }

   private static boolean IIlllIlliIll(double b, double c, double a) {
      return Double.isFinite(b) && Double.isFinite(c) && Double.isFinite(a);
   }

   private static int Iilllilliill(double v) {
      return (int)Math.ceil(v);
   }

   private static int Illlllllilll(double v) {
      return (int)Math.floor(v);
   }

   public static double lIiiIiIlilli(double k, int vy0) {
      return -3.92 + (k + 3.92) * Math.pow(0.98, (double)vy0);
   }

   public static double iliIiiliiiii(double k, int dyObserved) {
      return dyObserved < 1 ? Double.NaN : (k + 3.92 * (double)dyObserved) / (50.0 * (1.0 - Math.pow(0.98, (double)dyObserved))) - 3.92;
   }

   public static iIlIiiIiIllIiiIi liiiIIllIl(
      liIIiIlliiIIiIll keepGroundSpeed,
      int start,
      lIiIlIIliIiIlIIl ticks,
      double t,
      double sigmaPerTick,
      boolean airInputX,
      double airInputZ,
      List<Iiillliliillli> kicks
   ) {
      long var19 = 1540931369209863954L;
      long var21 = 5638440597432568409L;
      var19 ^= ((long)Math.max(0, start) << 32 ^ var19) & -1L << 32;
      liIIiIlliiIIiIll[] var12 = new liIIiIlliiIIiIll[(int)(var19 >>> 32) + 1];
      liIIiIlliiIIiIll var13 = keepGroundSpeed;
      var19 ^= (0L ^ var19) & -1L >>> 32;
      var21 ^= (0L ^ var21) & -1L << 32;

      while ((int)(var21 >>> 32) <= (int)(var19 >>> 32)) {
         var21 ^= (0L ^ var21) & -1L >>> 32;
         if (kicks != null) {
            for (Iiillliliillli var18 : kicks) {
               if (var18 != null && var18.IliIlllilIi() == (int)(var21 >>> 32)) {
                  var13 = IIIllIIliIIl(var13, var18);
                  var21 ^= (1L ^ var21) & -1L >>> 32;
               }
            }
         }

         var12[(int)(var21 >>> 32)] = var13;
         if (!var13.IIIllIIliIIl()) {
            var19 ^= (1L ^ var19) & -1L >>> 32;
         }

         if ((int)(var21 >>> 32) < (int)(var19 >>> 32)) {
            var13 = IlIlllIlilIl(var13, ticks, t, sigmaPerTick, airInputX && (int)var19 == 0, airInputZ, (boolean)((int)var21));
         }

         var21 += 4294967296L;
      }

      return new iIlIiiIiIllIiiIi(var12);
   }

   public static int IilliliilIIi(double vy0) {
      return !(vy0 > 0.0) ? 0 : (int)Math.ceil(Math.log(3.92 / (vy0 + 3.92)) / Math.log(0.98));
   }

   private static boolean IiIlliIliiIl(lIiIlIIliIiIlIIl y1, int x0, int t, int y0, int z0, int x1, int z1) {
      long var10 = -9028007577779401912L;
      long var12 = 8406514014084013855L;
      var10 ^= ((long)y0 << 32 ^ var10) & -1L << 32;

      while ((int)(var10 >>> 32) <= z0) {
         for (var10 ^= ((long)x0 ^ var10) & -1L >>> 32; (int)var10 <= t; var10 ^= (var10 ^ var10 + (long)1) & -1L >>> 32) {
            for (var12 ^= ((long)x1 << 32 ^ var12) & -1L << 32; (int)(var12 >>> 32) <= z1; var12 += 4294967296L) {
               if (y1.solid((int)var10, (int)(var10 >>> 32), (int)(var12 >>> 32))) {
                  return true;
               }
            }
         }

         var10 += 4294967296L;
      }

      return false;
   }

   private IlIIiillllIIiill() {
   }

   private static liIIiIlliiIIiIll IIIllIIliIIl(liIIiIlliiIIiIll s, Iiillliliillli k) {
      return k.lIiiIiIlilli()
         ? new liIIiIlliiIIiIll(
            s.IliIlllilIi(), s.liiiIIllIl(), s.iIlIlllllill(), k.liiiIIllIl(), k.iIlIlllllill(), k.IilliliilIIi(), s.IIIllIIliIIl(), s.IlIlllIlilIl()
         )
         : new liIIiIlliiIIiIll(
            s.IliIlllilIi(),
            s.liiiIIllIl(),
            s.iIlIlllllill(),
            s.IilliliilIIi() + k.liiiIIllIl(),
            s.lIiiIiIlilli() + k.iIlIlllllill(),
            s.iliIiiliiiii() + k.IilliliilIIi(),
            s.IIIllIIliIIl(),
            s.IlIlllIlilIl()
         );
   }

   public static double iIlIlllllill(double k, int vy0) {
      return -3.92 * (double)vy0 + 50.0 * (k + 3.92) * (1.0 - Math.pow(0.98, (double)vy0));
   }

   public static liIIiIlliiIIiIll IliIlllilIi(
      liIIiIlliiIIiIll s, lIiIlIIliIiIlIIl airInputX, double airInputZ, double t, boolean sigmaPerTick, double keepGroundSpeed
   ) {
      return IlIlllIlilIl(s, airInputX, airInputZ, t, sigmaPerTick, keepGroundSpeed, false);
   }
}
