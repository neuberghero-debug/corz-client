package gg.corz;

public record IIIlilIllIIlilIl(long stand, long target, iIiliIIiIliliIIi kind) {
   private final long liIIIilIll;
   private final long IiIIIilIll;
   private final iIiliIIiIliliIIi iiIIIilIll;

   public long iIlIlllllill() {
      return this.liIIIilIll;
   }

   public iIiliIIiIliliIIi IilliliilIIi() {
      return this.iiIIIilIll;
   }

   public boolean IliIlllilIi() {
      return this.iiIIIilIll == iIiliIIiIliliIIi.ilIliliiil;
   }

   public IIIlilIllIIlilIl(long stand, long target) {
      this(stand, target, iIiliIIiIliliIIi.llIliliiil);
   }

   public long liiiIIllIl() {
      return this.IiIIIilIll;
   }

   public IIIlilIllIIlilIl(long stand, long target, iIiliIIiIliliIIi kind) {
      this.IiIIIilIll = stand;
      this.liIIIilIll = target;
      this.iiIIIilIll = kind;
   }
}
