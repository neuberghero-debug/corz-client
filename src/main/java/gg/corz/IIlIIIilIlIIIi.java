package gg.corz;

public record IIlIIIilIlIIIi(double x0, double y0, double z0, double x1, double y1, double z1) {
   private final double iIlIlIiliIllIlIili;
   private final double iilIlIiliIIiIlIili;
   private final double IilIlIilililIlIili;
   private final double lIiIlIiliiIiIlIili;
   private final double IIlIlIililIlIlIili;
   private final double lllIlIiliillIlIili;

   public double lIiiIiIlilli() {
      return this.iilIlIiliIIiIlIili;
   }

   public double liiiIIllIl() {
      return this.iIlIlIiliIllIlIili;
   }

   public double IilliliilIIi() {
      return this.IilIlIilililIlIili;
   }

   public IIlIIIilIlIIIi(double x0, double y0, double z0, double x1, double y1, double z1) {
      this.IIlIlIililIlIlIili = x0;
      this.iIlIlIiliIllIlIili = y0;
      this.lllIlIiliillIlIili = z0;
      this.IilIlIilililIlIili = x1;
      this.iilIlIiliIIiIlIili = y1;
      this.lIiIlIiliiIiIlIili = z1;
   }

   public double iIlIlllllill() {
      return this.lllIlIiliillIlIili;
   }

   public double IliIlllilIi() {
      return this.IIlIlIililIlIlIili;
   }

   public double iliIiiliiiii() {
      return this.lIiIlIiliiIiIlIili;
   }
}
