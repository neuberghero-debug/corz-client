package gg.corz;

public record lIliillliIliilll(long from, long to, iiiIIiilIIIlIiil transition) {
   private final iiiIIiilIIIlIiil IIIlIllill;
   private final long liiIIllill;
   private final long iiiIIllill;

   public iiiIIiilIIIlIiil iIlIlllllill() {
      return this.IIIlIllill;
   }

   public lIliillliIliilll(long from, long to, iiiIIiilIIIlIiil transition) {
      this.liiIIllill = from;
      this.iiiIIllill = to;
      this.IIIlIllill = transition;
   }

   public long liiiIIllIl() {
      return this.iiiIIllill;
   }

   public long IliIlllilIi() {
      return this.liiIIllill;
   }
}
