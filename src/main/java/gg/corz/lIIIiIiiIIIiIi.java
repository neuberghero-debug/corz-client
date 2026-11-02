package gg.corz;

import java.util.TreeMap;
import java.util.Map.Entry;

final class lIIIiIiiIIIiIi {
   final TreeMap<Float, Float> llllllliiillllllii = new TreeMap<>();

   private lIIIiIiiIIIiIi() {
   }

   lIIIiIiiIIIiIi IliIlllilIi(float t, float v) {
      if (this.llllllliiillllllii.put(t, v) != null) {
         throw new IllegalStateException(iIlIlllllill<"iIlIlllllill","Yhdxc08rDGAw2PziCeQlXQlbwsCiagL6lXmVofZBLl18QpmesXif2VQ2">() + t);
      } else {
         return this;
      }
   }

   void liiiIIllIl(iliiiIiiii ch, int c, float end) {
      float[] var4 = new float[this.llllllliiillllllii.size() * 2];
      int var5 = 0;

      for (Entry var7 : this.llllllliiillllllii.entrySet()) {
         var4[var5++] = (Float)var7.getKey() / end;
         var4[var5++] = (Float)var7.getValue();
      }

      ch.iIlIlllllill(c, var4);
   }
}
