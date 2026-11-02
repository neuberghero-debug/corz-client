package gg.corz;

public record liIiilIliiIiilIl(double pingMs, double targetPingMs) {
   private final double IIiliilIll;
   private final double iilliilIll;

   public double iliIiiliiiii() {
      return this.iilliilIll;
   }

   public double IIIllIIliIIl() {
      return this.IIiliilIll;
   }

   public int IilliliilIIi() {
      return Math.max(0, (int)Math.round(this.IIiliilIll / 50.0));
   }

   public int iIlIlllllill() {
      return IlIiIiillIiIii.liiiIIllIl(this.iilliilIll);
   }

   public liIiilIliiIiilIl(double pingMs, double targetPingMs) {
      this.iilliilIll = pingMs;
      this.IIiliilIll = targetPingMs;
   }

   public double lIiiIiIlilli() {
      return this.IliIlllilIi() + 0.5;
   }

   public double IliIlllilIi() {
      return this.iilliilIll / 50.0;
   }

   public double liiiIIllIl() {
      return this.iilliilIll / 100.0;
   }
}
