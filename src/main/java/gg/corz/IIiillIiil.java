package gg.corz;

record IIiillIiil(int refusals, int firstTick, int vetoUntil) {
   private final int llIIiliilIIili;
   private final int iIIIiliIlIIili;
   private final int IiIIililiIIili;

   private IIiillIiil(int refusals, int firstTick, int vetoUntil) {
      this.iIIIiliIlIIili = refusals;
      this.llIIiliilIIili = firstTick;
      this.IiIIililiIIili = vetoUntil;
   }

   public int liiiIIllIl() {
      return this.llIIiliilIIili;
   }

   public int IliIlllilIi() {
      return this.iIIIiliIlIIili;
   }

   public int iIlIlllllill() {
      return this.IiIIililiIIili;
   }
}
