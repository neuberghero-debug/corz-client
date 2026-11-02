package gg.corz;

public record llliIiilliIi(long worldRevision, long originKey, int tick, long[] footprint, long fingerprint) {
   private final int IilIIlIIllilIIlIIl;
   private final long iIlIIlIIlIllIIlIIl;
   private final long lllIIlIIlillIIlIIl;
   private final long[] iilIIlIIlIIiIIlIIl;
   private final long lIiIIlIIliIiIIlIIl;

   public int iIlIlllllill() {
      return this.IilIIlIIllilIIlIIl;
   }

   public long liiiIIllIl() {
      return this.lllIIlIIlillIIlIIl;
   }

   public long[] IilliliilIIi() {
      return this.iilIIlIIlIIiIIlIIl;
   }

   public llliIiilliIi(long worldRevision, long originKey, int tick, long[] footprint, long fingerprint) {
      this.iIlIIlIIlIllIIlIIl = worldRevision;
      this.lllIIlIIlillIIlIIl = originKey;
      this.IilIIlIIllilIIlIIl = tick;
      this.iilIIlIIlIIiIIlIIl = footprint;
      this.lIiIIlIIliIiIIlIIl = fingerprint;
   }

   public long IliIlllilIi() {
      return this.iIlIIlIIlIllIIlIIl;
   }

   public long lIiiIiIlilli() {
      return this.lIiIIlIIliIiIIlIIl;
   }
}
