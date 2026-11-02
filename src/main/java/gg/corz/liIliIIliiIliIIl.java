package gg.corz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

final class liIliIIliiIliIIl {
   private float iiIilIilIl;
   private final Map<Integer, TreeMap<Float, Float>> liIilIilIl = new HashMap<>();

   liIliIIliiIliIIl iIlIlllllill(int... chs) {
      for (int var5 : chs) {
         this.liiiIIllIl(var5, 0.0F);
      }

      return this;
   }

   liIliIIliiIliIIl IliIlllilIi(float time) {
      this.iiIilIilIl = time;
      return this;
   }

   private liIliIIliiIliIIl() {
   }

   void IilliliilIIi(iliiiIiiii c) {
      for (Entry var3 : this.liIilIilIl.entrySet()) {
         ArrayList var4 = new ArrayList();

         for (Entry var6 : ((TreeMap)var3.getValue()).entrySet()) {
            var4.add((Float)var6.getKey());
            var4.add((Float)var6.getValue());
         }

         c.iIlIlllllill((Integer)var3.getKey(), iliiiIiiii.IilliliilIIi(var4));
      }
   }

   liIliIIliiIliIIl liiiIIllIl(int ch, float value) {
      this.liIilIilIl.computeIfAbsent(ch, x -> new TreeMap<>()).put(this.iiIilIilIl, value);
      return this;
   }
}
