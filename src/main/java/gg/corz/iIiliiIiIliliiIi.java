package gg.corz;

record iIiliiIiIliliiIi(long clockMs, int placed) {
   private final int lIlllIIlIi;
   private final long IIlllIIlIi;

   private iIiliiIiIliliiIi(long clockMs, int placed) {
      this.IIlllIIlIi = clockMs;
      this.lIlllIIlIi = placed;
   }

   public int liiiIIllIl() {
      return this.lIlllIIlIi;
   }

   public long IliIlllilIi() {
      return this.IIlllIIlIi;
   }
}
