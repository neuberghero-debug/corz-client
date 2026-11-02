package gg.corz;

import java.util.ArrayList;
import java.util.List;

public final class lliliiIiililiiIi {
   public static IiilIIllliilIIll IliIlllilIi(
      int tempBlocks,
      int dependencyUnlocks,
      int bottleneckOrCompletion,
      boolean expectedBlocks,
      int routeLen,
      List<IIiIlIilIiIlIi> validator,
      Iiliiiililiiii alternatives
   ) {
      return liiiIIllIl(tempBlocks, dependencyUnlocks, bottleneckOrCompletion, expectedBlocks, routeLen, validator, alternatives, true);
   }

   public static IiilIIllliilIIll liiiIIllIl(
      int bottleneckOrCompletion,
      int alternatives,
      int routeLen,
      boolean tempBlocks,
      int validator,
      List<IIiIlIilIiIlIi> expectedBlocks,
      Iiliiiililiiii dependencyUnlocks,
      boolean alternativesProven
   ) {
      long var15 = -6001112105958895162L;
      ArrayList var8 = new ArrayList(expectedBlocks == null ? List.of() : expectedBlocks);
      ArrayList var9 = new ArrayList();

      while (true) {
         ArrayList var10 = new ArrayList(var8.size());

         for (IIiIlIilIiIlIi var12 : var8) {
            var10.add(var12.liiiIIllIl());
         }

         IliiIlIllliiIlIl var17 = liiIIIiiiiIIIi.iliIiiliiiii(
            bottleneckOrCompletion, alternatives, routeLen, tempBlocks, validator, var10, 0L, null, alternativesProven
         );
         if (var17.liiiIIllIl()) {
            return new IiilIIllliilIIll(
               var9.isEmpty() ? iiiillIlIIIIilIl.liilIlliIl : iiiillIlIIIIilIl.IIIiIlliIl,
               var17,
               null,
               var9,
               var9.isEmpty()
                  ? var17.iIlIlllllill().name()
                  : var17.iIlIlllllill().name()
                     + iIlIlllllill<"iIlIlllllill","IDQyjbwV5no6AR4SfCS//KIQ2OYDsi4Pk+rZFKwo12Y7ekc=">()
                     + var9.size()
                     + iIlIlllllill<"iIlIlllllill","FQnfxhA2cZbVxRBxR+SaVIGQMYbjbJ6tNMnEF1UloXo6aX6nmI+Ge6G90+aaiXn5megL">()
            );
         }

         IIiIlIilIiIlIi var18 = null;

         for (IIiIlIilIiIlIi var14 : var8) {
            if (var17.lIiiIiIlilli() != null
               && var14.iliIiiliiiii() == var17.lIiiIiIlilli().IIIllIIliIIl()
               && var14.lIiiIiIlilli().equals(var17.lIiiIiIlilli().IilliliilIIi())) {
               var18 = var14;
               break;
            }
         }

         if (var18 == null) {
            return new IiilIIllliilIIll(
               iiiillIlIIIIilIl.IIIiIlliIl,
               var17,
               null,
               var9,
               iIlIlllllill<"iIlIlllllill","TAQ1n0+zmlpF4/XArPamiO/9Bxi8aHGn4i81Y7Hqv1cD0zzM+p+ZQI66KOztKQWu6kM5">()
            );
         }

         String var19 = dependencyUnlocks == null ? null : dependencyUnlocks.apply(var18);
         if (var19 == null) {
            return new IiilIIllliilIIll(
               iiiillIlIIIIilIl.iiilIlliIl,
               var17,
               var18,
               var9,
               iIlIlllllill<"iIlIlllllill","jyyTaUesDTijdxY1aKT8QgY+eMu/utWLkBbJG+J5IilqAlMeX7qNxR4gapqZ7vWA4dgbzhdWuao=">()
            );
         }

         var9.add(new llIllliilIllli(var18, var19));
         var15 ^= ((long)var8.indexOf(var18) << 32 ^ var15) & -1L << 32;
         var8.remove((int)(var15 >>> 32));
         if (!var18.IIIilIIiiIIi().isEmpty()) {
            var8.add((int)(var15 >>> 32), var18.iIlIlllllill());
         }
      }
   }

   private lliliiIiililiiIi() {
   }
}
