package gg.corz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public final class iiliIlIlIIiiIlIl {
   private static long iIlIlllllill(int pct) {
      if (pct < 0) {
         return 0L;
      } else {
         return pct > 100 ? 100L : (long)pct;
      }
   }

   public static lililIiiililIi IliIlllilIi(List<Ilililllllililll> listings, IIlIIIlllIlIIIll p) {
      long var21 = 446943682680123093L;
      ArrayList var2 = new ArrayList();
      if (listings != null) {
         for (Ilililllllililll var4 : listings) {
            if (var4 != null && var4.iIlIlllllill() > 0 && var4.IilliliilIIi() >= 0L) {
               var2.add(var4);
            }
         }
      }

      if (var2.isEmpty()) {
         return new lililIiiililIi(0L, 0L, 0, List.of());
      } else {
         long[] var23 = new long[var2.size()];

         for (var21 ^= (0L ^ var21) & -1L << 32; (int)(var21 >>> 32) < var2.size(); var21 += 4294967296L) {
            var23[(int)(var21 >>> 32)] = ((Ilililllllililll)var2.get((int)(var21 >>> 32))).IliIlllilIi();
         }

         long[] var24 = (long[])var23.clone();
         Arrays.sort(var24);
         long var5 = liiiIIllIl(var24, p.IliIlllilIi());
         long var7 = var24[0];
         if (var2.size() >= Math.max(1, p.liiiIIllIl()) && var5 > 0L) {
            long var9 = var5 * (long)Math.max(0, p.iliIiiliiiii()) / 100L;
            long var11 = var9 * (100L - iIlIlllllill(p.IlIlllIlilIl())) / 100L;
            var21 ^= ((long)Math.max(0, p.iIlIlllllill()) ^ var21) & -1L >>> 32;
            ArrayList var14 = new ArrayList();

            for (Ilililllllililll var16 : var2) {
               long var17 = var16.IliIlllilIi();
               if (var17 > 0L && (p.IilliliilIIi() <= 0L || var17 <= p.IilliliilIIi()) && (p.lIiiIiIlilli() <= 0L || var16.IilliliilIIi() <= p.lIiiIiIlilli())) {
                  long var19 = var11 - var17;
                  if (var19 > 0L && var19 >= p.IIIllIIliIIl() && var19 * 100L >= (long)((int)var21) * var17) {
                     var14.add(
                        new liiiIiIiiiiiIiIi(
                           var16.liiiIIllIl(), var16.iIlIlllllill(), var17, var16.IilliliilIIi(), var5, var9, var19, var19 * (long)var16.iIlIlllllill()
                        )
                     );
                  }
               }
            }

            var14.sort(
               Comparator.comparingLong(liiiIiIiiiiiIiIi::IlIlllIlilIl)
                  .reversed()
                  .thenComparingLong(liiiIiIiiiiiIiIi::iIlIlllllill)
                  .thenComparingInt(liiiIiIiiiiiIiIi::IliIlllilIi)
            );
            return new lililIiiililIi(var5, var7, var2.size(), var14);
         } else {
            return new lililIiiililIi(var5, var7, var2.size(), List.of());
         }
      }
   }

   static long liiiIIllIl(long[] q, double sortedAsc) {
      long var6 = 1223398449656879111L;
      if (q != null && q.length != 0) {
         double var3 = Math.max(0.0, Math.min(100.0, sortedAsc));
         var6 ^= ((long)((int)Math.round(var3 / 100.0 * (double)(q.length - 1))) << 32 ^ var6) & -1L << 32;
         if ((int)(var6 >>> 32) < 0) {
            var6 ^= (0L ^ var6) & -1L << 32;
         }

         if ((int)(var6 >>> 32) >= q.length) {
            var6 ^= ((long)(q.length - 1) << 32 ^ var6) & -1L << 32;
         }

         return q[(int)(var6 >>> 32)];
      } else {
         return 0L;
      }
   }

   private iiliIlIlIIiiIlIl() {
   }
}
