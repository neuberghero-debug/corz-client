package gg.corz;

record liIIlIliiiIIlIli(long firstSeen, long lastSeen, double lastDist, double x, double y, double z) {
   private final double iIliiiIlIi;
   private final long iiIiiiIlIi;
   private final double lIliiiIlIi;
   private final long IIliiiIlIi;
   private final double IlliiiIlIi;
   private final double llliiiIlIi;

   public long IliIlllilIi() {
      return this.iiIiiiIlIi;
   }

   public double IilliliilIIi() {
      return this.iIliiiIlIi;
   }

   private liIIlIliiiIIlIli(long firstSeen, long lastSeen, double lastDist, double x, double y, double z) {
      this.iiIiiiIlIi = firstSeen;
      this.IIliiiIlIi = lastSeen;
      this.lIliiiIlIi = lastDist;
      this.iIliiiIlIi = x;
      this.IlliiiIlIi = y;
      this.llliiiIlIi = z;
   }

   public double lIiiIiIlilli() {
      return this.IlliiiIlIi;
   }

   public long liiiIIllIl() {
      return this.IIliiiIlIi;
   }

   public double iliIiiliiiii() {
      return this.llliiiIlIi;
   }

   public double iIlIlllllill() {
      return this.lIliiiIlIi;
   }
}
