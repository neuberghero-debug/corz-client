package gg.corz;

import java.util.Arrays;

public final class lliIilIiiliIilIi {
   private static final int[] IiIllllIIi;
   private static final double lliIlllIIi = 1.5;
   public static final int lIIIlllIIi = 5;
   private static final double IIlIlllIIi = 0.35;
   public static final int IIIIlllIIi = 4;
   private static final double iiIIlllIIi = 6.0;
   private static final double IliIlllIIi = 0.5;
   private static final double iIiIlllIIi = 0.5;
   private static final int lilIlllIIi = 4;
   private static final double liIIlllIIi = 5.0;
   private static final double iilIlllIIi = 10.0;
   public static final int IiiiIllIIi = 1;
   private static final double IllIlllIIi = 15.0;
   private static final int liiIlllIIi = 400;
   public static final int liiiIllIIi = 2;
   private static final int[] liIllllIIi;
   private static final double lIlIlllIIi = 10.0;
   private static final double iIlIlllIIi = 9.5;
   private static final double ilIIlllIIi = 3.5;
   public static final int IlIIlllIIi = 12000;
   private static final int llIIlllIIi = 3;
   private static final int[] llIllllIIi;
   private static final double lIIllllIIi = 25.0;
   private static final double IIIllllIIi = 6.0;
   private static final double iliIlllIIi = 1.0;
   private static final int IiiIlllIIi = 30;
   private static final double lllIlllIIi = 2.2;
   private static final int[] iIIllllIIi = new int[]{0, 1, -1, 0, 0, 1, 1, -1, -1};
   public static final int iiiiIllIIi = 3;
   private static final int[] ilIllllIIi;
   public static final int lliiIllIIi = Integer.MIN_VALUE;
   public static final int iIIIlllIIi = 512;
   public static final int iliiIllIIi = 0;
   private static final double lIiIlllIIi = 1.0;
   private static final double IilIlllIIi = 0.6;
   private static final double IIiIlllIIi = 2.0;
   private static final int[] IlIllllIIi = new int[]{0, 0, 0, 1, -1, 1, -1, 1, -1};
   private static final int iiiIlllIIi = 9;
   private static final double IiIIlllIIi = 400.0;
   private static final double illIlllIIi = 1.5;

   private lliIilIiiliIilIi() {
   }

   public static lIiiilIliIiiilIl liiiIIllIl(
      IliIlillliIlil cz, double allowWater, double relaxed, double cx, double maxRadius, int fromX, boolean fromZ, boolean p
   ) {
      long var14 = 3795670168892815698L;
      if (cz != null
         && Double.isFinite(allowWater)
         && Double.isFinite(relaxed)
         && !(Math.abs(allowWater) > Double.longBitsToDouble(-5016353693990417863L ^ -351622870952342983L))
         && !(Math.abs(relaxed) > Double.longBitsToDouble(8801273860260479336L ^ 4276444690582192488L))) {
         var14 ^= ((long)(Double.isFinite(cx) && Double.isFinite(maxRadius) ? 1 : 0) << 32 ^ var14) & -1L << 32;
         var14 ^= ((long)Math.max(0, Math.min((-1323715286 << 9 | -1323715286 >>> 23) ^ -59 ^ -862607193, fromX)) ^ var14) & -1L >>> 32;
         return new ilililIiilil(
               cz, allowWater, relaxed, (int)(var14 >>> 32) != 0 ? cx : allowWater, (int)(var14 >>> 32) != 0 ? maxRadius : relaxed, (int)var14, fromZ, p
            )
            .IliIlllilIi();
      } else {
         return null;
      }
   }

   public static boolean IilliliilIIi(IliIlillliIlil x, int y, int z, int p) {
      return iliIiiliiiii(x, y, z, p, 1);
   }

   public static boolean iIlIlllllill(IliIlillliIlil z, int x, int y, int p) {
      return iliIiiliiiii(z, x, y, p, 0);
   }

   public static boolean lIiiIiIlilli(IliIlillliIlil p, int y, int x, int z) {
      if (p == null || x == Integer.MIN_VALUE) {
         return false;
      } else if (p.liiiIIllIl(y, x, z) != 0) {
         return false;
      } else {
         for (int var4 = 1; var4 < 9; var4++) {
            int var5 = p.IliIlllilIi(y + iIIllllIIi[var4], z + IlIllllIIi[var4]);
            if (var5 == Integer.MIN_VALUE || var5 > x + 1 || var5 < x - 1) {
               return false;
            }

            if (p.liiiIIllIl(y + iIIllllIIi[var4], var5, z + IlIllllIIi[var4]) != 0) {
               return false;
            }
         }

         return true;
      }
   }

   private static boolean iliIiiliiiii(IliIlillliIlil x, int z, int kind, int p, int y) {
      if (x != null && kind != Integer.MIN_VALUE) {
         for (int var5 = 0; var5 < 9; var5++) {
            if (x.IliIlllilIi(z + iIIllllIIi[var5], p + IlIllllIIi[var5]) != kind) {
               return false;
            }
         }

         for (int var6 = 0; var6 < 9; var6++) {
            if (x.liiiIIllIl(z + iIIllllIIi[var6], kind, p + IlIllllIIi[var6]) != y) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public static lIiiilIliIiiilIl IliIlllilIi(IliIlillliIlil fromZ, double p, double maxRadius, double cx, double cz, int fromX, boolean allowWater) {
      return liiiIIllIl(fromZ, p, maxRadius, cx, cz, fromX, allowWater, false);
   }

   static {
      int[] var0 = new int[121];
      int[] var1 = new int[121];
      int var2 = 0;

      for (int var3 = 4; var3 <= 30; var3++) {
         for (int var4 = -5; var4 <= 5; var4++) {
            for (int var5 = -5; var5 <= 5; var5++) {
               if (var4 * var4 + var5 * var5 == var3) {
                  var0[var2] = var4;
                  var1[var2] = var5;
                  var2++;
               }
            }
         }
      }

      llIllllIIi = Arrays.copyOf(var0, var2);
      ilIllllIIi = Arrays.copyOf(var1, var2);
      int[] var8 = new int[16];
      int[] var9 = new int[16];
      int var10 = 0;

      for (int var6 = -2; var6 <= 2; var6++) {
         for (int var7 = -2; var7 <= 2; var7++) {
            if (Math.max(Math.abs(var6), Math.abs(var7)) == 2) {
               var8[var10] = var6;
               var9[var10] = var7;
               var10++;
            }
         }
      }

      IiIllllIIi = var8;
      liIllllIIi = var9;
   }
}
