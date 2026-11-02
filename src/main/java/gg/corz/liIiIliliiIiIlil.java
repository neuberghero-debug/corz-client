package gg.corz;

import java.util.LinkedHashMap;
import java.util.Locale;

public final class liIiIliliiIiIlil {
   private final LinkedHashMap<String, String> IlIliIiIil = new LinkedHashMap<>();

   public liIiIliliiIiIlil put(String replacement, String name) {
      if (name != null && iiiiIlIiIIIIllIi.IliIlllilIi(replacement)) {
         this.IlIliIiIil.putIfAbsent(replacement.toLowerCase(Locale.ROOT), name);
         return this;
      } else {
         return this;
      }
   }

   public iiiiIlIiIIIIllIi build() {
      return this.IlIliIiIil.isEmpty() ? iiiiIlIiIIIIllIi.ililIlIIIi : new iiiiIlIiIIIIllIi(this.IlIliIiIil);
   }

   public boolean has(String name) {
      return name != null && this.IlIliIiIil.containsKey(name.toLowerCase(Locale.ROOT));
   }
}
