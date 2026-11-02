package gg.corz;

public record iiliIiIIiiIi(double x, int y, double z, double gain, double turn) {
   private final double lIllIlIIliIllIlIIl;
   private final double IiIlIlIIlliIlIlIIl;
   private final double illlIlIIlIillIlIIl;
   private final double IlllIlIIlllllIlIIl;
   private final int iiIlIlIIlIIllIlIIl;

   public double IliIlllilIi() {
      return this.IiIlIlIIlliIlIlIIl;
   }

   public iiliIiIIiiIi(double x, int y, double z, double gain, double turn) {
      this.IiIlIlIIlliIlIlIIl = x;
      this.iiIlIlIIlIIllIlIIl = y;
      this.lIllIlIIliIllIlIIl = z;
      this.IlllIlIIlllllIlIIl = gain;
      this.illlIlIIlIillIlIIl = turn;
   }

   public double IilliliilIIi() {
      return this.IlllIlIIlllllIlIIl;
   }

   public int liiiIIllIl() {
      return this.iiIlIlIIlIIllIlIIl;
   }

   public double lIiiIiIlilli() {
      return this.illlIlIIlIillIlIIl;
   }

   public double iIlIlllllill() {
      return this.lIllIlIIliIllIlIIl;
   }
}
