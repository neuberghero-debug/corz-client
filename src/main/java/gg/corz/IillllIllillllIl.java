package gg.corz;

import java.util.Arrays;

final class IillllIllillllIl {
   int iIiiiiIiIl;
   float[] lIiiiiIiIl;

   IillllIllillllIl(int cap) {
      this.lIiiiiIiIl = new float[Math.max(24, cap)];
   }

   float[] liiiIIllIl() {
      return Arrays.copyOf(this.lIiiiiIiIl, this.iIiiiiIiIl);
   }

   void IliIlllilIi(float v) {
      if (this.iIiiiiIiIl == this.lIiiiiIiIl.length) {
         this.lIiiiiIiIl = Arrays.copyOf(this.lIiiiiIiIl, this.iIiiiiIiIl * 2);
      }

      this.lIiiiiIiIl[this.iIiiiiIiIl++] = v;
   }
}
