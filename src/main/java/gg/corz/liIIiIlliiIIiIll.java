package gg.corz;

public record liIIiIlliiIIiIll(double x, double y, double z, double vx, double vy, double vz, boolean onGround, double sigma) {
   private final double IIlillilll;
   private final double iIIillilll;
   private final double ilIillilll;
   private final double IiIillilll;
   private final double llIillilll;
   private final double liIillilll;
   private final boolean iiIillilll;
   private final double IlIillilll;

   public double IlIlllIlilIl() {
      return this.IIlillilll;
   }

   public double IliIlllilIi() {
      return this.iIIillilll;
   }

   public liIIiIlliiIIiIll(double x, double y, double z, double vx, double vy, double vz, boolean onGround, double sigma) {
      this.iIIillilll = x;
      this.IlIillilll = y;
      this.llIillilll = z;
      this.ilIillilll = vx;
      this.IiIillilll = vy;
      this.liIillilll = vz;
      this.iiIillilll = onGround;
      this.IIlillilll = sigma;
   }

   public double iliIiiliiiii() {
      return this.liIillilll;
   }

   public double lIiiIiIlilli() {
      return this.IiIillilll;
   }

   public double liiiIIllIl() {
      return this.IlIillilll;
   }

   public double iIlIlllllill() {
      return this.llIillilll;
   }

   public boolean IIIllIIliIIl() {
      return this.iiIillilll;
   }

   public double IilliliilIIi() {
      return this.ilIillilll;
   }
}
