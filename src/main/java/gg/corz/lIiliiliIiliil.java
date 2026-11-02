package gg.corz;

public record lIiliiliIiliil(int x, int y, int z) {
   private final int IIllIlllilIllIllli;
   private final int liIlIllliiiIlIllli;
   private final int ilIlIllliIiIlIllli;

   @Override
   public String toString() {
      return this.ilIlIllliIiIlIllli
         + IIillIiliIil<"IIillIiliIil","W1EOg4c3uvPZ5bvrjGH0SChu4FiwGXCFVOSNWD0e">()
         + this.liIlIllliiiIlIllli
         + IIillIiliIil<"IIillIiliIil","W1EOg4c3uvPZ5bvrjGH0SChu4FiwGXCFVOSNWD0e">()
         + this.IIllIlllilIllIllli;
   }

   public lIiliiliIiliil(int x, int y, int z) {
      this.ilIlIllliIiIlIllli = x;
      this.liIlIllliiiIlIllli = y;
      this.IIllIlllilIllIllli = z;
   }

   public int IIlllIlliIll() {
      return this.ilIlIllliIiIlIllli;
   }

   public static lIiliiliIiliil IlIlllIlilIl(long packed) {
      return new lIiliiliIiliil(llIiIiililIiIiil.IiIlliIliiIl(packed), llIiIiililIiIiil.IIlllIlliIll(packed), llIiIiililIiIiil.Illlllllilll(packed));
   }

   public long IIIllIIliIIl() {
      return llIiIiililIiIiil.IIIllIIliIIl(this.ilIlIllliIiIlIllli, this.liIlIllliiiIlIllli, this.IIllIlllilIllIllli);
   }

   public int Illlllllilll() {
      return this.liIlIllliiiIlIllli;
   }

   public int IiIlliIliiIl(lIiliiliIiliil o) {
      return Math.max(
         Math.abs(this.ilIlIllliIiIlIllli - o.ilIlIllliIiIlIllli),
         Math.max(Math.abs(this.liIlIllliiiIlIllli - o.liIlIllliiiIlIllli), Math.abs(this.IIllIlllilIllIllli - o.IIllIlllilIllIllli))
      );
   }

   public lIiliiliIiliil lIiiIiIlilli(int n) {
      return this.IliIlllilIi(0, -n, 0);
   }

   public lIiliiliIiliil liiiIIllIl() {
      return this.IliIlllilIi(0, 1, 0);
   }

   public lIiliiliIiliil IliIlllilIi(int dy, int dx, int dz) {
      return new lIiliiliIiliil(this.ilIlIllliIiIlIllli + dy, this.liIlIllliiiIlIllli + dx, this.IIllIlllilIllIllli + dz);
   }

   public lIiliiliIiliil iliIiiliiiii(int dir) {
      int[] var2 = iiIiIIilIIliIIil.liiiIIllIl(dir);
      return this.IliIlllilIi(var2[0], var2[1], var2[2]);
   }

   public lIiliiliIiliil IilliliilIIi() {
      return this.IliIlllilIi(0, -1, 0);
   }

   public lIiliiliIiliil iIlIlllllill(int n) {
      return this.IliIlllilIi(0, n, 0);
   }

   public int Iilllilliill() {
      return this.IIllIlllilIllIllli;
   }
}
