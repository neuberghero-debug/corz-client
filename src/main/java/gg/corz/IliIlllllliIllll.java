package gg.corz;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class IliIlllllliIllll<K> {
   public int IiIlilIill;
   public int ilIlilIill;
   public int llIlilIill;
   public int liIlilIill;
   public final LinkedHashMap<K, Integer> IlIlilIill = new LinkedHashMap<>();

   public int iIlIlllllill(K carriedK, int k) {
      Integer var3 = this.IlIlilIill.get(carriedK);
      return var3 == null ? 0 : Math.max(0, var3 - k);
   }

   public boolean IliIlllilIi() {
      return this.IlIlilIill.isEmpty();
   }

   public boolean liiiIIllIl() {
      return this.IiIlilIill >= this.liIlilIill;
   }

   public boolean IilliliilIIi(Map<K, Integer> carried) {
      for (Entry var3 : this.IlIlilIill.entrySet()) {
         if (iIIIilIiIlIIilIi.IiIlliIliiIl(carried, var3.getKey()) < (Integer)var3.getValue()) {
            return false;
         }
      }

      return true;
   }
}
