package gg.corz;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public final class liiIlliiiIll {
   private final HashMap<Long, LinkedHashMap<Long, Integer>> IllIlIIilllIlIIi = new HashMap<>();
   private String illIlIIiIilIlIIi = "";
   public static final int lIlIlIIiiIlIlIIi = 512;

   public int iliIiiliiiii() {
      return this.IllIlIIilllIlIIi.size();
   }

   public void IIIllIIliIIl() {
      this.IllIlIIilllIlIIi.clear();
      this.illIlIIiIilIlIIi = "";
   }

   public int IliIlllilIi(long stand, long component, String failureClass) {
      this.illIlIIiIilIlIIi = failureClass == null ? "" : failureClass;
      LinkedHashMap var6 = this.IllIlIIilllIlIIi.computeIfAbsent(component, k -> new LinkedHashMap<Long, Integer>(16, 0.75F, false) {
            @Override
            protected boolean removeEldestEntry(Entry<Long, Integer> e) {
               return this.size() > 512;
            }
         });
      return var6.merge(Long.valueOf(stand), Integer.valueOf(1), Integer::sum);
   }

   public String lIiiIiIlilli() {
      return this.illIlIIiIilIlIIi;
   }

   public Set<Long> iIlIlllllill(long component) {
      Map var3 = this.IllIlIIilllIlIIi.get(component);
      return var3 == null ? Set.of() : Collections.unmodifiableSet(var3.keySet());
   }

   public int IilliliilIIi(long stand, long component) {
      Map var5 = this.IllIlIIilllIlIIi.get(component);
      return var5 == null ? 0 : var5.getOrDefault(stand, 0);
   }

   public boolean liiiIIllIl(long stand, long component) {
      Map var5 = this.IllIlIIilllIlIIi.get(component);
      return var5 != null && var5.containsKey(stand);
   }
}
