package gg.corz;

import java.util.Arrays;

final class lilllIliilllIl {
   int IillilIlllillilIll;
   long[] llllilIllilllilIll;

   void IliIlllilIi(long v) {
      if (this.IillilIlllillilIll == this.llllilIllilllilIll.length) {
         this.llllilIllilllilIll = Arrays.copyOf(this.llllilIllilllilIll, this.IillilIlllillilIll * 2);
      }

      this.llllilIllilllilIll[this.IillilIlllillilIll++] = v;
   }

   lilllIliilllIl(int cap) {
      this.llllilIllilllilIll = new long[Math.max(16, cap)];
   }

   void iIlIlllllill() {
      Arrays.sort(this.llllilIllilllilIll, 0, this.IillilIlllillilIll);
   }

   void liiiIIllIl() {
      this.IillilIlllillilIll = 0;
   }
}
