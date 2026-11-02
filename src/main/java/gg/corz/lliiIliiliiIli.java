package gg.corz;

record lliiIliiliiIli(double minX, double minY, double minZ, double maxX, double maxY, double maxZ, boolean exact) {
   private final double iIIlllIIIl;
   private final boolean IlIlllIIIl;
   private final double IIIlllIIIl;
   private final double IiiIllIIIl;
   private final double lIIlllIIIl;
   private final double iiiIllIIIl;
   private final double liiIllIIIl;

   public double iIlIlllllill() {
      return this.iiiIllIIIl;
   }

   public double IliIlllilIi() {
      return this.IiiIllIIIl;
   }

   public double lIiiIiIlilli() {
      return this.lIIlllIIIl;
   }

   private lliiIliiliiIli(double minX, double minY, double minZ, double maxX, double maxY, double maxZ, boolean exact) {
      this.IiiIllIIIl = minX;
      this.liiIllIIIl = minY;
      this.iiiIllIIIl = minZ;
      this.IIIlllIIIl = maxX;
      this.lIIlllIIIl = maxY;
      this.iIIlllIIIl = maxZ;
      this.IlIlllIIIl = exact;
   }

   public double iliIiiliiiii() {
      return this.iIIlllIIIl;
   }

   public double liiiIIllIl() {
      return this.liiIllIIIl;
   }

   public boolean IIIllIIliIIl() {
      return this.IlIlllIIIl;
   }

   public double IilliliilIIi() {
      return this.IIIlllIIIl;
   }
}
