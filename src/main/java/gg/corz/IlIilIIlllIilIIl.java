package gg.corz;

record IlIilIIlllIilIIl(double turn, boolean now) {
   private final double liliiillIl;
   static final IlIilIIlllIilIIl IIiiiillIl = new IlIilIIlllIilIIl(Double.NaN, false);
   private final boolean iiliiillIl;

   public double IliIlllilIi() {
      return this.liliiillIl;
   }

   public boolean liiiIIllIl() {
      return this.iiliiillIl;
   }

   private IlIilIIlllIilIIl(double turn, boolean now) {
      this.liliiillIl = turn;
      this.iiliiillIl = now;
   }
}
