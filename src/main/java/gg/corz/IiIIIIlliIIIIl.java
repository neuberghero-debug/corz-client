package gg.corz;

import java.util.ArrayList;
import java.util.Set;

public final class IiIIIIlliIIIIl {
   public static final double iliilIiIlIiiilIiIl = 1.27;
   public static final double IliilIiIllliilIiIl = 1.62;
   public static final double liiilIiIliiiilIiIl = 0.05;
   public static final int llIIiIiIlilIIiIiIl = 8;
   public static final int lIiilIiIliIiilIiIl = 3;
   public static final double IiIIiIiIlliIIiIiIl = 8.0;
   public static final int IililIiIllililIiIl = 3;
   public static final int iililIiIlIIiilIiIl = 1;
   private static final int[][] iIIIiIiIlIlIIiIiIl = new int[][]{{1, 0, 0}, {-1, 0, 0}, {0, 1, 0}, {0, -1, 0}, {0, 0, 1}, {0, 0, -1}};
   public static final int[][] IIIIiIiIllIIIiIiIl = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

   public static int iliIiiliiiii(IIIIililIIIili maxFeetY, int feetY, int w, int z, int x) {
      long var9 = -6809084428695594108L;
      long var11 = 2743053091262729543L;

      for (var9 ^= (0L ^ var9) & -1L << 32; w + (int)(var9 >>> 32) < x; var9 += 4294967296L) {
         var9 ^= ((long)(w + (int)(var9 >>> 32)) ^ var9) & -1L >>> 32;
         var11 ^= ((long)((int)var9 + 1) << 32 ^ var11) & -1L << 32;
         var11 ^= ((long)((int)var9 + 2) ^ var11) & -1L >>> 32;
         if (maxFeetY.iIlIlllllill(feetY, (int)var9, z)
            || maxFeetY.IliIlllilIi(feetY, (int)(var11 >>> 32), z)
            || maxFeetY.iIlIlllllill(feetY, (int)(var11 >>> 32), z)
            || maxFeetY.IliIlllilIi(feetY, (int)var11, z)
            || maxFeetY.iIlIlllllill(feetY, (int)var11, z)
            || maxFeetY.IliIlllilIi(feetY, (int)var11 + 1, z)) {
            break;
         }
      }

      return (int)(var9 >>> 32);
   }

   public static boolean IlIlllIlilIl(IIIIililIIIili tz, int ex, int reach, int tx, double feetY, double ez, double w, double ty) {
      long var48 = 8627164231541786055L;
      long var50 = 3240282343286048344L;
      long var46 = 554364213301591013L;
      double var12 = ez + 1.62;
      double var14 = ez + 1.27;
      double var16 = (double)ex + 0.5 - feetY;
      double var18 = (double)reach + 0.5 - var12;
      double var20 = (double)tx + 0.5 - w;
      if (var16 * var16 + var18 * var18 + var20 * var20 > ty * ty) {
         return false;
      } else {
         int[][] var22 = iIIIiIiIlIlIIiIiIl;
         var46 ^= ((long)var22.length << 32 ^ var46) & -1L << 32;

         for (long var53 = var46 ^ (0L ^ var46) & -1L >>> 32; (int)var53 < (int)(var53 >>> 32); var53 ^= (var53 ^ var53 + (long)1) & -1L >>> 32) {
            int[] var25 = var22[(int)var53];
            var48 ^= ((long)(ex + var25[0]) << 32 ^ var48) & -1L << 32;
            var48 ^= ((long)(reach + var25[1]) ^ var48) & -1L >>> 32;
            var50 ^= ((long)(tx + var25[2]) << 32 ^ var50) & -1L << 32;
            if (tz.liiiIIllIl((int)(var48 >>> 32), (int)var48, (int)(var50 >>> 32))) {
               double var29;
               double var31;
               if (var25[0] != 0) {
                  var29 = var25[0] > 0 ? (double)(ex + 1) : (double)ex;
                  var31 = feetY;
               } else if (var25[1] != 0) {
                  var29 = var25[1] > 0 ? (double)(reach + 1) : (double)reach;
                  var31 = var12;
               } else {
                  var29 = var25[2] > 0 ? (double)(tx + 1) : (double)tx;
                  var31 = w;
               }

               var50 ^= ((long)(var25[0] + var25[1] + var25[2] > 0 ? 1 : 0) ^ var50) & -1L >>> 32;
               if ((int)var50 != 0 ? !(var31 >= var29 - 0.05) : !(var31 <= var29 + 0.05)) {
                  double var34 = (double)ex + 0.5 + (double)var25[0] * 0.5;
                  double var36 = (double)reach + 0.5 + (double)var25[1] * 0.5;
                  double var38 = (double)tx + 0.5 + (double)var25[2] * 0.5;
                  double var40 = var34 - feetY;
                  double var42 = var36 - var14;
                  double var44 = var38 - w;
                  if (!(var40 * var40 + var42 * var42 + var44 * var44 > ty * ty)) {
                     return true;
                  }
               }
            }
         }

         return false;
      }
   }

   private IiIIIIlliIIIIl() {
   }

   public static int Iilllilliill(int dropBlocks) {
      return Math.max(0, dropBlocks - 3);
   }

   public static lilliiiiilliii IIlllIlliIll(IIIIililIIIili targets, long reach, int w, long[] feet, Set<Long> maxFeetY, double blocked) {
      long var32 = 5706535755574244956L;
      long var34 = -8540218681731979272L;
      long var36 = -1577302138337369810L;
      long var38 = 7239009156827626015L;
      long var40 = -8288213563881549806L;
      long var30 = 3750853469510491547L;
      var30 ^= ((long)llIiIiililIiIiil.IiIlliIliiIl(reach) << 32 ^ var30) & -1L << 32;
      var30 ^= ((long)llIiIiililIiIiil.IIlllIlliIll(reach) ^ var30) & -1L >>> 32;
      var32 ^= ((long)llIiIiililIiIiil.Illlllllilll(reach) << 32 ^ var32) & -1L << 32;
      ArrayList var11 = new ArrayList(IIIIiIiIllIIIiIiIl.length);
      iiiiIIlIIIIlIl var12 = null;
      var32 ^= ((long)targets.liiiIIllIl((int)(var30 >>> 32), (int)var30 - 1, (int)(var32 >>> 32)) ^ var32) & -1L >>> 32;
      int[][] var14 = IIIIiIiIllIIIiIiIl;
      var34 ^= ((long)var14.length << 32 ^ var34) & -1L << 32;

      for (long var47 = var34 ^ (0L ^ var34) & -1L >>> 32; (int)var47 < (int)(var47 >>> 32); var47 ^= (var47 ^ var47 + (long)1) & -1L >>> 32) {
         int[] var17 = var14[(int)var47];
         long var48 = var36 ^ ((long)((int)(var30 >>> 32) + var17[0]) << 32 ^ var36) & -1L << 32;
         var36 = var48 ^ ((long)((int)(var32 >>> 32) + var17[1]) ^ var48) & -1L >>> 32;
         long var20 = llIiIiililIiIiil.IIIllIIliIIl((int)(var36 >>> 32), (int)var30 - 1, (int)var36);
         long var22 = llIiIiililIiIiil.IIIllIIliIIl((int)(var36 >>> 32), (int)var30, (int)var36);
         var38 ^= ((long)(!targets.IilliliilIIi((int)(var36 >>> 32), (int)var30 - 1, (int)var36) ? 1 : 0) << 32 ^ var38) & -1L << 32;
         IIiilIlllIiilIll var25 = null;
         if (maxFeetY != null && maxFeetY.contains(IliIlllilIi((int)(var36 >>> 32), (int)var36))) {
            var25 = IIiilIlllIiilIll.ililIlilll;
         } else if ((int)(var38 >>> 32) != 0 && targets.iIlIlllllill((int)(var36 >>> 32), (int)var30 - 1, (int)var36)) {
            var25 = IIiilIlllIiilIll.IiilIlilll;
         } else if ((int)(var38 >>> 32) != 0 && targets.IliIlllilIi((int)(var36 >>> 32), (int)var30 - 1, (int)var36)) {
            var25 = IIiilIlllIiilIll.liilIlilll;
         } else if ((int)(var38 >>> 32) != 0 && (int)var32 == 0) {
            var25 = IIiilIlllIiilIll.iiilIlilll;
         } else if (targets.iIlIlllllill((int)(var36 >>> 32), (int)var30, (int)var36)) {
            var25 = IIiilIlllIiilIll.IIIiIlilll;
         } else if (targets.IliIlllilIi((int)(var36 >>> 32), (int)var30, (int)var36)) {
            var25 = IIiilIlllIiilIll.lIIiIlilll;
         } else if (targets.iIlIlllllill((int)(var36 >>> 32), (int)var30 + 1, (int)var36)) {
            var25 = IIiilIlllIiilIll.iIIiIlilll;
         } else if (targets.IliIlllilIi((int)(var36 >>> 32), (int)var30 + 1, (int)var36)) {
            var25 = IIiilIlllIiilIll.IlIiIlilll;
         }

         var38 ^= ((long)(var25 == null ? iliIiiliiiii(targets, (int)(var36 >>> 32), (int)var30, (int)var36, w) : 0) ^ var38) & -1L >>> 32;
         var40 ^= ((long)(var25 == null ? IIIllIIliIIl((int)(var36 >>> 32), (int)var30, (int)var36, (int)var38, feet) : 0) << 32 ^ var40) & -1L << 32;
         var40 ^= (
               (long)(
                     var25 == null && (int)(var40 >>> 32) > 0
                        ? IiIlliIliiIl(targets, (int)(var36 >>> 32), (int)var30, (int)var36, (int)var38, feet, blocked)
                        : 0
                  )
                  ^ var40
            )
            & -1L >>> 32;
         if (var25 == null && (int)(var40 >>> 32) == 0) {
            var25 = IIiilIlllIiilIll.llIiIlilll;
         } else if (var25 == null && (int)var40 == 0) {
            var25 = IIiilIlllIiilIll.ilIiIlilll;
         }

         iiiiIIlIIIIlIl var29 = new iiiiIIlIIIIlIl(
            var17[0], var17[1], var20, var22, (boolean)((int)(var38 >>> 32)), (int)var38, (int)(var40 >>> 32), (int)var40, var25
         );
         var11.add(var29);
         if (var25 == null && (var12 == null || Ililllililil(var29, var12))) {
            var12 = var29;
         }
      }

      return new lilliiiiilliii(var12, var11);
   }

   static boolean Ililllililil(iiiiIIlIIIIlIl a, iiiiIIlIIIIlIl b) {
      if (a.Illlllllilll() != b.Illlllllilll()) {
         return a.Illlllllilll() > b.Illlllllilll();
      } else if (a.IIlllIlliIll() != b.IIlllIlliIll()) {
         return a.IIlllIlliIll() > b.IIlllIlliIll();
      } else if (a.IiIlliIliiIl() != b.IiIlliIliiIl()) {
         return a.IiIlliIliiIl() > b.IiIlliIliiIl();
      } else {
         return a.IlIlllIlilIl() != b.IlIlllIlilIl() ? !a.IlIlllIlilIl() : false;
      }
   }

   public static String IilliliilIIi(IIIIililIIIili w, int maxFeetY, int z, int feetY, int x) {
      if (z >= x) {
         return Iiilliiliiil<"Iiilliiliiil","gZ6aPDV1TSU3YyuncCgyosSwASLde+htZp/J4UDNa4dEagx8QGRORQ==">();
      } else if (w.iIlIlllllill(maxFeetY, z, feetY)) {
         return Iiilliiliiil<"Iiilliiliiil","edk5Y3GYaKE9ZesvjRnj2Dk6TMivYU7l1WY7nG9pAzSOtz/fX2UOW4kFXm9r">();
      } else if (w.IliIlllilIi(maxFeetY, z + 1, feetY) || w.IliIlllilIi(maxFeetY, z + 2, feetY)) {
         return Iiilliiliiil<"Iiilliiliiil","8GfYpWTEeXUBucexvaiazJnGSfCEy4vzKCORDjJrT2w5oCp0zS3/">();
      } else {
         return w.IliIlllilIi(maxFeetY, z + 3, feetY) ? Iiilliiliiil<"Iiilliiliiil","P4Q3JVsk3iij3vqSVOuotAgeY0ebnSGZFdfhfAVoa7XJbvUAgND0koQv5FR+">() : null;
      }
   }

   public static long IliIlllilIi(int x, int z) {
      return llIiIiililIiIiil.IIIllIIliIIl(x, 0, z);
   }

   public static int Illlllllilll(IIIIililIIIili oz, int oy, int cz, int reach, int cx, int maxFeetY, int w, int ox, double minFeetY) {
      long var12 = 5266342073417984490L;
      if (cx == oy && maxFeetY == reach) {
         return Integer.MIN_VALUE;
      } else if (!oz.IliIlllilIi(cx, w, maxFeetY) && !oz.IliIlllilIi(cx, w + 1, maxFeetY)) {
         var12 ^= ((long)iliIiiliiiii(oz, cx, w, maxFeetY, ox) << 32 ^ var12) & -1L << 32;

         for (long var15 = var12 ^ ((long)w ^ var12) & -1L >>> 32;
            (int)var15 <= Math.min(ox, w + (int)(var15 >>> 32));
            var15 ^= (var15 ^ var15 + (long)1) & -1L >>> 32
         ) {
            if (liiiIIllIl(cx, (int)var15, maxFeetY, oy, cz, reach)
               && IlIlllIlilIl(oz, oy, cz, reach, (double)cx + 0.5, (double)((int)var15), (double)maxFeetY + 0.5, minFeetY)) {
               return (int)var15;
            }
         }

         return Integer.MIN_VALUE;
      } else {
         return Integer.MIN_VALUE;
      }
   }

   public static int IiIlliIliiIl(IIIIililIIIili reach, int targets, int z, int feetY, int w, long[] x, double freeRun) {
      long var23 = 2400470170841545142L;
      long var25 = 8406946464188456723L;
      long var27 = -5370737709949371065L;
      long var29 = -6313320516272940907L;
      var23 ^= (0L ^ var23) & -1L << 32;
      var23 ^= (0L ^ var23) & -1L >>> 32;

      while ((int)var23 <= w) {
         double var10 = (double)targets + 0.5;
         double var12 = (double)feetY + 0.5;
         var25 ^= (0L ^ var25) & -1L << 32;
         long[] var15 = x;
         var25 ^= ((long)x.length ^ var25) & -1L >>> 32;
         var27 ^= (0L ^ var27) & -1L << 32;

         while ((int)(var27 >>> 32) < (int)var25) {
            long var18 = var15[(int)(var27 >>> 32)];
            var27 ^= ((long)llIiIiililIiIiil.IiIlliIliiIl(var18) ^ var27) & -1L >>> 32;
            var29 ^= ((long)llIiIiililIiIiil.IIlllIlliIll(var18) << 32 ^ var29) & -1L << 32;
            var29 ^= ((long)llIiIiililIiIiil.Illlllllilll(var18) ^ var29) & -1L >>> 32;
            if (iIlIlllllill(targets, z + (int)var23, feetY, (int)var27, (int)(var29 >>> 32), (int)var29, (int)var23 < w)
               && IlIlllIlilIl(reach, (int)var27, (int)(var29 >>> 32), (int)var29, var10, (double)(z + (int)var23), var12, freeRun)) {
               var25 += 4294967296L;
            }

            var27 += 4294967296L;
         }

         var23 ^= ((long)Math.max((int)(var23 >>> 32), (int)(var25 >>> 32)) << 32 ^ var23) & -1L << 32;
         var23 ^= (var23 ^ var23 + (long)1) & -1L >>> 32;
      }

      return (int)(var23 >>> 32);
   }

   public static boolean liiiIIllIl(int fy, int x, int z, int fx, int y, int fz) {
      return iIlIlllllill(fy, x, z, fx, y, fz, true);
   }

   public static boolean iIlIlllllill(int fx, int z, int x, int mayRaise, int fy, int fz, boolean y) {
      if (Math.abs(mayRaise - fx) > 3 || Math.abs(fz - x) > 3) {
         return false;
      } else if (fy < z - 1 || fy > z + 3) {
         return false;
      } else if (mayRaise != fx || fz != x) {
         return true;
      } else {
         return fy != z && fy != z + 1 ? fy < z || !y : false;
      }
   }

   public static int IIIllIIliIIl(int targets, int x, int freeRun, int z, long[] feetY) {
      long var17 = -8324434124808696583L;
      long var13 = 1546830114813565925L;
      long var15 = -2206703558154919730L;
      var13 ^= (0L ^ var13) & -1L << 32;
      var13 ^= (0L ^ var13) & -1L >>> 32;

      while ((int)var13 <= z) {
         var15 ^= (0L ^ var15) & -1L << 32;
         long[] var8 = feetY;
         var15 ^= ((long)feetY.length ^ var15) & -1L >>> 32;

         for (var17 ^= (0L ^ var17) & -1L << 32; (int)(var17 >>> 32) < (int)var15; var17 += 4294967296L) {
            long var11 = var8[(int)(var17 >>> 32)];
            if (iIlIlllllill(
               targets,
               x + (int)var13,
               freeRun,
               llIiIiililIiIiil.IiIlliIliiIl(var11),
               llIiIiililIiIiil.IIlllIlliIll(var11),
               llIiIiililIiIiil.Illlllllilll(var11),
               (int)var13 < z
            )) {
               var15 += 4294967296L;
            }
         }

         var13 ^= ((long)Math.max((int)(var13 >>> 32), (int)(var15 >>> 32)) << 32 ^ var13) & -1L << 32;
         var13 ^= (var13 ^ var13 + (long)1) & -1L >>> 32;
      }

      return (int)(var13 >>> 32);
   }

   public static boolean lIiiIiIlilli(String refusal) {
      return Iiilliiliiil<"Iiilliiliiil","edk5Y3GYaKE9ZesvjRnj2Dk6TMivYU7l1WY7nG9pAzSOtz/fX2UOW4kFXm9r">().equals(refusal)
         || Iiilliiliiil<"Iiilliiliiil","8GfYpWTEeXUBucexvaiazJnGSfCEy4vzKCORDjJrT2w5oCp0zS3/">().equals(refusal)
         || Iiilliiliiil<"Iiilliiliiil","P4Q3JVsk3iij3vqSVOuotAgeY0ebnSGZFdfhfAVoa7XJbvUAgND0koQv5FR+">().equals(refusal)
         || Iiilliiliiil<"Iiilliiliiil","YSGgHA4gh8hhppdh0BYsxlUX9+BeMz4PlUkAkNK6DfzpjaerfNoPkCo=">().equals(refusal)
         || Iiilliiliiil<"Iiilliiliiil","Lps8+J4PkNg1C3fG1Np2uNTQnVHrST97xo5yGtatsmvKi0l2JXsqdR7fn9uvvA==">().equals(refusal);
   }

   public static boolean IIillIiliIil(int dropBlocks, double health) {
      return Iilllilliill(dropBlocks) == 0 ? true : dropBlocks <= 8 && health - (double)Iilllilliill(dropBlocks) >= 8.0;
   }
}
