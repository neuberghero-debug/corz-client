package gg.corz;

public interface lliIiliiliIili {
   boolean iIlIlllllill(IIilliIllIilliIl var1);

   boolean iliIiiliiiii(IIilliIllIilliIl var1);

   default boolean IilliliilIIi(IIilliIllIilliIl cell) {
      return this.iIlIlllllill(cell) && !this.IliIlllilIi(cell) && !this.liiiIIllIl(cell);
   }

   default boolean liiiIIllIl(IIilliIllIilliIl cell) {
      return this.IliIlllilIi(cell);
   }

   boolean lIiiIiIlilli(IIilliIllIilliIl var1);

   boolean IliIlllilIi(IIilliIllIilliIl var1);
}
