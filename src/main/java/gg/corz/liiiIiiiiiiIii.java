package gg.corz;

import java.util.Collection;

public final class liiiIiiiiiiIii {
   public static iIlIlIilIllIlIil liiiIIllIl(Collection<iIlIlIilIllIlIil> claims) {
      iIlIlIilIllIlIil var1 = null;
      if (claims != null) {
         for (iIlIlIilIllIlIil var3 : claims) {
            if (IliIlllilIi(var1, var3)) {
               var1 = var3;
            }
         }
      }

      return var1;
   }

   public static String iIlIlllllill(iIlIlIilIllIlIil winner, String winnerDisplayName) {
      if (winner == null) {
         return IilliliilIIi<"IilliliilIIi","7TNS4mXgezTupF6rJCyQ0I9C4B3vnUkzLUX4KoUIdL0Djy+u9doxjqZHsD6zByF5HE/7">();
      } else {
         return winner.IilliliilIIi()
            ? IilliliilIIi<"IilliliilIIi","iP/Ydz9itdxjrJLdfr8IT6DcMv7Seu07cKMfp/NsleSrMA==">()
               + winnerDisplayName
               + IilliliilIIi<"IilliliilIIi","OtY2jNKckXBbY9FhwUFG0yxsVN3n3W3B/jtpEym6/hAQ+QOj4AzFRwDs+mwZF9rZCMiysgZhjURMhvY=">()
            : IilliliilIIi<"IilliliilIIi","YftPQpW1UnIPqSKpu2lKa+rY3+A1yyRCE0qgkFa6k+wYjOgmQPpBhT2SEqA=">()
               + winnerDisplayName
               + IilliliilIIi<"IilliliilIIi","r6FpwJky7ergT+y6bidPOpWn2yOLl21W3mfwW9q4i8dxkW8yPyzNXQ==">();
      }
   }

   private liiiIiiiiiiIii() {
   }

   public static boolean IliIlllilIi(iIlIlIilIllIlIil current, iIlIlIilIllIlIil candidate) {
      if (candidate == null || !candidate.IliIlllilIi()) {
         return false;
      } else if (current != null && current.IliIlllilIi()) {
         return candidate.IilliliilIIi() != current.IilliliilIIi() ? candidate.IilliliilIIi() : candidate.liiiIIllIl().compareTo(current.liiiIIllIl()) < 0;
      } else {
         return true;
      }
   }
}
