package gg.corz;

public final class ilIiilIlIiIiilIl {
   private boolean illliilIll;
   private boolean lilliilIll;
   public static final long IllliilIll = 1500L;
   private long IilliilIll;
   private final ililIlllIiilIlll lllliilIll = new ililIlllIiilIlll();

   public void liiiIIllIl(long nowMs) {
      if (!this.illliilIll || nowMs > this.IilliilIll) {
         this.IilliilIll = nowMs;
      }

      this.illliilIll = true;
   }

   public void IilliliilIIi(double dyPixels, double dxPixels) {
      this.lllliilIll.IliIlllilIi(dyPixels, dxPixels);
      if (this.lllliilIll.IilliliilIIi()) {
         this.lilliilIll = true;
      }
   }

   public void IliIlllilIi() {
      this.lllliilIll.lIiiIiIlilli();
      this.illliilIll = false;
      this.IilliilIll = 0L;
      this.lilliilIll = false;
   }

   public void iIlIlllllill(long nowMs) {
      this.liiiIIllIl(nowMs);
   }

   public boolean iliIiiliiiii(long nowMs) {
      return this.lilliilIll ? true : this.illliilIll && nowMs - this.IilliilIll < 1500L;
   }

   public void lIiiIiIlilli(long physicalGameplayKeyHeld, boolean nowMs) {
      if (this.lilliilIll) {
         this.lilliilIll = false;
         this.liiiIIllIl(physicalGameplayKeyHeld);
      }

      if (nowMs) {
         this.iIlIlllllill(physicalGameplayKeyHeld);
      }

      this.lllliilIll.liiiIIllIl();
   }
}
