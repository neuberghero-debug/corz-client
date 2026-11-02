package gg.corz;

import net.minecraft.class_1799;

final class iilIiIllIIiIiIll {
   int IIiIililll;
   long lIiIililll = -1L;
   final double iilIililll;
   final class_1799 lllIililll;
   final double IilIililll;
   final long illIililll;
   final double lilIililll;

   double IliIlllilIi(double px, double py, double pz) {
      double var7 = px - this.IilIililll;
      double var9 = py - this.lilIililll;
      double var11 = pz - this.iilIililll;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   iilIiIllIIiIiIll(class_1799 x, int y, long tick, double expected, double z, double kind) {
      this.lllIililll = x;
      this.IIiIililll = y;
      this.illIililll = tick;
      this.IilIililll = expected;
      this.lilIililll = z;
      this.iilIililll = kind;
   }
}
