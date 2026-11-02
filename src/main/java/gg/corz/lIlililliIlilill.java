package gg.corz;

import java.util.Locale;

public final class lIlililliIlilill {
   public static double liiiIIllIl(long feet, boolean sneaking, long target) {
      double var5 = (double)llIiIiililIiIiil.IiIlliIliiIl(feet) + 0.5;
      double var7 = (double)llIiIiililIiIiil.IIlllIlliIll(feet) + IliIlllilIi(sneaking);
      double var9 = (double)llIiIiililIiIiil.Illlllllilll(feet) + 0.5;
      double var11 = (double)llIiIiililIiIiil.IiIlliIliiIl(target) + 0.5 - var5;
      double var13 = (double)llIiIiililIiIiil.IIlllIlliIll(target) + 0.5 - var7;
      double var15 = (double)llIiIiililIiIiil.Illlllllilll(target) + 0.5 - var9;
      return Math.sqrt(var11 * var11 + var13 * var13 + var15 * var15);
   }

   public static double IliIlllilIi(boolean sneaking) {
      return sneaking ? 1.27 : 1.62;
   }

   public static String lIiiIiIlilli(liIllIIiiiIllIIi liveFeet, long v, lIIlliIiiIIlliIi c) {
      return iliIiiliiiii<"iliIiiliiiii","cRY0Oq7+1x0jPpKWiqDROEtH4j8mHpNtWo8b51AxmwlzFr4oCVIIqOw=">()
         + (
            liveFeet == null
               ? iliIiiliiiii<"iliIiiliiiii","dRibYXA5PluKKB90xBqL/ERD8W+00ZJvJgPLdmlUtJ4=">()
               : llIiIiililIiIiil.IlIlllIlilIl(liveFeet.iIlIlllllill())
         )
         + iliIiiliiiii<"iliIiiliiiii","5SK16GGRR2AkyEcgi85XRD+MsX7tDr408pQ0GsvlN7icOH1CFq4=">()
         + llIiIiililIiIiil.IlIlllIlilIl(v)
         + iliIiiliiiii<"iliIiiliiiii","anKpeF1ZZ9NVRKULeq+uV9Zq3o9CjB6uKvACgwurYfq57Wxy">()
         + (
            liveFeet == null
               ? iliIiiliiiii<"iliIiiliiiii","dRibYXA5PluKKB90xBqL/ERD8W+00ZJvJgPLdmlUtJ4=">()
               : llIiIiililIiIiil.IlIlllIlilIl(liveFeet.liiiIIllIl())
         )
         + iliIiiliiiii<"iliIiiliiiii","2AffvRIgTl+IX1CyrODMm9P33Azwy9X4hyofpQgkFsP8">()
         + (
            liveFeet != null && liveFeet.IilliliilIIi()
               ? iliIiiliiiii<"iliIiiliiiii","g8U9YyvJjNgDU3NpF9Lh8nKZiBUAmteGUiDG9L6IQyRstPAy">()
               : iliIiiliiiii<"iliIiiliiiii","+s8WyQWCzGBjX4ufl9hj1aTlTTRzzxkJzvHzIKCx1yfitIPK">()
         )
         + iliIiiliiiii<"iliIiiliiiii","C9FCXD82ogRs++TWr32I7hEl12o9NFgQ366+XqINTDaDenQe0tznAiEHTvg9">()
         + String.format(Locale.ROOT, iliIiiliiiii<"iliIiiliiiii","60D6xd41LKrdTmaGB0vRPCjX+xGnvqccd3drV7pNEaI=">(), c.iIlIlllllill())
         + iliIiiliiiii<"iliIiiliiiii","0soY9h2WyrIIHjzE1ogt7OEH8Z3psfZ81KWJ2oD0Rk+IkKXLa8a+7wzH">()
         + String.format(Locale.ROOT, iliIiiliiiii<"iliIiiliiiii","60D6xd41LKrdTmaGB0vRPCjX+xGnvqccd3drV7pNEaI=">(), c.IilliliilIIi())
         + iliIiiliiiii<"iliIiiliiiii","DAmzDuonk2uZkdlHZv/S+961hG+2MsvUPXngobUDwlDRCj7k">()
         + c.liiiIIllIl();
   }

   public static lIIlliIiiIIlliIi IilliliilIIi(liIllIIiiiIllIIi c, long liveFeet, boolean reach, double liveSneaking) {
      return iIlIlllllill(c, liveFeet, c == null ? Double.NaN : liiiIIllIl(liveFeet, reach, c.liiiIIllIl()), liveSneaking);
   }

   public static lIIlliIiiIIlliIi iIlIlllllill(liIllIIiiiIllIIi liveDistance, long liveFeet, double c, double reach) {
      if (liveDistance == null) {
         return new lIIlliIiiIIlliIi(iIIliIIiIlIliIIi.iiIilliiil, Double.NaN, c);
      } else {
         double var7 = liveDistance.IliIlllilIi();
         if (liveFeet != liveDistance.iIlIlllllill()) {
            return new lIIlliIiiIIlliIi(iIIliIIiIlIliIIi.IiIilliiil, var7, c);
         } else {
            return c > reach ? new lIIlliIiiIIlliIi(iIIliIIiIlIliIIi.liIilliiil, var7, c) : new lIIlliIiiIIlliIi(iIIliIIiIlIliIIi.ilIilliiil, var7, c);
         }
      }
   }

   private lIlililliIlilill() {
   }
}
