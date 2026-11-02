package gg.corz;

import java.util.Arrays;

public final class IIIIiIillIIIiIil {
   public static final double IIiIlllIil = 0.2;
   public static final int lIiIlllIil = 4;
   public static final int iilIlllIil = 3;
   public static final double lilIlllIil = 1.0;

   public static double[] iIlIlllllill(double y, double z, double pts, double[] x) {
      long var35 = -3409846561059543742L;
      long var37 = 5336687656282953179L;
      long var39 = -6668552794132365019L;
      var35 ^= ((long)(x.length / 3) << 32 ^ var35) & -1L << 32;
      if ((int)(var35 >>> 32) < 2) {
         return liiiIIllIl(y, z, pts, x);
      } else {
         var35 ^= ((long)Math.min((int)(var35 >>> 32) - 2, 3) ^ var35) & -1L >>> 32;
         var37 ^= (0L ^ var37) & -1L << 32;
         double var10 = Double.MAX_VALUE;
         double var12 = 0.0;

         for (var37 ^= (0L ^ var37) & -1L >>> 32; (int)var37 <= (int)var35; var37 ^= (var37 ^ var37 + (long)1) & -1L >>> 32) {
            long var47 = var39 ^ ((long)((int)var37 * 3) << 32 ^ var39) & -1L << 32;
            var39 = var47 ^ ((long)((int)(var47 >>> 32) + 3) ^ var47) & -1L >>> 32;
            double var17 = x[(int)var39] - x[(int)(var39 >>> 32)];
            double var19 = x[(int)var39 + 1] - x[(int)(var39 >>> 32) + 1];
            double var21 = x[(int)var39 + 2] - x[(int)(var39 >>> 32) + 2];
            double var23 = var17 * var17 + var19 * var19 + var21 * var21;
            double var25 = var23 > 1.0E-12
               ? ((y - x[(int)(var39 >>> 32)]) * var17 + (z - x[(int)(var39 >>> 32) + 1]) * var19 + (pts - x[(int)(var39 >>> 32) + 2]) * var21) / var23
               : 0.0;
            var25 = Math.min(1.0, Math.max(0.0, var25));
            double var27 = x[(int)(var39 >>> 32)] + var17 * var25 - y;
            double var29 = x[(int)(var39 >>> 32) + 1] + var19 * var25 - z;
            double var31 = x[(int)(var39 >>> 32) + 2] + var21 * var25 - pts;
            double var33 = var27 * var27 + var29 * var29 + var31 * var31;
            if (var33 <= var10 + 1.0E-9) {
               var10 = var33;
               var37 ^= ((long)((int)var37) << 32 ^ var37) & -1L << 32;
               var12 = var25;
            }
         }

         var37 ^= ((long)((int)(var37 >>> 32) == 0 && var12 <= 0.0 ? 0 : (int)(var37 >>> 32) + 1) ^ var37) & -1L >>> 32;
         double[] var15 = new double[((int)(var35 >>> 32) - (int)var37 + 1) * 3];
         var15[0] = y;
         var15[1] = z;
         var15[2] = pts;
         System.arraycopy(x, (int)var37 * 3, var15, 3, ((int)(var35 >>> 32) - (int)var37) * 3);
         return var15;
      }
   }

   public static int IlIlllIlilIl(double[] spacing, double arc, double[] pts, double[] out) {
      long var23 = 6140250326571278721L;
      long var25 = -1343218214156659735L;
      long var27 = -690277421335091974L;
      var23 ^= ((long)(spacing.length / 3) << 32 ^ var23) & -1L << 32;
      if ((int)(var23 >>> 32) == 0) {
         return 0;
      } else {
         pts[0] = spacing[0];
         pts[1] = spacing[1];
         pts[2] = spacing[2];
         out[0] = 0.0;
         if ((int)(var23 >>> 32) == 1) {
            return 1;
         } else {
            double var6 = 0.0;

            for (var23 ^= (1L ^ var23) & -1L >>> 32; (int)var23 < (int)(var23 >>> 32); var23 ^= (var23 ^ var23 + (long)1) & -1L >>> 32) {
               var6 += Iiilliiliiil(spacing, (int)var23 - 1, (int)var23);
            }

            if (!(var6 > 1.0E-9)) {
               pts[3] = spacing[((int)(var23 >>> 32) - 1) * 3];
               pts[4] = spacing[((int)(var23 >>> 32) - 1) * 3 + 1];
               pts[5] = spacing[((int)(var23 >>> 32) - 1) * 3 + 2];
               out[1] = 0.0;
               return 2;
            } else {
               var23 ^= ((long)Math.max(1, (int)Math.ceil(var6 / arc)) ^ var23) & -1L >>> 32;
               double var9 = var6 / (double)((int)var23);
               var25 ^= (4294967296L ^ var25) & -1L << 32;
               double var12 = 0.0;
               double var14 = Iiilliiliiil(spacing, 0, 1);
               var25 ^= (1L ^ var25) & -1L >>> 32;
               var27 ^= (4294967296L ^ var27) & -1L << 32;

               while ((int)(var27 >>> 32) < (int)var23) {
                  double var18;
                  for (var18 = (double)((int)(var27 >>> 32)) * var9;
                     (int)(var25 >>> 32) < (int)(var23 >>> 32) - 1 && var18 > var12 + var14;
                     var14 = Iiilliiliiil(spacing, (int)(var25 >>> 32) - 1, (int)(var25 >>> 32))
                  ) {
                     var12 += var14;
                     var25 += 4294967296L;
                  }

                  double var20 = var14 > 1.0E-12 ? Math.min(1.0, Math.max(0.0, (var18 - var12) / var14)) : 1.0;

                  for (var27 ^= (0L ^ var27) & -1L >>> 32; (int)var27 < 3; var27 ^= (var27 ^ var27 + (long)1) & -1L >>> 32) {
                     pts[(int)var25 * 3 + (int)var27] = spacing[((int)(var25 >>> 32) - 1) * 3 + (int)var27]
                        + (spacing[(int)(var25 >>> 32) * 3 + (int)var27] - spacing[((int)(var25 >>> 32) - 1) * 3 + (int)var27]) * var20;
                  }

                  out[(int)var25] = var18;
                  var25 ^= (var25 ^ var25 + (long)1) & -1L >>> 32;
                  var27 += 4294967296L;
               }

               pts[(int)var25 * 3] = spacing[((int)(var23 >>> 32) - 1) * 3];
               pts[(int)var25 * 3 + 1] = spacing[((int)(var23 >>> 32) - 1) * 3 + 1];
               pts[(int)var25 * 3 + 2] = spacing[((int)(var23 >>> 32) - 1) * 3 + 2];
               out[(int)var25] = var6;
               return (int)var25 + 1;
            }
         }
      }
   }

   public static boolean Ililllililil(long[] tail, int wholeCount, long[] whole, int tailCount) {
      long var6 = 1333849847053358637L;
      if (tailCount != 0 && tailCount <= wholeCount) {
         var6 ^= ((long)(wholeCount - tailCount) << 32 ^ var6) & -1L << 32;

         for (long var9 = var6 ^ (0L ^ var6) & -1L >>> 32; (int)var9 < tailCount; var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
            if (tail[(int)(var9 >>> 32) + (int)var9] != whole[(int)var9]) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public static double[] IIIllIIliIIl(double[] pts) {
      long var8 = 7892776925602723592L;
      long var10 = -7194548382278746454L;
      long var12 = -7220814144391292429L;
      var8 ^= ((long)(pts.length / 3) << 32 ^ var8) & -1L << 32;
      if ((int)(var8 >>> 32) < 3) {
         return (double[])pts.clone();
      } else {
         double[] var2 = new double[2 * ((int)(var8 >>> 32) - 1) * 3];
         var8 ^= (0L ^ var8) & -1L >>> 32;

         for (var10 ^= (0L ^ var10) & -1L << 32; (int)(var10 >>> 32) < 3; var10 += 4294967296L) {
            int var10001 = (int)var8;
            var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32;
            var2[var10001] = pts[(int)(var10 >>> 32)];
         }

         var10 ^= (0L ^ var10) & -1L << 32;

         while ((int)(var10 >>> 32) < (int)(var8 >>> 32) - 1) {
            var10 ^= ((long)((int)(var10 >>> 32) * 3) ^ var10) & -1L >>> 32;
            var12 ^= ((long)(((int)(var10 >>> 32) + 1) * 3) << 32 ^ var12) & -1L << 32;
            if ((int)(var10 >>> 32) > 0) {
               for (var12 ^= (0L ^ var12) & -1L >>> 32; (int)var12 < 3; var12 ^= (var12 ^ var12 + (long)1) & -1L >>> 32) {
                  int var20 = (int)var8;
                  var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32;
                  var2[var20] = pts[(int)var10 + (int)var12] * 0.75 + pts[(int)(var12 >>> 32) + (int)var12] * 0.25;
               }
            }

            if ((int)(var10 >>> 32) < (int)(var8 >>> 32) - 2) {
               for (var12 ^= (0L ^ var12) & -1L >>> 32; (int)var12 < 3; var12 ^= (var12 ^ var12 + (long)1) & -1L >>> 32) {
                  int var21 = (int)var8;
                  var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32;
                  var2[var21] = pts[(int)var10 + (int)var12] * 0.25 + pts[(int)(var12 >>> 32) + (int)var12] * 0.75;
               }
            }

            var10 += 4294967296L;
         }

         for (long var19 = var10 ^ (0L ^ var10) & -1L << 32; (int)(var19 >>> 32) < 3; var19 += 4294967296L) {
            int var22 = (int)var8;
            var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32;
            var2[var22] = pts[((int)(var8 >>> 32) - 1) * 3 + (int)(var19 >>> 32)];
         }

         return Arrays.copyOf(var2, (int)var8);
      }
   }

   private static double Iiilliiliiil(double[] p, int i, int j) {
      double var3 = p[j * 3] - p[i * 3];
      double var5 = p[j * 3 + 1] - p[i * 3 + 1];
      double var7 = p[j * 3 + 2] - p[i * 3 + 2];
      return Math.sqrt(var3 * var3 + var5 * var5 + var7 * var7);
   }

   public static int Illlllllilll(double[] s, int n, double arc) {
      long var7 = -1707901324315267451L;
      long var9 = 724344746641445648L;
      if (n > 1 && !(arc <= s[0])) {
         if (arc >= s[n - 1]) {
            return n - 2;
         } else {
            var7 ^= (0L ^ var7) & -1L << 32;
            var7 ^= ((long)(n - 1) ^ var7) & -1L >>> 32;

            while ((int)var7 - (int)(var7 >>> 32) > 1) {
               var9 ^= ((long)((int)(var7 >>> 32) + (int)var7 >>> 1) << 32 ^ var9) & -1L << 32;
               if (s[(int)(var9 >>> 32)] <= arc) {
                  var7 ^= ((long)((int)(var9 >>> 32)) << 32 ^ var7) & -1L << 32;
               } else {
                  var7 ^= ((long)((int)(var9 >>> 32)) ^ var7) & -1L >>> 32;
               }
            }

            return (int)(var7 >>> 32);
         }
      } else {
         return 0;
      }
   }

   public static void Iilllilliill(double[] arc, double[] n, int out, double s, double[] pts) {
      long var12 = 3052746793653564911L;
      if (out != 0) {
         if (out == 1) {
            pts[0] = arc[0];
            pts[1] = arc[1];
            pts[2] = arc[2];
         } else {
            var12 ^= ((long)Illlllllilll(n, out, s) << 32 ^ var12) & -1L << 32;
            double var7 = n[(int)(var12 >>> 32) + 1] - n[(int)(var12 >>> 32)];
            double var9 = var7 > 1.0E-12 ? Math.min(1.0, Math.max(0.0, (s - n[(int)(var12 >>> 32)]) / var7)) : 0.0;

            for (long var15 = var12 ^ (0L ^ var12) & -1L >>> 32; (int)var15 < 3; var15 ^= (var15 ^ var15 + (long)1) & -1L >>> 32) {
               pts[(int)var15] = arc[(int)(var15 >>> 32) * 3 + (int)var15]
                  + (arc[((int)(var15 >>> 32) + 1) * 3 + (int)var15] - arc[(int)(var15 >>> 32) * 3 + (int)var15]) * var9;
            }
         }
      }
   }

   public static void IIillIiliIil(double[] out, double[] arc, int n, double s, double[] pts) {
      long var17 = 8670026511232282727L;
      long var19 = -8344244076811247977L;
      pts[0] = 1.0;
      pts[1] = 0.0;
      pts[2] = 0.0;
      if (n >= 2) {
         var17 ^= ((long)Illlllllilll(arc, n, s) << 32 ^ var17) & -1L << 32;

         for (long var22 = var17 ^ (0L ^ var17) & -1L >>> 32; (int)var22 < n; var22 ^= (var22 ^ var22 + (long)1) & -1L >>> 32) {
            var19 ^= ((long)Math.max(0, Math.min(n - 2, (int)(var22 >>> 32) + ((int)var22 % 2 == 0 ? (int)var22 / 2 : -((int)var22 + 1) / 2))) << 32 ^ var19)
               & -1L << 32;
            double var9 = out[((int)(var19 >>> 32) + 1) * 3] - out[(int)(var19 >>> 32) * 3];
            double var11 = out[((int)(var19 >>> 32) + 1) * 3 + 1] - out[(int)(var19 >>> 32) * 3 + 1];
            double var13 = out[((int)(var19 >>> 32) + 1) * 3 + 2] - out[(int)(var19 >>> 32) * 3 + 2];
            double var15 = Math.sqrt(var9 * var9 + var11 * var11 + var13 * var13);
            if (var15 > 1.0E-9) {
               pts[0] = var9 / var15;
               pts[1] = var11 / var15;
               pts[2] = var13 / var15;
               return;
            }
         }
      }
   }

   public static int IiIlliIliiIl(double[] spacing, double pts) {
      long var7 = -6878493667929421137L;
      var7 ^= ((long)(spacing.length / 3) << 32 ^ var7) & -1L << 32;
      double var4 = 0.0;

      for (long var10 = var7 ^ (1L ^ var7) & -1L >>> 32; (int)var10 < (int)(var10 >>> 32); var10 ^= (var10 ^ var10 + (long)1) & -1L >>> 32) {
         var4 += Iiilliiliiil(spacing, (int)var10 - 1, (int)var10);
      }

      return Math.max(2, (int)Math.ceil(var4 / pts) + 2);
   }

   public static double[] lIiiIiIlilli(double[] pts) {
      long var17 = -2213485532185344751L;
      long var19 = -7793747447284645583L;
      var17 ^= ((long)(pts.length / 3) << 32 ^ var17) & -1L << 32;
      double[] var2 = new double[pts.length];
      var17 ^= (0L ^ var17) & -1L >>> 32;

      for (long var25 = var19 ^ (0L ^ var19) & -1L << 32; (int)(var25 >>> 32) < (int)(var17 >>> 32); var25 += 4294967296L) {
         double var5 = pts[(int)(var25 >>> 32) * 3];
         double var7 = pts[(int)(var25 >>> 32) * 3 + 1];
         double var9 = pts[(int)(var25 >>> 32) * 3 + 2];
         if (IIIilIIiiIIi(var5) && IIIilIIiiIIi(var7) && IIIilIIiiIIi(var9)) {
            if ((int)var17 > 0) {
               double var11 = var5 - var2[(int)var17 - 3];
               double var13 = var7 - var2[(int)var17 - 2];
               double var15 = var9 - var2[(int)var17 - 1];
               if (var11 * var11 + var13 * var13 + var15 * var15 < 1.0E-8) {
                  continue;
               }
            }

            int var10001 = (int)var17;
            var17 ^= (var17 ^ var17 + (long)1) & -1L >>> 32;
            var2[var10001] = var5;
            var10001 = (int)var17;
            var17 ^= (var17 ^ var17 + (long)1) & -1L >>> 32;
            var2[var10001] = var7;
            var10001 = (int)var17;
            var17 ^= (var17 ^ var17 + (long)1) & -1L >>> 32;
            var2[var10001] = var9;
         }
      }

      return Arrays.copyOf(var2, (int)var17);
   }

   public static double IIlllIlliIll(double[] px, double[] pz, int arc, double n, double py, double pts) {
      long var34 = 8631274045218794340L;
      long var36 = 3387223543063498768L;
      if (arc <= 1) {
         return 0.0;
      } else {
         double var9 = Double.MAX_VALUE;
         double var11 = 0.0;
         var34 ^= (4294967296L ^ var34) & -1L << 32;

         while ((int)(var34 >>> 32) < arc) {
            var34 ^= ((long)(((int)(var34 >>> 32) - 1) * 3) ^ var34) & -1L >>> 32;
            var36 ^= ((long)((int)(var34 >>> 32) * 3) << 32 ^ var36) & -1L << 32;
            double var16 = px[(int)(var36 >>> 32)] - px[(int)var34];
            double var18 = px[(int)(var36 >>> 32) + 1] - px[(int)var34 + 1];
            double var20 = px[(int)(var36 >>> 32) + 2] - px[(int)var34 + 2];
            double var22 = var16 * var16 + var18 * var18 + var20 * var20;
            double var24 = var22 > 1.0E-12
               ? ((n - px[(int)var34]) * var16 + (py - px[(int)var34 + 1]) * var18 + (pts - px[(int)var34 + 2]) * var20) / var22
               : 0.0;
            var24 = Math.min(1.0, Math.max(0.0, var24));
            double var26 = px[(int)var34] + var16 * var24 - n;
            double var28 = px[(int)var34 + 1] + var18 * var24 - py;
            double var30 = px[(int)var34 + 2] + var20 * var24 - pts;
            double var32 = var26 * var26 + var28 * var28 + var30 * var30;
            if (var32 < var9) {
               var9 = var32;
               var11 = pz[(int)(var34 >>> 32) - 1] + (pz[(int)(var34 >>> 32)] - pz[(int)(var34 >>> 32) - 1]) * var24;
            }

            var34 += 4294967296L;
         }

         return var11;
      }
   }

   public static double[] IliIlllilIi(int[] count, int nodes) {
      long var17 = -4094575645206368058L;
      long var11 = 4521854079724536917L;
      long var13 = 4694488102002788494L;
      long var15 = -7347655641006641479L;
      double[] var2 = new double[Math.max(1, nodes * 2) * 3];
      var11 ^= (0L ^ var11) & -1L << 32;
      var11 ^= (0L ^ var11) & -1L >>> 32;
      var13 ^= (0L ^ var13) & -1L << 32;
      var13 ^= (0L ^ var13) & -1L >>> 32;
      var15 ^= (0L ^ var15) & -1L << 32;

      while ((int)(var15 >>> 32) < nodes) {
         label25: {
            var15 ^= ((long)count[(int)(var15 >>> 32) * 3] ^ var15) & -1L >>> 32;
            var17 ^= ((long)count[(int)(var15 >>> 32) * 3 + 1] << 32 ^ var17) & -1L << 32;
            var17 ^= ((long)count[(int)(var15 >>> 32) * 3 + 2] ^ var17) & -1L >>> 32;
            if ((int)(var15 >>> 32) > 0) {
               if ((int)var15 == (int)var11 && (int)(var17 >>> 32) == (int)(var13 >>> 32) && (int)var17 == (int)var13) {
                  break label25;
               }

               if ((int)(var17 >>> 32) != (int)(var13 >>> 32)) {
                  int var10001 = (int)(var11 >>> 32);
                  var11 += 4294967296L;
                  var2[var10001] = (double)((int)var11 + (int)var15) * 0.5 + 0.5;
                  var10001 = (int)(var11 >>> 32);
                  var11 += 4294967296L;
                  var2[var10001] = (double)Math.max((int)(var13 >>> 32), (int)(var17 >>> 32));
                  var10001 = (int)(var11 >>> 32);
                  var11 += 4294967296L;
                  var2[var10001] = (double)((int)var13 + (int)var17) * 0.5 + 0.5;
               }
            }

            int var34 = (int)(var11 >>> 32);
            var11 += 4294967296L;
            var2[var34] = (double)((int)var15) + 0.5;
            var34 = (int)(var11 >>> 32);
            var11 += 4294967296L;
            var2[var34] = (double)((int)(var17 >>> 32));
            var34 = (int)(var11 >>> 32);
            var11 += 4294967296L;
            var2[var34] = (double)((int)var17) + 0.5;
            var11 ^= ((long)((int)var15) ^ var11) & -1L >>> 32;
            var13 ^= ((long)((int)(var17 >>> 32)) << 32 ^ var13) & -1L << 32;
            var13 ^= ((long)((int)var17) ^ var13) & -1L >>> 32;
         }

         var15 += 4294967296L;
      }

      return Arrays.copyOf(var2, (int)(var11 >>> 32));
   }

   private IIIIiIillIIIiIil() {
   }

   public static double[] liiiIIllIl(double y, double z, double pts, double[] x) {
      double[] var7 = new double[x.length + 3];
      var7[0] = y;
      var7[1] = z;
      var7[2] = pts;
      System.arraycopy(x, 0, var7, 3, x.length);
      return var7;
   }

   private static boolean IIIilIIiiIIi(double v) {
      return !Double.isNaN(v) && !Double.isInfinite(v);
   }

   public static double[] IilliliilIIi(double[] pts) {
      long var4 = 8650210123557300197L;
      double[] var1 = lIiiIiIlilli(pts);
      if (var1.length < 9) {
         return var1;
      } else {
         double[] var2 = iliIiiliiiii(var1, 1.0);

         for (long var6 = var4 ^ (0L ^ var4) & -1L << 32; (int)(var6 >>> 32) < 3; var6 += 4294967296L) {
            var2 = IIIllIIliIIl(var2);
         }

         return var2;
      }
   }

   public static double[] iliIiiliiiii(double[] step, double pts) {
      long var17 = 713831905275662066L;
      long var19 = -2865648633353348646L;
      long var13 = 871026449463733112L;
      long var15 = 4259248192504608911L;
      var13 ^= ((long)(step.length / 3) << 32 ^ var13) & -1L << 32;
      if ((int)(var13 >>> 32) < 2) {
         return (double[])step.clone();
      } else {
         var13 ^= (1L ^ var13) & -1L >>> 32;

         for (var15 ^= (4294967296L ^ var15) & -1L << 32; (int)(var15 >>> 32) < (int)(var13 >>> 32); var15 += 4294967296L) {
            var13 ^= ((long)((int)var13 + Math.max(1, (int)Math.ceil(Iiilliiliiil(step, (int)(var15 >>> 32) - 1, (int)(var15 >>> 32)) / pts))) ^ var13)
               & -1L >>> 32;
         }

         double[] var5 = new double[(int)var13 * 3];
         var15 ^= (0L ^ var15) & -1L >>> 32;
         int var10001 = (int)var15;
         var15 ^= (var15 ^ var15 + (long)1) & -1L >>> 32;
         var5[var10001] = step[0];
         var10001 = (int)var15;
         var15 ^= (var15 ^ var15 + (long)1) & -1L >>> 32;
         var5[var10001] = step[1];
         var10001 = (int)var15;
         var15 ^= (var15 ^ var15 + (long)1) & -1L >>> 32;
         var5[var10001] = step[2];
         var17 ^= (4294967296L ^ var17) & -1L << 32;

         while ((int)(var17 >>> 32) < (int)(var13 >>> 32)) {
            var17 ^= ((long)Math.max(1, (int)Math.ceil(Iiilliiliiil(step, (int)(var17 >>> 32) - 1, (int)(var17 >>> 32)) / pts)) ^ var17) & -1L >>> 32;
            var19 ^= (4294967296L ^ var19) & -1L << 32;

            while ((int)(var19 >>> 32) <= (int)var17) {
               double var10 = (double)((int)(var19 >>> 32)) / (double)((int)var17);

               for (var19 ^= (0L ^ var19) & -1L >>> 32; (int)var19 < 3; var19 ^= (var19 ^ var19 + (long)1) & -1L >>> 32) {
                  var10001 = (int)var15;
                  var15 ^= (var15 ^ var15 + (long)1) & -1L >>> 32;
                  var5[var10001] = step[((int)(var17 >>> 32) - 1) * 3 + (int)var19]
                     + (step[(int)(var17 >>> 32) * 3 + (int)var19] - step[((int)(var17 >>> 32) - 1) * 3 + (int)var19]) * var10;
               }

               var19 += 4294967296L;
            }

            var17 += 4294967296L;
         }

         return var5;
      }
   }
}
