package gg.corz;

import java.util.List;

public final class lllIillillIill {
   public static final long lllIIiIIiillIIiIIi = 250L;
   public static final int IilIIiIIililIIiIIi = 30;

   public static ilililiIiilili IliIlllilIi(long jumpMultiplier, long lastPaidUnit, double spendingLimit) {
      long var6 = Math.max(0L, jumpMultiplier);
      long var8 = 0L;
      if (lastPaidUnit > 0L && spendingLimit > 0.0) {
         double var10 = Math.ceil((double)lastPaidUnit * Math.max(1.0, spendingLimit));
         long var12 = var10 >= 9.223372E18F ? Long.MAX_VALUE : (long)var10;
         var8 = Math.max(var12, 250L);
      }

      if (var6 <= 0L || var8 > 0L && var6 > var8) {
         return var8 > 0L
            ? new ilililiIiilili(var8, IiIiIliliIiIli.iiliIlIIIl, var6, lastPaidUnit, spendingLimit)
            : new ilililiIiilili(0L, IiIiIliliIiIli.IiliIlIIIl, var6, lastPaidUnit, spendingLimit);
      } else {
         return new ilililiIiilili(var6, IiIiIliliIiIli.liliIlIIIl, var6, lastPaidUnit, spendingLimit);
      }
   }

   public static boolean lIiiIiIlilli(long paid, long read) {
      return paid > 0L && read >= 0L && paid > read + Math.max(1L, read / 4L);
   }

   public static boolean iIlIlllllill(List<Ilililllllililll> limit, ilililiIiilili listings) {
      long var2 = liiiIIllIl(limit);
      return var2 >= 0L && listings != null && !listings.liiiIIllIl(var2);
   }

   private lllIillillIill() {
   }

   public static long liiiIIllIl(List<Ilililllllililll> listings) {
      long var1 = -1L;
      if (listings != null) {
         for (Ilililllllililll var4 : listings) {
            if (var4 != null && var4.iIlIlllllill() > 0 && var4.IilliliilIIi() >= 0L) {
               long var5 = var4.IliIlllilIi();
               if (var1 < 0L || var5 < var1) {
                  var1 = var5;
               }
            }
         }
      }

      return var1;
   }

   private static String iliIiiliiiii(double v) {
      return v == Math.rint(v) ? Long.toString((long)v) : String.valueOf(v);
   }

   public static long IilliliilIIi(long totalPrice, int delivered) {
      return delivered > 0 && totalPrice > 0L ? (totalPrice + (long)delivered - 1L) / (long)delivered : 0L;
   }
}
