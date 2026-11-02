package gg.corz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class IilIilillilIilil {
   private IilIilillilIilil() {
   }

   public static List<iIIIiIilIlIIiIil> IliIlllilIi(List<iIIIiIilIlIIiIil> in) {
      ArrayList var1 = new ArrayList(in);
      var1.sort(Comparator.<iIIIiIilIlIIiIil, Boolean>comparing(c -> !c.liiiIIllIl()).thenComparingDouble(iIIIiIilIlIIiIil::iIlIlllllill));
      return var1;
   }
}
