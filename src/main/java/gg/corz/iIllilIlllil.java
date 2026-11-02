package gg.corz;

record iIllilIlllil(long at, long kickTick, double predicted, double predictedRise) {
   private final double IlIlIilillIlIili;
   private final long IiiIIililiiIIili;
   private final double lIIlIiliiIIlIili;
   private final long iiiIIiliIIIlIili;

   public long IliIlllilIi() {
      return this.IiiIIililiiIIili;
   }

   public double iIlIlllllill() {
      return this.lIIlIiliiIIlIili;
   }

   public double IilliliilIIi() {
      return this.IlIlIilillIlIili;
   }

   public long liiiIIllIl() {
      return this.iiiIIiliIIIlIili;
   }

   private iIllilIlllil(long at, long kickTick, double predicted, double predictedRise) {
      this.IiiIIililiiIIili = at;
      this.iiiIIiliIIIlIili = kickTick;
      this.lIIlIiliiIIlIili = predicted;
      this.IlIlIilillIlIili = predictedRise;
   }
}
