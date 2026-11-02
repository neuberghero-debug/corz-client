package gg.corz;

import com.google.gson.JsonObject;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class IiiIIlllliiIIlll {
   private final Map<String, Integer> iIIIlIIill;

   public static IiiIIlllliiIIlll IlIlllIlilIl(JsonObject o) {
      IiiIIlllliiIIlll var1 = new IiiIIlllliiIIlll();
      if (o != null) {
         for (String var3 : o.keySet()) {
            try {
               var1.iIIIlIIill.put(var3, o.get(var3).getAsInt());
            } catch (Exception var5) {
            }
         }
      }

      return var1;
   }

   public JsonObject IIIllIIliIIl() {
      JsonObject var1 = new JsonObject();

      for (Entry var3 : this.iIIIlIIill.entrySet()) {
         var1.addProperty((String)var3.getKey(), (Number)var3.getValue());
      }

      return var1;
   }

   private IiiIIlllliiIIlll(Map<String, Integer> counts) {
      this.iIIIlIIill = counts;
   }

   public void IliIlllilIi(String count, int itemId) {
      if (count != null && itemId > 0) {
         this.iIIIlIIill.merge(count, itemId, Integer::sum);
      }
   }

   public boolean iIlIlllllill(String itemId, int atLeast) {
      return this.liiiIIllIl(itemId) >= atLeast;
   }

   public Map<String, Integer> lIiiIiIlilli() {
      return this.iIIIlIIill;
   }

   public IiiIIlllliiIIlll iliIiiliiiii() {
      return new IiiIIlllliiIIlll(new LinkedHashMap<>(this.iIIIlIIill));
   }

   public boolean IilliliilIIi() {
      return this.iIIIlIIill.isEmpty();
   }

   public int liiiIIllIl(String itemId) {
      Integer var2 = this.iIIIlIIill.get(itemId);
      return var2 == null ? 0 : var2;
   }

   public IiiIIlllliiIIlll() {
      this.iIIIlIIill = new LinkedHashMap<>();
   }
}
