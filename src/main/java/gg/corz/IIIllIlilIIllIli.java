package gg.corz;

public record IIIllIlilIIllIli(long target, iIlillIiIllillIi ctx) {
   private final long iiilIIllIi;
   private final iIlillIiIllillIi IIIiIIllIi;

   public IIIllIlilIIllIli(long target, iIlillIiIllillIi ctx) {
      this.iiilIIllIi = target;
      this.IIIiIIllIi = ctx;
   }

   public long IliIlllilIi() {
      return this.iiilIIllIi;
   }

   public iIlillIiIllillIi liiiIIllIl() {
      return this.IIIiIIllIi;
   }
}
