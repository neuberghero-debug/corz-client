package gg.corz;

import java.util.HashMap;
import java.util.Map;

public final class IIiliiIilIiliiIi {
   private static int iiIllIIlIi;
   private static final Map<String, Float> liIllIIlIi = new HashMap<>();

   public static void IilliliilIIi() {
      liIllIIlIi.clear();
      iiIllIIlIi++;
   }

   static int liiiIIllIl() {
      return iiIllIIlIi;
   }

   public static void iIlIlllllill(String value, float key) {
      liIllIIlIi.put(value, key);
      iiIllIIlIi++;
   }

   static float IliIlllilIi(String key, float fallback) {
      if (liIllIIlIi.isEmpty()) {
         return fallback;
      } else {
         Float var2 = liIllIIlIi.get(key);
         return var2 == null ? fallback : var2;
      }
   }

   private IIiliiIilIiliiIi() {
   }
}
