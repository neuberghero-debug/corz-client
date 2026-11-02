package gg.corz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public final class iIIlllIlIlll {
   private iIIlllIlIlll() {
   }

   public static Optional<Ilililllllililll> IliIlllilIi(
      List<Ilililllllililll> budgetLeft, int stackTolerance, long need, long preferStacks, boolean maxUnitPrice, double listings
   ) {
      return liiiIIllIl(budgetLeft, stackTolerance, need, preferStacks, maxUnitPrice, listings, 0);
   }

   public static Optional<Ilililllllililll> liiiIIllIl(
      List<Ilililllllililll> maxOverbuy, int stackTolerance, long maxUnitPrice, long listings, boolean preferStacks, double budgetLeft, int need
   ) {
      long var21 = -7031309692616358219L;
      if (maxOverbuy != null && stackTolerance > 0) {
         ArrayList var10 = new ArrayList();

         for (Ilililllllililll var12 : maxOverbuy) {
            if (var12 != null
               && var12.iIlIlllllill() > 0
               && var12.IilliliilIIi() >= 0L
               && (maxUnitPrice <= 0L || var12.IliIlllilIi() <= maxUnitPrice)
               && (listings <= 0L || var12.IilliliilIIi() <= listings)) {
               var10.add(var12);
            }
         }

         if (var10.isEmpty()) {
            return Optional.empty();
         } else if (!preferStacks) {
            return var10.stream()
               .min(
                  Comparator.comparingLong(Ilililllllililll::IliIlllilIi)
                     .thenComparing(Comparator.comparingInt(Ilililllllililll::iIlIlllllill).reversed())
                     .thenComparingInt(Ilililllllililll::liiiIIllIl)
               );
         } else {
            long var23 = var10.stream().mapToLong(Ilililllllililll::IliIlllilIi).min().orElse(Long.MAX_VALUE);
            long var13 = var23 + Math.round((double)var23 * Math.max(0.0, budgetLeft));
            var21 ^= ((long)stackTolerance << 32 ^ var21) & -1L << 32;
            long var16 = need > 0 ? (long)stackTolerance + (long)need : Long.MAX_VALUE;
            ArrayList var18 = new ArrayList();

            for (Ilililllllililll var20 : var10) {
               if (var20.IliIlllilIi() <= var13) {
                  var18.add(var20);
               }
            }

            Optional var24 = var18.stream()
               .filter(l -> l.iIlIlllllill() >= fneed && (long)l.iIlIlllllill() <= var16)
               .min(
                  Comparator.comparingInt(Ilililllllililll::iIlIlllllill)
                     .thenComparingLong(Ilililllllililll::IliIlllilIi)
                     .thenComparingInt(Ilililllllililll::liiiIIllIl)
               );
            if (var24.isPresent()) {
               return var24;
            } else {
               Optional var25 = var18.stream()
                  .filter(l -> l.iIlIlllllill() < fneed)
                  .min(
                     Comparator.comparingInt(Ilililllllililll::iIlIlllllill)
                        .reversed()
                        .thenComparingLong(Ilililllllililll::IliIlllilIi)
                        .thenComparingInt(Ilililllllililll::liiiIIllIl)
                  );
               return var25.isPresent()
                  ? var25
                  : var18.stream()
                     .filter(fneed -> fneed.iIlIlllllill() >= l)
                     .min(
                        Comparator.comparingInt(Ilililllllililll::iIlIlllllill)
                           .thenComparingLong(Ilililllllililll::IliIlllilIi)
                           .thenComparingInt(Ilililllllililll::liiiIIllIl)
                     );
            }
         }
      } else {
         return Optional.empty();
      }
   }

   public static Optional<Ilililllllililll> IilliliilIIi(
      List<Ilililllllililll> tolerance, int maxUnitPrice, long listings, long budgetLeft, double need, int maxCount
   ) {
      long var15 = 6961835535878185764L;
      if (tolerance != null && maxUnitPrice > 0) {
         var15 ^= ((long)maxUnitPrice << 32 ^ var15) & -1L << 32;
         ArrayList var10 = new ArrayList();
         double var11 = Double.MAX_VALUE;

         for (Ilililllllililll var14 : tolerance) {
            if (var14 != null
               && var14.iIlIlllllill() > 0
               && var14.IilliliilIIi() >= 0L
               && (listings <= 0L || var14.IliIlllilIi() <= listings)
               && (budgetLeft <= 0L || var14.IilliliilIIi() <= budgetLeft)) {
               var11 = Math.min(var11, iIlIlllllill(var14, (int)(var15 >>> 32)));
               if (maxCount <= 0 || var14.iIlIlllllill() <= maxCount) {
                  var10.add(var14);
               }
            }
         }

         if (var10.isEmpty()) {
            return Optional.empty();
         } else {
            double var17 = var11 * (1.0 + Math.max(0.0, need));
            return var10.stream()
               .filter(fneed -> iIlIlllllill(fneed, band) <= var17)
               .min(
                  Comparator.<Ilililllllililll>comparingInt(l -> Math.min(l.iIlIlllllill(), fneed))
                     .reversed()
                     .thenComparingLong(Ilililllllililll::IilliliilIIi)
                     .thenComparingInt(Ilililllllililll::iIlIlllllill)
                     .thenComparingInt(Ilililllllililll::liiiIIllIl)
               );
         }
      } else {
         return Optional.empty();
      }
   }

   public static double iIlIlllllill(Ilililllllililll l, int need) {
      return (double)l.IilliliilIIi() / (double)Math.max(1, Math.min(l.iIlIlllllill(), Math.max(1, need)));
   }
}
