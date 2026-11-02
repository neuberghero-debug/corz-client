package gg.corz;

public record liIllIIiiiIllIIi(long target, long stand, boolean sneaking, long revision) {
   private final long iiilliliil;
   private final long Iiilliliil;
   private final boolean liilliliil;
   private final long ililliliil;

   public long liiiIIllIl() {
      return this.ililliliil;
   }

   public double IliIlllilIi() {
      return lIlililliIlilill.liiiIIllIl(this.Iiilliliil, this.liilliliil, this.ililliliil);
   }

   public long lIiiIiIlilli() {
      return this.iiilliliil;
   }

   public boolean IilliliilIIi() {
      return this.liilliliil;
   }

   public liIllIIiiiIllIIi(long target, long stand, boolean sneaking, long revision) {
      this.ililliliil = target;
      this.Iiilliliil = stand;
      this.liilliliil = sneaking;
      this.iiilliliil = revision;
   }

   public long iIlIlllllill() {
      return this.Iiilliliil;
   }
}
