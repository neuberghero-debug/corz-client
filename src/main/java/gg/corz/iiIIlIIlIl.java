package gg.corz;

record iiIIlIIlIl(long sentTick, double kbY, double vyBefore) {
   private final double lIIlIIliIIlIIl;
   private final double iiiIIIlIIIlIIl;
   private final long IiiIIIlliiIIIl;

   public double liiiIIllIl() {
      return this.iiiIIIlIIIlIIl;
   }

   public long IliIlllilIi() {
      return this.IiiIIIlliiIIIl;
   }

   private iiIIlIIlIl(long sentTick, double kbY, double vyBefore) {
      this.IiiIIIlliiIIIl = sentTick;
      this.iiiIIIlIIIlIIl = kbY;
      this.lIIlIIliIIlIIl = vyBefore;
   }

   public double iIlIlllllill() {
      return this.lIIlIIliIIlIIl;
   }
}
