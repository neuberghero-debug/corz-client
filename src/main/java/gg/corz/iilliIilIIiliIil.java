package gg.corz;

public record iilliIilIIiliIil(int axis, double lo, double hi, double lateralLo, double lateralHi, double settleX, double settleZ) {
   private final int IIilIilIil;
   private final double ililIilIil;
   private final double IiilIilIil;
   private final double iIilIilIil;
   private final double lIilIilIil;
   private final double llilIilIil;
   private final double IlilIilIil;

   public double IIlllIlliIll() {
      return this.ililIilIil;
   }

   public int lIiiIiIlilli() {
      return this.IIilIilIil;
   }

   public double IilliliilIIi() {
      return this.iIilIilIil - this.lIilIilIil;
   }

   public double IIIllIIliIIl() {
      return this.iIilIilIil;
   }

   public iilliIilIIiliIil(int axis, double lo, double hi, double lateralLo, double lateralHi, double settleX, double settleZ) {
      this.IIilIilIil = axis;
      this.lIilIilIil = lo;
      this.iIilIilIil = hi;
      this.IlilIilIil = lateralLo;
      this.llilIilIil = lateralHi;
      this.ililIilIil = settleX;
      this.IiilIilIil = settleZ;
   }

   public boolean liiiIIllIl(double x, double z) {
      double var5 = this.IIilIilIil == 2 ? z : x;
      double var7 = this.IIilIilIil == 2 ? x : z;
      return var5 >= this.lIilIilIil - 1.0E-9 && var5 <= this.iIilIilIil + 1.0E-9 && var7 >= this.IlilIilIil - 1.0E-9 && var7 <= this.llilIilIil + 1.0E-9;
   }

   public double iIlIlllllill(double x, double z) {
      double var5 = this.IIilIilIil == 2 ? z : x;
      double var7 = this.IIilIilIil == 2 ? x : z;
      double var9 = var5 < this.lIilIilIil ? this.lIilIilIil - var5 : (var5 > this.iIilIilIil ? var5 - this.iIilIilIil : 0.0);
      double var11 = var7 < this.IlilIilIil ? this.IlilIilIil - var7 : (var7 > this.llilIilIil ? var7 - this.llilIilIil : 0.0);
      return Math.hypot(var9, var11);
   }

   public double iliIiiliiiii() {
      return this.lIilIilIil;
   }

   public static iilliIilIIiliIil IliIlllilIi(double cz, double r, double cx) {
      return new iilliIilIIiliIil(-1, cz - cx, cz + cx, r - cx, r + cx, cz, r);
   }

   public double IlIlllIlilIl() {
      return this.IlilIilIil;
   }

   public double IiIlliIliiIl() {
      return this.llilIilIil;
   }

   public double Illlllllilll() {
      return this.IiilIilIil;
   }
}
