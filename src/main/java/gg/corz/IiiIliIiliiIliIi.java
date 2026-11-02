package gg.corz;

import java.util.ArrayList;
import java.util.List;

final class IiiIliIiliiIliIi {
   final List<Float> lIiilliIIi;
   final List<Float> IIiilliIIi = new ArrayList<>();

   private IiiIliIiliiIliIi() {
      this.lIiilliIIi = new ArrayList<>();
   }

   IiiIliIiliiIliIi IliIlllilIi(float ms, float val) {
      this.IIiilliIIi.add(ms);
      this.lIiilliIIi.add(val);
      return this;
   }

   float[] liiiIIllIl(float total) {
      float[] var2 = new float[this.IIiilliIIi.size() * 2];

      for (int var3 = 0; var3 < this.IIiilliIIi.size(); var3++) {
         var2[2 * var3] = this.IIiilliIIi.get(var3) / total;
         var2[2 * var3 + 1] = this.lIiilliIIi.get(var3);
      }

      var2[0] = 0.0F;
      var2[var2.length - 2] = 1.0F;
      return var2;
   }
}
