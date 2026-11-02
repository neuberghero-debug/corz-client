package gg.corz;

public final class lliiIIIliliiIIIl extends iIiiIIIlIliiIIIl {
   private final IllliIIilllliIIi iilIllllIl;
   private volatile liIIliIliiIIliIl IIiIllllIl;
   private final iIilliIlIlilliIl lilIllllIl;

   @Override
   void lIiiIiIlilli() {
      this.IIiIllllIl = IiIlllllliIlllll.iIlIlllllill(this.lilIllllIl, this.iilIllllIl, this);
   }

   lliiIIIliliiIIIl(iIilliIlIlilliIl schematic, IllliIIilllliIIi env) {
      this.lilIllllIl = schematic;
      this.iilIllllIl = env;
   }

   public liIIliIliiIIliIl iliIiiliiiii() {
      return this.IIiIllllIl;
   }
}
