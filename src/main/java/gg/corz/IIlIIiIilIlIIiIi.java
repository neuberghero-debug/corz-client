package gg.corz;

record IIlIIiIilIlIIiIi(boolean aggro, long tick) {
   private final long IiillilIIi;
   private final boolean ilillilIIi;

   public boolean IliIlllilIi() {
      return this.ilillilIIi;
   }

   private IIlIIiIilIlIIiIi(boolean aggro, long tick) {
      this.ilillilIIi = aggro;
      this.IiillilIIi = tick;
   }

   public long liiiIIllIl() {
      return this.IiillilIIi;
   }
}
