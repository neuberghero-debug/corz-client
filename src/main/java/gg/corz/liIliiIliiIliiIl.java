package gg.corz;

record liIliiIliiIliiIl(ilIliiIlIiIliiIl g) implements ilIliiIlIiIliiIl {
   private final ilIliiIlIiIliiIl IIiIllIlll;

   private liIliiIliiIliiIl(ilIliiIlIiIliiIl g) {
      this.IIiIllIlll = g;
   }

   @Override
   public boolean IilliliilIIi(int z, int y, int x) {
      return this.IIiIllIlll.IilliliilIIi(z, y, x);
   }

   @Override
   public boolean IIIllIIliIIl(int y, int z, int x) {
      return this.IIiIllIlll.IIIllIIliIIl(y, z, x);
   }

   public ilIliiIlIiIliiIl IlIlllIlilIl() {
      return this.IIiIllIlll;
   }

   @Override
   public boolean IliIlllilIi(int x, int y, int z) {
      return this.IIiIllIlll.IliIlllilIi(x, y, z);
   }

   @Override
   public float iIlIlllllill(int x, int y, int z) {
      return 1.0F;
   }

   @Override
   public boolean liiiIIllIl(int y, int z, int x) {
      return false;
   }

   @Override
   public boolean iliIiiliiiii(int x, int y, int z) {
      return this.IIiIllIlll.iliIiiliiiii(x, y, z);
   }

   @Override
   public float lIiiIiIlilli(int z, int x, int y) {
      return this.IIiIllIlll.lIiiIiIlilli(z, x, y);
   }
}
