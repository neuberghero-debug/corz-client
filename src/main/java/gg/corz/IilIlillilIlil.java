package gg.corz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class IilIlillilIlil {
   public static final int IIIiliiIilIIiliiIi = 16;

   public static boolean liiiIIllIl(Ilililllllililll l) {
      return l != null && l.iIlIlllllill() >= 16;
   }

   public static Iillillillil IliIlllilIi(List<Ilililllllililll> need, int maxUnitPrice, long tolerance, double listings, int maxOverbuy) {
      long var21 = 641382670499449004L;
      ArrayList var7 = new ArrayList();
      if (need != null) {
         for (Ilililllllililll var9 : need) {
            if (var9 != null && var9.iIlIlllllill() > 0 && var9.IilliliilIIi() >= 0L && (tolerance <= 0L || var9.IliIlllilIi() <= tolerance)) {
               var7.add(var9);
            }
         }
      }

      if (maxUnitPrice > 0 && !var7.isEmpty()) {
         long var23 = var7.stream().mapToLong(Ilililllllililll::IliIlllilIi).min().orElse(Long.MAX_VALUE);
         long var10 = var23 + Math.round((double)var23 * Math.max(0.0, listings));
         ArrayList var12 = new ArrayList();

         for (Ilililllllililll var14 : var7) {
            if (var14.IliIlllilIi() <= var10) {
               var12.add(var14);
            }
         }

         var12.sort(
            Comparator.comparingInt(Ilililllllililll::iIlIlllllill)
               .reversed()
               .thenComparingLong(Ilililllllililll::IliIlllilIi)
               .thenComparingInt(Ilililllllililll::liiiIIllIl)
         );
         ArrayList var24 = new ArrayList();
         var21 ^= (0L ^ var21) & -1L << 32;
         long var15 = 0L;
         var21 ^= ((long)(maxOverbuy < 0 ? 0 : maxOverbuy) ^ var21) & -1L >>> 32;

         for (Ilililllllililll var19 : var12) {
            if ((int)(var21 >>> 32) >= maxUnitPrice) {
               break;
            }

            if ((int)(var21 >>> 32) + var19.iIlIlllllill() <= maxUnitPrice + (int)var21) {
               var24.add(var19);
               var21 ^= ((long)((int)(var21 >>> 32) + var19.iIlIlllllill()) << 32 ^ var21) & -1L << 32;
               var15 += var19.IilliliilIIi();
            }
         }

         if ((int)(var21 >>> 32) < maxUnitPrice) {
            Ilililllllililll var25 = null;

            for (Ilililllllililll var20 : var12) {
               if (!var24.contains(var20)
                  && (int)(var21 >>> 32) + var20.iIlIlllllill() >= maxUnitPrice
                  && (
                     var25 == null
                        || var20.iIlIlllllill() < var25.iIlIlllllill()
                        || var20.iIlIlllllill() == var25.iIlIlllllill() && var20.IliIlllilIi() < var25.IliIlllilIi()
                  )) {
                  var25 = var20;
               }
            }

            if (var25 != null) {
               var24.add(var25);
               var21 ^= ((long)((int)(var21 >>> 32) + var25.iIlIlllllill()) << 32 ^ var21) & -1L << 32;
               var15 += var25.IilliliilIIi();
            }
         }

         return new Iillillillil(var24, (int)(var21 >>> 32), var24.size(), var15, Math.max(0, (int)(var21 >>> 32) - maxUnitPrice));
      } else {
         return new Iillillillil(List.of(), 0, 0, 0L, 0);
      }
   }

   private IilIlillilIlil() {
   }
}
