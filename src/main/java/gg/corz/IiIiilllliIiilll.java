package gg.corz;

public record IiIiilllliIiilll(double x, double y, double z, int feetX, int feetY, int feetZ, boolean onGround) {
   private final int lIiiiIlill;
   private final int IliiiIlill;
   private final double iiliiIlill;
   private final double IIiiiIlill;
   private final int iIiiiIlill;
   private final double liliiIlill;
   private final boolean lliiiIlill;

   public int lIiiIiIlilli() {
      return this.iIiiiIlill;
   }

   public double iIlIlllllill() {
      return this.IIiiiIlill;
   }

   public double liiiIIllIl() {
      return this.iiliiIlill;
   }

   public int iliIiiliiiii() {
      return this.IliiiIlill;
   }

   public double IliIlllilIi() {
      return this.liliiIlill;
   }

   public int IilliliilIIi() {
      return this.lIiiiIlill;
   }

   public IiIiilllliIiilll(double x, double y, double z, int feetX, int feetY, int feetZ, boolean onGround) {
      this.liliiIlill = x;
      this.iiliiIlill = y;
      this.IIiiiIlill = z;
      this.lIiiiIlill = feetX;
      this.iIiiiIlill = feetY;
      this.IliiiIlill = feetZ;
      this.lliiiIlill = onGround;
   }

   public boolean IIIllIIliIIl() {
      return this.lliiiIlill;
   }
}
