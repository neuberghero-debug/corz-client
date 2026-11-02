package gg.corz;

public record liliiIliiliiIl(long key, long[] cells, long fingerprint, String reason) {
   private final String IIliiiilllIliiiill;
   private final long liIiiiilliiIiiiill;
   private final long IlIiiiillllIiiiill;
   private final long[] ilIiiiillIiIiiiill;

   public long IliIlllilIi() {
      return this.IlIiiiillllIiiiill;
   }

   public liliiIliiliiIl(long key, long[] cells, long fingerprint, String reason) {
      this.IlIiiiillllIiiiill = key;
      this.ilIiiiillIiIiiiill = cells;
      this.liIiiiilliiIiiiill = fingerprint;
      this.IIliiiilllIliiiill = reason;
   }

   public long[] liiiIIllIl() {
      return this.ilIiiiillIiIiiiill;
   }

   public long iIlIlllllill() {
      return this.liIiiiilliiIiiiill;
   }

   public String IilliliilIIi() {
      return this.IIliiiilllIliiiill;
   }
}
