package gg.corz;

import java.util.List;

public final class IlIiIiillIiIii {
   public static final int llliIIiIIl = 2;
   public static final int illiIIiIIl = 3;
   static final int IiliIIiIIl = Integer.MIN_VALUE;
   public static final int IlliIIiIIl = 1;
   public static final int iIliIIiIIl = 0;

   public static int liiiIIllIl(double pingMs) {
      double var2 = pingMs > 0.0 ? pingMs : 0.0;
      return Double.isInfinite(var2) ? 536870911 : (int)Math.ceil(var2 / 50.0) + 1;
   }

   public static int[] IilliliilIIi(illIIlIilIIl steps, List<illiiIlIiliiIl> c) {
      return lIiiIiIlilli(steps, c, null);
   }

   private IlIiIiillIiIii() {
   }

   static int[] lIiiIiIlilli(illIIlIilIIl steps, List<illiiIlIiliiIl> selectTicks, int[] c) {
      long var33 = -8052826944955134162L;
      long var35 = 4773360104034130619L;
      long var21 = -2983767301588622110L;
      long var23 = 4399288573102690829L;
      long var25 = -8227031596057348026L;
      long var27 = 8943735734734501919L;
      long var29 = -1827643467368465737L;
      long var31 = 2383349477074312700L;
      var21 ^= ((long)(selectTicks == null ? 0 : selectTicks.size()) << 32 ^ var21) & -1L << 32;
      int[] var4 = new int[(int)(var21 >>> 32)];
      if ((int)(var21 >>> 32) == 0) {
         return var4;
      } else {
         var21 ^= ((long)Math.max(0, steps.IilliliilIIi()) ^ var21) & -1L >>> 32;
         var23 ^= ((long)Math.max(0, steps.lIiiIiIlilli()) << 32 ^ var23) & -1L << 32;
         var23 ^= ~var23 & -1L >>> 32;
         var25 ^= ((long)(-Math.max(0, steps.liiiIIllIl())) << 32 ^ var25) & -1L << 32;
         var25 ^= ((long)(-Math.max(0, steps.iIlIlllllill())) ^ var25) & -1L >>> 32;
         var27 ^= ((long)steps.IliIlllilIi() << 32 ^ var27) & -1L << 32;
         var27 ^= (-2147483648L ^ var27) & -1L >>> 32;
         var29 ^= (Long.MIN_VALUE ^ var29) & -1L << 32;
         var29 ^= (-2147483648L ^ var29) & -1L >>> 32;
         var31 ^= (0L ^ var31) & -1L << 32;

         while ((int)(var31 >>> 32) < (int)(var21 >>> 32)) {
            illiiIlIiliiIl var15 = (illiiIlIiliiIl)selectTicks.get((int)(var31 >>> 32));
            iilIIIIiIIiIIIIi var16 = var15.IliIlllilIi();
            var31 ^= ((long)(var16 != iilIIIIiIIiIIIIi.IIliiiIiil && var16 != iilIIIIiIIiIIIIi.lIliiiIiil ? 0 : 1) ^ var31) & -1L >>> 32;
            var33 ^= ((long)((int)var23 + 1) << 32 ^ var33) & -1L << 32;
            var33 ^= (-2147483648L ^ var33) & -1L >>> 32;
            if (var16 != iilIIIIiIIiIIIIi.iIliiiIiil && var15.liiiIIllIl() != (int)(var27 >>> 32)) {
               var35 ^= ((long)Math.max((int)var23 + 1, (int)(var25 >>> 32) + 2) << 32 ^ var35) & -1L << 32;
               var33 ^= ((long)Math.max((int)(var33 >>> 32), (int)(var35 >>> 32) + 1) << 32 ^ var33) & -1L << 32;
               var27 ^= ((long)var15.liiiIIllIl() << 32 ^ var27) & -1L << 32;
               var25 ^= ((long)((int)(var35 >>> 32)) << 32 ^ var25) & -1L << 32;
               var33 ^= ((long)((int)(var35 >>> 32)) ^ var33) & -1L >>> 32;
            }

            var35 ^= ((long)IliIlllilIi(var15.iIlIlllllill()) << 32 ^ var35) & -1L << 32;
            if ((int)(var35 >>> 32) > 0) {
               var33 ^= ((long)Math.max((int)(var33 >>> 32), (int)var23 + (int)(var35 >>> 32) + ((int)var31 != 0 ? 1 : 0) + 1) << 32 ^ var33) & -1L << 32;
            }

            if ((int)var31 != 0) {
               var33 ^= ((long)Math.max((int)(var33 >>> 32), (int)var25 + (int)var21) << 32 ^ var33) & -1L << 32;
            }

            if (var16 == iilIIIIiIIiIIIIi.lIliiiIiil && (int)var27 != Integer.MIN_VALUE) {
               var33 ^= (
                     (long)Math.max((int)(var33 >>> 32), (int)var27 + (steps.IIIllIIliIIl() ? (int)var21 : Math.max(0, steps.iliIiiliiiii()))) << 32 ^ var33
                  )
                  & -1L << 32;
            }

            if (var16 == iilIIIIiIIiIIIIi.iIliiiIiil && (int)(var29 >>> 32) != Integer.MIN_VALUE) {
               var33 ^= ((long)Math.max((int)(var33 >>> 32), (int)(var29 >>> 32) + (int)(var23 >>> 32)) << 32 ^ var33) & -1L << 32;
            }

            if (var16 == iilIIIIiIIiIIIIi.lIliiiIiil && var15.IilliliilIIi() && (int)var29 != Integer.MIN_VALUE) {
               var33 ^= ((long)Math.max((int)(var33 >>> 32), (int)var29 + (int)(var23 >>> 32)) << 32 ^ var33) & -1L << 32;
            }

            var4[(int)(var31 >>> 32)] = (int)(var33 >>> 32);
            if (c != null && (int)(var31 >>> 32) < c.length) {
               c[(int)(var31 >>> 32)] = (int)var33;
            }

            var23 ^= ((long)((int)(var33 >>> 32)) ^ var23) & -1L >>> 32;
            if ((int)var31 != 0) {
               var25 ^= ((long)((int)(var33 >>> 32)) ^ var25) & -1L >>> 32;
            }

            if (var16 == iilIIIIiIIiIIIIi.IIliiiIiil) {
               var27 ^= ((long)((int)(var33 >>> 32)) ^ var27) & -1L >>> 32;
            } else if (var16 == iilIIIIiIIiIIIIi.lIliiiIiil) {
               var29 ^= ((long)((int)(var33 >>> 32)) << 32 ^ var29) & -1L << 32;
            } else if (var16 == iilIIIIiIIiIIIIi.iIliiiIiil) {
               var29 ^= ((long)((int)(var33 >>> 32)) ^ var29) & -1L >>> 32;
            }

            var31 += 4294967296L;
         }

         return var4;
      }
   }

   public static int iIlIlllllill(int spawnSeen) {
      return 2 * spawnSeen;
   }

   public static int IliIlllilIi(double degrees) {
      double var2 = Math.abs(degrees);
      if (var2 <= 6.0) {
         return 0;
      } else if (var2 <= 25.0) {
         return 1;
      } else if (var2 <= 45.0) {
         return 2;
      } else if (var2 <= 70.0) {
         return 3;
      } else if (var2 <= 100.0) {
         return 4;
      } else {
         return var2 <= 140.0 ? 5 : 6;
      }
   }
}
