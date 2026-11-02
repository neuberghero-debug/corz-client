package gg.corz;

public record lliiIiIliliiIiIl(String kind, long cluster, long geometryFingerprint, long supportFingerprint) {
   private final String lllilliIll;
   private final long lililliIll;
   private final long illilliIll;
   private final long IililliIll;

   public long iIlIlllllill() {
      return this.IililliIll;
   }

   public String IliIlllilIi() {
      return this.lllilliIll;
   }

   public lliiIiIliliiIiIl(String kind, long cluster, long geometryFingerprint, long supportFingerprint) {
      this.lllilliIll = kind;
      this.illilliIll = cluster;
      this.IililliIll = geometryFingerprint;
      this.lililliIll = supportFingerprint;
   }

   public long IilliliilIIi() {
      return this.lililliIll;
   }

   public long liiiIIllIl() {
      return this.illilliIll;
   }
}
