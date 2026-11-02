package gg.corz;

public record illliIiIilliIi(int x, int y, int z, iIIIIIilIlIIIIil surface, iiiIIiilIIIlIiil transition) {
   private final iIIIIIilIlIIIIil lIllliliiiIlllilii;
   private final int IiIlliliiliIllilii;
   private final int llIlliliiilIllilii;
   private final iiiIIiilIIIlIiil Illlliliilllllilii;
   private final int iiIlliliiIIlllilii;

   public iIIIIIilIlIIIIil IilliliilIIi() {
      return this.lIllliliiiIlllilii;
   }

   public int iIlIlllllill() {
      return this.iiIlliliiIIlllilii;
   }

   public int liiiIIllIl() {
      return this.IiIlliliiliIllilii;
   }

   public int IliIlllilIi() {
      return this.llIlliliiilIllilii;
   }

   public iiiIIiilIIIlIiil lIiiIiIlilli() {
      return this.Illlliliilllllilii;
   }

   public illliIiIilliIi(int x, int y, int z, iIIIIIilIlIIIIil surface, iiiIIiilIIIlIiil transition) {
      this.llIlliliiilIllilii = x;
      this.IiIlliliiliIllilii = y;
      this.iiIlliliiIIlllilii = z;
      this.lIllliliiiIlllilii = surface;
      this.Illlliliilllllilii = transition;
   }
}
