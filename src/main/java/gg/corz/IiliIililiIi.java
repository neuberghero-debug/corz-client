package gg.corz;

public record IiliIililiIi(double dirX, double dirZ, boolean jump, int holdTicks, float expected, float stay) {
   private final int IIIlIlIIllIIlIlIIl;
   private final boolean liiIIlIIliiiIIlIIl;
   private final float iIIlIlIIlIlIlIlIIl;
   private final float llIlIlIIlilIlIlIIl;
   private final double iliIIlIIlIiiIIlIIl;
   private final double IliIIlIIllliIIlIIl;

   public IiliIililiIi(double dirX, double dirZ, boolean jump, int holdTicks, float expected, float stay) {
      this.IliIIlIIllliIIlIIl = dirX;
      this.iliIIlIIlIiiIIlIIl = dirZ;
      this.liiIIlIIliiiIIlIIl = jump;
      this.IIIlIlIIllIIlIlIIl = holdTicks;
      this.iIIlIlIIlIlIlIlIIl = expected;
      this.llIlIlIIlilIlIlIIl = stay;
   }

   public boolean iIlIlllllill() {
      return this.liiIIlIIliiiIIlIIl;
   }

   public double IliIlllilIi() {
      return this.IliIIlIIllliIIlIIl;
   }

   public float iliIiiliiiii() {
      return this.llIlIlIIlilIlIlIIl;
   }

   public double liiiIIllIl() {
      return this.iliIIlIIlIiiIIlIIl;
   }

   public int IilliliilIIi() {
      return this.IIIlIlIIllIIlIlIIl;
   }

   public float lIiiIiIlilli() {
      return this.iIIlIlIIlIlIlIlIIl;
   }
}
