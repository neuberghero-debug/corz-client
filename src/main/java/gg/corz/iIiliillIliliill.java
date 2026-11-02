package gg.corz;

public record iIiliillIliliill(double minX, double minY, double minZ, double maxX, double maxY, double maxZ) {
   private final double lIliliiill;
   private final double iIliliiill;
   private final double IIliliiill;
   private final double Illiliiill;
   private final double iiIiliiill;
   private final double llliliiill;

   public double IilliliilIIi() {
      return this.lIliliiill;
   }

   boolean IliIlllilIi(double z1, double z0, double x0, double x1) {
      return x0 > this.iiIiliiill && z1 < this.iIliliiill && x1 > this.lIliliiill && z0 < this.llliliiill;
   }

   public double iIlIlllllill() {
      return this.IIliliiill;
   }

   public double IIIllIIliIIl() {
      return this.llliliiill;
   }

   public double lIiiIiIlilli() {
      return this.iIliliiill;
   }

   public double iliIiiliiiii() {
      return this.Illiliiill;
   }

   public iIiliillIliliill(double minX, double minY, double minZ, double maxX, double maxY, double maxZ) {
      this.iiIiliiill = minX;
      this.IIliliiill = minY;
      this.lIliliiill = minZ;
      this.iIliliiill = maxX;
      this.Illiliiill = maxY;
      this.llliliiill = maxZ;
   }

   public double liiiIIllIl() {
      return this.iiIiliiill;
   }
}
