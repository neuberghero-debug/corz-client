package gg.corz;

public record lIilIllliIilIlll(double mark, int stallTicks) {
   private final int IiIliIIill;
   private final double ilIliIIill;
   public static final double liIliIIill = Double.NEGATIVE_INFINITY;

   public double iIlIlllllill() {
      return this.ilIliIIill;
   }

   public lIilIllliIilIlll(double mark, int stallTicks) {
      this.ilIliIIill = mark;
      this.IiIliIIill = stallTicks;
   }

   public boolean liiiIIllIl() {
      return liliIiiliiliIiil.iliIiiliiiii(this.IiIliIIill);
   }

   public int IilliliilIIi() {
      return this.IiIliIIill;
   }

   public static lIilIllliIilIlll IliIlllilIi() {
      return new lIilIllliIilIlll(Double.NEGATIVE_INFINITY, 0);
   }
}
