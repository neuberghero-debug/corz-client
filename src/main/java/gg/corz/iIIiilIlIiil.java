package gg.corz;

import java.util.Arrays;

public final class iIIiilIlIiil {
   public static final double iIiIlIiiIliIlIii = 1.2;
   private static final double lIIllIiiiIIllIii = 1.0E-9;
   public static final double lliIlIiiiliIlIii = 0.2125;
   public static final double IIiIlIiilIiIlIii = 12.0;
   public static final int IiiIlIiiliiIlIii = 200;
   private static final int[] iiiIlIiiIIIllIii = new int[0];

   public static double IliIlllilIi(double r) {
      return Double.isNaN(r) ? 0.0 : Math.max(0.0, 1.0 - Math.max(0.0, r) / 12.0);
   }

   public static int[] liiiIIllIl(int firstEta, double flight, int interval) {
      long var11 = 2643553600755666722L;
      if (interval >= 1 && firstEta <= interval) {
         double var4 = Double.isFinite(flight) ? Math.max(1.0, flight) : Double.NaN;
         int[] var6 = new int[Math.max(1, interval)];
         var11 ^= (0L ^ var11) & -1L << 32;

         for (var11 ^= (0L ^ var11) & -1L >>> 32; (int)var11 <= 200 + interval; var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
            long var9 = Double.isNaN(var4) ? ((int)var11 == 0 ? (long)firstEta : Long.MAX_VALUE) : (long)firstEta + Math.round((double)((int)var11) * var4);
            if (var9 > (long)interval) {
               break;
            }

            if (var9 >= 1L && ((int)(var11 >>> 32) <= 0 || (long)var6[(int)(var11 >>> 32) - 1] < var9)) {
               int var10001 = (int)(var11 >>> 32);
               var11 += 4294967296L;
               var6[var10001] = (int)var9;
            }
         }

         return Arrays.copyOf(var6, (int)(var11 >>> 32));
      } else {
         return (int[])iiiIlIiiIIIllIii.clone();
      }
   }

   private static double IIIllIIliIIl(double by, double az, double ax, double bz, double bx, double ay) {
      double var12 = by - bz;
      double var14 = az - bx;
      double var16 = ax - ay;
      return Math.sqrt(var12 * var12 + var14 * var14 + var16 * var16);
   }

   public static double[] iIlIlllllill(
      double landY, double cx, double vy, double clear, double sz, double sx, double booms, int[] cy, double vz, double vx, double sy, lIilIlIiiIilIlIi cz
   ) {
      long var49 = 8888965275764501669L;
      long var51 = -5041435578327989392L;
      if (IlIlllIlilIl(landY, cx, vy) && IlIlllIlilIl(clear, sz, sx) && !Double.isNaN(booms)) {
         int[] var22 = cy == null ? iiiIlIiiIIIllIii : cy;
         lIilIlIiiIilIlIi var23 = cz == null ? lIilIlIiiIilIlIi.liIiIIIIIi : cz;
         var49 ^= ((long)IlIlllIlilIl(vz, vx, sy) << 32 ^ var49) & -1L << 32;
         double var25 = landY;
         double var27 = cx;
         double var29 = vy;
         var49 ^= (0L ^ var49) & -1L >>> 32;

         for (long var59 = var51 ^ (4294967296L ^ var51) & -1L << 32; (int)(var59 >>> 32) <= 200; var59 += 4294967296L) {
            while ((int)var49 < var22.length && var22[(int)var49] < (int)(var59 >>> 32)) {
               var49 ^= (var49 ^ var49 + (long)1) & -1L >>> 32;
            }

            while ((int)var49 < var22.length && var22[(int)var49] == (int)(var59 >>> 32)) {
               var49 ^= (var49 ^ var49 + (long)1) & -1L >>> 32;
               if ((int)(var49 >>> 32) != 0) {
                  double var35 = var27 + 0.2125;
                  double var39 = IliIlllilIi(IIIllIIliIIl(var25, var27, var29, vz, vx, sy));
                  if (!(var39 <= 0.0)) {
                     double var41 = var25 - vz;
                     double var43 = var35 - vx;
                     double var45 = var29 - sy;
                     double var47 = Math.sqrt(var41 * var41 + var43 * var43 + var45 * var45);
                     if (!(var47 < 1.0E-9) && var23.clear(vz, vx, sy, var25, var35, var29)) {
                        clear += var41 / var47 * var39;
                        sz += var43 / var47 * var39;
                        sx += var45 / var47 * var39;
                     }
                  }
               }
            }

            double var53 = sz - 0.03;
            clear *= 0.99;
            sz = var53 * 0.99;
            sx *= 0.99;
            double var33 = var25 + clear;
            double var54 = var27 + sz;
            double var37 = var29 + sx;
            if (sz < 0.0 && var54 <= booms && var27 >= booms) {
               double var55 = var27 - var54 > 0.0 ? (var27 - booms) / (var27 - var54) : 0.0;
               var55 = Math.max(0.0, Math.min(1.0, var55));
               return new double[]{var25 + (var33 - var25) * var55, booms, var29 + (var37 - var29) * var55, (double)((int)(var59 >>> 32))};
            }

            var25 = var33;
            var27 = var54;
            var29 = var37;
         }

         return null;
      } else {
         return null;
      }
   }

   private static boolean IlIlllIlilIl(double b, double c, double a) {
      return Double.isFinite(b) && Double.isFinite(c) && Double.isFinite(a);
   }

   private static int[] iliIiiliiiii(int[] tick, int booms) {
      long var9 = 8604827527360700162L;
      long var11 = 4278819373439312716L;
      long var13 = 1393503261747865936L;
      var9 ^= (0L ^ var9) & -1L << 32;
      int[] var3 = tick;
      var9 ^= ((long)tick.length ^ var9) & -1L >>> 32;
      var11 ^= (0L ^ var11) & -1L << 32;

      while ((int)(var11 >>> 32) < (int)var9) {
         var11 ^= ((long)var3[(int)(var11 >>> 32)] ^ var11) & -1L >>> 32;
         if ((int)var11 >= 1 && (int)var11 <= booms) {
            var9 += 4294967296L;
         }

         var11 += 4294967296L;
      }

      if ((int)(var9 >>> 32) == tick.length) {
         return tick;
      } else {
         var3 = new int[(int)(var9 >>> 32)];
         var9 ^= (0L ^ var9) & -1L >>> 32;
         int[] var5 = tick;
         var11 ^= ((long)tick.length ^ var11) & -1L >>> 32;
         var13 ^= (0L ^ var13) & -1L << 32;

         while ((int)(var13 >>> 32) < (int)var11) {
            var13 ^= ((long)var5[(int)(var13 >>> 32)] ^ var13) & -1L >>> 32;
            if ((int)var13 >= 1 && (int)var13 <= booms) {
               int var10001 = (int)var9;
               var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32;
               var3[var10001] = (int)var13;
            }

            var13 += 4294967296L;
         }

         return var3;
      }
   }

   public static boolean lIiiIiIlilli(double shift) {
      return !(shift <= 1.2);
   }

   private iIIiilIlIiil() {
   }

   public static double IilliliilIIi(
      double cy, double clear, double sx, double cz, double vx, double booms, double cx, int[] landY, double vy, double sy, double vz, lIilIlIiiIilIlIi sz
   ) {
      if (landY != null && landY.length != 0 && IlIlllIlilIl(vy, sy, vz)) {
         double[] var22 = iIlIlllllill(cy, clear, sx, cz, vx, booms, cx, iiiIlIiiIIIllIii, vy, sy, vz, lIilIlIiiIilIlIi.liIiIIIIIi);
         if (var22 == null) {
            return 0.0;
         } else {
            int[] var23 = iliIiiliiiii(landY, (int)var22[3]);
            if (var23.length == 0) {
               return 0.0;
            } else {
               double[] var24 = iIlIlllllill(cy, clear, sx, cz, vx, booms, cx, var23, vy, sy, vz, sz);
               return var24 == null ? Double.POSITIVE_INFINITY : Math.hypot(var24[0] - var22[0], var24[2] - var22[2]);
            }
         }
      } else {
         return 0.0;
      }
   }
}
