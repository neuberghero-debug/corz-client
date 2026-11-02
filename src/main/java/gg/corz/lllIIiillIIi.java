package gg.corz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class lllIIiillIIi {
   public static <T extends lIIlliIIll> List<T> IliIlllilIi(Collection<? extends T> modules) {
      ArrayList var1 = new ArrayList();
      if (modules == null) {
         return var1;
      } else {
         for (lIIlliIIll var3 : modules) {
            if (var3 != null && var3.IliIlllilIi() && !var3.liiiIIllIl()) {
               var1.add(var3);
            }
         }

         return var1;
      }
   }

   private lllIIiillIIi() {
   }
}
