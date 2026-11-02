package gg.corz;

public record liIIiiIiiiIIiiIi(int x, int y, int w, int h) {
   private final int iIlIiiiIIi;
   private final int IIlIiiiIIi;
   private final int lIlIiiiIIi;
   private final int IllIiiiIIi;

   public int liiiIIllIl() {
      return this.lIlIiiiIIi + this.IllIiiiIIi;
   }

   public int iliIiiliiiii() {
      return this.lIlIiiiIIi;
   }

   public liIIiiIiiiIIiiIi(int x, int y, int w, int h) {
      this.IIlIiiiIIi = x;
      this.lIlIiiiIIi = y;
      this.iIlIiiiIIi = w;
      this.IllIiiiIIi = h;
   }

   public liIIiiIiiiIIiiIi IilliliilIIi(int dx, int dy) {
      return new liIIiiIiiiIIiiIi(this.IIlIiiiIIi + dx, this.lIlIiiiIIi + dy, this.iIlIiiiIIi, this.IllIiiiIIi);
   }

   public int IlIlllIlilIl() {
      return this.IllIiiiIIi;
   }

   public boolean iIlIlllllill(double py, double px) {
      return py >= (double)this.IIlIiiiIIi
         && py < (double)(this.IIlIiiiIIi + this.iIlIiiiIIi)
         && px >= (double)this.lIlIiiiIIi
         && px < (double)(this.lIlIiiiIIi + this.IllIiiiIIi);
   }

   public int lIiiIiIlilli() {
      return this.IIlIiiiIIi;
   }

   public int IliIlllilIi() {
      return this.IIlIiiiIIi + this.iIlIiiiIIi;
   }

   public int IIIllIIliIIl() {
      return this.iIlIiiiIIi;
   }
}
