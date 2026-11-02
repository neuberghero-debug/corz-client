package gg.corz;

record IiIIllIlliIIllIl(long tick, double x, double y, double z, boolean airborne) {
   private final long IlllilIiIl;
   private final double IillilIiIl;
   private final boolean lillilIiIl;
   private final double illlilIiIl;
   private final double llllilIiIl;

   public double IilliliilIIi() {
      return this.IillilIiIl;
   }

   public boolean lIiiIiIlilli() {
      return this.lillilIiIl;
   }

   public double liiiIIllIl() {
      return this.llllilIiIl;
   }

   public long IliIlllilIi() {
      return this.IlllilIiIl;
   }

   public double iIlIlllllill() {
      return this.illlilIiIl;
   }

   private IiIIllIlliIIllIl(long tick, double x, double y, double z, boolean airborne) {
      this.IlllilIiIl = tick;
      this.llllilIiIl = x;
      this.illlilIiIl = y;
      this.IillilIiIl = z;
      this.lillilIiIl = airborne;
   }
}
