package gg.corz;

public final class lIlIlilliIlIlill extends iIiiIIIlIliiIIIl {
   private final Iillililillili iilIiilill;
   private final int IIiIiilill;
   private volatile iiiIiIilIIIliIil lIiIiilill;

   public iiiIiIilIIIliIil IIIllIIliIIl() {
      return this.lIiIiilill;
   }

   lIlIlilliIlIlill(Iillililillili layer, int prepared) {
      this.iilIiilill = layer;
      this.IIiIiilill = prepared;
   }

   @Override
   void lIiiIiIlilli() {
      this.lIiIiilill = IiIlllllliIlllll.IilliliilIIi(this.iilIiilill, this.IIiIiilill, this);
   }

   public int iliIiiliiiii() {
      return this.IIiIiilill;
   }
}
