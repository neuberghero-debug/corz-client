package gg.corz;

public record IIilliIllIilliIl(int x, int y, int z) {
   private final int lliIiiiIll;
   private final int iIiIiiiIll;
   private final int IliIiiiIll;

   public int lIiiIiIlilli() {
      return this.IliIiiiIll;
   }

   public int IilliliilIIi() {
      return this.iIiIiiiIll;
   }

   public IIilliIllIilliIl(int x, int y, int z) {
      this.iIiIiiiIll = x;
      this.IliIiiiIll = y;
      this.lliIiiiIll = z;
   }

   public IIilliIllIilliIl liiiIIllIl() {
      return this.IliIlllilIi(0, 1, 0);
   }

   public IIilliIllIilliIl IliIlllilIi(int dz, int dy, int dx) {
      return new IIilliIllIilliIl(this.iIiIiiiIll + dz, this.IliIiiiIll + dy, this.lliIiiiIll + dx);
   }

   public int iliIiiliiiii() {
      return this.lliIiiiIll;
   }

   public IIilliIllIilliIl iIlIlllllill() {
      return this.IliIlllilIi(0, -1, 0);
   }
}
