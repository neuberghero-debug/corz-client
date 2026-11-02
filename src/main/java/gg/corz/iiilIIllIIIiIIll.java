package gg.corz;

import java.util.HashMap;
import java.util.Map;

final class iiilIIllIIIiIIll {
   final Map<String, Integer> IIlllIllll;
   int ilIllIllll;
   int iIIllIllll = Integer.MAX_VALUE;
   int liIllIllll;
   int iiIllIllll;
   final int lIIllIllll;
   final int IIIllIllll;
   int llIllIllll;
   int IlIllIllll = Integer.MAX_VALUE;
   final int iiiIlIllll;
   int IiIllIllll;

   iiilIIllIIIiIIll(int cy, int cz, int cx) {
      this.llIllIllll = Integer.MAX_VALUE;
      this.ilIllIllll = Integer.MIN_VALUE;
      this.IiIllIllll = Integer.MIN_VALUE;
      this.liIllIllll = Integer.MIN_VALUE;
      this.IIlllIllll = new HashMap<>();
      this.iiiIlIllll = cy;
      this.IIIllIllll = cz;
      this.lIIllIllll = cx;
   }

   void IliIlllilIi(int z, int y, int x, String mat) {
      this.iIIllIllll = Math.min(this.iIIllIllll, z);
      this.IlIllIllll = Math.min(this.IlIllIllll, y);
      this.llIllIllll = Math.min(this.llIllIllll, x);
      this.ilIllIllll = Math.max(this.ilIllIllll, z);
      this.IiIllIllll = Math.max(this.IiIllIllll, y);
      this.liIllIllll = Math.max(this.liIllIllll, x);
      this.iiIllIllll++;
      if (mat != null) {
         this.IIlllIllll.merge(mat, 1, Integer::sum);
      }
   }
}
