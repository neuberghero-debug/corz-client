package gg.corz;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class iIiiiiIlIliiiiIl {
   private boolean lliiIiIlll;
   private final Map<String, String> IliiIiIlll;
   private final Set<String> iIiiIiIlll = new LinkedHashSet<>();

   public boolean liiiIIllIl() {
      return this.lliiIiIlll;
   }

   public void IliIlllilIi() {
      this.iIiiIiIlll.clear();
      this.IliiIiIlll.clear();
      this.lliiIiIlll = false;
   }

   private String IilliliilIIi(String id) {
      String var2 = this.IliiIiIlll.get(id);
      return var2 != null && !var2.isBlank() ? var2 : id.substring(0, Math.min(6, id.length()));
   }

   public llIllililIllil iIlIlllllill(List<lIIilllliIIillll> roster, String myId) {
      LinkedHashSet var3 = new LinkedHashSet();
      if (roster != null) {
         for (lIIilllliIIillll var5 : roster) {
            if (var5 != null && var5.IliIlllilIi() != null && !var5.IliIlllilIi().isEmpty() && (myId == null || !myId.equals(var5.IliIlllilIi()))) {
               if (var5.liiiIIllIl() != null && !var5.liiiIIllIl().isBlank()) {
                  this.IliiIiIlll.put(var5.IliIlllilIi(), var5.liiiIIllIl());
               }

               if (var5.iIlIlllllill()) {
                  var3.add(var5.IliIlllilIi());
               }
            }
         }
      }

      if (!this.lliiIiIlll) {
         this.lliiIiIlll = true;
         this.iIiiIiIlll.clear();
         this.iIiiIiIlll.addAll(var3);
         return llIllililIllil.lliIIIIliiliIIIIli;
      } else {
         ArrayList var8 = new ArrayList();

         for (String var6 : var3) {
            if (!this.iIiiIiIlll.contains(var6)) {
               var8.add(this.IilliliilIIi(var6));
            }
         }

         ArrayList var10 = new ArrayList();

         for (String var7 : this.iIiiIiIlll) {
            if (!var3.contains(var7)) {
               var10.add(this.IilliliilIIi(var7));
            }
         }

         this.iIiiIiIlll.clear();
         this.iIiiIiIlll.addAll(var3);
         return var8.isEmpty() && var10.isEmpty() ? llIllililIllil.lliIIIIliiliIIIIli : new llIllililIllil(var8, var10);
      }
   }

   public iIiiiiIlIliiiiIl() {
      this.IliiIiIlll = new LinkedHashMap<>();
   }
}
